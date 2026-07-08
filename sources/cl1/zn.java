package cl1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn<T> {
    public static final y n3 = new y(null);
    public final al1.y<T> y;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public zn(al1.y<T> beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.y = beanDefinition;
    }

    public abstract T n3(n3 n3Var);

    public T y(n3 context) throws bl1.zn {
        Intrinsics.checkNotNullParameter(context, "context");
        xk1.y yVarY = context.y();
        if (yVarY.zn().fb(dl1.n3.DEBUG)) {
            yVarY.zn().n3(Intrinsics.stringPlus("| create instance for ", this.y));
        }
        try {
            fl1.y yVarN3 = context.n3();
            if (yVarN3 == null) {
                yVarN3 = fl1.n3.y();
            }
            return this.y.y().invoke(context.zn(), yVarN3);
        } catch (Exception e4) {
            String strZn = ml1.y.y.zn(e4);
            yVarY.zn().gv("Instance creation error : could not create instance for " + this.y + ": " + strZn);
            throw new bl1.zn(Intrinsics.stringPlus("Could not create instance for ", this.y), e4);
        }
    }

    public final al1.y<T> zn() {
        return this.y;
    }
}
