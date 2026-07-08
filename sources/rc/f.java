package rc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class f extends RecyclerView.ta {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public View.OnLongClickListener f7744fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public xc f7745gv;
    public t n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View.OnClickListener f7746v;
    public wz zn;

    public class n3 implements View.OnLongClickListener {
        public n3() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(@NonNull View view) {
            if (f.this.f7745gv == null || f.this.getAdapterPosition() == -1) {
                return false;
            }
            return f.this.f7745gv.y(f.this.gv(), view);
        }
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (f.this.zn == null || f.this.getAdapterPosition() == -1) {
                return;
            }
            f.this.zn.y(f.this.gv(), view);
        }
    }

    public f(@NonNull View view) {
        super(view);
        this.f7746v = new y();
        this.f7744fb = new n3();
    }

    public void a() {
        if (this.zn != null && this.n3.oz()) {
            ((RecyclerView.ta) this).itemView.setOnClickListener(null);
        }
        if (this.f7745gv != null && this.n3.q9()) {
            ((RecyclerView.ta) this).itemView.setOnLongClickListener(null);
        }
        this.n3 = null;
        this.zn = null;
        this.f7745gv = null;
    }

    public t gv() {
        return this.n3;
    }

    public View v() {
        return ((RecyclerView.ta) this).itemView;
    }

    public void zn(@NonNull t tVar, @Nullable wz wzVar, @Nullable xc xcVar) {
        this.n3 = tVar;
        if (wzVar != null && tVar.oz()) {
            ((RecyclerView.ta) this).itemView.setOnClickListener(this.f7746v);
            this.zn = wzVar;
        }
        if (xcVar == null || !tVar.q9()) {
            return;
        }
        ((RecyclerView.ta) this).itemView.setOnLongClickListener(this.f7744fb);
        this.f7745gv = xcVar;
    }
}
