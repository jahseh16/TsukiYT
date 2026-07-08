package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m3.n3;

/* JADX INFO: loaded from: classes.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2965f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f2966fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2968t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n3 f2969v;
    public int w;
    public final n3 y;

    public static class y implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String n3(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public static String y(Resources resources, CharSequence charSequence) {
        return n3(resources, charSequence, "%02d");
    }

    public static int zn(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f2967s == timeModel.f2967s && this.f2965f == timeModel.f2965f && this.f2966fb == timeModel.f2966fb && this.f2968t == timeModel.f2968t;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2966fb), Integer.valueOf(this.f2967s), Integer.valueOf(this.f2965f), Integer.valueOf(this.f2968t)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2967s);
        parcel.writeInt(this.f2965f);
        parcel.writeInt(this.f2968t);
        parcel.writeInt(this.f2966fb);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i5, int i8, int i10) {
        this.f2967s = i;
        this.f2965f = i5;
        this.f2968t = i8;
        this.f2966fb = i10;
        this.w = zn(i);
        this.y = new n3(59);
        this.f2969v = new n3(i10 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
