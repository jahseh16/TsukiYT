package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.y;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class gv extends RecyclerView.s<n3> {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final DateSelector<?> f2683fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y.t f2684s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2685t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final CalendarConstraints f2686v;
    public final Context y;

    public static class n3 extends RecyclerView.ta {
        public final TextView n3;
        public final MaterialCalendarGridView zn;

        public n3(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R$id.z);
            this.n3 = textView;
            ut.m(textView, true);
            this.zn = (MaterialCalendarGridView) linearLayout.findViewById(R$id.w);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public class y implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView y;

        public y(MaterialCalendarGridView materialCalendarGridView) {
            this.y = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.y.getAdapter().wz(i)) {
                gv.this.f2684s.y(this.y.getAdapter().getItem(i).longValue());
            }
        }
    }

    public gv(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, y.t tVar) {
        Month monthF = calendarConstraints.f();
        Month monthS = calendarConstraints.s();
        Month monthI9 = calendarConstraints.i9();
        if (monthF.compareTo(monthI9) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthI9.compareTo(monthS) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int iY0 = zn.f2708t * com.google.android.material.datepicker.y.y0(context);
        int iY02 = com.google.android.material.datepicker.n3.y0(context) ? com.google.android.material.datepicker.y.y0(context) : 0;
        this.y = context;
        this.f2685t = iY0 + iY02;
        this.f2686v = calendarConstraints;
        this.f2683fb = dateSelector;
        this.f2684s = tVar;
        setHasStableIds(true);
    }

    public int getItemCount() {
        return this.f2686v.c5();
    }

    public long getItemId(int i) {
        return this.f2686v.f().i9(i).c5();
    }

    @NonNull
    public CharSequence i9(int i) {
        return v(i).s(this.y);
    }

    public int t(@NonNull Month month) {
        return this.f2686v.f().tl(month);
    }

    /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull n3 n3Var, int i) {
        Month monthI9 = this.f2686v.f().i9(i);
        n3Var.n3.setText(monthI9.s(((RecyclerView.ta) n3Var).itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) n3Var.zn.findViewById(R$id.w);
        if (materialCalendarGridView.getAdapter() == null || !monthI9.equals(materialCalendarGridView.getAdapter().y)) {
            zn znVar = new zn(monthI9, this.f2683fb, this.f2686v);
            materialCalendarGridView.setNumColumns(monthI9.f2680s);
            materialCalendarGridView.setAdapter((ListAdapter) znVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().tl(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new y(materialCalendarGridView));
    }

    @NonNull
    public Month v(int i) {
        return this.f2686v.f().i9(i);
    }

    @NonNull
    /* JADX INFO: renamed from: wz, reason: merged with bridge method [inline-methods] */
    public n3 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.f2267mt, viewGroup, false);
        if (!com.google.android.material.datepicker.n3.y0(viewGroup.getContext())) {
            return new n3(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f2685t));
        return new n3(linearLayout, true);
    }
}
