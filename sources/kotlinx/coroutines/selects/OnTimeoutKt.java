package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class OnTimeoutKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        selectBuilder.invoke(new OnTimeout(j).getSelectClause(), (Function1<? super Continuation<? super Object>, ? extends Object>) function1);
    }
}
