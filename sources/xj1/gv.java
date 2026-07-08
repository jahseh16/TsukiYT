package xj1;

import ak1.wz;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import sj1.n;
import sj1.p;
import sj1.r;
import sj1.ta;
import xj1.i9;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i9 f9194a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f9195c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f9196fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final p f9197gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public ta f9198i9;
    public final sj1.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9199s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i9.n3 f9200v;
    public final fb y;
    public final v zn;

    public gv(fb connectionPool, sj1.y address, v call, p eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.y = connectionPool;
        this.n3 = address;
        this.zn = call;
        this.f9197gv = eventListener;
    }

    public final ta a() {
        a aVarTl;
        if (this.f9196fb > 1 || this.f9199s > 1 || this.f9195c5 > 0 || (aVarTl = this.zn.tl()) == null) {
            return null;
        }
        synchronized (aVarTl) {
            if (aVarTl.z() != 0) {
                return null;
            }
            if (tj1.gv.i9(aVarTl.n3().y().t(), gv().t())) {
                return aVarTl.n3();
            }
            return null;
        }
    }

    public final boolean fb(r url) {
        Intrinsics.checkNotNullParameter(url, "url");
        r rVarT = this.n3.t();
        return url.mt() == rVarT.mt() && Intrinsics.areEqual(url.f(), rVarT.f());
    }

    public final sj1.y gv() {
        return this.n3;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xj1.a n3(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj1.gv.n3(int, int, int, int, boolean):xj1.a");
    }

    public final void s(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f9198i9 = null;
        if ((e4 instanceof wz) && ((wz) e4).errorCode == ak1.n3.REFUSED_STREAM) {
            this.f9196fb++;
        } else if (e4 instanceof ak1.y) {
            this.f9199s++;
        } else {
            this.f9195c5++;
        }
    }

    public final boolean v() {
        i9 i9Var;
        if (this.f9196fb == 0 && this.f9199s == 0 && this.f9195c5 == 0) {
            return false;
        }
        if (this.f9198i9 != null) {
            return true;
        }
        ta taVarA = a();
        if (taVarA != null) {
            this.f9198i9 = taVarA;
            return true;
        }
        i9.n3 n3Var = this.f9200v;
        if ((n3Var != null && n3Var.n3()) || (i9Var = this.f9194a) == null) {
            return true;
        }
        return i9Var.y();
    }

    public final yj1.gv y(n client, yj1.fb chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            return zn(chain.fb(), chain.c5(), chain.f(), client.fh(), client.ej(), !Intrinsics.areEqual(chain.i9().s(), "GET")).n(client, chain);
        } catch (IOException e4) {
            s(e4);
            throw new c5(e4);
        } catch (c5 e5) {
            s(e5.gv());
            throw e5;
        }
    }

    public final a zn(int i, int i5, int i8, int i10, boolean z, boolean z5) throws IOException {
        while (true) {
            a aVarN3 = n3(i, i5, i8, i10, z);
            if (aVarN3.i4(z5)) {
                return aVarN3;
            }
            aVarN3.d0();
            if (this.f9198i9 == null) {
                i9.n3 n3Var = this.f9200v;
                if (n3Var == null ? true : n3Var.n3()) {
                    continue;
                } else {
                    i9 i9Var = this.f9194a;
                    if (!(i9Var != null ? i9Var.y() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }
}
