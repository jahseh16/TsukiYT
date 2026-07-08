package ta;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ArrayList<String> f8202a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public ArrayList<Uri> f8203fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public ArrayList<String> f8204gv;

    @NonNull
    public final Intent n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public ArrayList<String> f8205v;

    @NonNull
    public final Context y;

    @Nullable
    public CharSequence zn;

    public x4(@NonNull Context context) {
        Activity activity;
        this.y = (Context) j5.s.fb(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.n3 = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.n3.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.n3.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    @NonNull
    public x4 a(@Nullable Uri uri) {
        this.f8203fb = null;
        if (uri != null) {
            y(uri);
        }
        return this;
    }

    @NonNull
    public x4 fb(@Nullable String str) {
        this.n3.setType(str);
        return this;
    }

    @NonNull
    public Intent gv() {
        ArrayList<String> arrayList = this.f8204gv;
        if (arrayList != null) {
            n3("android.intent.extra.EMAIL", arrayList);
            this.f8204gv = null;
        }
        ArrayList<String> arrayList2 = this.f8205v;
        if (arrayList2 != null) {
            n3("android.intent.extra.CC", arrayList2);
            this.f8205v = null;
        }
        ArrayList<String> arrayList3 = this.f8202a;
        if (arrayList3 != null) {
            n3("android.intent.extra.BCC", arrayList3);
            this.f8202a = null;
        }
        ArrayList<Uri> arrayList4 = this.f8203fb;
        if (arrayList4 == null || arrayList4.size() <= 1) {
            this.n3.setAction("android.intent.action.SEND");
            ArrayList<Uri> arrayList5 = this.f8203fb;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                this.n3.removeExtra("android.intent.extra.STREAM");
                r.zn(this.n3);
            } else {
                this.n3.putExtra("android.intent.extra.STREAM", this.f8203fb.get(0));
                r.n3(this.n3, this.f8203fb);
            }
        } else {
            this.n3.setAction("android.intent.action.SEND_MULTIPLE");
            this.n3.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f8203fb);
            r.n3(this.n3, this.f8203fb);
        }
        return this.n3;
    }

    public final void n3(String str, ArrayList<String> arrayList) {
        String[] stringArrayExtra = this.n3.getStringArrayExtra(str);
        int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
        String[] strArr = new String[arrayList.size() + length];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
        }
        this.n3.putExtra(str, strArr);
    }

    public void s() {
        this.y.startActivity(zn());
    }

    @NonNull
    public x4 v(@Nullable CharSequence charSequence) {
        this.zn = charSequence;
        return this;
    }

    @NonNull
    public x4 y(@NonNull Uri uri) {
        if (this.f8203fb == null) {
            this.f8203fb = new ArrayList<>();
        }
        this.f8203fb.add(uri);
        return this;
    }

    @NonNull
    public Intent zn() {
        return Intent.createChooser(gv(), this.zn);
    }
}
