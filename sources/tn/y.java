package tn;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public final int y;

    public static final class n3 extends y {
        public final d n3;

        public n3(int i, d dVar) {
            super(i);
            this.n3 = dVar;
        }
    }

    /* JADX INFO: renamed from: tn.y$y, reason: collision with other inner class name */
    public static final class C0180y extends y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final List<C0180y> f8315gv;
        public final long n3;
        public final List<n3> zn;

        public C0180y(int i, long j) {
            super(i);
            this.n3 = j;
            this.zn = new ArrayList();
            this.f8315gv = new ArrayList();
        }

        @Nullable
        public C0180y a(int i) {
            int size = this.f8315gv.size();
            for (int i5 = 0; i5 < size; i5++) {
                C0180y c0180y = this.f8315gv.get(i5);
                if (c0180y.y == i) {
                    return c0180y;
                }
            }
            return null;
        }

        @Nullable
        public n3 fb(int i) {
            int size = this.zn.size();
            for (int i5 = 0; i5 < size; i5++) {
                n3 n3Var = this.zn.get(i5);
                if (n3Var.y == i) {
                    return n3Var;
                }
            }
            return null;
        }

        public void gv(C0180y c0180y) {
            this.f8315gv.add(c0180y);
        }

        @Override // tn.y
        public String toString() {
            return y.y(this.y) + " leaves: " + Arrays.toString(this.zn.toArray()) + " containers: " + Arrays.toString(this.f8315gv.toArray());
        }

        public void v(n3 n3Var) {
            this.zn.add(n3Var);
        }
    }

    public y(int i) {
        this.y = i;
    }

    public static int n3(int i) {
        return i & 16777215;
    }

    public static String y(int i) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int zn(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return y(this.y);
    }
}
