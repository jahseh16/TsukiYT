package ap;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: classes.dex */
public final class k5 {
    public static final CoroutineScope y(b bVar) {
        CoroutineScope coroutineScope = (CoroutineScope) bVar.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        return coroutineScope != null ? coroutineScope : (CoroutineScope) bVar.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new zn(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate())));
    }
}
