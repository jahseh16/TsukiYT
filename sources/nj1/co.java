package nj1;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@ij1.c5(with = z.class)
public final class co extends f3 {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final co f6955fb = new co();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f6956s = "null";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Lazy<ij1.zn<Object>> f6954f = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, y.y);

    public static final class y extends Lambda implements Function0<ij1.zn<Object>> {
        public static final y y = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ij1.zn<Object> invoke() {
            return z.y;
        }
    }

    public co() {
        super(null);
    }

    @Override // nj1.f3
    public String y() {
        return f6956s;
    }
}
