package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f217f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final x4.y<String, Integer> f218fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f220t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public MediaMetadata f221v;
    public final Bundle y;

    public static final class n3 {
        public final Bundle y = new Bundle();

        public n3 a(String str, CharSequence charSequence) {
            x4.y<String, Integer> yVar = MediaMetadataCompat.f218fb;
            if (!yVar.containsKey(str) || yVar.get(str).intValue() == 1) {
                this.y.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }

        public n3 gv(String str, RatingCompat ratingCompat) {
            x4.y<String, Integer> yVar = MediaMetadataCompat.f218fb;
            if (!yVar.containsKey(str) || yVar.get(str).intValue() == 3) {
                this.y.putParcelable(str, (Parcelable) ratingCompat.zn());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public n3 n3(String str, Bitmap bitmap) {
            x4.y<String, Integer> yVar = MediaMetadataCompat.f218fb;
            if (!yVar.containsKey(str) || yVar.get(str).intValue() == 2) {
                this.y.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public n3 v(String str, String str2) {
            x4.y<String, Integer> yVar = MediaMetadataCompat.f218fb;
            if (!yVar.containsKey(str) || yVar.get(str).intValue() == 1) {
                this.y.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public MediaMetadataCompat y() {
            return new MediaMetadataCompat(this.y);
        }

        public n3 zn(String str, long j) {
            x4.y<String, Integer> yVar = MediaMetadataCompat.f218fb;
            if (!yVar.containsKey(str) || yVar.get(str).intValue() == 0) {
                this.y.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }
    }

    public class y implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    }

    static {
        x4.y<String, Integer> yVar = new x4.y<>();
        f218fb = yVar;
        yVar.put("android.media.metadata.TITLE", 1);
        yVar.put("android.media.metadata.ARTIST", 1);
        yVar.put("android.media.metadata.DURATION", 0);
        yVar.put("android.media.metadata.ALBUM", 1);
        yVar.put("android.media.metadata.AUTHOR", 1);
        yVar.put("android.media.metadata.WRITER", 1);
        yVar.put("android.media.metadata.COMPOSER", 1);
        yVar.put("android.media.metadata.COMPILATION", 1);
        yVar.put("android.media.metadata.DATE", 1);
        yVar.put("android.media.metadata.YEAR", 0);
        yVar.put("android.media.metadata.GENRE", 1);
        yVar.put("android.media.metadata.TRACK_NUMBER", 0);
        yVar.put("android.media.metadata.NUM_TRACKS", 0);
        yVar.put("android.media.metadata.DISC_NUMBER", 0);
        yVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        yVar.put("android.media.metadata.ART", 2);
        yVar.put("android.media.metadata.ART_URI", 1);
        yVar.put("android.media.metadata.ALBUM_ART", 2);
        yVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        yVar.put("android.media.metadata.USER_RATING", 3);
        yVar.put("android.media.metadata.RATING", 3);
        yVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        yVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        yVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        yVar.put("android.media.metadata.DISPLAY_ICON", 2);
        yVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        yVar.put("android.media.metadata.MEDIA_ID", 1);
        yVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        yVar.put("android.media.metadata.MEDIA_URI", 1);
        yVar.put("android.media.metadata.ADVERTISEMENT", 0);
        yVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f219s = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f217f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f220t = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new y();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.y = bundle2;
        MediaSessionCompat.y(bundle2);
    }

    public static MediaMetadataCompat n3(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f221v = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    public CharSequence c5(String str) {
        return this.y.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return this.y.size();
    }

    public Object fb() {
        if (this.f221v == null) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.f221v = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f221v;
    }

    public Bundle gv() {
        return new Bundle(this.y);
    }

    public Set<String> i9() {
        return this.y.keySet();
    }

    public String s(String str) {
        CharSequence charSequence = this.y.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public long v(String str) {
        return this.y.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.y);
    }

    public boolean y(String str) {
        return this.y.containsKey(str);
    }

    public Bitmap zn(String str) {
        try {
            return (Bitmap) this.y.getParcelable(str);
        } catch (Exception e4) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e4);
            return null;
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
