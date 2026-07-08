package t0;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import t0.y;

/* JADX INFO: loaded from: classes.dex */
public final class z implements t0.y {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashSet<File> f8147t = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f8148a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f8149c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.C0174y f8150f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f8151fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final a f8152gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f8153i9;
    public final gv n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f8154s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap<String, ArrayList<y.n3>> f8155v;
    public final File y;
    public final t zn;

    public class y extends Thread {
        public final /* synthetic */ ConditionVariable y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, ConditionVariable conditionVariable) {
            super(str);
            this.y = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (z.this) {
                this.y.open();
                z.this.z();
                z.this.n3.v();
            }
        }
    }

    public z(File file, gv gvVar, kx.n3 n3Var) {
        this(file, gvVar, n3Var, null, false, false);
    }

    public static long d0(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static synchronized boolean i4(File file) {
        return f8147t.add(file.getAbsoluteFile());
    }

    public static long w(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static long x4(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return d0(name);
                } catch (NumberFormatException unused) {
                    v0.r.zn("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static void xc(File file) throws y.C0174y {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        v0.r.zn("SimpleCache", str);
        throw new y.C0174y(str);
    }

    @Override // t0.y
    public synchronized void a(c5 c5Var) {
        v0.y.fb(!this.f8153i9);
        rz(c5Var);
    }

    public final void c(r rVar, c5 c5Var) {
        ArrayList<y.n3> arrayList = this.f8155v.get(rVar.y);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).zn(this, rVar, c5Var);
            }
        }
        this.n3.zn(this, rVar, c5Var);
    }

    @Override // t0.y
    public synchronized c5 c5(String str, long j, long j4) throws y.C0174y, InterruptedException {
        c5 c5VarGv;
        v0.y.fb(!this.f8153i9);
        wz();
        while (true) {
            c5VarGv = gv(str, j, j4);
            if (c5VarGv == null) {
                wait();
            }
        }
        return c5VarGv;
    }

    public final r co(String str, long j, long j4) {
        r rVarV;
        f fVarFb = this.zn.fb(str);
        if (fVarFb == null) {
            return r.fb(str, j, j4);
        }
        while (true) {
            rVarV = fVarFb.v(j, j4);
            if (!rVarV.f8118s || rVarV.f8116f.length() == rVarV.f8117fb) {
                break;
            }
            mg();
        }
        return rVarV;
    }

    public final void f3(r rVar) {
        ArrayList<y.n3> arrayList = this.f8155v.get(rVar.y);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).y(this, rVar);
            }
        }
        this.n3.y(this, rVar);
    }

    @Override // t0.y
    public synchronized void fb(c5 c5Var) {
        v0.y.fb(!this.f8153i9);
        f fVar = (f) v0.y.v(this.zn.fb(c5Var.y));
        fVar.tl(c5Var.f8120v);
        this.zn.p(fVar.n3);
        notifyAll();
    }

    public synchronized void fh(String str) {
        v0.y.fb(!this.f8153i9);
        Iterator<c5> it = p(str).iterator();
        while (it.hasNext()) {
            rz(it.next());
        }
    }

    @Override // t0.y
    @Nullable
    public synchronized c5 gv(String str, long j, long j4) throws y.C0174y {
        v0.y.fb(!this.f8153i9);
        wz();
        r rVarCo = co(str, j, j4);
        if (rVarCo.f8118s) {
            return ta(str, rVarCo);
        }
        if (this.zn.wz(str).i9(j, rVarCo.f8117fb)) {
            return rVarCo;
        }
        return null;
    }

    @Override // t0.y
    public synchronized void i9(File file, long j) throws y.C0174y {
        v0.y.fb(!this.f8153i9);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            r rVar = (r) v0.y.v(r.a(file, j, this.zn));
            f fVar = (f) v0.y.v(this.zn.fb(rVar.y));
            v0.y.fb(fVar.s(rVar.f8120v, rVar.f8117fb));
            long jY = tl.y(fVar.gv());
            if (jY != -1) {
                v0.y.fb(rVar.f8120v + rVar.f8117fb <= jY);
            }
            if (this.f8152gv == null) {
                tl(rVar);
                this.zn.z();
                notifyAll();
                return;
            }
            try {
                this.f8152gv.s(file.getName(), rVar.f8117fb, rVar.f8119t);
                tl(rVar);
                try {
                    this.zn.z();
                    notifyAll();
                    return;
                } catch (IOException e4) {
                    throw new y.C0174y(e4);
                }
            } catch (IOException e5) {
                throw new y.C0174y(e5);
            }
        }
    }

    public final void mg() {
        ArrayList arrayList = new ArrayList();
        Iterator<f> it = this.zn.s().iterator();
        while (it.hasNext()) {
            for (r rVar : it.next().a()) {
                if (rVar.f8116f.length() != rVar.f8117fb) {
                    arrayList.add(rVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            rz((c5) arrayList.get(i));
        }
    }

    public synchronized Set<String> mt() {
        v0.y.fb(!this.f8153i9);
        return new HashSet(this.zn.t());
    }

    public final void n(c5 c5Var) {
        ArrayList<y.n3> arrayList = this.f8155v.get(c5Var.y);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).gv(this, c5Var);
            }
        }
        this.n3.gv(this, c5Var);
    }

    @Override // t0.y
    public synchronized wz n3(String str) {
        v0.y.fb(!this.f8153i9);
        return this.zn.i9(str);
    }

    public synchronized NavigableSet<c5> p(String str) {
        f fVarFb;
        try {
            v0.y.fb(!this.f8153i9);
            fVarFb = this.zn.fb(str);
        } catch (Throwable th) {
            throw th;
        }
        return (fVarFb == null || fVarFb.fb()) ? new TreeSet() : new TreeSet((Collection) fVarFb.a());
    }

    public final void r(File file, boolean z, @Nullable File[] fileArr, @Nullable Map<String, v> map) {
        long j;
        long j4;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                r(file2, false, file2.listFiles(), map);
            } else if (!z || (!t.w(name) && !name.endsWith(".uid"))) {
                v vVarRemove = map != null ? map.remove(name) : null;
                if (vVarRemove != null) {
                    j4 = vVarRemove.y;
                    j = vVarRemove.n3;
                } else {
                    j = -9223372036854775807L;
                    j4 = -1;
                }
                r rVarV = r.v(file2, j4, j, this.zn);
                if (rVarV != null) {
                    tl(rVarV);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void rz(c5 c5Var) {
        f fVarFb = this.zn.fb(c5Var.y);
        if (fVarFb == null || !fVarFb.f(c5Var)) {
            return;
        }
        this.f8149c5 -= c5Var.f8117fb;
        if (this.f8152gv != null) {
            String name = c5Var.f8116f.getName();
            try {
                this.f8152gv.a(name);
            } catch (IOException unused) {
                v0.r.c5("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.zn.p(fVarFb.n3);
        n(c5Var);
    }

    @Override // t0.y
    public synchronized void s(String str, xc xcVar) throws y.C0174y {
        v0.y.fb(!this.f8153i9);
        wz();
        this.zn.v(str, xcVar);
        try {
            this.zn.z();
        } catch (IOException e4) {
            throw new y.C0174y(e4);
        }
    }

    public final r ta(String str, r rVar) {
        boolean z;
        if (!this.f8151fb) {
            return rVar;
        }
        String name = ((File) v0.y.v(rVar.f8116f)).getName();
        long j = rVar.f8117fb;
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVar = this.f8152gv;
        if (aVar != null) {
            try {
                aVar.s(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                v0.r.c5("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        r rVarT = this.zn.fb(str).t(rVar, jCurrentTimeMillis, z);
        c(rVar, rVarT);
        return rVarT;
    }

    public final void tl(r rVar) {
        this.zn.wz(rVar.y).y(rVar);
        this.f8149c5 += rVar.f8117fb;
        f3(rVar);
    }

    @Override // t0.y
    public synchronized long v(String str, long j, long j4) {
        f fVarFb;
        v0.y.fb(!this.f8153i9);
        if (j4 == -1) {
            j4 = Long.MAX_VALUE;
        }
        fVarFb = this.zn.fb(str);
        return fVarFb != null ? fVarFb.zn(j, j4) : -j4;
    }

    public synchronized void wz() throws y.C0174y {
        y.C0174y c0174y = this.f8150f;
        if (c0174y != null) {
            throw c0174y;
        }
    }

    @Override // t0.y
    public synchronized File y(String str, long j, long j4) throws y.C0174y {
        f fVarFb;
        File file;
        try {
            v0.y.fb(!this.f8153i9);
            wz();
            fVarFb = this.zn.fb(str);
            v0.y.v(fVarFb);
            v0.y.fb(fVarFb.s(j, j4));
            if (!this.y.exists()) {
                xc(this.y);
                mg();
            }
            this.n3.a(this, str, j, j4);
            file = new File(this.y, Integer.toString(this.f8148a.nextInt(10)));
            if (!file.exists()) {
                xc(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r.c5(file, fVarFb.y, j, System.currentTimeMillis());
    }

    public final void z() {
        if (!this.y.exists()) {
            try {
                xc(this.y);
            } catch (y.C0174y e4) {
                this.f8150f = e4;
                return;
            }
        }
        File[] fileArrListFiles = this.y.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.y;
            v0.r.zn("SimpleCache", str);
            this.f8150f = new y.C0174y(str);
            return;
        }
        long jX4 = x4(fileArrListFiles);
        this.f8154s = jX4;
        if (jX4 == -1) {
            try {
                this.f8154s = w(this.y);
            } catch (IOException e5) {
                String str2 = "Failed to create cache UID: " + this.y;
                v0.r.gv("SimpleCache", str2, e5);
                this.f8150f = new y.C0174y(str2, e5);
                return;
            }
        }
        try {
            this.zn.xc(this.f8154s);
            a aVar = this.f8152gv;
            if (aVar != null) {
                aVar.v(this.f8154s);
                Map<String, v> mapN3 = this.f8152gv.n3();
                r(this.y, true, fileArrListFiles, mapN3);
                this.f8152gv.fb(mapN3.keySet());
            } else {
                r(this.y, true, fileArrListFiles, null);
            }
            this.zn.co();
            try {
                this.zn.z();
            } catch (IOException e6) {
                v0.r.gv("SimpleCache", "Storing index file failed", e6);
            }
        } catch (IOException e8) {
            String str3 = "Failed to initialize cache indices: " + this.y;
            v0.r.gv("SimpleCache", str3, e8);
            this.f8150f = new y.C0174y(str3, e8);
        }
    }

    @Override // t0.y
    public synchronized long zn(String str, long j, long j4) {
        long j7;
        long j8 = j4 == -1 ? Long.MAX_VALUE : j4 + j;
        long j9 = j8 >= 0 ? j8 : Long.MAX_VALUE;
        j7 = 0;
        while (j < j9) {
            long jV = v(str, j, j9 - j);
            if (jV > 0) {
                j7 += jV;
            } else {
                jV = -jV;
            }
            j += jV;
        }
        return j7;
    }

    public z(File file, gv gvVar, @Nullable kx.n3 n3Var, @Nullable byte[] bArr, boolean z, boolean z5) {
        this(file, gvVar, new t(n3Var, file, bArr, z, z5), (n3Var == null || z5) ? null : new a(n3Var));
    }

    public z(File file, gv gvVar, t tVar, @Nullable a aVar) {
        if (i4(file)) {
            this.y = file;
            this.n3 = gvVar;
            this.zn = tVar;
            this.f8152gv = aVar;
            this.f8155v = new HashMap<>();
            this.f8148a = new Random();
            this.f8151fb = gvVar.n3();
            this.f8154s = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new y("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
