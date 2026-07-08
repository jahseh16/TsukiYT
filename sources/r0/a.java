package r0;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.a;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    public interface y {

        /* JADX INFO: renamed from: r0.a$y$y, reason: collision with other inner class name */
        public static final class C0152y {
            public final CopyOnWriteArrayList<C0153y> y = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: r0.a$y$y$y, reason: collision with other inner class name */
            public static final class C0153y {
                public final y n3;
                public final Handler y;
                public boolean zn;

                public C0153y(Handler handler, y yVar) {
                    this.y = handler;
                    this.n3 = yVar;
                }

                public void gv() {
                    this.zn = true;
                }
            }

            public static /* synthetic */ void gv(C0153y c0153y, int i, long j, long j4) {
                c0153y.n3.fh(i, j, j4);
            }

            public void n3(Handler handler, y yVar) {
                v0.y.v(handler);
                v0.y.v(yVar);
                v(yVar);
                this.y.add(new C0153y(handler, yVar));
            }

            public void v(y yVar) {
                for (C0153y c0153y : this.y) {
                    if (c0153y.n3 == yVar) {
                        c0153y.gv();
                        this.y.remove(c0153y);
                    }
                }
            }

            public void zn(final int i, final long j, final long j4) {
                for (final C0153y c0153y : this.y) {
                    if (!c0153y.zn) {
                        c0153y.y.post(new Runnable() { // from class: r0.v
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.y.C0152y.gv(c0153y, i, j, j4);
                            }
                        });
                    }
                }
            }
        }

        void fh(int i, long j, long j4);
    }

    @Nullable
    o gv();

    long n3();

    void s(Handler handler, y yVar);

    long v();

    void zn(y yVar);
}
