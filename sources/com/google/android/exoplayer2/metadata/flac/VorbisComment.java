package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1589v;
    public final String y;

    public class y implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }
    }

    public VorbisComment(String str, String str2) {
        this.y = str;
        this.f1589v = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.y.equals(vorbisComment.y) && this.f1589v.equals(vorbisComment.f1589v);
    }

    public int hashCode() {
        return ((527 + this.y.hashCode()) * 31) + this.f1589v.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void lc(qj.n3 n3Var) {
        String str = this.y;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                n3Var.yt(this.f1589v);
                break;
            case "TITLE":
                n3Var.e(this.f1589v);
                break;
            case "DESCRIPTION":
                n3Var.oz(this.f1589v);
                break;
            case "ALBUMARTIST":
                n3Var.k5(this.f1589v);
                break;
            case "ARTIST":
                n3Var.vl(this.f1589v);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ g p() {
        return de.y.n3(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] tg() {
        return de.y.y(this);
    }

    public String toString() {
        return "VC: " + this.y + "=" + this.f1589v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.f1589v);
    }

    public VorbisComment(Parcel parcel) {
        this.y = (String) ut.i9(parcel.readString());
        this.f1589v = (String) ut.i9(parcel.readString());
    }
}
