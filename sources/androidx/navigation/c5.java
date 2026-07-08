package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends s implements Iterable<s>, KMappedMarker {
    public static final y fh = new y(null);
    public String c;
    public String d0;
    public final x4.c5<s> f3;
    public int n;

    public static final class n3 implements Iterator<s>, KMappedMarker {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f909v;
        public int y = -1;

        public n3() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.y + 1 < c5.this.mg().w();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f909v) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            x4.c5<s> c5VarMg = c5.this.mg();
            c5VarMg.p(this.y).r(null);
            c5VarMg.wz(this.y);
            this.y--;
            this.f909v = false;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public s next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f909v = true;
            x4.c5<s> c5VarMg = c5.this.mg();
            int i = this.y + 1;
            this.y = i;
            s sVarP = c5VarMg.p(i);
            Intrinsics.checkNotNullExpressionValue(sVarP, "nodes.valueAt(++index)");
            return sVarP;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: androidx.navigation.c5$y$y, reason: collision with other inner class name */
        public static final class C0020y extends Lambda implements Function1<s, s> {
            public static final C0020y y = new C0020y();

            public C0020y() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final s invoke(s it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof c5)) {
                    return null;
                }
                c5 c5Var = (c5) it;
                return c5Var.c(c5Var.d());
            }
        }

        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s y(c5 c5Var) {
            Intrinsics.checkNotNullParameter(c5Var, "<this>");
            return (s) SequencesKt.last(SequencesKt.generateSequence(c5Var.c(c5Var.d()), C0020y.y));
        }

        public y() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(xc<? extends c5> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f3 = new x4.c5<>();
    }

    public final void a8(int i) {
        x(i);
    }

    public final void b(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (Intrinsics.areEqual(str, tl())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = s.z.y(str).hashCode();
        }
        this.n = iHashCode;
        this.d0 = str;
    }

    public final s c(int i) {
        return d0(i, true);
    }

    @Override // androidx.navigation.s
    public String c5() {
        return i9() != 0 ? super.c5() : "the root navigation";
    }

    public final int d() {
        return this.n;
    }

    public final s d0(int i, boolean z) {
        s sVarFb = this.f3.fb(i);
        if (sVarFb != null) {
            return sVarFb;
        }
        if (!z || t() == null) {
            return null;
        }
        c5 c5VarT = t();
        Intrinsics.checkNotNull(c5VarT);
        return c5VarT.c(i);
    }

    @Override // androidx.navigation.s
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c5) && super.equals(obj)) {
            c5 c5Var = (c5) obj;
            if (this.f3.w() == c5Var.f3.w() && d() == c5Var.d()) {
                for (s sVar : SequencesKt.asSequence(x4.i9.n3(this.f3))) {
                    if (!Intrinsics.areEqual(sVar, c5Var.f3.fb(sVar.i9()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final s fh(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return rz(str, true);
    }

    @Override // androidx.navigation.s
    public int hashCode() {
        int iD = d();
        x4.c5<s> c5Var = this.f3;
        int iW = c5Var.w();
        for (int i = 0; i < iW; i++) {
            iD = (((iD * 31) + c5Var.t(i)) * 31) + c5Var.p(i).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator<s> iterator() {
        return new n3();
    }

    public final x4.c5<s> mg() {
        return this.f3;
    }

    @Override // androidx.navigation.s
    public void mt(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.mt(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R$styleable.f926x4);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        x(typedArrayObtainAttributes.getResourceId(androidx.navigation.common.R$styleable.f916i4, 0));
        this.c = s.z.n3(context, this.n);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void n(s node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iI9 = node.i9();
        String strTl = node.tl();
        if (iI9 == 0 && strTl == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (tl() != null && Intrinsics.areEqual(strTl, tl())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (iI9 == i9()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        s sVarFb = this.f3.fb(iI9);
        if (sVarFb == node) {
            return;
        }
        if (node.t() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (sVarFb != null) {
            sVarFb.r(null);
        }
        node.r(this);
        this.f3.tl(node.i9(), node);
    }

    public final s rz(String route, boolean z) {
        Object next;
        Intrinsics.checkNotNullParameter(route, "route");
        s sVarFb = this.f3.fb(s.z.y(route).hashCode());
        if (sVarFb == null) {
            Iterator it = SequencesKt.asSequence(x4.i9.n3(this.f3)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((s) next).p(route) != null) {
                    break;
                }
            }
            sVarFb = (s) next;
        }
        if (sVarFb != null) {
            return sVarFb;
        }
        if (!z || t() == null) {
            return null;
        }
        c5 c5VarT = t();
        Intrinsics.checkNotNull(c5VarT);
        return c5VarT.fh(route);
    }

    public final String ta() {
        if (this.c == null) {
            String strValueOf = this.d0;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.n);
            }
            this.c = strValueOf;
        }
        String str = this.c;
        Intrinsics.checkNotNull(str);
        return str;
    }

    @Override // androidx.navigation.s
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        s sVarFh = fh(this.d0);
        if (sVarFh == null) {
            sVarFh = c(d());
        }
        sb.append(" startDestination=");
        if (sVarFh == null) {
            String str = this.d0;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.c;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.n));
                }
            }
        } else {
            sb.append("{");
            sb.append(sVarFh.toString());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final s.n3 ud(fb request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return super.w(request);
    }

    @Override // androidx.navigation.s
    public s.n3 w(fb navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        s.n3 n3VarW = super.w(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<s> it = iterator();
        while (it.hasNext()) {
            s.n3 n3VarW2 = it.next().w(navDeepLinkRequest);
            if (n3VarW2 != null) {
                arrayList.add(n3VarW2);
            }
        }
        return (s.n3) CollectionsKt.maxOrNull(CollectionsKt.listOfNotNull((Object[]) new s.n3[]{n3VarW, (s.n3) CollectionsKt.maxOrNull(arrayList)}));
    }

    public final void x(int i) {
        if (i != i9()) {
            if (this.d0 != null) {
                b(null);
            }
            this.n = i;
            this.c = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    public final String z6() {
        return this.d0;
    }
}
