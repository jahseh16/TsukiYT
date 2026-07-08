package h2;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class i9 extends LinearLayoutManager {

    public class y extends androidx.recyclerview.widget.c5 {
        public y(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public i9(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.fh fhVar, int i) {
        y yVar = new y(recyclerView.getContext());
        yVar.setTargetPosition(i);
        startSmoothScroll(yVar);
    }
}
