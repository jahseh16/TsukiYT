package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.gv;
import com.google.android.exoplayer2.drm.v;
import ft.g;
import v5.mt;
import v5.ta;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    @Deprecated
    public static final a n3;
    public static final a y;

    public interface n3 {
        public static final n3 y = new n3() { // from class: v5.co
            @Override // com.google.android.exoplayer2.drm.a.n3
            public final void release() {
                z.y();
            }
        };

        void release();
    }

    static {
        y yVar = new y();
        y = yVar;
        n3 = yVar;
    }

    @Nullable
    gv gv(@Nullable v.y yVar, g gVar);

    void n3(Looper looper, gn gnVar);

    void prepare();

    void release();

    n3 y(@Nullable v.y yVar, g gVar);

    int zn(g gVar);

    public class y implements a {
        @Override // com.google.android.exoplayer2.drm.a
        @Nullable
        public gv gv(@Nullable v.y yVar, g gVar) {
            if (gVar.d0 == null) {
                return null;
            }
            return new c5(new gv.y(new ta(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.a
        public /* synthetic */ void prepare() {
            mt.n3(this);
        }

        @Override // com.google.android.exoplayer2.drm.a
        public /* synthetic */ void release() {
            mt.zn(this);
        }

        @Override // com.google.android.exoplayer2.drm.a
        public /* synthetic */ n3 y(v.y yVar, g gVar) {
            return mt.y(this, yVar, gVar);
        }

        @Override // com.google.android.exoplayer2.drm.a
        public int zn(g gVar) {
            return gVar.d0 != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.a
        public void n3(Looper looper, gn gnVar) {
        }
    }
}
