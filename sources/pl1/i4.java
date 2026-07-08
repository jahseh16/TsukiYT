package pl1;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<?> f7305gv;
    public final Object n3;
    public final Class<?> y;
    public final Method zn;

    public i4(Class<?> cls, Object obj, Method method, List<?> list) {
        this.y = cls;
        this.n3 = obj;
        this.zn = method;
        this.f7305gv = Collections.unmodifiableList(list);
    }

    public Class<?> n3() {
        return this.y;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.y.getName(), this.zn.getName(), this.f7305gv);
    }

    public Method y() {
        return this.zn;
    }
}
