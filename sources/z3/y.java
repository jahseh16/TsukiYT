package z3;

import a4.en;
import a4.fh;
import a4.j;
import a4.j5;
import a4.oz;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import v3.n;
import v3.qn;
import v3.r;
import v3.x4;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicReference f9437v = new AtomicReference(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final n3 f9438gv;
    public final fh n3;
    public final a y;
    public final Set zn = new HashSet();

    public y(Context context) {
        try {
            a aVar = new a(context);
            this.y = aVar;
            this.f9438gv = new n3(aVar);
            this.n3 = new fh(context);
        } catch (PackageManager.NameNotFoundException e4) {
            throw new qn("Failed to initialize FileStorage", e4);
        }
    }

    public static boolean a(Context context) {
        return f(context, true);
    }

    public static boolean f(final Context context, boolean z) {
        if (t()) {
            return false;
        }
        AtomicReference atomicReference = f9437v;
        boolean zY = ap.w.y(atomicReference, null, new y(context));
        y yVar = (y) atomicReference.get();
        if (zY) {
            j5.INSTANCE.y(new v3.co(context, v.y(), new r(context, yVar.y, new v3.p()), yVar.y, new co(), null));
            j.n3(new w(yVar));
            v.y().execute(new Runnable() { // from class: z3.xc
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    AtomicReference atomicReference2 = y.f9437v;
                    try {
                        en.s(context2).gv(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        }
        try {
            yVar.i9(context, z);
            return true;
        } catch (Exception e4) {
            Log.e("SplitCompat", "Error installing additional splits", e4);
            return false;
        }
    }

    public static boolean fb() {
        return f9437v.get() != null;
    }

    public static boolean n3(@NonNull Context context) {
        if (t()) {
            return false;
        }
        y yVar = (y) f9437v.get();
        if (yVar != null) {
            return yVar.f9438gv.n3(context, yVar.s());
        }
        if (context.getApplicationContext() != null) {
            y(context.getApplicationContext());
        }
        return y(context);
    }

    public static boolean t() {
        return false;
    }

    public static boolean y(@NonNull Context context) {
        return f(context, false);
    }

    public final void c5(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a.t(this.y.fb((String) it.next()));
        }
        this.n3.n3();
    }

    public final synchronized void i9(Context context, boolean z) throws IOException {
        ZipFile zipFile;
        try {
            if (z) {
                this.y.f();
            } else {
                v.y().execute(new p(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<z> setI9 = this.y.i9();
                Set setY = this.n3.y();
                HashSet hashSet = new HashSet();
                Iterator it = setI9.iterator();
                while (it.hasNext()) {
                    String strN3 = ((z) it.next()).n3();
                    if (arrayList.contains(strN3) || setY.contains(oz.n3(strN3))) {
                        hashSet.add(strN3);
                        it.remove();
                    }
                }
                if (z) {
                    c5(hashSet);
                } else if (!hashSet.isEmpty()) {
                    v.y().execute(new mt(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = setI9.iterator();
                while (it2.hasNext()) {
                    String strN32 = ((z) it2.next()).n3();
                    if (!oz.a(strN32)) {
                        hashSet2.add(strN32);
                    }
                }
                for (String str : arrayList) {
                    if (!oz.a(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<z> hashSet3 = new HashSet(setI9.size());
                for (z zVar : setI9) {
                    if (oz.v(zVar.n3()) || hashSet2.contains(oz.n3(zVar.n3()))) {
                        hashSet3.add(zVar);
                    }
                }
                wz wzVar = new wz(this.y);
                x4 x4VarY = n.y();
                ClassLoader classLoader = context.getClassLoader();
                if (z) {
                    x4VarY.n3(classLoader, wzVar.zn());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set setN3 = wzVar.n3((z) it3.next());
                        if (setN3 == null) {
                            it3.remove();
                        } else {
                            x4VarY.n3(classLoader, setN3);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (z zVar2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(zVar2.y());
                    } catch (IOException e4) {
                        e = e4;
                        zipFile = null;
                    }
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry == null || x4VarY.y(classLoader, this.y.y(zVar2.n3()), zVar2.y(), z)) {
                            hashSet4.add(zVar2.y());
                        } else {
                            Log.w("SplitCompat", "split was not installed ".concat(zVar2.y().toString()));
                        }
                    } catch (IOException e5) {
                        e = e5;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                }
                this.f9438gv.y(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (z zVar3 : hashSet3) {
                    if (hashSet4.contains(zVar3.y())) {
                        String strN33 = zVar3.n3();
                        StringBuilder sb = new StringBuilder(strN33.length() + 30);
                        sb.append("Split '");
                        sb.append(strN33);
                        sb.append("' installation emulated");
                        Log.d("SplitCompat", sb.toString());
                        hashSet5.add(zVar3.n3());
                    } else {
                        String strN34 = zVar3.n3();
                        StringBuilder sb2 = new StringBuilder(strN34.length() + 35);
                        sb2.append("Split '");
                        sb2.append(strN34);
                        sb2.append("' installation not emulated.");
                        Log.d("SplitCompat", sb2.toString());
                    }
                }
                synchronized (this.zn) {
                    this.zn.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e6) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Set s() {
        HashSet hashSet;
        synchronized (this.zn) {
            hashSet = new HashSet(this.zn);
        }
        return hashSet;
    }
}
