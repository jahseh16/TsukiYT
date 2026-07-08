package m4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final BigInteger y = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    public static final double n3 = Math.log(10.0d);
    public static final double zn = Math.log(2.0d);

    public static BigInteger y(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
