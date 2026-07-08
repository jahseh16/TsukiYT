package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.s;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class xc<D extends s> {
    public boolean n3;
    public u0.wz y;

    public static final class gv extends Lambda implements Function1<tl, Unit> {
        public static final gv y = new gv();

        public gv() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(tl tlVar) {
            y(tlVar);
            return Unit.INSTANCE;
        }

        public final void y(tl navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.gv(true);
        }
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface n3 {
        String value();
    }

    public interface y {
    }

    public static final class zn extends Lambda implements Function1<androidx.navigation.zn, androidx.navigation.zn> {
        final /* synthetic */ t $navOptions;
        final /* synthetic */ y $navigatorExtras;
        final /* synthetic */ xc<D> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(xc<D> xcVar, t tVar, y yVar) {
            super(1);
            this.this$0 = xcVar;
            this.$navOptions = tVar;
            this.$navigatorExtras = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.zn invoke(androidx.navigation.zn backStackEntry) {
            s sVarGv;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            s sVarV = backStackEntry.v();
            if (!(sVarV instanceof s)) {
                sVarV = null;
            }
            if (sVarV != null && (sVarGv = this.this$0.gv(sVarV, backStackEntry.zn(), this.$navOptions, this.$navigatorExtras)) != null) {
                return Intrinsics.areEqual(sVarGv, sVarV) ? backStackEntry : this.this$0.n3().y(sVarGv, sVarGv.v(backStackEntry.zn()));
            }
            return null;
        }
    }

    public void a(u0.wz state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.y = state;
        this.n3 = true;
    }

    public Bundle c5() {
        return null;
    }

    public boolean f() {
        return true;
    }

    public void fb(androidx.navigation.zn backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        s sVarV = backStackEntry.v();
        if (!(sVarV instanceof s)) {
            sVarV = null;
        }
        if (sVarV == null) {
            return;
        }
        gv(sVarV, null, u0.f.y(gv.y), null);
        n3().a(backStackEntry);
    }

    public s gv(D destination, Bundle bundle, t tVar, y yVar) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void i9(androidx.navigation.zn popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List<androidx.navigation.zn> value = n3().n3().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<androidx.navigation.zn> listIterator = value.listIterator(value.size());
        androidx.navigation.zn znVarPrevious = null;
        while (f()) {
            znVarPrevious = listIterator.previous();
            if (Intrinsics.areEqual(znVarPrevious, popUpTo)) {
                break;
            }
        }
        if (znVarPrevious != null) {
            n3().s(znVarPrevious, z);
        }
    }

    public final u0.wz n3() {
        u0.wz wzVar = this.y;
        if (wzVar != null) {
            return wzVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void s(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public void v(List<androidx.navigation.zn> entries, t tVar, y yVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(entries), new zn(this, tVar, yVar))).iterator();
        while (it.hasNext()) {
            n3().f((androidx.navigation.zn) it.next());
        }
    }

    public abstract D y();

    public final boolean zn() {
        return this.n3;
    }
}
