package ft;

import androidx.annotation.Nullable;
import com.google.protobuf.Reader;
import ft.xq;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements im {
    public final xq.gv y = new xq.gv();

    public final void ad(int i) {
        int iF3 = f3();
        if (iF3 == -1) {
            return;
        }
        if (iF3 == g3()) {
            nf(i);
        } else {
            wf(iF3, i);
        }
    }

    @Override // ft.im
    public final boolean b() {
        xq xqVarYt = yt();
        return !xqVarYt.r() && xqVarYt.mt(g3(), this.y).f5159co;
    }

    @Override // ft.im
    public final boolean cr() {
        xq xqVarYt = yt();
        return !xqVarYt.r() && xqVarYt.mt(g3(), this.y).s();
    }

    public final void cy(long j, int i) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        xb(Math.max(currentPosition, 0L), i);
    }

    public final int d0() {
        xq xqVarYt = yt();
        if (xqVarYt.r()) {
            return -1;
        }
        return xqVarYt.w(g3(), x(), u0());
    }

    @Override // ft.im
    public final void e(int i) {
        wf(i, 10);
    }

    public final int f3() {
        xq xqVarYt = yt();
        if (xqVarYt.r()) {
            return -1;
        }
        return xqVarYt.c5(g3(), x(), u0());
    }

    @Override // ft.im
    public final void fb(long j) {
        xb(j, 5);
    }

    @Override // ft.im
    @Deprecated
    public final boolean g() {
        return cr();
    }

    @Override // ft.im
    @Deprecated
    public final int i4() {
        return g3();
    }

    @Override // ft.im
    public final boolean isPlaying() {
        return n3() == 3 && k() && k5() == 0;
    }

    @Override // ft.im
    public final void j5() {
        if (yt().r() || i9()) {
            return;
        }
        if (mg()) {
            ad(9);
        } else if (cr() && b()) {
            wf(g3(), 9);
        }
    }

    @Override // ft.im
    public final boolean mg() {
        return f3() != -1;
    }

    @Override // ft.im
    public final void n() {
        if (yt().r() || i9()) {
            return;
        }
        boolean zO4 = o4();
        if (cr() && !yc()) {
            if (zO4) {
                qk(7);
            }
        } else if (!zO4 || getCurrentPosition() > u()) {
            xb(0L, 7);
        } else {
            qk(7);
        }
    }

    public final void nf(int i) {
        o0(g3(), -9223372036854775807L, i, true);
    }

    public abstract void o0(int i, long j, int i5, boolean z);

    @Override // ft.im
    public final boolean o4() {
        return d0() != -1;
    }

    @Override // ft.im
    public final void oz(xb xbVar) {
        qj(k4.r.j(xbVar));
    }

    @Override // ft.im
    public final void p() {
        wf(g3(), 4);
    }

    @Override // ft.im
    public final void pause() {
        c(false);
    }

    @Override // ft.im
    public final void play() {
        c(true);
    }

    public final void qj(List<xb> list) {
        mt(list, true);
    }

    public final void qk(int i) {
        int iD0 = d0();
        if (iD0 == -1) {
            return;
        }
        if (iD0 == g3()) {
            nf(i);
        } else {
            wf(iD0, i);
        }
    }

    @Override // ft.im
    public final int r() {
        return yt().z();
    }

    @Override // ft.im
    public final void tg() {
        cy(-pq(), 11);
    }

    @Override // ft.im
    public final boolean ud(int i) {
        return q9().zn(i);
    }

    @Override // ft.im
    public final void ut(int i, long j) {
        o0(i, j, 10, false);
    }

    public final void wf(int i, int i5) {
        o0(i, -9223372036854775807L, i5, false);
    }

    @Override // ft.im
    public final void wz() {
        x4(0, Reader.READ_DONE);
    }

    public final int x() {
        int iC5 = c5();
        if (iC5 == 1) {
            return 0;
        }
        return iC5;
    }

    public final void xb(long j, int i) {
        o0(g3(), j, i, false);
    }

    @Override // ft.im
    @Nullable
    public final xb xc() {
        xq xqVarYt = yt();
        if (xqVarYt.r()) {
            return null;
        }
        return xqVarYt.mt(g3(), this.y).f5162fb;
    }

    @Override // ft.im
    public final void y4() {
        cy(s8(), 12);
    }

    @Override // ft.im
    public final boolean yc() {
        xq xqVarYt = yt();
        return !xqVarYt.r() && xqVarYt.mt(g3(), this.y).f5163p;
    }

    public final long z() {
        xq xqVarYt = yt();
        if (xqVarYt.r()) {
            return -9223372036854775807L;
        }
        return xqVarYt.mt(g3(), this.y).a();
    }
}
