package nj1;

import java.lang.annotation.Annotation;
import java.util.List;
import kj1.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static final class y implements kj1.a {
        public final Lazy y;

        public y(Function0<? extends kj1.a> function0) {
            this.y = LazyKt.lazy(function0);
        }

        @Override // kj1.a
        public List<Annotation> a(int i) {
            return y().a(i);
        }

        @Override // kj1.a
        public boolean c5(int i) {
            return y().c5(i);
        }

        @Override // kj1.a
        public kj1.a fb(int i) {
            return y().fb(i);
        }

        @Override // kj1.a
        public List<Annotation> getAnnotations() {
            return a.y.y(this);
        }

        @Override // kj1.a
        public kj1.i9 getKind() {
            return y().getKind();
        }

        @Override // kj1.a
        public int gv() {
            return y().gv();
        }

        @Override // kj1.a
        public boolean isInline() {
            return a.y.n3(this);
        }

        @Override // kj1.a
        public boolean n3() {
            return a.y.zn(this);
        }

        @Override // kj1.a
        public String s() {
            return y().s();
        }

        @Override // kj1.a
        public String v(int i) {
            return y().v(i);
        }

        public final kj1.a y() {
            return (kj1.a) this.y.getValue();
        }

        @Override // kj1.a
        public int zn(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return y().zn(name);
        }
    }

    public static final kj1.a a(Function0<? extends kj1.a> function0) {
        return new y(function0);
    }

    public static final void fb(lj1.v vVar) {
        gv(vVar);
    }

    public static final fb gv(lj1.v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        fb fbVar = vVar instanceof fb ? (fb) vVar : null;
        if (fbVar != null) {
            return fbVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(vVar.getClass()));
    }

    public static final void s(lj1.a aVar) {
        v(aVar);
    }

    public static final tl v(lj1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        tl tlVar = aVar instanceof tl ? (tl) aVar : null;
        if (tlVar != null) {
            return tlVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(aVar.getClass()));
    }
}
