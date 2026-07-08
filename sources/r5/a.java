package r5;

import r5.fb;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fb.n3 f7655a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public fb.n3 f7656gv;
    public v n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f7657v;
    public n3$mt y;
    public String zn;

    public a() {
        this.y = null;
        this.n3 = null;
        this.zn = null;
        this.f7656gv = null;
        this.f7657v = null;
        this.f7655a = null;
    }

    public boolean a() {
        return this.f7655a != null;
    }

    public a fb(float f3, float f4, float f5, float f7) {
        this.f7655a = new fb.n3(f3, f4, f5, f7);
        return this;
    }

    public boolean gv() {
        return this.f7657v != null;
    }

    public boolean n3() {
        return this.n3 != null;
    }

    public boolean v() {
        return this.f7656gv != null;
    }

    public boolean y() {
        n3$mt n3_mt = this.y;
        return n3_mt != null && n3_mt.a() > 0;
    }

    public boolean zn() {
        return this.zn != null;
    }

    public a(a aVar) {
        this.y = null;
        this.n3 = null;
        this.zn = null;
        this.f7656gv = null;
        this.f7657v = null;
        this.f7655a = null;
        if (aVar == null) {
            return;
        }
        this.y = aVar.y;
        this.n3 = aVar.n3;
        this.f7656gv = aVar.f7656gv;
        this.f7657v = aVar.f7657v;
        this.f7655a = aVar.f7655a;
    }
}
