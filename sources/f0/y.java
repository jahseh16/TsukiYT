package f0;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b0.c5;
import b0.f;
import b0.n3;
import b0.s;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s {

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public Inflater f3346mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0086y f3347p;
    public final d w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final d f3348xc;

    /* JADX INFO: renamed from: f0.y$y, reason: collision with other inner class name */
    public static final class C0086y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3349a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f3350c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f3351fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f3352gv;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f3353s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f3354v;
        public boolean zn;
        public final d y = new d();
        public final int[] n3 = new int[NotificationCompat.FLAG_LOCAL_ONLY];

        public final void a(d dVar, int i) {
            if (i < 19) {
                return;
            }
            this.f3352gv = dVar.yt();
            this.f3354v = dVar.yt();
            dVar.ut(11);
            this.f3349a = dVar.yt();
            this.f3351fb = dVar.yt();
        }

        public final void fb(d dVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            dVar.ut(2);
            Arrays.fill(this.n3, 0);
            int i5 = i / 5;
            for (int i8 = 0; i8 < i5; i8++) {
                int iEj = dVar.ej();
                int iEj2 = dVar.ej();
                int iEj3 = dVar.ej();
                int iEj4 = dVar.ej();
                double d4 = iEj2;
                double d5 = iEj3 - 128;
                double d6 = iEj4 - 128;
                this.n3[iEj] = (ut.p((int) ((d4 - (0.34414d * d6)) - (d5 * 0.71414d)), 0, 255) << 8) | (dVar.ej() << 24) | (ut.p((int) ((1.402d * d5) + d4), 0, 255) << 16) | ut.p((int) (d4 + (d6 * 1.772d)), 0, 255);
            }
            this.zn = true;
        }

        @Nullable
        public b0.n3 gv() {
            int iEj;
            if (this.f3352gv == 0 || this.f3354v == 0 || this.f3353s == 0 || this.f3350c5 == 0 || this.y.fb() == 0 || this.y.a() != this.y.fb() || !this.zn) {
                return null;
            }
            this.y.oz(0);
            int i = this.f3353s * this.f3350c5;
            int[] iArr = new int[i];
            int i5 = 0;
            while (i5 < i) {
                int iEj2 = this.y.ej();
                if (iEj2 != 0) {
                    iEj = i5 + 1;
                    iArr[i5] = this.n3[iEj2];
                } else {
                    int iEj3 = this.y.ej();
                    if (iEj3 != 0) {
                        iEj = ((iEj3 & 64) == 0 ? iEj3 & 63 : ((iEj3 & 63) << 8) | this.y.ej()) + i5;
                        Arrays.fill(iArr, i5, iEj, (iEj3 & 128) == 0 ? 0 : this.n3[this.y.ej()]);
                    }
                }
                i5 = iEj;
            }
            return new n3.C0034n3().a(Bitmap.createBitmap(iArr, this.f3353s, this.f3350c5, Bitmap.Config.ARGB_8888)).f(this.f3349a / this.f3352gv).t(0).s(this.f3351fb / this.f3354v, 0).c5(0).wz(this.f3353s / this.f3352gv).fb(this.f3350c5 / this.f3354v).y();
        }

        public void s() {
            this.f3352gv = 0;
            this.f3354v = 0;
            this.f3349a = 0;
            this.f3351fb = 0;
            this.f3353s = 0;
            this.f3350c5 = 0;
            this.y.j5(0);
            this.zn = false;
        }

        public final void v(d dVar, int i) {
            int iX;
            if (i < 4) {
                return;
            }
            dVar.ut(3);
            int i5 = i - 4;
            if ((dVar.ej() & 128) != 0) {
                if (i5 < 7 || (iX = dVar.x()) < 4) {
                    return;
                }
                this.f3353s = dVar.yt();
                this.f3350c5 = dVar.yt();
                this.y.j5(iX - 4);
                i5 = i - 11;
            }
            int iA = this.y.a();
            int iFb = this.y.fb();
            if (iA >= iFb || i5 <= 0) {
                return;
            }
            int iMin = Math.min(i5, iFb - iA);
            dVar.t(this.y.v(), iA, iMin);
            this.y.oz(iA + iMin);
        }
    }

    public y() {
        super("PgsDecoder");
        this.f3348xc = new d();
        this.w = new d();
        this.f3347p = new C0086y();
    }

    @Nullable
    public static b0.n3 rz(d dVar, C0086y c0086y) {
        int iFb = dVar.fb();
        int iEj = dVar.ej();
        int iYt = dVar.yt();
        int iA = dVar.a() + iYt;
        b0.n3 n3VarGv = null;
        if (iA > iFb) {
            dVar.oz(iFb);
            return null;
        }
        if (iEj != 128) {
            switch (iEj) {
                case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                    c0086y.fb(dVar, iYt);
                    break;
                case 21:
                    c0086y.v(dVar, iYt);
                    break;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    c0086y.a(dVar, iYt);
                    break;
            }
        } else {
            n3VarGv = c0086y.gv();
            c0086y.s();
        }
        dVar.oz(iA);
        return n3VarGv;
    }

    @Override // b0.s
    public c5 c(byte[] bArr, int i, boolean z) throws f {
        this.f3348xc.o(bArr, i);
        fh(this.f3348xc);
        this.f3347p.s();
        ArrayList arrayList = new ArrayList();
        while (this.f3348xc.y() >= 3) {
            b0.n3 n3VarRz = rz(this.f3348xc, this.f3347p);
            if (n3VarRz != null) {
                arrayList.add(n3VarRz);
            }
        }
        return new n3(Collections.unmodifiableList(arrayList));
    }

    public final void fh(d dVar) {
        if (dVar.y() <= 0 || dVar.i9() != 120) {
            return;
        }
        if (this.f3346mt == null) {
            this.f3346mt = new Inflater();
        }
        if (ut.rb(dVar, this.w, this.f3346mt)) {
            dVar.o(this.w.v(), this.w.fb());
        }
    }
}
