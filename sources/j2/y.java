package j2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class y implements View.OnTouchListener {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f5803fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5804s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5805v;

    @NonNull
    public final Dialog y;

    public y(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.y = dialog;
        this.f5805v = rect.left;
        this.f5803fb = rect.top;
        this.f5804s = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f5805v + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f5803fb + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f5804s;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.y.onTouchEvent(motionEventObtain);
    }
}
