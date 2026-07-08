package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.gv;
import com.google.android.exoplayer2.source.dash.v;
import com.google.android.exoplayer2.source.dash.y;
import ft.q;
import ft.rb;
import ft.xb;
import ft.xq;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pv.i9;
import pv.mt;
import r0.d;
import r0.mg;
import r0.n;
import r0.o;
import r0.ta;
import r0.tl;
import r0.z6;
import ur.b;
import ur.c;
import ur.c5;
import ur.d0;
import ur.i4;
import ur.mg;
import ur.t;
import v0.ut;
import v0.x;
import v5.r;

/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends ur.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1673b;
    public final mg c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final boolean f1674co;
    public long ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b.y f1675d;
    public final sd.n3 d0;
    public long dm;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public long f1676eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final z6.y<? extends pv.zn> f1677ej;
    public xb.fb en;
    public final c5 f3;
    public Handler f7;
    public final long fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final SparseArray<com.google.android.exoplayer2.source.dash.n3> f1678hw;
    public final d j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final Runnable f1679j5;
    public Uri jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IOException f1680k;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public int f1681lc;
    public final com.google.android.exoplayer2.drm.a n;
    public final v.n3 o;
    public long o4;
    public tl oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xb f1682p;

    @Nullable
    public o q9;
    public final Runnable qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y.InterfaceC0052y f1683r;
    public int rs;
    public Uri u;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public ta f1684ut;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v f1685x;
    public boolean xg;
    public pv.zn y5;
    public final tl.y z;

    public static final class Factory implements mg.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1686a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public z6.y<? extends pv.zn> f1687fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public c5 f1688gv;

        @Nullable
        public final tl.y n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public r0.mg f1689v;
        public final y.InterfaceC0052y y;
        public r zn;

        public Factory(tl.y yVar) {
            this(new gv.y(yVar), yVar);
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Factory n3(r rVar) {
            this.zn = (r) v0.y.a(rVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
        public Factory zn(r0.mg mgVar) {
            this.f1689v = (r0.mg) v0.y.a(mgVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public DashMediaSource y(xb xbVar) {
            v0.y.v(xbVar.f5080v);
            z6.y aVar = this.f1687fb;
            if (aVar == null) {
                aVar = new pv.a();
            }
            List<StreamKey> list = xbVar.f5080v.f5122gv;
            return new DashMediaSource(xbVar, null, this.n3, !list.isEmpty() ? new np.n3(aVar, list) : aVar, this.y, this.f1688gv, this.zn.y(xbVar), this.f1689v, this.f1686a, null);
        }

        public Factory s(@Nullable z6.y<? extends pv.zn> yVar) {
            this.f1687fb = yVar;
            return this;
        }

        public DashMediaSource v(pv.zn znVar, xb xbVar) {
            v0.y.y(!znVar.f7429gv);
            xb.zn znVarV = xbVar.n3().v("application/dash+xml");
            if (xbVar.f5080v == null) {
                znVarV.s(Uri.EMPTY);
            }
            xb xbVarY = znVarV.y();
            return new DashMediaSource(xbVarY, znVar, null, null, this.y, this.f1688gv, this.zn.y(xbVarY), this.f1689v, this.f1686a, null);
        }

        public Factory(y.InterfaceC0052y interfaceC0052y, @Nullable tl.y yVar) {
            this.y = (y.InterfaceC0052y) v0.y.v(interfaceC0052y);
            this.n3 = yVar;
            this.zn = new com.google.android.exoplayer2.drm.zn();
            this.f1689v = new n();
            this.f1686a = 30000L;
            this.f1688gv = new t();
        }
    }

    public final class a implements d {
        public a() {
        }

        @Override // r0.d
        public void n3() throws IOException {
            DashMediaSource.this.f1684ut.n3();
            y();
        }

        public final void y() throws IOException {
            if (DashMediaSource.this.f1680k != null) {
                throw DashMediaSource.this.f1680k;
            }
        }
    }

    public final class fb implements ta.n3<z6<Long>> {
        public fb() {
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void xc(z6<Long> z6Var, long j, long j4) {
            DashMediaSource.this.qk(z6Var, j, j4);
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void j5(z6<Long> z6Var, long j, long j4, boolean z) {
            DashMediaSource.this.wf(z6Var, j, j4);
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public ta.zn fh(z6<Long> z6Var, long j, long j4, IOException iOException, int i) {
            return DashMediaSource.this.qj(z6Var, j, j4, iOException);
        }

        public /* synthetic */ fb(DashMediaSource dashMediaSource, y yVar) {
            this();
        }
    }

    public static final class gv implements z6.y<Long> {
        public static final Pattern y = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // r0.z6.y
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public Long y(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, g4.v.zn)).readLine();
            try {
                Matcher matcher = y.matcher(line);
                if (!matcher.matches()) {
                    throw q.gv("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j4 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * (((j4 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e4) {
                throw q.gv(null, e4);
            }
        }
    }

    public static final class n3 extends xq {
        public final xb c;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final int f1690co;

        @Nullable
        public final xb.fb d0;
        public final long f3;
        public final pv.zn n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f1691p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final long f1692r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f1693t;
        public final long w;
        public final long z;

        public n3(long j, long j4, long j7, int i, long j8, long j9, long j10, pv.zn znVar, xb xbVar, @Nullable xb.fb fbVar) {
            v0.y.fb(znVar.f7429gv == (fbVar != null));
            this.f1693t = j;
            this.w = j4;
            this.f1691p = j7;
            this.f1690co = i;
            this.z = j8;
            this.f1692r = j9;
            this.f3 = j10;
            this.n = znVar;
            this.c = xbVar;
            this.d0 = fbVar;
        }

        public static boolean f3(pv.zn znVar) {
            return znVar.f7429gv && znVar.f7434v != -9223372036854775807L && znVar.n3 == -9223372036854775807L;
        }

        @Override // ft.xq
        public int a(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f1690co) >= 0 && iIntValue < tl()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // ft.xq
        public xq.gv co(int i, xq.gv gvVar, long j) {
            v0.y.zn(i, 0, 1);
            long jI4 = i4(j);
            Object obj = xq.gv.f5153ej;
            xb xbVar = this.c;
            pv.zn znVar = this.n;
            return gvVar.c5(obj, xbVar, znVar, this.f1693t, this.w, this.f1691p, true, f3(znVar), this.d0, jI4, this.f1692r, 0, tl() - 1, this.z);
        }

        @Override // ft.xq
        public xq.n3 f(int i, xq.n3 n3Var, boolean z) {
            v0.y.zn(i, 0, tl());
            return n3Var.r(z ? this.n.gv(i).y : null, z ? Integer.valueOf(this.f1690co + i) : null, 0, this.n.fb(i), ut.xb(this.n.gv(i).n3 - this.n.gv(0).n3) - this.z);
        }

        public final long i4(long j) {
            sd.t tVarT;
            long j4 = this.f3;
            if (!f3(this.n)) {
                return j4;
            }
            if (j > 0) {
                j4 += j;
                if (j4 > this.f1692r) {
                    return -9223372036854775807L;
                }
            }
            long j7 = this.z + j4;
            long jFb = this.n.fb(0);
            int i = 0;
            while (i < this.n.v() - 1 && j7 >= jFb) {
                j7 -= jFb;
                i++;
                jFb = this.n.fb(i);
            }
            i9 i9VarGv = this.n.gv(i);
            int iY = i9VarGv.y(2);
            return (iY == -1 || (tVarT = i9VarGv.zn.get(iY).zn.get(0).t()) == null || tVarT.fb(jFb) == 0) ? j4 : (j4 + tVarT.n3(tVarT.a(j7, jFb))) - j7;
        }

        @Override // ft.xq
        public Object p(int i) {
            v0.y.zn(i, 0, tl());
            return Integer.valueOf(this.f1690co + i);
        }

        @Override // ft.xq
        public int tl() {
            return this.n.v();
        }

        @Override // ft.xq
        public int z() {
            return 1;
        }
    }

    public static final class s implements z6.y<Long> {
        public s() {
        }

        @Override // r0.z6.y
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public Long y(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(ut.gq(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ s(y yVar) {
            this();
        }
    }

    public final class v implements ta.n3<z6<pv.zn>> {
        public v() {
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void xc(z6<pv.zn> z6Var, long j, long j4) {
            DashMediaSource.this.ad(z6Var, j, j4);
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void j5(z6<pv.zn> z6Var, long j, long j4, boolean z) {
            DashMediaSource.this.wf(z6Var, j, j4);
        }

        @Override // r0.ta.n3
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public ta.zn fh(z6<pv.zn> z6Var, long j, long j4, IOException iOException, int i) {
            return DashMediaSource.this.cy(z6Var, j, j4, iOException, i);
        }

        public /* synthetic */ v(DashMediaSource dashMediaSource, y yVar) {
            this();
        }
    }

    public class y implements x.n3 {
        public y() {
        }

        @Override // v0.x.n3
        public void n3(IOException iOException) {
            DashMediaSource.this.l(iOException);
        }

        @Override // v0.x.n3
        public void y() {
            DashMediaSource.this.gq(x.s());
        }
    }

    public final class zn implements v.n3 {
        public zn() {
        }

        @Override // com.google.android.exoplayer2.source.dash.v.n3
        public void n3() {
            DashMediaSource.this.xb();
        }

        @Override // com.google.android.exoplayer2.source.dash.v.n3
        public void y(long j) {
            DashMediaSource.this.o0(j);
        }

        public /* synthetic */ zn(DashMediaSource dashMediaSource, y yVar) {
            this();
        }
    }

    static {
        rb.y("goog.exo.dash");
    }

    public /* synthetic */ DashMediaSource(xb xbVar, pv.zn znVar, tl.y yVar, z6.y yVar2, y.InterfaceC0052y interfaceC0052y, c5 c5Var, com.google.android.exoplayer2.drm.a aVar, r0.mg mgVar, long j, y yVar3) {
        this(xbVar, znVar, yVar, yVar2, interfaceC0052y, c5Var, aVar, mgVar, j);
    }

    private static long bk(pv.zn znVar, long j) {
        sd.t tVarT;
        int iV = znVar.v() - 1;
        i9 i9VarGv = znVar.gv(iV);
        long jXb = ut.xb(i9VarGv.n3);
        long jFb = znVar.fb(iV);
        long jXb2 = ut.xb(j);
        long jXb3 = ut.xb(znVar.y);
        long jXb4 = ut.xb(5000L);
        for (int i = 0; i < i9VarGv.zn.size(); i++) {
            List<pv.tl> list = i9VarGv.zn.get(i).zn;
            if (!list.isEmpty() && (tVarT = list.get(0).t()) != null) {
                long jGv = ((jXb3 + jXb) + tVarT.gv(jFb, jXb2)) - jXb2;
                if (jGv < jXb4 - 100000 || (jGv > jXb4 && jGv < jXb4 + 100000)) {
                    jXb4 = jGv;
                }
            }
        }
        return m4.zn.y(jXb4, 1000L, RoundingMode.CEILING);
    }

    public static long g(i9 i9Var, long j, long j4) {
        long jXb = ut.xb(i9Var.n3);
        boolean zTg = tg(i9Var);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < i9Var.zn.size(); i++) {
            pv.y yVar = i9Var.zn.get(i);
            List<pv.tl> list = yVar.zn;
            int i5 = yVar.n3;
            boolean z = (i5 == 1 || i5 == 2) ? false : true;
            if ((!zTg || !z) && !list.isEmpty()) {
                sd.t tVarT = list.get(0).t();
                if (tVarT == null) {
                    return jXb + j;
                }
                long jI9 = tVarT.i9(j, j4);
                if (jI9 == 0) {
                    return jXb;
                }
                long jZn = (tVarT.zn(j, j4) + jI9) - 1;
                jMin = Math.min(jMin, tVarT.y(jZn, j) + tVarT.n3(jZn) + jXb);
            }
        }
        return jMin;
    }

    public static boolean pz(i9 i9Var) {
        for (int i = 0; i < i9Var.zn.size(); i++) {
            sd.t tVarT = i9Var.zn.get(i).zn.get(0).t();
            if (tVarT == null || tVarT.s()) {
                return true;
            }
        }
        return false;
    }

    public static boolean tg(i9 i9Var) {
        for (int i = 0; i < i9Var.zn.size(); i++) {
            int i5 = i9Var.zn.get(i).n3;
            if (i5 == 1 || i5 == 2) {
                return true;
            }
        }
        return false;
    }

    public static long u0(i9 i9Var, long j, long j4) {
        long jXb = ut.xb(i9Var.n3);
        boolean zTg = tg(i9Var);
        long jMax = jXb;
        for (int i = 0; i < i9Var.zn.size(); i++) {
            pv.y yVar = i9Var.zn.get(i);
            List<pv.tl> list = yVar.zn;
            int i5 = yVar.n3;
            boolean z = (i5 == 1 || i5 == 2) ? false : true;
            if ((!zTg || !z) && !list.isEmpty()) {
                sd.t tVarT = list.get(0).t();
                if (tVarT == null) {
                    return jXb;
                }
                if (tVarT.i9(j, j4) == 0) {
                    return jXb;
                }
                jMax = Math.max(jMax, tVarT.n3(tVarT.zn(j, j4)) + jXb);
            }
        }
        return jMax;
    }

    private void vp(boolean z) {
        i9 i9Var;
        long j;
        long j4;
        for (int i = 0; i < this.f1678hw.size(); i++) {
            int iKeyAt = this.f1678hw.keyAt(i);
            if (iKeyAt >= this.f1681lc) {
                this.f1678hw.valueAt(i).b(this.y5, iKeyAt - this.f1681lc);
            }
        }
        i9 i9VarGv = this.y5.gv(0);
        int iV = this.y5.v() - 1;
        i9 i9VarGv2 = this.y5.gv(iV);
        long jFb = this.y5.fb(iV);
        long jXb = ut.xb(ut.y5(this.o4));
        long jU0 = u0(i9VarGv, this.y5.fb(0), jXb);
        long jG = g(i9VarGv2, jFb, jXb);
        boolean z5 = this.y5.f7429gv && !pz(i9VarGv2);
        if (z5) {
            long j7 = this.y5.f7425a;
            if (j7 != -9223372036854775807L) {
                jU0 = Math.max(jU0, jG - ut.xb(j7));
            }
        }
        long j8 = jG - jU0;
        pv.zn znVar = this.y5;
        if (znVar.f7429gv) {
            v0.y.fb(znVar.y != -9223372036854775807L);
            long jXb2 = (jXb - ut.xb(this.y5.y)) - jU0;
            le(jXb2, j8);
            long jGf = this.y5.y + ut.gf(jU0);
            long jXb3 = jXb2 - ut.xb(this.en.y);
            long jMin = Math.min(5000000L, j8 / 2);
            j = jGf;
            j4 = jXb3 < jMin ? jMin : jXb3;
            i9Var = i9VarGv;
        } else {
            i9Var = i9VarGv;
            j = -9223372036854775807L;
            j4 = 0;
        }
        long jXb4 = jU0 - ut.xb(i9Var.n3);
        pv.zn znVar2 = this.y5;
        s8(new n3(znVar2.y, j, this.o4, this.f1681lc, jXb4, j8, j4, znVar2, this.f1682p, znVar2.f7429gv ? this.en : null));
        if (this.f1674co) {
            return;
        }
        this.f7.removeCallbacks(this.qn);
        if (z5) {
            this.f7.postDelayed(this.qn, bk(this.y5, ut.y5(this.o4)));
        }
        if (this.xg) {
            mp();
            return;
        }
        if (z) {
            pv.zn znVar3 = this.y5;
            if (znVar3.f7429gv) {
                long j9 = znVar3.f7434v;
                if (j9 != -9223372036854775807L) {
                    if (j9 == 0) {
                        j9 = 5000;
                    }
                    x5(Math.max(0L, (this.dm + j9) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public void ad(z6<pv.zn> z6Var, long j, long j4) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        this.c.gv(z6Var.y);
        this.f1675d.z(i4Var, z6Var.zn);
        pv.zn znVarZn = z6Var.zn();
        pv.zn znVar = this.y5;
        int iV = znVar == null ? 0 : znVar.v();
        long j7 = znVarZn.gv(0).n3;
        int i = 0;
        while (i < iV && this.y5.gv(i).n3 < j7) {
            i++;
        }
        if (znVarZn.f7429gv) {
            if (iV - i > znVarZn.v()) {
                v0.r.c5("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j8 = this.f1676eb;
                if (j8 == -9223372036854775807L || znVarZn.f7431s * 1000 > j8) {
                    this.rs = 0;
                } else {
                    v0.r.c5("DashMediaSource", "Loaded stale dynamic manifest: " + znVarZn.f7431s + ", " + this.f1676eb);
                }
            }
            int i5 = this.rs;
            this.rs = i5 + 1;
            if (i5 < this.c.zn(z6Var.zn)) {
                x5(y4());
                return;
            } else {
                this.f1680k = new sd.zn();
                return;
            }
        }
        this.y5 = znVarZn;
        this.xg = znVarZn.f7429gv & this.xg;
        this.dm = j - j4;
        this.ct = j;
        synchronized (this.f1673b) {
            try {
                if (z6Var.n3.y == this.jz) {
                    Uri uriGv = this.y5.f7427f;
                    if (uriGv == null) {
                        uriGv = z6Var.gv();
                    }
                    this.jz = uriGv;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iV != 0) {
            this.f1681lc += i;
            vp(true);
            return;
        }
        pv.zn znVar2 = this.y5;
        if (!znVar2.f7429gv) {
            vp(true);
            return;
        }
        mt mtVar = znVar2.f7426c5;
        if (mtVar != null) {
            oa(mtVar);
        } else {
            cr();
        }
    }

    @Override // ur.y
    public void ap() {
        this.xg = false;
        this.oz = null;
        ta taVar = this.f1684ut;
        if (taVar != null) {
            taVar.t();
            this.f1684ut = null;
        }
        this.dm = 0L;
        this.ct = 0L;
        this.y5 = this.f1674co ? this.y5 : null;
        this.jz = this.u;
        this.f1680k = null;
        Handler handler = this.f7;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f7 = null;
        }
        this.o4 = -9223372036854775807L;
        this.rs = 0;
        this.f1676eb = -9223372036854775807L;
        this.f1681lc = 0;
        this.f1678hw.clear();
        this.d0.c5();
        this.n.release();
    }

    @Override // ur.mg
    public xb c() {
        return this.f1682p;
    }

    public final void cr() {
        x.i9(this.f1684ut, new y());
    }

    public ta.zn cy(z6<pv.zn> z6Var, long j, long j4, IOException iOException, int i) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        long jY = this.c.y(new mg.zn(i4Var, new c(z6Var.zn), iOException, i));
        ta.zn znVarS = jY == -9223372036854775807L ? ta.f7549fb : ta.s(false, jY);
        boolean zZn = znVarS.zn();
        this.f1675d.f3(i4Var, z6Var.zn, iOException, !zZn);
        if (!zZn) {
            this.c.gv(z6Var.y);
        }
        return znVarS;
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        com.google.android.exoplayer2.source.dash.n3 n3Var = (com.google.android.exoplayer2.source.dash.n3) d0Var;
        n3Var.ej();
        this.f1678hw.remove(n3Var.y);
    }

    @Override // ur.y
    public void e(@Nullable o oVar) {
        this.q9 = oVar;
        this.n.n3(Looper.myLooper(), nf());
        this.n.prepare();
        if (this.f1674co) {
            vp(false);
            return;
        }
        this.oz = this.z.y();
        this.f1684ut = new ta("DashMediaSource");
        this.f7 = ut.i4();
        mp();
    }

    public final void gq(long j) {
        this.o4 = j;
        vp(true);
    }

    public final void l(IOException iOException) {
        v0.r.gv("DashMediaSource", "Failed to resolve time offset.", iOException);
        vp(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void le(long r18, long r20) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.le(long, long):void");
    }

    public final void mp() {
        Uri uri;
        this.f7.removeCallbacks(this.f1679j5);
        if (this.f1684ut.c5()) {
            return;
        }
        if (this.f1684ut.i9()) {
            this.xg = true;
            return;
        }
        synchronized (this.f1673b) {
            uri = this.jz;
        }
        this.xg = false;
        q5(new z6(this.oz, uri, 4, this.f1677ej), this.f1685x, this.c.zn(4));
    }

    public void o0(long j) {
        long j4 = this.f1676eb;
        if (j4 == -9223372036854775807L || j4 < j) {
            this.f1676eb = j;
        }
    }

    public final void oa(mt mtVar) {
        String str = mtVar.y;
        if (ut.zn(str, "urn:mpeg:dash:utc:direct:2014") || ut.zn(str, "urn:mpeg:dash:utc:direct:2012")) {
            w9(mtVar);
            return;
        }
        if (ut.zn(str, "urn:mpeg:dash:utc:http-iso:2014") || ut.zn(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            w2(mtVar, new gv());
            return;
        }
        if (ut.zn(str, "urn:mpeg:dash:utc:http-xsdate:2014") || ut.zn(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            w2(mtVar, new s(null));
        } else if (ut.zn(str, "urn:mpeg:dash:utc:ntp:2014") || ut.zn(str, "urn:mpeg:dash:utc:ntp:2012")) {
            cr();
        } else {
            l(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // ur.mg
    public void oz() throws IOException {
        this.j.n3();
    }

    public final /* synthetic */ void pq() {
        vp(false);
    }

    public final <T> void q5(z6<T> z6Var, ta.n3<z6<T>> n3Var, int i) {
        this.f1675d.c(new i4(z6Var.y, z6Var.n3, this.f1684ut.wz(z6Var, n3Var, i)), z6Var.zn);
    }

    public ta.zn qj(z6<Long> z6Var, long j, long j4, IOException iOException) {
        this.f1675d.f3(new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y()), z6Var.zn, iOException, true);
        this.c.gv(z6Var.y);
        l(iOException);
        return ta.f7548a;
    }

    public void qk(z6<Long> z6Var, long j, long j4) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        this.c.gv(z6Var.y);
        this.f1675d.z(i4Var, z6Var.zn);
        gq(z6Var.zn().longValue() - j);
    }

    public final void w2(mt mtVar, z6.y<Long> yVar) {
        q5(new z6(this.oz, Uri.parse(mtVar.n3), 5, yVar), new fb(this, null), 1);
    }

    public final void w9(mt mtVar) {
        try {
            gq(ut.gq(mtVar.n3) - this.ct);
        } catch (q e4) {
            l(e4);
        }
    }

    public void wf(z6<?> z6Var, long j, long j4) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        this.c.gv(z6Var.y);
        this.f1675d.p(i4Var, z6Var.zn);
    }

    public final void x5(long j) {
        this.f7.postDelayed(this.f1679j5, j);
    }

    public void xb() {
        this.f7.removeCallbacks(this.qn);
        mp();
    }

    public final long y4() {
        return Math.min((this.rs - 1) * 1000, 5000);
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        int iIntValue = ((Integer) n3Var.y).intValue() - this.f1681lc;
        b.y yVarRs = rs(n3Var, this.y5.gv(iIntValue).n3);
        com.google.android.exoplayer2.source.dash.n3 n3Var3 = new com.google.android.exoplayer2.source.dash.n3(iIntValue + this.f1681lc, this.y5, this.d0, iIntValue, this.f1683r, this.q9, this.n, dm(n3Var), this.c, yVarRs, this.o4, this.j, n3Var2, this.f3, this.o, nf());
        this.f1678hw.put(n3Var3.y, n3Var3);
        return n3Var3;
    }

    public DashMediaSource(xb xbVar, @Nullable pv.zn znVar, @Nullable tl.y yVar, @Nullable z6.y<? extends pv.zn> yVar2, y.InterfaceC0052y interfaceC0052y, c5 c5Var, com.google.android.exoplayer2.drm.a aVar, r0.mg mgVar, long j) {
        this.f1682p = xbVar;
        this.en = xbVar.f5078s;
        this.jz = ((xb.s) v0.y.v(xbVar.f5080v)).y;
        this.u = xbVar.f5080v.y;
        this.y5 = znVar;
        this.z = yVar;
        this.f1677ej = yVar2;
        this.f1683r = interfaceC0052y;
        this.n = aVar;
        this.c = mgVar;
        this.fh = j;
        this.f3 = c5Var;
        this.d0 = new sd.n3();
        boolean z = znVar != null;
        this.f1674co = z;
        y yVar3 = null;
        this.f1675d = o4(null);
        this.f1673b = new Object();
        this.f1678hw = new SparseArray<>();
        this.o = new zn(this, yVar3);
        this.f1676eb = -9223372036854775807L;
        this.o4 = -9223372036854775807L;
        if (!z) {
            this.f1685x = new v(this, yVar3);
            this.j = new a();
            this.f1679j5 = new Runnable() { // from class: sd.gv
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.mp();
                }
            };
            this.qn = new Runnable() { // from class: sd.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.pq();
                }
            };
            return;
        }
        v0.y.fb(true ^ znVar.f7429gv);
        this.f1685x = null;
        this.f1679j5 = null;
        this.qn = null;
        this.j = new d.y();
    }
}
