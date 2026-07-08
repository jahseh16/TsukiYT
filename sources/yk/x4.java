package yk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class x4 {

    @NonNull
    public androidx.work.impl.model.n3 n3;

    @NonNull
    public UUID y;

    @NonNull
    public Set<String> zn;

    public static abstract class y<B extends y<?, ?>, W extends x4> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Class<? extends ListenableWorker> f9347v;
        public androidx.work.impl.model.n3 zn;
        public boolean y = false;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public Set<String> f9346gv = new HashSet();
        public UUID n3 = UUID.randomUUID();

        public y(@NonNull Class<? extends ListenableWorker> cls) {
            this.f9347v = cls;
            this.zn = new androidx.work.impl.model.n3(this.n3.toString(), cls.getName());
            y(cls.getName());
        }

        @NonNull
        public final B a(@NonNull androidx.work.n3 n3Var) {
            this.zn.input = n3Var;
            return (B) gv();
        }

        @NonNull
        public abstract B gv();

        @NonNull
        public final W n3() {
            W w = (W) zn();
            n3 n3Var = this.zn.constraints;
            int i = Build.VERSION.SDK_INT;
            boolean z = (i >= 24 && n3Var.v()) || n3Var.a() || n3Var.fb() || (i >= 23 && n3Var.s());
            androidx.work.impl.model.n3 n3Var2 = this.zn;
            if (n3Var2.expedited) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (n3Var2.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.n3 = UUID.randomUUID();
            androidx.work.impl.model.n3 n3Var3 = new androidx.work.impl.model.n3(this.zn);
            this.zn = n3Var3;
            n3Var3.id = this.n3.toString();
            return w;
        }

        @NonNull
        public final B v(@NonNull n3 n3Var) {
            this.zn.constraints = n3Var;
            return (B) gv();
        }

        @NonNull
        public final B y(@NonNull String str) {
            this.f9346gv.add(str);
            return (B) gv();
        }

        @NonNull
        public abstract W zn();
    }

    public x4(@NonNull UUID uuid, @NonNull androidx.work.impl.model.n3 n3Var, @NonNull Set<String> set) {
        this.y = uuid;
        this.n3 = n3Var;
        this.zn = set;
    }

    @NonNull
    public Set<String> n3() {
        return this.zn;
    }

    @NonNull
    public String y() {
        return this.y.toString();
    }

    @NonNull
    public androidx.work.impl.model.n3 zn() {
        return this.n3;
    }
}
