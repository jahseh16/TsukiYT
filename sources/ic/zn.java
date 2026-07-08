package ic;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn extends ValueAnimator {
    public final Set<ValueAnimator.AnimatorUpdateListener> y = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f5672v = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Set<Animator.AnimatorPauseListener> f5671fb = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f5672v.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f5671fb.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.y.add(animatorUpdateListener);
    }

    public void c5() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    public void fb() {
        Iterator<Animator.AnimatorPauseListener> it = this.f5671fb.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void gv() {
        Iterator<Animator.AnimatorPauseListener> it = this.f5671fb.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    public void n3() {
        Iterator<Animator.AnimatorListener> it = this.f5672v.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f5672v.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.y.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f5672v.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f5671fb.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.y.remove(animatorUpdateListener);
    }

    public void s(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f5672v) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void v() {
        Iterator<Animator.AnimatorListener> it = this.f5672v.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    public void zn(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f5672v) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
