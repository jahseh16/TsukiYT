package s4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    public transient AtomicLong y;

    public n3(double d4) {
        this.y = new AtomicLong(Double.doubleToRawLongBits(d4));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.y = new AtomicLong();
        n3(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(y());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return y();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) y();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) y();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) y();
    }

    public final void n3(double d4) {
        this.y.set(Double.doubleToRawLongBits(d4));
    }

    public String toString() {
        return Double.toString(y());
    }

    public final double y() {
        return Double.longBitsToDouble(this.y.get());
    }
}
