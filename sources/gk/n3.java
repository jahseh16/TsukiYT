package gk;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import gk.y;
import java.util.Set;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n3 {
    public static boolean y(y.s sVar, MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
        if (mediaMetadataCompat == mediaMetadataCompat2) {
            return true;
        }
        if (mediaMetadataCompat.f() != mediaMetadataCompat2.f()) {
            return false;
        }
        Set<String> setI9 = mediaMetadataCompat.i9();
        Bundle bundleGv = mediaMetadataCompat.gv();
        Bundle bundleGv2 = mediaMetadataCompat2.gv();
        for (String str : setI9) {
            Object obj = bundleGv.get(str);
            Object obj2 = bundleGv2.get(str);
            if (obj != obj2) {
                if ((obj instanceof Bitmap) && (obj2 instanceof Bitmap)) {
                    if (!((Bitmap) obj).sameAs((Bitmap) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof RatingCompat) && (obj2 instanceof RatingCompat)) {
                    RatingCompat ratingCompat = (RatingCompat) obj;
                    RatingCompat ratingCompat2 = (RatingCompat) obj2;
                    if (ratingCompat.fb() != ratingCompat2.fb() || ratingCompat.s() != ratingCompat2.s() || ratingCompat.c5() != ratingCompat2.c5() || ratingCompat.n3() != ratingCompat2.n3() || ratingCompat.v() != ratingCompat2.v() || ratingCompat.gv() != ratingCompat2.gv()) {
                        return false;
                    }
                } else if (!ut.zn(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
