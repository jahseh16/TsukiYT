package vj1;

import ck1.i9;
import hk1.en;
import hk1.fb;
import hk1.k;
import hk1.wz;
import hk1.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements Closeable, Flushable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj1.gv f8811b;
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f8812co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8813d;
    public boolean d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f8814ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8815f;
    public int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f8816fb;
    public boolean fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final v f8817hw;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final File f8818p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashMap<String, zn> f8819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final File f8821t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final File f8822v;
    public final File w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8823x;
    public final bk1.y y;
    public hk1.a z;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final y f8808j5 = new y(null);
    public static final String qn = "journal";
    public static final String o = "journal.tmp";
    public static final String j = "journal.bkp";
    public static final String oz = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public static final String f8810ut = "1";
    public static final long q9 = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Regex f8809k = new Regex("[a-z0-9_-]{1,120}");
    public static final String f7 = "CLEAN";
    public static final String en = "DIRTY";
    public static final String jz = "REMOVE";
    public static final String u = "READ";

    public static final class a extends Lambda implements Function1<IOException, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
            y(iOException);
            return Unit.INSTANCE;
        }

        public final void y(IOException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            gv gvVar = gv.this;
            if (!tj1.gv.f8214s || Thread.holdsLock(gvVar)) {
                gv.this.n = true;
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + gvVar);
        }
    }

    /* JADX INFO: renamed from: vj1.gv$gv, reason: collision with other inner class name */
    public final class C0186gv implements Closeable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ gv f8824f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final List<en> f8825fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final long[] f8826s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f8827v;
        public final String y;

        public C0186gv(gv this$0, String key, long j, List<? extends en> sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f8824f = this$0;
            this.y = key;
            this.f8827v = j;
            this.f8825fb = sources;
            this.f8826s = lengths;
        }

        public final en a(int i) {
            return this.f8825fb.get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<en> it = this.f8825fb.iterator();
            while (it.hasNext()) {
                tj1.gv.tl(it.next());
            }
        }

        public final n3 y() throws IOException {
            return this.f8824f.mg(this.y, this.f8827v);
        }
    }

    public final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final /* synthetic */ gv f8828gv;
        public final boolean[] n3;
        public final zn y;
        public boolean zn;

        public static final class y extends Lambda implements Function1<IOException, Unit> {
            final /* synthetic */ gv this$0;
            final /* synthetic */ n3 this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(gv gvVar, n3 n3Var) {
                super(1);
                this.this$0 = gvVar;
                this.this$1 = n3Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                y(iOException);
                return Unit.INSTANCE;
            }

            public final void y(IOException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                gv gvVar = this.this$0;
                n3 n3Var = this.this$1;
                synchronized (gvVar) {
                    n3Var.zn();
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        public n3(gv this$0, zn entry) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f8828gv = this$0;
            this.y = entry;
            this.n3 = entry.fb() ? null : new boolean[this$0.k()];
        }

        public final k a(int i) {
            gv gvVar = this.f8828gv;
            synchronized (gvVar) {
                if (this.zn) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.areEqual(gv().n3(), this)) {
                    return x.n3();
                }
                if (!gv().fb()) {
                    boolean[] zArrV = v();
                    Intrinsics.checkNotNull(zArrV);
                    zArrV[i] = true;
                }
                try {
                    return new vj1.v(gvVar.j().a(gv().zn().get(i)), new y(gvVar, this));
                } catch (FileNotFoundException unused) {
                    return x.n3();
                }
            }
        }

        public final zn gv() {
            return this.y;
        }

        public final void n3() throws IOException {
            gv gvVar = this.f8828gv;
            synchronized (gvVar) {
                try {
                    if (this.zn) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(gv().n3(), this)) {
                        gvVar.c(this, true);
                    }
                    this.zn = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean[] v() {
            return this.n3;
        }

        public final void y() throws IOException {
            gv gvVar = this.f8828gv;
            synchronized (gvVar) {
                try {
                    if (this.zn) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(gv().n3(), this)) {
                        gvVar.c(this, false);
                    }
                    this.zn = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void zn() throws IOException {
            if (Intrinsics.areEqual(this.y.n3(), this)) {
                if (this.f8828gv.c) {
                    this.f8828gv.c(this, false);
                } else {
                    this.y.p(true);
                }
            }
        }
    }

    public static final class v extends wj1.y {
        public v(String str) {
            super(str, false, 2, null);
        }

        @Override // wj1.y
        public long a() {
            gv gvVar = gv.this;
            synchronized (gvVar) {
                if (!gvVar.d0 || gvVar.ej()) {
                    return -1L;
                }
                try {
                    gvVar.m();
                } catch (IOException unused) {
                    gvVar.f8813d = true;
                }
                try {
                    if (gvVar.jz()) {
                        gvVar.lc();
                        gvVar.f3 = 0;
                    }
                } catch (IOException unused2) {
                    gvVar.f8814ej = true;
                    gvVar.z = x.zn(x.n3());
                }
                return -1L;
            }
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public final class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8830a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public long f8831c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public n3 f8832fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final List<File> f8833gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final /* synthetic */ gv f8834i9;
        public final long[] n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8835s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f8836v;
        public final String y;
        public final List<File> zn;

        public static final class y extends wz {

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public final /* synthetic */ gv f8837fb;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ zn f8838s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ en f8839v;
            public boolean y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(en enVar, gv gvVar, zn znVar) {
                super(enVar);
                this.f8839v = enVar;
                this.f8837fb = gvVar;
                this.f8838s = znVar;
            }

            public void close() {
                super.close();
                if (this.y) {
                    return;
                }
                this.y = true;
                gv gvVar = this.f8837fb;
                zn znVar = this.f8838s;
                synchronized (gvVar) {
                    try {
                        znVar.wz(znVar.a() - 1);
                        if (znVar.a() == 0 && znVar.c5()) {
                            gvVar.kp(znVar);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public zn(gv this$0, String key) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f8834i9 = this$0;
            this.y = key;
            this.n3 = new long[this$0.k()];
            this.zn = new ArrayList();
            this.f8833gv = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int iK = this$0.k();
            for (int i = 0; i < iK; i++) {
                sb.append(i);
                this.zn.add(new File(this.f8834i9.yt(), sb.toString()));
                sb.append(".tmp");
                this.f8833gv.add(new File(this.f8834i9.yt(), sb.toString()));
                sb.setLength(length);
            }
        }

        public final int a() {
            return this.f8835s;
        }

        public final boolean c5() {
            return this.f8830a;
        }

        public final void co(hk1.a writer) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            long[] jArr = this.n3;
            int length = jArr.length;
            int i = 0;
            while (i < length) {
                long j = jArr[i];
                i++;
                writer.writeByte(32).o(j);
            }
        }

        public final en f(int i) throws FileNotFoundException {
            en enVarV = this.f8834i9.j().v(this.zn.get(i));
            if (this.f8834i9.c) {
                return enVarV;
            }
            this.f8835s++;
            return new y(enVarV, this.f8834i9, this);
        }

        public final boolean fb() {
            return this.f8836v;
        }

        public final String gv() {
            return this.y;
        }

        public final Void i9(List<String> list) throws IOException {
            throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", list));
        }

        public final C0186gv mt() {
            gv gvVar = this.f8834i9;
            if (tj1.gv.f8214s && !Thread.holdsLock(gvVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + gvVar);
            }
            if (!this.f8836v) {
                return null;
            }
            if (!this.f8834i9.c && (this.f8832fb != null || this.f8830a)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.n3.clone();
            try {
                int iK = this.f8834i9.k();
                for (int i = 0; i < iK; i++) {
                    arrayList.add(f(i));
                }
                return new C0186gv(this.f8834i9, this.y, this.f8831c5, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    tj1.gv.tl((en) it.next());
                }
                try {
                    this.f8834i9.kp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final n3 n3() {
            return this.f8832fb;
        }

        public final void p(boolean z) {
            this.f8830a = z;
        }

        public final long s() {
            return this.f8831c5;
        }

        public final void t(n3 n3Var) {
            this.f8832fb = n3Var;
        }

        public final void tl(List<String> strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f8834i9.k()) {
                i9(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                int i = 0;
                while (i < size) {
                    int i5 = i + 1;
                    this.n3[i] = Long.parseLong(strings.get(i));
                    i = i5;
                }
            } catch (NumberFormatException unused) {
                i9(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final long[] v() {
            return this.n3;
        }

        public final void w(long j) {
            this.f8831c5 = j;
        }

        public final void wz(int i) {
            this.f8835s = i;
        }

        public final void xc(boolean z) {
            this.f8836v = z;
        }

        public final List<File> y() {
            return this.zn;
        }

        public final List<File> zn() {
            return this.f8833gv;
        }
    }

    public gv(bk1.y fileSystem, File directory, int i, int i5, long j4, wj1.v taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.y = fileSystem;
        this.f8822v = directory;
        this.f8816fb = i;
        this.f8820s = i5;
        this.f8815f = j4;
        this.f8819r = new LinkedHashMap<>(0, 0.75f, true);
        this.f8811b = taskRunner.c5();
        this.f8817hw = new v(Intrinsics.stringPlus(tj1.gv.f8211c5, " Cache"));
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f8821t = new File(directory, qn);
        this.w = new File(directory, o);
        this.f8818p = new File(directory, j);
    }

    public static /* synthetic */ n3 ta(gv gvVar, String str, long j4, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j4 = q9;
        }
        return gvVar.mg(str, j4);
    }

    public final synchronized boolean ap(String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        f7();
        n();
        g(key);
        zn znVar = this.f8819r.get(key);
        if (znVar == null) {
            return false;
        }
        boolean zKp = kp(znVar);
        if (zKp && this.f8812co <= this.f8815f) {
            this.f8813d = false;
        }
        return zKp;
    }

    public final synchronized void c(n3 editor, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(editor, "editor");
        zn znVarGv = editor.gv();
        if (!Intrinsics.areEqual(znVarGv.n3(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 0;
        if (z && !znVarGv.fb()) {
            int i5 = this.f8820s;
            int i8 = 0;
            while (i8 < i5) {
                int i10 = i8 + 1;
                boolean[] zArrV = editor.v();
                Intrinsics.checkNotNull(zArrV);
                if (!zArrV[i8]) {
                    editor.y();
                    throw new IllegalStateException(Intrinsics.stringPlus("Newly created entry didn't create value for index ", Integer.valueOf(i8)));
                }
                if (!this.y.n3(znVarGv.zn().get(i8))) {
                    editor.y();
                    return;
                }
                i8 = i10;
            }
        }
        int i11 = this.f8820s;
        while (i < i11) {
            int i12 = i + 1;
            File file = znVarGv.zn().get(i);
            if (!z || znVarGv.c5()) {
                this.y.s(file);
            } else if (this.y.n3(file)) {
                File file2 = znVarGv.y().get(i);
                this.y.fb(file, file2);
                long j4 = znVarGv.v()[i];
                long jGv = this.y.gv(file2);
                znVarGv.v()[i] = jGv;
                this.f8812co = (this.f8812co - j4) + jGv;
            }
            i = i12;
        }
        znVarGv.t(null);
        if (znVarGv.c5()) {
            kp(znVarGv);
            return;
        }
        this.f3++;
        hk1.a aVar = this.z;
        Intrinsics.checkNotNull(aVar);
        if (znVarGv.fb() || z) {
            znVarGv.xc(true);
            aVar.z(f7).writeByte(32);
            aVar.z(znVarGv.gv());
            znVarGv.co(aVar);
            aVar.writeByte(10);
            if (z) {
                long j7 = this.f8823x;
                this.f8823x = 1 + j7;
                znVarGv.w(j7);
            }
        } else {
            oz().remove(znVarGv.gv());
            aVar.z(jz).writeByte(32);
            aVar.z(znVarGv.gv());
            aVar.writeByte(10);
        }
        aVar.flush();
        if (this.f8812co > this.f8815f || jz()) {
            wj1.gv.i9(this.f8811b, this.f8817hw, 0L, 2, null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        n3 n3VarN3;
        try {
            if (this.d0 && !this.fh) {
                Collection<zn> collectionValues = this.f8819r.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                int i = 0;
                Object[] array = collectionValues.toArray(new zn[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                zn[] znVarArr = (zn[]) array;
                int length = znVarArr.length;
                while (i < length) {
                    zn znVar = znVarArr[i];
                    i++;
                    if (znVar.n3() != null && (n3VarN3 = znVar.n3()) != null) {
                        n3VarN3.zn();
                    }
                }
                m();
                hk1.a aVar = this.z;
                Intrinsics.checkNotNull(aVar);
                aVar.close();
                this.z = null;
                this.fh = true;
                return;
            }
            this.fh = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void ct() throws IOException {
        this.y.s(this.w);
        Iterator<zn> it = this.f8819r.values().iterator();
        while (it.hasNext()) {
            zn next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            zn znVar = next;
            int i = 0;
            if (znVar.n3() == null) {
                int i5 = this.f8820s;
                while (i < i5) {
                    this.f8812co += znVar.v()[i];
                    i++;
                }
            } else {
                znVar.t(null);
                int i8 = this.f8820s;
                while (i < i8) {
                    this.y.s(znVar.y().get(i));
                    this.y.s(znVar.zn().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized C0186gv d(String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        f7();
        n();
        g(key);
        zn znVar = this.f8819r.get(key);
        if (znVar == null) {
            return null;
        }
        C0186gv c0186gvMt = znVar.mt();
        if (c0186gvMt == null) {
            return null;
        }
        this.f3++;
        hk1.a aVar = this.z;
        Intrinsics.checkNotNull(aVar);
        aVar.z(u).writeByte(32).z(key).writeByte(10);
        if (jz()) {
            wj1.gv.i9(this.f8811b, this.f8817hw, 0L, 2, null);
        }
        return c0186gvMt;
    }

    public final void eb(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", str));
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = jz;
            if (iIndexOf$default == str2.length() && StringsKt.startsWith$default(str, str2, false, 2, (Object) null)) {
                this.f8819r.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        zn znVar = this.f8819r.get(strSubstring);
        if (znVar == null) {
            znVar = new zn(this, strSubstring);
            this.f8819r.put(strSubstring, znVar);
        }
        if (iIndexOf$default2 != -1) {
            String str3 = f7;
            if (iIndexOf$default == str3.length() && StringsKt.startsWith$default(str, str3, false, 2, (Object) null)) {
                String strSubstring2 = str.substring(iIndexOf$default2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                znVar.xc(true);
                znVar.t(null);
                znVar.tl(listSplit$default);
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str4 = en;
            if (iIndexOf$default == str4.length() && StringsKt.startsWith$default(str, str4, false, 2, (Object) null)) {
                znVar.t(new n3(this, znVar));
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str5 = u;
            if (iIndexOf$default == str5.length() && StringsKt.startsWith$default(str, str5, false, 2, (Object) null)) {
                return;
            }
        }
        throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", str));
    }

    public final boolean ej() {
        return this.fh;
    }

    public final synchronized void f7() throws IOException {
        try {
            if (tj1.gv.f8214s && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
            }
            if (this.d0) {
                return;
            }
            if (this.y.n3(this.f8818p)) {
                if (this.y.n3(this.f8821t)) {
                    this.y.s(this.f8818p);
                } else {
                    this.y.fb(this.f8818p, this.f8821t);
                }
            }
            this.c = tj1.gv.d(this.y, this.f8818p);
            if (this.y.n3(this.f8821t)) {
                try {
                    rs();
                    ct();
                    this.d0 = true;
                    return;
                } catch (IOException e4) {
                    i9.y.fb().f("DiskLruCache " + this.f8822v + " is corrupt: " + ((Object) e4.getMessage()) + ", removing", 5, e4);
                    try {
                        rz();
                        this.fh = false;
                        lc();
                        this.d0 = true;
                    } catch (Throwable th) {
                        this.fh = false;
                        throw th;
                    }
                }
            }
            lc();
            this.d0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.d0) {
            n();
            m();
            hk1.a aVar = this.z;
            Intrinsics.checkNotNull(aVar);
            aVar.flush();
        }
    }

    public final void g(String str) {
        if (f8809k.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final bk1.y j() {
        return this.y;
    }

    public final boolean jz() {
        int i = this.f3;
        return i >= 2000 && i >= this.f8819r.size();
    }

    public final int k() {
        return this.f8820s;
    }

    public final boolean kp(zn entry) throws IOException {
        hk1.a aVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.c) {
            if (entry.a() > 0 && (aVar = this.z) != null) {
                aVar.z(en);
                aVar.writeByte(32);
                aVar.z(entry.gv());
                aVar.writeByte(10);
                aVar.flush();
            }
            if (entry.a() > 0 || entry.n3() != null) {
                entry.p(true);
                return true;
            }
        }
        n3 n3VarN3 = entry.n3();
        if (n3VarN3 != null) {
            n3VarN3.zn();
        }
        int i = this.f8820s;
        for (int i5 = 0; i5 < i; i5++) {
            this.y.s(entry.y().get(i5));
            this.f8812co -= entry.v()[i5];
            entry.v()[i5] = 0;
        }
        this.f3++;
        hk1.a aVar2 = this.z;
        if (aVar2 != null) {
            aVar2.z(jz);
            aVar2.writeByte(32);
            aVar2.z(entry.gv());
            aVar2.writeByte(10);
        }
        this.f8819r.remove(entry.gv());
        if (jz()) {
            wj1.gv.i9(this.f8811b, this.f8817hw, 0L, 2, null);
        }
        return true;
    }

    public final synchronized void lc() throws IOException {
        try {
            hk1.a aVar = this.z;
            if (aVar != null) {
                aVar.close();
            }
            hk1.a aVarZn = x.zn(this.y.a(this.w));
            try {
                aVarZn.z(oz).writeByte(10);
                aVarZn.z(f8810ut).writeByte(10);
                aVarZn.o(this.f8816fb).writeByte(10);
                aVarZn.o(k()).writeByte(10);
                aVarZn.writeByte(10);
                for (zn znVar : oz().values()) {
                    if (znVar.n3() != null) {
                        aVarZn.z(en).writeByte(32);
                        aVarZn.z(znVar.gv());
                        aVarZn.writeByte(10);
                    } else {
                        aVarZn.z(f7).writeByte(32);
                        aVarZn.z(znVar.gv());
                        znVar.co(aVarZn);
                        aVarZn.writeByte(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(aVarZn, null);
                if (this.y.n3(this.f8821t)) {
                    this.y.fb(this.f8821t, this.f8818p);
                }
                this.y.fb(this.w, this.f8821t);
                this.y.s(this.f8818p);
                this.z = u();
                this.n = false;
                this.f8814ej = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m() throws IOException {
        while (this.f8812co > this.f8815f) {
            if (!rb()) {
                return;
            }
        }
        this.f8813d = false;
    }

    public final synchronized n3 mg(String key, long j4) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        f7();
        n();
        g(key);
        zn znVar = this.f8819r.get(key);
        if (j4 != q9 && (znVar == null || znVar.s() != j4)) {
            return null;
        }
        if ((znVar == null ? null : znVar.n3()) != null) {
            return null;
        }
        if (znVar != null && znVar.a() != 0) {
            return null;
        }
        if (!this.f8813d && !this.f8814ej) {
            hk1.a aVar = this.z;
            Intrinsics.checkNotNull(aVar);
            aVar.z(en).writeByte(32).z(key).writeByte(10);
            aVar.flush();
            if (this.n) {
                return null;
            }
            if (znVar == null) {
                znVar = new zn(this, key);
                this.f8819r.put(key, znVar);
            }
            n3 n3Var = new n3(this, znVar);
            znVar.t(n3Var);
            return n3Var;
        }
        wj1.gv.i9(this.f8811b, this.f8817hw, 0L, 2, null);
        return null;
    }

    public final synchronized void n() {
        if (this.fh) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final LinkedHashMap<String, zn> oz() {
        return this.f8819r;
    }

    public final boolean rb() throws IOException {
        for (zn toEvict : this.f8819r.values()) {
            if (!toEvict.c5()) {
                Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                kp(toEvict);
                return true;
            }
        }
        return false;
    }

    public final void rs() throws IOException {
        fb fbVarGv = x.gv(this.y.v(this.f8821t));
        try {
            String strZ6 = fbVarGv.z6();
            String strZ62 = fbVarGv.z6();
            String strZ63 = fbVarGv.z6();
            String strZ64 = fbVarGv.z6();
            String strZ65 = fbVarGv.z6();
            if (!Intrinsics.areEqual(oz, strZ6) || !Intrinsics.areEqual(f8810ut, strZ62) || !Intrinsics.areEqual(String.valueOf(this.f8816fb), strZ63) || !Intrinsics.areEqual(String.valueOf(k()), strZ64) || strZ65.length() > 0) {
                throw new IOException("unexpected journal header: [" + strZ6 + ", " + strZ62 + ", " + strZ64 + ", " + strZ65 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    eb(fbVarGv.z6());
                    i++;
                } catch (EOFException unused) {
                    this.f3 = i - oz().size();
                    if (fbVarGv.dm()) {
                        this.z = u();
                    } else {
                        lc();
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fbVarGv, null);
                    return;
                }
            }
        } finally {
        }
    }

    public final void rz() throws IOException {
        close();
        this.y.y(this.f8822v);
    }

    public final hk1.a u() throws FileNotFoundException {
        return x.zn(new vj1.v(this.y.zn(this.f8821t), new a()));
    }

    public final File yt() {
        return this.f8822v;
    }
}
