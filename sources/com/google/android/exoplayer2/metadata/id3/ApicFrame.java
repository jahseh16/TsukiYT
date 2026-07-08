package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import ft.qj;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f1597f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String f1598fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1599s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1600v;

    public class y implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }
    }

    public ApicFrame(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.f1600v = str;
        this.f1598fb = str2;
        this.f1599s = i;
        this.f1597f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f1599s == apicFrame.f1599s && ut.zn(this.f1600v, apicFrame.f1600v) && ut.zn(this.f1598fb, apicFrame.f1598fb) && Arrays.equals(this.f1597f, apicFrame.f1597f);
    }

    public int hashCode() {
        int i = (527 + this.f1599s) * 31;
        String str = this.f1600v;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1598fb;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f1597f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void lc(qj.n3 n3Var) {
        n3Var.ud(this.f1597f, this.f1599s);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.y + ": mimeType=" + this.f1600v + ", description=" + this.f1598fb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1600v);
        parcel.writeString(this.f1598fb);
        parcel.writeInt(this.f1599s);
        parcel.writeByteArray(this.f1597f);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f1600v = (String) ut.i9(parcel.readString());
        this.f1598fb = parcel.readString();
        this.f1599s = parcel.readInt();
        this.f1597f = (byte[]) ut.i9(parcel.createByteArray());
    }
}
