package jn;

import androidx.core.app.NotificationCompat;
import b1.ta;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5854a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f5855c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5856f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f5857fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f5858gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long f5859i9;
    public ta n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5861t;
    public final hx.s y;
    public long zn = -9223372036854775807L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5862v = -1;

    public v(hx.s sVar) {
        this.y = sVar;
    }

    private void v() {
        ta taVar = (ta) v0.y.v(this.n3);
        long j = this.f5856f;
        boolean z = this.f5860s;
        taVar.a(j, z ? 1 : 0, this.f5858gv, 0, null);
        this.f5858gv = 0;
        this.f5856f = -9223372036854775807L;
        this.f5860s = false;
        this.f5861t = false;
    }

    public final void a(d dVar, boolean z) {
        int iA = dVar.a();
        if (((dVar.a8() >> 10) & 63) != 32) {
            dVar.oz(iA);
            this.f5860s = false;
            return;
        }
        int iI9 = dVar.i9();
        int i = (iI9 >> 1) & 1;
        if (!z && i == 0) {
            int i5 = (iI9 >> 2) & 7;
            if (i5 == 1) {
                this.f5854a = 128;
                this.f5857fb = 96;
            } else {
                int i8 = i5 - 2;
                this.f5854a = 176 << i8;
                this.f5857fb = 144 << i8;
            }
        }
        dVar.oz(iA);
        this.f5860s = i == 0;
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        v0.y.c5(this.n3);
        int iA = dVar.a();
        int iYt = dVar.yt();
        boolean z5 = (iYt & UserMetadata.MAX_ATTRIBUTE_SIZE) > 0;
        if ((iYt & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 || (iYt & 504) != 0 || (iYt & 7) != 0) {
            r.c5("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z5) {
            if (this.f5861t && this.f5858gv > 0) {
                v();
            }
            this.f5861t = true;
            if ((dVar.i9() & 252) < 128) {
                r.c5("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                dVar.v()[iA] = 0;
                dVar.v()[iA + 1] = 0;
                dVar.oz(iA);
            }
        } else {
            if (!this.f5861t) {
                r.c5("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int iN3 = hx.v.n3(this.f5862v);
            if (i < iN3) {
                r.c5("RtpH263Reader", ut.rz("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iN3), Integer.valueOf(i)));
                return;
            }
        }
        if (this.f5858gv == 0) {
            a(dVar, this.f5855c5);
            if (!this.f5855c5 && this.f5860s) {
                int i5 = this.f5854a;
                g gVar = this.y.zn;
                if (i5 != gVar.f4779d || this.f5857fb != gVar.f4780ej) {
                    this.n3.y(gVar.n3().s8(this.f5854a).o(this.f5857fb).z6());
                }
                this.f5855c5 = true;
            }
        }
        int iY = dVar.y();
        this.n3.n3(dVar, iY);
        this.f5858gv += iY;
        this.f5856f = tl.y(this.f5859i9, j, this.zn, 90000);
        if (z) {
            v();
        }
        this.f5862v = i;
    }

    @Override // jn.f
    public void n3(long j, int i) {
        v0.y.fb(this.zn == -9223372036854775807L);
        this.zn = j;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.zn = j;
        this.f5858gv = 0;
        this.f5859i9 = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 2);
        this.n3 = taVarA;
        taVarA.y(this.y.zn);
    }
}
