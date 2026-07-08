package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.qj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<VariantInfo> f1777fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f1778v;

    @Nullable
    public final String y;

    public class y implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int i) {
            return new HlsTrackMetadataEntry[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }
    }

    public HlsTrackMetadataEntry(@Nullable String str, @Nullable String str2, List<VariantInfo> list) {
        this.y = str;
        this.f1778v = str2;
        this.f1777fb = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.y, hlsTrackMetadataEntry.y) && TextUtils.equals(this.f1778v, hlsTrackMetadataEntry.f1778v) && this.f1777fb.equals(hlsTrackMetadataEntry.f1777fb);
    }

    public int hashCode() {
        String str = this.y;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1778v;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f1777fb.hashCode();
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
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.y != null) {
            str = " [" + this.y + ", " + this.f1778v + "]";
        } else {
            str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.f1778v);
        int size = this.f1777fb.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeParcelable(this.f1777fb.get(i5), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.y = parcel.readString();
        this.f1778v = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f1777fb = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f1779f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public final String f1780fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public final String f1781s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public final String f1782t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f1783v;
        public final int y;

        public class y implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int i) {
                return new VariantInfo[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }
        }

        public VariantInfo(int i, int i5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.y = i;
            this.f1783v = i5;
            this.f1780fb = str;
            this.f1781s = str2;
            this.f1779f = str3;
            this.f1782t = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.y == variantInfo.y && this.f1783v == variantInfo.f1783v && TextUtils.equals(this.f1780fb, variantInfo.f1780fb) && TextUtils.equals(this.f1781s, variantInfo.f1781s) && TextUtils.equals(this.f1779f, variantInfo.f1779f) && TextUtils.equals(this.f1782t, variantInfo.f1782t);
        }

        public int hashCode() {
            int i = ((this.y * 31) + this.f1783v) * 31;
            String str = this.f1780fb;
            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1781s;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f1779f;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f1782t;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.y);
            parcel.writeInt(this.f1783v);
            parcel.writeString(this.f1780fb);
            parcel.writeString(this.f1781s);
            parcel.writeString(this.f1779f);
            parcel.writeString(this.f1782t);
        }

        public VariantInfo(Parcel parcel) {
            this.y = parcel.readInt();
            this.f1783v = parcel.readInt();
            this.f1780fb = parcel.readString();
            this.f1781s = parcel.readString();
            this.f1779f = parcel.readString();
            this.f1782t = parcel.readString();
        }
    }
}
