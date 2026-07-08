package o2;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.Reader;
import java.lang.reflect.Constructor;
import w.hw;
import w.j5;
import w.k;
import w.oz;
import w.q9;
import w.ut;
import w.vl;
import w.yt;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public static Object f7084p;

    @Nullable
    public static Constructor<StaticLayout> w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final int f7085wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static boolean f7086xc;
    public final TextPaint n3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7094t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7096v;
    public CharSequence y;
    public final int zn;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7091gv = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Layout.Alignment f7087a = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f7090fb = Reader.READ_DONE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f7093s = 0.0f;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public float f7088c5 = 1.0f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f7092i9 = f7085wz;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7089f = true;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public TextUtils.TruncateAt f7095tl = null;

    public static class y extends Exception {
        public y(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        f7085wz = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public s(CharSequence charSequence, TextPaint textPaint, int i) {
        this.y = charSequence;
        this.n3 = textPaint;
        this.zn = i;
        this.f7096v = charSequence.length();
    }

    @NonNull
    public static s zn(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, int i) {
        return new s(charSequence, textPaint, i);
    }

    @NonNull
    public s a(int i) {
        this.f7092i9 = i;
        return this;
    }

    @NonNull
    public s c5(float f3, float f4) {
        this.f7093s = f3;
        this.f7088c5 = f4;
        return this;
    }

    @NonNull
    public s fb(boolean z) {
        this.f7089f = z;
        return this;
    }

    @NonNull
    public s gv(@NonNull Layout.Alignment alignment) {
        this.f7087a = alignment;
        return this;
    }

    @NonNull
    public s i9(int i) {
        this.f7090fb = i;
        return this;
    }

    public final void n3() throws y {
        if (f7086xc) {
            return;
        }
        try {
            f7084p = this.f7094t && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            w = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f7086xc = true;
        } catch (Exception e4) {
            throw new y(e4);
        }
    }

    public s s(boolean z) {
        this.f7094t = z;
        return this;
    }

    @NonNull
    public s v(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f7095tl = truncateAt;
        return this;
    }

    public StaticLayout y() throws y {
        if (this.y == null) {
            this.y = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        int iMax = Math.max(0, this.zn);
        CharSequence charSequenceEllipsize = this.y;
        if (this.f7090fb == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.n3, iMax, this.f7095tl);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f7096v);
        this.f7096v = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            n3();
            try {
                return (StaticLayout) ((Constructor) j5.s.fb(w)).newInstance(charSequenceEllipsize, Integer.valueOf(this.f7091gv), Integer.valueOf(this.f7096v), this.n3, Integer.valueOf(iMax), this.f7087a, j5.s.fb(f7084p), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f7089f), null, Integer.valueOf(iMax), Integer.valueOf(this.f7090fb));
            } catch (Exception e4) {
                throw new y(e4);
            }
        }
        if (this.f7094t && this.f7090fb == 1) {
            this.f7087a = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderY = yt.y(charSequenceEllipsize, this.f7091gv, iMin, this.n3, iMax);
        vl.y(builderY, this.f7087a);
        j5.y(builderY, this.f7089f);
        k.y(builderY, this.f7094t ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f7095tl;
        if (truncateAt != null) {
            builderY.setEllipsize(truncateAt);
        }
        ut.y(builderY, this.f7090fb);
        float f3 = this.f7093s;
        if (f3 != 0.0f || this.f7088c5 != 1.0f) {
            hw.y(builderY, f3, this.f7088c5);
        }
        if (this.f7090fb > 1) {
            oz.y(builderY, this.f7092i9);
        }
        return q9.y(builderY);
    }
}
