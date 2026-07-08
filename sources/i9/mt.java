package i9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.hjq.permissions.Permission;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class mt {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static mt f5593gv;
    public final LocationManager n3;
    public final Context y;
    public final y zn = new y();

    public static class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f5594a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f5595gv;
        public long n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f5596v;
        public boolean y;
        public long zn;
    }

    public mt(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.y = context;
        this.n3 = locationManager;
    }

    public static mt y(@NonNull Context context) {
        if (f5593gv == null) {
            Context applicationContext = context.getApplicationContext();
            f5593gv = new mt(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f5593gv;
    }

    public final void a(@NonNull Location location) {
        long j;
        y yVar = this.zn;
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVarN3 = p.n3();
        pVarN3.y(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j4 = pVarN3.y;
        pVarN3.y(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = pVarN3.zn == 1;
        long j7 = pVarN3.n3;
        long j8 = pVarN3.y;
        boolean z5 = z;
        pVarN3.y(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j9 = pVarN3.n3;
        if (j7 == -1 || j8 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            j = (jCurrentTimeMillis > j8 ? j9 : jCurrentTimeMillis > j7 ? j8 : j7) + 60000;
        }
        yVar.y = z5;
        yVar.n3 = j4;
        yVar.zn = j7;
        yVar.f5595gv = j8;
        yVar.f5596v = j9;
        yVar.f5594a = j;
    }

    public boolean gv() {
        y yVar = this.zn;
        if (v()) {
            return yVar.y;
        }
        Location locationN3 = n3();
        if (locationN3 != null) {
            a(locationN3);
            return yVar.y;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    @SuppressLint({"MissingPermission"})
    public final Location n3() {
        Location locationZn = d.a.n3(this.y, Permission.ACCESS_COARSE_LOCATION) == 0 ? zn("network") : null;
        Location locationZn2 = d.a.n3(this.y, Permission.ACCESS_FINE_LOCATION) == 0 ? zn("gps") : null;
        return (locationZn2 == null || locationZn == null) ? locationZn2 != null ? locationZn2 : locationZn : locationZn2.getTime() > locationZn.getTime() ? locationZn2 : locationZn;
    }

    public final boolean v() {
        return this.zn.f5594a > System.currentTimeMillis();
    }

    public final Location zn(String str) {
        try {
            if (this.n3.isProviderEnabled(str)) {
                return this.n3.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e4) {
            Log.d("TwilightManager", "Failed to get last known location", e4);
            return null;
        }
    }
}
