package b1;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public interface fh {

    public static class n3 implements fh {
        public final y n3;
        public final long y;

        public n3(long j) {
            this(j, 0L);
        }

        @Override // b1.fh
        public long c5() {
            return this.y;
        }

        @Override // b1.fh
        public boolean s() {
            return false;
        }

        @Override // b1.fh
        public y v(long j) {
            return this.n3;
        }

        public n3(long j, long j4) {
            this.y = j;
            this.n3 = new y(j4 == 0 ? rz.zn : new rz(0L, j4));
        }
    }

    public static final class y {
        public final rz n3;
        public final rz y;

        public y(rz rzVar) {
            this(rzVar, rzVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || y.class != obj.getClass()) {
                return false;
            }
            y yVar = (y) obj;
            return this.y.equals(yVar.y) && this.n3.equals(yVar.n3);
        }

        public int hashCode() {
            return (this.y.hashCode() * 31) + this.n3.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.y);
            if (this.y.equals(this.n3)) {
                str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            } else {
                str = ", " + this.n3;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public y(rz rzVar, rz rzVar2) {
            this.y = (rz) v0.y.v(rzVar);
            this.n3 = (rz) v0.y.v(rzVar2);
        }
    }

    long c5();

    boolean s();

    y v(long j);
}
