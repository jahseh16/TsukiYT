package mj1;

import java.util.Iterator;
import kj1.f;
import kj1.i9;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class d extends rb {

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final kj1.i9 f6502tl;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final Lazy f6503wz;

    public static final class y extends Lambda implements Function0<kj1.a[]> {
        final /* synthetic */ int $elementsCount;
        final /* synthetic */ String $name;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i, String str, d dVar) {
            super(0);
            this.$elementsCount = i;
            this.$name = str;
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final kj1.a[] invoke() {
            int i = this.$elementsCount;
            kj1.a[] aVarArr = new kj1.a[i];
            for (int i5 = 0; i5 < i; i5++) {
                aVarArr[i5] = kj1.c5.gv(this.$name + '.' + this.this$0.v(i5), f.gv.y, new kj1.a[0], null, 8, null);
            }
            return aVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String name, int i) {
        super(name, null, i, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6502tl = i9.n3.y;
        this.f6503wz = LazyKt.lazy(new y(i, name, this));
    }

    @Override // mj1.rb
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kj1.a)) {
            return false;
        }
        kj1.a aVar = (kj1.a) obj;
        return aVar.getKind() == i9.n3.y && Intrinsics.areEqual(s(), aVar.s()) && Intrinsics.areEqual(yc.y(this), yc.y(aVar));
    }

    @Override // mj1.rb, kj1.a
    public kj1.a fb(int i) {
        return p()[i];
    }

    @Override // mj1.rb, kj1.a
    public kj1.i9 getKind() {
        return this.f6502tl;
    }

    @Override // mj1.rb
    public int hashCode() {
        int iHashCode = s().hashCode();
        Iterator<String> it = kj1.s.n3(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public final kj1.a[] p() {
        return (kj1.a[]) this.f6503wz.getValue();
    }

    @Override // mj1.rb
    public String toString() {
        return CollectionsKt.joinToString$default(kj1.s.n3(this), ", ", s() + '(', ")", 0, null, null, 56, null);
    }
}
