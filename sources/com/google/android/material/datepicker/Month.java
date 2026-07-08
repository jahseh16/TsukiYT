package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h2.xc;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2678f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f2679fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f2681t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f2682v;

    @Nullable
    public String w;

    @NonNull
    public final Calendar y;

    public static class y implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i) {
            return new Month[i];
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.n3(parcel.readInt(), parcel.readInt());
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarGv = xc.gv(calendar);
        this.y = calendarGv;
        this.f2682v = calendarGv.get(2);
        this.f2679fb = calendarGv.get(1);
        this.f2680s = calendarGv.getMaximum(7);
        this.f2678f = calendarGv.getActualMaximum(5);
        this.f2681t = calendarGv.getTimeInMillis();
    }

    @NonNull
    public static Month gv() {
        return new Month(xc.c5());
    }

    @NonNull
    public static Month n3(int i, int i5) {
        Calendar calendarF = xc.f();
        calendarF.set(1, i);
        calendarF.set(2, i5);
        return new Month(calendarF);
    }

    @NonNull
    public static Month zn(long j) {
        Calendar calendarF = xc.f();
        calendarF.setTimeInMillis(j);
        return new Month(calendarF);
    }

    public long a(int i) {
        Calendar calendarGv = xc.gv(this.y);
        calendarGv.set(5, i);
        return calendarGv.getTimeInMillis();
    }

    public long c5() {
        return this.y.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f2682v == month.f2682v && this.f2679fb == month.f2679fb;
    }

    public int fb(long j) {
        Calendar calendarGv = xc.gv(this.y);
        calendarGv.setTimeInMillis(j);
        return calendarGv.get(5);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2682v), Integer.valueOf(this.f2679fb)});
    }

    @NonNull
    public Month i9(int i) {
        Calendar calendarGv = xc.gv(this.y);
        calendarGv.add(2, i);
        return new Month(calendarGv);
    }

    @NonNull
    public String s(Context context) {
        if (this.w == null) {
            this.w = h2.gv.zn(context, this.y.getTimeInMillis());
        }
        return this.w;
    }

    public int tl(@NonNull Month month) {
        if (this.y instanceof GregorianCalendar) {
            return ((month.f2679fb - this.f2679fb) * 12) + (month.f2682v - this.f2682v);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int v() {
        int firstDayOfWeek = this.y.get(7) - this.y.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f2680s : firstDayOfWeek;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f2679fb);
        parcel.writeInt(this.f2682v);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.y.compareTo(month.y);
    }
}
