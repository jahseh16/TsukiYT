package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f1632fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f1633v;

    public class y implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f1633v = str2;
        this.f1632fb = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.y.equals(urlLinkFrame.y) && ut.zn(this.f1633v, urlLinkFrame.f1633v) && ut.zn(this.f1632fb, urlLinkFrame.f1632fb);
    }

    public int hashCode() {
        int iHashCode = (527 + this.y.hashCode()) * 31;
        String str = this.f1633v;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1632fb;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.y + ": url=" + this.f1632fb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.f1633v);
        parcel.writeString(this.f1632fb);
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) ut.i9(parcel.readString()));
        this.f1633v = parcel.readString();
        this.f1632fb = (String) ut.i9(parcel.readString());
    }
}
