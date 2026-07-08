package di;

import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3196a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f3197c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3198f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f3199fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f3200gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f3201i9;
    public int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3203t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3204v;
    public int y;
    public int zn;

    public final void n3(long j, int i) {
        this.f3198f += j;
        this.f3203t += i;
    }

    public String toString() {
        return ut.rz("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.y), Integer.valueOf(this.n3), Integer.valueOf(this.zn), Integer.valueOf(this.f3200gv), Integer.valueOf(this.f3204v), Integer.valueOf(this.f3196a), Integer.valueOf(this.f3199fb), Integer.valueOf(this.f3202s), Integer.valueOf(this.f3197c5), Integer.valueOf(this.f3201i9), Long.valueOf(this.f3198f), Integer.valueOf(this.f3203t));
    }

    public void y(long j) {
        n3(j, 1);
    }

    public synchronized void zn() {
    }
}
