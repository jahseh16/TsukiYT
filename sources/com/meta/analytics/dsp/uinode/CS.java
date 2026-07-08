package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class CS {
    public static CR A00(int i, long[] jArr, int[] iArr, long j) {
        int chunkSamplesRemaining = 8192 / i;
        int iA04 = 0;
        for (int i5 : iArr) {
            iA04 += IF.A04(i5, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[iA04];
        int[] iArr2 = new int[iA04];
        int originalSampleIndex = 0;
        long[] timestamps = new long[iA04];
        int[] flags = new int[iA04];
        int i8 = 0;
        int bufferSampleCount = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int rechunkedSampleCount = iArr[i10];
            long j4 = jArr[i10];
            while (rechunkedSampleCount > 0) {
                int iMin = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j4;
                iArr2[bufferSampleCount] = i * iMin;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = ((long) i8) * j;
                flags[bufferSampleCount] = 1;
                j4 += (long) iArr2[bufferSampleCount];
                i8 += iMin;
                rechunkedSampleCount -= iMin;
                bufferSampleCount++;
            }
        }
        return new CR(jArr2, iArr2, originalSampleIndex, timestamps, flags, j * ((long) i8));
    }
}
