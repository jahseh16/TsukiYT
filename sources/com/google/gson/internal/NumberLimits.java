package com.google.gson.internal;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class NumberLimits {
    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        y(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: " + str);
    }

    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        y(str);
        return new BigInteger(str);
    }

    public static void y(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }
}
