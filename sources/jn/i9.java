package jn;

import b1.ta;
import ft.g;
import java.util.List;
import mn.vl;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5837a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f5838fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5839gv;
    public ta n3;
    public final hx.s y;
    public long zn = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5840v = -1;

    public i9(hx.s sVar) {
        this.y = sVar;
    }

    public static void v(d dVar) {
        int iA = dVar.a();
        v0.y.n3(dVar.fb() > 18, "ID Header has insufficient data");
        v0.y.n3(dVar.ta(8).equals("OpusHead"), "ID Header missing");
        v0.y.n3(dVar.ej() == 1, "version number must always be 1");
        dVar.oz(iA);
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        v0.y.c5(this.n3);
        if (!this.f5837a) {
            v(dVar);
            List<byte[]> listY = vl.y(dVar.v());
            g.n3 n3VarN3 = this.y.zn.n3();
            n3VarN3.ut(listY);
            this.n3.y(n3VarN3.z6());
            this.f5837a = true;
        } else if (this.f5838fb) {
            int iN3 = hx.v.n3(this.f5840v);
            if (i != iN3) {
                r.c5("RtpOpusReader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iN3), Integer.valueOf(i)));
            }
            int iY = dVar.y();
            this.n3.n3(dVar, iY);
            this.n3.a(tl.y(this.f5839gv, j, this.zn, 48000), 1, iY, 0, null);
        } else {
            v0.y.n3(dVar.fb() >= 8, "Comment Header has insufficient data");
            v0.y.n3(dVar.ta(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f5838fb = true;
        }
        this.f5840v = i;
    }

    @Override // jn.f
    public void n3(long j, int i) {
        this.zn = j;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.zn = j;
        this.f5839gv = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 1);
        this.n3 = taVarA;
        taVarA.y(this.y.zn);
    }
}
