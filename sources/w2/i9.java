package w2;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes.dex */
public class i9 {
    public Runnable n3;
    public ViewGroup y;

    @Nullable
    public static i9 n3(@NonNull ViewGroup viewGroup) {
        return (i9) viewGroup.getTag(R$id.n3);
    }

    public static void zn(@NonNull ViewGroup viewGroup, @Nullable i9 i9Var) {
        viewGroup.setTag(R$id.n3, i9Var);
    }

    public void y() {
        Runnable runnable;
        if (n3(this.y) != this || (runnable = this.n3) == null) {
            return;
        }
        runnable.run();
    }
}
