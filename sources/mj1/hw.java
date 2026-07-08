package mj1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hw extends rb {

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final boolean f6505tl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(String name, x<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f6505tl = true;
    }

    @Override // mj1.rb
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hw) {
            kj1.a aVar = (kj1.a) obj;
            if (Intrinsics.areEqual(s(), aVar.s())) {
                hw hwVar = (hw) obj;
                if (hwVar.isInline() && Arrays.equals(xc(), hwVar.xc()) && gv() == aVar.gv()) {
                    int iGv = gv();
                    for (int i = 0; i < iGv; i++) {
                        if (Intrinsics.areEqual(fb(i).s(), aVar.fb(i).s()) && Intrinsics.areEqual(fb(i).getKind(), aVar.fb(i).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // mj1.rb
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // mj1.rb, kj1.a
    public boolean isInline() {
        return this.f6505tl;
    }
}
