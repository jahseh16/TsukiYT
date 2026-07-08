package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v0.d;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new y();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final boolean f1647co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1648f;
    public final int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f1649fb;
    public final int n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<n3> f1650p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f1652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f1653t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f1654v;
    public final long w;
    public final long y;
    public final long z;

    public static final class n3 {
        public final long n3;
        public final int y;
        public final long zn;

        public /* synthetic */ n3(int i, long j, long j4, y yVar) {
            this(i, j, j4);
        }

        public static n3 y(Parcel parcel) {
            return new n3(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void n3(Parcel parcel) {
            parcel.writeInt(this.y);
            parcel.writeLong(this.n3);
            parcel.writeLong(this.zn);
        }

        public n3(int i, long j, long j4) {
            this.y = i;
            this.n3 = j;
            this.zn = j4;
        }
    }

    public class y implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, y yVar) {
        this(parcel);
    }

    public static SpliceInsertCommand y(d dVar, long j, hw hwVar) {
        List list;
        boolean z;
        boolean z5;
        long j4;
        boolean z7;
        long j7;
        int iYt;
        int iEj;
        int iEj2;
        boolean z8;
        boolean z9;
        long jA8;
        long jA82 = dVar.a8();
        boolean z10 = (dVar.ej() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z10) {
            list = listEmptyList;
            z = false;
            z5 = false;
            j4 = -9223372036854775807L;
            z7 = false;
            j7 = -9223372036854775807L;
            iYt = 0;
            iEj = 0;
            iEj2 = 0;
            z8 = false;
        } else {
            int iEj3 = dVar.ej();
            boolean z11 = (iEj3 & 128) != 0;
            boolean z12 = (iEj3 & 64) != 0;
            boolean z13 = (iEj3 & 32) != 0;
            boolean z14 = (iEj3 & 16) != 0;
            long jN3 = (!z12 || z14) ? -9223372036854775807L : TimeSignalCommand.n3(dVar, j);
            if (!z12) {
                int iEj4 = dVar.ej();
                ArrayList arrayList = new ArrayList(iEj4);
                for (int i = 0; i < iEj4; i++) {
                    int iEj5 = dVar.ej();
                    long jN32 = !z14 ? TimeSignalCommand.n3(dVar, j) : -9223372036854775807L;
                    arrayList.add(new n3(iEj5, jN32, hwVar.n3(jN32), null));
                }
                listEmptyList = arrayList;
            }
            if (z13) {
                long jEj = dVar.ej();
                boolean z15 = (128 & jEj) != 0;
                jA8 = ((((jEj & 1) << 32) | dVar.a8()) * 1000) / 90;
                z9 = z15;
            } else {
                z9 = false;
                jA8 = -9223372036854775807L;
            }
            iYt = dVar.yt();
            z8 = z12;
            iEj = dVar.ej();
            iEj2 = dVar.ej();
            list = listEmptyList;
            long j8 = jN3;
            z7 = z9;
            j7 = jA8;
            z5 = z14;
            z = z11;
            j4 = j8;
        }
        return new SpliceInsertCommand(jA82, z10, z, z8, z5, j4, hwVar.n3(j4), list, z7, j7, iYt, iEj, iEj2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.y);
        parcel.writeByte(this.f1654v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1649fb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1652s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1648f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1653t);
        parcel.writeLong(this.w);
        int size = this.f1650p.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            this.f1650p.get(i5).n3(parcel);
        }
        parcel.writeByte(this.f1647co ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.z);
        parcel.writeInt(this.f1651r);
        parcel.writeInt(this.f3);
        parcel.writeInt(this.n);
    }

    public SpliceInsertCommand(long j, boolean z, boolean z5, boolean z7, boolean z8, long j4, long j7, List<n3> list, boolean z9, long j8, int i, int i5, int i8) {
        this.y = j;
        this.f1654v = z;
        this.f1649fb = z5;
        this.f1652s = z7;
        this.f1648f = z8;
        this.f1653t = j4;
        this.w = j7;
        this.f1650p = Collections.unmodifiableList(list);
        this.f1647co = z9;
        this.z = j8;
        this.f1651r = i;
        this.f3 = i5;
        this.n = i8;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.y = parcel.readLong();
        this.f1654v = parcel.readByte() == 1;
        this.f1649fb = parcel.readByte() == 1;
        this.f1652s = parcel.readByte() == 1;
        this.f1648f = parcel.readByte() == 1;
        this.f1653t = parcel.readLong();
        this.w = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(n3.y(parcel));
        }
        this.f1650p = Collections.unmodifiableList(arrayList);
        this.f1647co = parcel.readByte() == 1;
        this.z = parcel.readLong();
        this.f1651r = parcel.readInt();
        this.f3 = parcel.readInt();
        this.n = parcel.readInt();
    }
}
