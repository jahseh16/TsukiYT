package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h2.xc;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2668f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public final DateValidator f2669fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Month f2670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2671t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final Month f2672v;

    @NonNull
    public final Month y;

    public interface DateValidator extends Parcelable {
        boolean ta(long j);
    }

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public DateValidator f2675gv;
        public long n3;
        public long y;
        public Long zn;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final long f2674v = xc.y(Month.n3(1900, 0).f2681t);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f2673a = xc.y(Month.n3(2100, 11).f2681t);

        public n3(@NonNull CalendarConstraints calendarConstraints) {
            this.y = f2674v;
            this.n3 = f2673a;
            this.f2675gv = DateValidatorPointForward.y(Long.MIN_VALUE);
            this.y = calendarConstraints.y.f2681t;
            this.n3 = calendarConstraints.f2672v.f2681t;
            this.zn = Long.valueOf(calendarConstraints.f2670s.f2681t);
            this.f2675gv = calendarConstraints.f2669fb;
        }

        @NonNull
        public n3 n3(long j) {
            this.zn = Long.valueOf(j);
            return this;
        }

        @NonNull
        public CalendarConstraints y() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f2675gv);
            Month monthZn = Month.zn(this.y);
            Month monthZn2 = Month.zn(this.n3);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l3 = this.zn;
            return new CalendarConstraints(monthZn, monthZn2, dateValidator, l3 == null ? null : Month.zn(l3.longValue()), null);
        }
    }

    public static class y implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, y yVar) {
        this(month, month2, dateValidator, month3);
    }

    public int c5() {
        return this.f2671t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.y.equals(calendarConstraints.y) && this.f2672v.equals(calendarConstraints.f2672v) && j5.zn.y(this.f2670s, calendarConstraints.f2670s) && this.f2669fb.equals(calendarConstraints.f2669fb);
    }

    @NonNull
    public Month f() {
        return this.y;
    }

    public DateValidator fb() {
        return this.f2669fb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.y, this.f2672v, this.f2670s, this.f2669fb});
    }

    @Nullable
    public Month i9() {
        return this.f2670s;
    }

    @NonNull
    public Month s() {
        return this.f2672v;
    }

    public int tl() {
        return this.f2668f;
    }

    public Month v(Month month) {
        return month.compareTo(this.y) < 0 ? this.y : month.compareTo(this.f2672v) > 0 ? this.f2672v : month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.y, 0);
        parcel.writeParcelable(this.f2672v, 0);
        parcel.writeParcelable(this.f2670s, 0);
        parcel.writeParcelable(this.f2669fb, 0);
    }

    public CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @Nullable Month month3) {
        this.y = month;
        this.f2672v = month2;
        this.f2670s = month3;
        this.f2669fb = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f2671t = month.tl(month2) + 1;
        this.f2668f = (month2.f2679fb - month.f2679fb) + 1;
    }
}
