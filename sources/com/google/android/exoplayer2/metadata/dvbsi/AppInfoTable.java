package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1576v;
    public final int y;

    public class y implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) v0.y.v(parcel.readString()));
        }
    }

    public AppInfoTable(int i, String str) {
        this.y = i;
        this.f1576v = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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
        return "Ait(controlCode=" + this.y + ",url=" + this.f1576v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1576v);
        parcel.writeInt(this.y);
    }
}
