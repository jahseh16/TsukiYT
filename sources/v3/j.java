package v3;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public final Field n3;
    public final Object y;
    public final Class zn;

    public j(Object obj, Field field, Class cls) {
        this.y = obj;
        this.n3 = field;
        this.zn = cls;
    }

    public final Field n3() {
        return this.n3;
    }

    public final Object y() {
        try {
            return this.zn.cast(this.n3.get(this.y));
        } catch (Exception e4) {
            throw new ut(String.format("Failed to get value of field %s of type %s on object of type %s", this.n3.getName(), this.y.getClass().getName(), this.zn.getName()), e4);
        }
    }

    public final void zn(Object obj) {
        try {
            this.n3.set(this.y, obj);
        } catch (Exception e4) {
            throw new ut(String.format("Failed to set value of field %s of type %s on object of type %s", this.n3.getName(), this.y.getClass().getName(), this.zn.getName()), e4);
        }
    }
}
