package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.i9;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v5.x4;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i9 {
    @Override // com.google.android.exoplayer2.drm.i9
    public void a(@Nullable i9.n3 n3Var) {
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public di.n3 c5(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void f(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void fb(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void gv(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public boolean i9(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public i9.gv n3() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public void release() {
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public int s() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.i9
    @Nullable
    public byte[] t(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public i9.y tl(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public /* synthetic */ void v(byte[] bArr, gn gnVar) {
        x4.y(this, bArr, gnVar);
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public Map<String, String> y(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.i9
    public byte[] zn() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }
}
