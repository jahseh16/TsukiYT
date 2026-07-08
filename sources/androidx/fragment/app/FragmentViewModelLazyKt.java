package androidx.fragment.app;

import androidx.lifecycle.a;
import androidx.lifecycle.fh;
import androidx.lifecycle.rz;
import ap.b;
import ap.hw;
import ap.j5;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import yg.y;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements Function0<hw> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final hw invoke() {
            hw viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2, reason: invalid class name */
    public static final class AnonymousClass2 extends Lambda implements Function0<yg.y> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final yg.y invoke() {
            yg.y defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3, reason: invalid class name */
    public static final class AnonymousClass3 extends Lambda implements Function0<rz.n3> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final rz.n3 invoke() {
            rz.n3 defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4, reason: invalid class name */
    public static final class AnonymousClass4 extends Lambda implements Function0<hw> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final hw invoke() {
            hw viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5, reason: invalid class name */
    public static final class AnonymousClass5 extends Lambda implements Function0<yg.y> {
        final /* synthetic */ Function0<yg.y> $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function0<? extends yg.y> function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final yg.y invoke() {
            yg.y yVarInvoke;
            Function0<yg.y> function0 = this.$extrasProducer;
            if (function0 != null && (yVarInvoke = function0.invoke()) != null) {
                return yVarInvoke;
            }
            yg.y defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6, reason: invalid class name */
    public static final class AnonymousClass6 extends Lambda implements Function0<rz.n3> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final rz.n3 invoke() {
            rz.n3 defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2, reason: invalid class name and case insensitive filesystem */
    public static final class C02082 extends Lambda implements Function0<hw> {
        final /* synthetic */ Lazy<j5> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02082(Lazy<? extends j5> lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final hw invoke() {
            return FragmentViewModelLazyKt.m2viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3, reason: invalid class name and case insensitive filesystem */
    public static final class C02093 extends Lambda implements Function0<yg.y> {
        final /* synthetic */ Lazy<j5> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02093(Lazy<? extends j5> lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        public final yg.y invoke() {
            yg.y defaultViewModelCreationExtras;
            j5 j5VarM2viewModels$lambda0 = FragmentViewModelLazyKt.m2viewModels$lambda0(this.$owner$delegate);
            a aVar = j5VarM2viewModels$lambda0 instanceof a ? (a) j5VarM2viewModels$lambda0 : null;
            return (aVar == null || (defaultViewModelCreationExtras = aVar.getDefaultViewModelCreationExtras()) == null) ? y.C0200y.n3 : defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4, reason: invalid class name and case insensitive filesystem */
    public static final class C02104 extends Lambda implements Function0<rz.n3> {
        final /* synthetic */ Lazy<j5> $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02104(Fragment fragment, Lazy<? extends j5> lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final rz.n3 invoke() {
            rz.n3 defaultViewModelProviderFactory;
            j5 j5VarM2viewModels$lambda0 = FragmentViewModelLazyKt.m2viewModels$lambda0(this.$owner$delegate);
            a aVar = j5VarM2viewModels$lambda0 instanceof a ? (a) j5VarM2viewModels$lambda0 : null;
            if (aVar != null && (defaultViewModelProviderFactory = aVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            rz.n3 defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6, reason: invalid class name and case insensitive filesystem */
    public static final class C02126 extends Lambda implements Function0<hw> {
        final /* synthetic */ Lazy<j5> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02126(Lazy<? extends j5> lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final hw invoke() {
            return FragmentViewModelLazyKt.m3viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7, reason: invalid class name */
    public static final class AnonymousClass7 extends Lambda implements Function0<yg.y> {
        final /* synthetic */ Function0<yg.y> $extrasProducer;
        final /* synthetic */ Lazy<j5> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function0<? extends yg.y> function0, Lazy<? extends j5> lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        public final yg.y invoke() {
            yg.y yVarInvoke;
            Function0<yg.y> function0 = this.$extrasProducer;
            if (function0 != null && (yVarInvoke = function0.invoke()) != null) {
                return yVarInvoke;
            }
            j5 j5VarM3viewModels$lambda1 = FragmentViewModelLazyKt.m3viewModels$lambda1(this.$owner$delegate);
            a aVar = j5VarM3viewModels$lambda1 instanceof a ? (a) j5VarM3viewModels$lambda1 : null;
            return aVar != null ? aVar.getDefaultViewModelCreationExtras() : y.C0200y.n3;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8, reason: invalid class name */
    public static final class AnonymousClass8 extends Lambda implements Function0<rz.n3> {
        final /* synthetic */ Lazy<j5> $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Fragment fragment, Lazy<? extends j5> lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final rz.n3 invoke() {
            rz.n3 defaultViewModelProviderFactory;
            j5 j5VarM3viewModels$lambda1 = FragmentViewModelLazyKt.m3viewModels$lambda1(this.$owner$delegate);
            a aVar = j5VarM3viewModels$lambda1 instanceof a ? (a) j5VarM3viewModels$lambda1 : null;
            if (aVar != null && (defaultViewModelProviderFactory = aVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            rz.n3 defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final /* synthetic */ <VM extends b> Lazy<VM> activityViewModels(Fragment fragment, Function0<? extends rz.n3> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fragment);
        if (function0 == null) {
            function0 = new AnonymousClass3(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, anonymousClass1, anonymousClass2, function0);
    }

    public static /* synthetic */ Lazy activityViewModels$default(Fragment fragment, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fragment);
        if (function0 == null) {
            function0 = new AnonymousClass3(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, anonymousClass1, anonymousClass2, function0);
    }

    public static final /* synthetic */ Lazy createViewModelLazy(final Fragment fragment, KClass viewModelClass, Function0 storeProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        return createViewModelLazy(fragment, viewModelClass, storeProducer, new Function0<yg.y>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final yg.y invoke() {
                yg.y defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, function0);
    }

    public static /* synthetic */ Lazy createViewModelLazy$default(Fragment fragment, KClass kClass, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function02);
    }

    public static final /* synthetic */ <VM extends b> Lazy<VM> viewModels(Fragment fragment, Function0<? extends j5> ownerProducer, Function0<? extends rz.n3> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        C02082 c02082 = new C02082(lazy);
        C02093 c02093 = new C02093(lazy);
        if (function0 == null) {
            function0 = new C02104(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c02082, c02093, function0);
    }

    public static /* synthetic */ Lazy viewModels$default(final Fragment fragment, Function0 ownerProducer, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            ownerProducer = new Function0<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        C02082 c02082 = new C02082(lazy);
        C02093 c02093 = new C02093(lazy);
        if (function0 == null) {
            function0 = new C02104(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c02082, c02093, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final j5 m2viewModels$lambda0(Lazy<? extends j5> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final j5 m3viewModels$lambda1(Lazy<? extends j5> lazy) {
        return lazy.getValue();
    }

    public static final /* synthetic */ <VM extends b> Lazy<VM> activityViewModels(Fragment fragment, Function0<? extends yg.y> function0, Function0<? extends rz.n3> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(fragment);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(function0, fragment);
        if (function02 == null) {
            function02 = new AnonymousClass6(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, anonymousClass4, anonymousClass5, function02);
    }

    public static final <VM extends b> Lazy<VM> createViewModelLazy(final Fragment fragment, KClass<VM> viewModelClass, Function0<? extends hw> storeProducer, Function0<? extends yg.y> extrasProducer, Function0<? extends rz.n3> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        if (function0 == null) {
            function0 = new Function0<rz.n3>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final rz.n3 invoke() {
                    rz.n3 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            };
        }
        return new fh(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static /* synthetic */ Lazy createViewModelLazy$default(final Fragment fragment, KClass kClass, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = new Function0<yg.y>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final yg.y invoke() {
                    yg.y defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
            };
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function02, function03);
    }

    public static /* synthetic */ Lazy activityViewModels$default(Fragment fragment, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(fragment);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(function0, fragment);
        if (function02 == null) {
            function02 = new AnonymousClass6(fragment);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, anonymousClass4, anonymousClass5, function02);
    }

    public static final /* synthetic */ <VM extends b> Lazy<VM> viewModels(Fragment fragment, Function0<? extends j5> ownerProducer, Function0<? extends yg.y> function0, Function0<? extends rz.n3> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        C02126 c02126 = new C02126(lazy);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(function0, lazy);
        if (function02 == null) {
            function02 = new AnonymousClass8(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c02126, anonymousClass7, function02);
    }

    public static /* synthetic */ Lazy viewModels$default(final Fragment fragment, Function0 ownerProducer, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            ownerProducer = new Function0<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.5
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(b.class);
        C02126 c02126 = new C02126(lazy);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(function0, lazy);
        if (function02 == null) {
            function02 = new AnonymousClass8(fragment, lazy);
        }
        return createViewModelLazy(fragment, orCreateKotlinClass, c02126, anonymousClass7, function02);
    }
}
