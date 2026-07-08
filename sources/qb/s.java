package qb;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public static int y;

    public static final class n3 {
        public static void n3(ClassLoader classLoader, List<File> list, File file, Boolean bool) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            int size = list.size();
            file.setWritable(bool.booleanValue());
            for (int i = 0; i < size; i++) {
                list.get(i).setReadOnly();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = v.n3(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] objArrZn = zn(obj, new ArrayList(list), file, arrayList);
            if (!bool.booleanValue()) {
                v.y(obj, "dexElements", objArrZn);
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                    Log.e("SplitCompatDexLoader", "Exception in makePathElement", iOException);
                    throw iOException;
                }
            }
            Log.i("Dex2oatTest", "needOpt = " + bool + " , cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
            file.setWritable(true);
            for (String str : file.list()) {
                Log.i("Dex2oatTest", "filename = " + str);
            }
        }

        public static Object[] zn(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Method methodZn;
            try {
                methodZn = v.zn(obj, "makePathElements", List.class, File.class, List.class);
            } catch (NoSuchMethodException unused) {
                Log.e("SplitCompatDexLoader", "NoSuchMethodException: makePathElements(List,File,List) failure");
                try {
                    methodZn = v.zn(obj, "makePathElements", ArrayList.class, File.class, ArrayList.class);
                } catch (NoSuchMethodException unused2) {
                    Log.e("SplitCompatDexLoader", "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure");
                    try {
                        Log.w("SplitCompatDexLoader", "NoSuchMethodException: try use v19 instead");
                        return y.gv(obj, arrayList, file, arrayList2);
                    } catch (NoSuchMethodException e4) {
                        Log.e("SplitCompatDexLoader", "NoSuchMethodException: makeDexElements(List,File,List) failure");
                        throw e4;
                    }
                }
            }
            return (Object[]) methodZn.invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static final class y {
        public static Object[] gv(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Method methodZn;
            try {
                methodZn = v.zn(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class);
            } catch (NoSuchMethodException unused) {
                Log.e("SplitCompatDexLoader", "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure");
                try {
                    methodZn = v.zn(obj, "makeDexElements", List.class, File.class, List.class);
                } catch (NoSuchMethodException e4) {
                    Log.e("SplitCompatDexLoader", "NoSuchMethodException: makeDexElements(List,File,List) failure");
                    throw e4;
                }
            }
            return (Object[]) methodZn.invoke(obj, arrayList, file, arrayList2);
        }

        public static void zn(ClassLoader classLoader, List<File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            Object obj = v.n3(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            v.y(obj, "dexElements", gv(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                    Log.e("SplitCompatDexLoader", "Exception in makeDexElement", iOException);
                    throw iOException;
                }
            }
        }
    }

    public static void y(ClassLoader classLoader, File file, List<File> list, Boolean bool) throws Throwable {
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            n3.n3(classLoader, list, file, bool);
        } else {
            y.zn(classLoader, list, file);
        }
        y = list.size();
    }
}
