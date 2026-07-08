package yk;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface wz {

    @SuppressLint({"SyntheticAccessor"})
    public static final n3.C0201n3 n3;

    @SuppressLint({"SyntheticAccessor"})
    public static final n3.zn y;

    public static abstract class n3 {

        /* JADX INFO: renamed from: yk.wz$n3$n3, reason: collision with other inner class name */
        public static final class C0201n3 extends n3 {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0201n3() {
            }
        }

        public static final class y extends n3 {
            public final Throwable y;

            public y(@NonNull Throwable th) {
                this.y = th;
            }

            @NonNull
            public String toString() {
                return String.format("FAILURE (%s)", this.y.getMessage());
            }

            @NonNull
            public Throwable y() {
                return this.y;
            }
        }

        public static final class zn extends n3 {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            public zn() {
            }
        }
    }

    static {
        y = new n3.zn();
        n3 = new n3.C0201n3();
    }
}
