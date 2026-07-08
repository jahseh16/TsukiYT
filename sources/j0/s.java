package j0;

import b0.c5;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class s implements c5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f5785f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Map<String, fb> f5786fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map<String, v> f5787s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long[] f5788v;
    public final gv y;

    public s(gv gvVar, Map<String, fb> map, Map<String, v> map2, Map<String, String> map3) {
        this.y = gvVar;
        this.f5787s = map2;
        this.f5785f = map3;
        this.f5786fb = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f5788v = gvVar.i9();
    }

    @Override // b0.c5
    public int gv() {
        return this.f5788v.length;
    }

    @Override // b0.c5
    public List<b0.n3> n3(long j) {
        return this.y.s(j, this.f5786fb, this.f5787s, this.f5785f);
    }

    @Override // b0.c5
    public int y(long j) {
        int iV = ut.v(this.f5788v, j, false, false);
        if (iV < this.f5788v.length) {
            return iV;
        }
        return -1;
    }

    @Override // b0.c5
    public long zn(int i) {
        return this.f5788v[i];
    }
}
