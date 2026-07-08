package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.qj;
import java.util.Arrays;
import java.util.List;
import n4.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1575v;
    public final Entry[] y;

    public interface Entry extends Parcelable {
        void lc(qj.n3 n3Var);

        @Nullable
        g p();

        @Nullable
        byte[] tg();
    }

    public class y implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.y, metadata.y) && this.f1575v == metadata.f1575v;
    }

    public Entry gv(int i) {
        return this.y[i];
    }

    public int hashCode() {
        return (Arrays.hashCode(this.y) * 31) + s.zn(this.f1575v);
    }

    public Metadata n3(@Nullable Metadata metadata) {
        return metadata == null ? this : y(metadata.y);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.y));
        if (this.f1575v == -9223372036854775807L) {
            str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        } else {
            str = ", presentationTimeUs=" + this.f1575v;
        }
        sb.append(str);
        return sb.toString();
    }

    public int v() {
        return this.y.length;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y.length);
        for (Entry entry : this.y) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f1575v);
    }

    public Metadata y(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.f1575v, (Entry[]) ut.qk(this.y, entryArr));
    }

    public Metadata zn(long j) {
        return this.f1575v == j ? this : new Metadata(j, this.y);
    }

    public Metadata(long j, Entry... entryArr) {
        this.f1575v = j;
        this.y = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j, List<? extends Entry> list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.y = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.y;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.f1575v = parcel.readLong();
                return;
            }
        }
    }
}
