package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new y();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public MediaDescription f205co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bitmap f206f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final CharSequence f207fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Uri f208p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uri f210t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CharSequence f211v;
    public final Bundle w;
    public final String y;

    public static final class gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f212a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public Bundle f213fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public CharSequence f214gv;
        public CharSequence n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Uri f215s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Bitmap f216v;
        public String y;
        public CharSequence zn;

        public gv a(@Nullable String str) {
            this.y = str;
            return this;
        }

        public gv c5(@Nullable CharSequence charSequence) {
            this.n3 = charSequence;
            return this;
        }

        public gv fb(@Nullable Uri uri) {
            this.f215s = uri;
            return this;
        }

        public gv gv(@Nullable Bitmap bitmap) {
            this.f216v = bitmap;
            return this;
        }

        public gv n3(@Nullable CharSequence charSequence) {
            this.f214gv = charSequence;
            return this;
        }

        public gv s(@Nullable CharSequence charSequence) {
            this.zn = charSequence;
            return this;
        }

        public gv v(@Nullable Uri uri) {
            this.f212a = uri;
            return this;
        }

        public MediaDescriptionCompat y() {
            return new MediaDescriptionCompat(this.y, this.n3, this.zn, this.f214gv, this.f216v, this.f212a, this.f213fb, this.f215s);
        }

        public gv zn(@Nullable Bundle bundle) {
            this.f213fb = bundle;
            return this;
        }
    }

    public static class n3 {
        @Nullable
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @Nullable
        public static CharSequence c5(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void f(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @Nullable
        public static String fb(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @Nullable
        public static Bundle gv(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static void i9(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static MediaDescription.Builder n3() {
            return new MediaDescription.Builder();
        }

        @Nullable
        public static CharSequence s(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static void t(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void tl(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @Nullable
        public static Bitmap v(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static void w(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        public static void wz(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        public static void xc(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static MediaDescription y(MediaDescription.Builder builder) {
            return builder.build();
        }

        @Nullable
        public static CharSequence zn(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }
    }

    public class y implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.y(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    }

    public static class zn {
        public static void n3(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }

        @Nullable
        public static Uri y(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.y = str;
        this.f211v = charSequence;
        this.f207fb = charSequence2;
        this.f209s = charSequence3;
        this.f206f = bitmap;
        this.f210t = uri;
        this.w = bundle;
        this.f208p = uri2;
    }

    public static MediaDescriptionCompat y(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        gv gvVar = new gv();
        MediaDescription mediaDescription = (MediaDescription) obj;
        gvVar.a(n3.fb(mediaDescription));
        gvVar.c5(n3.c5(mediaDescription));
        gvVar.s(n3.s(mediaDescription));
        gvVar.n3(n3.zn(mediaDescription));
        gvVar.gv(n3.v(mediaDescription));
        gvVar.v(n3.a(mediaDescription));
        Bundle bundleGv = n3.gv(mediaDescription);
        if (bundleGv != null) {
            bundleGv = MediaSessionCompat.p(bundleGv);
        }
        Uri uri = bundleGv != null ? (Uri) bundleGv.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleGv;
        } else if (!bundleGv.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleGv.size() != 2) {
            bundleGv.remove("android.support.v4.media.description.MEDIA_URI");
            bundleGv.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleGv;
        }
        gvVar.zn(bundle);
        if (uri != null) {
            gvVar.fb(uri);
        } else if (i >= 23) {
            gvVar.fb(zn.y(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatY = gvVar.y();
        mediaDescriptionCompatY.f205co = mediaDescription;
        return mediaDescriptionCompatY;
    }

    @Nullable
    public Uri c5() {
        return this.f208p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public CharSequence f() {
        return this.f211v;
    }

    public Object fb() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f205co;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i = Build.VERSION.SDK_INT;
        MediaDescription.Builder builderN3 = n3.n3();
        n3.wz(builderN3, this.y);
        n3.w(builderN3, this.f211v);
        n3.xc(builderN3, this.f207fb);
        n3.i9(builderN3, this.f209s);
        n3.t(builderN3, this.f206f);
        n3.tl(builderN3, this.f210t);
        if (i >= 23 || this.f208p == null) {
            n3.f(builderN3, this.w);
        } else {
            if (this.w == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.w);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f208p);
            n3.f(builderN3, bundle);
        }
        if (i >= 23) {
            zn.n3(builderN3, this.f208p);
        }
        MediaDescription mediaDescriptionY = n3.y(builderN3);
        this.f205co = mediaDescriptionY;
        return mediaDescriptionY;
    }

    @Nullable
    public Bitmap gv() {
        return this.f206f;
    }

    @Nullable
    public CharSequence i9() {
        return this.f207fb;
    }

    @Nullable
    public CharSequence n3() {
        return this.f209s;
    }

    @Nullable
    public String s() {
        return this.y;
    }

    public String toString() {
        return ((Object) this.f211v) + ", " + ((Object) this.f207fb) + ", " + ((Object) this.f209s);
    }

    @Nullable
    public Uri v() {
        return this.f210t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) fb()).writeToParcel(parcel, i);
    }

    @Nullable
    public Bundle zn() {
        return this.w;
    }
}
