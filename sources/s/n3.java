package s;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3<I> {
    @NonNull
    public abstract c5.y<I, ?> getContract();

    public void launch(@SuppressLint({"UnknownNullness"}) I i) {
        launch(i, null);
    }

    public abstract void launch(@SuppressLint({"UnknownNullness"}) I i, @Nullable ta.gv gvVar);

    public abstract void unregister();
}
