package n7;

import androidx.annotation.Nullable;
import gn.zn;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class p<K, A> extends y<K, A> {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final A f6919c5;

    public p(zn<A> znVar) {
        this(znVar, null);
    }

    @Override // n7.y
    public A c5(gn.y<K> yVar, float f3) {
        return s();
    }

    @Override // n7.y
    public void f() {
        if (this.f6935v != null) {
            super.f();
        }
    }

    @Override // n7.y
    public A s() {
        zn<A> znVar = this.f6935v;
        A a6 = this.f6919c5;
        return znVar.n3(0.0f, 0.0f, a6, a6, a(), a(), a());
    }

    @Override // n7.y
    public void tl(float f3) {
        this.f6933gv = f3;
    }

    @Override // n7.y
    public float zn() {
        return 1.0f;
    }

    public p(zn<A> znVar, @Nullable A a6) {
        super(Collections.emptyList());
        wz(znVar);
        this.f6919c5 = a6;
    }
}
