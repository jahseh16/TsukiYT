package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import o.ud;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f2762t = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2763f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f2764fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2765s;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f2766fb;

        public static class y implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void n3(@NonNull Parcel parcel) {
            this.f2766fb = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2766fb ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            n3(parcel);
        }
    }

    public class y extends qn.y {
        public y() {
        }

        public void a(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.a(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void fb(View view, @NonNull ud udVar) {
            super.fb(view, udVar);
            udVar.nf(CheckableImageButton.this.y());
            udVar.ra(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.fh);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f2764fb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        if (!this.f2764fb) {
            return super/*android.widget.ImageButton*/.onCreateDrawableState(i);
        }
        int[] iArr = f2762t;
        return View.mergeDrawableStates(super/*android.widget.ImageButton*/.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super/*android.widget.ImageButton*/.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super/*android.widget.ImageButton*/.onRestoreInstanceState(savedState.y());
        setChecked(savedState.f2766fb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super/*android.widget.ImageButton*/.onSaveInstanceState());
        savedState.f2766fb = this.f2764fb;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckable(boolean z) {
        if (this.f2765s != z) {
            this.f2765s = z;
            sendAccessibilityEvent(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f2765s || this.f2764fb == z) {
            return;
        }
        this.f2764fb = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f2763f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        if (this.f2763f) {
            super/*android.widget.ImageButton*/.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f2764fb);
    }

    public boolean y() {
        return this.f2765s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2765s = true;
        this.f2763f = true;
        ut.g3(this, new y());
    }
}
