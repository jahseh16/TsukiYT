package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.s;
import androidx.navigation.s;
import androidx.navigation.t;
import androidx.navigation.v;
import androidx.navigation.xc;
import androidx.navigation.zn;
import ap.hw;
import ap.mt;
import ap.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import ta.f3;

/* JADX INFO: loaded from: classes.dex */
public class gv {

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final y f942ej = new y(null);

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static boolean f943ud = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcelable[] f944a;
    public Function1<? super androidx.navigation.zn, Unit> c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final MutableStateFlow<List<androidx.navigation.zn>> f945c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final CopyOnWriteArrayList<zn> f946co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow<androidx.navigation.zn> f947d;
    public Function1<? super androidx.navigation.zn, Unit> d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow<List<androidx.navigation.zn>> f948f;
    public androidx.navigation.w f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f949fb;
    public final Map<androidx.navigation.zn, Boolean> fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public androidx.navigation.c5 f950gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f951i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final StateFlow<List<androidx.navigation.zn>> f952i9;
    public final List<androidx.navigation.zn> mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public androidx.navigation.v f953mt;
    public final Map<androidx.navigation.xc<? extends androidx.navigation.s>, n3> n;
    public Activity n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public mt f954p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f955r;
    public int rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayDeque<androidx.navigation.zn> f956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StateFlow<List<androidx.navigation.zn>> f957t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final Lazy f958ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final Map<androidx.navigation.zn, androidx.navigation.zn> f959tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bundle f960v;
    public final Map<String, ArrayDeque<NavBackStackEntryState>> w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final Map<androidx.navigation.zn, AtomicInteger> f961wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final a.xc f962x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final Map<Integer, String> f963xc;
    public final Context y;
    public s.n3 z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public final Flow<androidx.navigation.zn> f964z6;
    public androidx.navigation.f zn;

    public static final class a extends Lambda implements Function1<androidx.navigation.zn, Unit> {
        final /* synthetic */ Ref$BooleanRef $popped;
        final /* synthetic */ Ref$BooleanRef $receivedPop;
        final /* synthetic */ boolean $saveState;
        final /* synthetic */ ArrayDeque<NavBackStackEntryState> $savedState;
        final /* synthetic */ gv this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, gv gvVar, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
            super(1);
            this.$receivedPop = ref$BooleanRef;
            this.$popped = ref$BooleanRef2;
            this.this$0 = gvVar;
            this.$saveState = z;
            this.$savedState = arrayDeque;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.navigation.zn znVar) {
            y(znVar);
            return Unit.INSTANCE;
        }

        public final void y(androidx.navigation.zn entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.$receivedPop.element = true;
            this.$popped.element = true;
            this.this$0.dm(entry, this.$saveState, this.$savedState);
        }
    }

    public static final class c5 extends Lambda implements Function1<androidx.navigation.s, androidx.navigation.s> {
        public static final c5 y = new c5();

        public c5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.s invoke(androidx.navigation.s destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            androidx.navigation.c5 c5VarT = destination.t();
            if (c5VarT == null || c5VarT.d() != destination.i9()) {
                return null;
            }
            return destination.t();
        }
    }

    public static final class f extends Lambda implements Function1<androidx.navigation.zn, Unit> {
        final /* synthetic */ Bundle $args;
        final /* synthetic */ List<androidx.navigation.zn> $entries;
        final /* synthetic */ Ref$IntRef $lastNavigatedIndex;
        final /* synthetic */ Ref$BooleanRef $navigated;
        final /* synthetic */ gv this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref$BooleanRef ref$BooleanRef, List<androidx.navigation.zn> list, Ref$IntRef ref$IntRef, gv gvVar, Bundle bundle) {
            super(1);
            this.$navigated = ref$BooleanRef;
            this.$entries = list;
            this.$lastNavigatedIndex = ref$IntRef;
            this.this$0 = gvVar;
            this.$args = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.navigation.zn znVar) {
            y(znVar);
            return Unit.INSTANCE;
        }

        public final void y(androidx.navigation.zn entry) {
            List<androidx.navigation.zn> listEmptyList;
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.$navigated.element = true;
            int iIndexOf = this.$entries.indexOf(entry);
            if (iIndexOf != -1) {
                int i = iIndexOf + 1;
                listEmptyList = this.$entries.subList(this.$lastNavigatedIndex.element, i);
                this.$lastNavigatedIndex.element = i;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.this$0.w(entry.v(), this.$args, entry, listEmptyList);
        }
    }

    public static final class fb extends Lambda implements Function1<androidx.navigation.s, androidx.navigation.s> {
        public static final fb y = new fb();

        public fb() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.s invoke(androidx.navigation.s destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            androidx.navigation.c5 c5VarT = destination.t();
            if (c5VarT == null || c5VarT.d() != destination.i9()) {
                return null;
            }
            return destination.t();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.gv$gv, reason: collision with other inner class name */
    public static final class C0023gv extends Lambda implements Function1<Context, Context> {
        public static final C0023gv y = new C0023gv();

        public C0023gv() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public static final class i9 extends Lambda implements Function1<androidx.navigation.s, Boolean> {
        public i9() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.navigation.s destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!gv.this.f963xc.containsKey(Integer.valueOf(destination.i9())));
        }
    }

    public final class n3 extends u0.wz {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final androidx.navigation.xc<? extends androidx.navigation.s> f965fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ gv f966s;

        public static final class y extends Lambda implements Function0<Unit> {
            final /* synthetic */ androidx.navigation.zn $popUpTo;
            final /* synthetic */ boolean $saveState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(androidx.navigation.zn znVar, boolean z) {
                super(0);
                this.$popUpTo = znVar;
                this.$saveState = z;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                n3.super.s(this.$popUpTo, this.$saveState);
            }
        }

        public n3(gv gvVar, androidx.navigation.xc<? extends androidx.navigation.s> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f966s = gvVar;
            this.f965fb = navigator;
        }

        @Override // u0.wz
        public void c5(androidx.navigation.zn popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.c5(popUpTo, z);
            this.f966s.fh.put(popUpTo, Boolean.valueOf(z));
        }

        @Override // u0.wz
        public void f(androidx.navigation.zn backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            androidx.navigation.xc xcVarGv = this.f966s.f3.gv(backStackEntry.v().f());
            if (!Intrinsics.areEqual(xcVarGv, this.f965fb)) {
                Object obj = this.f966s.n.get(xcVarGv);
                if (obj != null) {
                    ((n3) obj).f(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.v().f() + " should already be created").toString());
            }
            Function1 function1 = this.f966s.c;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                xc(backStackEntry);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.v() + " outside of the call to navigate(). ");
        }

        @Override // u0.wz
        public void i9(androidx.navigation.zn entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.i9(entry);
            if (!this.f966s.f956s.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.t(s.n3.STARTED);
        }

        @Override // u0.wz
        public void s(androidx.navigation.zn popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            androidx.navigation.xc xcVarGv = this.f966s.f3.gv(popUpTo.v().f());
            if (!Intrinsics.areEqual(xcVarGv, this.f965fb)) {
                Object obj = this.f966s.n.get(xcVarGv);
                Intrinsics.checkNotNull(obj);
                ((n3) obj).s(popUpTo, z);
            } else {
                Function1 function1 = this.f966s.d0;
                if (function1 == null) {
                    this.f966s.en(popUpTo, new y(popUpTo, z));
                } else {
                    function1.invoke(popUpTo);
                    super.s(popUpTo, z);
                }
            }
        }

        @Override // u0.wz
        public void v(androidx.navigation.zn entry) {
            androidx.navigation.v vVar;
            Intrinsics.checkNotNullParameter(entry, "entry");
            boolean zAreEqual = Intrinsics.areEqual(this.f966s.fh.get(entry), Boolean.TRUE);
            super.v(entry);
            this.f966s.fh.remove(entry);
            if (this.f966s.f956s.contains(entry)) {
                if (gv()) {
                    return;
                }
                this.f966s.kp();
                this.f966s.f945c5.tryEmit(CollectionsKt.toMutableList((Collection) this.f966s.f956s));
                this.f966s.f948f.tryEmit(this.f966s.o4());
                return;
            }
            this.f966s.yc(entry);
            if (entry.getLifecycle().n3().n3(s.n3.CREATED)) {
                entry.t(s.n3.DESTROYED);
            }
            ArrayDeque arrayDeque = this.f966s.f956s;
            if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
                Iterator<E> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((androidx.navigation.zn) it.next()).a(), entry.a())) {
                        break;
                    }
                }
                if (!zAreEqual && (vVar = this.f966s.f953mt) != null) {
                    vVar.t6(entry.a());
                }
            } else if (!zAreEqual) {
                vVar.t6(entry.a());
            }
            this.f966s.kp();
            this.f966s.f948f.tryEmit(this.f966s.o4());
        }

        public final void xc(androidx.navigation.zn backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.f(backStackEntry);
        }

        @Override // u0.wz
        public androidx.navigation.zn y(androidx.navigation.s destination, Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return zn.y.n3(androidx.navigation.zn.d0, this.f966s.c(), destination, bundle, this.f966s.d(), this.f966s.f953mt, null, null, 96, null);
        }
    }

    public static final class s extends Lambda implements Function1<androidx.navigation.s, Boolean> {
        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.navigation.s destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!gv.this.f963xc.containsKey(Integer.valueOf(destination.i9())));
        }
    }

    public static final class t extends Lambda implements Function1<androidx.navigation.tl, Unit> {
        final /* synthetic */ androidx.navigation.s $node;
        final /* synthetic */ gv this$0;

        public static final class n3 extends Lambda implements Function1<u0.xc, Unit> {
            public static final n3 y = new n3();

            public n3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u0.xc xcVar) {
                y(xcVar);
                return Unit.INSTANCE;
            }

            public final void y(u0.xc popUpTo) {
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.zn(true);
            }
        }

        public static final class y extends Lambda implements Function1<u0.n3, Unit> {
            public static final y y = new y();

            public y() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u0.n3 n3Var) {
                y(n3Var);
                return Unit.INSTANCE;
            }

            public final void y(u0.n3 anim) {
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.v(0);
                anim.a(0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(androidx.navigation.s sVar, gv gvVar) {
            super(1);
            this.$node = sVar;
            this.this$0 = gvVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.navigation.tl tlVar) {
            y(tlVar);
            return Unit.INSTANCE;
        }

        public final void y(androidx.navigation.tl navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.y(y.y);
            androidx.navigation.s sVar = this.$node;
            if (sVar instanceof androidx.navigation.c5) {
                Sequence<androidx.navigation.s> sequenceZn = androidx.navigation.s.z.zn(sVar);
                gv gvVar = this.this$0;
                for (androidx.navigation.s sVar2 : sequenceZn) {
                    androidx.navigation.s sVarRz = gvVar.rz();
                    if (Intrinsics.areEqual(sVar2, sVarRz != null ? sVarRz.t() : null)) {
                        return;
                    }
                }
                if (gv.f943ud) {
                    navOptions.zn(androidx.navigation.c5.fh.y(this.this$0.ta()).i9(), n3.y);
                }
            }
        }
    }

    public static final class tl extends Lambda implements Function0<androidx.navigation.f> {
        public tl() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.f invoke() {
            androidx.navigation.f fVar = gv.this.zn;
            return fVar == null ? new androidx.navigation.f(gv.this.c(), gv.this.f3) : fVar;
        }
    }

    public static final class v extends Lambda implements Function1<androidx.navigation.tl, Unit> {
        public static final v y = new v();

        public v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.navigation.tl tlVar) {
            y(tlVar);
            return Unit.INSTANCE;
        }

        public final void y(androidx.navigation.tl navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.fb(true);
        }
    }

    public static final class w extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ String $backStackId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(1);
            this.$backStackId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.areEqual(str, this.$backStackId));
        }
    }

    public static final class wz extends Lambda implements Function1<androidx.navigation.zn, Unit> {
        final /* synthetic */ Bundle $finalArgs;
        final /* synthetic */ Ref$BooleanRef $navigated;
        final /* synthetic */ androidx.navigation.s $node;
        final /* synthetic */ gv this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wz(Ref$BooleanRef ref$BooleanRef, gv gvVar, androidx.navigation.s sVar, Bundle bundle) {
            super(1);
            this.$navigated = ref$BooleanRef;
            this.this$0 = gvVar;
            this.$node = sVar;
            this.$finalArgs = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.navigation.zn znVar) {
            y(znVar);
            return Unit.INSTANCE;
        }

        public final void y(androidx.navigation.zn it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$navigated.element = true;
            gv.p(this.this$0, this.$node, this.$finalArgs, it, null, 8, null);
        }
    }

    public static final class xc extends a.xc {
        public xc() {
            super(false);
        }

        @Override // a.xc
        public void handleOnBackPressed() {
            gv.this.oz();
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public interface zn {
        void y(gv gvVar, androidx.navigation.s sVar, Bundle bundle);
    }

    public gv(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        this.y = context;
        Iterator it = SequencesKt.generateSequence(context, C0023gv.y).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.n3 = (Activity) next;
        this.f956s = new ArrayDeque<>();
        MutableStateFlow<List<androidx.navigation.zn>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f945c5 = MutableStateFlow;
        this.f952i9 = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<androidx.navigation.zn>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f948f = MutableStateFlow2;
        this.f957t = FlowKt.asStateFlow(MutableStateFlow2);
        this.f959tl = new LinkedHashMap();
        this.f961wz = new LinkedHashMap();
        this.f963xc = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.f946co = new CopyOnWriteArrayList<>();
        this.z = s.n3.INITIALIZED;
        this.f955r = new androidx.lifecycle.t() { // from class: u0.c5
            @Override // androidx.lifecycle.t
            public final void onStateChanged(mt mtVar, s.y yVar) {
                androidx.navigation.gv.b(this.y, mtVar, yVar);
            }
        };
        this.f962x4 = new xc();
        this.f951i4 = true;
        this.f3 = new androidx.navigation.w();
        this.n = new LinkedHashMap();
        this.fh = new LinkedHashMap();
        androidx.navigation.w wVar = this.f3;
        wVar.n3(new androidx.navigation.i9(wVar));
        this.f3.n3(new androidx.navigation.y(this.y));
        this.mg = new ArrayList();
        this.f958ta = LazyKt.lazy(new tl());
        MutableSharedFlow<androidx.navigation.zn> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f947d = mutableSharedFlowMutableSharedFlow$default;
        this.f964z6 = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final void b(gv this$0, mt mtVar, s.y event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mtVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.z = event.gv();
        if (this$0.f950gv != null) {
            Iterator<androidx.navigation.zn> it = this$0.f956s.iterator();
            while (it.hasNext()) {
                it.next().s(event);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void ct(gv gvVar, androidx.navigation.zn znVar, boolean z, ArrayDeque arrayDeque, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        gvVar.dm(znVar, z, arrayDeque);
    }

    public static /* synthetic */ boolean f7(gv gvVar, String str, boolean z, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z5 = false;
        }
        return gvVar.k(str, z, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(gv gvVar, androidx.navigation.s sVar, Bundle bundle, androidx.navigation.zn znVar, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        gvVar.w(sVar, bundle, znVar, list);
    }

    public static /* synthetic */ boolean xg(gv gvVar, int i, boolean z, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return gvVar.u(i, z, z5);
    }

    public final List<androidx.navigation.zn> a8(ArrayDeque<NavBackStackEntryState> arrayDeque) {
        androidx.navigation.s sVarTa;
        ArrayList arrayList = new ArrayList();
        androidx.navigation.zn znVarLastOrNull = this.f956s.lastOrNull();
        if (znVarLastOrNull == null || (sVarTa = znVarLastOrNull.v()) == null) {
            sVarTa = ta();
        }
        if (arrayDeque != null) {
            for (NavBackStackEntryState navBackStackEntryState : arrayDeque) {
                androidx.navigation.s sVarI4 = i4(sVarTa, navBackStackEntryState.y());
                if (sVarI4 == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + androidx.navigation.s.z.n3(this.y, navBackStackEntryState.y()) + " cannot be found from the current destination " + sVarTa).toString());
                }
                arrayList.add(navBackStackEntryState.zn(this.y, sVarI4, d(), this.f953mt));
                sVarTa = sVarI4;
            }
        }
        return arrayList;
    }

    public void ap(mt owner) {
        androidx.lifecycle.s lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.areEqual(owner, this.f954p)) {
            return;
        }
        mt mtVar = this.f954p;
        if (mtVar != null && (lifecycle = mtVar.getLifecycle()) != null) {
            lifecycle.gv(this.f955r);
        }
        this.f954p = owner;
        owner.getLifecycle().y(this.f955r);
    }

    public final Context c() {
        return this.y;
    }

    public final boolean co() {
        while (!this.f956s.isEmpty() && (this.f956s.last().v() instanceof androidx.navigation.c5)) {
            ct(this, this.f956s.last(), false, null, 6, null);
        }
        androidx.navigation.zn znVarLastOrNull = this.f956s.lastOrNull();
        if (znVarLastOrNull != null) {
            this.mg.add(znVarLastOrNull);
        }
        this.rz++;
        kp();
        int i = this.rz - 1;
        this.rz = i;
        if (i == 0) {
            List<androidx.navigation.zn> mutableList = CollectionsKt.toMutableList((Collection) this.mg);
            this.mg.clear();
            for (androidx.navigation.zn znVar : mutableList) {
                Iterator<zn> it = this.f946co.iterator();
                while (it.hasNext()) {
                    it.next().y(this, znVar.v(), znVar.zn());
                }
                this.f947d.tryEmit(znVar);
            }
            this.f945c5.tryEmit(CollectionsKt.toMutableList((Collection) this.f956s));
            this.f948f.tryEmit(o4());
        }
        return znVarLastOrNull != null;
    }

    public final s.n3 d() {
        return this.f954p == null ? s.n3.CREATED : this.z;
    }

    public final StateFlow<List<androidx.navigation.zn>> d0() {
        return this.f952i9;
    }

    public final void dm(androidx.navigation.zn znVar, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
        androidx.navigation.v vVar;
        StateFlow<Set<androidx.navigation.zn>> stateFlowZn;
        Set<androidx.navigation.zn> value;
        androidx.navigation.zn znVarLast = this.f956s.last();
        if (!Intrinsics.areEqual(znVarLast, znVar)) {
            throw new IllegalStateException(("Attempted to pop " + znVar.v() + ", which is not the top of the back stack (" + znVarLast.v() + ')').toString());
        }
        this.f956s.removeLast();
        n3 n3Var = this.n.get(ej().gv(znVarLast.v().f()));
        boolean z5 = true;
        if ((n3Var == null || (stateFlowZn = n3Var.zn()) == null || (value = stateFlowZn.getValue()) == null || !value.contains(znVarLast)) && !this.f961wz.containsKey(znVarLast)) {
            z5 = false;
        }
        s.n3 n3VarN3 = znVarLast.getLifecycle().n3();
        s.n3 n3Var2 = s.n3.CREATED;
        if (n3VarN3.n3(n3Var2)) {
            if (z) {
                znVarLast.t(n3Var2);
                arrayDeque.addFirst(new NavBackStackEntryState(znVarLast));
            }
            if (z5) {
                znVarLast.t(n3Var2);
            } else {
                znVarLast.t(s.n3.DESTROYED);
                yc(znVarLast);
            }
        }
        if (z || z5 || (vVar = this.f953mt) == null) {
            return;
        }
        vVar.t6(znVarLast.a());
    }

    public void e(androidx.navigation.c5 graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        s8(graph, null);
    }

    public final boolean eb(int i, Bundle bundle, androidx.navigation.t tVar, xc.y yVar) {
        if (!this.f963xc.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = this.f963xc.get(Integer.valueOf(i));
        CollectionsKt.removeAll(this.f963xc.values(), new w(str));
        return r(a8((ArrayDeque) TypeIntrinsics.asMutableMap(this.w).remove(str)), bundle, tVar, yVar);
    }

    public androidx.navigation.w ej() {
        return this.f3;
    }

    public final void en(androidx.navigation.zn popUpTo, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int iIndexOf = this.f956s.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != this.f956s.size()) {
            u(this.f956s.get(i).v().i9(), true, false);
        }
        ct(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        rb();
        co();
    }

    public final String f3(int[] iArr) {
        androidx.navigation.c5 c5Var;
        androidx.navigation.c5 c5Var2 = this.f950gv;
        int length = iArr.length;
        int i = 0;
        while (true) {
            androidx.navigation.s sVarC = null;
            if (i >= length) {
                return null;
            }
            int i5 = iArr[i];
            if (i == 0) {
                androidx.navigation.c5 c5Var3 = this.f950gv;
                Intrinsics.checkNotNull(c5Var3);
                if (c5Var3.i9() == i5) {
                    sVarC = this.f950gv;
                }
            } else {
                Intrinsics.checkNotNull(c5Var2);
                sVarC = c5Var2.c(i5);
            }
            if (sVarC == null) {
                return androidx.navigation.s.z.n3(this.y, i5);
            }
            if (i != iArr.length - 1 && (sVarC instanceof androidx.navigation.c5)) {
                while (true) {
                    c5Var = (androidx.navigation.c5) sVarC;
                    Intrinsics.checkNotNull(c5Var);
                    if (!(c5Var.c(c5Var.d()) instanceof androidx.navigation.c5)) {
                        break;
                    }
                    sVarC = c5Var.c(c5Var.d());
                }
                c5Var2 = c5Var;
            }
            i++;
        }
    }

    public androidx.navigation.zn fh() {
        return this.f956s.lastOrNull();
    }

    public void hw(int i, Bundle bundle, androidx.navigation.t tVar) {
        j5(i, bundle, tVar, null);
    }

    public final androidx.navigation.s i4(androidx.navigation.s sVar, int i) {
        androidx.navigation.c5 c5VarT;
        if (sVar.i9() == i) {
            return sVar;
        }
        if (sVar instanceof androidx.navigation.c5) {
            c5VarT = (androidx.navigation.c5) sVar;
        } else {
            c5VarT = sVar.t();
            Intrinsics.checkNotNull(c5VarT);
        }
        return c5VarT.c(i);
    }

    public final void j(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f960v;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String name : stringArrayList) {
                androidx.navigation.w wVar = this.f3;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                androidx.navigation.xc xcVarGv = wVar.gv(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    xcVarGv.s(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f944a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                androidx.navigation.s sVarX4 = x4(navBackStackEntryState.y());
                if (sVarX4 == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + androidx.navigation.s.z.n3(this.y, navBackStackEntryState.y()) + " cannot be found from the current destination " + rz());
                }
                androidx.navigation.zn znVarZn = navBackStackEntryState.zn(this.y, sVarX4, d(), this.f953mt);
                androidx.navigation.xc<? extends androidx.navigation.s> xcVarGv2 = this.f3.gv(sVarX4.f());
                Map<androidx.navigation.xc<? extends androidx.navigation.s>, n3> map = this.n;
                n3 n3Var = map.get(xcVarGv2);
                if (n3Var == null) {
                    n3Var = new n3(this, xcVarGv2);
                    map.put(xcVarGv2, n3Var);
                }
                this.f956s.add(znVarZn);
                n3Var.xc(znVarZn);
                androidx.navigation.c5 c5VarT = znVarZn.v().t();
                if (c5VarT != null) {
                    k5(znVarZn, n(c5VarT.i9()));
                }
            }
            rb();
            this.f944a = null;
        }
        Collection<androidx.navigation.xc<? extends androidx.navigation.s>> collectionValues = this.f3.v().values();
        ArrayList<androidx.navigation.xc<? extends androidx.navigation.s>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((androidx.navigation.xc) obj).zn()) {
                arrayList.add(obj);
            }
        }
        for (androidx.navigation.xc<? extends androidx.navigation.s> xcVar : arrayList) {
            Map<androidx.navigation.xc<? extends androidx.navigation.s>, n3> map2 = this.n;
            n3 n3Var2 = map2.get(xcVar);
            if (n3Var2 == null) {
                n3Var2 = new n3(this, xcVar);
                map2.put(xcVar, n3Var2);
            }
            xcVar.a(n3Var2);
        }
        if (this.f950gv == null || !this.f956s.isEmpty()) {
            co();
            return;
        }
        if (!this.f949fb && (activity = this.n3) != null) {
            Intrinsics.checkNotNull(activity);
            if (ud(activity.getIntent())) {
                return;
            }
        }
        androidx.navigation.c5 c5Var = this.f950gv;
        Intrinsics.checkNotNull(c5Var);
        qn(c5Var, bundle, null, null);
    }

    public void j5(int i, Bundle bundle, androidx.navigation.t tVar, xc.y yVar) {
        int iN3;
        androidx.navigation.s sVarV = this.f956s.isEmpty() ? this.f950gv : this.f956s.last().v();
        if (sVarV == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        u0.gv gvVarS = sVarV.s(i);
        Bundle bundle2 = null;
        if (gvVarS != null) {
            if (tVar == null) {
                tVar = gvVarS.zn();
            }
            iN3 = gvVarS.n3();
            Bundle bundleY = gvVarS.y();
            if (bundleY != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleY);
            }
        } else {
            iN3 = i;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (iN3 == 0 && tVar != null && (tVar.v() != -1 || tVar.a() != null)) {
            if (tVar.a() != null) {
                String strA = tVar.a();
                Intrinsics.checkNotNull(strA);
                f7(this, strA, tVar.fb(), false, 4, null);
                return;
            } else {
                if (tVar.v() != -1) {
                    ut(tVar.v(), tVar.fb());
                    return;
                }
                return;
            }
        }
        if (iN3 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        androidx.navigation.s sVarX4 = x4(iN3);
        if (sVarX4 != null) {
            qn(sVarX4, bundle2, tVar, yVar);
            return;
        }
        s.y yVar2 = androidx.navigation.s.z;
        String strN3 = yVar2.n3(this.y, iN3);
        if (gvVarS == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strN3 + " cannot be found from the current destination " + sVarV);
        }
        throw new IllegalArgumentException(("Navigation destination " + strN3 + " referenced from action " + yVar2.n3(this.y, i) + " cannot be found from the current destination " + sVarV).toString());
    }

    public final void jz(androidx.navigation.xc<? extends androidx.navigation.s> xcVar, androidx.navigation.zn znVar, boolean z, Function1<? super androidx.navigation.zn, Unit> function1) {
        this.d0 = function1;
        xcVar.i9(znVar, z);
        this.d0 = null;
    }

    public final boolean k(String route, boolean z, boolean z5) {
        Intrinsics.checkNotNullParameter(route, "route");
        return y5(route, z, z5) && co();
    }

    public final void k5(androidx.navigation.zn znVar, androidx.navigation.zn znVar2) {
        this.f959tl.put(znVar, znVar2);
        if (this.f961wz.get(znVar2) == null) {
            this.f961wz.put(znVar2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f961wz.get(znVar2);
        Intrinsics.checkNotNull(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public final void kp() {
        AtomicInteger atomicInteger;
        StateFlow<Set<androidx.navigation.zn>> stateFlowZn;
        Set<androidx.navigation.zn> value;
        List<androidx.navigation.zn> mutableList = CollectionsKt.toMutableList((Collection) this.f956s);
        if (mutableList.isEmpty()) {
            return;
        }
        androidx.navigation.s sVarV = ((androidx.navigation.zn) CollectionsKt.last(mutableList)).v();
        ArrayList arrayList = new ArrayList();
        if (sVarV instanceof u0.zn) {
            Iterator it = CollectionsKt.reversed(mutableList).iterator();
            while (it.hasNext()) {
                androidx.navigation.s sVarV2 = ((androidx.navigation.zn) it.next()).v();
                arrayList.add(sVarV2);
                if (!(sVarV2 instanceof u0.zn) && !(sVarV2 instanceof androidx.navigation.c5)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (androidx.navigation.zn znVar : CollectionsKt.reversed(mutableList)) {
            s.n3 n3VarFb = znVar.fb();
            androidx.navigation.s sVarV3 = znVar.v();
            if (sVarV != null && sVarV3.i9() == sVarV.i9()) {
                s.n3 n3Var = s.n3.RESUMED;
                if (n3VarFb != n3Var) {
                    n3 n3Var2 = this.n.get(ej().gv(znVar.v().f()));
                    if (Intrinsics.areEqual((n3Var2 == null || (stateFlowZn = n3Var2.zn()) == null || (value = stateFlowZn.getValue()) == null) ? null : Boolean.valueOf(value.contains(znVar)), Boolean.TRUE) || ((atomicInteger = this.f961wz.get(znVar)) != null && atomicInteger.get() == 0)) {
                        map.put(znVar, s.n3.STARTED);
                    } else {
                        map.put(znVar, n3Var);
                    }
                }
                androidx.navigation.s sVar = (androidx.navigation.s) CollectionsKt.firstOrNull((List) arrayList);
                if (sVar != null && sVar.i9() == sVarV3.i9()) {
                    CollectionsKt.removeFirst(arrayList);
                }
                sVarV = sVarV.t();
            } else if (arrayList.isEmpty() || sVarV3.i9() != ((androidx.navigation.s) CollectionsKt.first((List) arrayList)).i9()) {
                znVar.t(s.n3.CREATED);
            } else {
                androidx.navigation.s sVar2 = (androidx.navigation.s) CollectionsKt.removeFirst(arrayList);
                if (n3VarFb == s.n3.RESUMED) {
                    znVar.t(s.n3.STARTED);
                } else {
                    s.n3 n3Var3 = s.n3.STARTED;
                    if (n3VarFb != n3Var3) {
                        map.put(znVar, n3Var3);
                    }
                }
                androidx.navigation.c5 c5VarT = sVar2.t();
                if (c5VarT != null && !arrayList.contains(c5VarT)) {
                    arrayList.add(c5VarT);
                }
            }
        }
        for (androidx.navigation.zn znVar2 : mutableList) {
            s.n3 n3Var4 = (s.n3) map.get(znVar2);
            if (n3Var4 != null) {
                znVar2.t(n3Var4);
            } else {
                znVar2.tl();
            }
        }
    }

    public Bundle lc() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, androidx.navigation.xc<? extends androidx.navigation.s>> entry : this.f3.v().entrySet()) {
            String key = entry.getKey();
            Bundle bundleC5 = entry.getValue().c5();
            if (bundleC5 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleC5);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.f956s.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f956s.size()];
            Iterator<androidx.navigation.zn> it = this.f956s.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f963xc.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f963xc.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i5 = 0;
            for (Map.Entry<Integer, String> entry2 : this.f963xc.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i5] = iIntValue;
                arrayList2.add(value);
                i5++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.w.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, ArrayDeque<NavBackStackEntryState>> entry3 : this.w.entrySet()) {
                String key2 = entry3.getKey();
                ArrayDeque<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i8 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i10 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i8] = navBackStackEntryState;
                    i8 = i10;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + key2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f949fb) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f949fb);
        }
        return bundle;
    }

    public final int mg() {
        ArrayDeque<androidx.navigation.zn> arrayDeque = this.f956s;
        int i = 0;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<androidx.navigation.zn> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (!(it.next().v() instanceof androidx.navigation.c5) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    public final boolean mt(int i) {
        Iterator<T> it = this.n.values().iterator();
        while (it.hasNext()) {
            ((n3) it.next()).tl(true);
        }
        boolean zEb = eb(i, null, u0.f.y(v.y), null);
        Iterator<T> it2 = this.n.values().iterator();
        while (it2.hasNext()) {
            ((n3) it2.next()).tl(false);
        }
        return zEb && u(i, true, false);
    }

    public androidx.navigation.zn n(int i) {
        androidx.navigation.zn znVarPrevious;
        ArrayDeque<androidx.navigation.zn> arrayDeque = this.f956s;
        ListIterator<androidx.navigation.zn> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                znVarPrevious = null;
                break;
            }
            znVarPrevious = listIterator.previous();
            if (znVarPrevious.v().i9() == i) {
                break;
            }
        }
        androidx.navigation.zn znVar = znVarPrevious;
        if (znVar != null) {
            return znVar;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + rz()).toString());
    }

    public void nf(int i) {
        s8(z6().n3(i), null);
    }

    public final void o(androidx.navigation.xc<? extends androidx.navigation.s> xcVar, List<androidx.navigation.zn> list, androidx.navigation.t tVar, xc.y yVar, Function1<? super androidx.navigation.zn, Unit> function1) {
        this.c = function1;
        xcVar.v(list, tVar, yVar);
        this.c = null;
    }

    public final List<androidx.navigation.zn> o4() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.n.values().iterator();
        while (it.hasNext()) {
            Set<androidx.navigation.zn> value = ((n3) it.next()).zn().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                androidx.navigation.zn znVar = (androidx.navigation.zn) obj;
                if (!arrayList.contains(znVar) && !znVar.fb().n3(s.n3.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayDeque<androidx.navigation.zn> arrayDeque = this.f956s;
        ArrayList arrayList3 = new ArrayList();
        for (androidx.navigation.zn znVar2 : arrayDeque) {
            androidx.navigation.zn znVar3 = znVar2;
            if (!arrayList.contains(znVar3) && znVar3.fb().n3(s.n3.STARTED)) {
                arrayList3.add(znVar2);
            }
        }
        CollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((androidx.navigation.zn) obj2).v() instanceof androidx.navigation.c5)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public boolean oz() {
        if (this.f956s.isEmpty()) {
            return false;
        }
        androidx.navigation.s sVarRz = rz();
        Intrinsics.checkNotNull(sVarRz);
        return ut(sVarRz.i9(), true);
    }

    public boolean q9(int i, boolean z, boolean z5) {
        return u(i, z, z5) && co();
    }

    public final void qn(androidx.navigation.s sVar, Bundle bundle, androidx.navigation.t tVar, xc.y yVar) {
        boolean z;
        boolean z5;
        boolean zU;
        Iterator<T> it = this.n.values().iterator();
        while (it.hasNext()) {
            ((n3) it.next()).tl(true);
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (tVar == null) {
            z = false;
        } else {
            if (tVar.a() != null) {
                String strA = tVar.a();
                Intrinsics.checkNotNull(strA);
                zU = y5(strA, tVar.fb(), tVar.c5());
            } else {
                if (tVar.v() != -1) {
                    zU = u(tVar.v(), tVar.fb(), tVar.c5());
                }
                z = false;
            }
            z = zU;
        }
        Bundle bundleV = sVar.v(bundle);
        if (tVar != null && tVar.i9() && this.f963xc.containsKey(Integer.valueOf(sVar.i9()))) {
            ref$BooleanRef.element = eb(sVar.i9(), bundleV, tVar, yVar);
            z5 = false;
        } else {
            z5 = tVar != null && tVar.s() && x(sVar, bundle);
            if (!z5) {
                o(this.f3.gv(sVar.f()), CollectionsKt.listOf(zn.y.n3(androidx.navigation.zn.d0, this.y, sVar, bundleV, d(), this.f953mt, null, null, 96, null)), tVar, yVar, new wz(ref$BooleanRef, this, sVar, bundleV));
            }
        }
        rb();
        Iterator<T> it2 = this.n.values().iterator();
        while (it2.hasNext()) {
            ((n3) it2.next()).tl(false);
        }
        if (z || ref$BooleanRef.element || z5) {
            co();
        } else {
            kp();
        }
    }

    public final boolean r(List<androidx.navigation.zn> list, Bundle bundle, androidx.navigation.t tVar, xc.y yVar) {
        androidx.navigation.zn znVar;
        androidx.navigation.s sVarV;
        ArrayList<List<androidx.navigation.zn>> arrayList = new ArrayList();
        ArrayList<androidx.navigation.zn> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((androidx.navigation.zn) obj).v() instanceof androidx.navigation.c5)) {
                arrayList2.add(obj);
            }
        }
        for (androidx.navigation.zn znVar2 : arrayList2) {
            List list2 = (List) CollectionsKt.lastOrNull(arrayList);
            if (Intrinsics.areEqual((list2 == null || (znVar = (androidx.navigation.zn) CollectionsKt.last(list2)) == null || (sVarV = znVar.v()) == null) ? null : sVarV.f(), znVar2.v().f())) {
                list2.add(znVar2);
            } else {
                arrayList.add(CollectionsKt.mutableListOf(znVar2));
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List<androidx.navigation.zn> list3 : arrayList) {
            o(this.f3.gv(((androidx.navigation.zn) CollectionsKt.first((List) list3)).v().f()), list3, tVar, yVar, new f(ref$BooleanRef, list, new Ref$IntRef(), this, bundle));
        }
        return ref$BooleanRef.element;
    }

    public void ra(int i, Bundle bundle) {
        s8(z6().n3(i), bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rb() {
        /*
            r3 = this;
            a.xc r0 = r3.f962x4
            boolean r1 = r3.f951i4
            if (r1 == 0) goto Le
            int r1 = r3.mg()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.gv.rb():void");
    }

    public void rs(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.y.getClassLoader());
        this.f960v = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f944a = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.w.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i5 = 0;
            while (i < length) {
                this.f963xc.put(Integer.valueOf(intArray[i]), stringArrayList.get(i5));
                i++;
                i5++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                if (parcelableArray != null) {
                    Map<String, ArrayDeque<NavBackStackEntryState>> map = this.w;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>(parcelableArray.length);
                    Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                    while (it.hasNext()) {
                        Parcelable parcelable = (Parcelable) it.next();
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        arrayDeque.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(id, arrayDeque);
                }
            }
        }
        this.f949fb = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public androidx.navigation.s rz() {
        androidx.navigation.zn znVarFh = fh();
        if (znVarFh != null) {
            return znVarFh.v();
        }
        return null;
    }

    public void s8(androidx.navigation.c5 graph, Bundle bundle) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (!Intrinsics.areEqual(this.f950gv, graph)) {
            androidx.navigation.c5 c5Var = this.f950gv;
            if (c5Var != null) {
                for (Integer id : new ArrayList(this.f963xc.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    mt(id.intValue());
                }
                xg(this, c5Var.i9(), true, false, 4, null);
            }
            this.f950gv = graph;
            j(bundle);
            return;
        }
        int iW = graph.mg().w();
        for (int i = 0; i < iW; i++) {
            androidx.navigation.s sVarP = graph.mg().p(i);
            androidx.navigation.c5 c5Var2 = this.f950gv;
            Intrinsics.checkNotNull(c5Var2);
            int iT = c5Var2.mg().t(i);
            androidx.navigation.c5 c5Var3 = this.f950gv;
            Intrinsics.checkNotNull(c5Var3);
            c5Var3.mg().xc(iT, sVarP);
        }
        for (androidx.navigation.zn znVar : this.f956s) {
            List<androidx.navigation.s> listAsReversed = CollectionsKt.asReversed(SequencesKt.toList(androidx.navigation.s.z.zn(znVar.v())));
            androidx.navigation.s sVarC = this.f950gv;
            Intrinsics.checkNotNull(sVarC);
            for (androidx.navigation.s sVar : listAsReversed) {
                if (!Intrinsics.areEqual(sVar, this.f950gv) || !Intrinsics.areEqual(sVarC, graph)) {
                    if (sVarC instanceof androidx.navigation.c5) {
                        sVarC = ((androidx.navigation.c5) sVarC).c(sVar.i9());
                        Intrinsics.checkNotNull(sVarC);
                    }
                }
            }
            znVar.f(sVarC);
        }
    }

    public androidx.navigation.c5 ta() {
        androidx.navigation.c5 c5Var = this.f950gv;
        if (c5Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.checkNotNull(c5Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c5Var;
    }

    public final boolean u(int i, boolean z, boolean z5) {
        androidx.navigation.s sVarV;
        if (this.f956s.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(this.f956s).iterator();
        while (true) {
            if (!it.hasNext()) {
                sVarV = null;
                break;
            }
            sVarV = ((androidx.navigation.zn) it.next()).v();
            androidx.navigation.xc xcVarGv = this.f3.gv(sVarV.f());
            if (z || sVarV.i9() != i) {
                arrayList.add(xcVarGv);
            }
            if (sVarV.i9() == i) {
                break;
            }
        }
        if (sVarV != null) {
            return z(arrayList, sVarV, z, z5);
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + androidx.navigation.s.z.n3(this.y, i) + " as it was not found on the current back stack");
        return false;
    }

    public boolean ud(Intent intent) {
        int[] intArray;
        androidx.navigation.s sVarC;
        androidx.navigation.c5 c5Var;
        Bundle bundle;
        int i = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e4) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e4);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null || intArray.length == 0) {
            androidx.navigation.c5 c5Var2 = this.f950gv;
            Intrinsics.checkNotNull(c5Var2);
            s.n3 n3VarW = c5Var2.w(new androidx.navigation.fb(intent));
            if (n3VarW != null) {
                androidx.navigation.s sVarN3 = n3VarW.n3();
                int[] iArrFb = androidx.navigation.s.fb(sVarN3, null, 1, null);
                Bundle bundleV = sVarN3.v(n3VarW.zn());
                if (bundleV != null) {
                    bundle2.putAll(bundleV);
                }
                intArray = iArrFb;
                parcelableArrayList = null;
            }
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strF3 = f3(intArray);
        if (strF3 != null) {
            Log.i("NavController", "Could not find destination " + strF3 + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i5 = 0; i5 < length; i5++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i5)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i5] = bundle4;
        }
        int flags = intent.getFlags();
        int i8 = 268435456 & flags;
        if (i8 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            f3 f3VarN3 = f3.v(this.y).n3(intent);
            Intrinsics.checkNotNullExpressionValue(f3VarN3, "create(context)\n        …ntWithParentStack(intent)");
            f3VarN3.fb();
            Activity activity = this.n3;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i8 != 0) {
            if (!this.f956s.isEmpty()) {
                androidx.navigation.c5 c5Var3 = this.f950gv;
                Intrinsics.checkNotNull(c5Var3);
                xg(this, c5Var3.i9(), true, false, 4, null);
            }
            while (i < intArray.length) {
                int i10 = intArray[i];
                int i11 = i + 1;
                Bundle bundle5 = bundleArr[i];
                androidx.navigation.s sVarX4 = x4(i10);
                if (sVarX4 == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + androidx.navigation.s.z.n3(this.y, i10) + " cannot be found from the current destination " + rz());
                }
                qn(sVarX4, bundle5, u0.f.y(new t(sVarX4, this)), null);
                i = i11;
            }
            this.f949fb = true;
            return true;
        }
        androidx.navigation.c5 c5Var4 = this.f950gv;
        int length2 = intArray.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = intArray[i12];
            Bundle bundle6 = bundleArr[i12];
            if (i12 == 0) {
                sVarC = this.f950gv;
            } else {
                Intrinsics.checkNotNull(c5Var4);
                sVarC = c5Var4.c(i13);
            }
            if (sVarC == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + androidx.navigation.s.z.n3(this.y, i13) + " cannot be found in graph " + c5Var4);
            }
            if (i12 == intArray.length - 1) {
                t.y yVar = new t.y();
                androidx.navigation.c5 c5Var5 = this.f950gv;
                Intrinsics.checkNotNull(c5Var5);
                qn(sVarC, bundle6, t.y.c5(yVar, c5Var5.i9(), true, false, 4, null).n3(0).zn(0).y(), null);
            } else if (sVarC instanceof androidx.navigation.c5) {
                while (true) {
                    c5Var = (androidx.navigation.c5) sVarC;
                    Intrinsics.checkNotNull(c5Var);
                    if (!(c5Var.c(c5Var.d()) instanceof androidx.navigation.c5)) {
                        break;
                    }
                    sVarC = c5Var.c(c5Var.d());
                }
                c5Var4 = c5Var;
            }
        }
        this.f949fb = true;
        return true;
    }

    public boolean ut(int i, boolean z) {
        return q9(i, z, false);
    }

    public void vl(int i, Bundle bundle) {
        hw(i, bundle, null);
    }

    public final void w(androidx.navigation.s sVar, Bundle bundle, androidx.navigation.zn znVar, List<androidx.navigation.zn> list) {
        ArrayDeque<androidx.navigation.zn> arrayDeque;
        androidx.navigation.s sVarV;
        List<androidx.navigation.zn> list2;
        androidx.navigation.zn znVar2;
        Bundle bundle2;
        androidx.navigation.zn znVarPrevious;
        androidx.navigation.c5 c5Var;
        androidx.navigation.zn znVarPrevious2;
        List<androidx.navigation.zn> list3;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        androidx.navigation.zn znVar3 = znVar;
        List<androidx.navigation.zn> list4 = list;
        androidx.navigation.s sVarV2 = znVar.v();
        if (!(sVarV2 instanceof u0.zn)) {
            while (!this.f956s.isEmpty() && (this.f956s.last().v() instanceof u0.zn) && xg(this, this.f956s.last().v().i9(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        androidx.navigation.zn znVar4 = null;
        if (sVar instanceof androidx.navigation.c5) {
            androidx.navigation.s sVar2 = sVarV2;
            while (true) {
                Intrinsics.checkNotNull(sVar2);
                androidx.navigation.c5 c5VarT = sVar2.t();
                if (c5VarT != null) {
                    ListIterator<androidx.navigation.zn> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            znVarPrevious2 = listIterator.previous();
                            if (Intrinsics.areEqual(znVarPrevious2.v(), c5VarT)) {
                                break;
                            }
                        } else {
                            znVarPrevious2 = null;
                            break;
                        }
                    }
                    androidx.navigation.zn znVarN3 = znVarPrevious2;
                    if (znVarN3 == null) {
                        sVarV = sVarV2;
                        list3 = list4;
                        bundle3 = bundle4;
                        znVar2 = znVar3;
                        znVarN3 = zn.y.n3(androidx.navigation.zn.d0, this.y, c5VarT, bundle, d(), this.f953mt, null, null, 96, null);
                    } else {
                        sVarV = sVarV2;
                        list3 = list4;
                        znVar2 = znVar3;
                        bundle3 = bundle4;
                    }
                    arrayDeque2.addFirst(znVarN3);
                    if (this.f956s.isEmpty() || this.f956s.last().v() != c5VarT) {
                        list2 = list3;
                        bundle2 = bundle3;
                        c5Var = c5VarT;
                        arrayDeque = arrayDeque2;
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        c5Var = c5VarT;
                        arrayDeque = arrayDeque2;
                        ct(this, this.f956s.last(), false, null, 6, null);
                    }
                } else {
                    c5Var = c5VarT;
                    arrayDeque = arrayDeque2;
                    sVarV = sVarV2;
                    list2 = list4;
                    znVar2 = znVar3;
                    bundle2 = bundle4;
                }
                if (c5Var == null || c5Var == sVar) {
                    break;
                }
                znVar3 = znVar2;
                arrayDeque2 = arrayDeque;
                sVar2 = c5Var;
                bundle4 = bundle2;
                list4 = list2;
                sVarV2 = sVarV;
            }
        } else {
            arrayDeque = arrayDeque2;
            sVarV = sVarV2;
            list2 = list4;
            znVar2 = znVar3;
            bundle2 = bundle4;
        }
        androidx.navigation.s sVarV3 = arrayDeque.isEmpty() ? sVarV : ((androidx.navigation.zn) arrayDeque.first()).v();
        while (sVarV3 != null && x4(sVarV3.i9()) != sVarV3) {
            sVarV3 = sVarV3.t();
            if (sVarV3 != null) {
                Bundle bundle5 = (bundle2 == null || !bundle.isEmpty()) ? bundle2 : null;
                ListIterator<androidx.navigation.zn> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        znVarPrevious = listIterator2.previous();
                        if (Intrinsics.areEqual(znVarPrevious.v(), sVarV3)) {
                            break;
                        }
                    } else {
                        znVarPrevious = null;
                        break;
                    }
                }
                androidx.navigation.zn znVarN32 = znVarPrevious;
                if (znVarN32 == null) {
                    znVarN32 = zn.y.n3(androidx.navigation.zn.d0, this.y, sVarV3, sVarV3.v(bundle5), d(), this.f953mt, null, null, 96, null);
                }
                arrayDeque.addFirst(znVarN32);
            }
        }
        if (!arrayDeque.isEmpty()) {
            sVarV = ((androidx.navigation.zn) arrayDeque.first()).v();
        }
        while (!this.f956s.isEmpty() && (this.f956s.last().v() instanceof androidx.navigation.c5)) {
            androidx.navigation.s sVarV4 = this.f956s.last().v();
            Intrinsics.checkNotNull(sVarV4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((androidx.navigation.c5) sVarV4).d0(sVarV.i9(), false) != null) {
                break;
            } else {
                ct(this, this.f956s.last(), false, null, 6, null);
            }
        }
        androidx.navigation.zn znVarFirstOrNull = this.f956s.firstOrNull();
        if (znVarFirstOrNull == null) {
            znVarFirstOrNull = (androidx.navigation.zn) arrayDeque.firstOrNull();
        }
        if (!Intrinsics.areEqual(znVarFirstOrNull != null ? znVarFirstOrNull.v() : null, this.f950gv)) {
            ListIterator<androidx.navigation.zn> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                androidx.navigation.zn znVarPrevious3 = listIterator3.previous();
                androidx.navigation.s sVarV5 = znVarPrevious3.v();
                androidx.navigation.c5 c5Var2 = this.f950gv;
                Intrinsics.checkNotNull(c5Var2);
                if (Intrinsics.areEqual(sVarV5, c5Var2)) {
                    znVar4 = znVarPrevious3;
                    break;
                }
            }
            androidx.navigation.zn znVarN33 = znVar4;
            if (znVarN33 == null) {
                zn.y yVar = androidx.navigation.zn.d0;
                Context context = this.y;
                androidx.navigation.c5 c5Var3 = this.f950gv;
                Intrinsics.checkNotNull(c5Var3);
                androidx.navigation.c5 c5Var4 = this.f950gv;
                Intrinsics.checkNotNull(c5Var4);
                znVarN33 = zn.y.n3(yVar, context, c5Var3, c5Var4.v(bundle2), d(), this.f953mt, null, null, 96, null);
            }
            arrayDeque.addFirst(znVarN33);
        }
        for (androidx.navigation.zn znVar5 : arrayDeque) {
            n3 n3Var = this.n.get(this.f3.gv(znVar5.v().f()));
            if (n3Var == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + sVar.f() + " should already be created").toString());
            }
            n3Var.xc(znVar5);
        }
        this.f956s.addAll(arrayDeque);
        this.f956s.add(znVar2);
        for (androidx.navigation.zn znVar6 : CollectionsKt.plus(arrayDeque, znVar2)) {
            androidx.navigation.c5 c5VarT2 = znVar6.v().t();
            if (c5VarT2 != null) {
                k5(znVar6, n(c5VarT2.i9()));
            }
        }
    }

    public final boolean x(androidx.navigation.s sVar, Bundle bundle) {
        androidx.navigation.s sVarV;
        int iNextIndex;
        androidx.navigation.zn znVarFh = fh();
        int iI9 = sVar instanceof androidx.navigation.c5 ? androidx.navigation.c5.fh.y((androidx.navigation.c5) sVar).i9() : sVar.i9();
        if (znVarFh == null || (sVarV = znVarFh.v()) == null || iI9 != sVarV.i9()) {
            return false;
        }
        ArrayDeque<androidx.navigation.zn> arrayDeque = new ArrayDeque();
        ArrayDeque<androidx.navigation.zn> arrayDeque2 = this.f956s;
        ListIterator<androidx.navigation.zn> listIterator = arrayDeque2.listIterator(arrayDeque2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().v() == sVar) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        while (CollectionsKt.getLastIndex(this.f956s) >= iNextIndex) {
            androidx.navigation.zn znVarRemoveLast = this.f956s.removeLast();
            yc(znVarRemoveLast);
            arrayDeque.addFirst(new androidx.navigation.zn(znVarRemoveLast, znVarRemoveLast.v().v(bundle)));
        }
        for (androidx.navigation.zn znVar : arrayDeque) {
            androidx.navigation.c5 c5VarT = znVar.v().t();
            if (c5VarT != null) {
                k5(znVar, n(c5VarT.i9()));
            }
            this.f956s.add(znVar);
        }
        for (androidx.navigation.zn znVar2 : arrayDeque) {
            this.f3.gv(znVar2.v().f()).fb(znVar2);
        }
        return true;
    }

    public final androidx.navigation.s x4(int i) {
        androidx.navigation.s sVarV;
        androidx.navigation.c5 c5Var = this.f950gv;
        if (c5Var == null) {
            return null;
        }
        Intrinsics.checkNotNull(c5Var);
        if (c5Var.i9() == i) {
            return this.f950gv;
        }
        androidx.navigation.zn znVarLastOrNull = this.f956s.lastOrNull();
        if (znVarLastOrNull == null || (sVarV = znVarLastOrNull.v()) == null) {
            sVarV = this.f950gv;
            Intrinsics.checkNotNull(sVarV);
        }
        return i4(sVarV, i);
    }

    public final boolean y5(String str, boolean z, boolean z5) {
        androidx.navigation.zn znVarPrevious;
        if (this.f956s.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque<androidx.navigation.zn> arrayDeque = this.f956s;
        ListIterator<androidx.navigation.zn> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                znVarPrevious = null;
                break;
            }
            znVarPrevious = listIterator.previous();
            androidx.navigation.zn znVar = znVarPrevious;
            boolean zXc = znVar.v().xc(str, znVar.zn());
            if (z || !zXc) {
                arrayList.add(this.f3.gv(znVar.v().f()));
            }
            if (zXc) {
                break;
            }
        }
        androidx.navigation.zn znVar2 = znVarPrevious;
        androidx.navigation.s sVarV = znVar2 != null ? znVar2.v() : null;
        if (sVarV != null) {
            return z(arrayList, sVarV, z, z5);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final androidx.navigation.zn yc(androidx.navigation.zn child) {
        Intrinsics.checkNotNullParameter(child, "child");
        androidx.navigation.zn znVarRemove = this.f959tl.remove(child);
        if (znVarRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f961wz.get(znVarRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            n3 n3Var = this.n.get(this.f3.gv(znVarRemove.v().f()));
            if (n3Var != null) {
                n3Var.v(znVarRemove);
            }
            this.f961wz.remove(znVarRemove);
        }
        return znVarRemove;
    }

    public void yg(hw viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        androidx.navigation.v vVar = this.f953mt;
        v.n3 n3Var = androidx.navigation.v.f1001v;
        if (Intrinsics.areEqual(vVar, n3Var.y(viewModelStore))) {
            return;
        }
        if (!this.f956s.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f953mt = n3Var.y(viewModelStore);
    }

    public void yt(int i) {
        vl(i, null);
    }

    public final boolean z(List<? extends androidx.navigation.xc<?>> list, androidx.navigation.s sVar, boolean z, boolean z5) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>();
        Iterator<? extends androidx.navigation.xc<?>> it = list.iterator();
        while (it.hasNext()) {
            androidx.navigation.xc<? extends androidx.navigation.s> xcVar = (androidx.navigation.xc) it.next();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            jz(xcVar, this.f956s.last(), z5, new a(ref$BooleanRef2, ref$BooleanRef, this, z5, arrayDeque));
            if (!ref$BooleanRef2.element) {
                break;
            }
        }
        if (z5) {
            if (!z) {
                for (androidx.navigation.s sVar2 : SequencesKt.takeWhile(SequencesKt.generateSequence(sVar, fb.y), new s())) {
                    Map<Integer, String> map = this.f963xc;
                    Integer numValueOf = Integer.valueOf(sVar2.i9());
                    NavBackStackEntryState navBackStackEntryStateFirstOrNull = arrayDeque.firstOrNull();
                    map.put(numValueOf, navBackStackEntryStateFirstOrNull != null ? navBackStackEntryStateFirstOrNull.n3() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryStateFirst = arrayDeque.first();
                Iterator it2 = SequencesKt.takeWhile(SequencesKt.generateSequence(x4(navBackStackEntryStateFirst.y()), c5.y), new i9()).iterator();
                while (it2.hasNext()) {
                    this.f963xc.put(Integer.valueOf(((androidx.navigation.s) it2.next()).i9()), navBackStackEntryStateFirst.n3());
                }
                if (this.f963xc.values().contains(navBackStackEntryStateFirst.n3())) {
                    this.w.put(navBackStackEntryStateFirst.n3(), arrayDeque);
                }
            }
        }
        rb();
        return ref$BooleanRef.element;
    }

    public androidx.navigation.f z6() {
        return (androidx.navigation.f) this.f958ta.getValue();
    }
}
