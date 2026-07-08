package mj1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import lj1.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3<T> implements ij1.zn<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ij1.n3
    public final T deserialize(lj1.v decoder) {
        T t3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kj1.a descriptor = getDescriptor();
        lj1.zn znVarN3 = decoder.n3(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (znVarN3.tl()) {
            t3 = (T) n3(znVarN3);
        } else {
            t3 = null;
            while (true) {
                int iX4 = znVarN3.x4(getDescriptor());
                if (iX4 != -1) {
                    if (iX4 == 0) {
                        ref$ObjectRef.element = (T) znVarN3.mg(getDescriptor(), iX4);
                    } else {
                        if (iX4 != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iX4);
                            throw new ij1.i9(sb.toString());
                        }
                        T t5 = ref$ObjectRef.element;
                        if (t5 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        ref$ObjectRef.element = t5;
                        t3 = (T) zn.y.zn(znVarN3, getDescriptor(), iX4, ij1.fb.y(this, znVarN3, (String) t5), null, 8, null);
                    }
                } else {
                    if (t3 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                    }
                    Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                }
            }
        }
        znVarN3.zn(descriptor);
        return t3;
    }

    public ij1.f<T> gv(lj1.a encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.y().v(v(), value);
    }

    public final T n3(lj1.zn znVar) {
        return (T) zn.y.zn(znVar, getDescriptor(), 1, ij1.fb.y(this, znVar, znVar.mg(getDescriptor(), 0)), null, 8, null);
    }

    @Override // ij1.f
    public final void serialize(lj1.a encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        ij1.f<? super T> fVarN3 = ij1.fb.n3(this, encoder, value);
        kj1.a descriptor = getDescriptor();
        lj1.gv gvVarN3 = encoder.n3(descriptor);
        gvVarN3.v(getDescriptor(), 0, fVarN3.getDescriptor().s());
        kj1.a descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(fVarN3, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        gvVarN3.n(descriptor2, 1, fVarN3, value);
        gvVarN3.zn(descriptor);
    }

    public abstract KClass<T> v();

    public ij1.n3<? extends T> zn(lj1.zn decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.y().gv(v(), str);
    }
}
