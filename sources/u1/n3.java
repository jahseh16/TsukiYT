package u1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.protobuf.Reader;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3<V extends View> extends gv<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8321a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f8322c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f8323fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public Runnable f8324gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public VelocityTracker f8325i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8326s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OverScroller f8327v;

    public class y implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final V f8329v;
        public final CoordinatorLayout y;

        public y(CoordinatorLayout coordinatorLayout, V v6) {
            this.y = coordinatorLayout;
            this.f8329v = v6;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f8329v == null || (overScroller = n3.this.f8327v) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                n3.this.yt(this.y, this.f8329v);
                return;
            }
            n3 n3Var = n3.this;
            n3Var.hw(this.y, this.f8329v, n3Var.f8327v.getCurrY());
            ut.nf(this.f8329v, this);
        }
    }

    public n3() {
        this.f8323fb = -1;
        this.f8322c5 = -1;
    }

    public final boolean a8(CoordinatorLayout coordinatorLayout, @NonNull V v6, int i, int i5, float f3) {
        Runnable runnable = this.f8324gv;
        if (runnable != null) {
            v6.removeCallbacks(runnable);
            this.f8324gv = null;
        }
        if (this.f8327v == null) {
            this.f8327v = new OverScroller(v6.getContext());
        }
        this.f8327v.fling(0, ta(), 0, Math.round(f3), 0, 0, i, i5);
        if (!this.f8327v.computeScrollOffset()) {
            yt(coordinatorLayout, v6);
            return false;
        }
        y yVar = new y(coordinatorLayout, v6);
        this.f8324gv = yVar;
        ut.nf(v6, yVar);
        return true;
    }

    public int b(@NonNull V v6) {
        return v6.getHeight();
    }

    public boolean ej(V v6) {
        return false;
    }

    public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v6, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f8322c5 < 0) {
            this.f8322c5 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f8321a) {
            int i = this.f8323fb;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y3 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y3 - this.f8326s) > this.f8322c5) {
                this.f8326s = y3;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f8323fb = -1;
            int x2 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            boolean z = ej(v6) && coordinatorLayout.fh(v6, x2, y4);
            this.f8321a = z;
            if (z) {
                this.f8326s = y4;
                this.f8323fb = motionEvent.getPointerId(0);
                ud();
                OverScroller overScroller = this.f8327v;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f8327v.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f8325i9;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public int hw(CoordinatorLayout coordinatorLayout, V v6, int i) {
        return j5(coordinatorLayout, v6, i, Integer.MIN_VALUE, Reader.READ_DONE);
    }

    public int j5(CoordinatorLayout coordinatorLayout, V v6, int i, int i5, int i8) {
        int iN3;
        int iTa = ta();
        if (i5 == 0 || iTa < i5 || iTa > i8 || iTa == (iN3 = b.y.n3(i, i5, i8))) {
            return 0;
        }
        z6(iN3);
        return iTa - iN3;
    }

    public int k5() {
        return ta();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mg(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.NonNull V r13, @androidx.annotation.NonNull android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f8323fb = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f8326s = r12
            goto L4c
        L2d:
            int r0 = r11.f8323fb
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f8326s
            int r7 = r1 - r0
            r11.f8326s = r0
            int r8 = r11.x(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.vl(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f8325i9
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f8325i9
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f8325i9
            int r4 = r11.f8323fb
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.b(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.a8(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f8321a = r3
            r11.f8323fb = r1
            android.view.VelocityTracker r13 = r11.f8325i9
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f8325i9 = r13
        L81:
            android.view.VelocityTracker r13 = r11.f8325i9
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f8321a
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.n3.mg(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final void ud() {
        if (this.f8325i9 == null) {
            this.f8325i9 = VelocityTracker.obtain();
        }
    }

    public final int vl(CoordinatorLayout coordinatorLayout, V v6, int i, int i5, int i8) {
        return j5(coordinatorLayout, v6, k5() - i, i5, i8);
    }

    public int x(@NonNull V v6) {
        return -v6.getHeight();
    }

    public n3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8323fb = -1;
        this.f8322c5 = -1;
    }

    public void yt(CoordinatorLayout coordinatorLayout, V v6) {
    }
}
