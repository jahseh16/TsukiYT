package jj1;

import ij1.zn;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import mj1.a;
import mj1.a8;
import mj1.ad;
import mj1.c5;
import mj1.cs;
import mj1.cy;
import mj1.dm;
import mj1.e;
import mj1.f;
import mj1.fh;
import mj1.i2;
import mj1.ix;
import mj1.j;
import mj1.k;
import mj1.l;
import mj1.le;
import mj1.mg;
import mj1.mt;
import mj1.nf;
import mj1.o;
import mj1.oa;
import mj1.p;
import mj1.pz;
import mj1.q5;
import mj1.rz;
import mj1.s;
import mj1.t;
import mj1.ud;
import mj1.w9;
import mj1.wf;
import mj1.x5;
import mj1.xg;
import mj1.y5;
import mj1.yk;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final zn<float[]> a() {
        return ud.zn;
    }

    public static final zn<Byte> c(ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return t.y;
    }

    public static final zn<long[]> c5() {
        return y5.zn;
    }

    public static final <T> zn<T> co(zn<T> znVar) {
        Intrinsics.checkNotNullParameter(znVar, "<this>");
        return znVar.getDescriptor().n3() ? znVar : new nf(znVar);
    }

    public static final zn<Short> d(ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return ad.y;
    }

    public static final zn<Character> d0(CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return mt.y;
    }

    public static final zn<Duration> ej(Duration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return mg.y;
    }

    public static final <K, V> zn<Map<K, V>> f(zn<K> keySerializer, zn<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new k(keySerializer, valueSerializer);
    }

    public static final zn<Unit> f3(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return i2.n3;
    }

    public static final zn<int[]> fb() {
        return o.zn;
    }

    public static final zn<Double> fh(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return rz.y;
    }

    public static final zn<char[]> gv() {
        return p.zn;
    }

    public static final zn<UShort> i4(UShort.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return yk.y;
    }

    public static final <K, V> zn<Map.Entry<K, V>> i9(zn<K> keySerializer, zn<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new dm(keySerializer, valueSerializer);
    }

    public static final zn<Integer> mg(IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return j.y;
    }

    public static final zn<UShortArray> mt() {
        return ix.zn;
    }

    public static final zn<Boolean> n(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return c5.y;
    }

    public static final zn<boolean[]> n3() {
        return s.zn;
    }

    public static final zn<ULongArray> p() {
        return le.zn;
    }

    public static final zn<UInt> r(UInt.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return q5.y;
    }

    public static final zn<Float> rz(FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return a8.y;
    }

    public static final <T> zn<List<T>> s(zn<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new a(elementSerializer);
    }

    public static final <K, V> zn<Pair<K, V>> t(zn<K> keySerializer, zn<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new e(keySerializer, valueSerializer);
    }

    public static final zn<Long> ta(LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return xg.y;
    }

    public static final zn<short[]> tl() {
        return wf.zn;
    }

    public static final zn<double[]> v() {
        return fh.zn;
    }

    public static final zn<UIntArray> w() {
        return x5.zn;
    }

    public static final <A, B, C> zn<Triple<A, B, C>> wz(zn<A> aSerializer, zn<B> bSerializer, zn<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new l(aSerializer, bSerializer, cSerializer);
    }

    public static final zn<ULong> x4(ULong.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return cs.y;
    }

    public static final zn<UByteArray> xc() {
        return oa.zn;
    }

    public static final <T, E extends T> zn<E[]> y(KClass<T> kClass, zn<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new pz(kClass, elementSerializer);
    }

    public static final zn<UByte> z(UByte.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return w9.y;
    }

    public static final zn<String> z6(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return cy.y;
    }

    public static final zn<byte[]> zn() {
        return f.zn;
    }
}
