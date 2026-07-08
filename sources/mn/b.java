package mn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.internal.Code;
import ft.g;
import ft.hk;
import ft.k3;
import ft.u0;
import ft.uo;
import i7.rz;
import i7.t;
import java.nio.ByteBuffer;
import java.util.List;
import mn.i4;
import mn.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class b extends i7.x4 implements v0.i4 {

    /* JADX INFO: renamed from: br, reason: collision with root package name */
    public boolean f6520br;

    /* JADX INFO: renamed from: bv, reason: collision with root package name */
    public boolean f6521bv;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    public boolean f6522fc;

    /* JADX INFO: renamed from: gf, reason: collision with root package name */
    public boolean f6523gf;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final Context f6524i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public final r.y f6525i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public int f6526j3;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    public long f6527nd;

    /* JADX INFO: renamed from: ne, reason: collision with root package name */
    public boolean f6528ne;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public g f6529q;

    /* JADX INFO: renamed from: uo, reason: collision with root package name */
    @Nullable
    public hk.y f6530uo;

    /* JADX INFO: renamed from: vn, reason: collision with root package name */
    public final i4 f6531vn;

    /* JADX INFO: renamed from: wm, reason: collision with root package name */
    @Nullable
    public g f6532wm;

    public static final class n3 {
        public static void y(i4 i4Var, @Nullable Object obj) {
            i4Var.c5(k5.y(obj));
        }
    }

    public final class zn implements i4.zn {
        public zn() {
        }

        @Override // mn.i4.zn
        public void c(int i, long j, long j4) {
            b.this.f6525i3.mg(i, j, j4);
        }

        @Override // mn.i4.zn
        public void fb(long j) {
            b.this.f6525i3.fh(j);
        }

        @Override // mn.i4.zn
        public void fh() {
            b.this.gn();
        }

        @Override // mn.i4.zn
        public void gv(Exception exc) {
            v0.r.gv("MediaCodecAudioRenderer", "Audio sink error", exc);
            b.this.f6525i3.t(exc);
        }

        @Override // mn.i4.zn
        public void onSkipSilenceEnabledChanged(boolean z) {
            b.this.f6525i3.rz(z);
        }

        @Override // mn.i4.zn
        public void rz() {
            if (b.this.f6530uo != null) {
                b.this.f6530uo.n3();
            }
        }

        @Override // mn.i4.zn
        public void t() {
            if (b.this.f6530uo != null) {
                b.this.f6530uo.y();
            }
        }
    }

    public b(Context context, t.n3 n3Var, i7.f3 f3Var, boolean z, @Nullable Handler handler, @Nullable r rVar, i4 i4Var) {
        super(1, n3Var, f3Var, z, 44100.0f);
        this.f6524i2 = context.getApplicationContext();
        this.f6531vn = i4Var;
        this.f6525i3 = new r.y(handler, rVar);
        i4Var.r(new zn());
    }

    public static boolean jr() {
        if (ut.y == 23) {
            String str = ut.f8761gv;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static List<i7.z> k3(i7.f3 f3Var, g gVar, boolean z, i4 i4Var) throws rz.zn {
        i7.z zVarX4;
        String str = gVar.f3;
        if (str == null) {
            return k4.r.yt();
        }
        if (i4Var.n3(gVar) && (zVarX4 = i7.rz.x4()) != null) {
            return k4.r.j(zVarX4);
        }
        List<i7.z> decoderInfos = f3Var.getDecoderInfos(str, z, false);
        String strTl = i7.rz.tl(gVar);
        return strTl == null ? k4.r.rz(decoderInfos) : k4.r.n().i9(decoderInfos).i9(f3Var.getDecoderInfos(strTl, z, false)).f();
    }

    public static boolean r6(String str) {
        if (ut.y < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(ut.zn)) {
            String str2 = ut.n3;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private int zq(i7.z zVar, g gVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zVar.y) || (i = ut.y) >= 24 || (i == 23 && ut.tg(this.f6524i2))) {
            return gVar.n;
        }
        return -1;
    }

    @Override // i7.x4, ft.hk
    public boolean a() {
        return super.a() && this.f6531vn.a();
    }

    @Override // i7.x4, ft.a
    public void a8() {
        super.a8();
        this.f6531vn.play();
    }

    @Override // i7.x4
    public boolean br(g gVar) {
        return this.f6531vn.n3(gVar);
    }

    @Override // i7.x4
    public void cy(Exception exc) {
        v0.r.gv("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f6525i3.f(exc);
    }

    @Override // i7.x4, ft.a
    public void d() {
        this.f6522fc = true;
        this.f6529q = null;
        try {
            this.f6531vn.flush();
            try {
                super.d();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.d();
                throw th;
            } finally {
            }
        }
    }

    @Override // i7.x4, ft.a
    public void ej(long j, boolean z) throws ft.p {
        super.ej(j, z);
        if (this.f6520br) {
            this.f6531vn.w();
        } else {
            this.f6531vn.flush();
        }
        this.f6527nd = j;
        this.f6523gf = true;
        this.f6521bv = true;
    }

    @Override // ft.a, ft.h.n3
    public void f(int i, @Nullable Object obj) throws ft.p {
        if (i == 2) {
            this.f6531vn.setVolume(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.f6531vn.p((v) obj);
            return;
        }
        if (i == 6) {
            this.f6531vn.x4((c) obj);
            return;
        }
        switch (i) {
            case 9:
                this.f6531vn.s(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f6531vn.f(((Integer) obj).intValue());
                break;
            case 11:
                this.f6530uo = (hk.y) obj;
                break;
            case Code.UNIMPLEMENTED /* 12 */:
                if (ut.y >= 23) {
                    n3.y(this.f6531vn, obj);
                }
                break;
            default:
                super.f(i, obj);
                break;
        }
    }

    @Override // ft.hk, ft.ic
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    public void gn() {
        this.f6521bv = true;
    }

    @Override // i7.x4
    public void gq(g gVar, @Nullable MediaFormat mediaFormat) throws ft.p {
        int i;
        g gVar2 = this.f6532wm;
        int[] iArr = null;
        if (gVar2 != null) {
            gVar = gVar2;
        } else if (s8() != null) {
            g gVarZ6 = new g.n3().o4("audio/raw").jz("audio/raw".equals(gVar.f3) ? gVar.f4790ut : (ut.y < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? ut.xg(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).hw(gVar.q9).j5(gVar.f4785k).a8(mediaFormat.getInteger("channel-count")).rs(mediaFormat.getInteger("sample-rate")).z6();
            if (this.f6528ne && gVarZ6.j == 6 && (i = gVar.j) < 6) {
                iArr = new int[i];
                for (int i5 = 0; i5 < gVar.j; i5++) {
                    iArr[i5] = i5;
                }
            }
            gVar = gVarZ6;
        }
        try {
            this.f6531vn.xc(gVar, 0, iArr);
        } catch (i4.y e4) {
            throw f3(e4, e4.format, 5001);
        }
    }

    public int hk(i7.z zVar, g gVar, g[] gVarArr) {
        int iZq = zq(zVar, gVar);
        if (gVarArr.length == 1) {
            return iZq;
        }
        for (g gVar2 : gVarArr) {
            if (zVar.a(gVar, gVar2).f3171gv != 0) {
                iZq = Math.max(iZq, zq(zVar, gVar2));
            }
        }
        return iZq;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat ic(g gVar, String str, int i, float f3) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", gVar.j);
        mediaFormat.setInteger("sample-rate", gVar.oz);
        v0.f3.v(mediaFormat, gVar.c);
        v0.f3.gv(mediaFormat, "max-input-size", i);
        int i5 = ut.y;
        if (i5 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f3 != -1.0f && !jr()) {
                mediaFormat.setFloat("operating-rate", f3);
            }
        }
        if (i5 <= 28 && "audio/ac4".equals(gVar.f3)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i5 >= 24 && this.f6531vn.co(ut.dm(4, gVar.j, gVar.oz)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    @Override // i7.x4, ft.hk
    public boolean isReady() {
        return this.f6531vn.i9() || super.isReady();
    }

    @Override // i7.x4
    public void ix() throws ft.p {
        try {
            this.f6531vn.z();
        } catch (i4.v e4) {
            throw n(e4, e4.format, e4.isRecoverable, 5002);
        }
    }

    @Override // i7.x4
    @Nullable
    public di.c5 l(u0 u0Var) throws ft.p {
        this.f6529q = (g) v0.y.v(u0Var.n3);
        di.c5 c5VarL = super.l(u0Var);
        this.f6525i3.p(this.f6529q, c5VarL);
        return c5VarL;
    }

    @Override // i7.x4
    public t.y m(i7.z zVar, g gVar, @Nullable MediaCrypto mediaCrypto, float f3) {
        this.f6526j3 = hk(zVar, gVar, mg());
        this.f6528ne = r6(zVar.y);
        MediaFormat mediaFormatIc = ic(gVar, zVar.zn, this.f6526j3, f3);
        this.f6532wm = (!"audio/raw".equals(zVar.n3) || "audio/raw".equals(gVar.f3)) ? null : gVar;
        return t.y.y(zVar, mediaFormatIc, gVar, mediaCrypto);
    }

    @Override // i7.x4
    public boolean q5(long j, long j4, @Nullable i7.t tVar, @Nullable ByteBuffer byteBuffer, int i, int i5, int i8, long j7, boolean z, boolean z5, g gVar) throws ft.p {
        v0.y.v(byteBuffer);
        if (this.f6532wm != null && (i5 & 2) != 0) {
            ((i7.t) v0.y.v(tVar)).tl(i, false);
            return true;
        }
        if (z) {
            if (tVar != null) {
                tVar.tl(i, false);
            }
            this.f5542le.f3196a += i8;
            this.f6531vn.n();
            return true;
        }
        try {
            if (!this.f6531vn.wz(byteBuffer, j7, i8)) {
                return false;
            }
            if (tVar != null) {
                tVar.tl(i, false);
            }
            this.f5542le.f3204v += i8;
            return true;
        } catch (i4.n3 e4) {
            throw n(e4, this.f6529q, e4.isRecoverable, 5001);
        } catch (i4.v e5) {
            throw n(e5, gVar, e5.isRecoverable, 5002);
        }
    }

    @Override // i7.x4
    public void qj(String str) {
        this.f6525i3.wz(str);
    }

    @Override // i7.x4
    public void qk(String str, t.y yVar, long j, long j4) {
        this.f6525i3.tl(str, j, j4);
    }

    @Override // i7.x4
    public di.c5 qn(i7.z zVar, g gVar, g gVar2) {
        di.c5 c5VarA = zVar.a(gVar, gVar2);
        int i = c5VarA.f3172v;
        if (zq(zVar, gVar2) > this.f6526j3) {
            i |= 64;
        }
        int i5 = i;
        return new di.c5(zVar.y, gVar, gVar2, i5 != 0 ? 0 : c5VarA.f3171gv, i5);
    }

    @Override // i7.x4
    public List<i7.z> rb(i7.f3 f3Var, g gVar, boolean z) throws rz.zn {
        return i7.rz.r(k3(f3Var, gVar, z, this.f6531vn), gVar);
    }

    @Override // i7.x4, ft.a
    public void ud() {
        try {
            super.ud();
        } finally {
            if (this.f6522fc) {
                this.f6522fc = false;
                this.f6531vn.y();
            }
        }
    }

    @Override // i7.x4
    public int uo(i7.f3 f3Var, g gVar) throws rz.zn {
        boolean z;
        if (!v0.n.xc(gVar.f3)) {
            return k3.y(0);
        }
        int i = ut.y >= 21 ? 32 : 0;
        boolean z5 = true;
        boolean z7 = gVar.u != 0;
        boolean zIm = i7.x4.im(gVar);
        int i5 = 8;
        if (zIm && this.f6531vn.n3(gVar) && (!z7 || i7.rz.x4() != null)) {
            return k3.n3(4, 8, i);
        }
        if ("audio/raw".equals(gVar.f3) && !this.f6531vn.n3(gVar)) {
            return k3.y(1);
        }
        if (!this.f6531vn.n3(ut.dm(2, gVar.j, gVar.oz))) {
            return k3.y(1);
        }
        List<i7.z> listK3 = k3(f3Var, gVar, false, this.f6531vn);
        if (listK3.isEmpty()) {
            return k3.y(1);
        }
        if (!zIm) {
            return k3.y(2);
        }
        i7.z zVar = listK3.get(0);
        boolean zP = zVar.p(gVar);
        if (zP) {
            z5 = zP;
            z = true;
        } else {
            for (int i8 = 1; i8 < listK3.size(); i8++) {
                i7.z zVar2 = listK3.get(i8);
                if (zVar2.p(gVar)) {
                    zVar = zVar2;
                    z = false;
                    break;
                }
            }
            z5 = zP;
            z = true;
        }
        int i10 = z5 ? 4 : 3;
        if (z5 && zVar.z(gVar)) {
            i5 = 16;
        }
        return k3.zn(i10, i5, i, zVar.f5568s ? 64 : 0, z ? 128 : 0);
    }

    @Override // v0.i4
    public uo v() {
        return this.f6531vn.v();
    }

    public final void vc() {
        long jI4 = this.f6531vn.i4(a());
        if (jI4 != Long.MIN_VALUE) {
            if (!this.f6521bv) {
                jI4 = Math.max(this.f6527nd, jI4);
            }
            this.f6527nd = jI4;
            this.f6521bv = false;
        }
    }

    @Override // i7.x4
    public void vp(long j) {
        this.f6531vn.f3(j);
    }

    @Override // i7.x4
    public void w2(di.fb fbVar) {
        if (!this.f6523gf || fbVar.i9()) {
            return;
        }
        if (Math.abs(fbVar.f3178f - this.f6527nd) > 500000) {
            this.f6527nd = fbVar.f3178f;
        }
        this.f6523gf = false;
    }

    @Override // i7.x4
    public void w9() {
        super.w9();
        this.f6531vn.n();
    }

    @Override // i7.x4, ft.a
    public void x() {
        vc();
        this.f6531vn.pause();
        super.x();
    }

    @Override // v0.i4
    public long xc() {
        if (getState() == 2) {
            vc();
        }
        return this.f6527nd;
    }

    @Override // i7.x4
    public float yc(float f3, g gVar, g[] gVarArr) {
        int iMax = -1;
        for (g gVar2 : gVarArr) {
            int i = gVar2.oz;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f3 * iMax;
    }

    @Override // i7.x4, ft.a
    public void z6(boolean z, boolean z5) throws ft.p {
        super.z6(z, z5);
        this.f6525i3.w(this.f5542le);
        if (c().y) {
            this.f6531vn.d0();
        } else {
            this.f6531vn.tl();
        }
        this.f6531vn.mt(rz());
    }

    @Override // v0.i4
    public void zn(uo uoVar) {
        this.f6531vn.zn(uoVar);
    }

    @Override // ft.a, ft.hk
    @Nullable
    public v0.i4 i4() {
        return this;
    }
}
