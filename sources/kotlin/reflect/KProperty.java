package kotlin.reflect;

/* JADX INFO: loaded from: classes.dex */
public interface KProperty<V> extends KCallable<V> {

    public interface Getter<V> extends KFunction<V> {
    }

    boolean isConst();

    boolean isLateinit();
}
