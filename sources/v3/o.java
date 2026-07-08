package v3;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends j {
    public o(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public final Class a() {
        return n3().getType().getComponentType();
    }

    public final void gv(Collection collection) {
        Object[] objArr = (Object[]) y();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) a(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        zn(objArr2);
    }

    public final void v(Collection collection) {
        Object[] objArr = (Object[]) y();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) a(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        zn(objArr2);
    }
}
