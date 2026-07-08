package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.meta.analytics.dsp.uinode.C0539Dp;
import com.meta.analytics.dsp.uinode.C0540Dq;
import com.meta.analytics.dsp.uinode.C0645Hz;
import com.meta.analytics.dsp.uinode.IB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"rwcuqOJ6EdQ67q2Mv0J2HHeiL", "WP4j4wUrwc9dHeO22M7i1JH5Vq97obJg", "mJZdPTUXLZu74", "VLU2rxkJGeQdQarAjhhUo7gMPCvQOQS9", "TorhhvAEpNk7fEbKtUMeNjy7yeYkErzW", "2cgHesvtXq3tKj0PCMbQTWS3l1m9KzOv", "jB5ZWs0uqsLPN", "ipEqGNR1nINtqeP5fHPEDulQW"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C0539Dp();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C0540Dq> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public SpliceInsertCommand(long j, boolean z, boolean z5, boolean z7, boolean z8, long j4, long j7, List<C0540Dq> list, boolean z9, long j8, int i, int i5, int i8) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z5;
        this.A0A = z7;
        this.A0C = z8;
        this.A05 = j4;
        this.A04 = j7;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z9;
        this.A03 = j8;
        this.A02 = i;
        this.A00 = i5;
        this.A01 = i8;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(C0540Dq.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C0539Dp c0539Dp) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C0645Hz c0645Hz, long j, IB ib) {
        long jA0M = c0645Hz.A0M();
        boolean z = (c0645Hz.A0E() & 128) != 0;
        boolean z5 = false;
        boolean outOfNetworkIndicator = false;
        boolean z7 = false;
        long jA00 = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        int iA0I = 0;
        int iA0E = 0;
        int iA0E2 = 0;
        boolean z8 = false;
        long jA0M2 = -9223372036854775807L;
        if (!z) {
            int iA0E3 = c0645Hz.A0E();
            if (A0D[1].charAt(24) == '7') {
                throw new RuntimeException();
            }
            A0D[4] = "wCIdN9eSc7apWAr1IiSVHk4IDh7dTuFq";
            z5 = (iA0E3 & 128) != 0;
            outOfNetworkIndicator = (iA0E3 & 64) != 0;
            boolean autoReturn = (iA0E3 & 32) != 0;
            z7 = (iA0E3 & 16) != 0;
            if (outOfNetworkIndicator && !z7) {
                jA00 = TimeSignalCommand.A00(c0645Hz, j);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c0645Hz.A0E();
                listEmptyList = new ArrayList(componentCount);
                for (int i = 0; i < componentCount; i++) {
                    int componentTag = c0645Hz.A0E();
                    long jA002 = -9223372036854775807L;
                    if (!z7) {
                        jA002 = TimeSignalCommand.A00(c0645Hz, j);
                    }
                    listEmptyList.add(new C0540Dq(componentTag, jA002, ib.A07(jA002), null));
                }
            }
            if (autoReturn) {
                long jA0E = c0645Hz.A0E();
                z8 = (jA0E & 128) != 0;
                jA0M2 = (1000 * (((jA0E & 1) << 32) | c0645Hz.A0M())) / 90;
            }
            iA0I = c0645Hz.A0I();
            iA0E = c0645Hz.A0E();
            iA0E2 = c0645Hz.A0E();
        }
        return new SpliceInsertCommand(jA0M, z, z5, outOfNetworkIndicator, z7, jA00, ib.A07(jA00), listEmptyList, z8, jA0M2, iA0I, iA0E, iA0E2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            List<C0540Dq> list = this.A07;
            if (A0D[3].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[6] = "cIZczz40pT0Gu";
            strArr[2] = "8BKfMUSS1QcQc";
            list.get(i5).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
