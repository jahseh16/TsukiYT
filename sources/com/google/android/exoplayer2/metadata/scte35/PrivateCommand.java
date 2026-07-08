package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final byte[] f1645fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1646v;
    public final long y;

    public class y implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, y yVar) {
        this(parcel);
    }

    public static PrivateCommand y(d dVar, int i, long j) {
        long jA8 = dVar.a8();
        int i5 = i - 4;
        byte[] bArr = new byte[i5];
        dVar.t(bArr, 0, i5);
        return new PrivateCommand(jA8, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.y);
        parcel.writeLong(this.f1646v);
        parcel.writeByteArray(this.f1645fb);
    }

    public PrivateCommand(long j, byte[] bArr, long j4) {
        this.y = j4;
        this.f1646v = j;
        this.f1645fb = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.y = parcel.readLong();
        this.f1646v = parcel.readLong();
        this.f1645fb = (byte[]) ut.i9(parcel.createByteArray());
    }
}
