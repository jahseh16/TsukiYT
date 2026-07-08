package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import b1.mg;
import b1.ta;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import ft.g;
import ft.q;
import ft.u0;
import h6.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import r0.c5;
import ur.f7;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Handler.Callback {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f1731co;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1734p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pv.zn f1736t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n3 f1737v;
    public long w;
    public final r0.n3 y;
    public boolean z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap<Long, Long> f1732f = new TreeMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f1735s = ut.f3(this);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final qg.y f1733fb = new qg.y();

    public interface n3 {
        void n3();

        void y(long j);
    }

    public static final class y {
        public final long n3;
        public final long y;

        public y(long j, long j4) {
            this.y = j;
            this.n3 = j4;
        }
    }

    public final class zn implements ta {
        public final f7 y;
        public final u0 n3 = new u0();
        public final de.gv zn = new de.gv();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f1738gv = -9223372036854775807L;

        public zn(r0.n3 n3Var) {
            this.y = f7.t(n3Var);
        }

        @Override // b1.ta
        public void a(long j, int i, int i5, int i8, @Nullable ta.y yVar) {
            this.y.a(j, i, i5, i8, yVar);
            t();
        }

        public void c5(a aVar) {
            long j = this.f1738gv;
            if (j == -9223372036854775807L || aVar.f5289s > j) {
                this.f1738gv = aVar.f5289s;
            }
            v.this.tl(aVar);
        }

        public final void f(long j, long j4) {
            v.this.f1735s.sendMessage(v.this.f1735s.obtainMessage(1, new y(j, j4)));
        }

        @Nullable
        public final de.gv fb() {
            this.zn.a();
            if (this.y.o(this.n3, this.zn, 0, false) != -4) {
                return null;
            }
            this.zn.co();
            return this.zn;
        }

        @Override // b1.ta
        public int gv(c5 c5Var, int i, boolean z, int i5) throws IOException {
            return this.y.v(c5Var, i, z);
        }

        public boolean i9(a aVar) {
            long j = this.f1738gv;
            return v.this.wz(j != -9223372036854775807L && j < aVar.f5287fb);
        }

        @Override // b1.ta
        public /* synthetic */ void n3(d dVar, int i) {
            mg.n3(this, dVar, i);
        }

        public boolean s(long j) {
            return v.this.i9(j);
        }

        public final void t() {
            while (this.y.x(false)) {
                de.gv gvVarFb = fb();
                if (gvVarFb != null) {
                    long j = gvVarFb.f3178f;
                    Metadata metadataY = v.this.f1733fb.y(gvVarFb);
                    if (metadataY != null) {
                        EventMessage eventMessage = (EventMessage) metadataY.gv(0);
                        if (v.s(eventMessage.y, eventMessage.f1582v)) {
                            tl(j, eventMessage);
                        }
                    }
                }
            }
            this.y.co();
        }

        public final void tl(long j, EventMessage eventMessage) {
            long jA = v.a(eventMessage);
            if (jA == -9223372036854775807L) {
                return;
            }
            f(j, jA);
        }

        @Override // b1.ta
        public /* synthetic */ int v(c5 c5Var, int i, boolean z) {
            return mg.y(this, c5Var, i, z);
        }

        public void wz() {
            this.y.j();
        }

        @Override // b1.ta
        public void y(g gVar) {
            this.y.y(gVar);
        }

        @Override // b1.ta
        public void zn(d dVar, int i, int i5) {
            this.y.n3(dVar, i);
        }
    }

    public v(pv.zn znVar, n3 n3Var, r0.n3 n3Var2) {
        this.f1736t = znVar;
        this.f1737v = n3Var;
        this.y = n3Var2;
    }

    public static long a(EventMessage eventMessage) {
        try {
            return ut.gq(ut.mg(eventMessage.f1578f));
        } catch (q unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean s(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public final void c5() {
        if (this.f1734p) {
            this.f1731co = true;
            this.f1734p = false;
            this.f1737v.n3();
        }
    }

    public zn f() {
        return new zn(this.y);
    }

    public final void fb(long j, long j4) {
        Long l3 = this.f1732f.get(Long.valueOf(j4));
        if (l3 == null) {
            this.f1732f.put(Long.valueOf(j4), Long.valueOf(j));
        } else if (l3.longValue() > j) {
            this.f1732f.put(Long.valueOf(j4), Long.valueOf(j));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.z) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        y yVar = (y) message.obj;
        fb(yVar.y, yVar.n3);
        return true;
    }

    public boolean i9(long j) {
        pv.zn znVar = this.f1736t;
        boolean z = false;
        if (!znVar.f7429gv) {
            return false;
        }
        if (this.f1731co) {
            return true;
        }
        Map.Entry<Long, Long> entryV = v(znVar.f7431s);
        if (entryV != null && entryV.getValue().longValue() < j) {
            this.w = entryV.getKey().longValue();
            t();
            z = true;
        }
        if (z) {
            c5();
        }
        return z;
    }

    public void p(pv.zn znVar) {
        this.f1731co = false;
        this.w = -9223372036854775807L;
        this.f1736t = znVar;
        w();
    }

    public final void t() {
        this.f1737v.y(this.w);
    }

    public void tl(a aVar) {
        this.f1734p = true;
    }

    @Nullable
    public final Map.Entry<Long, Long> v(long j) {
        return this.f1732f.ceilingEntry(Long.valueOf(j));
    }

    public final void w() {
        Iterator<Map.Entry<Long, Long>> it = this.f1732f.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f1736t.f7431s) {
                it.remove();
            }
        }
    }

    public boolean wz(boolean z) {
        if (!this.f1736t.f7429gv) {
            return false;
        }
        if (this.f1731co) {
            return true;
        }
        if (!z) {
            return false;
        }
        c5();
        return true;
    }

    public void xc() {
        this.z = true;
        this.f1735s.removeCallbacksAndMessages(null);
    }
}
