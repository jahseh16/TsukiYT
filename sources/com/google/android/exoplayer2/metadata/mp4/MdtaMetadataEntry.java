package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f1634fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1635s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f1636v;
    public final String y;

    public class y implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, y yVar) {
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.y.equals(mdtaMetadataEntry.y) && Arrays.equals(this.f1636v, mdtaMetadataEntry.f1636v) && this.f1634fb == mdtaMetadataEntry.f1634fb && this.f1635s == mdtaMetadataEntry.f1635s;
    }

    public int hashCode() {
        return ((((((527 + this.y.hashCode()) * 31) + Arrays.hashCode(this.f1636v)) * 31) + this.f1634fb) * 31) + this.f1635s;
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
        return "mdta: key=" + this.y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeByteArray(this.f1636v);
        parcel.writeInt(this.f1634fb);
        parcel.writeInt(this.f1635s);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i5) {
        this.y = str;
        this.f1636v = bArr;
        this.f1634fb = i;
        this.f1635s = i5;
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.y = (String) ut.i9(parcel.readString());
        this.f1636v = (byte[]) ut.i9(parcel.createByteArray());
        this.f1634fb = parcel.readInt();
        this.f1635s = parcel.readInt();
    }
}
