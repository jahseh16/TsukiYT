package ig;

import android.net.Uri;
import b1.d0;
import b1.mt;
import b1.p;
import b1.t;
import b1.ta;
import b1.tl;
import b1.wz;
import ft.q;
import java.io.IOException;
import java.util.Map;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public class gv implements t {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final mt f5691gv = new mt() { // from class: ig.zn
        @Override // b1.mt
        public final t[] createExtractors() {
            return gv.v();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };
    public c5 n3;
    public wz y;
    public boolean zn;

    public static d a(d dVar) {
        dVar.oz(0);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t[] v() {
        return new t[]{new gv()};
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        v0.y.c5(this.y);
        if (this.n3 == null) {
            if (!s(tlVar)) {
                throw q.y("Failed to determine bitstream type", null);
            }
            tlVar.s();
        }
        if (!this.zn) {
            ta taVarA = this.y.a(0, 1);
            this.y.p();
            this.n3.gv(this.y, taVarA);
            this.zn = true;
        }
        return this.n3.fb(tlVar, d0Var);
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        try {
            return s(tlVar);
        } catch (q unused) {
            return false;
        }
    }

    public final boolean s(tl tlVar) throws IOException {
        a aVar = new a();
        if (aVar.y(tlVar, true) && (aVar.n3 & 2) == 2) {
            int iMin = Math.min(aVar.f5674c5, 8);
            d dVar = new d(iMin);
            tlVar.z(dVar.v(), 0, iMin);
            if (n3.w(a(dVar))) {
                this.n3 = new n3();
            } else if (i9.mt(a(dVar))) {
                this.n3 = new i9();
            } else if (s.xc(a(dVar))) {
                this.n3 = new s();
            }
            return true;
        }
        return false;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        c5 c5Var = this.n3;
        if (c5Var != null) {
            c5Var.tl(j, j4);
        }
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.y = wzVar;
    }

    @Override // b1.t
    public void release() {
    }
}
