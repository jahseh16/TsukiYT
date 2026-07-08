package kotlin.reflect;

/* JADX INFO: loaded from: classes.dex */
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {
    String getSimpleName();

    int hashCode();

    boolean isInstance(Object obj);
}
