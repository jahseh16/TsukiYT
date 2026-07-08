package oj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends lj1.n3 implements nj1.tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj1.a f7150a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f7151fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final nj1.tl[] f7152gv;
    public final nj1.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f7153s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final pj1.zn f7154v;
    public final f y;
    public final en zn;

    public /* synthetic */ class y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[en.values().length];
            try {
                iArr[en.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[en.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[en.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            y = iArr;
        }
    }

    public j(f composer, nj1.y json, en mode, nj1.tl[] tlVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.y = composer;
        this.n3 = json;
        this.zn = mode;
        this.f7152gv = tlVarArr;
        this.f7154v = gv().y();
        this.f7150a = gv().v();
        int iOrdinal = mode.ordinal();
        if (tlVarArr != null) {
            nj1.tl tlVar = tlVarArr[iOrdinal];
            if (tlVar == null && tlVar == this) {
                return;
            }
            tlVarArr[iOrdinal] = this;
        }
    }

    @Override // lj1.n3, lj1.a
    public void a(double d4) {
        if (this.f7151fb) {
            z6(String.valueOf(d4));
        } else {
            this.y.a(d4);
        }
        if (this.f7150a.y()) {
            return;
        }
        if (Double.isInfinite(d4) || Double.isNaN(d4)) {
            throw fh.n3(Double.valueOf(d4), this.y.y.toString());
        }
    }

    public final void b(kj1.a aVar) {
        this.y.zn();
        String str = this.f7153s;
        Intrinsics.checkNotNull(str);
        z6(str);
        this.y.v(':');
        this.y.xc();
        z6(aVar.s());
    }

    @Override // lj1.n3, lj1.a
    public void c(char c) {
        z6(String.valueOf(c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lj1.n3, lj1.a
    public <T> void c5(ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (!(serializer instanceof mj1.n3) || gv().v().f()) {
            serializer.serialize(this, t3);
            return;
        }
        mj1.n3 n3Var = (mj1.n3) serializer;
        String strZn = j5.zn(serializer.getDescriptor(), gv());
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type kotlin.Any");
        ij1.f fVarN3 = ij1.fb.n3(n3Var, this, t3);
        j5.a(n3Var, fVarN3, strZn);
        j5.n3(fVarN3.getDescriptor().getKind());
        this.f7153s = strZn;
        fVarN3.serialize(this, t3);
    }

    @Override // lj1.n3, lj1.gv
    public boolean co(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f7150a.v();
    }

    @Override // lj1.n3
    public boolean ej(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i5 = y.y[this.zn.ordinal()];
        if (i5 != 1) {
            boolean z = false;
            if (i5 != 2) {
                if (i5 != 3) {
                    if (!this.y.y()) {
                        this.y.v(',');
                    }
                    this.y.zn();
                    z6(descriptor.v(i));
                    this.y.v(':');
                    this.y.xc();
                } else {
                    if (i == 0) {
                        this.f7151fb = true;
                    }
                    if (i == 1) {
                        this.y.v(',');
                        this.y.xc();
                        this.f7151fb = false;
                    }
                }
            } else if (this.y.y()) {
                this.f7151fb = true;
                this.y.zn();
            } else {
                if (i % 2 == 0) {
                    this.y.v(',');
                    this.y.zn();
                    z = true;
                } else {
                    this.y.v(':');
                    this.y.xc();
                }
                this.f7151fb = z;
            }
        } else {
            if (!this.y.y()) {
                this.y.v(',');
            }
            this.y.zn();
        }
        return true;
    }

    @Override // lj1.n3, lj1.a
    public void f3(float f3) {
        if (this.f7151fb) {
            z6(String.valueOf(f3));
        } else {
            this.y.fb(f3);
        }
        if (this.f7150a.y()) {
            return;
        }
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw fh.n3(Float.valueOf(f3), this.y.y.toString());
        }
    }

    @Override // lj1.n3, lj1.a
    public void fb(byte b4) {
        if (this.f7151fb) {
            z6(String.valueOf((int) b4));
        } else {
            this.y.gv(b4);
        }
    }

    @Override // nj1.tl
    public nj1.y gv() {
        return this.n3;
    }

    @Override // lj1.n3, lj1.gv
    public <T> void i4(kj1.a descriptor, int i, ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t3 != null || this.f7150a.a()) {
            super.i4(descriptor, i, serializer, t3);
        }
    }

    @Override // nj1.tl
    public void i9(nj1.s element) {
        Intrinsics.checkNotNullParameter(element, "element");
        c5(nj1.f.y, element);
    }

    @Override // lj1.n3, lj1.a
    public void mg(int i) {
        if (this.f7151fb) {
            z6(String.valueOf(i));
        } else {
            this.y.s(i);
        }
    }

    @Override // lj1.n3, lj1.a
    public lj1.gv n3(kj1.a descriptor) {
        nj1.tl tlVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        en enVarN3 = jz.n3(gv(), descriptor);
        char c = enVarN3.begin;
        if (c != 0) {
            this.y.v(c);
            this.y.n3();
        }
        if (this.f7153s != null) {
            b(descriptor);
            this.f7153s = null;
        }
        if (this.zn == enVarN3) {
            return this;
        }
        nj1.tl[] tlVarArr = this.f7152gv;
        return (tlVarArr == null || (tlVar = tlVarArr[enVarN3.ordinal()]) == null) ? new j(this.y, gv(), enVarN3, this.f7152gv) : tlVar;
    }

    @Override // lj1.n3, lj1.a
    public void p(short s3) {
        if (this.f7151fb) {
            z6(String.valueOf((int) s3));
        } else {
            this.y.f(s3);
        }
    }

    @Override // lj1.n3, lj1.a
    public void r(kj1.a enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        z6(enumDescriptor.v(i));
    }

    @Override // lj1.n3, lj1.a
    public void w() {
        this.y.i9("null");
    }

    @Override // lj1.n3, lj1.a
    public void wz(long j) {
        if (this.f7151fb) {
            z6(String.valueOf(j));
        } else {
            this.y.c5(j);
        }
    }

    public final f x() {
        f fVar = this.y;
        return fVar instanceof mt ? fVar : new mt(fVar.y, this.f7151fb);
    }

    @Override // lj1.n3, lj1.a
    public lj1.a xc(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return oz.y(descriptor) ? new j(x(), gv(), this.zn, (nj1.tl[]) null) : super.xc(descriptor);
    }

    @Override // lj1.a
    public pj1.zn y() {
        return this.f7154v;
    }

    @Override // lj1.n3, lj1.a
    public void z(boolean z) {
        if (this.f7151fb) {
            z6(String.valueOf(z));
        } else {
            this.y.t(z);
        }
    }

    @Override // lj1.n3, lj1.a
    public void z6(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.y.tl(value);
    }

    @Override // lj1.n3, lj1.gv
    public void zn(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.zn.end != 0) {
            this.y.w();
            this.y.zn();
            this.y.v(this.zn.end);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(hw output, nj1.y json, en mode, nj1.tl[] modeReuseCache) {
        this(z.y(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
