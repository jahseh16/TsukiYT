package ta;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements Iterable<Intent> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f8195v;
    public final ArrayList<Intent> y = new ArrayList<>();

    public interface y {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public f3(Context context) {
        this.f8195v = context;
    }

    @NonNull
    public static f3 v(@NonNull Context context) {
        return new f3(context);
    }

    public void fb() {
        s(null);
    }

    @NonNull
    public f3 gv(@NonNull ComponentName componentName) {
        int size = this.y.size();
        try {
            Intent intentN3 = t.n3(this.f8195v, componentName);
            while (intentN3 != null) {
                this.y.add(size, intentN3);
                intentN3 = t.n3(this.f8195v, intentN3.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.y.iterator();
    }

    @NonNull
    public f3 n3(@NonNull Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f8195v.getPackageManager());
        }
        if (component != null) {
            gv(component);
        }
        y(intent);
        return this;
    }

    public void s(@Nullable Bundle bundle) {
        if (this.y.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.y.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (d.y.startActivities(this.f8195v, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f8195v.startActivity(intent);
    }

    @NonNull
    public f3 y(@NonNull Intent intent) {
        this.y.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public f3 zn(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof y ? ((y) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = t.y(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f8195v.getPackageManager());
            }
            gv(component);
            y(supportParentActivityIntent);
        }
        return this;
    }
}
