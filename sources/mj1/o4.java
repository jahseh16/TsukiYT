package mj1;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import lj1.zn;

/* JADX INFO: loaded from: classes.dex */
public abstract class o4<Key, Value, Collection, Builder extends Map<Key, Value>> extends y<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final ij1.zn<Value> n3;
    public final ij1.zn<Key> y;

    public /* synthetic */ o4(ij1.zn znVar, ij1.zn znVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(znVar, znVar2);
    }

    @Override // ij1.zn, ij1.f, ij1.n3
    public abstract kj1.a getDescriptor();

    @Override // ij1.f
    public void serialize(lj1.a encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iV = v(collection);
        kj1.a descriptor = getDescriptor();
        lj1.gv gvVarT = encoder.t(descriptor, iV);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itGv = gv(collection);
        int i = 0;
        while (itGv.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itGv.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i5 = i + 1;
            gvVarT.n(getDescriptor(), i, tl(), key);
            i += 2;
            gvVarT.n(getDescriptor(), i5, wz(), value);
        }
        gvVarT.zn(descriptor);
    }

    public final ij1.zn<Key> tl() {
        return this.y;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void s(lj1.zn decoder, int i, Builder builder, boolean z) {
        int iX4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objZn = zn.y.zn(decoder, getDescriptor(), i, this.y, null, 8, null);
        if (z) {
            iX4 = decoder.x4(getDescriptor());
            if (iX4 != i + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + iX4).toString());
            }
        } else {
            iX4 = i + 1;
        }
        int i5 = iX4;
        builder.put(objZn, (!builder.containsKey(objZn) || (this.n3.getDescriptor().getKind() instanceof kj1.v)) ? zn.y.zn(decoder, getDescriptor(), i5, this.n3, null, 8, null) : decoder.d(getDescriptor(), i5, this.n3, MapsKt.getValue(builder, objZn)));
    }

    public final ij1.zn<Value> wz() {
        return this.n3;
    }

    @Override // mj1.y
    /* JADX INFO: renamed from: xc, reason: merged with bridge method [inline-methods] */
    public final void fb(lj1.zn decoder, Builder builder, int i, int i5) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i5 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, i5 * 2), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            s(decoder, i + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    public o4(ij1.zn<Key> znVar, ij1.zn<Value> znVar2) {
        super(null);
        this.y = znVar;
        this.n3 = znVar2;
    }
}
