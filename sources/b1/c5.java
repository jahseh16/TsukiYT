package b1;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.internal.Code;
import ft.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1250a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f1251c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f1253fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f1254gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f1255i9;
    public boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1257t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1259v;
    public boolean zn;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final int[] f1249xc = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final y w = new y(new y.InterfaceC0035y() { // from class: b1.fb
        @Override // b1.c5.y.InterfaceC0035y
        public final Constructor y() {
            return c5.v();
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y f1248p = new y(new y.InterfaceC0035y() { // from class: b1.s
        @Override // b1.c5.y.InterfaceC0035y
        public final Constructor y() {
            return c5.a();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1252f = 1;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f1260wz = 112800;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public k4.r<g> f1258tl = k4.r.yt();

    public static final class y {
        public final AtomicBoolean n3 = new AtomicBoolean(false);
        public final InterfaceC0035y y;

        @Nullable
        public Constructor<? extends t> zn;

        /* JADX INFO: renamed from: b1.c5$y$y, reason: collision with other inner class name */
        public interface InterfaceC0035y {
            @Nullable
            Constructor<? extends t> y() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public y(InterfaceC0035y interfaceC0035y) {
            this.y = interfaceC0035y;
        }

        @Nullable
        public final Constructor<? extends t> n3() {
            synchronized (this.n3) {
                if (this.n3.get()) {
                    return this.zn;
                }
                try {
                    return this.y.y();
                } catch (ClassNotFoundException unused) {
                    this.n3.set(true);
                    return this.zn;
                } catch (Exception e4) {
                    throw new RuntimeException("Error instantiating extension", e4);
                }
            }
        }

        @Nullable
        public t y(Object... objArr) {
            Constructor<? extends t> constructorN3 = n3();
            if (constructorN3 == null) {
                return null;
            }
            try {
                return constructorN3.newInstance(objArr);
            } catch (Exception e4) {
                throw new IllegalStateException("Unexpected error creating extractor", e4);
            }
        }
    }

    public static Constructor<? extends t> a() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(t.class).getConstructor(null);
    }

    @Nullable
    public static Constructor<? extends t> v() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(t.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // b1.mt
    public synchronized t[] createExtractors() {
        return y(Uri.EMPTY, new HashMap());
    }

    public final void gv(int i, List<t> list) {
        switch (i) {
            case 0:
                list.add(new lf.n3());
                break;
            case 1:
                list.add(new lf.v());
                break;
            case 2:
                list.add(new lf.s((this.zn ? 2 : 0) | this.f1254gv | (this.n3 ? 1 : 0)));
                break;
            case 3:
                list.add(new zf.n3((this.zn ? 2 : 0) | this.f1259v | (this.n3 ? 1 : 0)));
                break;
            case 4:
                t tVarY = w.y(Integer.valueOf(this.f1250a));
                if (tVarY == null) {
                    list.add(new y6.gv(this.f1250a));
                } else {
                    list.add(tVarY);
                }
                break;
            case 5:
                list.add(new u4.zn());
                break;
            case 6:
                list.add(new x9.v(this.f1253fb));
                break;
            case 7:
                list.add(new ao.a((this.zn ? 2 : 0) | this.f1255i9 | (this.n3 ? 1 : 0)));
                break;
            case 8:
                list.add(new tn.fb(this.f1251c5));
                list.add(new tn.f(this.f1256s));
                break;
            case 9:
                list.add(new ig.gv());
                break;
            case 10:
                list.add(new lf.d0());
                break;
            case 11:
                list.add(new lf.ej(this.f1252f, new hw(0L), new lf.i9(this.f1257t, this.f1258tl), this.f1260wz));
                break;
            case Code.UNIMPLEMENTED /* 12 */:
                list.add(new mo.n3());
                break;
            case 14:
                list.add(new oq.y());
                break;
            case 15:
                t tVarY2 = f1248p.y(new Object[0]);
                if (tVarY2 != null) {
                    list.add(tVarY2);
                }
                break;
            case 16:
                list.add(new ua.n3());
                break;
        }
    }

    @Override // b1.mt
    public synchronized t[] y(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f1249xc;
            arrayList = new ArrayList(iArr.length);
            int iN3 = v0.tl.n3(map);
            if (iN3 != -1) {
                gv(iN3, arrayList);
            }
            int iZn = v0.tl.zn(uri);
            if (iZn != -1 && iZn != iN3) {
                gv(iZn, arrayList);
            }
            for (int i : iArr) {
                if (i != iN3 && i != iZn) {
                    gv(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (t[]) arrayList.toArray(new t[arrayList.size()]);
    }
}
