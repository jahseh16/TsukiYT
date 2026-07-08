package oj1;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yt extends a8 {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public String f7175fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7176s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(nj1.y json, Function1<? super nj1.s, Unit> nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f7176s = true;
    }

    @Override // oj1.a8, oj1.gv
    public nj1.s kp() {
        return new nj1.r(g3());
    }

    @Override // oj1.a8, oj1.gv
    public void rb(String key, nj1.s element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.f7176s) {
            Map<String, nj1.s> mapG3 = g3();
            String str = this.f7175fb;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                str = null;
            }
            mapG3.put(str, element);
            this.f7176s = true;
            return;
        }
        if (element instanceof nj1.f3) {
            this.f7175fb = ((nj1.f3) element).y();
            this.f7176s = false;
        } else {
            if (element instanceof nj1.r) {
                throw fh.gv(nj1.i4.y.getDescriptor());
            }
            if (!(element instanceof nj1.n3)) {
                throw new NoWhenBranchMatchedException();
            }
            throw fh.gv(nj1.zn.y.getDescriptor());
        }
    }
}
