package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1602f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f1603fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f1605t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1606v;
    public final Id3Frame[] w;

    public class y implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }
    }

    public ChapterFrame(String str, int i, int i5, long j, long j4, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f1606v = str;
        this.f1603fb = i;
        this.f1604s = i5;
        this.f1602f = j;
        this.f1605t = j4;
        this.w = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f1603fb == chapterFrame.f1603fb && this.f1604s == chapterFrame.f1604s && this.f1602f == chapterFrame.f1602f && this.f1605t == chapterFrame.f1605t && ut.zn(this.f1606v, chapterFrame.f1606v) && Arrays.equals(this.w, chapterFrame.w);
    }

    public int hashCode() {
        int i = (((((((527 + this.f1603fb) * 31) + this.f1604s) * 31) + ((int) this.f1602f)) * 31) + ((int) this.f1605t)) * 31;
        String str = this.f1606v;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1606v);
        parcel.writeInt(this.f1603fb);
        parcel.writeInt(this.f1604s);
        parcel.writeLong(this.f1602f);
        parcel.writeLong(this.f1605t);
        parcel.writeInt(this.w.length);
        for (Id3Frame id3Frame : this.w) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f1606v = (String) ut.i9(parcel.readString());
        this.f1603fb = parcel.readInt();
        this.f1604s = parcel.readInt();
        this.f1602f = parcel.readLong();
        this.f1605t = parcel.readLong();
        int i = parcel.readInt();
        this.w = new Id3Frame[i];
        for (int i5 = 0; i5 < i; i5++) {
            this.w[i5] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
