package k;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class zn {
    public static final Interpolator f3 = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f5960a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int[] f5961c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final AbstractC0112zn f5962co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5963f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float[] f5964fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public float[] f5965gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int[] f5967i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public OverScroller f5968mt;
    public int n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5969p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f5971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f5972t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public float f5973tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f5974v;
    public final int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public float f5975wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final ViewGroup f5976x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f5977xc;
    public int y;
    public View z;
    public int zn = -1;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public final Runnable f5966i4 = new n3();

    public class n3 implements Runnable {
        public n3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zn.this.x(0);
        }
    }

    public class y implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }

    public zn(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC0112zn abstractC0112zn) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0112zn == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f5976x4 = viewGroup;
        this.f5962co = abstractC0112zn;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.w = i;
        this.f5977xc = i;
        this.n3 = viewConfiguration.getScaledTouchSlop();
        this.f5973tl = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5975wz = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5968mt = new OverScroller(context, f3);
    }

    public static zn wz(@NonNull ViewGroup viewGroup, float f4, @NonNull AbstractC0112zn abstractC0112zn) {
        zn znVarXc = xc(viewGroup, abstractC0112zn);
        znVarXc.n3 = (int) (znVarXc.n3 * (1.0f / f4));
        return znVarXc;
    }

    public static zn xc(@NonNull ViewGroup viewGroup, @NonNull AbstractC0112zn abstractC0112zn) {
        return new zn(viewGroup.getContext(), viewGroup, abstractC0112zn);
    }

    public final boolean a(View view, float f4, float f5) {
        if (view == null) {
            return false;
        }
        boolean z = this.f5962co.gv(view) > 0;
        boolean z5 = this.f5962co.v(view) > 0;
        if (!z || !z5) {
            return z ? Math.abs(f4) > ((float) this.n3) : z5 && Math.abs(f5) > ((float) this.n3);
        }
        float f7 = (f4 * f4) + (f5 * f5);
        int i = this.n3;
        return f7 > ((float) (i * i));
    }

    public final void a8(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mg(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y3 = motionEvent.getY(i);
                this.f5960a[pointerId] = x2;
                this.f5964fb[pointerId] = y3;
            }
        }
    }

    public void b(int i) {
        this.f5977xc = i;
    }

    public int c() {
        return this.n3;
    }

    public final void c5() {
        float[] fArr = this.f5965gv;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f5974v, 0.0f);
        Arrays.fill(this.f5960a, 0.0f);
        Arrays.fill(this.f5964fb, 0.0f);
        Arrays.fill(this.f5971s, 0);
        Arrays.fill(this.f5961c5, 0);
        Arrays.fill(this.f5967i9, 0);
        this.f5963f = 0;
    }

    public final void co(int i) {
        float[] fArr = this.f5965gv;
        if (fArr == null || fArr.length <= i) {
            int i5 = i + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5974v;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5960a;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5964fb;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5971s;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5961c5;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5967i9;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5965gv = fArr2;
            this.f5974v = fArr3;
            this.f5960a = fArr4;
            this.f5964fb = fArr5;
            this.f5971s = iArr;
            this.f5961c5 = iArr2;
            this.f5967i9 = iArr3;
        }
    }

    public void d(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            y();
        }
        if (this.f5972t == null) {
            this.f5972t = VelocityTracker.obtain();
        }
        this.f5972t.addMovement(motionEvent);
        int i5 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewZ = z((int) x2, (int) y3);
            ud(x2, y3, pointerId);
            qn(viewZ, pointerId);
            int i8 = this.f5971s[pointerId];
            int i10 = this.f5969p;
            if ((i8 & i10) != 0) {
                this.f5962co.s(i8 & i10, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.y == 1) {
                z6();
            }
            y();
            return;
        }
        if (actionMasked == 2) {
            if (this.y == 1) {
                if (mg(this.zn)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.zn);
                    float x5 = motionEvent.getX(iFindPointerIndex);
                    float y4 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f5960a;
                    int i11 = this.zn;
                    int i12 = (int) (x5 - fArr[i11]);
                    int i13 = (int) (y4 - this.f5964fb[i11]);
                    mt(this.z.getLeft() + i12, this.z.getTop() + i13, i12, i13);
                    a8(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i5 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i5);
                if (mg(pointerId2)) {
                    float x6 = motionEvent.getX(i5);
                    float y5 = motionEvent.getY(i5);
                    float f4 = x6 - this.f5965gv[pointerId2];
                    float f5 = y5 - this.f5974v[pointerId2];
                    ej(f4, f5, pointerId2);
                    if (this.y != 1) {
                        View viewZ2 = z((int) x6, (int) y5);
                        if (a(viewZ2, f4, f5) && qn(viewZ2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i5++;
            }
            a8(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.y == 1) {
                w(0.0f, 0.0f);
            }
            y();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x7 = motionEvent.getX(actionIndex);
            float y8 = motionEvent.getY(actionIndex);
            ud(x7, y8, pointerId3);
            if (this.y != 0) {
                if (fh((int) x7, (int) y8)) {
                    qn(this.z, pointerId3);
                    return;
                }
                return;
            } else {
                qn(z((int) x7, (int) y8), pointerId3);
                int i14 = this.f5971s[pointerId3];
                int i15 = this.f5969p;
                if ((i14 & i15) != 0) {
                    this.f5962co.s(i14 & i15, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.y == 1 && pointerId4 == this.zn) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i5 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i5);
                if (pointerId5 != this.zn) {
                    View viewZ3 = z((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                    View view = this.z;
                    if (viewZ3 == view && qn(view, pointerId5)) {
                        i = this.zn;
                        break;
                    }
                }
                i5++;
            }
            if (i == -1) {
                z6();
            }
        }
        i9(pointerId4);
    }

    public int d0() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [k.zn$zn] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ej(float f4, float f5, int i) {
        boolean zZn = zn(f4, f5, i, 1);
        ?? r02 = zZn;
        if (zn(f5, f4, i, 4)) {
            r02 = (zZn ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (zn(f4, f5, i, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (zn(f5, f4, i, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f5961c5;
            iArr[i] = iArr[i] | r04;
            this.f5962co.a(r04, i);
        }
    }

    public final int f(int i, int i5, int i8) {
        if (i == 0) {
            return 0;
        }
        int width = this.f5976x4.getWidth();
        float f4 = width / 2;
        float fP = f4 + (p(Math.min(1.0f, Math.abs(i) / width)) * f4);
        int iAbs = Math.abs(i5);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fP / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i8) + 1.0f) * 256.0f), 600);
    }

    public int f3() {
        return this.f5977xc;
    }

    public final float fb(float f4, float f5, float f7) {
        float fAbs = Math.abs(f4);
        if (fAbs < f5) {
            return 0.0f;
        }
        return fAbs > f7 ? f4 > 0.0f ? f7 : -f7 : f4;
    }

    public boolean fh(int i, int i5) {
        return ta(this.z, i, i5);
    }

    public boolean gv(int i) {
        int length = this.f5965gv.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (v(i, i5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hw(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.zn.hw(android.view.MotionEvent):boolean");
    }

    public int i4() {
        return this.w;
    }

    public final void i9(int i) {
        if (this.f5965gv == null || !rz(i)) {
            return;
        }
        this.f5965gv[i] = 0.0f;
        this.f5974v[i] = 0.0f;
        this.f5960a[i] = 0.0f;
        this.f5964fb[i] = 0.0f;
        this.f5971s[i] = 0;
        this.f5961c5[i] = 0;
        this.f5967i9[i] = 0;
        this.f5963f = (~(1 << i)) & this.f5963f;
    }

    public boolean j5(@NonNull View view, int i, int i5) {
        this.z = view;
        this.zn = -1;
        boolean zR = r(i, i5, 0, 0);
        if (!zR && this.y == 0 && this.z != null) {
            this.z = null;
        }
        return zR;
    }

    public void k5(int i) {
        this.f5969p = i;
    }

    public final boolean mg(int i) {
        if (rz(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void mt(int i, int i5, int i8, int i10) {
        int left = this.z.getLeft();
        int top = this.z.getTop();
        if (i8 != 0) {
            i = this.f5962co.y(this.z, i, i8);
            ut.y5(this.z, i - left);
        }
        int i11 = i;
        if (i10 != 0) {
            i5 = this.f5962co.n3(this.z, i5, i10);
            ut.xg(this.z, i5 - top);
        }
        int i12 = i5;
        if (i8 == 0 && i10 == 0) {
            return;
        }
        this.f5962co.f(this.z, i11, i12, i11 - left, i12 - top);
    }

    public final int n(int i, int i5) {
        int i8 = i < this.f5976x4.getLeft() + this.f5977xc ? 1 : 0;
        if (i5 < this.f5976x4.getTop() + this.f5977xc) {
            i8 |= 4;
        }
        if (i > this.f5976x4.getRight() - this.f5977xc) {
            i8 |= 2;
        }
        return i5 > this.f5976x4.getBottom() - this.f5977xc ? i8 | 8 : i8;
    }

    public void n3(@NonNull View view, int i) {
        if (view.getParent() == this.f5976x4) {
            this.z = view;
            this.zn = i;
            this.f5962co.c5(view, i);
            x(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f5976x4 + ")");
    }

    public final float p(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    public boolean qn(View view, int i) {
        if (view == this.z && this.zn == i) {
            return true;
        }
        if (view == null || !this.f5962co.tl(view, i)) {
            return false;
        }
        this.zn = i;
        n3(view, i);
        return true;
    }

    public final boolean r(int i, int i5, int i8, int i10) {
        int left = this.z.getLeft();
        int top = this.z.getTop();
        int i11 = i - left;
        int i12 = i5 - top;
        if (i11 == 0 && i12 == 0) {
            this.f5968mt.abortAnimation();
            x(0);
            return false;
        }
        this.f5968mt.startScroll(left, top, i11, i12, t(this.z, i11, i12, i8, i10));
        x(2);
        return true;
    }

    public boolean rz(int i) {
        return ((1 << i) & this.f5963f) != 0;
    }

    public final int s(int i, int i5, int i8) {
        int iAbs = Math.abs(i);
        if (iAbs < i5) {
            return 0;
        }
        return iAbs > i8 ? i > 0 ? i8 : -i8 : i;
    }

    public final int t(View view, int i, int i5, int i8, int i10) {
        float f4;
        float f5;
        float f7;
        float f8;
        int iS = s(i8, (int) this.f5975wz, (int) this.f5973tl);
        int iS2 = s(i10, (int) this.f5975wz, (int) this.f5973tl);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i5);
        int iAbs3 = Math.abs(iS);
        int iAbs4 = Math.abs(iS2);
        int i11 = iAbs3 + iAbs4;
        int i12 = iAbs + iAbs2;
        if (iS != 0) {
            f4 = iAbs3;
            f5 = i11;
        } else {
            f4 = iAbs;
            f5 = i12;
        }
        float f9 = f4 / f5;
        if (iS2 != 0) {
            f7 = iAbs4;
            f8 = i11;
        } else {
            f7 = iAbs2;
            f8 = i12;
        }
        return (int) ((f(i, iS, this.f5962co.gv(view)) * f9) + (f(i5, iS2, this.f5962co.v(view)) * (f7 / f8)));
    }

    public boolean ta(@Nullable View view, int i, int i5) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom();
    }

    public boolean tl(boolean z) {
        if (this.y == 2) {
            boolean zComputeScrollOffset = this.f5968mt.computeScrollOffset();
            int currX = this.f5968mt.getCurrX();
            int currY = this.f5968mt.getCurrY();
            int left = currX - this.z.getLeft();
            int top = currY - this.z.getTop();
            if (left != 0) {
                ut.y5(this.z, left);
            }
            if (top != 0) {
                ut.xg(this.z, top);
            }
            if (left != 0 || top != 0) {
                this.f5962co.f(this.z, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f5968mt.getFinalX() && currY == this.f5968mt.getFinalY()) {
                this.f5968mt.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f5976x4.post(this.f5966i4);
                } else {
                    x(0);
                }
            }
        }
        return this.y == 2;
    }

    public final void ud(float f4, float f5, int i) {
        co(i);
        float[] fArr = this.f5965gv;
        this.f5960a[i] = f4;
        fArr[i] = f4;
        float[] fArr2 = this.f5974v;
        this.f5964fb[i] = f5;
        fArr2[i] = f5;
        this.f5971s[i] = n((int) f4, (int) f5);
        this.f5963f |= 1 << i;
    }

    public boolean v(int i, int i5) {
        if (!rz(i5)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z5 = (i & 2) == 2;
        float f4 = this.f5960a[i5] - this.f5965gv[i5];
        float f5 = this.f5964fb[i5] - this.f5974v[i5];
        if (!z || !z5) {
            return z ? Math.abs(f4) > ((float) this.n3) : z5 && Math.abs(f5) > ((float) this.n3);
        }
        float f7 = (f4 * f4) + (f5 * f5);
        int i8 = this.n3;
        return f7 > ((float) (i8 * i8));
    }

    public boolean vl(int i, int i5) {
        if (this.f5970r) {
            return r(i, i5, (int) this.f5972t.getXVelocity(this.zn), (int) this.f5972t.getYVelocity(this.zn));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final void w(float f4, float f5) {
        this.f5970r = true;
        this.f5962co.t(this.z, f4, f5);
        this.f5970r = false;
        if (this.y == 1) {
            x(0);
        }
    }

    public void x(int i) {
        this.f5976x4.removeCallbacks(this.f5966i4);
        if (this.y != i) {
            this.y = i;
            this.f5962co.i9(i);
            if (this.y == 0) {
                this.z = null;
            }
        }
    }

    @Nullable
    public View x4() {
        return this.z;
    }

    public void y() {
        this.zn = -1;
        c5();
        VelocityTracker velocityTracker = this.f5972t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5972t = null;
        }
    }

    public void yt(float f4) {
        this.f5975wz = f4;
    }

    @Nullable
    public View z(int i, int i5) {
        for (int childCount = this.f5976x4.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f5976x4.getChildAt(this.f5962co.zn(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void z6() {
        this.f5972t.computeCurrentVelocity(1000, this.f5973tl);
        w(fb(this.f5972t.getXVelocity(this.zn), this.f5975wz, this.f5973tl), fb(this.f5972t.getYVelocity(this.zn), this.f5975wz, this.f5973tl));
    }

    public final boolean zn(float f4, float f5, int i, int i5) {
        float fAbs = Math.abs(f4);
        float fAbs2 = Math.abs(f5);
        if ((this.f5971s[i] & i5) != i5 || (this.f5969p & i5) == 0 || (this.f5967i9[i] & i5) == i5 || (this.f5961c5[i] & i5) == i5) {
            return false;
        }
        int i8 = this.n3;
        if (fAbs <= i8 && fAbs2 <= i8) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f5962co.fb(i5)) {
            return (this.f5961c5[i] & i5) == 0 && fAbs > ((float) this.n3);
        }
        int[] iArr = this.f5967i9;
        iArr[i] = iArr[i] | i5;
        return false;
    }

    /* JADX INFO: renamed from: k.zn$zn, reason: collision with other inner class name */
    public static abstract class AbstractC0112zn {
        public abstract void f(@NonNull View view, int i, int i5, int i8, int i10);

        public boolean fb(int i) {
            return false;
        }

        public int gv(@NonNull View view) {
            return 0;
        }

        public abstract void i9(int i);

        public abstract int n3(@NonNull View view, int i, int i5);

        public abstract void t(@NonNull View view, float f3, float f4);

        public abstract boolean tl(@NonNull View view, int i);

        public int v(@NonNull View view) {
            return 0;
        }

        public abstract int y(@NonNull View view, int i, int i5);

        public int zn(int i) {
            return i;
        }

        public void a(int i, int i5) {
        }

        public void c5(@NonNull View view, int i) {
        }

        public void s(int i, int i5) {
        }
    }
}
