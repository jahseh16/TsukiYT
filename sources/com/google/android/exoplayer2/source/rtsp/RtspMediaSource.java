package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.y;
import ft.rb;
import ft.xb;
import ft.xq;
import hx.i4;
import java.io.IOException;
import javax.net.SocketFactory;
import r0.o;
import ur.d0;
import ur.mg;
import ur.r;
import ur.y5;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class RtspMediaSource extends ur.y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final y.InterfaceC0057y f1790co;
    public boolean d0;
    public final SocketFactory f3;
    public boolean fh;
    public final boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xb f1792p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Uri f1793r;
    public final String z;
    public long c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1791d = true;

    public static final class gv extends zn {
        public gv(String str) {
            super(str);
        }
    }

    public class n3 extends r {
        public n3(RtspMediaSource rtspMediaSource, xq xqVar) {
            super(xqVar);
        }

        @Override // ur.r, ft.xq
        public xq.gv co(int i, xq.gv gvVar, long j) {
            super.co(i, gvVar, j);
            gvVar.f3 = true;
            return gvVar;
        }

        @Override // ur.r, ft.xq
        public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
            super.f(i, n3Var, z);
            n3Var.f5174t = true;
            return n3Var;
        }
    }

    public class y implements a.zn {
        public y() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.a.zn
        public void n3() {
            RtspMediaSource.this.d0 = false;
            RtspMediaSource.this.m();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.a.zn
        public void y(i4 i4Var) {
            RtspMediaSource.this.c = ut.xb(i4Var.y());
            RtspMediaSource.this.d0 = !i4Var.zn();
            RtspMediaSource.this.fh = i4Var.zn();
            RtspMediaSource.this.f1791d = false;
            RtspMediaSource.this.m();
        }
    }

    public static class zn extends IOException {
        public zn(String str) {
            super(str);
        }

        public zn(Throwable th) {
            super(th);
        }

        public zn(String str, Throwable th) {
            super(str, th);
        }
    }

    static {
        rb.y("goog.exo.rtsp");
    }

    public RtspMediaSource(xb xbVar, y.InterfaceC0057y interfaceC0057y, String str, SocketFactory socketFactory, boolean z) {
        this.f1792p = xbVar;
        this.f1790co = interfaceC0057y;
        this.z = str;
        this.f1793r = ((xb.s) v0.y.v(xbVar.f5080v)).y;
        this.f3 = socketFactory;
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        xq y5Var = new y5(this.c, this.d0, false, this.fh, null, this.f1792p);
        if (this.f1791d) {
            y5Var = new n3(this, y5Var);
        }
        s8(y5Var);
    }

    @Override // ur.y
    public void ap() {
    }

    @Override // ur.mg
    public xb c() {
        return this.f1792p;
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        ((a) d0Var).q9();
    }

    @Override // ur.y
    public void e(@Nullable o oVar) {
        m();
    }

    @Override // ur.mg
    public void oz() {
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        return new a(n3Var2, this.f1790co, this.f1793r, new y(), this.z, this.f3, this.n);
    }

    public static final class Factory implements mg.y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f1794gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f1795v;
        public long y = 8000;
        public String n3 = "ExoPlayerLib/2.18.7";
        public SocketFactory zn = SocketFactory.getDefault();

        @Override // ur.mg.y
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource y(xb xbVar) {
            v0.y.v(xbVar.f5080v);
            return new RtspMediaSource(xbVar, this.f1794gv ? new f(this.y) : new tl(this.y), this.n3, this.zn, this.f1795v);
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Factory zn(r0.mg mgVar) {
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Factory n3(v5.r rVar) {
            return this;
        }
    }
}
