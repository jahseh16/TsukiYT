package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import gn.zn;
import h.v;
import ic.a;
import ic.i9;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import uo.a8;
import uo.b;
import uo.d;
import uo.ej;
import uo.hw;
import uo.j5;
import uo.mg;
import uo.s;
import uo.ud;
import uo.vl;
import uo.w;
import uo.yt;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d<Throwable> f1442d = new d() { // from class: uo.v
        @Override // uo.d
        public final void onResult(Object obj) {
            LottieAnimationView.z((Throwable) obj);
        }
    };
    public static final String fh = "LottieAnimationView";

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f1443co;

    @Nullable
    public s d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mg f1444f;
    public final Set<ej> f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public d<Throwable> f1445fb;

    @Nullable
    public b<s> n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1446p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set<n3> f1447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f1449t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d<Throwable> f1450v;
    public int w;
    public final d<s> y;
    public boolean z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f1451f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public float f1452fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f1453s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1454t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1455v;
        public int w;
        public String y;

        public /* synthetic */ SavedState(Parcel parcel, y yVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.y);
            parcel.writeFloat(this.f1452fb);
            parcel.writeInt(this.f1453s ? 1 : 0);
            parcel.writeString(this.f1451f);
            parcel.writeInt(this.f1454t);
            parcel.writeInt(this.w);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.y = parcel.readString();
            this.f1452fb = parcel.readFloat();
            this.f1453s = parcel.readInt() == 1;
            this.f1451f = parcel.readString();
            this.f1454t = parcel.readInt();
            this.w = parcel.readInt();
        }
    }

    public enum n3 {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public class y implements d<Throwable> {
        public y() {
        }

        @Override // uo.d
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f1448s != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f1448s);
            }
            (LottieAnimationView.this.f1445fb == null ? LottieAnimationView.f1442d : LottieAnimationView.this.f1445fb).onResult(th);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new d() { // from class: uo.fb
            @Override // uo.d
            public final void onResult(Object obj) {
                this.y.setComposition((s) obj);
            }
        };
        this.f1450v = new y();
        this.f1448s = 0;
        this.f1444f = new mg();
        this.f1446p = false;
        this.f1443co = false;
        this.z = true;
        this.f1447r = new HashSet();
        this.f3 = new HashSet();
        w(attributeSet, R$attr.y);
    }

    private void setCompositionTask(b<s> bVar) {
        this.f1447r.add(n3.SET_ANIMATION);
        t();
        f();
        this.n = bVar.gv(this.y).zn(this.f1450v);
    }

    public static /* synthetic */ void z(Throwable th) {
        if (!i9.f(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        a.gv("Unable to load composition.", th);
    }

    public final void c() {
        boolean zP = p();
        setImageDrawable(null);
        setImageDrawable(this.f1444f);
        if (zP) {
            this.f1444f.rb();
        }
    }

    public <T> void c5(v vVar, T t3, zn<T> znVar) {
        this.f1444f.w(vVar, t3, znVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ a8 co(int i) throws Exception {
        return this.z ? w.r(getContext(), i) : w.x4(getContext(), i, null);
    }

    public final void d0(float f3, boolean z) {
        if (z) {
            this.f1447r.add(n3.SET_PROGRESS);
        }
        this.f1444f.w2(f3);
    }

    public final void f() {
        b<s> bVar = this.n;
        if (bVar != null) {
            bVar.i9(this.y);
            this.n.c5(this.f1450v);
        }
    }

    public void f3(InputStream inputStream, @Nullable String str) {
        setCompositionTask(w.wz(inputStream, str));
    }

    public boolean getClipToCompositionBounds() {
        return this.f1444f.ta();
    }

    @Nullable
    public s getComposition() {
        return this.d0;
    }

    public long getDuration() {
        s sVar = this.d0;
        if (sVar != null) {
            return (long) sVar.gv();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f1444f.ud();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f1444f.x();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f1444f.k5();
    }

    public float getMaxFrame() {
        return this.f1444f.yt();
    }

    public float getMinFrame() {
        return this.f1444f.vl();
    }

    @Nullable
    public yt getPerformanceTracker() {
        return this.f1444f.hw();
    }

    public float getProgress() {
        return this.f1444f.j5();
    }

    public vl getRenderMode() {
        return this.f1444f.qn();
    }

    public int getRepeatCount() {
        return this.f1444f.o();
    }

    public int getRepeatMode() {
        return this.f1444f.j();
    }

    public float getSpeed() {
        return this.f1444f.oz();
    }

    public void i4() {
        this.f1447r.add(n3.PLAY_OPTION);
        this.f1444f.rb();
    }

    public void i9() {
        this.f1447r.add(n3.PLAY_OPTION);
        this.f1444f.co();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void invalidate() {
        super/*android.widget.ImageView*/.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof mg) && ((mg) drawable).qn() == vl.SOFTWARE) {
            this.f1444f.invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        mg mgVar = this.f1444f;
        if (drawable2 == mgVar) {
            super/*android.widget.ImageView*/.invalidateDrawable(mgVar);
        } else {
            super/*android.widget.ImageView*/.invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ a8 mt(String str) throws Exception {
        return this.z ? w.t(getContext(), str) : w.tl(getContext(), str, null);
    }

    public void n(String str, @Nullable String str2) {
        f3(new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.ImageView*/.onAttachedToWindow();
        if (isInEditMode() || !this.f1443co) {
            return;
        }
        this.f1444f.yg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super/*android.widget.ImageView*/.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super/*android.widget.ImageView*/.onRestoreInstanceState(savedState.getSuperState());
        this.f1449t = savedState.y;
        Set<n3> set = this.f1447r;
        n3 n3Var = n3.SET_ANIMATION;
        if (!set.contains(n3Var) && !TextUtils.isEmpty(this.f1449t)) {
            setAnimation(this.f1449t);
        }
        this.w = savedState.f1455v;
        if (!this.f1447r.contains(n3Var) && (i = this.w) != 0) {
            setAnimation(i);
        }
        if (!this.f1447r.contains(n3.SET_PROGRESS)) {
            d0(savedState.f1452fb, false);
        }
        if (!this.f1447r.contains(n3.PLAY_OPTION) && savedState.f1453s) {
            x4();
        }
        if (!this.f1447r.contains(n3.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f1451f);
        }
        if (!this.f1447r.contains(n3.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f1454t);
        }
        if (this.f1447r.contains(n3.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super/*android.widget.ImageView*/.onSaveInstanceState());
        savedState.y = this.f1449t;
        savedState.f1455v = this.w;
        savedState.f1452fb = this.f1444f.j5();
        savedState.f1453s = this.f1444f.en();
        savedState.f1451f = this.f1444f.x();
        savedState.f1454t = this.f1444f.j();
        savedState.w = this.f1444f.o();
        return savedState;
    }

    public boolean p() {
        return this.f1444f.f7();
    }

    public void r() {
        this.f1443co = false;
        this.f1444f.ap();
    }

    public void setAnimation(int i) {
        this.w = i;
        this.f1449t = null;
        setCompositionTask(xc(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        n(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.z ? w.i4(getContext(), str) : w.f3(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f1444f.m(z);
    }

    public void setCacheComposition(boolean z) {
        this.z = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f1444f.g(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setComposition(@NonNull s sVar) {
        if (uo.zn.y) {
            Log.v(fh, "Set Composition \n" + sVar);
        }
        this.f1444f.setCallback(this);
        this.d0 = sVar;
        this.f1446p = true;
        boolean zU0 = this.f1444f.u0(sVar);
        this.f1446p = false;
        if (getDrawable() != this.f1444f || zU0) {
            if (!zU0) {
                c();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<ej> it = this.f3.iterator();
            while (it.hasNext()) {
                it.next().y(sVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f1444f.bk(str);
    }

    public void setFailureListener(@Nullable d<Throwable> dVar) {
        this.f1445fb = dVar;
    }

    public void setFallbackResource(int i) {
        this.f1448s = i;
    }

    public void setFontAssetDelegate(uo.y yVar) {
        this.f1444f.y4(yVar);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.f1444f.tg(map);
    }

    public void setFrame(int i) {
        this.f1444f.pz(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f1444f.pq(z);
    }

    public void setImageAssetDelegate(uo.n3 n3Var) {
        this.f1444f.cr(n3Var);
    }

    public void setImageAssetsFolder(String str) {
        this.f1444f.o0(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        f();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        f();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        f();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f1444f.xb(z);
    }

    public void setMaxFrame(int i) {
        this.f1444f.wf(i);
    }

    public void setMaxProgress(float f3) {
        this.f1444f.cy(f3);
    }

    public void setMinAndMaxFrame(String str) {
        this.f1444f.qj(str);
    }

    public void setMinFrame(int i) {
        this.f1444f.l(i);
    }

    public void setMinProgress(float f3) {
        this.f1444f.vp(f3);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f1444f.oa(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f1444f.w9(z);
    }

    public void setProgress(float f3) {
        d0(f3, true);
    }

    public void setRenderMode(vl vlVar) {
        this.f1444f.x5(vlVar);
    }

    public void setRepeatCount(int i) {
        this.f1447r.add(n3.SET_REPEAT_COUNT);
        this.f1444f.q5(i);
    }

    public void setRepeatMode(int i) {
        this.f1447r.add(n3.SET_REPEAT_MODE);
        this.f1444f.mp(i);
    }

    public void setSafeMode(boolean z) {
        this.f1444f.le(z);
    }

    public void setSpeed(float f3) {
        this.f1444f.cs(f3);
    }

    public void setTextDelegate(j5 j5Var) {
        this.f1444f.ix(j5Var);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f1444f.yk(z);
    }

    public final void t() {
        this.d0 = null;
        this.f1444f.z();
    }

    public void tl(boolean z) {
        this.f1444f.n(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void unscheduleDrawable(Drawable drawable) {
        mg mgVar;
        if (!this.f1446p && drawable == (mgVar = this.f1444f) && mgVar.f7()) {
            r();
        } else if (!this.f1446p && (drawable instanceof mg)) {
            mg mgVar2 = (mg) drawable;
            if (mgVar2.f7()) {
                mgVar2.ap();
            }
        }
        super/*android.widget.ImageView*/.unscheduleDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(@Nullable AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.rz, i, 0);
        this.z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1486ta, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.f1472hw);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.f1492x);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(R$styleable.oz);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f1472hw, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.f1492x);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(R$styleable.oz)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f1462a8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.mg, false)) {
            this.f1443co = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1495yt, false)) {
            this.f1444f.q5(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.o)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(R$styleable.o, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.qn)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(R$styleable.qn, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.j)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(R$styleable.j, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f1466d)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1466d, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f1468ej)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(R$styleable.f1468ej));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R$styleable.f1477k5));
        d0(typedArrayObtainStyledAttributes.getFloat(R$styleable.vl, 0.0f), typedArrayObtainStyledAttributes.hasValue(R$styleable.vl));
        tl(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1488ud, false));
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f1496z6)) {
            c5(new v("**"), ud.f8455x, new zn(new hw(f.n3.zn(getContext(), typedArrayObtainStyledAttributes.getResourceId(R$styleable.f1496z6, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f1475j5)) {
            int i5 = R$styleable.f1475j5;
            vl vlVar = vl.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i5, vlVar.ordinal());
            if (iOrdinal >= vl.values().length) {
                iOrdinal = vlVar.ordinal();
            }
            setRenderMode(vl.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1463b, false));
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.f1489ut)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(R$styleable.f1489ut, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f1444f.ro(Boolean.valueOf(i9.a(getContext()) != 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b<s> wz(final String str) {
        return isInEditMode() ? new b<>(new Callable() { // from class: uo.gv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.y.mt(str);
            }
        }, true) : this.z ? w.i9(getContext(), str) : w.f(getContext(), str, null);
    }

    public void x4() {
        this.f1447r.add(n3.PLAY_OPTION);
        this.f1444f.yg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b<s> xc(final int i) {
        return isInEditMode() ? new b<>(new Callable() { // from class: uo.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.y.co(i);
            }
        }, true) : this.z ? w.co(getContext(), i) : w.z(getContext(), i, null);
    }

    public void setMaxFrame(String str) {
        this.f1444f.ad(str);
    }

    public void setMinFrame(String str) {
        this.f1444f.gq(str);
    }

    public void setAnimation(String str) {
        this.f1449t = str;
        this.w = 0;
        setCompositionTask(wz(str));
    }
}
