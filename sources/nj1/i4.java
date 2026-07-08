package nj1;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class i4 implements ij1.zn<r> {
    public static final i4 y = new i4();
    public static final kj1.a n3 = y.n3;

    public static final class y implements kj1.a {
        public static final y n3 = new y();
        public static final String zn = "kotlinx.serialization.json.JsonObject";
        public final /* synthetic */ kj1.a y = jj1.y.f(jj1.y.z6(StringCompanionObject.INSTANCE), f.y).getDescriptor();

        @Override // kj1.a
        public List<Annotation> a(int i) {
            return this.y.a(i);
        }

        @Override // kj1.a
        public boolean c5(int i) {
            return this.y.c5(i);
        }

        @Override // kj1.a
        public kj1.a fb(int i) {
            return this.y.fb(i);
        }

        @Override // kj1.a
        public List<Annotation> getAnnotations() {
            return this.y.getAnnotations();
        }

        @Override // kj1.a
        public kj1.i9 getKind() {
            return this.y.getKind();
        }

        @Override // kj1.a
        public int gv() {
            return this.y.gv();
        }

        @Override // kj1.a
        public boolean isInline() {
            return this.y.isInline();
        }

        @Override // kj1.a
        public boolean n3() {
            return this.y.n3();
        }

        @Override // kj1.a
        public String s() {
            return zn;
        }

        @Override // kj1.a
        public String v(int i) {
            return this.y.v(i);
        }

        @Override // kj1.a
        public int zn(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.y.zn(name);
        }
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, r value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        t.s(encoder);
        jj1.y.f(jj1.y.z6(StringCompanionObject.INSTANCE), f.y).serialize(encoder, value);
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public r deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        t.fb(decoder);
        return new r((Map) jj1.y.f(jj1.y.z6(StringCompanionObject.INSTANCE), f.y).deserialize(decoder));
    }
}
