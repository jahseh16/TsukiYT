package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import yk.fb;
import yk.i4;
import yk.p;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public Executor f1091a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @NonNull
    public p f1092c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public br.y f1093fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public y f1094gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @NonNull
    public fb f1095i9;

    @NonNull
    public n3 n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public i4 f1096s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1097v;

    @NonNull
    public UUID y;

    @NonNull
    public Set<String> zn;

    public static class y {
        public Network zn;

        @NonNull
        public List<String> y = Collections.emptyList();

        @NonNull
        public List<Uri> n3 = Collections.emptyList();
    }

    public WorkerParameters(@NonNull UUID uuid, @NonNull n3 n3Var, @NonNull Collection<String> collection, @NonNull y yVar, int i, @NonNull Executor executor, @NonNull br.y yVar2, @NonNull i4 i4Var, @NonNull p pVar, @NonNull fb fbVar) {
        this.y = uuid;
        this.n3 = n3Var;
        this.zn = new HashSet(collection);
        this.f1094gv = yVar;
        this.f1097v = i;
        this.f1091a = executor;
        this.f1093fb = yVar2;
        this.f1096s = i4Var;
        this.f1092c5 = pVar;
        this.f1095i9 = fbVar;
    }

    @NonNull
    public p a() {
        return this.f1092c5;
    }

    @NonNull
    public br.y c5() {
        return this.f1093fb;
    }

    @NonNull
    public List<Uri> f() {
        return this.f1094gv.n3;
    }

    public int fb() {
        return this.f1097v;
    }

    @NonNull
    public n3 gv() {
        return this.n3;
    }

    @NonNull
    public List<String> i9() {
        return this.f1094gv.y;
    }

    @NonNull
    public fb n3() {
        return this.f1095i9;
    }

    @NonNull
    public Set<String> s() {
        return this.zn;
    }

    @NonNull
    public i4 t() {
        return this.f1096s;
    }

    @Nullable
    public Network v() {
        return this.f1094gv.zn;
    }

    @NonNull
    public Executor y() {
        return this.f1091a;
    }

    @NonNull
    public UUID zn() {
        return this.y;
    }
}
