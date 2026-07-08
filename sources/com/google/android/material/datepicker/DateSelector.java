package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h2.s;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    boolean ap();

    @Nullable
    S g();

    @NonNull
    Collection<j5.gv<Long, Long>> jz();

    @NonNull
    String k(Context context);

    @NonNull
    Collection<Long> kp();

    int mg(Context context);

    void pz(long j);

    @NonNull
    View u(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull s<S> sVar);
}
