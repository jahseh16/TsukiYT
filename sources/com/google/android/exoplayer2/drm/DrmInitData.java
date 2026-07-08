package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String f1510fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1511s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1512v;
    public final SchemeData[] y;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final byte[] f1513f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public final String f1514fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final String f1515s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final UUID f1516v;
        public int y;

        public class y implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }
        }

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return ut.zn(this.f1514fb, schemeData.f1514fb) && ut.zn(this.f1515s, schemeData.f1515s) && ut.zn(this.f1516v, schemeData.f1516v) && Arrays.equals(this.f1513f, schemeData.f1513f);
        }

        public boolean gv(UUID uuid) {
            return ft.c5.y.equals(this.f1516v) || uuid.equals(this.f1516v);
        }

        public int hashCode() {
            if (this.y == 0) {
                int iHashCode = this.f1516v.hashCode() * 31;
                String str = this.f1514fb;
                this.y = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f1515s.hashCode()) * 31) + Arrays.hashCode(this.f1513f);
            }
            return this.y;
        }

        @CheckResult
        public SchemeData n3(@Nullable byte[] bArr) {
            return new SchemeData(this.f1516v, this.f1514fb, this.f1515s, bArr);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f1516v.getMostSignificantBits());
            parcel.writeLong(this.f1516v.getLeastSignificantBits());
            parcel.writeString(this.f1514fb);
            parcel.writeString(this.f1515s);
            parcel.writeByteArray(this.f1513f);
        }

        public boolean y(SchemeData schemeData) {
            return zn() && !schemeData.zn() && gv(schemeData.f1516v);
        }

        public boolean zn() {
            return this.f1513f != null;
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.f1516v = (UUID) v0.y.v(uuid);
            this.f1514fb = str;
            this.f1515s = (String) v0.y.v(str2);
            this.f1513f = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f1516v = new UUID(parcel.readLong(), parcel.readLong());
            this.f1514fb = parcel.readString();
            this.f1515s = (String) ut.i9(parcel.readString());
            this.f1513f = parcel.createByteArray();
        }
    }

    public class y implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    @Nullable
    public static DrmInitData gv(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f1510fb;
            for (SchemeData schemeData : drmInitData.y) {
                if (schemeData.zn()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f1510fb;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.y) {
                if (schemeData2.zn() && !n3(arrayList, size, schemeData2.f1516v)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public static boolean n3(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i5 = 0; i5 < i; i5++) {
            if (arrayList.get(i5).f1516v.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public DrmInitData a(DrmInitData drmInitData) {
        String str;
        String str2 = this.f1510fb;
        v0.y.fb(str2 == null || (str = drmInitData.f1510fb) == null || TextUtils.equals(str2, str));
        String str3 = this.f1510fb;
        if (str3 == null) {
            str3 = drmInitData.f1510fb;
        }
        return new DrmInitData(str3, (SchemeData[]) ut.qk(this.y, drmInitData.y));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return ut.zn(this.f1510fb, drmInitData.f1510fb) && Arrays.equals(this.y, drmInitData.y);
    }

    public int hashCode() {
        if (this.f1512v == 0) {
            String str = this.f1510fb;
            this.f1512v = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.y);
        }
        return this.f1512v;
    }

    public SchemeData v(int i) {
        return this.y[i];
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1510fb);
        parcel.writeTypedArray(this.y, 0);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = ft.c5.y;
        return uuid.equals(schemeData.f1516v) ? uuid.equals(schemeData2.f1516v) ? 0 : 1 : schemeData.f1516v.compareTo(schemeData2.f1516v);
    }

    @CheckResult
    public DrmInitData zn(@Nullable String str) {
        return ut.zn(this.f1510fb, str) ? this : new DrmInitData(str, false, this.y);
    }

    public DrmInitData(@Nullable String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.f1510fb = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.y = schemeDataArr;
        this.f1511s = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f1510fb = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) ut.i9((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.y = schemeDataArr;
        this.f1511s = schemeDataArr.length;
    }
}
