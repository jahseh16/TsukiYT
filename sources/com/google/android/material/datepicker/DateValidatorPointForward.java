package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new y();
    public final long y;

    public static class y implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(@NonNull Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j, y yVar) {
        this(j);
    }

    @NonNull
    public static DateValidatorPointForward y(long j) {
        return new DateValidatorPointForward(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.y == ((DateValidatorPointForward) obj).y;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.y)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean ta(long j) {
        return j >= this.y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.y);
    }

    public DateValidatorPointForward(long j) {
        this.y = j;
    }
}
