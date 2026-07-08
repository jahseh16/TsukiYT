package zh1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public static final x4 y = new x4();

    public final String n3(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            return y(bArrDigest);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final String y(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
