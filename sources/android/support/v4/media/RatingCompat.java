package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Object f222fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f223v;
    public final int y;

    public static class n3 {
        public static boolean a(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating c5(int i, float f3) {
            return Rating.newStarRating(i, f3);
        }

        public static Rating f(int i) {
            return Rating.newUnratedRating(i);
        }

        public static Rating fb(boolean z) {
            return Rating.newHeartRating(z);
        }

        public static boolean gv(Rating rating) {
            return rating.hasHeart();
        }

        public static Rating i9(boolean z) {
            return Rating.newThumbRating(z);
        }

        public static int n3(Rating rating) {
            return rating.getRatingStyle();
        }

        public static Rating s(float f3) {
            return Rating.newPercentageRating(f3);
        }

        public static boolean v(Rating rating) {
            return rating.isRated();
        }

        public static float y(Rating rating) {
            return rating.getPercentRating();
        }

        public static float zn(Rating rating) {
            return rating.getStarRating();
        }
    }

    public class y implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    }

    public RatingCompat(int i, float f3) {
        this.y = i;
        this.f223v = f3;
    }

    public static RatingCompat f(float f3) {
        if (f3 >= 0.0f && f3 <= 100.0f) {
            return new RatingCompat(6, f3);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat i9(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static RatingCompat tl(int i, float f3) {
        float f4;
        if (i == 3) {
            f4 = 3.0f;
        } else if (i == 4) {
            f4 = 4.0f;
        } else {
            if (i != 5) {
                Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f4 = 5.0f;
        }
        if (f3 >= 0.0f && f3 <= f4) {
            return new RatingCompat(i, f3);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat wz(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static RatingCompat xc(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public static RatingCompat y(Object obj) {
        RatingCompat ratingCompatXc = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iN3 = n3.n3(rating);
            if (n3.v(rating)) {
                switch (iN3) {
                    case 1:
                        ratingCompatXc = i9(n3.gv(rating));
                        break;
                    case 2:
                        ratingCompatXc = wz(n3.a(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatXc = tl(iN3, n3.zn(rating));
                        break;
                    case 6:
                        ratingCompatXc = f(n3.y(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatXc = xc(iN3);
            }
            ratingCompatXc.f222fb = obj;
        }
        return ratingCompatXc;
    }

    public boolean c5() {
        return this.y == 2 && this.f223v == 1.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.y;
    }

    public boolean fb() {
        return this.y == 1 && this.f223v == 1.0f;
    }

    public int gv() {
        return this.y;
    }

    public float n3() {
        if (this.y == 6 && s()) {
            return this.f223v;
        }
        return -1.0f;
    }

    public boolean s() {
        return this.f223v >= 0.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.y);
        sb.append(" rating=");
        float f3 = this.f223v;
        sb.append(f3 < 0.0f ? "unrated" : String.valueOf(f3));
        return sb.toString();
    }

    public float v() {
        int i = this.y;
        if ((i == 3 || i == 4 || i == 5) && s()) {
            return this.f223v;
        }
        return -1.0f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeFloat(this.f223v);
    }

    public Object zn() {
        if (this.f222fb == null) {
            if (s()) {
                int i = this.y;
                switch (i) {
                    case 1:
                        this.f222fb = n3.fb(fb());
                        break;
                    case 2:
                        this.f222fb = n3.i9(c5());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f222fb = n3.c5(i, v());
                        break;
                    case 6:
                        this.f222fb = n3.s(n3());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f222fb = n3.f(this.y);
            }
        }
        return this.f222fb;
    }
}
