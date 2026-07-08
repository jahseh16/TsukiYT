package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f1612fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f1613s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1614v;

    public class y implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f1614v = str;
        this.f1612fb = str2;
        this.f1613s = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return ut.zn(this.f1612fb, commentFrame.f1612fb) && ut.zn(this.f1614v, commentFrame.f1614v) && ut.zn(this.f1613s, commentFrame.f1613s);
    }

    public int hashCode() {
        String str = this.f1614v;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1612fb;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1613s;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.y + ": language=" + this.f1614v + ", description=" + this.f1612fb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.f1614v);
        parcel.writeString(this.f1613s);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f1614v = (String) ut.i9(parcel.readString());
        this.f1612fb = (String) ut.i9(parcel.readString());
        this.f1613s = (String) ut.i9(parcel.readString());
    }
}
