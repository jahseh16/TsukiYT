package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String f1595fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f1596v;
    public final byte[] y;

    public class y implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }
    }

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.y = bArr;
        this.f1596v = str;
        this.f1595fb = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.y, ((IcyInfo) obj).y);
    }

    public int hashCode() {
        return Arrays.hashCode(this.y);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void lc(qj.n3 n3Var) {
        String str = this.f1596v;
        if (str != null) {
            n3Var.e(str);
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
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f1596v, this.f1595fb, Integer.valueOf(this.y.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.y);
        parcel.writeString(this.f1596v);
        parcel.writeString(this.f1595fb);
    }

    public IcyInfo(Parcel parcel) {
        this.y = (byte[]) v0.y.v(parcel.createByteArray());
        this.f1596v = parcel.readString();
        this.f1595fb = parcel.readString();
    }
}
