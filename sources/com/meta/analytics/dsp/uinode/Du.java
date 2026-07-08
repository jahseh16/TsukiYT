package com.meta.analytics.dsp.uinode;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Du {
    public static String[] A0B = {"WSNeg6N0n7AIShfXSzX5HQmTc8kFkZEc", "6rZRvoV62oNyzf", "F27AMpNiqyccCa5EB6sKY7eKfEMSqhrd", "FVKbL9f5FAHwz7hiZMN0u1v1YdCbdeYK", "vVfLkZocD1NxPHhP9fXAXrt0GsgaX4xN", "cFmUa63iy9OAJJOa0jT7jB1cdvdJ4hQa", "2QFrNOOxadMtahUuhILPt16xKsmCtJsL", "J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0543Dt> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Du A02(C0645Hz c0645Hz) {
        long jA0M = c0645Hz.A0M();
        boolean z = (c0645Hz.A0E() & 128) != 0;
        boolean z5 = false;
        boolean z7 = false;
        ArrayList arrayList = new ArrayList();
        int iA0I = 0;
        int iA0E = 0;
        int iA0E2 = 0;
        boolean z8 = false;
        long jA0M2 = -9223372036854775807L;
        if (!z) {
            int iA0E3 = c0645Hz.A0E();
            z5 = (iA0E3 & 128) != 0;
            z7 = (iA0E3 & 64) != 0;
            if (A0B[7].length() != 1) {
                throw new RuntimeException();
            }
            A0B[1] = "02B3CRg7kTq01s";
            boolean z9 = (iA0E3 & 32) != 0;
            jA0M = z7 ? c0645Hz.A0M() : -9223372036854775807L;
            if (!z7) {
                int iA0E4 = c0645Hz.A0E();
                arrayList = new ArrayList(iA0E4);
                for (int i = 0; i < iA0E4; i++) {
                    arrayList.add(new C0543Dt(c0645Hz.A0E(), c0645Hz.A0M(), null));
                }
                String[] strArr = A0B;
                if (strArr[0].charAt(5) == strArr[5].charAt(5)) {
                    A0B[1] = "Wfp3iGqyia9VmI";
                }
            }
            if (z9) {
                long jA0E = c0645Hz.A0E();
                z8 = (128 & jA0E) != 0;
                jA0M2 = (1000 * (((1 & jA0E) << 32) | c0645Hz.A0M())) / 90;
            }
            iA0I = c0645Hz.A0I();
            iA0E = c0645Hz.A0E();
            iA0E2 = c0645Hz.A0E();
        }
        return new Du(jA0M, z, z5, z7, arrayList, jA0M, z8, jA0M2, iA0I, iA0E, iA0E2);
    }

    public Du(long j, boolean z, boolean z5, boolean z7, List<C0543Dt> list, long j4, boolean z8, long j7, int i, int i5, int i8) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z5;
        this.A09 = z7;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j4;
        this.A07 = z8;
        this.A03 = j7;
        this.A02 = i;
        this.A00 = i5;
        this.A01 = i8;
    }

    public Du(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(C0543Dt.A00(parcel));
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static Du A00(Parcel parcel) {
        return new Du(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        byte b4 = this.A07 ? (byte) 1 : (byte) 0;
        if (A0B[1].length() != 14) {
            throw new RuntimeException();
        }
        A0B[1] = "FoD8YYsiaA11j5";
        parcel.writeByte(b4);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
