package x9;

import b1.tl;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.q;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class y implements zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9171a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f9172fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public x9.n3 f9173gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9174v;
    public final byte[] y = new byte[8];
    public final ArrayDeque<n3> n3 = new ArrayDeque<>();
    public final fb zn = new fb();

    public static final class n3 {
        public final long n3;
        public final int y;

        public n3(int i, long j) {
            this.y = i;
            this.n3 = j;
        }
    }

    public static String fb(tl tlVar, int i) throws IOException {
        if (i == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        byte[] bArr = new byte[i];
        tlVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public final long a(tl tlVar, int i) throws IOException {
        tlVar.readFully(this.y, 0, i);
        long j = 0;
        for (int i5 = 0; i5 < i; i5++) {
            j = (j << 8) | ((long) (this.y[i5] & 255));
        }
        return j;
    }

    public final long gv(tl tlVar) throws IOException {
        tlVar.s();
        while (true) {
            tlVar.z(this.y, 0, 4);
            int iZn = fb.zn(this.y[0]);
            if (iZn != -1 && iZn <= 4) {
                int iY = (int) fb.y(this.y, iZn, false);
                if (this.f9173gv.a(iY)) {
                    tlVar.w(iZn);
                    return iY;
                }
            }
            tlVar.w(1);
        }
    }

    @Override // x9.zn
    public boolean n3(tl tlVar) throws IOException {
        v0.y.c5(this.f9173gv);
        while (true) {
            n3 n3VarPeek = this.n3.peek();
            if (n3VarPeek != null && tlVar.getPosition() >= n3VarPeek.n3) {
                this.f9173gv.y(this.n3.pop().y);
                return true;
            }
            if (this.f9174v == 0) {
                long jGv = this.zn.gv(tlVar, true, false, 4);
                if (jGv == -2) {
                    jGv = gv(tlVar);
                }
                if (jGv == -1) {
                    return false;
                }
                this.f9171a = (int) jGv;
                this.f9174v = 1;
            }
            if (this.f9174v == 1) {
                this.f9172fb = this.zn.gv(tlVar, false, true, 8);
                this.f9174v = 2;
            }
            int iV = this.f9173gv.v(this.f9171a);
            if (iV != 0) {
                if (iV == 1) {
                    long position = tlVar.getPosition();
                    this.n3.push(new n3(this.f9171a, this.f9172fb + position));
                    this.f9173gv.s(this.f9171a, position, this.f9172fb);
                    this.f9174v = 0;
                    return true;
                }
                if (iV == 2) {
                    long j = this.f9172fb;
                    if (j <= 8) {
                        this.f9173gv.gv(this.f9171a, a(tlVar, (int) j));
                        this.f9174v = 0;
                        return true;
                    }
                    throw q.y("Invalid integer size: " + this.f9172fb, null);
                }
                if (iV == 3) {
                    long j4 = this.f9172fb;
                    if (j4 <= 2147483647L) {
                        this.f9173gv.fb(this.f9171a, fb(tlVar, (int) j4));
                        this.f9174v = 0;
                        return true;
                    }
                    throw q.y("String element size: " + this.f9172fb, null);
                }
                if (iV == 4) {
                    this.f9173gv.zn(this.f9171a, (int) this.f9172fb, tlVar);
                    this.f9174v = 0;
                    return true;
                }
                if (iV != 5) {
                    throw q.y("Invalid element type " + iV, null);
                }
                long j7 = this.f9172fb;
                if (j7 == 4 || j7 == 8) {
                    this.f9173gv.n3(this.f9171a, v(tlVar, (int) j7));
                    this.f9174v = 0;
                    return true;
                }
                throw q.y("Invalid float size: " + this.f9172fb, null);
            }
            tlVar.w((int) this.f9172fb);
            this.f9174v = 0;
        }
    }

    public final double v(tl tlVar, int i) throws IOException {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(a(tlVar, i));
    }

    @Override // x9.zn
    public void y() {
        this.f9174v = 0;
        this.n3.clear();
        this.zn.v();
    }

    @Override // x9.zn
    public void zn(x9.n3 n3Var) {
        this.f9173gv = n3Var;
    }
}
