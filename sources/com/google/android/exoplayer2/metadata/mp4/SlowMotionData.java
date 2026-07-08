package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import ft.g;
import ft.qj;
import g4.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k4.wz;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new y();
    public final List<Segment> y;

    public static final class Segment implements Parcelable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f1642fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f1643v;
        public final long y;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final Comparator<Segment> f1641s = new Comparator() { // from class: jh.y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SlowMotionData.Segment.n3((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new y();

        public class y implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public Segment[] newArray(int i) {
                return new Segment[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }
        }

        public Segment(long j, long j4, int i) {
            v0.y.y(j < j4);
            this.y = j;
            this.f1643v = j4;
            this.f1642fb = i;
        }

        public static /* synthetic */ int n3(Segment segment, Segment segment2) {
            return wz.i9().v(segment.y, segment2.y).v(segment.f1643v, segment2.f1643v).gv(segment.f1642fb, segment2.f1642fb).c5();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.y == segment.y && this.f1643v == segment.f1643v && this.f1642fb == segment.f1642fb;
        }

        public int hashCode() {
            return f.n3(Long.valueOf(this.y), Long.valueOf(this.f1643v), Integer.valueOf(this.f1642fb));
        }

        public String toString() {
            return ut.rz("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.y), Long.valueOf(this.f1643v), Integer.valueOf(this.f1642fb));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.y);
            parcel.writeLong(this.f1643v);
            parcel.writeInt(this.f1642fb);
        }
    }

    public class y implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.y = list;
        v0.y.y(!y(list));
    }

    public static boolean y(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f1643v;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).y < j) {
                return true;
            }
            j = list.get(i).f1643v;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.y.equals(((SlowMotionData) obj).y);
    }

    public int hashCode() {
        return this.y.hashCode();
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
        return "SlowMotion: segments=" + this.y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.y);
    }
}
