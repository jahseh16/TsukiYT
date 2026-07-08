package com.facebook.ads.internal.exoplayer2.thirdparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo;
import com.meta.analytics.dsp.uinode.IF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Format implements Parcelable {
    public static byte[] A0R;
    public static String[] A0S = {"GkCJdc4gcEDyhSrmAvmdIhMcpgWdcGAD", "P7wJti8h4DQilFv1", "JfTD4DJXTv4PkONbD5mKaVW4fPbL8TvR", "vxuFoFca8hdNpr1LxNr2zKx53RimwM0h", "bhZpzqqZQOeAHwzqKdvv0PgUhXvz16sV", "CbjUY4sgiKfKafV0T546ZMOdyjpyhZSd", "yWUjvB0PPIH7", "Rw2LdMGLtrNyL7BxoibJQnsrtGr9rdxr"};
    public static final Parcelable.Creator<Format> CREATOR;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final DrmInitData A0H;
    public final Metadata A0I;
    public final ColorInfo A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List<byte[]> A0P;
    public final byte[] A0Q;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public Format(String str, String str2, String str3, String str4, int i, int i5, int i8, int i10, float f3, int i11, float f4, byte[] bArr, int i12, ColorInfo colorInfo, int i13, int i14, int i15, int i16, int i17, int i18, String str5, int i19, long j, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        int i20 = i11;
        float f5 = f4;
        List<byte[]> list2 = list;
        int i21 = i17;
        int i22 = i16;
        this.A0M = str;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A04 = i;
        this.A09 = i5;
        this.A0F = i8;
        this.A08 = i10;
        this.A01 = f3;
        this.A0B = i20 == -1 ? 0 : i20;
        this.A02 = f5 == -1.0f ? 1.0f : f5;
        this.A0Q = bArr;
        this.A0E = i12;
        this.A0J = colorInfo;
        this.A05 = i13;
        this.A0C = i14;
        this.A0A = i15;
        this.A06 = i22 == -1 ? 0 : i22;
        this.A07 = i21 == -1 ? 0 : i21;
        this.A0D = i18;
        this.A0N = str5;
        this.A03 = i19;
        this.A0G = j;
        this.A0P = list2 == null ? Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Format A07(String str, String str2, String str3, int i, int i5, int i8, int i10, List<byte[]> list, DrmInitData drmInitData, int i11, String str4) {
        return A06(str, str2, str3, i, i5, i8, i10, -1, list, drmInitData, i11, str4);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Format A09(String str, String str2, String str3, int i, int i5, String str4, int i8, DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, str4, i8, j, list, drmInitData, null);
    }

    public static String A0C(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0R = new byte[]{-64, -76, -91, -103, -44, -70, -29, -26, -31, -43, -24, -100, -4, -56, 7, -42, -54, 5};
    }

    static {
        A0D();
        CREATOR = new Parcelable.Creator<Format>() { // from class: com.facebook.ads.redexgen.X.9n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Format createFromParcel(Parcel parcel) {
                return new Format(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final Format[] newArray(int i) {
                return new Format[i];
            }
        };
    }

    public Format(Parcel parcel) {
        this.A0M = parcel.readString();
        this.A0L = parcel.readString();
        this.A0O = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        boolean hasProjectionData = IF.A0f(parcel);
        this.A0Q = hasProjectionData ? parcel.createByteArray() : null;
        this.A0E = parcel.readInt();
        this.A0J = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int i = parcel.readInt();
        this.A0P = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            this.A0P.add(parcel.createByteArray());
        }
        this.A0H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.A0I = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public static Format A00(String str, String str2, int i, String str3) {
        return A01(str, str2, i, str3, null);
    }

    public static Format A01(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return A09(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A02(String str, String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static Format A03(String str, String str2, String str3, int i, int i5, int i8, int i10, float f3, List<byte[]> list, int i11, float f4, DrmInitData drmInitData) {
        return A04(str, str2, str3, i, i5, i8, i10, f3, list, i11, f4, null, -1, null, drmInitData);
    }

    public static Format A04(String str, String str2, String str3, int i, int i5, int i8, int i10, float f3, List<byte[]> list, int i11, float f4, byte[] bArr, int i12, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i5, i8, i10, f3, i11, f4, bArr, i12, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A05(String str, String str2, String str3, int i, int i5, int i8, int i10, int i11, int i12, int i13, List<byte[]> list, DrmInitData drmInitData, int i14, String str4, Metadata metadata) {
        return new Format(str, null, str2, str3, i, i5, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i8, i10, i11, i12, i13, i14, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format A06(String str, String str2, String str3, int i, int i5, int i8, int i10, int i11, List<byte[]> initializationData, DrmInitData drmInitData, int i12, String str4) {
        return A05(str, str2, str3, i, i5, i8, i10, i11, -1, -1, initializationData, drmInitData, i12, str4, null);
    }

    public static Format A08(String str, String str2, String str3, int i, int i5, String str4, int i8, DrmInitData drmInitData) {
        return A09(str, str2, str3, i, i5, str4, i8, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A0A(String str, String str2, String str3, int i, int i5, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A0B(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public final int A0E() {
        int i;
        int i5 = this.A0F;
        if (i5 == -1 || (i = this.A08) == -1) {
            return -1;
        }
        return i5 * i;
    }

    public final Format A0F(int i) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, i, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0G(int i, int i5) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i, i5, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0H(long j) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, j, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0I(DrmInitData drmInitData) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, drmInitData, this.A0I);
    }

    public final Format A0J(Metadata metadata) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, metadata);
    }

    public final boolean A0K(Format format) {
        if (this.A0P.size() != format.A0P.size()) {
            return false;
        }
        int i = 0;
        while (true) {
            List<byte[]> list = this.A0P;
            if (A0S[3].charAt(4) == '0') {
                throw new RuntimeException();
            }
            A0S[2] = "uHGTVrJUseEQDWcSJLRyHn1PY5AFGLRu";
            int i5 = list.size();
            if (i < i5) {
                if (!Arrays.equals(this.A0P.get(i), format.A0P.get(i))) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.Format.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 17 * 31;
            String str = this.A0M;
            int result = str == null ? 0 : str.hashCode();
            int result2 = (i + result) * 31;
            String str2 = this.A0L;
            int result3 = (result2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.A0O;
            int result4 = str3 == null ? 0 : str3.hashCode();
            int result5 = (result3 + result4) * 31;
            String str4 = this.A0K;
            int result6 = (result5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            int result7 = this.A04;
            int result8 = (((result6 + result7) * 31) + this.A0F) * 31;
            int result9 = this.A08;
            int result10 = (((result8 + result9) * 31) + this.A05) * 31;
            int result11 = this.A0C;
            int result12 = (result10 + result11) * 31;
            String str5 = this.A0N;
            int result13 = (result12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            int result14 = this.A03;
            int result15 = (result13 + result14) * 31;
            DrmInitData drmInitData = this.A0H;
            int result16 = (result15 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.A0I;
            this.A00 = result16 + (metadata != null ? metadata.hashCode() : 0);
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A0C(5, 7, 69)).append(this.A0M);
        String strA0C = A0C(0, 2, 101);
        return sbAppend.append(strA0C).append(this.A0L).append(strA0C).append(this.A0O).append(strA0C).append(this.A04).append(strA0C).append(this.A0N).append(A0C(2, 3, 74)).append(this.A0F).append(strA0C).append(this.A08).append(strA0C).append(this.A01).append(A0C(14, 4, 123)).append(this.A05).append(strA0C).append(this.A0C).append(A0C(12, 2, 112)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        IF.A0V(parcel, this.A0Q != null);
        byte[] bArr = this.A0Q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0G);
        int i5 = this.A0P.size();
        parcel.writeInt(i5);
        for (int i8 = 0; i8 < i5; i8++) {
            parcel.writeByteArray(this.A0P.get(i8));
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}
