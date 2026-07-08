package rc;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import rc.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class t<VH extends f> implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static AtomicLong f7748s = new AtomicLong(0);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Map<String, Object> f7749fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7750v;
    public fb y;

    public t() {
        this(f7748s.decrementAndGet());
    }

    @Override // rc.v
    public int a(@NonNull t tVar) {
        return this == tVar ? 0 : -1;
    }

    public void b(@NonNull VH vh, int i, @NonNull List<Object> list, @Nullable wz wzVar, @Nullable xc xcVar) {
        vh.zn(this, wzVar, xcVar);
        x(vh, i, list);
    }

    public void en(@Nullable Object obj) {
        fb fbVar = this.y;
        if (fbVar != null) {
            fbVar.c5(this, 0, obj);
        }
    }

    public boolean f7(@NonNull t tVar) {
        return o() == tVar.o() && hw() == tVar.hw();
    }

    @Override // rc.v
    @NonNull
    public t getItem(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("Wanted item at position " + i + " but an Item is a Group of size 1");
    }

    public long hw() {
        return this.f7750v;
    }

    public boolean j(@NonNull t tVar) {
        return equals(tVar);
    }

    public abstract int j5();

    public boolean k() {
        return true;
    }

    @NonNull
    public VH k5(@NonNull View view) {
        return (VH) new f(view);
    }

    public int o() {
        return j5();
    }

    public boolean oz() {
        return true;
    }

    public boolean q9() {
        return true;
    }

    @Override // rc.v
    public int r() {
        return 1;
    }

    @Override // rc.v
    public void t(@NonNull fb fbVar) {
        this.y = null;
    }

    public abstract void ud(@NonNull VH vh, int i);

    public void x(@NonNull VH vh, int i, @NonNull List<Object> list) {
        ud(vh, i);
    }

    public void x4() {
        fb fbVar = this.y;
        if (fbVar != null) {
            fbVar.xc(this, 0);
        }
    }

    public void y5(@NonNull VH vh) {
        vh.a();
    }

    @Nullable
    public Object yt(@NonNull t tVar) {
        return null;
    }

    @Override // rc.v
    public void zn(@NonNull fb fbVar) {
        this.y = fbVar;
    }

    public t(long j) {
        this.f7749fb = new HashMap();
        this.f7750v = j;
    }

    public void jz(@NonNull VH vh) {
    }

    public void u(@NonNull VH vh) {
    }

    public int qn(int i, int i5) {
        return i;
    }
}
