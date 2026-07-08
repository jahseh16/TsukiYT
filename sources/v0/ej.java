package v0;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class ej {
    public final Object y = new Object();
    public final PriorityQueue<Integer> n3 = new PriorityQueue<>(10, Collections.reverseOrder());
    public int zn = Integer.MIN_VALUE;

    public static class y extends IOException {
        public y(int i, int i5) {
            super("Priority too low [priority=" + i + ", highest=" + i5 + "]");
        }
    }

    public void n3(int i) throws y {
        synchronized (this.y) {
            try {
                if (this.zn != i) {
                    throw new y(i, this.zn);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(int i) {
        synchronized (this.y) {
            this.n3.add(Integer.valueOf(i));
            this.zn = Math.max(this.zn, i);
        }
    }

    public void zn(int i) {
        synchronized (this.y) {
            this.n3.remove(Integer.valueOf(i));
            this.zn = this.n3.isEmpty() ? Integer.MIN_VALUE : ((Integer) ut.i9(this.n3.peek())).intValue();
            this.y.notifyAll();
        }
    }
}
