package oj1;

import kj1.f;
import kj1.i9;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mj1.eb;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv extends eb implements nj1.tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final nj1.a f7148gv;
    public final nj1.y n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f7149v;
    public final Function1<nj1.s, Unit> zn;

    public static final class n3 extends lj1.n3 {
        public final pj1.zn y;
        public final /* synthetic */ String zn;

        public n3(String str) {
            this.zn = str;
            this.y = gv.this.gv().y();
        }

        @Override // lj1.n3, lj1.a
        public void fb(byte b4) {
            x(UByte.m44toStringimpl(UByte.m41constructorimpl(b4)));
        }

        @Override // lj1.n3, lj1.a
        public void mg(int i) {
            x(Long.toString(((long) UInt.m63constructorimpl(i)) & 4294967295L, 10));
        }

        @Override // lj1.n3, lj1.a
        public void p(short s3) {
            x(UShort.m110toStringimpl(UShort.m107constructorimpl(s3)));
        }

        @Override // lj1.n3, lj1.a
        public void wz(long j) {
            x(s.y(ULong.m85constructorimpl(j), 10));
        }

        public final void x(String s3) {
            Intrinsics.checkNotNullParameter(s3, "s");
            gv.this.rb(this.zn, new nj1.w(s3, false));
        }

        @Override // lj1.a
        public pj1.zn y() {
            return this.y;
        }
    }

    public static final class y extends Lambda implements Function1<nj1.s, Unit> {
        public y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(nj1.s sVar) {
            y(sVar);
            return Unit.INSTANCE;
        }

        public final void y(nj1.s node) {
            Intrinsics.checkNotNullParameter(node, "node");
            gv gvVar = gv.this;
            gvVar.rb(gv.dm(gvVar), node);
        }
    }

    public /* synthetic */ gv(nj1.y yVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, function1);
    }

    public static final /* synthetic */ String dm(gv gvVar) {
        return gvVar.ut();
    }

    public void ap(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.co.f6955fb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mj1.qj, lj1.a
    public <T> void c5(ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (q9() == null && f7.n3(jz.y(serializer.getDescriptor(), y()))) {
            d dVar = new d(this.n3, this.zn);
            dVar.c5(serializer, t3);
            dVar.oz(serializer.getDescriptor());
        } else {
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
            this.f7149v = strZn;
            fVarN3.serialize(this, t3);
        }
    }

    @Override // lj1.gv
    public boolean co(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f7148gv.v();
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: ct, reason: merged with bridge method [inline-methods] */
    public void a8(String tag, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.y(Boolean.valueOf(z)));
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void j5(String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.n3(Integer.valueOf(i)));
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: eb, reason: merged with bridge method [inline-methods] */
    public void k5(String tag, double d4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.n3(Double.valueOf(d4)));
        if (this.f7148gv.y()) {
            return;
        }
        if (Double.isInfinite(d4) || Double.isNaN(d4)) {
            throw fh.zn(Double.valueOf(d4), tag, kp().toString());
        }
    }

    @Override // nj1.tl
    public final nj1.y gv() {
        return this.n3;
    }

    @Override // nj1.tl
    public void i9(nj1.s element) {
        Intrinsics.checkNotNullParameter(element, "element");
        c5(nj1.f.y, element);
    }

    @Override // mj1.eb
    public String jz(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public abstract nj1.s kp();

    @Override // mj1.qj
    /* JADX INFO: renamed from: lc, reason: merged with bridge method [inline-methods] */
    public void yt(String tag, kj1.a enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        rb(tag, nj1.i9.zn(enumDescriptor.v(i)));
    }

    @Override // lj1.a
    public lj1.gv n3(kj1.a descriptor) {
        gv a8Var;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1 yVar = q9() == null ? this.zn : new y();
        kj1.i9 kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, f.n3.y) ? true : kind instanceof kj1.gv) {
            a8Var = new b(this.n3, yVar);
        } else if (Intrinsics.areEqual(kind, f.zn.y)) {
            nj1.y yVar2 = this.n3;
            kj1.a aVarY = jz.y(descriptor.fb(0), yVar2.y());
            kj1.i9 kind2 = aVarY.getKind();
            if ((kind2 instanceof kj1.v) || Intrinsics.areEqual(kind2, i9.n3.y)) {
                a8Var = new yt(this.n3, yVar);
            } else {
                if (!yVar2.v().n3()) {
                    throw fh.gv(aVarY);
                }
                a8Var = new b(this.n3, yVar);
            }
        } else {
            a8Var = new a8(this.n3, yVar);
        }
        String str = this.f7149v;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            a8Var.rb(str, nj1.i9.zn(descriptor.s()));
            this.f7149v = null;
        }
        return a8Var;
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: nf, reason: merged with bridge method [inline-methods] */
    public void vl(String tag, float f3) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.n3(Float.valueOf(f3)));
        if (this.f7148gv.y()) {
            return;
        }
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw fh.zn(Float.valueOf(f3), tag, kp().toString());
        }
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
    public void x(String tag, byte b4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.n3(Byte.valueOf(b4)));
    }

    @Override // mj1.qj
    public void oz(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.zn.invoke(kp());
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: ra, reason: merged with bridge method [inline-methods] */
    public lj1.a hw(String tag, kj1.a inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return oz.y(inlineDescriptor) ? new n3(tag) : super.hw(tag, inlineDescriptor);
    }

    public abstract void rb(String str, nj1.s sVar);

    @Override // mj1.qj
    /* JADX INFO: renamed from: rs, reason: merged with bridge method [inline-methods] */
    public void b(String tag, char c) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.zn(String.valueOf(c)));
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: s8, reason: merged with bridge method [inline-methods] */
    public void qn(String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.n3(Long.valueOf(j)));
    }

    @Override // lj1.a
    public void w() {
        String strQ9 = q9();
        if (strQ9 == null) {
            this.zn.invoke(nj1.co.f6955fb);
        } else {
            ap(strQ9);
        }
    }

    @Override // lj1.a
    public final pj1.zn y() {
        return this.n3.y();
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: yc, reason: merged with bridge method [inline-methods] */
    public void j(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        rb(tag, nj1.i9.zn(value));
    }

    @Override // mj1.qj
    /* JADX INFO: renamed from: yg, reason: merged with bridge method [inline-methods] */
    public void o(String tag, short s3) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        rb(tag, nj1.i9.n3(Short.valueOf(s3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gv(nj1.y yVar, Function1<? super nj1.s, Unit> function1) {
        this.n3 = yVar;
        this.zn = function1;
        this.f7148gv = yVar.v();
    }

    @Override // lj1.a
    public void d0() {
    }
}
