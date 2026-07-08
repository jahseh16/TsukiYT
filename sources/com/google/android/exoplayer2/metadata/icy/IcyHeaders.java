package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import java.util.List;
import java.util.Map;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1590f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final String f1591fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f1592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1593t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f1594v;
    public final int y;

    public class y implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }
    }

    public IcyHeaders(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i5) {
        v0.y.y(i5 == -1 || i5 > 0);
        this.y = i;
        this.f1594v = str;
        this.f1591fb = str2;
        this.f1592s = str3;
        this.f1590f = z;
        this.f1593t = i5;
    }

    @Nullable
    public static IcyHeaders y(Map<String, List<String>> map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i5;
        List<String> list = map.get("icy-br");
        boolean z5 = true;
        int i8 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i5 = Integer.parseInt(str4) * 1000;
                if (i5 > 0) {
                    z = true;
                } else {
                    try {
                        r.c5("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i5 = -1;
                    } catch (NumberFormatException unused) {
                        r.c5("IcyHeaders", "Invalid bitrate header: " + str4);
                        i = i5;
                        z = false;
                    }
                }
                i = i5;
            } catch (NumberFormatException unused2) {
                i5 = -1;
            }
        } else {
            z = false;
            i = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i10 = Integer.parseInt(str5);
                if (i10 > 0) {
                    i8 = i10;
                } else {
                    try {
                        r.c5("IcyHeaders", "Invalid metadata interval: " + str5);
                        z5 = z;
                    } catch (NumberFormatException unused3) {
                        i8 = i10;
                        r.c5("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z = z5;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new IcyHeaders(i, str, str2, str3, zEquals, i8);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.y == icyHeaders.y && ut.zn(this.f1594v, icyHeaders.f1594v) && ut.zn(this.f1591fb, icyHeaders.f1591fb) && ut.zn(this.f1592s, icyHeaders.f1592s) && this.f1590f == icyHeaders.f1590f && this.f1593t == icyHeaders.f1593t;
    }

    public int hashCode() {
        int i = (527 + this.y) * 31;
        String str = this.f1594v;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1591fb;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1592s;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f1590f ? 1 : 0)) * 31) + this.f1593t;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void lc(qj.n3 n3Var) {
        String str = this.f1591fb;
        if (str != null) {
            n3Var.nf(str);
        }
        String str2 = this.f1594v;
        if (str2 != null) {
            n3Var.en(str2);
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
        return "IcyHeaders: name=\"" + this.f1591fb + "\", genre=\"" + this.f1594v + "\", bitrate=" + this.y + ", metadataInterval=" + this.f1593t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeString(this.f1594v);
        parcel.writeString(this.f1591fb);
        parcel.writeString(this.f1592s);
        ut.bv(parcel, this.f1590f);
        parcel.writeInt(this.f1593t);
    }

    public IcyHeaders(Parcel parcel) {
        this.y = parcel.readInt();
        this.f1594v = parcel.readString();
        this.f1591fb = parcel.readString();
        this.f1592s = parcel.readString();
        this.f1590f = ut.w9(parcel);
        this.f1593t = parcel.readInt();
    }
}
