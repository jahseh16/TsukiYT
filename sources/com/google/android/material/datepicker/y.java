package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.tl;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.button.MaterialButton;
import h2.xc;
import java.util.Calendar;
import java.util.Iterator;
import o.ud;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y<S> extends h2.c5<S> {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f2695co;

    @Nullable
    public CalendarConstraints d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public f f2696ej;

    @Nullable
    public DateSelector<S> f3;

    @Nullable
    public Month fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public h2.n3 f2697hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public RecyclerView f2698j5;
    public View oz;
    public RecyclerView qn;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public View f2699ut;
    public static final Object q9 = "MONTHS_VIEW_GROUP_TAG";
    public static final Object f7 = "NAVIGATION_PREV_TAG";
    public static final Object en = "NAVIGATION_NEXT_TAG";
    public static final Object jz = "SELECTOR_TOGGLE_TAG";

    public class a extends qn.y {
        public a() {
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            udVar.bk(y.this.f2699ut.getVisibility() == 0 ? y.this.getString(R$string.f2279co) : y.this.getString(R$string.f2285p));
        }
    }

    public class c5 implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.gv y;

        public c5(com.google.android.material.datepicker.gv gvVar) {
            this.y = gvVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = y.this.t6().findFirstVisibleItemPosition() + 1;
            if (iFindFirstVisibleItemPosition < y.this.qn.getAdapter().getItemCount()) {
                y.this.op(this.y.v(iFindFirstVisibleItemPosition));
            }
        }
    }

    public enum f {
        DAY,
        YEAR
    }

    public class fb extends RecyclerView.r {
        public final /* synthetic */ MaterialButton n3;
        public final /* synthetic */ com.google.android.material.datepicker.gv y;

        public fb(com.google.android.material.datepicker.gv gvVar, MaterialButton materialButton) {
            this.y = gvVar;
            this.n3 = materialButton;
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.n3.getText());
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i5) {
            int iFindFirstVisibleItemPosition = i < 0 ? y.this.t6().findFirstVisibleItemPosition() : y.this.t6().findLastVisibleItemPosition();
            y.this.fh = this.y.v(iFindFirstVisibleItemPosition);
            this.n3.setText(this.y.i9(iFindFirstVisibleItemPosition));
        }
    }

    public class gv implements t {
        public gv() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.y.t
        public void y(long j) {
            if (y.this.d0.fb().ta(j)) {
                y.this.f3.pz(j);
                Iterator<h2.s<S>> it = y.this.f5272fb.iterator();
                while (it.hasNext()) {
                    it.next().y(y.this.f3.g());
                }
                y.this.qn.getAdapter().notifyDataSetChanged();
                if (y.this.f2698j5 != null) {
                    y.this.f2698j5.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public class i9 implements View.OnClickListener {
        public final /* synthetic */ com.google.android.material.datepicker.gv y;

        public i9(com.google.android.material.datepicker.gv gvVar) {
            this.y = gvVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = y.this.t6().findLastVisibleItemPosition() - 1;
            if (iFindLastVisibleItemPosition >= 0) {
                y.this.op(this.y.v(iFindLastVisibleItemPosition));
            }
        }
    }

    public class n3 extends qn.y {
        public n3() {
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            udVar.ap((Object) null);
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y.this.jf();
        }
    }

    public interface t {
        void y(long j);
    }

    public class v extends RecyclerView.xc {
        public final Calendar y = xc.f();
        public final Calendar n3 = xc.f();

        public v() {
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.fh fhVar) {
            if ((recyclerView.getAdapter() instanceof com.google.android.material.datepicker.v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                com.google.android.material.datepicker.v vVar = (com.google.android.material.datepicker.v) recyclerView.getAdapter();
                GridLayoutManager layoutManager = recyclerView.getLayoutManager();
                for (j5.gv<Long, Long> gvVar : y.this.f3.jz()) {
                    Long l3 = gvVar.y;
                    if (l3 != null && gvVar.n3 != null) {
                        this.y.setTimeInMillis(l3.longValue());
                        this.n3.setTimeInMillis(gvVar.n3.longValue());
                        int iI9 = vVar.i9(this.y.get(1));
                        int iI92 = vVar.i9(this.n3.get(1));
                        View viewFindViewByPosition = layoutManager.findViewByPosition(iI9);
                        View viewFindViewByPosition2 = layoutManager.findViewByPosition(iI92);
                        int iR = iI9 / layoutManager.r();
                        int iR2 = iI92 / layoutManager.r();
                        int i = iR;
                        while (i <= iR2) {
                            if (layoutManager.findViewByPosition(layoutManager.r() * i) != null) {
                                canvas.drawRect(i == iR ? viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2) : 0, r9.getTop() + y.this.f2697hw.f5276gv.zn(), i == iR2 ? viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - y.this.f2697hw.f5276gv.n3(), y.this.f2697hw.f5277s);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.y$y, reason: collision with other inner class name */
    public class RunnableC0066y implements Runnable {
        public final /* synthetic */ int y;

        public RunnableC0066y(int i) {
            this.y = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.qn.smoothScrollToPosition(this.y);
        }
    }

    public class zn extends h2.i9 {
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(Context context, int i, boolean z, int i5) {
            super(context, i, z);
            this.y = i5;
        }

        public void calculateExtraLayoutSpace(@NonNull RecyclerView.fh fhVar, @NonNull int[] iArr) {
            if (this.y == 0) {
                iArr[0] = y.this.qn.getWidth();
                iArr[1] = y.this.qn.getWidth();
            } else {
                iArr[0] = y.this.qn.getHeight();
                iArr[1] = y.this.qn.getHeight();
            }
        }
    }

    @NonNull
    public static <T> y<T> t3(@NonNull DateSelector<T> dateSelector, int i, @NonNull CalendarConstraints calendarConstraints) {
        y<T> yVar = new y<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.i9());
        yVar.setArguments(bundle);
        return yVar;
    }

    public static int y0(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(R$dimen.f2216ud);
    }

    @NonNull
    public final RecyclerView.xc bx() {
        return new v();
    }

    public h2.n3 cp() {
        return this.f2697hw;
    }

    @Override // h2.c5
    public boolean ez(@NonNull h2.s<S> sVar) {
        return super.ez(sVar);
    }

    @Nullable
    public Month gd() {
        return this.fh;
    }

    public void gm(f fVar) {
        this.f2696ej = fVar;
        if (fVar == f.YEAR) {
            this.f2698j5.getLayoutManager().scrollToPosition(((com.google.android.material.datepicker.v) this.f2698j5.getAdapter()).i9(this.fh.f2679fb));
            this.oz.setVisibility(0);
            this.f2699ut.setVisibility(8);
        } else if (fVar == f.DAY) {
            this.oz.setVisibility(8);
            this.f2699ut.setVisibility(0);
            op(this.fh);
        }
    }

    @Nullable
    public CalendarConstraints ja() {
        return this.d0;
    }

    public void jf() {
        f fVar = this.f2696ej;
        f fVar2 = f.YEAR;
        if (fVar == fVar2) {
            gm(f.DAY);
        } else if (fVar == f.DAY) {
            gm(fVar2);
        }
    }

    public final void m5(int i) {
        this.qn.post(new RunnableC0066y(i));
    }

    @Nullable
    public DateSelector<S> ng() {
        return this.f3;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f2695co = bundle.getInt("THEME_RES_ID_KEY");
        this.f3 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.fh = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        int i5;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f2695co);
        this.f2697hw = new h2.n3(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthF = this.d0.f();
        if (com.google.android.material.datepicker.n3.y0(contextThemeWrapper)) {
            i = R$layout.f2261co;
            i5 = 1;
        } else {
            i = R$layout.f2268p;
            i5 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(R$id.f2240i4);
        ut.g3(gridView, new n3());
        gridView.setAdapter((ListAdapter) new h2.v());
        gridView.setNumColumns(monthF.f2680s);
        gridView.setEnabled(false);
        this.qn = viewInflate.findViewById(R$id.c);
        this.qn.setLayoutManager(new zn(getContext(), i5, false, i5));
        this.qn.setTag(q9);
        com.google.android.material.datepicker.gv gvVar = new com.google.android.material.datepicker.gv(contextThemeWrapper, this.f3, this.d0, new gv());
        this.qn.setAdapter(gvVar);
        int integer = contextThemeWrapper.getResources().getInteger(R$integer.n3);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(R$id.d0);
        this.f2698j5 = recyclerViewFindViewById;
        if (recyclerViewFindViewById != null) {
            recyclerViewFindViewById.setHasFixedSize(true);
            this.f2698j5.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer, 1, false));
            this.f2698j5.setAdapter(new com.google.android.material.datepicker.v(this));
            this.f2698j5.addItemDecoration(bx());
        }
        if (viewInflate.findViewById(R$id.f2245p) != null) {
            rk(viewInflate, gvVar);
        }
        if (!com.google.android.material.datepicker.n3.y0(contextThemeWrapper)) {
            new tl().attachToRecyclerView(this.qn);
        }
        this.qn.scrollToPosition(gvVar.t(this.fh));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f2695co);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f3);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.fh);
    }

    public void op(Month month) {
        com.google.android.material.datepicker.gv gvVar = (com.google.android.material.datepicker.gv) this.qn.getAdapter();
        int iT = gvVar.t(month);
        int iT2 = iT - gvVar.t(this.fh);
        boolean z = Math.abs(iT2) > 3;
        boolean z5 = iT2 > 0;
        this.fh = month;
        if (z && z5) {
            this.qn.scrollToPosition(iT - 3);
            m5(iT);
        } else if (!z) {
            m5(iT);
        } else {
            this.qn.scrollToPosition(iT + 3);
            m5(iT);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.TextView, com.google.android.material.button.MaterialButton] */
    public final void rk(@NonNull View view, @NonNull com.google.android.material.datepicker.gv gvVar) {
        ?? r02 = (MaterialButton) view.findViewById(R$id.f2245p);
        r02.setTag(jz);
        ut.g3((View) r02, new a());
        AppCompatButton appCompatButton = (MaterialButton) view.findViewById(R$id.f2233co);
        appCompatButton.setTag(f7);
        AppCompatButton appCompatButton2 = (MaterialButton) view.findViewById(R$id.f2244mt);
        appCompatButton2.setTag(en);
        this.oz = view.findViewById(R$id.d0);
        this.f2699ut = view.findViewById(R$id.f2255x4);
        gm(f.DAY);
        r02.setText(this.fh.s(view.getContext()));
        this.qn.addOnScrollListener(new fb(gvVar, r02));
        r02.setOnClickListener(new s());
        appCompatButton2.setOnClickListener(new c5(gvVar));
        appCompatButton.setOnClickListener(new i9(gvVar));
    }

    @NonNull
    public LinearLayoutManager t6() {
        return this.qn.getLayoutManager();
    }
}
