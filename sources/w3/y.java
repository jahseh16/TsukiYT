package w3;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import de.a;
import de.gv;
import java.nio.ByteBuffer;
import v0.d;
import v0.hw;
import v0.ta;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a {
    public hw zn;
    public final d y = new d();
    public final ta n3 = new ta();

    @Override // de.a
    public Metadata n3(gv gvVar, ByteBuffer byteBuffer) {
        hw hwVar = this.zn;
        if (hwVar == null || gvVar.f3170co != hwVar.v()) {
            hw hwVar2 = new hw(gvVar.f3178f);
            this.zn = hwVar2;
            hwVar2.y(gvVar.f3178f - gvVar.f3170co);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.y.o(bArrArray, iLimit);
        this.n3.xc(bArrArray, iLimit);
        this.n3.mt(39);
        long jS = (((long) this.n3.s(1)) << 32) | ((long) this.n3.s(32));
        this.n3.mt(20);
        int iS = this.n3.s(12);
        int iS2 = this.n3.s(8);
        this.y.ut(14);
        Metadata.Entry entryY = iS2 != 0 ? iS2 != 255 ? iS2 != 4 ? iS2 != 5 ? iS2 != 6 ? null : TimeSignalCommand.y(this.y, jS, this.zn) : SpliceInsertCommand.y(this.y, jS, this.zn) : SpliceScheduleCommand.y(this.y) : PrivateCommand.y(this.y, iS, jS) : new SpliceNullCommand();
        return entryY == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entryY);
    }
}
