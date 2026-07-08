package v0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import v0.p;

/* JADX INFO: loaded from: classes.dex */
public final class yt implements p {
    public static final List<n3> n3 = new ArrayList(50);
    public final Handler y;

    public static final class n3 implements p.y {

        @Nullable
        public yt n3;

        @Nullable
        public Message y;

        public n3() {
        }

        public n3 gv(Message message, yt ytVar) {
            this.y = message;
            this.n3 = ytVar;
            return this;
        }

        public final void n3() {
            this.y = null;
            this.n3 = null;
            yt.xc(this);
        }

        @Override // v0.p.y
        public void y() {
            ((Message) v0.y.v(this.y)).sendToTarget();
            n3();
        }

        public boolean zn(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) v0.y.v(this.y));
            n3();
            return zSendMessageAtFrontOfQueue;
        }
    }

    public yt(Handler handler) {
        this.y = handler;
    }

    public static n3 wz() {
        n3 n3Var;
        List<n3> list = n3;
        synchronized (list) {
            try {
                n3Var = list.isEmpty() ? new n3() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return n3Var;
    }

    public static void xc(n3 n3Var) {
        List<n3> list = n3;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(n3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v0.p
    public void a(@Nullable Object obj) {
        this.y.removeCallbacksAndMessages(obj);
    }

    @Override // v0.p
    public boolean c5(Runnable runnable) {
        return this.y.post(runnable);
    }

    @Override // v0.p
    public boolean f(int i, long j) {
        return this.y.sendEmptyMessageAtTime(i, j);
    }

    @Override // v0.p
    public Looper fb() {
        return this.y.getLooper();
    }

    @Override // v0.p
    public p.y gv(int i, int i5, int i8, @Nullable Object obj) {
        return wz().gv(this.y.obtainMessage(i, i5, i8, obj), this);
    }

    @Override // v0.p
    public boolean i9(int i) {
        return this.y.sendEmptyMessage(i);
    }

    @Override // v0.p
    public p.y n3(int i) {
        return wz().gv(this.y.obtainMessage(i), this);
    }

    @Override // v0.p
    public p.y s(int i, int i5, int i8) {
        return wz().gv(this.y.obtainMessage(i, i5, i8), this);
    }

    @Override // v0.p
    public void t(int i) {
        this.y.removeMessages(i);
    }

    @Override // v0.p
    public p.y v(int i, @Nullable Object obj) {
        return wz().gv(this.y.obtainMessage(i, obj), this);
    }

    @Override // v0.p
    public boolean y(p.y yVar) {
        return ((n3) yVar).zn(this.y);
    }

    @Override // v0.p
    public boolean zn(int i) {
        return this.y.hasMessages(i);
    }
}
