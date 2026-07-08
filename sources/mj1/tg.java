package mj1;

import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public final class tg {
    public static final Map<KClass<? extends Object>, ij1.zn<? extends Object>> y = MapsKt.mapOf(TuplesKt.to(Reflection.getOrCreateKotlinClass(String.class), jj1.y.z6(StringCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(Character.TYPE), jj1.y.d0(CharCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(char[].class), jj1.y.gv()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Double.TYPE), jj1.y.fh(DoubleCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(double[].class), jj1.y.v()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Float.TYPE), jj1.y.rz(FloatCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(float[].class), jj1.y.a()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Long.TYPE), jj1.y.ta(LongCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(long[].class), jj1.y.c5()), TuplesKt.to(Reflection.getOrCreateKotlinClass(ULong.class), jj1.y.x4(ULong.Companion)), TuplesKt.to(Reflection.getOrCreateKotlinClass(ULongArray.class), jj1.y.p()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Integer.TYPE), jj1.y.mg(IntCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(int[].class), jj1.y.fb()), TuplesKt.to(Reflection.getOrCreateKotlinClass(UInt.class), jj1.y.r(UInt.Companion)), TuplesKt.to(Reflection.getOrCreateKotlinClass(UIntArray.class), jj1.y.w()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Short.TYPE), jj1.y.d(ShortCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(short[].class), jj1.y.tl()), TuplesKt.to(Reflection.getOrCreateKotlinClass(UShort.class), jj1.y.i4(UShort.Companion)), TuplesKt.to(Reflection.getOrCreateKotlinClass(UShortArray.class), jj1.y.mt()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Byte.TYPE), jj1.y.c(ByteCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(byte[].class), jj1.y.zn()), TuplesKt.to(Reflection.getOrCreateKotlinClass(UByte.class), jj1.y.z(UByte.Companion)), TuplesKt.to(Reflection.getOrCreateKotlinClass(UByteArray.class), jj1.y.xc()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Boolean.TYPE), jj1.y.n(BooleanCompanionObject.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(boolean[].class), jj1.y.n3()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Unit.class), jj1.y.f3(Unit.INSTANCE)), TuplesKt.to(Reflection.getOrCreateKotlinClass(Duration.class), jj1.y.ej(Duration.Companion)));

    public static final void gv(String str) {
        Iterator<KClass<? extends Object>> it = y.keySet().iterator();
        while (it.hasNext()) {
            String simpleName = it.next().getSimpleName();
            Intrinsics.checkNotNull(simpleName);
            String strZn = zn(simpleName);
            if (StringsKt.equals(str, "kotlin." + strZn, true) || StringsKt.equals(str, strZn, true)) {
                throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + zn(strZn) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    public static final <T> ij1.zn<T> n3(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (ij1.zn) y.get(kClass);
    }

    public static final kj1.a y(String serialName, kj1.v kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        gv(serialName);
        return new y4(serialName, kind);
    }

    public static final String zn(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt.titlecase(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }
}
