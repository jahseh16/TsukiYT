package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.y;
import h2.xc;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class v extends RecyclerView.s<n3> {
    public final com.google.android.material.datepicker.y<?> y;

    public static class n3 extends RecyclerView.ta {
        public final TextView n3;

        public n3(TextView textView) {
            super(textView);
            this.n3 = textView;
        }
    }

    public class y implements View.OnClickListener {
        public final /* synthetic */ int y;

        public y(int i) {
            this.y = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v.this.y.op(v.this.y.ja().v(Month.n3(this.y, v.this.y.gd().f2682v)));
            v.this.y.gm(y.f.DAY);
        }
    }

    public v(com.google.android.material.datepicker.y<?> yVar) {
        this.y = yVar;
    }

    public int getItemCount() {
        return this.y.ja().tl();
    }

    public int i9(int i) {
        return i - this.y.ja().f().f2679fb;
    }

    public int t(int i) {
        return this.y.ja().f().f2679fb + i;
    }

    /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull n3 n3Var, int i) {
        int iT = t(i);
        String string = n3Var.n3.getContext().getString(R$string.f2291xc);
        n3Var.n3.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iT)));
        n3Var.n3.setContentDescription(String.format(string, Integer.valueOf(iT)));
        h2.n3 n3VarCp = this.y.cp();
        Calendar calendarC5 = xc.c5();
        h2.y yVar = calendarC5.get(1) == iT ? n3VarCp.f5274a : n3VarCp.f5276gv;
        Iterator<Long> it = this.y.ng().kp().iterator();
        while (it.hasNext()) {
            calendarC5.setTimeInMillis(it.next().longValue());
            if (calendarC5.get(1) == iT) {
                yVar = n3VarCp.f5278v;
            }
        }
        yVar.gv(n3Var.n3);
        n3Var.n3.setOnClickListener(v(iT));
    }

    @NonNull
    public final View.OnClickListener v(int i) {
        return new y(i);
    }

    @NonNull
    /* JADX INFO: renamed from: wz, reason: merged with bridge method [inline-methods] */
    public n3 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new n3((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.z, viewGroup, false));
    }
}
