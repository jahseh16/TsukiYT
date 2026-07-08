package mj1;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class z6<T extends Enum<T>> implements ij1.zn<T> {
    public kj1.a n3;
    public final T[] y;
    public final Lazy zn;

    public static final class y extends Lambda implements Function0<kj1.a> {
        final /* synthetic */ String $serialName;
        final /* synthetic */ z6<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(z6<T> z6Var, String str) {
            super(0);
            this.this$0 = z6Var;
            this.$serialName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final kj1.a invoke() {
            kj1.a aVar = this.this$0.n3;
            return aVar == null ? this.this$0.zn(this.$serialName) : aVar;
        }
    }

    public z6(String serialName, T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.y = values;
        this.zn = LazyKt.lazy(new y(this, serialName));
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public kj1.a getDescriptor() {
        return (kj1.a) this.zn.getValue();
    }

    @Override // ij1.n3
    /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
    public T deserialize(lj1.v decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iFh = decoder.fh(getDescriptor());
        if (iFh >= 0) {
            T[] tArr = this.y;
            if (iFh < tArr.length) {
                return tArr[iFh];
            }
        }
        throw new ij1.i9(iFh + " is not among valid " + getDescriptor().s() + " enum values, values size is " + this.y.length);
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().s() + '>';
    }

    @Override // ij1.f
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void serialize(lj1.a encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int iIndexOf = ArraysKt.indexOf(this.y, value);
        if (iIndexOf != -1) {
            encoder.r(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().s());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.y);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new ij1.i9(sb.toString());
    }

    public final kj1.a zn(String str) {
        d dVar = new d(str, this.y.length);
        for (T t3 : this.y) {
            rb.t(dVar, t3.name(), false, 2, null);
        }
        return dVar;
    }
}
