package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$id;
import h2.xc;
import java.util.Calendar;
import o.ud;
import o2.t;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2676v;
    public final Calendar y;

    public class y extends qn.y {
        public y() {
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            udVar.ap((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean gv(@Nullable Long l3, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6) {
        return l3 == null || l4 == null || l5 == null || l6 == null || l5.longValue() > l4.longValue() || l6.longValue() < l3.longValue();
    }

    public static int zn(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public zn getAdapter() {
        return (zn) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iY;
        int iZn;
        int iY2;
        int iZn2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        zn adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f2712v;
        h2.n3 n3Var = adapter.f2711s;
        Long item = adapter.getItem(adapter.n3());
        Long item2 = adapter.getItem(adapter.c5());
        for (j5.gv<Long, Long> gvVar : dateSelector.jz()) {
            Long l3 = gvVar.y;
            if (l3 != null) {
                if (gvVar.n3 != null) {
                    Long l4 = l3;
                    long jLongValue = l4.longValue();
                    Long l5 = gvVar.n3;
                    long jLongValue2 = l5.longValue();
                    if (!gv(item, item2, l4, l5)) {
                        boolean zGv = t.gv(this);
                        if (jLongValue < item.longValue()) {
                            iY = adapter.n3();
                            iZn = adapter.a(iY) ? 0 : !zGv ? materialCalendarGridView.getChildAt(iY - 1).getRight() : materialCalendarGridView.getChildAt(iY - 1).getLeft();
                        } else {
                            materialCalendarGridView.y.setTimeInMillis(jLongValue);
                            iY = adapter.y(materialCalendarGridView.y.get(5));
                            iZn = zn(materialCalendarGridView.getChildAt(iY));
                        }
                        if (jLongValue2 > item2.longValue()) {
                            iY2 = Math.min(adapter.c5(), getChildCount() - 1);
                            iZn2 = adapter.fb(iY2) ? getWidth() : !zGv ? materialCalendarGridView.getChildAt(iY2).getRight() : materialCalendarGridView.getChildAt(iY2).getLeft();
                        } else {
                            materialCalendarGridView.y.setTimeInMillis(jLongValue2);
                            iY2 = adapter.y(materialCalendarGridView.y.get(5));
                            iZn2 = zn(materialCalendarGridView.getChildAt(iY2));
                        }
                        int itemId = (int) adapter.getItemId(iY);
                        int itemId2 = (int) adapter.getItemId(iY2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + n3Var.y.zn();
                            int bottom = childAt.getBottom() - n3Var.y.n3();
                            if (zGv) {
                                int i5 = iY2 > numColumns2 ? 0 : iZn2;
                                width = numColumns > iY ? getWidth() : iZn;
                                i = i5;
                            } else {
                                i = numColumns > iY ? 0 : iZn;
                                width = iY2 > numColumns2 ? getWidth() : iZn2;
                            }
                            canvas.drawRect(i, top, width, bottom, n3Var.f5277s);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            y(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().n3()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().n3());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i5) {
        if (!this.f2676v) {
            super.onMeasure(i, i5);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().n3()) {
            super.setSelection(getAdapter().n3());
        } else {
            super.setSelection(i);
        }
    }

    public final void y(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().c5());
        } else if (i == 130) {
            setSelection(getAdapter().n3());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = xc.f();
        if (n3.y0(getContext())) {
            setNextFocusLeftId(R$id.y);
            setNextFocusRightId(R$id.zn);
        }
        this.f2676v = n3.t6(getContext());
        ut.g3(this, new y());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof zn)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), zn.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
