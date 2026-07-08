package com.meta.analytics.dsp.uinode;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02742j extends Drawable {
    public static InterfaceC02732i A0G;
    public static byte[] A0H;
    public static String[] A0I = {"YEFrjfwCEWu", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "GYovhjhdb5Je", "S1Fz", "LeiEw92n2EsObareFd", "xgqXw3gEiUgyln4SIM", "kGClknFKKNldAaaK4EgXWOsNKvCYjz7L", "I70UDyBH67pytg1dUxrP2KgAWNh3bG3K"};
    public static final double A0J;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public ColorStateList A04;
    public Paint A05;
    public Paint A06;
    public Path A08;
    public final RectF A0F;
    public boolean A0A = true;
    public boolean A09 = true;
    public boolean A0B = false;
    public final int A0E = 922746880;
    public final int A0D = 50331648;
    public final int A0C = AbstractC02692e.A09;
    public Paint A07 = new Paint(5);

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0I;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "Hial5Dc7DTVcebgm6Z";
            strArr2[4] = "T1onITFvXBLfXkfgru";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 69);
            i10++;
        }
    }

    public static void A05() {
        A0H = new byte[]{114, 124, 17, 41, 47, 40, 124, 62, 57, 124, 98, 97, 124, 108, 115, 84, 76, 91, 86, 83, 94, 26, 87, 91, 66, 26, 73, 82, 91, 94, 85, 77, 26, 73, 83, 64, 95, 26, 8, 47, 55, 32, 45, 40, 37, 97, 51, 32, 37, 40, 52, 50, 97, 1, 38, 62, 41, 36, 33, 44, 104, 59, 32, 41, 44, 39, 63, 104, 59, 33, 50, 45, 104};
    }

    static {
        A05();
        A0J = Math.cos(Math.toRadians(45.0d));
    }

    public C02742j(Resources resources, ColorStateList colorStateList, float f3, float f4, float f5) {
        A07(colorStateList);
        Paint paint = new Paint(5);
        this.A05 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A00 = (int) (0.5f + f3);
        this.A0F = new RectF();
        Paint paint2 = new Paint(this.A05);
        this.A06 = paint2;
        paint2.setAntiAlias(false);
        A06(f4, f5);
    }

    public static float A00(float f3, float f4, boolean z) {
        if (z) {
            double d4 = f3;
            if (A0I[2].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[5] = "P9aPeBSvznAhF57KLP";
            strArr[4] = "W3RUpaMuYeMV1XeTAU";
            return (float) (d4 + ((1.0d - A0J) * ((double) f4)));
        }
        return f3;
    }

    public static float A01(float f3, float f4, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f3)) + ((1.0d - A0J) * ((double) f4)));
        }
        return 1.5f * f3;
    }

    private int A02(float f3) {
        int i = (int) (0.5f + f3);
        if (i % 2 == 1) {
            int i5 = i - 1;
            String[] strArr = A0I;
            String str = strArr[0];
            String str2 = strArr[3];
            int length = str.length();
            int i8 = str2.length();
            if (length == i8) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "0g5GSSLFt9w";
            strArr2[3] = "EJV6";
            return i5;
        }
        return i;
    }

    private void A04() {
        float f3 = this.A00;
        RectF rectF = new RectF(-f3, -f3, f3, f3);
        RectF rectF2 = new RectF(rectF);
        float f4 = this.A03;
        rectF2.inset(-f4, -f4);
        Path path = this.A08;
        if (path == null) {
            this.A08 = new Path();
        } else {
            path.reset();
        }
        this.A08.setFillType(Path.FillType.EVEN_ODD);
        this.A08.moveTo(-this.A00, 0.0f);
        this.A08.rLineTo(-this.A03, 0.0f);
        this.A08.arcTo(rectF2, 180.0f, 90.0f, false);
        this.A08.arcTo(rectF, 270.0f, -90.0f, false);
        this.A08.close();
        float f5 = this.A00;
        float f7 = f5 / (this.A03 + f5);
        Paint paint = this.A05;
        float f8 = this.A03 + this.A00;
        int i = this.A0E;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i, i, this.A0D}, new float[]{0.0f, f7, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.A06;
        float f9 = this.A00;
        float startRatio = this.A03;
        float f10 = (-f9) + startRatio;
        float f11 = (-f9) - startRatio;
        int i5 = this.A0E;
        paint2.setShader(new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i5, i5, this.A0D}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.A06.setAntiAlias(false);
    }

    private void A06(float f3, float f4) {
        String strA03 = A03(0, 14, 25);
        if (f3 < 0.0f) {
            throw new IllegalArgumentException(A03(53, 20, 13) + f3 + strA03);
        }
        if (A0I[1].length() == 0) {
            A0I[2] = "3ZLq2wnsXXEHTe1p9";
            if (f4 >= 0.0f) {
                float fA02 = A02(f3);
                float fA022 = A02(f4);
                if (fA02 > fA022) {
                    fA02 = fA022;
                    if (!this.A0B) {
                        this.A0B = true;
                    }
                }
                if (this.A02 == fA02 && this.A01 == fA022) {
                    return;
                }
                this.A02 = fA02;
                this.A01 = fA022;
                float f5 = 1.5f * fA02;
                if (A0I[2].length() != 3) {
                    A0I[2] = "TJpNel9JPCCGijw6acwFd0iMJz";
                    this.A03 = (int) (f5 + this.A0C + 0.5f);
                    this.A0A = true;
                    invalidateSelf();
                    return;
                }
            } else {
                throw new IllegalArgumentException(A03(14, 24, 127) + f4 + strA03);
            }
        }
        throw new RuntimeException();
    }

    private void A07(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.A04 = colorStateList;
        Paint paint = this.A07;
        int[] state = getState();
        int defaultColor = this.A04.getDefaultColor();
        if (A0I[2].length() == 3) {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[0] = "VZiE9OVYqDu";
        strArr[3] = "EWr6";
        paint.setColor(colorStateList.getColorForState(state, defaultColor));
    }

    private void A08(Canvas canvas) {
        float f3 = this.A00;
        float f4 = (-f3) - this.A03;
        float edgeShadowTop = this.A0C;
        float f5 = f3 + edgeShadowTop;
        float edgeShadowTop2 = this.A02;
        float inset = f5 + (edgeShadowTop2 / 2.0f);
        float edgeShadowTop3 = inset * 2.0f;
        boolean z = this.A0F.width() - edgeShadowTop3 > 0.0f;
        float edgeShadowTop4 = inset * 2.0f;
        boolean z5 = this.A0F.height() - edgeShadowTop4 > 0.0f;
        int iSave = canvas.save();
        float f7 = this.A0F.left + inset;
        float edgeShadowTop5 = this.A0F.top;
        canvas.translate(f7, edgeShadowTop5 + inset);
        canvas.drawPath(this.A08, this.A05);
        if (z) {
            float edgeShadowTop6 = inset * 2.0f;
            float fWidth = this.A0F.width() - edgeShadowTop6;
            float edgeShadowTop7 = this.A00;
            canvas.drawRect(0.0f, f4, fWidth, -edgeShadowTop7, this.A06);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        float f8 = this.A0F.right - inset;
        float edgeShadowTop8 = this.A0F.bottom;
        canvas.translate(f8, edgeShadowTop8 - inset);
        canvas.rotate(180.0f);
        canvas.drawPath(this.A08, this.A05);
        if (z) {
            float edgeShadowTop9 = inset * 2.0f;
            float fWidth2 = this.A0F.width() - edgeShadowTop9;
            float edgeShadowTop10 = this.A00;
            float f9 = -edgeShadowTop10;
            float edgeShadowTop11 = this.A03;
            canvas.drawRect(0.0f, f4, fWidth2, f9 + edgeShadowTop11, this.A06);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        float f10 = this.A0F.left + inset;
        float edgeShadowTop12 = this.A0F.bottom;
        canvas.translate(f10, edgeShadowTop12 - inset);
        if (A0I[2].length() != 3) {
            A0I[2] = "QAUm";
            canvas.rotate(270.0f);
            canvas.drawPath(this.A08, this.A05);
            if (z5) {
                float edgeShadowTop13 = inset * 2.0f;
                float fHeight = this.A0F.height() - edgeShadowTop13;
                float edgeShadowTop14 = this.A00;
                canvas.drawRect(0.0f, f4, fHeight, -edgeShadowTop14, this.A06);
            }
            canvas.restoreToCount(iSave3);
            int iSave4 = canvas.save();
            float f11 = this.A0F.right - inset;
            float f12 = this.A0F.top;
            if (A0I[2].length() != 3) {
                A0I[2] = "4hs9knzgsM3vbS2";
                canvas.translate(f11, f12 + inset);
                canvas.rotate(90.0f);
                canvas.drawPath(this.A08, this.A05);
                if (z5) {
                    canvas.drawRect(0.0f, f4, this.A0F.height() - (2.0f * inset), -this.A00, this.A06);
                }
                canvas.restoreToCount(iSave4);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A09(Rect rect) {
        float f3 = this.A01 * 1.5f;
        RectF rectF = this.A0F;
        float f4 = rect.left;
        float verticalOffset = this.A01;
        float f5 = rect.right;
        float verticalOffset2 = this.A01;
        float f7 = f5 - verticalOffset2;
        float verticalOffset3 = rect.bottom;
        rectF.set(f4 + verticalOffset, rect.top + f3, f7, verticalOffset3 - f3);
        A04();
    }

    public final float A0A() {
        return this.A00;
    }

    public final float A0B() {
        return this.A01;
    }

    public final float A0C() {
        float f3 = this.A01;
        float fMax = Math.max(f3, this.A00 + this.A0C + ((f3 * 1.5f) / 2.0f)) * 2.0f;
        float f4 = this.A01 * 1.5f;
        float content = this.A0C;
        return ((f4 + content) * 2.0f) + fMax;
    }

    public final float A0D() {
        float f3 = this.A01;
        float fMax = Math.max(f3, this.A00 + this.A0C + (f3 / 2.0f)) * 2.0f;
        float f4 = this.A01;
        float content = this.A0C;
        return ((f4 + content) * 2.0f) + fMax;
    }

    public final float A0E() {
        return this.A02;
    }

    public final ColorStateList A0F() {
        return this.A04;
    }

    public final void A0G(float f3) {
        if (f3 >= 0.0f) {
            float f4 = (int) (0.5f + f3);
            if (this.A00 == f4) {
                return;
            }
            this.A00 = f4;
            this.A0A = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException(A03(38, 15, 4) + f3 + A03(0, 14, 25));
    }

    public final void A0H(float f3) {
        A06(this.A02, f3);
    }

    public final void A0I(float f3) {
        A06(f3, this.A01);
    }

    public final void A0J(ColorStateList colorStateList) {
        A07(colorStateList);
        invalidateSelf();
    }

    public final void A0K(Rect rect) {
        getPadding(rect);
    }

    public final void A0L(boolean z) {
        this.A09 = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A0A) {
            A09(getBounds());
            this.A0A = false;
        }
        canvas.translate(0.0f, this.A02 / 2.0f);
        A08(canvas);
        canvas.translate(0.0f, (-this.A02) / 2.0f);
        A0G.A5E(canvas, this.A0F, this.A00, this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(A01(this.A01, this.A00, this.A09));
        int vOffset = (int) Math.ceil(A00(this.A01, this.A00, this.A09));
        rect.set(vOffset, iCeil, vOffset, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.A04;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A0A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A04;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        int newColor = this.A07.getColor();
        if (newColor == colorForState) {
            return false;
        }
        this.A07.setColor(colorForState);
        this.A0A = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A05.setAlpha(i);
        this.A06.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
