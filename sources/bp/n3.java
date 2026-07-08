package bp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import de.a;
import de.gv;
import g4.v;
import g4.zn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import k4.r;
import v0.d;
import v0.ta;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends a {
    public static final y n3 = new y() { // from class: bp.y
        @Override // bp.n3.y
        public final boolean evaluate(int i, int i5, int i8, int i10, int i11) {
            return n3.d0(i, i5, i8, i10, i11);
        }
    };

    @Nullable
    public final y y;

    /* JADX INFO: renamed from: bp.n3$n3, reason: collision with other inner class name */
    public static final class C0041n3 {
        public final boolean n3;
        public final int y;
        public final int zn;

        public C0041n3(int i, boolean z, int i5) {
            this.y = i;
            this.n3 = z;
            this.zn = i5;
        }
    }

    public interface y {
        boolean evaluate(int i, int i5, int i8, int i10, int i11);
    }

    public n3() {
        this(null);
    }

    public static ApicFrame a(d dVar, int i, int i5) {
        int iC;
        String str;
        int iEj = dVar.ej();
        Charset charsetI4 = i4(iEj);
        int i8 = i - 1;
        byte[] bArr = new byte[i8];
        dVar.t(bArr, 0, i8);
        if (i5 == 2) {
            str = "image/" + zn.v(new String(bArr, 0, 3, v.n3));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iC = 2;
        } else {
            iC = c(bArr, 0);
            String strV = zn.v(new String(bArr, 0, iC, v.n3));
            if (strV.indexOf(47) == -1) {
                str = "image/" + strV;
            } else {
                str = strV;
            }
        }
        int i10 = bArr[iC + 1] & 255;
        int i11 = iC + 2;
        int iN = n(bArr, i11, iEj);
        return new ApicFrame(str, new String(bArr, i11, iN - i11, charsetI4), i10, gv(bArr, iN + x4(iEj), i8));
    }

    public static int c(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static ChapterTocFrame c5(d dVar, int i, int i5, boolean z, int i8, @Nullable y yVar) {
        int iA = dVar.a();
        int iC = c(dVar.v(), iA);
        String str = new String(dVar.v(), iA, iC - iA, v.n3);
        dVar.oz(iC + 1);
        int iEj = dVar.ej();
        boolean z5 = (iEj & 2) != 0;
        boolean z7 = (iEj & 1) != 0;
        int iEj2 = dVar.ej();
        String[] strArr = new String[iEj2];
        for (int i10 = 0; i10 < iEj2; i10++) {
            int iA2 = dVar.a();
            int iC2 = c(dVar.v(), iA2);
            strArr[i10] = new String(dVar.v(), iA2, iC2 - iA2, v.n3);
            dVar.oz(iC2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = iA + i;
        while (dVar.a() < i11) {
            Id3Frame id3FrameF = f(i5, dVar, z, i8, yVar);
            if (id3FrameF != null) {
                arrayList.add(id3FrameF);
            }
        }
        return new ChapterTocFrame(str, z5, z7, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    public static TextInformationFrame co(d dVar, int i) {
        if (i < 1) {
            return null;
        }
        int iEj = dVar.ej();
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        dVar.t(bArr, 0, i5);
        int iN = n(bArr, 0, iEj);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iN, i4(iEj)), mt(bArr, iEj, iN + x4(iEj)));
    }

    public static /* synthetic */ boolean d0(int i, int i5, int i8, int i10, int i11) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:91:0x011c, B:159:0x01f4, B:95:0x0127, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:166:0x0112 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame f(int r19, v0.d r20, boolean r21, int r22, @androidx.annotation.Nullable bp.n3.y r23) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.n3.f(int, v0.d, boolean, int, bp.n3$y):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static String f3(int i, int i5, int i8, int i10, int i11) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i5), Integer.valueOf(i8), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i5), Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static BinaryFrame fb(d dVar, int i, String str) {
        byte[] bArr = new byte[i];
        dVar.t(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static int fh(d dVar, int i) {
        byte[] bArrV = dVar.v();
        int iA = dVar.a();
        int i5 = iA;
        while (true) {
            int i8 = i5 + 1;
            if (i8 >= iA + i) {
                return i;
            }
            if ((bArrV[i5] & 255) == 255 && bArrV[i8] == 0) {
                System.arraycopy(bArrV, i5 + 2, bArrV, i8, (i - (i5 - iA)) - 2);
                i--;
            }
            i5 = i8;
        }
    }

    public static byte[] gv(byte[] bArr, int i, int i5) {
        return i5 <= i ? ut.f8757a : Arrays.copyOfRange(bArr, i, i5);
    }

    public static Charset i4(int i) {
        return i != 1 ? i != 2 ? i != 3 ? v.n3 : v.zn : v.f5204gv : v.f5203a;
    }

    @Nullable
    public static CommentFrame i9(d dVar, int i) {
        if (i < 4) {
            return null;
        }
        int iEj = dVar.ej();
        Charset charsetI4 = i4(iEj);
        byte[] bArr = new byte[3];
        dVar.t(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i5 = i - 4;
        byte[] bArr2 = new byte[i5];
        dVar.t(bArr2, 0, i5);
        int iN = n(bArr2, 0, iEj);
        String str2 = new String(bArr2, 0, iN, charsetI4);
        int iX4 = iN + x4(iEj);
        return new CommentFrame(str, str2, w(bArr2, iX4, n(bArr2, iX4, iEj), charsetI4));
    }

    public static r<String> mt(byte[] bArr, int i, int i5) {
        if (i5 >= bArr.length) {
            return r.j(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }
        r.y yVarN = r.n();
        int iN = n(bArr, i5, i);
        while (i5 < iN) {
            yVarN.y(new String(bArr, i5, iN - i5, i4(i)));
            i5 = x4(i) + iN;
            iN = n(bArr, i5, i);
        }
        r<String> rVarF = yVarN.f();
        return rVarF.isEmpty() ? r.j(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING) : rVarF;
    }

    public static int n(byte[] bArr, int i, int i5) {
        int iC = c(bArr, i);
        if (i5 == 0 || i5 == 3) {
            return iC;
        }
        while (iC < bArr.length - 1) {
            if ((iC - i) % 2 == 0 && bArr[iC + 1] == 0) {
                return iC;
            }
            iC = c(bArr, iC + 1);
        }
        return bArr.length;
    }

    @Nullable
    public static TextInformationFrame p(d dVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iEj = dVar.ej();
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        dVar.t(bArr, 0, i5);
        return new TextInformationFrame(str, null, mt(bArr, iEj, 0));
    }

    @Nullable
    public static UrlLinkFrame r(d dVar, int i) {
        if (i < 1) {
            return null;
        }
        int iEj = dVar.ej();
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        dVar.t(bArr, 0, i5);
        int iN = n(bArr, 0, iEj);
        String str = new String(bArr, 0, iN, i4(iEj));
        int iX4 = iN + x4(iEj);
        return new UrlLinkFrame("WXXX", str, w(bArr, iX4, c(bArr, iX4), v.n3));
    }

    public static boolean rz(d dVar, int i, int i5, boolean z) {
        int iX;
        long jX;
        int iYt;
        int i8;
        int iA = dVar.a();
        while (true) {
            try {
                boolean z5 = true;
                if (dVar.y() < i5) {
                    dVar.oz(iA);
                    return true;
                }
                if (i >= 3) {
                    iX = dVar.p();
                    jX = dVar.a8();
                    iYt = dVar.yt();
                } else {
                    iX = dVar.x();
                    jX = dVar.x();
                    iYt = 0;
                }
                if (iX == 0 && jX == 0 && iYt == 0) {
                    dVar.oz(iA);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jX) != 0) {
                        dVar.oz(iA);
                        return false;
                    }
                    jX = (((jX >> 24) & 255) << 21) | (jX & 255) | (((jX >> 8) & 255) << 7) | (((jX >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i8 = (iYt & 64) != 0 ? 1 : 0;
                    if ((iYt & 1) == 0) {
                        z5 = false;
                    }
                } else {
                    if (i == 3) {
                        i8 = (iYt & 32) != 0 ? 1 : 0;
                        if ((iYt & 128) == 0) {
                        }
                    } else {
                        i8 = 0;
                    }
                    z5 = false;
                }
                if (z5) {
                    i8 += 4;
                }
                if (jX < i8) {
                    dVar.oz(iA);
                    return false;
                }
                if (dVar.y() < jX) {
                    dVar.oz(iA);
                    return false;
                }
                dVar.ut((int) jX);
            } catch (Throwable th) {
                dVar.oz(iA);
                throw th;
            }
        }
    }

    public static ChapterFrame s(d dVar, int i, int i5, boolean z, int i8, @Nullable y yVar) {
        int iA = dVar.a();
        int iC = c(dVar.v(), iA);
        String str = new String(dVar.v(), iA, iC - iA, v.n3);
        dVar.oz(iC + 1);
        int iP = dVar.p();
        int iP2 = dVar.p();
        long jA8 = dVar.a8();
        long j = jA8 == 4294967295L ? -1L : jA8;
        long jA82 = dVar.a8();
        long j4 = jA82 == 4294967295L ? -1L : jA82;
        ArrayList arrayList = new ArrayList();
        int i10 = iA + i;
        while (dVar.a() < i10) {
            Id3Frame id3FrameF = f(i5, dVar, z, i8, yVar);
            if (id3FrameF != null) {
                arrayList.add(id3FrameF);
            }
        }
        return new ChapterFrame(str, iP, iP2, j, j4, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static GeobFrame t(d dVar, int i) {
        int iEj = dVar.ej();
        Charset charsetI4 = i4(iEj);
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        dVar.t(bArr, 0, i5);
        int iC = c(bArr, 0);
        String str = new String(bArr, 0, iC, v.n3);
        int i8 = iC + 1;
        int iN = n(bArr, i8, iEj);
        String strW = w(bArr, i8, iN, charsetI4);
        int iX4 = iN + x4(iEj);
        int iN2 = n(bArr, iX4, iEj);
        return new GeobFrame(str, strW, w(bArr, iX4, iN2, charsetI4), gv(bArr, iN2 + x4(iEj), i5));
    }

    @Nullable
    public static C0041n3 tl(d dVar) {
        boolean z = false;
        if (dVar.y() < 10) {
            v0.r.c5("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iX = dVar.x();
        if (iX != 4801587) {
            v0.r.c5("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iX)));
            return null;
        }
        int iEj = dVar.ej();
        dVar.ut(1);
        int iEj2 = dVar.ej();
        int iZ6 = dVar.z6();
        if (iEj == 2) {
            if ((iEj2 & 64) != 0) {
                v0.r.c5("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iEj == 3) {
            if ((iEj2 & 64) != 0) {
                int iP = dVar.p();
                dVar.ut(iP);
                iZ6 -= iP + 4;
            }
        } else {
            if (iEj != 4) {
                v0.r.c5("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iEj);
                return null;
            }
            if ((iEj2 & 64) != 0) {
                int iZ62 = dVar.z6();
                dVar.ut(iZ62 - 4);
                iZ6 -= iZ62;
            }
            if ((iEj2 & 16) != 0) {
                iZ6 -= 10;
            }
        }
        if (iEj < 4 && (iEj2 & 128) != 0) {
            z = true;
        }
        return new C0041n3(iEj, z, iZ6);
    }

    public static String w(byte[] bArr, int i, int i5, Charset charset) {
        return (i5 <= i || i5 > bArr.length) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : new String(bArr, i, i5 - i, charset);
    }

    public static MlltFrame wz(d dVar, int i) {
        int iYt = dVar.yt();
        int iX = dVar.x();
        int iX2 = dVar.x();
        int iEj = dVar.ej();
        int iEj2 = dVar.ej();
        ta taVar = new ta();
        taVar.tl(dVar);
        int i5 = ((i - 10) * 8) / (iEj + iEj2);
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        for (int i8 = 0; i8 < i5; i8++) {
            int iS = taVar.s(iEj);
            int iS2 = taVar.s(iEj2);
            iArr[i8] = iS;
            iArr2[i8] = iS2;
        }
        return new MlltFrame(iYt, iX, iX2, iArr, iArr2);
    }

    public static int x4(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static PrivFrame xc(d dVar, int i) {
        byte[] bArr = new byte[i];
        dVar.t(bArr, 0, i);
        int iC = c(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iC, v.n3), gv(bArr, iC + 1, i));
    }

    public static UrlLinkFrame z(d dVar, int i, String str) {
        byte[] bArr = new byte[i];
        dVar.t(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, c(bArr, 0), v.n3));
    }

    @Override // de.a
    @Nullable
    public Metadata n3(gv gvVar, ByteBuffer byteBuffer) {
        return v(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    public Metadata v(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        d dVar = new d(bArr, i);
        C0041n3 c0041n3Tl = tl(dVar);
        if (c0041n3Tl == null) {
            return null;
        }
        int iA = dVar.a();
        int i5 = c0041n3Tl.y == 2 ? 6 : 10;
        int iFh = c0041n3Tl.zn;
        if (c0041n3Tl.n3) {
            iFh = fh(dVar, c0041n3Tl.zn);
        }
        dVar.j(iA + iFh);
        boolean z = false;
        if (!rz(dVar, c0041n3Tl.y, i5, false)) {
            if (c0041n3Tl.y != 4 || !rz(dVar, 4, i5, true)) {
                v0.r.c5("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c0041n3Tl.y);
                return null;
            }
            z = true;
        }
        while (dVar.y() >= i5) {
            Id3Frame id3FrameF = f(c0041n3Tl.y, dVar, z, i5, this.y);
            if (id3FrameF != null) {
                arrayList.add(id3FrameF);
            }
        }
        return new Metadata(arrayList);
    }

    public n3(@Nullable y yVar) {
        this.y = yVar;
    }
}
