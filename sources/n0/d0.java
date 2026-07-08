package n0;

import androidx.annotation.Nullable;
import java.util.List;
import ur.rs;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends zn {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final Object f6748c5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6749s;

    public d0(rs rsVar, int i, int i5) {
        this(rsVar, i, i5, 0, null);
    }

    @Override // n0.c
    public int co() {
        return this.f6749s;
    }

    @Override // n0.c
    @Nullable
    public Object i9() {
        return this.f6748c5;
    }

    @Override // n0.c
    public int n3() {
        return 0;
    }

    public d0(rs rsVar, int i, int i5, int i8, @Nullable Object obj) {
        super(rsVar, new int[]{i}, i5);
        this.f6749s = i8;
        this.f6748c5 = obj;
    }

    @Override // n0.c
    public void z(long j, long j4, long j7, List<? extends h6.wz> list, h6.xc[] xcVarArr) {
    }
}
