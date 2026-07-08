package j3;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import yk.zn;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static final String n3 = yk.f.a("SystemJobInfoConverter");
    public final ComponentName y;

    public static /* synthetic */ class y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[yk.t.values().length];
            y = iArr;
            try {
                iArr[yk.t.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[yk.t.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y[yk.t.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                y[yk.t.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                y[yk.t.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(@NonNull Context context) {
        this.y = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public static void gv(@NonNull JobInfo.Builder builder, @NonNull yk.t tVar) {
        if (Build.VERSION.SDK_INT < 30 || tVar != yk.t.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(zn(tVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public static JobInfo.TriggerContentUri n3(zn.y yVar) {
        boolean zN3 = yVar.n3();
        c5.y();
        return s.y(yVar.y(), zN3 ? 1 : 0);
    }

    public static int zn(yk.t tVar) {
        int i = y.y[tVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        yk.f.zn().y(n3, String.format("API version too low. Cannot convert network type value %s", tVar), new Throwable[0]);
        return 1;
    }

    public JobInfo y(androidx.work.impl.model.n3 n3Var, int i) {
        yk.n3 n3Var2 = n3Var.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", n3Var.id);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", n3Var.gv());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.y).setRequiresCharging(n3Var2.fb()).setRequiresDeviceIdle(n3Var2.s()).setExtras(persistableBundle);
        gv(extras, n3Var2.n3());
        if (!n3Var2.s()) {
            extras.setBackoffCriteria(n3Var.backoffDelayDuration, n3Var.backoffPolicy == yk.y.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(n3Var.y() - System.currentTimeMillis(), 0L);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!n3Var.expedited) {
            extras.setImportantWhileForeground(true);
        }
        if (i5 >= 24 && n3Var2.v()) {
            Iterator<zn.y> it = n3Var2.y().n3().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(n3(it.next()));
            }
            extras.setTriggerContentUpdateDelay(n3Var2.zn());
            extras.setTriggerContentMaxDelay(n3Var2.gv());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(n3Var2.a());
            extras.setRequiresStorageNotLow(n3Var2.c5());
        }
        boolean z = n3Var.runAttemptCount > 0;
        boolean z5 = jMax > 0;
        if (yt.y.n3() && n3Var.expedited && !z && !z5) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
