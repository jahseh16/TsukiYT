package kotlin.reflect;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface KType extends KAnnotatedElement {
    List<KTypeProjection> getArguments();

    KClassifier getClassifier();

    boolean isMarkedNullable();
}
