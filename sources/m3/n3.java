package m3;

import android.text.InputFilter;
import android.text.Spanned;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public class n3 implements InputFilter {
    public int y;

    public n3(int i) {
        this.y = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i5, Spanned spanned, int i8, int i10) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i8, i10, charSequence.subSequence(i, i5).toString());
            if (Integer.parseInt(sb.toString()) <= this.y) {
                return null;
            }
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        } catch (NumberFormatException unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
    }
}
