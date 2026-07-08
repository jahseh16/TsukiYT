package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f1615f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f1616fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1617s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1618v;

    public class y implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f1618v = str;
        this.f1616fb = str2;
        this.f1617s = str3;
        this.f1615f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return ut.zn(this.f1618v, geobFrame.f1618v) && ut.zn(this.f1616fb, geobFrame.f1616fb) && ut.zn(this.f1617s, geobFrame.f1617s) && Arrays.equals(this.f1615f, geobFrame.f1615f);
    }

    public int hashCode() {
        String str = this.f1618v;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1616fb;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1617s;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f1615f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.y + ": mimeType=" + this.f1618v + ", filename=" + this.f1616fb + ", description=" + this.f1617s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1618v);
        parcel.writeString(this.f1616fb);
        parcel.writeString(this.f1617s);
        parcel.writeByteArray(this.f1615f);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f1618v = (String) ut.i9(parcel.readString());
        this.f1616fb = (String) ut.i9(parcel.readString());
        this.f1617s = (String) ut.i9(parcel.readString());
        this.f1615f = (byte[]) ut.i9(parcel.createByteArray());
    }
}
