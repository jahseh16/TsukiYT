package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f1607f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f1608fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f1609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Id3Frame[] f1610t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1611v;

    public class y implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z5, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f1611v = str;
        this.f1608fb = z;
        this.f1609s = z5;
        this.f1607f = strArr;
        this.f1610t = id3FrameArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f1608fb == chapterTocFrame.f1608fb && this.f1609s == chapterTocFrame.f1609s && ut.zn(this.f1611v, chapterTocFrame.f1611v) && Arrays.equals(this.f1607f, chapterTocFrame.f1607f) && Arrays.equals(this.f1610t, chapterTocFrame.f1610t);
    }

    public int hashCode() {
        int i = (((527 + (this.f1608fb ? 1 : 0)) * 31) + (this.f1609s ? 1 : 0)) * 31;
        String str = this.f1611v;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1611v);
        parcel.writeByte(this.f1608fb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1609s ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f1607f);
        parcel.writeInt(this.f1610t.length);
        for (Id3Frame id3Frame : this.f1610t) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f1611v = (String) ut.i9(parcel.readString());
        this.f1608fb = parcel.readByte() != 0;
        this.f1609s = parcel.readByte() != 0;
        this.f1607f = (String[]) ut.i9(parcel.createStringArray());
        int i = parcel.readInt();
        this.f1610t = new Id3Frame[i];
        for (int i5 = 0; i5 < i; i5++) {
            this.f1610t[i5] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
