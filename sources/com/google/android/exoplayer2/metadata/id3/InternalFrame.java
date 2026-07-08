package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f1619fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1620s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1621v;

    public class y implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f1621v = str;
        this.f1619fb = str2;
        this.f1620s = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return ut.zn(this.f1619fb, internalFrame.f1619fb) && ut.zn(this.f1621v, internalFrame.f1621v) && ut.zn(this.f1620s, internalFrame.f1620s);
    }

    public int hashCode() {
        String str = this.f1621v;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1619fb;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1620s;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.y + ": domain=" + this.f1621v + ", description=" + this.f1619fb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.f1621v);
        parcel.writeString(this.f1620s);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f1621v = (String) ut.i9(parcel.readString());
        this.f1619fb = (String) ut.i9(parcel.readString());
        this.f1620s = (String) ut.i9(parcel.readString());
    }
}
