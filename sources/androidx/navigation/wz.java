package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz<T> {
    public final String n3 = "nav_type";
    public final boolean y;
    public static final t zn = new t(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final wz<Integer> f1006gv = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final wz<Integer> f1011v = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wz<int[]> f1002a = new v();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final wz<Long> f1005fb = new s();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final wz<long[]> f1008s = new fb();

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final wz<Float> f1003c5 = new gv();

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final wz<float[]> f1007i9 = new zn();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wz<Boolean> f1004f = new n3();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final wz<boolean[]> f1009t = new y();

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final wz<String> f1010tl = new f();

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final wz<String[]> f1012wz = new i9();

    public static final class a extends wz<Integer> {
        public a() {
            super(false);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public Integer y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        public void f(Bundle bundle, String key, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, i);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public Integer a(String value) {
            int i;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.startsWith$default(value, "0x", false, 2, (Object) null)) {
                String strSubstring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "integer";
        }

        @Override // androidx.navigation.wz
        public /* bridge */ /* synthetic */ void s(Bundle bundle, String str, Integer num) {
            f(bundle, str, num.intValue());
        }
    }

    public static final class c5 extends wz<Integer> {
        public c5() {
            super(false);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public Integer y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        public void f(Bundle bundle, String key, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, i);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public Integer a(String value) {
            int i;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.startsWith$default(value, "0x", false, 2, (Object) null)) {
                String strSubstring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "reference";
        }

        @Override // androidx.navigation.wz
        public /* bridge */ /* synthetic */ void s(Bundle bundle, String str, Integer num) {
            f(bundle, str, num.intValue());
        }
    }

    public static final class f extends wz<String> {
        public f() {
            super(true);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public String y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putString(key, str);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public String a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "string";
        }
    }

    public static final class fb extends wz<long[]> {
        public fb() {
            super(true);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public long[] y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public long[] fb(String value, long[] jArr) {
            long[] jArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (jArr == null || (jArrPlus = ArraysKt.plus(jArr, a(value))) == null) ? a(value) : jArrPlus;
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public long[] a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new long[]{wz.f1005fb.a(value).longValue()};
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "long[]";
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, long[] jArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLongArray(key, jArr);
        }
    }

    public static final class gv extends wz<Float> {
        public gv() {
            super(false);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public Float y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        public void f(Bundle bundle, String key, float f3) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloat(key, f3);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public Float a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "float";
        }

        @Override // androidx.navigation.wz
        public /* bridge */ /* synthetic */ void s(Bundle bundle, String str, Float f3) {
            f(bundle, str, f3.floatValue());
        }
    }

    public static final class i9 extends wz<String[]> {
        public i9() {
            super(true);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public String[] y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String[] fb(String value, String[] strArr) {
            String[] strArr2;
            Intrinsics.checkNotNullParameter(value, "value");
            return (strArr == null || (strArr2 = (String[]) ArraysKt.plus(strArr, a(value))) == null) ? a(value) : strArr2;
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public String[] a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new String[]{value};
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "string[]";
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, String[] strArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putStringArray(key, strArr);
        }
    }

    public static final class n3 extends wz<Boolean> {
        public n3() {
            super(false);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public Boolean y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Boolean) bundle.get(key);
        }

        public void f(Bundle bundle, String key, boolean z) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBoolean(key, z);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public Boolean a(String value) {
            boolean z;
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "true")) {
                z = true;
            } else {
                if (!Intrinsics.areEqual(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "boolean";
        }

        @Override // androidx.navigation.wz
        public /* bridge */ /* synthetic */ void s(Bundle bundle, String str, Boolean bool) {
            f(bundle, str, bool.booleanValue());
        }
    }

    public static final class s extends wz<Long> {
        public s() {
            super(false);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public Long y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        public void f(Bundle bundle, String key, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLong(key, j);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public Long a(String value) {
            String strSubstring;
            long j;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.endsWith$default(value, "L", false, 2, (Object) null)) {
                strSubstring = value.substring(0, value.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = value;
            }
            if (StringsKt.startsWith$default(value, "0x", false, 2, (Object) null)) {
                String strSubstring2 = strSubstring.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                j = Long.parseLong(strSubstring2, CharsKt.checkRadix(16));
            } else {
                j = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j);
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "long";
        }

        @Override // androidx.navigation.wz
        public /* bridge */ /* synthetic */ void s(Bundle bundle, String str, Long l3) {
            f(bundle, str, l3.longValue());
        }
    }

    public static final class t {
        public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wz<Object> n3(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                try {
                    try {
                        try {
                            wz<Integer> wzVar = wz.f1006gv;
                            wzVar.a(value);
                            Intrinsics.checkNotNull(wzVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return wzVar;
                        } catch (IllegalArgumentException unused) {
                            wz<Boolean> wzVar2 = wz.f1004f;
                            wzVar2.a(value);
                            Intrinsics.checkNotNull(wzVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return wzVar2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        wz<Long> wzVar3 = wz.f1005fb;
                        wzVar3.a(value);
                        Intrinsics.checkNotNull(wzVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return wzVar3;
                    }
                } catch (IllegalArgumentException unused3) {
                    wz<String> wzVar4 = wz.f1010tl;
                    Intrinsics.checkNotNull(wzVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return wzVar4;
                }
            } catch (IllegalArgumentException unused4) {
                wz<Float> wzVar5 = wz.f1003c5;
                wzVar5.a(value);
                Intrinsics.checkNotNull(wzVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return wzVar5;
            }
        }

        public wz<?> y(String str, String str2) {
            String strSubstring;
            wz<Integer> wzVar = wz.f1006gv;
            if (Intrinsics.areEqual(wzVar.n3(), str)) {
                return wzVar;
            }
            wz wzVar2 = wz.f1002a;
            if (Intrinsics.areEqual(wzVar2.n3(), str)) {
                return wzVar2;
            }
            wz<Long> wzVar3 = wz.f1005fb;
            if (Intrinsics.areEqual(wzVar3.n3(), str)) {
                return wzVar3;
            }
            wz wzVar4 = wz.f1008s;
            if (Intrinsics.areEqual(wzVar4.n3(), str)) {
                return wzVar4;
            }
            wz<Boolean> wzVar5 = wz.f1004f;
            if (Intrinsics.areEqual(wzVar5.n3(), str)) {
                return wzVar5;
            }
            wz wzVar6 = wz.f1009t;
            if (Intrinsics.areEqual(wzVar6.n3(), str)) {
                return wzVar6;
            }
            wz<String> wzVar7 = wz.f1010tl;
            if (Intrinsics.areEqual(wzVar7.n3(), str)) {
                return wzVar7;
            }
            wz wzVar8 = wz.f1012wz;
            if (Intrinsics.areEqual(wzVar8.n3(), str)) {
                return wzVar8;
            }
            wz<Float> wzVar9 = wz.f1003c5;
            if (Intrinsics.areEqual(wzVar9.n3(), str)) {
                return wzVar9;
            }
            wz wzVar10 = wz.f1007i9;
            if (Intrinsics.areEqual(wzVar10.n3(), str)) {
                return wzVar10;
            }
            wz<Integer> wzVar11 = wz.f1011v;
            if (Intrinsics.areEqual(wzVar11.n3(), str)) {
                return wzVar11;
            }
            if (str == null || str.length() == 0) {
                return wzVar7;
            }
            try {
                if (!StringsKt.startsWith$default(str, ".", false, 2, (Object) null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                if (StringsKt.endsWith$default(str, "[]", false, 2, (Object) null)) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls = Class.forName(strSubstring);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        return new C0025wz(cls);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new w(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(strSubstring);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                        return new xc(cls2);
                    }
                    if (Enum.class.isAssignableFrom(cls2)) {
                        Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        return new tl(cls2);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new p(cls2);
                    }
                }
                throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.navigation.wz<java.lang.Object> zn(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.wz.t.zn(java.lang.Object):androidx.navigation.wz");
        }

        public t() {
        }
    }

    public static final class tl<D extends Enum<?>> extends p<D> {
        public final Class<D> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public tl(Class<D> type) {
            super(false, type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.w = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.wz.p, androidx.navigation.wz
        public String n3() {
            String name = this.w.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.wz.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public D a(String value) {
            D d4;
            Intrinsics.checkNotNullParameter(value, "value");
            D[] enumConstants = this.w.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d4 = null;
                    break;
                }
                d4 = enumConstants[i];
                if (StringsKt.equals(d4.name(), value, true)) {
                    break;
                }
                i++;
            }
            D d5 = d4;
            if (d5 != null) {
                return d5;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.w.getName() + '.');
        }
    }

    public static final class v extends wz<int[]> {
        public v() {
            super(true);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public int[] y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int[] fb(String value, int[] iArr) {
            int[] iArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (iArr == null || (iArrPlus = ArraysKt.plus(iArr, a(value))) == null) ? a(value) : iArrPlus;
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public int[] a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new int[]{wz.f1006gv.a(value).intValue()};
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "integer[]";
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, int[] iArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putIntArray(key, iArr);
        }
    }

    public static final class w<D extends Serializable> extends wz<D[]> {

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public final Class<D[]> f1014xc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f1014xc = cls;
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public D[] y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(w.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.f1014xc, ((w) obj).f1014xc);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, D[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f1014xc.cast(dArr);
            bundle.putSerializable(key, dArr);
        }

        public int hashCode() {
            return this.f1014xc.hashCode();
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public D[] a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.wz
        public String n3() {
            String name = this.f1014xc.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.wz$wz, reason: collision with other inner class name */
    public static final class C0025wz<D extends Parcelable> extends wz<D[]> {

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public final Class<D[]> f1015xc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0025wz(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f1015xc = cls;
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public D[] y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(C0025wz.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.f1015xc, ((C0025wz) obj).f1015xc);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, D[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f1015xc.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }

        public int hashCode() {
            return this.f1015xc.hashCode();
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public D[] a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.wz
        public String n3() {
            String name = this.f1015xc.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }
    }

    public static final class xc<D> extends wz<D> {

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public final Class<D> f1016xc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public xc(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.f1016xc = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.wz
        public D a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(xc.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.f1016xc, ((xc) obj).f1016xc);
        }

        public int hashCode() {
            return this.f1016xc.hashCode();
        }

        @Override // androidx.navigation.wz
        public String n3() {
            String name = this.f1016xc.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.wz
        public void s(Bundle bundle, String key, D d4) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f1016xc.cast(d4);
            if (d4 == null || (d4 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d4);
            } else if (d4 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d4);
            }
        }

        @Override // androidx.navigation.wz
        public D y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D) bundle.get(key);
        }
    }

    public static final class y extends wz<boolean[]> {
        public y() {
            super(true);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public boolean[] y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean[] fb(String value, boolean[] zArr) {
            boolean[] zArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (zArr == null || (zArrPlus = ArraysKt.plus(zArr, a(value))) == null) ? a(value) : zArrPlus;
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public boolean[] a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new boolean[]{wz.f1004f.a(value).booleanValue()};
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "boolean[]";
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, boolean[] zArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    }

    public static final class zn extends wz<float[]> {
        public zn() {
            super(true);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public float[] y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public float[] fb(String value, float[] fArr) {
            float[] fArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (fArr == null || (fArrPlus = ArraysKt.plus(fArr, a(value))) == null) ? a(value) : fArrPlus;
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public float[] a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new float[]{wz.f1003c5.a(value).floatValue()};
        }

        @Override // androidx.navigation.wz
        public String n3() {
            return "float[]";
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, float[] fArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    }

    public wz(boolean z) {
        this.y = z;
    }

    public abstract T a(String str);

    public T fb(String value, T t3) {
        Intrinsics.checkNotNullParameter(value, "value");
        return a(value);
    }

    public final T gv(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        T tA = a(value);
        s(bundle, key, tA);
        return tA;
    }

    public abstract String n3();

    public abstract void s(Bundle bundle, String str, T t3);

    public String toString() {
        return n3();
    }

    public final T v(Bundle bundle, String key, String str, T t3) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return t3;
        }
        T tFb = fb(str, t3);
        s(bundle, key, tFb);
        return tFb;
    }

    public abstract T y(Bundle bundle, String str);

    public boolean zn() {
        return this.y;
    }

    public static class p<D extends Serializable> extends wz<D> {

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public final Class<D> f1013xc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.f1013xc = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
        public D y(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (D) bundle.get(key);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return Intrinsics.areEqual(this.f1013xc, ((p) obj).f1013xc);
            }
            return false;
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void s(Bundle bundle, String key, D value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f1013xc.cast(value);
            bundle.putSerializable(key, value);
        }

        public int hashCode() {
            return this.f1013xc.hashCode();
        }

        @Override // androidx.navigation.wz
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public D a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.wz
        public String n3() {
            String name = this.f1013xc.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(boolean z, Class<D> type) {
            super(z);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f1013xc = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
