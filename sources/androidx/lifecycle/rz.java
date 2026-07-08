package androidx.lifecycle;

import android.app.Application;
import ap.b;
import ap.hw;
import ap.j5;
import ap.vl;
import ap.yt;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.y;

/* JADX INFO: loaded from: classes.dex */
public class rz {
    public final n3 n3;
    public final hw y;
    public final yg.y zn;

    public static class gv {
        public void y(b viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    public interface n3 {
        <T extends b> T create(Class<T> cls);

        <T extends b> T create(Class<T> cls, yg.y yVar);
    }

    public static class zn implements n3 {
        public static zn n3;
        public static final y y = new y(null);
        public static final y.n3<String> zn = y.C0014y.y;

        public static final class y {

            /* JADX INFO: renamed from: androidx.lifecycle.rz$zn$y$y, reason: collision with other inner class name */
            public static final class C0014y implements y.n3<String> {
                public static final C0014y y = new C0014y();
            }

            public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final zn y() {
                if (zn.n3 == null) {
                    zn.n3 = new zn();
                }
                zn znVar = zn.n3;
                Intrinsics.checkNotNull(znVar);
                return znVar;
            }

            public y() {
            }
        }

        @Override // androidx.lifecycle.rz.n3
        public /* synthetic */ b create(Class cls, yg.y yVar) {
            return yt.n3(this, cls, yVar);
        }

        @Override // androidx.lifecycle.rz.n3
        public <T extends b> T create(Class<T> modelClass) throws InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
                Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rz(hw store, n3 factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends b> T n3(String key, Class<T> modelClass) {
        T t3;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T t5 = (T) this.y.n3(key);
        if (!modelClass.isInstance(t5)) {
            yg.gv gvVar = new yg.gv(this.zn);
            gvVar.zn(zn.zn, key);
            try {
                t3 = (T) this.n3.create(modelClass, gvVar);
            } catch (AbstractMethodError unused) {
                t3 = (T) this.n3.create(modelClass);
            }
            this.y.gv(key, t3);
            return t3;
        }
        Object obj = this.n3;
        gv gvVar2 = obj instanceof gv ? (gv) obj : null;
        if (gvVar2 != null) {
            Intrinsics.checkNotNull(t5);
            gvVar2.y(t5);
        }
        Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t5;
    }

    public <T extends b> T y(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) n3("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public static class y extends zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static y f855a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Application f858gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final C0012y f857v = new C0012y(null);

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public static final y.n3<Application> f856fb = C0012y.C0013y.y;

        /* JADX INFO: renamed from: androidx.lifecycle.rz$y$y, reason: collision with other inner class name */
        public static final class C0012y {

            /* JADX INFO: renamed from: androidx.lifecycle.rz$y$y$y, reason: collision with other inner class name */
            public static final class C0013y implements y.n3<Application> {
                public static final C0013y y = new C0013y();
            }

            public /* synthetic */ C0012y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final y n3(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (y.f855a == null) {
                    y.f855a = new y(application);
                }
                y yVar = y.f855a;
                Intrinsics.checkNotNull(yVar);
                return yVar;
            }

            public final n3 y(j5 owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                return owner instanceof a ? ((a) owner).getDefaultViewModelProviderFactory() : zn.y.y();
            }

            public C0012y() {
            }
        }

        public y(Application application, int i) {
            this.f858gv = application;
        }

        @Override // androidx.lifecycle.rz.zn, androidx.lifecycle.rz.n3
        public <T extends b> T create(Class<T> modelClass, yg.y extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f858gv != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.y(f856fb);
            if (application != null) {
                return (T) v(modelClass, application);
            }
            if (ap.y.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public final <T extends b> T v(Class<T> cls, Application application) {
            if (!ap.y.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            }
        }

        public y() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public y(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.rz.zn, androidx.lifecycle.rz.n3
        public <T extends b> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f858gv;
            if (application != null) {
                return (T) v(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public rz(hw store, n3 factory, yg.y defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.y = store;
        this.n3 = factory;
        this.zn = defaultCreationExtras;
    }

    public /* synthetic */ rz(hw hwVar, n3 n3Var, yg.y yVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hwVar, n3Var, (i & 4) != 0 ? y.C0200y.n3 : yVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rz(j5 owner) {
        this(owner.getViewModelStore(), y.f857v.y(owner), vl.y(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rz(j5 owner, n3 factory) {
        this(owner.getViewModelStore(), factory, vl.y(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
