package kl1;

import cl1.zn;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<el1.y, zn<?>> y(Pair<el1.y, ? extends zn<?>> pair, KClass<?> clazz) throws bl1.n3 {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ((zn) pair.getSecond()).zn().a(CollectionsKt.plus(((zn) pair.getSecond()).zn().v(), clazz));
        ((el1.y) pair.getFirst()).v(al1.n3.y(clazz, ((zn) pair.getSecond()).zn().zn(), ((zn) pair.getSecond()).zn().gv()), (zn) pair.getSecond(), true);
        return pair;
    }
}
