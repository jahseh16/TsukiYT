package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Intent f274v;
    public final int y;

    public class y implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(@NonNull Parcel parcel) {
            return new ActivityResult(parcel);
        }
    }

    public ActivityResult(int i, @Nullable Intent intent) {
        this.y = i;
        this.f274v = intent;
    }

    @NonNull
    public static String zn(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int n3() {
        return this.y;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + zn(this.y) + ", data=" + this.f274v + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeInt(this.f274v == null ? 0 : 1);
        Intent intent = this.f274v;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    @Nullable
    public Intent y() {
        return this.f274v;
    }

    public ActivityResult(Parcel parcel) {
        this.y = parcel.readInt();
        this.f274v = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
