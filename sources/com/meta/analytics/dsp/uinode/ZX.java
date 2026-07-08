package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZX extends C03415a implements AdOptionsViewApi {
    public static byte[] A03;
    public static final int A04;
    public static final int A05;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{91, 108, 121, 102, 123, 125, 41, 72, 109};
    }

    static {
        A02();
        A04 = (int) (LD.A02 * 23.0f);
        A05 = (int) (LD.A02 * 4.0f);
    }

    public ZX(final Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        int i5;
        this.A02 = adOptionsView;
        final LinearLayout linearLayout = new LinearLayout(context);
        adOptionsView.addView(linearLayout);
        if (orientation == AdOptionsView.Orientation.HORIZONTAL) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        linearLayout.setOrientation(i5);
        ImageView imageViewA00 = A00(EnumC0739Lw.DEFAULT_INFO_ICON);
        this.A01 = imageViewA00;
        ImageView imageViewA002 = A00(EnumC0739Lw.AD_CHOICES_ICON);
        this.A00 = imageViewA002;
        imageViewA002.setContentDescription(A01(0, 9, 116));
        linearLayout.addView(imageViewA00);
        linearLayout.addView(imageViewA002);
        setIconSizeDp(i);
        setIconColor(-10459280);
        final V2 v2A0L = V2.A0L(nativeAdBase.getInternalNativeAd());
        v2A0L.A1S(nativeAdLayout);
        v2A0L.A1U(this);
        C1182bK c1182bKA0y = v2A0L.A0y();
        if (c1182bKA0y != null && c1182bKA0y.A0R() && !c1182bKA0y.A0P()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.5N
                public static String[] A04 = {"KRKQmCMMKryGk4zgpNIytFvS3TD6bAeJ", "Xc6miAmzcu08Y", "37gtSV6CsPxBYDJYgwQ03wIm04Bn1UoS", "vc4nNQQkh46pzBlyEmkoOi4CgZODKTHg", "arJKEayC0J1tSfFqlaoS22WOKdh4xl60", "Efttk19GyNCXlxxyYR0mavkkkhSaw2Qp", "IGlWio493rL8eTjetjpBhFYcUhZqKyAr", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING};

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    if (KL.A02(this)) {
                        return;
                    }
                    try {
                        v2A0L.A1I();
                        if (Build.VERSION.SDK_INT >= 16 && C0653Ih.A23(context)) {
                            linearLayout.performAccessibilityAction(128, null);
                        }
                    } catch (Throwable th) {
                        if (A04[5].charAt(5) == 'z') {
                            throw new RuntimeException();
                        }
                        A04[6] = "upfEaDqgYzKFHRA83M0GBorRIFZJY191";
                        KL.A00(th, this);
                    }
                }
            });
            LI.A04(adOptionsView, LI.A0B);
        }
    }

    public ZX(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(EnumC0739Lw enumC0739Lw) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i = A05;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(AbstractC0740Lx.A01(enumC0739Lw));
        return imageView;
    }

    public final void A03(EnumC0739Lw enumC0739Lw) {
        this.A01.setImageBitmap(AbstractC0740Lx.A01(enumC0739Lw));
    }

    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    public final void setIconColor(int i) {
        this.A01.setColorFilter(i);
        this.A00.setColorFilter(i);
    }

    public final void setIconSizeDp(int i) {
        int iconSize = Math.max(A04, (int) (LD.A02 * i));
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(iconSize, iconSize);
        this.A01.setLayoutParams(iconParams);
        this.A00.setLayoutParams(iconParams);
    }

    @Override // com.meta.analytics.dsp.uinode.C03415a
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    public final void setSingleIcon(boolean z) {
        AbstractC0731Lo.A0N(this.A01, z ? 8 : 0);
    }
}
