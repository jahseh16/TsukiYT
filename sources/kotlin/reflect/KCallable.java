package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface KCallable<R> extends KAnnotatedElement {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    KType getReturnType();

    List<Object> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
