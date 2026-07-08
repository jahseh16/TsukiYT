package wn;

import androidx.annotation.Nullable;
import de1.xc;
import g4.w;
import if1.zn;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import r0.d0;
import r0.o;
import r0.p;
import r0.x4;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends xc {

    public static final class y implements d0.n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public w<String> f9045a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public zn f9046c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public o f9048fb;
        public final Executor n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public String f9051s;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f9053tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public d0.n3 f9054v;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public boolean f9055wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public boolean f9056xc;

        @Nullable
        public final CronetEngine y;
        public final d0.a zn = new d0.a();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final x4.n3 f9049gv = null;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f9050i9 = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9047f = 8000;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9052t = 8000;

        public y(CronetEngine cronetEngine, Executor executor) {
            this.y = (CronetEngine) v0.y.v(cronetEngine);
            this.n3 = executor;
        }

        public y gv(@Nullable String str) {
            this.f9051s = str;
            x4.n3 n3Var = this.f9049gv;
            if (n3Var != null) {
                n3Var.v(str);
            }
            return this;
        }

        public y n3(int i) {
            this.f9047f = i;
            x4.n3 n3Var = this.f9049gv;
            if (n3Var != null) {
                n3Var.zn(i);
            }
            return this;
        }

        public y v(@Nullable zn znVar) {
            this.f9046c5 = znVar;
            return this;
        }

        public y zn(int i) {
            this.f9052t = i;
            x4.n3 n3Var = this.f9049gv;
            if (n3Var != null) {
                n3Var.gv(i);
            }
            return this;
        }

        @Override // r0.tl.y
        public d0 y() {
            if (this.y == null) {
                d0.n3 n3Var = this.f9054v;
                return n3Var != null ? n3Var.y() : ((x4.n3) v0.y.v(this.f9049gv)).y();
            }
            xc n3Var2 = new n3(this.y, this.n3, this.f9050i9, this.f9047f, this.f9052t, this.f9053tl, this.f9055wz, this.f9051s, this.zn, this.f9045a, this.f9056xc, this.f9046c5);
            o oVar = this.f9048fb;
            if (oVar != null) {
                n3Var2.co(oVar);
            }
            return n3Var2;
        }
    }

    public n3(CronetEngine cronetEngine, Executor executor, int i, int i5, int i8, boolean z, boolean z5, @Nullable String str, @Nullable d0.a aVar, @Nullable w<String> wVar, boolean z7, @Nullable zn znVar) {
        super(cronetEngine, executor, i, i5, i8, z, z5, str, aVar, wVar, z7, znVar);
    }

    public long y(p pVar) throws d0.zn {
        try {
            long jY = super.y(pVar);
            a8();
            return jY;
        } catch (d0.zn e4) {
            Timber.tag("MyCronetDS").w(e4, "fail to request %s", pVar.y);
            throw e4;
        }
    }
}
