package t1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class c5 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8178gv;
    public long n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8179v;
    public long y;

    @Nullable
    public TimeInterpolator zn;

    public c5(long j, long j4) {
        this.zn = null;
        this.f8178gv = 0;
        this.f8179v = 1;
        this.y = j;
        this.n3 = j4;
    }

    public static TimeInterpolator a(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? y.n3 : interpolator instanceof AccelerateInterpolator ? y.zn : interpolator instanceof DecelerateInterpolator ? y.f8180gv : interpolator;
    }

    @NonNull
    public static c5 n3(@NonNull ValueAnimator valueAnimator) {
        c5 c5Var = new c5(valueAnimator.getStartDelay(), valueAnimator.getDuration(), a(valueAnimator));
        c5Var.f8178gv = valueAnimator.getRepeatCount();
        c5Var.f8179v = valueAnimator.getRepeatMode();
        return c5Var;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        if (zn() == c5Var.zn() && gv() == c5Var.gv() && fb() == c5Var.fb() && s() == c5Var.s()) {
            return v().getClass().equals(c5Var.v().getClass());
        }
        return false;
    }

    public int fb() {
        return this.f8178gv;
    }

    public long gv() {
        return this.n3;
    }

    public int hashCode() {
        return (((((((((int) (zn() ^ (zn() >>> 32))) * 31) + ((int) (gv() ^ (gv() >>> 32)))) * 31) + v().getClass().hashCode()) * 31) + fb()) * 31) + s();
    }

    public int s() {
        return this.f8179v;
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + zn() + " duration: " + gv() + " interpolator: " + v().getClass() + " repeatCount: " + fb() + " repeatMode: " + s() + "}\n";
    }

    @Nullable
    public TimeInterpolator v() {
        TimeInterpolator timeInterpolator = this.zn;
        return timeInterpolator != null ? timeInterpolator : y.n3;
    }

    public void y(@NonNull Animator animator) {
        animator.setStartDelay(zn());
        animator.setDuration(gv());
        animator.setInterpolator(v());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(fb());
            valueAnimator.setRepeatMode(s());
        }
    }

    public long zn() {
        return this.y;
    }

    public c5(long j, long j4, @NonNull TimeInterpolator timeInterpolator) {
        this.f8178gv = 0;
        this.f8179v = 1;
        this.y = j;
        this.n3 = j4;
        this.zn = timeInterpolator;
    }
}
