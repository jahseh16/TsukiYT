package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import v0.d;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1663v;
    public final long y;

    public class y implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }
    }

    public /* synthetic */ TimeSignalCommand(long j, long j4, y yVar) {
        this(j, j4);
    }

    public static long n3(d dVar, long j) {
        long jEj = dVar.ej();
        if ((128 & jEj) != 0) {
            return 8589934591L & ((((jEj & 1) << 32) | dVar.a8()) + j);
        }
        return -9223372036854775807L;
    }

    public static TimeSignalCommand y(d dVar, long j, hw hwVar) {
        long jN3 = n3(dVar, j);
        return new TimeSignalCommand(jN3, hwVar.n3(jN3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.y);
        parcel.writeLong(this.f1663v);
    }

    public TimeSignalCommand(long j, long j4) {
        this.y = j;
        this.f1663v = j4;
    }
}
