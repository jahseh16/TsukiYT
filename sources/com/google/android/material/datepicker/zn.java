package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import h2.xc;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class zn extends BaseAdapter {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f2708t = xc.f().getMaximum(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CalendarConstraints f2709f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Collection<Long> f2710fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h2.n3 f2711s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DateSelector<?> f2712v;
    public final Month y;

    public zn(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.y = month;
        this.f2712v = dateSelector;
        this.f2709f = calendarConstraints;
        this.f2710fb = dateSelector.kp();
    }

    public boolean a(int i) {
        return i % this.y.f2680s == 0;
    }

    public int c5() {
        return (this.y.v() + this.y.f2678f) - 1;
    }

    public final void f(@Nullable TextView textView, long j) {
        h2.y yVar;
        if (textView == null) {
            return;
        }
        if (this.f2709f.fb().ta(j)) {
            textView.setEnabled(true);
            yVar = s(j) ? this.f2711s.n3 : xc.c5().getTimeInMillis() == j ? this.f2711s.zn : this.f2711s.y;
        } else {
            textView.setEnabled(false);
            yVar = this.f2711s.f5275fb;
        }
        yVar.gv(textView);
    }

    public boolean fb(int i) {
        return (i + 1) % this.y.f2680s == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.y.f2678f + n3();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.y.f2680s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.v(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R$layout.f2276xc
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.n3()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.Month r8 = r5.y
            int r3 = r8.f2678f
            if (r7 < r3) goto L2e
            goto L75
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.y
            long r7 = r8.a(r7)
            com.google.android.material.datepicker.Month r3 = r5.y
            int r3 = r3.f2679fb
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.gv()
            int r4 = r4.f2679fb
            if (r3 != r4) goto L67
            java.lang.String r7 = h2.gv.y(r7)
            r1.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = h2.gv.gv(r7)
            r1.setContentDescription(r7)
        L6e:
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L7d
        L75:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r1
        L84:
            long r6 = r6.longValue()
            r5.f(r1, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.zn.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i9(int i) {
        return (i - this.y.v()) + 1;
    }

    public int n3() {
        return this.y.v();
    }

    public final boolean s(long j) {
        Iterator<Long> it = this.f2712v.kp().iterator();
        while (it.hasNext()) {
            if (xc.y(j) == xc.y(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    public final void t(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.zn(j).equals(this.y)) {
            f((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().y(this.y.fb(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public void tl(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f2710fb.iterator();
        while (it.hasNext()) {
            t(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f2712v;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.kp().iterator();
            while (it2.hasNext()) {
                t(materialCalendarGridView, it2.next().longValue());
            }
            this.f2710fb = this.f2712v.kp();
        }
    }

    public final void v(Context context) {
        if (this.f2711s == null) {
            this.f2711s = new h2.n3(context);
        }
    }

    public boolean wz(int i) {
        return i >= n3() && i <= c5();
    }

    public int y(int i) {
        return n3() + (i - 1);
    }

    @Override // android.widget.Adapter
    @Nullable
    /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.y.v() || i > c5()) {
            return null;
        }
        return Long.valueOf(this.y.a(i9(i)));
    }
}
