package nj1;

import kj1.gv;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ij1.zn<s> {
    public static final f y = new f();
    public static final kj1.a n3 = kj1.c5.zn("kotlinx.serialization.json.JsonElement", gv.n3.y, new kj1.a[0], y.y);

    public static final class y extends Lambda implements Function1<kj1.y, Unit> {
        public static final y y = new y();

        public static final class gv extends Lambda implements Function0<kj1.a> {
            public static final gv y = new gv();

            public gv() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final kj1.a invoke() {
                return i4.y.getDescriptor();
            }
        }

        public static final class n3 extends Lambda implements Function0<kj1.a> {
            public static final n3 y = new n3();

            public n3() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final kj1.a invoke() {
                return z.y.getDescriptor();
            }
        }

        public static final class v extends Lambda implements Function0<kj1.a> {
            public static final v y = new v();

            public v() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final kj1.a invoke() {
                return nj1.zn.y.getDescriptor();
            }
        }

        /* JADX INFO: renamed from: nj1.f$y$y, reason: collision with other inner class name */
        public static final class C0138y extends Lambda implements Function0<kj1.a> {
            public static final C0138y y = new C0138y();

            public C0138y() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final kj1.a invoke() {
                return n.y.getDescriptor();
            }
        }

        public static final class zn extends Lambda implements Function0<kj1.a> {
            public static final zn y = new zn();

            public zn() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final kj1.a invoke() {
                return p.y.getDescriptor();
            }
        }

        public y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kj1.y yVar) {
            y(yVar);
            return Unit.INSTANCE;
        }

        public final void y(kj1.y buildSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
            kj1.y.n3(buildSerialDescriptor, "JsonPrimitive", t.a(C0138y.y), null, false, 12, null);
            kj1.y.n3(buildSerialDescriptor, "JsonNull", t.a(n3.y), null, false, 12, null);
            kj1.y.n3(buildSerialDescriptor, "JsonLiteral", t.a(zn.y), null, false, 12, null);
            kj1.y.n3(buildSerialDescriptor, "JsonObject", t.a(gv.y), null, false, 12, null);
            kj1.y.n3(buildSerialDescriptor, "JsonArray", t.a(v.y), null, false, 12, null);
        }
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return n3;
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, s value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        t.s(encoder);
        if (value instanceof f3) {
            encoder.c5(n.y, value);
        } else if (value instanceof r) {
            encoder.c5(i4.y, value);
        } else if (value instanceof n3) {
            encoder.c5(zn.y, value);
        }
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public s deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return t.gv(decoder).fb();
    }
}
