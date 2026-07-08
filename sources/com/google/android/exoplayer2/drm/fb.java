package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.n3;
import v0.ut;
import v5.rz;
import v5.ta;
import xq.xc;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    public static final class n3 {
        public static int n3(Throwable th) {
            return ut.q9(ut.k(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }

        public static boolean y(@Nullable Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }
    }

    public static final class y {
        public static boolean n3(@Nullable Throwable th) {
            return th instanceof NotProvisionedException;
        }

        public static boolean y(@Nullable Throwable th) {
            return th instanceof DeniedByServerException;
        }
    }

    public static final class zn {
        public static boolean y(@Nullable Throwable th) {
            return xc.y(th);
        }
    }

    public static int y(Exception exc, int i) {
        int i5 = ut.y;
        if (i5 >= 21 && n3.y(exc)) {
            return n3.n3(exc);
        }
        if (i5 >= 23 && zn.y(exc)) {
            return 6006;
        }
        if (i5 >= 18 && y.n3(exc)) {
            return 6002;
        }
        if (i5 >= 18 && y.y(exc)) {
            return 6007;
        }
        if (exc instanceof ta) {
            return 6001;
        }
        if (exc instanceof n3.v) {
            return 6003;
        }
        if (exc instanceof rz) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
