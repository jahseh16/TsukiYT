package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.fb;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import r0.p;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends r0.fb implements y, fb.n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1838a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public byte[] f1839fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1840s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f1841v;

    public i9(long j) {
        super(true);
        this.f1838a = j;
        this.f1841v = new LinkedBlockingQueue<>();
        this.f1839fb = new byte[0];
        this.f1840s = -1;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.fb.n3
    public void c5(byte[] bArr) {
        this.f1841v.add(bArr);
    }

    @Override // r0.tl
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y
    public int gv() {
        return this.f1840s;
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return null;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int iMin = Math.min(i5, this.f1839fb.length);
        System.arraycopy(this.f1839fb, 0, bArr, i, iMin);
        byte[] bArr2 = this.f1839fb;
        this.f1839fb = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i5) {
            return iMin;
        }
        try {
            byte[] bArrPoll = this.f1841v.poll(this.f1838a, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i5 - iMin, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f1839fb = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y
    public fb.n3 t() {
        return this;
    }

    @Override // r0.tl
    public long y(p pVar) {
        this.f1840s = pVar.y.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y
    public String zn() {
        v0.y.fb(this.f1840s != -1);
        return ut.rz("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f1840s), Integer.valueOf(this.f1840s + 1));
    }
}
