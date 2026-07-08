package y7;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface gv<T> {
    @NonNull
    T create(@NonNull Context context);

    @NonNull
    List<Class<? extends gv<?>>> dependencies();
}
