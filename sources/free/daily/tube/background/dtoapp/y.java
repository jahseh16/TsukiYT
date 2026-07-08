package free.daily.tube.background.dtoapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import free.daily.tube.background.dtoapp.MxApp;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ol.n3;
import qb.a;
import qb.fb;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static long f4635gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static MxApp f4636v;
    public static final C0091y zn = new C0091y(null);
    public String n3;
    public final MxApp y;

    /* JADX INFO: renamed from: free.daily.tube.background.dtoapp.y$y, reason: collision with other inner class name */
    public static final class C0091y {
        public /* synthetic */ C0091y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long n3() {
            return y.f4635gv;
        }

        public final MxApp y() {
            return y.f4636v;
        }

        public C0091y() {
        }
    }

    public y(MxApp context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.y = context;
        this.n3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
    }

    public final SharedPreferences a(String str, int i, MxApp.n3 getSuperShare) {
        Intrinsics.checkNotNullParameter(getSuperShare, "getSuperShare");
        if (n3.n3()) {
            return getSuperShare.y(str, Integer.valueOf(i));
        }
        SharedPreferences sharedPreferencesZn = pm.y.zn(this.y, str, i);
        return sharedPreferencesZn == null ? getSuperShare.y(str, Integer.valueOf(i)) : sharedPreferencesZn;
    }

    public final void c5() {
        new pm.y().v(this.y);
    }

    public final void f() {
        new pm.y().s(this.y);
    }

    public final boolean fb() {
        return new pm.y().gv(this.y);
    }

    public final String gv() {
        return new pm.y().n3(this.y);
    }

    public final void i9() {
        f4636v = this.y;
        new pm.y().fb(this.y);
    }

    public final void s(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        long jCurrentTimeMillis = ((((System.currentTimeMillis() * ((long) 365)) % 1210) * ((long) 3)) + ((long) 4)) % ((long) 1336);
        long jNextLong = (new Random(209L).nextLong() + ((long) 3425)) % 239;
        if (jNextLong % ((long) 99) == 0) {
            Timber.d("PKwllkizXEQ" + ((int) (jNextLong * ((long) 21))) + "7D7", new Object[0]);
        } else {
            Timber.i("PKwllkizXEQ" + ((int) (jNextLong / ((long) 21))) + "9s2hRfGfjuV1", new Object[0]);
        }
        Timber.d("9PvdZyPlCxIKnPb" + jCurrentTimeMillis, new Object[0]);
        Log.e("App", "onConfigurationChanged");
        try {
            new pm.y().a(this.y, newConfig);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void t(int i) {
        new pm.y().c5(this.y, i);
    }

    public final void tl(Context context, Long l3) {
        new pm.y().y(context, this.y, l3);
    }

    public final String v(MxApp.y superName) {
        Intrinsics.checkNotNullParameter(superName, "superName");
        String str = this.n3;
        if (str != null && str.length() > 0) {
            return this.n3;
        }
        String strY = superName.y();
        this.n3 = strY;
        return strY;
    }

    public final void wz(Exception exc, String str) throws Exception {
        try {
            com.uv.v7.y.y(this.y, 0);
            com.uv.v7.y.y(this.y, 1);
            com.uv.v7.y.v(this.y, 1, Boolean.FALSE);
            long j = ((((long) 5) * 433) + ((long) 8)) % ((long) 1433);
            if (373 % ((long) 93) == 0) {
                Timber.i("Q8yPPagNIt" + ((int) (((long) 23) * 373)) + "d4BV", new Object[0]);
            } else {
                Timber.i("Q8yPPagNIt" + ((int) (373 / ((long) 23))) + "6WtC2ElGq", new Object[0]);
            }
            System.out.println((Object) ("seQgiDzl49D4" + j));
        } catch (Exception e4) {
            e4.printStackTrace();
            if (!(exc instanceof fb)) {
                throw new RuntimeException(e4 + ", first exception, mmkvInfo = " + str);
            }
            if (!(e4 instanceof fb)) {
                throw new RuntimeException(e4 + ", second exception, mmkvInfo = " + com.uv.v7.y.gv(this.y) + ", first exception class = " + exc.getClass().getName() + ", message = " + exc.getMessage());
            }
            if (exc instanceof a) {
                throw exc;
            }
            if (e4 instanceof a) {
                throw e4;
            }
            ((fb) e4).y(exc.getMessage());
            long jNanoTime = (((System.nanoTime() % 1328) * ((long) 5)) + ((long) 12)) % ((long) 1253);
            for (int i = 0; i < 5; i++) {
                long j4 = (((long) i) + jNanoTime) % ((long) 8);
            }
            Timber.i("Dw1REV8M6Y" + jNanoTime, new Object[0]);
            throw e4;
        }
    }

    public final void zn(Context context) throws Exception {
        f4635gv = SystemClock.elapsedRealtime();
        long j = 3;
        long jNextLong = ((((new Random(670L).nextLong() + ((long) 4203)) % 1091) * j) + j) % ((long) 1468);
        long jCurrentTimeMillis = (System.currentTimeMillis() * ((long) 1038)) % 151;
        if (jCurrentTimeMillis % ((long) 74) == 0) {
            System.out.println((Object) ("UuF2lFa15IvGYK1" + ((int) (jCurrentTimeMillis * ((long) 43))) + "GfSe0PcEk7HHnsJ"));
        } else {
            System.out.println((Object) ("UuF2lFa15IvGYK1" + ((int) (jCurrentTimeMillis / ((long) 43))) + "o6IY1pSlgh"));
        }
        Timber.d("kze8zw6N1" + jNextLong, new Object[0]);
        long jCurrentTimeMillis2 = System.currentTimeMillis() % 154;
        if (jCurrentTimeMillis2 % ((long) 77) == 0) {
            Timber.i("nm9tec" + ((int) (jCurrentTimeMillis2 * ((long) 32))) + "IyU4ZL", new Object[0]);
        } else {
            System.out.println((Object) ("nm9tec" + ((int) (jCurrentTimeMillis2 / ((long) 32))) + "BRCiR2"));
        }
        Timber.i("cGDkrzE7yoLYA" + jNextLong, new Object[0]);
        try {
            com.uv.v7.y.v(this.y, 0, Boolean.FALSE);
        } catch (Exception e4) {
            e4.printStackTrace();
            String strGv = com.uv.v7.y.gv(this.y);
            Intrinsics.checkNotNull(strGv);
            wz(e4, strGv);
            long j4 = 4;
            long jCurrentTimeMillis3 = ((((System.currentTimeMillis() * ((long) 851)) % 1331) * j4) + j4) % ((long) 1022);
            if (228 % ((long) 9) == 0) {
                Timber.d("KJ7m9Vv" + ((int) (((long) 43) * 228)) + "Qs92C4zGUiuG", new Object[0]);
            } else {
                System.out.println((Object) ("KJ7m9Vv" + ((int) (228 / ((long) 43))) + "5OG4O4SK"));
            }
            System.out.println((Object) ("hShUSz5A" + jCurrentTimeMillis3));
            for (int i = 0; i < 3; i++) {
            }
            System.out.println((Object) ("Y0ALzFnmFMwtMK" + jCurrentTimeMillis3));
        }
        try {
            tl(context, Long.valueOf(f4635gv));
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
