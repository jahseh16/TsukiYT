package hx;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class x4 {
    public final com.google.android.exoplayer2.source.rtsp.v n3;
    public final int y;
    public final String zn;

    public x4(int i, com.google.android.exoplayer2.source.rtsp.v vVar, String str) {
        this.y = i;
        this.n3 = vVar;
        this.zn = str;
    }

    public x4(int i, com.google.android.exoplayer2.source.rtsp.v vVar) {
        this(i, vVar, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
    }
}
