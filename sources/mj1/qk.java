package mj1;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lj1.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class qk<Tag> implements lj1.v, lj1.zn {
    public boolean n3;
    public final ArrayList<Tag> y = new ArrayList<>();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class n3<T> extends Lambda implements Function0<T> {
        final /* synthetic */ ij1.n3<T> $deserializer;
        final /* synthetic */ T $previousValue;
        final /* synthetic */ qk<Tag> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(qk<Tag> qkVar, ij1.n3<T> n3Var, T t3) {
            super(0);
            this.this$0 = qkVar;
            this.$deserializer = n3Var;
            this.$previousValue = t3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) this.this$0.ud(this.$deserializer, this.$previousValue);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class y<T> extends Lambda implements Function0<T> {
        final /* synthetic */ ij1.n3<T> $deserializer;
        final /* synthetic */ T $previousValue;
        final /* synthetic */ qk<Tag> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(qk<Tag> qkVar, ij1.n3<T> n3Var, T t3) {
            super(0);
            this.this$0 = qkVar;
            this.$deserializer = n3Var;
            this.$previousValue = t3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.this$0.d0() ? (T) this.this$0.ud(this.$deserializer, this.$previousValue) : (T) this.this$0.i9();
        }
    }

    @Override // lj1.zn
    public final float a(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return vl(ut(descriptor, i));
    }

    public abstract boolean a8(Tag tag);

    public abstract char b(Tag tag);

    @Override // lj1.zn
    public final double c(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k5(ut(descriptor, i));
    }

    @Override // lj1.zn
    public final byte c5(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return x(ut(descriptor, i));
    }

    @Override // lj1.zn
    public final int co(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return j5(ut(descriptor, i));
    }

    @Override // lj1.zn
    public final <T> T d(kj1.a descriptor, int i, ij1.n3<T> deserializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) f7(ut(descriptor, i), new n3(this, deserializer, t3));
    }

    @Override // lj1.v
    public abstract boolean d0();

    @Override // lj1.zn
    public final <T> T ej(kj1.a descriptor, int i, ij1.n3<T> deserializer, T t3) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) f7(ut(descriptor, i), new y(this, deserializer, t3));
    }

    @Override // lj1.zn
    public final lj1.v f(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return hw(ut(descriptor, i), descriptor.fb(i));
    }

    @Override // lj1.zn
    public final short f3(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o(ut(descriptor, i));
    }

    public final <E> E f7(Tag tag, Function0<? extends E> function0) {
        k(tag);
        E eInvoke = function0.invoke();
        if (!this.n3) {
            q9();
        }
        this.n3 = false;
        return eInvoke;
    }

    @Override // lj1.v
    public final int fh(kj1.a enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return yt(q9(), enumDescriptor);
    }

    public lj1.v hw(Tag tag, kj1.a inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        k(tag);
        return this;
    }

    @Override // lj1.v
    public abstract <T> T i4(ij1.n3<T> n3Var);

    @Override // lj1.v
    public final Void i9() {
        return null;
    }

    public abstract String j(Tag tag);

    public abstract int j5(Tag tag);

    public final void k(Tag tag) {
        this.y.add(tag);
    }

    public abstract double k5(Tag tag);

    @Override // lj1.zn
    public final String mg(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return j(ut(descriptor, i));
    }

    @Override // lj1.v
    public final double mt() {
        return k5(q9());
    }

    @Override // lj1.v
    public final String n() {
        return j(q9());
    }

    public abstract short o(Tag tag);

    public final Tag oz() {
        return (Tag) CollectionsKt.lastOrNull(this.y);
    }

    @Override // lj1.zn
    public int p(kj1.a aVar) {
        return zn.y.y(this, aVar);
    }

    public final Tag q9() {
        ArrayList<Tag> arrayList = this.y;
        Tag tagRemove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.n3 = true;
        return tagRemove;
    }

    public abstract long qn(Tag tag);

    @Override // lj1.v
    public final char r() {
        return b(q9());
    }

    @Override // lj1.zn
    public final char rz(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return b(ut(descriptor, i));
    }

    @Override // lj1.v
    public final int s() {
        return j5(q9());
    }

    @Override // lj1.v
    public final long t() {
        return qn(q9());
    }

    @Override // lj1.zn
    public final boolean ta(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return a8(ut(descriptor, i));
    }

    @Override // lj1.zn
    public boolean tl() {
        return zn.y.n3(this);
    }

    public <T> T ud(ij1.n3<T> deserializer, T t3) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) i4(deserializer);
    }

    public abstract Tag ut(kj1.a aVar, int i);

    @Override // lj1.v
    public final lj1.v v(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return hw(q9(), descriptor);
    }

    public abstract float vl(Tag tag);

    @Override // lj1.v
    public final float w() {
        return vl(q9());
    }

    @Override // lj1.zn
    public final long wz(kj1.a descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return qn(ut(descriptor, i));
    }

    public abstract byte x(Tag tag);

    @Override // lj1.v
    public final short xc() {
        return o(q9());
    }

    public abstract int yt(Tag tag, kj1.a aVar);

    @Override // lj1.v
    public final boolean z() {
        return a8(q9());
    }

    @Override // lj1.v
    public final byte z6() {
        return x(q9());
    }
}
