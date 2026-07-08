package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import n4.gv;

/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1644v;
    public final float y;

    public class y implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (y) null);
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, y yVar) {
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.y == smtaMetadataEntry.y && this.f1644v == smtaMetadataEntry.f1644v;
    }

    public int hashCode() {
        return ((527 + gv.y(this.y)) * 31) + this.f1644v;
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
        return "smta: captureFrameRate=" + this.y + ", svcTemporalLayerCount=" + this.f1644v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.y);
        parcel.writeInt(this.f1644v);
    }

    public SmtaMetadataEntry(float f3, int i) {
        this.y = f3;
        this.f1644v = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.y = parcel.readFloat();
        this.f1644v = parcel.readInt();
    }
}
