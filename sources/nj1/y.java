package nj1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj1.ej;
import oj1.en;
import oj1.k;
import oj1.o;
import oj1.ut;
import oj1.z6;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements ij1.xc {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final C0139y f6974gv = new C0139y(null);
    public final pj1.zn n3;
    public final a y;
    public final oj1.x4 zn;

    /* JADX INFO: renamed from: nj1.y$y, reason: collision with other inner class name */
    public static final class C0139y extends y {
        public /* synthetic */ C0139y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0139y() {
            super(new a(false, false, false, false, false, false, null, false, false, null, false, false, 4095, null), pj1.gv.y(), null);
        }
    }

    public /* synthetic */ y(a aVar, pj1.zn znVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, znVar);
    }

    public final oj1.x4 a() {
        return this.zn;
    }

    public final <T> T gv(ij1.n3<T> deserializer, s element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return (T) k.y(this, element, deserializer);
    }

    @Override // ij1.xc
    public final <T> T n3(ij1.n3<T> deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        ut utVar = new ut(string);
        T t3 = (T) new o(this, en.OBJ, utVar, deserializer.getDescriptor(), null).i4(deserializer);
        utVar.i4();
        return t3;
    }

    public final a v() {
        return this.y;
    }

    @Override // ij1.s
    public pj1.zn y() {
        return this.n3;
    }

    @Override // ij1.xc
    public final <T> String zn(ij1.f<? super T> serializer, T t3) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        ej ejVar = new ej();
        try {
            z6.y(this, ejVar, serializer, t3);
            return ejVar.toString();
        } finally {
            ejVar.fb();
        }
    }

    public y(a aVar, pj1.zn znVar) {
        this.y = aVar;
        this.n3 = znVar;
        this.zn = new oj1.x4();
    }
}
