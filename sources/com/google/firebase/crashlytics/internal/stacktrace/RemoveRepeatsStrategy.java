package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {
    private final int maxRepetitions;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    private static boolean isRepeatingSequence(StackTraceElement[] stackTraceElementArr, int i, int i5) {
        int i8 = i5 - i;
        if (i5 + i8 > stackTraceElementArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            if (!stackTraceElementArr[i + i10].equals(stackTraceElementArr[i5 + i10])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] trimRepeats(StackTraceElement[] stackTraceElementArr, int i) {
        int i5;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i8 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i8 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i8];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !isRepeatingSequence(stackTraceElementArr, num.intValue(), i8)) {
                stackTraceElementArr2[i10] = stackTraceElementArr[i8];
                i10++;
                i5 = i8;
                i11 = 1;
            } else {
                int iIntValue = i8 - num.intValue();
                if (i11 < i) {
                    System.arraycopy(stackTraceElementArr, i8, stackTraceElementArr2, i10, iIntValue);
                    i10 += iIntValue;
                    i11++;
                }
                i5 = (iIntValue - 1) + i8;
            }
            map.put(stackTraceElement, Integer.valueOf(i8));
            i8 = i5 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i10);
        return stackTraceElementArr3;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrTrimRepeats = trimRepeats(stackTraceElementArr, this.maxRepetitions);
        return stackTraceElementArrTrimRepeats.length < stackTraceElementArr.length ? stackTraceElementArrTrimRepeats : stackTraceElementArr;
    }

    public RemoveRepeatsStrategy(int i) {
        this.maxRepetitions = i;
    }
}
