package ol1;

/* JADX INFO: loaded from: classes.dex */
public interface n3<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t3);

    void onSubscribe(zn znVar);
}
