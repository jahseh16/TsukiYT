package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1622f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f1623fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f1625t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1626v;

    public class y implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }
    }

    public MlltFrame(int i, int i5, int i8, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f1626v = i;
        this.f1623fb = i5;
        this.f1624s = i8;
        this.f1622f = iArr;
        this.f1625t = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f1626v == mlltFrame.f1626v && this.f1623fb == mlltFrame.f1623fb && this.f1624s == mlltFrame.f1624s && Arrays.equals(this.f1622f, mlltFrame.f1622f) && Arrays.equals(this.f1625t, mlltFrame.f1625t);
    }

    public int hashCode() {
        return ((((((((527 + this.f1626v) * 31) + this.f1623fb) * 31) + this.f1624s) * 31) + Arrays.hashCode(this.f1622f)) * 31) + Arrays.hashCode(this.f1625t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1626v);
        parcel.writeInt(this.f1623fb);
        parcel.writeInt(this.f1624s);
        parcel.writeIntArray(this.f1622f);
        parcel.writeIntArray(this.f1625t);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f1626v = parcel.readInt();
        this.f1623fb = parcel.readInt();
        this.f1624s = parcel.readInt();
        this.f1622f = (int[]) ut.i9(parcel.createIntArray());
        this.f1625t = (int[]) ut.i9(parcel.createIntArray());
    }
}
