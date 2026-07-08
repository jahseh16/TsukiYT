package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Bundle f881fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f882s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f883v;
    public final String y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n3 f880f = new n3(null);
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new y();

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n3() {
        }
    }

    public static final class y implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }
    }

    public NavBackStackEntryState(zn entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.y = entry.a();
        this.f883v = entry.v().i9();
        this.f881fb = entry.zn();
        Bundle bundle = new Bundle();
        this.f882s = bundle;
        entry.i9(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String n3() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.y);
        parcel.writeInt(this.f883v);
        parcel.writeBundle(this.f881fb);
        parcel.writeBundle(this.f882s);
    }

    public final int y() {
        return this.f883v;
    }

    public final zn zn(Context context, s destination, s.n3 hostLifecycleState, v vVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f881fb;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return zn.d0.y(context, destination, bundle, hostLifecycleState, vVar, this.y, this.f882s);
    }

    public NavBackStackEntryState(Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String string = inParcel.readString();
        Intrinsics.checkNotNull(string);
        this.y = string;
        this.f883v = inParcel.readInt();
        this.f881fb = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Intrinsics.checkNotNull(bundle);
        this.f882s = bundle;
    }
}
