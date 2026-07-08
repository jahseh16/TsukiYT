package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import g4.v;
import java.util.Arrays;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1583f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f1584fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f1585p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1587t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1588v;
    public final int w;
    public final int y;

    public class y implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }
    }

    public PictureFrame(int i, String str, String str2, int i5, int i8, int i10, int i11, byte[] bArr) {
        this.y = i;
        this.f1588v = str;
        this.f1584fb = str2;
        this.f1586s = i5;
        this.f1583f = i8;
        this.f1587t = i10;
        this.w = i11;
        this.f1585p = bArr;
    }

    public static PictureFrame y(d dVar) {
        int iP = dVar.p();
        String strD = dVar.d(dVar.p(), v.y);
        String strTa = dVar.ta(dVar.p());
        int iP2 = dVar.p();
        int iP3 = dVar.p();
        int iP4 = dVar.p();
        int iP5 = dVar.p();
        int iP6 = dVar.p();
        byte[] bArr = new byte[iP6];
        dVar.t(bArr, 0, iP6);
        return new PictureFrame(iP, strD, strTa, iP2, iP3, iP4, iP5, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.y == pictureFrame.y && this.f1588v.equals(pictureFrame.f1588v) && this.f1584fb.equals(pictureFrame.f1584fb) && this.f1586s == pictureFrame.f1586s && this.f1583f == pictureFrame.f1583f && this.f1587t == pictureFrame.f1587t && this.w == pictureFrame.w && Arrays.equals(this.f1585p, pictureFrame.f1585p);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.y) * 31) + this.f1588v.hashCode()) * 31) + this.f1584fb.hashCode()) * 31) + this.f1586s) * 31) + this.f1583f) * 31) + this.f1587t) * 31) + this.w) * 31) + Arrays.hashCode(this.f1585p);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void lc(qj.n3 n3Var) {
        n3Var.ud(this.f1585p, this.y);
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
        return "Picture: mimeType=" + this.f1588v + ", description=" + this.f1584fb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeString(this.f1588v);
        parcel.writeString(this.f1584fb);
        parcel.writeInt(this.f1586s);
        parcel.writeInt(this.f1583f);
        parcel.writeInt(this.f1587t);
        parcel.writeInt(this.w);
        parcel.writeByteArray(this.f1585p);
    }

    public PictureFrame(Parcel parcel) {
        this.y = parcel.readInt();
        this.f1588v = (String) ut.i9(parcel.readString());
        this.f1584fb = (String) ut.i9(parcel.readString());
        this.f1586s = parcel.readInt();
        this.f1583f = parcel.readInt();
        this.f1587t = parcel.readInt();
        this.w = parcel.readInt();
        this.f1585p = (byte[]) ut.i9(parcel.createByteArray());
    }
}
