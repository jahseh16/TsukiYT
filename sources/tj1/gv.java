package tj1;

import com.google.protobuf.Reader;
import hk1.a;
import hk1.en;
import hk1.fb;
import hk1.k;
import hk1.s;
import hk1.yt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import sj1.fh;
import sj1.mg;
import sj1.n;
import sj1.p;
import sj1.r;
import sj1.rz;
import sj1.v;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f8210a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f8211c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Regex f8212fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final fh f8213gv;
    public static final z n3 = z.f8056v.s(new String[0]);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f8214s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final yt f8215v;
    public static final byte[] y;
    public static final mg zn;

    static {
        byte[] bArr = new byte[0];
        y = bArr;
        zn = mg.n3.c5(mg.Companion, bArr, null, 1, null);
        f8213gv = fh.y.w(fh.Companion, bArr, null, 0, 0, 7, null);
        yt.y yVar = yt.fb;
        s.y yVar2 = s.fb;
        f8215v = yVar.gv(new s[]{yVar2.n3("efbbbf"), yVar2.n3("feff"), yVar2.n3("fffe"), yVar2.n3("0000ffff"), yVar2.n3("ffff0000")});
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f8210a = timeZone;
        f8212fb = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f8214s = false;
        String name = n.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f8211c5 = StringsKt.removeSuffix(StringsKt.removePrefix(name, "okhttp3."), "Client");
    }

    public static final long a(int i, long j) {
        return ((long) i) & j;
    }

    public static final Charset a8(fb fbVar, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(fbVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iV = fbVar.v(f8215v);
        if (iV == -1) {
            return charset;
        }
        if (iV == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iV == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iV == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iV == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iV == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    public static final int b(fb fbVar) throws IOException {
        Intrinsics.checkNotNullParameter(fbVar, "<this>");
        return gv(fbVar.readByte(), 255) | (gv(fbVar.readByte(), 255) << 16) | (gv(fbVar.readByte(), 255) << 8);
    }

    public static final int c(String str, int i, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i5) {
            int i8 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i = i8;
        }
        return i5;
    }

    public static final boolean c5(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f8212fb.matches(str);
    }

    public static final boolean co(en enVar, int i, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(enVar, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return yt(enVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean d(bk1.y yVar, File file) throws IOException {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        k kVarA = yVar.a(file);
        try {
            try {
                yVar.s(file);
                CloseableKt.closeFinally(kVarA, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(kVarA, null);
                yVar.s(file);
                return false;
            }
        } finally {
        }
    }

    public static /* synthetic */ int d0(String str, int i, int i5, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i5 = str.length();
        }
        return c(str, i, i5);
    }

    public static final boolean ej(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.equals(name, "Authorization", true) || StringsKt.equals(name, "Cookie", true) || StringsKt.equals(name, "Proxy-Authorization", true) || StringsKt.equals(name, "Set-Cookie", true);
    }

    public static /* synthetic */ String en(String str, int i, int i5, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i5 = str.length();
        }
        return f7(str, i, i5);
    }

    public static final int f(String name, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j < 0) {
            throw new IllegalStateException(Intrinsics.stringPlus(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(name, " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus(name, " too small.").toString());
    }

    public static final int f3(String[] strArr, String value, Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final String f7(String str, int i, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iC = c(str, i, i5);
        String strSubstring = str.substring(iC, fh(str, iC, i5));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final p.zn fb(final p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return new p.zn() { // from class: tj1.n3
            @Override // sj1.p.zn
            public final p y(v vVar) {
                return gv.s(pVar, vVar);
            }
        };
    }

    public static final int fh(String str, int i, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i8 = i5 - 1;
        if (i <= i8) {
            while (true) {
                int i10 = i8 - 1;
                char cCharAt = str.charAt(i8);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i8 + 1;
                }
                if (i8 == i) {
                    break;
                }
                i8 = i10;
            }
        }
        return i;
    }

    public static final int gv(byte b4, int i) {
        return b4 & i;
    }

    public static final Thread hw(String name, boolean z, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z);
        return thread;
    }

    @SafeVarargs
    public static final <T> List<T> i4(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final boolean i9(r rVar, r other) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(rVar.f(), other.f()) && rVar.mt() == other.mt() && Intrinsics.areEqual(rVar.x4(), other.x4());
    }

    public static /* synthetic */ String j(r rVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return o(rVar, z);
    }

    public static final List<ak1.zn> j5(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        IntRange intRangeUntil = RangesKt.until(0, zVar.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new ak1.zn(zVar.zn(iNextInt), zVar.s(iNextInt)));
        }
        return arrayList;
    }

    public static final Throwable jz(Exception exc, List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final int k(String str, int i) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (lValueOf == null) {
            return i;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Reader.READ_DONE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final int k5(hk1.v vVar, byte b4) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        int i = 0;
        while (!vVar.dm() && vVar.rz(0L) == b4) {
            i++;
            vVar.readByte();
        }
        return i;
    }

    public static final int mg(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i < length) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i = i5;
        }
        return str.length();
    }

    public static /* synthetic */ int mt(String str, char c, int i, int i5, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            i5 = str.length();
        }
        return w(str, c, i, i5);
    }

    public static final int n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i;
            }
            i = i5;
        }
        return -1;
    }

    public static final String o(r rVar, boolean z) {
        String strF;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (StringsKt.contains$default((CharSequence) rVar.f(), (CharSequence) ":", false, 2, (Object) null)) {
            strF = '[' + rVar.f() + ']';
        } else {
            strF = rVar.f();
        }
        if (!z && rVar.mt() == r.f7991f.zn(rVar.x4())) {
            return strF;
        }
        return strF + ':' + rVar.mt();
    }

    public static final <T> List<T> oz(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int p(String str, String delimiters, int i, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i5) {
            int i8 = i + 1;
            if (StringsKt.contains$default((CharSequence) delimiters, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i = i8;
        }
        return i5;
    }

    public static final long q9(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final z qn(List<ak1.zn> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        z.y yVar = new z.y();
        for (ak1.zn znVar : list) {
            yVar.gv(znVar.y().yg(), znVar.n3().yg());
        }
        return yVar.a();
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ int rz(String str, int i, int i5, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i5 = str.length();
        }
        return fh(str, i, i5);
    }

    public static final p s(p this_asFactory, v it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final void t(long j, long j4, long j7) {
        if ((j4 | j7) < 0 || j4 > j || j - j4 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final String[] ta(String[] strArr, String[] other, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = other.length;
            int i5 = 0;
            while (true) {
                if (i5 < length2) {
                    String str2 = other[i5];
                    i5++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final void tl(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void u(a aVar, int i) throws IOException {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.writeByte((i >>> 16) & 255);
        aVar.writeByte((i >>> 8) & 255);
        aVar.writeByte(i & 255);
    }

    public static final int ud(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final <K, V> Map<K, V> ut(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final int v(short s3, int i) {
        return s3 & i;
    }

    public static final ThreadFactory vl(final String name, final boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: tj1.zn
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return gv.hw(name, z, runnable);
            }
        };
    }

    public static final int w(String str, char c, int i, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i5) {
            int i8 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i8;
        }
        return i5;
    }

    public static final void wz(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!Intrinsics.areEqual(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final <T> T x(Object instance, Class<T> fieldType, String fieldName) {
        T tCast;
        Object objX;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            tCast = null;
            if (Intrinsics.areEqual(superclass, Object.class)) {
                if (Intrinsics.areEqual(fieldName, "delegate") || (objX = x(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) x(objX, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                tCast = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                Intrinsics.checkNotNullExpressionValue(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    public static final long x4(rz rzVar) {
        Intrinsics.checkNotNullParameter(rzVar, "<this>");
        String strY = rzVar.mg().y("Content-Length");
        if (strY == null) {
            return -1L;
        }
        return q9(strY, -1L);
    }

    public static final String[] xc(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final boolean yt(en enVar, int i, TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(enVar, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jGv = enVar.timeout().a() ? enVar.timeout().gv() - jNanoTime : Long.MAX_VALUE;
        enVar.timeout().v(Math.min(jGv, timeUnit.toNanos(i)) + jNanoTime);
        try {
            hk1.v vVar = new hk1.v();
            while (enVar.read(vVar, 8192L) != -1) {
                vVar.t();
            }
            if (jGv == Long.MAX_VALUE) {
                enVar.timeout().n3();
            } else {
                enVar.timeout().v(jNanoTime + jGv);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jGv == Long.MAX_VALUE) {
                enVar.timeout().n3();
            } else {
                enVar.timeout().v(jNanoTime + jGv);
            }
            return false;
        } catch (Throwable th) {
            if (jGv == Long.MAX_VALUE) {
                enVar.timeout().n3();
            } else {
                enVar.timeout().v(jNanoTime + jGv);
            }
            throw th;
        }
    }

    public static final String z(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean z6(Socket socket, fb source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !source.dm();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final <E> void zn(List<E> list, E e4) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(e4)) {
            return;
        }
        list.add(e4);
    }
}
