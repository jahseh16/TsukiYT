package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.g;
import ft.qj;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f1578f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f1579fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f1580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1581t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f1582v;
    public final String y;
    public static final g w = new g.n3().o4("application/id3").z6();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f1577p = new g.n3().o4("application/x-scte35").z6();
    public static final Parcelable.Creator<EventMessage> CREATOR = new y();

    public class y implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }
    }

    public EventMessage(String str, String str2, long j, long j4, byte[] bArr) {
        this.y = str;
        this.f1582v = str2;
        this.f1579fb = j;
        this.f1580s = j4;
        this.f1578f = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f1579fb == eventMessage.f1579fb && this.f1580s == eventMessage.f1580s && ut.zn(this.y, eventMessage.y) && ut.zn(this.f1582v, eventMessage.f1582v) && Arrays.equals(this.f1578f, eventMessage.f1578f);
    }

    public int hashCode() {
        if (this.f1581t == 0) {
            String str = this.y;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1582v;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f1579fb;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j4 = this.f1580s;
            this.f1581t = ((i + ((int) (j4 ^ (j4 >>> 32)))) * 31) + Arrays.hashCode(this.f1578f);
        }
        return this.f1581t;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void lc(qj.n3 n3Var) {
        de.y.zn(this, n3Var);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public g p() {
        String str = this.y;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f1577p;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return w;
            default:
                return null;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    public byte[] tg() {
        if (p() != null) {
            return this.f1578f;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.y + ", id=" + this.f1580s + ", durationMs=" + this.f1579fb + ", value=" + this.f1582v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.f1582v);
        parcel.writeLong(this.f1579fb);
        parcel.writeLong(this.f1580s);
        parcel.writeByteArray(this.f1578f);
    }

    public EventMessage(Parcel parcel) {
        this.y = (String) ut.i9(parcel.readString());
        this.f1582v = (String) ut.i9(parcel.readString());
        this.f1579fb = parcel.readLong();
        this.f1580s = parcel.readLong();
        this.f1578f = (byte[]) ut.i9(parcel.createByteArray());
    }
}
