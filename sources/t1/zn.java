package t1;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class zn implements TypeEvaluator<Integer> {
    public static final zn y = new zn();

    @NonNull
    public static zn n3() {
        return y;
    }

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f3, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f4 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f5 = f4 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f4) * f3);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f3);
        float fPow6 = fPow3 + (f3 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f3), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f5 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
