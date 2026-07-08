package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final byte[] f1627fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1628v;

    public class y implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f1628v = str;
        this.f1627fb = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return ut.zn(this.f1628v, privFrame.f1628v) && Arrays.equals(this.f1627fb, privFrame.f1627fb);
    }

    public int hashCode() {
        String str = this.f1628v;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f1627fb);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.y + ": owner=" + this.f1628v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1628v);
        parcel.writeByteArray(this.f1627fb);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f1628v = (String) ut.i9(parcel.readString());
        this.f1627fb = (byte[]) ut.i9(parcel.createByteArray());
    }
}
