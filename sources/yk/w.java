package yk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import java.util.concurrent.TimeUnit;
import yk.x4;

/* JADX INFO: loaded from: classes.dex */
public final class w extends x4 {
    public w(y yVar) {
        super(yVar.n3, yVar.zn, yVar.f9346gv);
    }

    public static final class y extends x4.y<y, w> {
        public y(@NonNull Class<? extends ListenableWorker> cls, long j, @NonNull TimeUnit timeUnit) {
            super(cls);
            this.zn.v(timeUnit.toMillis(j));
        }

        @Override // yk.x4.y
        @NonNull
        /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
        public w zn() {
            if (this.y && Build.VERSION.SDK_INT >= 23 && this.zn.constraints.s()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (this.zn.expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new w(this);
        }

        @Override // yk.x4.y
        @NonNull
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public y gv() {
            return this;
        }
    }
}
