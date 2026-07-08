package v0;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public boolean n3;
    public final v y;

    public s() {
        this(v.y);
    }

    public synchronized boolean a() {
        if (this.n3) {
            return false;
        }
        this.n3 = true;
        notifyAll();
        return true;
    }

    public synchronized boolean gv() {
        boolean z;
        z = this.n3;
        this.n3 = false;
        return z;
    }

    public synchronized boolean n3(long j) throws InterruptedException {
        if (j <= 0) {
            return this.n3;
        }
        long jElapsedRealtime = this.y.elapsedRealtime();
        long j4 = j + jElapsedRealtime;
        if (j4 < jElapsedRealtime) {
            y();
        } else {
            while (!this.n3 && jElapsedRealtime < j4) {
                wait(j4 - jElapsedRealtime);
                jElapsedRealtime = this.y.elapsedRealtime();
            }
        }
        return this.n3;
    }

    public synchronized boolean v() {
        return this.n3;
    }

    public synchronized void y() throws InterruptedException {
        while (!this.n3) {
            wait();
        }
    }

    public synchronized void zn() {
        boolean z = false;
        while (!this.n3) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public s(v vVar) {
        this.y = vVar;
    }
}
