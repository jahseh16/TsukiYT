package ig;

import b1.ej;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.q;
import ig.c5;
import java.util.Arrays;
import java.util.List;
import k4.r;
import mn.vl;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class s extends c5 {

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f5702wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final byte[] f5701xc = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] w = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean wz(d dVar, byte[] bArr) {
        if (dVar.y() < bArr.length) {
            return false;
        }
        int iA = dVar.a();
        byte[] bArr2 = new byte[bArr.length];
        dVar.t(bArr2, 0, bArr.length);
        dVar.oz(iA);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean xc(d dVar) {
        return wz(dVar, f5701xc);
    }

    @Override // ig.c5
    public long a(d dVar) {
        return zn(vl.v(dVar.v()));
    }

    @Override // ig.c5
    public boolean c5(d dVar, long j, c5.n3 n3Var) throws q {
        if (wz(dVar, f5701xc)) {
            byte[] bArrCopyOf = Arrays.copyOf(dVar.v(), dVar.fb());
            int iZn = vl.zn(bArrCopyOf);
            List<byte[]> listY = vl.y(bArrCopyOf);
            if (n3Var.y != null) {
                return true;
            }
            n3Var.y = new g.n3().o4("audio/opus").a8(iZn).rs(48000).ut(listY).z6();
            return true;
        }
        byte[] bArr = w;
        if (!wz(dVar, bArr)) {
            v0.y.c5(n3Var.y);
            return false;
        }
        v0.y.c5(n3Var.y);
        if (this.f5702wz) {
            return true;
        }
        this.f5702wz = true;
        dVar.ut(bArr.length);
        Metadata metadataZn = ej.zn(r.mg(ej.i9(dVar, false, false).n3));
        if (metadataZn == null) {
            return true;
        }
        n3Var.y = n3Var.y.n3().en(metadataZn.n3(n3Var.y.z)).z6();
        return true;
    }

    @Override // ig.c5
    public void t(boolean z) {
        super.t(z);
        if (z) {
            this.f5702wz = false;
        }
    }
}
