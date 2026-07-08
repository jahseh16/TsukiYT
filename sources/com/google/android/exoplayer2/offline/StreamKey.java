package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f1670fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public final int f1671s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1672v;
    public final int y;

    public class y implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }
    }

    public StreamKey(int i, int i5, int i8) {
        this.y = i;
        this.f1672v = i5;
        this.f1670fb = i8;
        this.f1671s = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.y == streamKey.y && this.f1672v == streamKey.f1672v && this.f1670fb == streamKey.f1670fb;
    }

    public int hashCode() {
        return (((this.y * 31) + this.f1672v) * 31) + this.f1670fb;
    }

    public String toString() {
        return this.y + "." + this.f1672v + "." + this.f1670fb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeInt(this.f1672v);
        parcel.writeInt(this.f1670fb);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i = this.y - streamKey.y;
        if (i != 0) {
            return i;
        }
        int i5 = this.f1672v - streamKey.f1672v;
        return i5 == 0 ? this.f1670fb - streamKey.f1670fb : i5;
    }

    public StreamKey(Parcel parcel) {
        this.y = parcel.readInt();
        this.f1672v = parcel.readInt();
        int i = parcel.readInt();
        this.f1670fb = i;
        this.f1671s = i;
    }
}
