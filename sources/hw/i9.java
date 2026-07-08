package hw;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import w.k;
import w.o;
import w.oz;
import w.q9;
import w.yt;

/* JADX INFO: loaded from: classes.dex */
public class i9 implements Spannable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f5348f = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public static Executor f5349t;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public final int[] f5350fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final PrecomputedText f5351s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final n3 f5352v;

    @NonNull
    public final Spannable y;

    public static class zn extends FutureTask<i9> {

        public static class y implements Callable<i9> {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public CharSequence f5356v;
            public n3 y;

            public y(@NonNull n3 n3Var, @NonNull CharSequence charSequence) {
                this.y = n3Var;
                this.f5356v = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public i9 call() throws Exception {
                return i9.y(this.f5356v, this.y);
            }
        }

        public zn(@NonNull n3 n3Var, @NonNull CharSequence charSequence) {
            super(new y(n3Var, charSequence));
        }
    }

    public i9(@NonNull CharSequence charSequence, @NonNull n3 n3Var, @NonNull int[] iArr) {
        this.y = new SpannableString(charSequence);
        this.f5352v = n3Var;
        this.f5350fb = iArr;
        this.f5351s = null;
    }

    public static Future<i9> gv(@NonNull CharSequence charSequence, @NonNull n3 n3Var, @Nullable Executor executor) {
        zn znVar = new zn(n3Var, charSequence);
        if (executor == null) {
            synchronized (f5348f) {
                try {
                    if (f5349t == null) {
                        f5349t = Executors.newFixedThreadPool(1);
                    }
                    executor = f5349t;
                } finally {
                }
            }
        }
        executor.execute(znVar);
        return znVar;
    }

    @SuppressLint({"WrongConstant"})
    public static i9 y(@NonNull CharSequence charSequence, @NonNull n3 n3Var) {
        PrecomputedText.Params params;
        j5.s.fb(charSequence);
        j5.s.fb(n3Var);
        try {
            yt.x4.y("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = n3Var.f5354v) != null) {
                return new i9(PrecomputedText.create(charSequence, params), n3Var);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                i = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                q9.y(k.y(oz.y(o.y(yt.y(charSequence, 0, charSequence.length(), n3Var.v(), Reader.READ_DONE), n3Var.n3()), n3Var.zn()), n3Var.gv()));
            } else {
                new StaticLayout(charSequence, n3Var.v(), Reader.READ_DONE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new i9(charSequence, n3Var, iArr);
        } finally {
            yt.x4.n3();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.y.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.y.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.y.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.y.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i5, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f5351s.getSpans(i, i5, cls) : (T[]) this.y.getSpans(i, i5, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.y.length();
    }

    @NonNull
    public n3 n3() {
        return this.f5352v;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i5, Class cls) {
        return this.y.nextSpanTransition(i, i5, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5351s.removeSpan(obj);
        } else {
            this.y.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i5, int i8) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5351s.setSpan(obj, i, i5, i8);
        } else {
            this.y.setSpan(obj, i, i5, i8);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i5) {
        return this.y.subSequence(i, i5);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.y.toString();
    }

    @Nullable
    public PrecomputedText zn() {
        if (v.y(this.y)) {
            return a.y(this.y);
        }
        return null;
    }

    public i9(@NonNull PrecomputedText precomputedText, @NonNull n3 n3Var) {
        this.y = y.y(precomputedText);
        this.f5352v = n3Var;
        this.f5350fb = null;
        this.f5351s = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f5353gv;

        @Nullable
        public final TextDirectionHeuristic n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final PrecomputedText.Params f5354v;

        @NonNull
        public final TextPaint y;
        public final int zn;

        public static class y {

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public int f5355gv;
            public TextDirectionHeuristic n3;

            @NonNull
            public final TextPaint y;
            public int zn;

            public y(@NonNull TextPaint textPaint) {
                this.y = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.zn = 1;
                    this.f5355gv = 1;
                } else {
                    this.f5355gv = 0;
                    this.zn = 0;
                }
                this.n3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public y gv(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.n3 = textDirectionHeuristic;
                return this;
            }

            public y n3(int i) {
                this.zn = i;
                return this;
            }

            @NonNull
            public n3 y() {
                return new n3(this.y, this.n3, this.zn, this.f5355gv);
            }

            public y zn(int i) {
                this.f5355gv = i;
                return this;
            }
        }

        public n3(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i5) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5354v = t.y(textPaint).setBreakStrategy(i).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f5354v = null;
            }
            this.y = textPaint;
            this.n3 = textDirectionHeuristic;
            this.zn = i;
            this.f5353gv = i5;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n3)) {
                return false;
            }
            n3 n3Var = (n3) obj;
            return y(n3Var) && this.n3 == n3Var.gv();
        }

        @Nullable
        public TextDirectionHeuristic gv() {
            return this.n3;
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? j5.zn.n3(Float.valueOf(this.y.getTextSize()), Float.valueOf(this.y.getTextScaleX()), Float.valueOf(this.y.getTextSkewX()), Float.valueOf(this.y.getLetterSpacing()), Integer.valueOf(this.y.getFlags()), this.y.getTextLocales(), this.y.getTypeface(), Boolean.valueOf(this.y.isElegantTextHeight()), this.n3, Integer.valueOf(this.zn), Integer.valueOf(this.f5353gv)) : j5.zn.n3(Float.valueOf(this.y.getTextSize()), Float.valueOf(this.y.getTextScaleX()), Float.valueOf(this.y.getTextSkewX()), Float.valueOf(this.y.getLetterSpacing()), Integer.valueOf(this.y.getFlags()), this.y.getTextLocale(), this.y.getTypeface(), Boolean.valueOf(this.y.isElegantTextHeight()), this.n3, Integer.valueOf(this.zn), Integer.valueOf(this.f5353gv));
        }

        public int n3() {
            return this.zn;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.y.getTextSize());
            sb.append(", textScaleX=" + this.y.getTextScaleX());
            sb.append(", textSkewX=" + this.y.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.y.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.y.isElegantTextHeight());
            if (i >= 24) {
                sb.append(", textLocale=" + this.y.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.y.getTextLocale());
            }
            sb.append(", typeface=" + this.y.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.y.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.n3);
            sb.append(", breakStrategy=" + this.zn);
            sb.append(", hyphenationFrequency=" + this.f5353gv);
            sb.append("}");
            return sb.toString();
        }

        @NonNull
        public TextPaint v() {
            return this.y;
        }

        public boolean y(@NonNull n3 n3Var) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.zn != n3Var.n3() || this.f5353gv != n3Var.zn())) || this.y.getTextSize() != n3Var.v().getTextSize() || this.y.getTextScaleX() != n3Var.v().getTextScaleX() || this.y.getTextSkewX() != n3Var.v().getTextSkewX() || this.y.getLetterSpacing() != n3Var.v().getLetterSpacing() || !TextUtils.equals(this.y.getFontFeatureSettings(), n3Var.v().getFontFeatureSettings()) || this.y.getFlags() != n3Var.v().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.y.getTextLocales().equals(n3Var.v().getTextLocales())) {
                    return false;
                }
            } else if (!this.y.getTextLocale().equals(n3Var.v().getTextLocale())) {
                return false;
            }
            return this.y.getTypeface() == null ? n3Var.v().getTypeface() == null : this.y.getTypeface().equals(n3Var.v().getTypeface());
        }

        public int zn() {
            return this.f5353gv;
        }

        public n3(@NonNull PrecomputedText.Params params) {
            this.y = params.getTextPaint();
            this.n3 = params.getTextDirection();
            this.zn = params.getBreakStrategy();
            this.f5353gv = params.getHyphenationFrequency();
            this.f5354v = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }

    public static class y {
        public static Spannable y(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
