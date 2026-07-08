package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f276fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f277s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Intent f278v;
    public final IntentSender y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zn f275f = new zn(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new n3();

    public static final class n3 implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f279gv;
        public Intent n3;
        public final IntentSender y;
        public int zn;

        public y(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.y = intentSender;
        }

        public final y n3(Intent intent) {
            this.n3 = intent;
            return this;
        }

        public final IntentSenderRequest y() {
            return new IntentSenderRequest(this.y, this.n3, this.zn, this.f279gv);
        }

        public final y zn(int i, int i5) {
            this.f279gv = i;
            this.zn = i5;
            return this;
        }
    }

    public static final class zn {
        public /* synthetic */ zn(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public zn() {
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i5) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.y = intentSender;
        this.f278v = intent;
        this.f276fb = i;
        this.f277s = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final IntentSender gv() {
        return this.y;
    }

    public final int n3() {
        return this.f276fb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.y, i);
        dest.writeParcelable(this.f278v, i);
        dest.writeInt(this.f276fb);
        dest.writeInt(this.f277s);
    }

    public final Intent y() {
        return this.f278v;
    }

    public final int zn() {
        return this.f277s;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
