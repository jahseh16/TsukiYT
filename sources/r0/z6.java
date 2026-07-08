package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import r0.p;
import r0.ta;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class z6<T> implements ta.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile T f7612a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final j5 f7613gv;
    public final p n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y<? extends T> f7614v;
    public final long y;
    public final int zn;

    public interface y<T> {
        T y(Uri uri, InputStream inputStream) throws IOException;
    }

    public z6(tl tlVar, Uri uri, int i, y<? extends T> yVar) {
        this(tlVar, new p.n3().c5(uri).n3(1).y(), i, yVar);
    }

    public Uri gv() {
        return this.f7613gv.c5();
    }

    @Override // r0.ta.v
    public final void i9() throws IOException {
        this.f7613gv.r();
        xc xcVar = new xc(this.f7613gv, this.n3);
        try {
            xcVar.a();
            this.f7612a = this.f7614v.y((Uri) v0.y.v(this.f7613gv.n3()), xcVar);
        } finally {
            ut.wz(xcVar);
        }
    }

    public Map<String, List<String>> n3() {
        return this.f7613gv.p();
    }

    public long y() {
        return this.f7613gv.a();
    }

    @Nullable
    public final T zn() {
        return this.f7612a;
    }

    public z6(tl tlVar, p pVar, int i, y<? extends T> yVar) {
        this.f7613gv = new j5(tlVar);
        this.n3 = pVar;
        this.zn = i;
        this.f7614v = yVar;
        this.y = ur.i4.y();
    }

    @Override // r0.ta.v
    public final void f() {
    }
}
