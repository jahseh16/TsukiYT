package c8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import ic.a;
import ic.i9;
import java.io.IOException;
import java.util.Map;
import uo.ta;

/* JADX INFO: loaded from: classes.dex */
public class n3 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Object f1415gv = new Object();
    public final String n3;

    @Nullable
    public final Context y;
    public final Map<String, ta> zn;

    public n3(Drawable.Callback callback, String str, uo.n3 n3Var, Map<String, ta> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.n3 = str;
        } else {
            this.n3 = str + '/';
        }
        this.zn = map;
        gv(n3Var);
        if (callback instanceof View) {
            this.y = ((View) callback).getContext().getApplicationContext();
        } else {
            this.y = null;
        }
    }

    public boolean n3(Context context) {
        return (context == null && this.y == null) || this.y.equals(context);
    }

    @Nullable
    public Bitmap y(String str) {
        ta taVar = this.zn.get(str);
        if (taVar == null) {
            return null;
        }
        Bitmap bitmapY = taVar.y();
        if (bitmapY != null) {
            return bitmapY;
        }
        Context context = this.y;
        if (context == null) {
            return null;
        }
        String strN3 = taVar.n3();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strN3.startsWith("data:") && strN3.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strN3.substring(strN3.indexOf(44) + 1), 0);
                return zn(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e4) {
                a.gv("data URL did not have correct base64 format.", e4);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.n3)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.n3 + strN3), null, options);
                if (bitmapDecodeStream != null) {
                    return zn(str, i9.t(bitmapDecodeStream, taVar.v(), taVar.zn()));
                }
                a.zn("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e5) {
                a.gv("Unable to decode image `" + str + "`.", e5);
                return null;
            }
        } catch (IOException e6) {
            a.gv("Unable to open asset.", e6);
            return null;
        }
    }

    public final Bitmap zn(String str, @Nullable Bitmap bitmap) {
        synchronized (f1415gv) {
            this.zn.get(str).a(bitmap);
        }
        return bitmap;
    }

    public void gv(@Nullable uo.n3 n3Var) {
    }
}
