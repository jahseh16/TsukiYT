package mj1;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f3<E, C extends Collection<? extends E>, B> extends i4<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(ij1.zn<E> element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int v(C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.size();
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: xc, reason: merged with bridge method [inline-methods] */
    public Iterator<E> gv(C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.iterator();
    }
}
