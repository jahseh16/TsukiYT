package nr;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import ft.g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k4.r;
import nr.a;
import os.fb;
import r0.p;
import v0.d;
import v0.hw;
import v0.qn;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends h6.wz {

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final AtomicInteger f6998k5 = new AtomicInteger();

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public r<Integer> f6999a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7000b;
    public final d c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final boolean f7001co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7002d;
    public final boolean d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public volatile boolean f7003ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7004f;

    @Nullable
    public final DrmInitData f3;
    public final boolean fh;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    @Nullable
    public final List<g> f7005i4;
    public f mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public final f f7006mt;
    public final bp.n3 n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final r0.p f7007p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hw f7008r;
    public final gn rz;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7009t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public p f7010ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final Uri f7011tl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public boolean f7012ud;

    @Nullable
    public final r0.tl w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final boolean f7013wz;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7014x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final s f7015x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final int f7016xc;
    public final boolean z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public boolean f7017z6;

    public i9(s sVar, r0.tl tlVar, r0.p pVar, g gVar, boolean z, @Nullable r0.tl tlVar2, @Nullable r0.p pVar2, boolean z5, Uri uri, @Nullable List<g> list, int i, @Nullable Object obj, long j, long j4, long j7, int i5, boolean z7, int i8, boolean z8, boolean z9, hw hwVar, @Nullable DrmInitData drmInitData, @Nullable f fVar, bp.n3 n3Var, d dVar, boolean z10, gn gnVar) {
        super(tlVar, pVar, gVar, i, obj, j, j4, j7);
        this.d0 = z;
        this.f7016xc = i5;
        this.f7000b = z7;
        this.f7009t = i8;
        this.f7007p = pVar2;
        this.w = tlVar2;
        this.f7017z6 = pVar2 != null;
        this.fh = z5;
        this.f7011tl = uri;
        this.f7001co = z9;
        this.f7008r = hwVar;
        this.z = z8;
        this.f7015x4 = sVar;
        this.f7005i4 = list;
        this.f3 = drmInitData;
        this.f7006mt = fVar;
        this.n = n3Var;
        this.c = dVar;
        this.f7013wz = z10;
        this.rz = gnVar;
        this.f6999a8 = r.yt();
        this.f7004f = f6998k5.getAndIncrement();
    }

    public static r0.tl fb(r0.tl tlVar, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return tlVar;
        }
        v0.y.v(bArr2);
        return new y(tlVar, bArr, bArr2);
    }

    public static boolean i4(@Nullable i9 i9Var, Uri uri, os.fb fbVar, a.v vVar, long j) {
        if (i9Var == null) {
            return false;
        }
        if (uri.equals(i9Var.f7011tl) && i9Var.f7012ud) {
            return false;
        }
        return !w(vVar, fbVar) || j + vVar.y.f7213f < i9Var.f5289s;
    }

    public static i9 s(s sVar, r0.tl tlVar, g gVar, long j, os.fb fbVar, a.v vVar, Uri uri, @Nullable List<g> list, int i, @Nullable Object obj, boolean z, co coVar, @Nullable i9 i9Var, @Nullable byte[] bArr, @Nullable byte[] bArr2, boolean z5, gn gnVar) {
        boolean z7;
        r0.tl tlVarFb;
        r0.p pVar;
        boolean z8;
        bp.n3 n3Var;
        d dVar;
        f fVar;
        fb.v vVar2 = vVar.y;
        r0.p pVarY = new p.n3().c5(qn.v(fbVar.y, vVar2.y)).s(vVar2.f7212co).fb(vVar2.z).n3(vVar.f6992gv ? 8 : 0).y();
        boolean z9 = bArr != null;
        r0.tl tlVarFb2 = fb(tlVar, bArr, z9 ? t((String) v0.y.v(vVar2.f7215p)) : null);
        fb.gv gvVar = vVar2.f7219v;
        if (gvVar != null) {
            boolean z10 = bArr2 != null;
            byte[] bArrT = z10 ? t((String) v0.y.v(gvVar.f7215p)) : null;
            z7 = z9;
            pVar = new r0.p(qn.v(fbVar.y, gvVar.y), gvVar.f7212co, gvVar.z);
            tlVarFb = fb(tlVar, bArr2, bArrT);
            z8 = z10;
        } else {
            z7 = z9;
            tlVarFb = null;
            pVar = null;
            z8 = false;
        }
        long j4 = j + vVar2.f7213f;
        long j7 = j4 + vVar2.f7214fb;
        int i5 = fbVar.f7199i9 + vVar2.f7217s;
        if (i9Var != null) {
            r0.p pVar2 = i9Var.f7007p;
            boolean z11 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.y.equals(pVar2.y) && pVar.f7521fb == i9Var.f7007p.f7521fb);
            boolean z12 = uri.equals(i9Var.f7011tl) && i9Var.f7012ud;
            n3Var = i9Var.n;
            dVar = i9Var.c;
            fVar = (z11 && z12 && !i9Var.f7014x && i9Var.f7009t == i5) ? i9Var.mg : null;
        } else {
            n3Var = new bp.n3();
            dVar = new d(10);
            fVar = null;
        }
        return new i9(sVar, tlVarFb2, pVarY, gVar, z7, tlVarFb, pVar, z8, uri, list, i, obj, j4, j7, vVar.n3, vVar.zn, !vVar.f6992gv, i5, vVar2.f7216r, z, coVar.y(i5), vVar2.f7218t, fVar, n3Var, dVar, z5, gnVar);
    }

    public static byte[] t(String str) {
        if (g4.zn.v(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean w(a.v vVar, os.fb fbVar) {
        fb.v vVar2 = vVar.y;
        return vVar2 instanceof fb.n3 ? ((fb.n3) vVar2).f3 || (vVar.zn == 0 && fbVar.zn) : fbVar.zn;
    }

    @Override // h6.wz
    public boolean a() {
        return this.f7012ud;
    }

    public final void c5(r0.tl tlVar, r0.p pVar, boolean z, boolean z5) throws IOException {
        r0.p pVarV;
        long position;
        long j;
        if (z) {
            z = this.f7002d != 0;
            pVarV = pVar;
        } else {
            pVarV = pVar.v(this.f7002d);
        }
        try {
            b1.a aVarR = r(tlVar, pVarV, z5);
            if (z) {
                aVarR.w(this.f7002d);
            }
            while (!this.f7003ej && this.mg.n3(aVarR)) {
                try {
                    try {
                    } catch (EOFException e4) {
                        if ((this.f5288gv.f4781f & 16384) == 0) {
                            throw e4;
                        }
                        this.mg.y();
                        position = aVarR.getPosition();
                        j = pVar.f7521fb;
                    }
                } catch (Throwable th) {
                    this.f7002d = (int) (aVarR.getPosition() - pVar.f7521fb);
                    throw th;
                }
            }
            position = aVarR.getPosition();
            j = pVar.f7521fb;
            this.f7002d = (int) (position - j);
        } finally {
            r0.w.y(tlVar);
        }
    }

    public final void co() throws IOException {
        if (this.f7017z6) {
            v0.y.v(this.w);
            v0.y.v(this.f7007p);
            c5(this.w, this.f7007p, this.fh, false);
            this.f7002d = 0;
            this.f7017z6 = false;
        }
    }

    @Override // r0.ta.v
    public void f() {
        this.f7003ej = true;
    }

    @Override // r0.ta.v
    public void i9() throws IOException {
        f fVar;
        v0.y.v(this.f7010ta);
        if (this.mg == null && (fVar = this.f7006mt) != null && fVar.gv()) {
            this.mg = this.f7006mt;
            this.f7017z6 = false;
        }
        co();
        if (this.f7003ej) {
            return;
        }
        if (!this.z) {
            mt();
        }
        this.f7012ud = !this.f7003ej;
    }

    public final void mt() throws IOException {
        c5(this.f5286c5, this.n3, this.d0, true);
    }

    public boolean p() {
        return this.f7000b;
    }

    public final b1.a r(r0.tl tlVar, r0.p pVar, boolean z) throws IOException {
        long jY = tlVar.y(pVar);
        if (z) {
            try {
                this.f7008r.s(this.f7001co, this.f5287fb);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        b1.a aVar = new b1.a(tlVar, pVar.f7521fb, jY);
        if (this.mg == null) {
            long jZ = z(aVar);
            aVar.s();
            f fVar = this.f7006mt;
            f fVarA = fVar != null ? fVar.a() : this.f7015x4.y(pVar.y, this.f5288gv, this.f7005i4, this.f7008r, tlVar.fb(), aVar, this.rz);
            this.mg = fVarA;
            if (fVarA.v()) {
                this.f7010ta.s8(jZ != -9223372036854775807L ? this.f7008r.n3(jZ) : this.f5287fb);
            } else {
                this.f7010ta.s8(0L);
            }
            this.f7010ta.en();
            this.mg.zn(this.f7010ta);
        }
        this.f7010ta.nf(this.f3);
        return aVar;
    }

    public int tl(int i) {
        v0.y.fb(!this.f7013wz);
        if (i >= this.f6999a8.size()) {
            return 0;
        }
        return this.f6999a8.get(i).intValue();
    }

    public void wz(p pVar, r<Integer> rVar) {
        this.f7010ta = pVar;
        this.f6999a8 = rVar;
    }

    public void x4() {
        this.f7000b = true;
    }

    public void xc() {
        this.f7014x = true;
    }

    public final long z(b1.tl tlVar) throws IOException {
        tlVar.s();
        try {
            this.c.j5(10);
            tlVar.z(this.c.v(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.c.x() != 4801587) {
            return -9223372036854775807L;
        }
        this.c.ut(3);
        int iZ6 = this.c.z6();
        int i = iZ6 + 10;
        if (i > this.c.n3()) {
            byte[] bArrV = this.c.v();
            this.c.j5(i);
            System.arraycopy(bArrV, 0, this.c.v(), 0, 10);
        }
        tlVar.z(this.c.v(), 10, iZ6);
        Metadata metadataV = this.n.v(this.c.v(), iZ6);
        if (metadataV == null) {
            return -9223372036854775807L;
        }
        int iV = metadataV.v();
        for (int i5 = 0; i5 < iV; i5++) {
            Metadata.Entry entryGv = metadataV.gv(i5);
            if (entryGv instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entryGv;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f1628v)) {
                    System.arraycopy(privFrame.f1627fb, 0, this.c.v(), 0, 8);
                    this.c.oz(0);
                    this.c.j(8);
                    return this.c.d0() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }
}
