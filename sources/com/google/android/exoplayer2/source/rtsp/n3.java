package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import b1.d0;
import b1.wz;
import com.google.android.exoplayer2.source.rtsp.y;
import hx.xc;
import java.io.IOException;
import r0.ta;
import r0.w;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements ta.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.InterfaceC0057y f1842a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public hx.gv f1844fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final wz f1845gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public volatile long f1846i9;
    public final xc n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f1847s;
    public final int y;
    public final y zn;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f1848v = ut.i4();

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public volatile long f1843c5 = -9223372036854775807L;

    public interface y {
        void y(String str, com.google.android.exoplayer2.source.rtsp.y yVar);
    }

    public n3(int i, xc xcVar, y yVar, wz wzVar, y.InterfaceC0057y interfaceC0057y) {
        this.y = i;
        this.n3 = xcVar;
        this.zn = yVar;
        this.f1845gv = wzVar;
        this.f1842a = interfaceC0057y;
    }

    public void a(long j) {
        if (j == -9223372036854775807L || ((hx.gv) v0.y.v(this.f1844fb)).v()) {
            return;
        }
        this.f1844fb.c5(j);
    }

    @Override // r0.ta.v
    public void f() {
        this.f1847s = true;
    }

    public void gv(long j, long j4) {
        this.f1843c5 = j;
        this.f1846i9 = j4;
    }

    @Override // r0.ta.v
    public void i9() throws IOException {
        final com.google.android.exoplayer2.source.rtsp.y yVarY = null;
        try {
            yVarY = this.f1842a.y(this.y);
            final String strZn = yVarY.zn();
            this.f1848v.post(new Runnable() { // from class: hx.zn
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.n3(strZn, yVarY);
                }
            });
            b1.a aVar = new b1.a((r0.c5) v0.y.v(yVarY), 0L, -1L);
            hx.gv gvVar = new hx.gv(this.n3.y, this.y);
            this.f1844fb = gvVar;
            gvVar.zn(this.f1845gv);
            while (!this.f1847s) {
                if (this.f1843c5 != -9223372036854775807L) {
                    this.f1844fb.y(this.f1846i9, this.f1843c5);
                    this.f1843c5 = -9223372036854775807L;
                }
                if (this.f1844fb.fb(aVar, new d0()) == -1) {
                    break;
                }
            }
            w.y(yVarY);
        } catch (Throwable th) {
            w.y(yVarY);
            throw th;
        }
    }

    public final /* synthetic */ void n3(String str, com.google.android.exoplayer2.source.rtsp.y yVar) {
        this.zn.y(str, yVar);
    }

    public void v(int i) {
        if (((hx.gv) v0.y.v(this.f1844fb)).v()) {
            return;
        }
        this.f1844fb.s(i);
    }

    public void zn() {
        ((hx.gv) v0.y.v(this.f1844fb)).a();
    }
}
