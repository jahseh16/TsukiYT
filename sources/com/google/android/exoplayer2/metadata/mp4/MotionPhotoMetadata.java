package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import n4.s;

/* JADX INFO: loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1637f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f1638fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f1639s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1640v;
    public final long y;

    public class y implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, y yVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.y == motionPhotoMetadata.y && this.f1640v == motionPhotoMetadata.f1640v && this.f1638fb == motionPhotoMetadata.f1638fb && this.f1639s == motionPhotoMetadata.f1639s && this.f1637f == motionPhotoMetadata.f1637f;
    }

    public int hashCode() {
        return ((((((((527 + s.zn(this.y)) * 31) + s.zn(this.f1640v)) * 31) + s.zn(this.f1638fb)) * 31) + s.zn(this.f1639s)) * 31) + s.zn(this.f1637f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void lc(qj.n3 n3Var) {
        de.y.zn(this, n3Var);
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
        return "Motion photo metadata: photoStartPosition=" + this.y + ", photoSize=" + this.f1640v + ", photoPresentationTimestampUs=" + this.f1638fb + ", videoStartPosition=" + this.f1639s + ", videoSize=" + this.f1637f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.y);
        parcel.writeLong(this.f1640v);
        parcel.writeLong(this.f1638fb);
        parcel.writeLong(this.f1639s);
        parcel.writeLong(this.f1637f);
    }

    public MotionPhotoMetadata(long j, long j4, long j7, long j8, long j9) {
        this.y = j;
        this.f1640v = j4;
        this.f1638fb = j7;
        this.f1639s = j8;
        this.f1637f = j9;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.y = parcel.readLong();
        this.f1640v = parcel.readLong();
        this.f1638fb = parcel.readLong();
        this.f1639s = parcel.readLong();
        this.f1637f = parcel.readLong();
    }
}
