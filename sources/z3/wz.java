package z3;

import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public static final Pattern n3 = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final a y;

    public wz(a aVar) throws IOException {
        this.y = aVar;
    }

    public static void v(z zVar, f fVar) throws IOException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(zVar.y());
            try {
                String strN3 = zVar.n3();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = n3.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strN3, strGroup2, strGroup));
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new tl(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                        for (tl tlVar : (Set) map.get(str)) {
                            if (map2.containsKey(tlVar.y)) {
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", tlVar.y, str));
                            } else {
                                map2.put(tlVar.y, tlVar);
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", tlVar.y, str));
                            }
                        }
                    } else {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                    }
                }
                fVar.y(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e4) {
                e = e4;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (IOException e5) {
            e = e5;
            zipFile = null;
        }
    }

    public static /* bridge */ /* synthetic */ Set y(wz wzVar, Set set, z zVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        wzVar.a(zVar, set, new i9(wzVar, hashSet, zVar, zipFile));
        return hashSet;
    }

    public final void a(z zVar, Set set, t tVar) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tl tlVar = (tl) it.next();
            File fileZn = this.y.zn(zVar.n3(), tlVar.y);
            boolean z = false;
            if (fileZn.exists() && fileZn.length() == tlVar.n3.getSize() && a.w(fileZn)) {
                z = true;
            }
            tVar.y(tlVar, fileZn, z);
        }
    }

    @Nullable
    public final Set n3(z zVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        v(zVar, new s(this, zVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    public final Set zn() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<z> setI9 = this.y.i9();
        for (String str : this.y.s()) {
            Iterator it = setI9.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.y.wz(str);
                    break;
                }
                if (((z) it.next()).n3().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (z zVar : setI9) {
            HashSet hashSet2 = new HashSet();
            v(zVar, new c5(this, hashSet2, zVar));
            for (File file : this.y.c5(zVar.n3())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), zVar.n3(), zVar.y().getAbsolutePath()));
                    this.y.xc(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
