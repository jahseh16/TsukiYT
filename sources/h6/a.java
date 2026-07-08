package h6;

import android.net.Uri;
import androidx.annotation.Nullable;
import ft.g;
import java.util.List;
import java.util.Map;
import r0.j5;
import r0.p;
import r0.ta;
import ur.i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ta.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f5285a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final j5 f5286c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f5287fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final g f5288gv;
    public final p n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f5289s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5290v;
    public final long y = i4.y();
    public final int zn;

    public a(r0.tl tlVar, p pVar, int i, g gVar, int i5, @Nullable Object obj, long j, long j4) {
        this.f5286c5 = new j5(tlVar);
        this.n3 = (p) v0.y.v(pVar);
        this.zn = i;
        this.f5288gv = gVar;
        this.f5290v = i5;
        this.f5285a = obj;
        this.f5287fb = j;
        this.f5289s = j4;
    }

    public final Uri gv() {
        return this.f5286c5.c5();
    }

    public final long n3() {
        return this.f5289s - this.f5287fb;
    }

    public final long y() {
        return this.f5286c5.a();
    }

    public final Map<String, List<String>> zn() {
        return this.f5286c5.p();
    }
}
