package lf;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.q;
import java.util.Collections;
import java.util.List;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public interface ud {

    public static final class gv {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6367gv;
        public final int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f6368v;
        public final String y;
        public final int zn;

        public gv(int i, int i5) {
            this(Integer.MIN_VALUE, i, i5);
        }

        public final void gv() {
            if (this.f6367gv == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public String n3() {
            gv();
            return this.f6368v;
        }

        public void y() {
            int i = this.f6367gv;
            this.f6367gv = i == Integer.MIN_VALUE ? this.n3 : i + this.zn;
            this.f6368v = this.y + this.f6367gv;
        }

        public int zn() {
            gv();
            return this.f6367gv;
        }

        public gv(int i, int i5, int i8) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            }
            this.y = str;
            this.n3 = i5;
            this.zn = i8;
            this.f6367gv = Integer.MIN_VALUE;
            this.f6368v = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
    }

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final byte[] f6369gv;

        @Nullable
        public final String n3;
        public final int y;
        public final List<y> zn;

        public n3(int i, @Nullable String str, @Nullable List<y> list, byte[] bArr) {
            this.y = i;
            this.n3 = str;
            this.zn = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f6369gv = bArr;
        }
    }

    public static final class y {
        public final int n3;
        public final String y;
        public final byte[] zn;

        public y(String str, int i, byte[] bArr) {
            this.y = str;
            this.n3 = i;
            this.zn = bArr;
        }
    }

    public interface zn {
        @Nullable
        ud n3(int i, n3 n3Var);

        SparseArray<ud> y();
    }

    void n3(hw hwVar, b1.wz wzVar, gv gvVar);

    void y(v0.d dVar, int i) throws q;

    void zn();
}
