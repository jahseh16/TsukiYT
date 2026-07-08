package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0740Lx {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC0739Lw enumC0739Lw) {
        byte[] bArrDecode = Base64.decode(enumC0739Lw.A00(LD.A02), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap A02(EnumC0739Lw enumC0739Lw) {
        byte[] bArrDecode = Base64.decode(enumC0739Lw.A00(LD.A02), 0);
        return A00(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static Drawable A03(C1064Yn c1064Yn, EnumC0739Lw enumC0739Lw) {
        return new BitmapDrawable(c1064Yn.getResources(), A01(enumC0739Lw));
    }
}
