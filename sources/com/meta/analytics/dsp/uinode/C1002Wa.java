package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1002Wa implements DW {
    public IB A00;
    public final C0645Hz A02 = new C0645Hz();
    public final C0644Hy A01 = new C0644Hy();

    @Override // com.meta.analytics.dsp.uinode.DW
    public final Metadata A51(E3 e32) throws DX {
        if (this.A00 == null || e32.A00 != this.A00.A05()) {
            IB ib = new IB(((C1042Xr) e32).A00);
            this.A00 = ib;
            ib.A06(((C1042Xr) e32).A00 - e32.A00);
        }
        ByteBuffer buffer = e32.A01;
        byte[] bArrArray = buffer.array();
        int iLimit = buffer.limit();
        this.A02.A0b(bArrArray, iLimit);
        this.A01.A0C(bArrArray, iLimit);
        this.A01.A08(39);
        long jA04 = (((long) this.A01.A04(1)) << 32) | ((long) this.A01.A04(32));
        this.A01.A08(20);
        int spliceCommandType = this.A01.A04(12);
        int iA04 = this.A01.A04(8);
        Metadata.Entry spliceNullCommand = null;
        this.A02.A0Z(14);
        switch (iA04) {
            case 0:
                spliceNullCommand = new SpliceNullCommand();
                break;
            case 4:
                spliceNullCommand = SpliceScheduleCommand.A00(this.A02);
                break;
            case 5:
                spliceNullCommand = SpliceInsertCommand.A00(this.A02, jA04, this.A00);
                break;
            case 6:
                spliceNullCommand = TimeSignalCommand.A01(this.A02, jA04, this.A00);
                break;
            case 255:
                spliceNullCommand = PrivateCommand.A00(this.A02, spliceCommandType, jA04);
                break;
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
