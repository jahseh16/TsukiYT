package uo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.annotation.Nullable;
import ic.i9;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class w {
    public static final Map<String, b<s>> y = new HashMap();
    public static final Set<k5> n3 = new HashSet();
    public static final byte[] zn = {80, 75, 3, 4};

    public static void a8(boolean z) {
        ArrayList arrayList = new ArrayList(n3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((k5) arrayList.get(i)).y(z);
        }
    }

    public static a8<s> c(Context context, ZipInputStream zipInputStream, @Nullable String str) {
        FileOutputStream fileOutputStream;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            s sVarN3 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    sVarN3 = mt(k3.zn.mg(hk1.x.gv(hk1.x.f(zipInputStream))), null, false).n3();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else if (name.contains(".ttf") || name.contains(".otf")) {
                    String[] strArrSplit2 = name.split("/");
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th) {
                        ic.a.gv("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th);
                    }
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            ic.a.zn("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (sVarN3 == null) {
                return new a8<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                ta taVarC5 = c5(sVarN3, (String) entry.getKey());
                if (taVarC5 != null) {
                    taVarC5.a(i9.t((Bitmap) entry.getValue(), taVarC5.v(), taVarC5.zn()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (h.zn znVar : sVarN3.fb().values()) {
                    if (znVar.y().equals(entry2.getKey())) {
                        znVar.v((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                    ic.a.zn("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, ta>> it = sVarN3.i9().entrySet().iterator();
                while (it.hasNext()) {
                    ta value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strN3 = value.n3();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strN3.startsWith("data:") && strN3.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strN3.substring(strN3.indexOf(44) + 1), 0);
                            value.a(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException e4) {
                            ic.a.gv("data URL did not have correct base64 format.", e4);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, ta> entry3 : sVarN3.i9().entrySet()) {
                if (entry3.getValue().y() == null) {
                    return new a8<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().n3()));
                }
            }
            if (str != null) {
                h.fb.n3().zn(str, sVarN3);
            }
            return new a8<>(sVarN3);
        } catch (IOException e5) {
            return new a8<>((Throwable) e5);
        }
    }

    @Nullable
    public static ta c5(s sVar, String str) {
        for (ta taVar : sVar.i9().values()) {
            if (taVar.n3().equals(str)) {
                return taVar;
            }
        }
        return null;
    }

    public static b<s> co(Context context, int i) {
        return z(context, i, x(context, i));
    }

    public static boolean d0(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static /* synthetic */ a8 ej(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return x4(context, i, str);
    }

    public static b<s> f(Context context, String str, @Nullable String str2) {
        return s(str2, new f(context.getApplicationContext(), str, str2));
    }

    public static b<s> f3(Context context, String str, @Nullable String str2) {
        return s(str2, new c5(context, str, str2));
    }

    public static Boolean fh(hk1.fb fbVar) {
        try {
            hk1.fb fbVarPeek = fbVar.peek();
            for (byte b4 : zn) {
                if (fbVarPeek.readByte() != b4) {
                    return Boolean.FALSE;
                }
            }
            fbVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e4) {
            ic.a.n3("Failed to check zip file header", e4);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static b<s> i4(Context context, String str) {
        return f3(context, str, "url_" + str);
    }

    public static b<s> i9(Context context, String str) {
        return f(context, str, "asset_" + str);
    }

    public static /* synthetic */ a8 mg(s sVar) throws Exception {
        return new a8(sVar);
    }

    public static a8<s> mt(k3.zn znVar, @Nullable String str, boolean z) {
        try {
            try {
                s sVarY = hk.i4.y(znVar);
                if (str != null) {
                    h.fb.n3().zn(str, sVarY);
                }
                a8<s> a8Var = new a8<>(sVarY);
                if (z) {
                    i9.zn(znVar);
                }
                return a8Var;
            } catch (Exception e4) {
                a8<s> a8Var2 = new a8<>(e4);
                if (z) {
                    i9.zn(znVar);
                }
                return a8Var2;
            }
        } catch (Throwable th) {
            if (z) {
                i9.zn(znVar);
            }
            throw th;
        }
    }

    public static a8<s> n(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return c(context, zipInputStream, str);
        } finally {
            i9.zn(zipInputStream);
        }
    }

    public static a8<s> p(k3.zn znVar, @Nullable String str) {
        return mt(znVar, str, true);
    }

    public static a8<s> r(Context context, int i) {
        return x4(context, i, x(context, i));
    }

    public static /* synthetic */ void rz(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, b<s>> map = y;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            a8(true);
        }
    }

    public static b<s> s(@Nullable String str, Callable<a8<s>> callable) {
        s sVarY = str == null ? null : h.fb.n3().y(str);
        if (sVarY != null) {
            return new b<>(new t(sVarY));
        }
        if (str != null) {
            Map<String, b<s>> map = y;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        b<s> bVar = new b<>(callable);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            bVar.gv(new tl(str, atomicBoolean));
            bVar.zn(new wz(str, atomicBoolean));
            if (!atomicBoolean.get()) {
                Map<String, b<s>> map2 = y;
                map2.put(str, bVar);
                if (map2.size() == 1) {
                    a8(false);
                }
            }
        }
        return bVar;
    }

    public static a8<s> t(Context context, String str) {
        return tl(context, str, "asset_" + str);
    }

    public static /* synthetic */ void ta(String str, AtomicBoolean atomicBoolean, s sVar) {
        Map<String, b<s>> map = y;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            a8(true);
        }
    }

    public static a8<s> tl(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return xc(context.getAssets().open(str), str2);
            }
            return n(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e4) {
            return new a8<>((Throwable) e4);
        }
    }

    public static /* synthetic */ a8 ud(Context context, String str, String str2) throws Exception {
        a8 a8VarZn = zn.v(context).zn(context, str, str2);
        if (str2 != null && a8VarZn.n3() != null) {
            h.fb.n3().zn(str2, (s) a8VarZn.n3());
        }
        return a8VarZn;
    }

    public static a8<s> w(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            return p(k3.zn.mg(hk1.x.gv(hk1.x.f(inputStream))), str);
        } finally {
            if (z) {
                i9.zn(inputStream);
            }
        }
    }

    public static b<s> wz(InputStream inputStream, @Nullable String str) {
        return s(str, new i9(inputStream, str));
    }

    public static String x(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(d0(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static a8<s> x4(Context context, int i, @Nullable String str) {
        try {
            hk1.fb fbVarGv = hk1.x.gv(hk1.x.f(context.getResources().openRawResource(i)));
            return fh(fbVarGv).booleanValue() ? n(context, new ZipInputStream(fbVarGv.o0()), str) : xc(fbVarGv.o0(), str);
        } catch (Resources.NotFoundException e4) {
            return new a8<>((Throwable) e4);
        }
    }

    public static a8<s> xc(InputStream inputStream, @Nullable String str) {
        return w(inputStream, str, true);
    }

    public static b<s> z(Context context, int i, @Nullable String str) {
        return s(str, new xc(new WeakReference(context), context.getApplicationContext(), i, str));
    }
}
