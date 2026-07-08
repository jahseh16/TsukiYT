package com.google.android.exoplayer2.ui;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public interface y {
        void a(v vVar, long j);

        void y(v vVar, long j);

        void zn(v vVar, long j, boolean z);
    }

    long getPreferredUpdateDelay();

    void n3(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);

    void y(y yVar);
}
