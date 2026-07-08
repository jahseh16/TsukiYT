package le;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends RecyclerView.ta {
    public n3(@NonNull FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NonNull
    public static n3 y(@NonNull ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ut.tl());
        frameLayout.setSaveEnabled(false);
        return new n3(frameLayout);
    }

    @NonNull
    public FrameLayout n3() {
        return (FrameLayout) ((RecyclerView.ta) this).itemView;
    }
}
