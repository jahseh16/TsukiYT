package com.meta.analytics.dsp.uinode;

import com.google.protobuf.Reader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HR {
    public static byte[] A05;
    public static String[] A06 = {"j9EfDvchdu1KqySqOAnBSG3JWHZdS12U", "q23SQ5AypNqS8oaKOX4z", "zGl30nZzPzoLIdVG6oXXe73jwI6SvYzS", "XO0PMOb8qpQh9emdWW7Vnqfuo5cp8yJy", "hg0Ynef21ksm7drJYvbGXc6C6VdsLqYq", "sq8Z8cDX36Rb5yN4ZHuInHWL1DTNPmF7", "lpBmIRRiri9NKyd9o68rlNPCbyzvIw2I", "eicGPlwUgu"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C0983Vh A00 = C0983Vh.A04;
    public final TreeSet<C0981Vf> A04 = new TreeSet<>();

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A06[6].charAt(21) != 'N') {
                throw new RuntimeException();
            }
            A06[6] = "ipIPz5SC6v0GmkIAozZhwN70MrudeMSU";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 100);
            i10++;
        }
    }

    public static void A02() {
        byte[] bArr = {-79, -9, -14, -6, -3, -10, -11, -65, -77, 7, 2, -77, 42, 61, 70, 57, 69, 65, 70, 63, -8, 71, 62, -8};
        String[] strArr = A06;
        if (strArr[4].charAt(2) != strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A06[5] = "8leR2nWms8A7PmFgrtQ6nLfJYqb68GHr";
        A05 = bArr;
    }

    static {
        A02();
    }

    public HR(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static HR A00(int i, DataInputStream dataInputStream) throws IOException {
        HR hr = new HR(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long j = dataInputStream.readLong();
            HW hw2 = new HW();
            HV.A05(hw2, j);
            hr.A0F(hw2);
        } else {
            hr.A00 = C0983Vh.A00(dataInputStream);
        }
        return hr;
    }

    public final int A03(int i) {
        int result = this.A02;
        int i5 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i5 + result2;
        if (i < 2) {
            long jA00 = HV.A00(this.A00);
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j, long j4) {
        C0981Vf c0981VfA06 = A06(j);
        if (c0981VfA06.A01()) {
            return -Math.min(c0981VfA06.A02() ? Long.MAX_VALUE : c0981VfA06.A01, j4);
        }
        long j7 = j + j4;
        long jMax = c0981VfA06.A02 + c0981VfA06.A01;
        if (jMax < j7) {
            TreeSet<C0981Vf> treeSet = this.A04;
            if (A06[1].length() != 20) {
                throw new RuntimeException();
            }
            A06[1] = "RgZ5bXDLk5KqdLdfFSHI";
            for (C0981Vf c0981Vf : treeSet.tailSet(c0981VfA06, false)) {
                if (c0981Vf.A02 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, c0981Vf.A02 + c0981Vf.A01);
                if (jMax >= j7) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j4);
    }

    public final C0983Vh A05() {
        return this.A00;
    }

    public final C0981Vf A06(long j) {
        C0981Vf c0981VfA01 = C0981Vf.A01(this.A03, j);
        C0981Vf c0981VfFloor = this.A04.floor(c0981VfA01);
        if (c0981VfFloor != null && c0981VfFloor.A02 + c0981VfFloor.A01 > j) {
            return c0981VfFloor;
        }
        TreeSet<C0981Vf> treeSet = this.A04;
        String[] strArr = A06;
        if (strArr[2].charAt(22) != strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A06[6] = "nd2bgBSeUAsM9albd5et6NmdTACtd3AP";
        C0981Vf lookupSpan = treeSet.ceiling(c0981VfA01);
        if (lookupSpan == null) {
            return C0981Vf.A02(this.A03, j);
        }
        return C0981Vf.A03(this.A03, j, lookupSpan.A02 - j);
    }

    public final C0981Vf A07(C0981Vf c0981Vf) throws HI {
        AbstractC0620Ha.A04(this.A04.remove(c0981Vf));
        C0981Vf c0981VfA08 = c0981Vf.A08(this.A02);
        if (c0981Vf.A03.renameTo(c0981VfA08.A03)) {
            this.A04.add(c0981VfA08);
            return c0981VfA08;
        }
        throw new HI(A01(12, 12, 116) + c0981Vf.A03 + A01(8, 4, 47) + c0981VfA08.A03 + A01(0, 8, 45));
    }

    public final TreeSet<C0981Vf> A08() {
        return this.A04;
    }

    public final void A09(C0981Vf c0981Vf) {
        this.A04.add(c0981Vf);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(HO ho) {
        if (this.A04.remove(ho)) {
            ho.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(HW hw2) {
        C0983Vh c0983Vh = this.A00;
        C0983Vh oldMetadata = this.A00.A08(hw2);
        this.A00 = oldMetadata;
        return !oldMetadata.equals(c0983Vh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HR hr = (HR) obj;
        if (this.A02 == hr.A02 && this.A03.equals(hr.A03) && this.A04.equals(hr.A04) && this.A00.equals(hr.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Reader.READ_DONE);
        int i = result * 31;
        int result2 = this.A04.hashCode();
        return i + result2;
    }
}
