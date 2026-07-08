package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f1601v;

    public class y implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f1601v = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.y.equals(binaryFrame.y) && Arrays.equals(this.f1601v, binaryFrame.f1601v);
    }

    public int hashCode() {
        return ((527 + this.y.hashCode()) * 31) + Arrays.hashCode(this.f1601v);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeByteArray(this.f1601v);
    }

    public BinaryFrame(Parcel parcel) {
        super((String) ut.i9(parcel.readString()));
        this.f1601v = (byte[]) ut.i9(parcel.createByteArray());
    }
}
