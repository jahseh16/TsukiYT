package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f249f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f250fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f251s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f252v;
    public int y;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.y = parcel.readInt();
        this.f250fb = parcel.readInt();
        this.f251s = parcel.readInt();
        this.f249f = parcel.readInt();
        this.f252v = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeInt(this.f250fb);
        parcel.writeInt(this.f251s);
        parcel.writeInt(this.f249f);
        parcel.writeInt(this.f252v);
    }
}
