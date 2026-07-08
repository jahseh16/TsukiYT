package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import i2.i9;
import i2.n3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ne.gv;
import ne.zn;
import yk.a;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class y implements zn, n3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1114r = f.a("SystemFgDispatcher");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final gv f1115co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1116f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final br.y f1117fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set<androidx.work.impl.model.n3> f1118p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1119s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map<String, a> f1120t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i9 f1121v;
    public final Map<String, androidx.work.impl.model.n3> w;
    public Context y;

    @Nullable
    public n3 z;

    public y(@NonNull Context context) {
        this.y = context;
        i9 i9VarXc = i9.xc(context);
        this.f1121v = i9VarXc;
        br.y yVarZ = i9VarXc.z();
        this.f1117fb = yVarZ;
        this.f1116f = null;
        this.f1120t = new LinkedHashMap();
        this.f1118p = new HashSet();
        this.w = new HashMap();
        this.f1115co = new gv(this.y, yVarZ, this);
        this.f1121v.p().zn(this);
    }

    @NonNull
    public static Intent gv(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @NonNull
    public static Intent y(@NonNull Context context, @NonNull String str, @NonNull a aVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", aVar.zn());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", aVar.y());
        intent.putExtra("KEY_NOTIFICATION", aVar.n3());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent zn(@NonNull Context context, @NonNull String str, @NonNull a aVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", aVar.zn());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", aVar.y());
        intent.putExtra("KEY_NOTIFICATION", aVar.n3());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // ne.zn
    public void a(@NonNull List<String> list) {
    }

    public final void c5(@NonNull Intent intent) {
        f.zn().gv(f1114r, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f1117fb.n3(new y(this, this.f1121v.co(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void f() {
        this.z = null;
        synchronized (this.f1119s) {
            this.f1115co.v();
        }
        this.f1121v.p().c5(this);
    }

    public final void fb(@NonNull Intent intent) {
        f.zn().gv(f1114r, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f1121v.c5(UUID.fromString(stringExtra));
    }

    public void i9(@NonNull Intent intent) {
        f.zn().gv(f1114r, "Stopping foreground service", new Throwable[0]);
        n3 n3Var = this.z;
        if (n3Var != null) {
            n3Var.stop();
        }
    }

    @Override // ne.zn
    public void n3(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            f.zn().y(f1114r, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f1121v.d0(str);
        }
    }

    public final void s(@NonNull Intent intent) {
        int iY = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        f.zn().y(f1114r, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.z == null) {
            return;
        }
        this.f1120t.put(stringExtra, new a(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f1116f)) {
            this.f1116f = stringExtra;
            this.z.zn(intExtra, intExtra2, notification);
            return;
        }
        this.z.y(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, a>> it = this.f1120t.entrySet().iterator();
        while (it.hasNext()) {
            iY |= it.next().getValue().y();
        }
        a aVar = this.f1120t.get(this.f1116f);
        if (aVar != null) {
            this.z.zn(aVar.zn(), iY, aVar.n3());
        }
    }

    public void t(@NonNull Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            c5(intent);
            s(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            s(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            fb(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            i9(intent);
        }
    }

    public void tl(@NonNull n3 n3Var) {
        if (this.z != null) {
            f.zn().n3(f1114r, "A callback already exists.", new Throwable[0]);
        } else {
            this.z = n3Var;
        }
    }

    @Override // i2.n3
    public void v(@NonNull String str, boolean z) {
        Map.Entry<String, a> entry;
        synchronized (this.f1119s) {
            try {
                androidx.work.impl.model.n3 n3VarRemove = this.w.remove(str);
                if (n3VarRemove != null ? this.f1118p.remove(n3VarRemove) : false) {
                    this.f1115co.gv(this.f1118p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVarRemove = this.f1120t.remove(str);
        if (str.equals(this.f1116f) && this.f1120t.size() > 0) {
            Iterator<Map.Entry<String, a>> it = this.f1120t.entrySet().iterator();
            Map.Entry<String, a> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f1116f = entry.getKey();
            if (this.z != null) {
                a value = entry.getValue();
                this.z.zn(value.zn(), value.y(), value.n3());
                this.z.gv(value.zn());
            }
        }
        n3 n3Var = this.z;
        if (aVarRemove == null || n3Var == null) {
            return;
        }
        f.zn().y(f1114r, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(aVarRemove.zn()), str, Integer.valueOf(aVarRemove.y())), new Throwable[0]);
        n3Var.gv(aVarRemove.zn());
    }
}
