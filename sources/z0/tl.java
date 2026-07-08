package z0;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import z0.gv;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, gv.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f9412f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final y f9413fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f9414s;
    public final PointF y = new PointF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PointF f9416v = new PointF();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile float f9415t = 3.1415927f;

    public interface y {
        void n3(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public tl(Context context, y yVar, float f3) {
        this.f9413fb = yVar;
        this.f9414s = f3;
        this.f9412f = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.y.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
        float x2 = (motionEvent2.getX() - this.y.x) / this.f9414s;
        float y3 = motionEvent2.getY();
        PointF pointF = this.y;
        float f5 = (y3 - pointF.y) / this.f9414s;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d4 = this.f9415t;
        float fCos = (float) Math.cos(d4);
        float fSin = (float) Math.sin(d4);
        PointF pointF2 = this.f9416v;
        pointF2.x -= (fCos * x2) - (fSin * f5);
        float f7 = pointF2.y + (fSin * x2) + (fCos * f5);
        pointF2.y = f7;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f7));
        this.f9413fb.n3(this.f9416v);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f9413fb.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9412f.onTouchEvent(motionEvent);
    }

    @Override // z0.gv.y
    public void y(float[] fArr, float f3) {
        this.f9415t = -f3;
    }
}
