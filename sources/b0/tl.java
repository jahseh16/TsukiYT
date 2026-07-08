package b0;

import b1.c;
import b1.d0;
import b1.ta;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import ft.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class tl implements b1.t {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f1233c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public b1.wz f1235fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final g f1236gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ta f1238s;
    public final i9 y;
    public final gv n3 = new gv();
    public final d zn = new d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<Long> f1239v = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f1232a = new ArrayList();

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f1237i9 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1234f = -9223372036854775807L;

    public tl(i9 i9Var, g gVar) {
        this.y = i9Var;
        this.f1236gv = gVar.n3().o4("text/x-exoplayer-cues").x(gVar.f3).z6();
    }

    public final boolean a(b1.tl tlVar) throws IOException {
        return tlVar.wz((tlVar.getLength() > (-1L) ? 1 : (tlVar.getLength() == (-1L) ? 0 : -1)) != 0 ? n4.a.gv(tlVar.getLength()) : UserMetadata.MAX_ATTRIBUTE_SIZE) == -1;
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, d0 d0Var) throws di.a, IOException {
        int i = this.f1237i9;
        v0.y.fb((i == 0 || i == 5) ? false : true);
        if (this.f1237i9 == 1) {
            this.zn.j5(tlVar.getLength() != -1 ? n4.a.gv(tlVar.getLength()) : UserMetadata.MAX_ATTRIBUTE_SIZE);
            this.f1233c5 = 0;
            this.f1237i9 = 2;
        }
        if (this.f1237i9 == 2 && v(tlVar)) {
            n3();
            s();
            this.f1237i9 = 4;
        }
        if (this.f1237i9 == 3 && a(tlVar)) {
            s();
            this.f1237i9 = 4;
        }
        return this.f1237i9 == 4 ? -1 : 0;
    }

    @Override // b1.t
    public boolean gv(b1.tl tlVar) throws IOException {
        return true;
    }

    public final void n3() throws di.a, IOException {
        try {
            wz wzVarGv = this.y.gv();
            while (wzVarGv == null) {
                Thread.sleep(5L);
                wzVarGv = this.y.gv();
            }
            wzVarGv.mt(this.f1233c5);
            wzVarGv.f3179fb.put(this.zn.v(), 0, this.f1233c5);
            wzVarGv.f3179fb.limit(this.f1233c5);
            this.y.zn(wzVarGv);
            xc xcVarN3 = this.y.n3();
            while (xcVarN3 == null) {
                Thread.sleep(5L);
                xcVarN3 = this.y.n3();
            }
            for (int i = 0; i < xcVarN3.gv(); i++) {
                byte[] bArrY = this.n3.y(xcVarN3.n3(xcVarN3.zn(i)));
                this.f1239v.add(Long.valueOf(xcVarN3.zn(i)));
                this.f1232a.add(new d(bArrY));
            }
            xcVarN3.p();
        } catch (f e4) {
            throw q.y("SubtitleDecoder failed.", e4);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @Override // b1.t
    public void release() {
        if (this.f1237i9 == 5) {
            return;
        }
        this.y.release();
        this.f1237i9 = 5;
    }

    public final void s() {
        v0.y.c5(this.f1238s);
        v0.y.fb(this.f1239v.size() == this.f1232a.size());
        long j = this.f1234f;
        for (int iA = j == -9223372036854775807L ? 0 : ut.a(this.f1239v, Long.valueOf(j), true, true); iA < this.f1232a.size(); iA++) {
            d dVar = this.f1232a.get(iA);
            dVar.oz(0);
            int length = dVar.v().length;
            this.f1238s.n3(dVar, length);
            this.f1238s.a(this.f1239v.get(iA).longValue(), 1, length, 0, null);
        }
    }

    public final boolean v(b1.tl tlVar) throws IOException {
        int iN3 = this.zn.n3();
        int i = this.f1233c5;
        if (iN3 == i) {
            this.zn.zn(i + UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        int i5 = tlVar.read(this.zn.v(), this.f1233c5, this.zn.n3() - this.f1233c5);
        if (i5 != -1) {
            this.f1233c5 += i5;
        }
        long length = tlVar.getLength();
        return (length != -1 && ((long) this.f1233c5) == length) || i5 == -1;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        int i = this.f1237i9;
        v0.y.fb((i == 0 || i == 5) ? false : true);
        this.f1234f = j4;
        if (this.f1237i9 == 2) {
            this.f1237i9 = 1;
        }
        if (this.f1237i9 == 4) {
            this.f1237i9 = 3;
        }
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        v0.y.fb(this.f1237i9 == 0);
        this.f1235fb = wzVar;
        this.f1238s = wzVar.a(0, 3);
        this.f1235fb.p();
        this.f1235fb.z(new c(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f1238s.y(this.f1236gv);
        this.f1237i9 = 1;
    }
}
