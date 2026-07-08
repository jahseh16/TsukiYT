package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new y();
    public final List<zn> y;

    public static final class n3 {
        public final long n3;
        public final int y;

        public /* synthetic */ n3(int i, long j, y yVar) {
            this(i, j);
        }

        public static n3 zn(Parcel parcel) {
            return new n3(parcel.readInt(), parcel.readLong());
        }

        public final void gv(Parcel parcel) {
            parcel.writeInt(this.y);
            parcel.writeLong(this.n3);
        }

        public n3(int i, long j) {
            this.y = i;
            this.n3 = j;
        }
    }

    public class y implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, y yVar) {
        this(parcel);
    }

    public static SpliceScheduleCommand y(d dVar) {
        int iEj = dVar.ej();
        ArrayList arrayList = new ArrayList(iEj);
        for (int i = 0; i < iEj; i++) {
            arrayList.add(zn.v(dVar));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.y.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            this.y.get(i5).a(parcel);
        }
    }

    public SpliceScheduleCommand(List<zn> list) {
        this.y = Collections.unmodifiableList(list);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(zn.gv(parcel));
        }
        this.y = Collections.unmodifiableList(arrayList);
    }

    public static final class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<n3> f1655a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final int f1656c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f1657f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final boolean f1658fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f1659gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final int f1660i9;
        public final boolean n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final long f1661s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f1662v;
        public final long y;
        public final boolean zn;

        public zn(long j, boolean z, boolean z5, boolean z7, List<n3> list, long j4, boolean z8, long j7, int i, int i5, int i8) {
            this.y = j;
            this.n3 = z;
            this.zn = z5;
            this.f1659gv = z7;
            this.f1655a = Collections.unmodifiableList(list);
            this.f1662v = j4;
            this.f1658fb = z8;
            this.f1661s = j7;
            this.f1656c5 = i;
            this.f1660i9 = i5;
            this.f1657f = i8;
        }

        public static zn gv(Parcel parcel) {
            return new zn(parcel);
        }

        public static zn v(d dVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z5;
            long j4;
            int i;
            int i5;
            int iEj;
            boolean z7;
            boolean z8;
            long jA8;
            long jA82 = dVar.a8();
            boolean z9 = (dVar.ej() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z9) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z5 = false;
                j4 = -9223372036854775807L;
                i = 0;
                i5 = 0;
                iEj = 0;
                z7 = false;
            } else {
                int iEj2 = dVar.ej();
                boolean z10 = (iEj2 & 128) != 0;
                boolean z11 = (iEj2 & 64) != 0;
                boolean z12 = (iEj2 & 32) != 0;
                long jA83 = z11 ? dVar.a8() : -9223372036854775807L;
                if (!z11) {
                    int iEj3 = dVar.ej();
                    ArrayList arrayList3 = new ArrayList(iEj3);
                    for (int i8 = 0; i8 < iEj3; i8++) {
                        arrayList3.add(new n3(dVar.ej(), dVar.a8(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z12) {
                    long jEj = dVar.ej();
                    boolean z13 = (128 & jEj) != 0;
                    jA8 = ((((jEj & 1) << 32) | dVar.a8()) * 1000) / 90;
                    z8 = z13;
                } else {
                    z8 = false;
                    jA8 = -9223372036854775807L;
                }
                int iYt = dVar.yt();
                int iEj4 = dVar.ej();
                z7 = z11;
                iEj = dVar.ej();
                j4 = jA8;
                arrayList = arrayList2;
                long j7 = jA83;
                i = iYt;
                i5 = iEj4;
                j = j7;
                boolean z14 = z10;
                z5 = z8;
                z = z14;
            }
            return new zn(jA82, z9, z, z7, arrayList, j, z5, j4, i, i5, iEj);
        }

        public final void a(Parcel parcel) {
            parcel.writeLong(this.y);
            parcel.writeByte(this.n3 ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.zn ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f1659gv ? (byte) 1 : (byte) 0);
            int size = this.f1655a.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f1655a.get(i).gv(parcel);
            }
            parcel.writeLong(this.f1662v);
            parcel.writeByte(this.f1658fb ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f1661s);
            parcel.writeInt(this.f1656c5);
            parcel.writeInt(this.f1660i9);
            parcel.writeInt(this.f1657f);
        }

        public zn(Parcel parcel) {
            this.y = parcel.readLong();
            this.n3 = parcel.readByte() == 1;
            this.zn = parcel.readByte() == 1;
            this.f1659gv = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i5 = 0; i5 < i; i5++) {
                arrayList.add(n3.zn(parcel));
            }
            this.f1655a = Collections.unmodifiableList(arrayList);
            this.f1662v = parcel.readLong();
            this.f1658fb = parcel.readByte() == 1;
            this.f1661s = parcel.readLong();
            this.f1656c5 = parcel.readInt();
            this.f1660i9 = parcel.readInt();
            this.f1657f = parcel.readInt();
        }
    }
}
