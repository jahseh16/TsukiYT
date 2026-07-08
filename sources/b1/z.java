package b1;

import androidx.annotation.Nullable;
import b1.x4;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import ft.q;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    public static final class y {

        @Nullable
        public x4 y;

        public y(@Nullable x4 x4Var) {
            this.y = x4Var;
        }
    }

    public static x4.y a(tl tlVar, int i) throws IOException {
        v0.d dVar = new v0.d(i);
        tlVar.readFully(dVar.v(), 0, i);
        return fb(dVar);
    }

    public static void c5(tl tlVar) throws IOException {
        v0.d dVar = new v0.d(4);
        tlVar.readFully(dVar.v(), 0, 4);
        if (dVar.a8() != 1716281667) {
            throw q.y("Failed to read FLAC stream marker.", null);
        }
    }

    public static x4.y fb(v0.d dVar) {
        dVar.ut(1);
        int iX = dVar.x();
        long jA = ((long) dVar.a()) + ((long) iX);
        int i = iX / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                break;
            }
            long jD0 = dVar.d0();
            if (jD0 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i5);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i5);
                break;
            }
            jArrCopyOf[i5] = jD0;
            jArrCopyOf2[i5] = dVar.d0();
            dVar.ut(2);
            i5++;
        }
        dVar.ut((int) (jA - ((long) dVar.a())));
        return new x4.y(jArrCopyOf, jArrCopyOf2);
    }

    @Nullable
    public static Metadata gv(tl tlVar, boolean z) throws IOException {
        tlVar.s();
        long jF = tlVar.f();
        Metadata metadataZn = zn(tlVar, z);
        tlVar.w((int) (tlVar.f() - jF));
        return metadataZn;
    }

    public static List<String> i9(tl tlVar, int i) throws IOException {
        v0.d dVar = new v0.d(i);
        tlVar.readFully(dVar.v(), 0, i);
        dVar.ut(4);
        return Arrays.asList(ej.i9(dVar, false, false).n3);
    }

    public static int n3(tl tlVar) throws IOException {
        tlVar.s();
        v0.d dVar = new v0.d(2);
        tlVar.z(dVar.v(), 0, 2);
        int iYt = dVar.yt();
        if ((iYt >> 2) == 16382) {
            tlVar.s();
            return iYt;
        }
        tlVar.s();
        throw q.y("First frame does not start with sync code.", null);
    }

    public static x4 s(tl tlVar) throws IOException {
        byte[] bArr = new byte[38];
        tlVar.readFully(bArr, 0, 38);
        return new x4(bArr, 4);
    }

    public static boolean v(tl tlVar, y yVar) throws IOException {
        tlVar.s();
        v0.ta taVar = new v0.ta(new byte[4]);
        tlVar.z(taVar.y, 0, 4);
        boolean zFb = taVar.fb();
        int iS = taVar.s(7);
        int iS2 = taVar.s(24) + 4;
        if (iS == 0) {
            yVar.y = s(tlVar);
        } else {
            x4 x4Var = yVar.y;
            if (x4Var == null) {
                throw new IllegalArgumentException();
            }
            if (iS == 3) {
                yVar.y = x4Var.n3(a(tlVar, iS2));
            } else if (iS == 4) {
                yVar.y = x4Var.zn(i9(tlVar, iS2));
            } else if (iS == 6) {
                v0.d dVar = new v0.d(iS2);
                tlVar.readFully(dVar.v(), 0, iS2);
                dVar.ut(4);
                yVar.y = x4Var.y(k4.r.j(PictureFrame.y(dVar)));
            } else {
                tlVar.w(iS2);
            }
        }
        return zFb;
    }

    public static boolean y(tl tlVar) throws IOException {
        v0.d dVar = new v0.d(4);
        tlVar.z(dVar.v(), 0, 4);
        return dVar.a8() == 1716281667;
    }

    @Nullable
    public static Metadata zn(tl tlVar, boolean z) throws IOException {
        Metadata metadataY = new n().y(tlVar, z ? null : bp.n3.n3);
        if (metadataY == null || metadataY.v() == 0) {
            return null;
        }
        return metadataY;
    }
}
