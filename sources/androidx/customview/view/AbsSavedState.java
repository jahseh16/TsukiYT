package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AbsSavedState f810v = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new y();

    public class y implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f810v;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.y, i);
    }

    @Nullable
    public final Parcelable y() {
        return this.y;
    }

    private AbsSavedState() {
        this.y = null;
    }

    public AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.y = parcelable == f810v ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.y = parcelable == null ? f810v : parcelable;
    }
}
