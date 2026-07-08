package w0;

import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements ft.s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8952f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f8953fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final byte[] f8954s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8955v;
    public final int y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zn f8951t = new zn(1, 2, 3, null);
    public static final String w = ut.g3(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f8949p = ut.g3(1);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final String f8948co = ut.g3(2);
    public static final String z = ut.g3(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s.y<zn> f8950r = new s.y() { // from class: w0.n3
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return zn.gv(bundle);
        }
    };

    public zn(int i, int i5, int i8, @Nullable byte[] bArr) {
        this.y = i;
        this.f8955v = i5;
        this.f8953fb = i8;
        this.f8954s = bArr;
    }

    public static /* synthetic */ zn gv(Bundle bundle) {
        return new zn(bundle.getInt(w, -1), bundle.getInt(f8949p, -1), bundle.getInt(f8948co, -1), bundle.getByteArray(z));
    }

    public static int n3(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zn(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zn.class != obj.getClass()) {
            return false;
        }
        zn znVar = (zn) obj;
        return this.y == znVar.y && this.f8955v == znVar.f8955v && this.f8953fb == znVar.f8953fb && Arrays.equals(this.f8954s, znVar.f8954s);
    }

    public int hashCode() {
        if (this.f8952f == 0) {
            this.f8952f = ((((((527 + this.y) * 31) + this.f8955v) * 31) + this.f8953fb) * 31) + Arrays.hashCode(this.f8954s);
        }
        return this.f8952f;
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(w, this.y);
        bundle.putInt(f8949p, this.f8955v);
        bundle.putInt(f8948co, this.f8953fb);
        bundle.putByteArray(z, this.f8954s);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.f8955v);
        sb.append(", ");
        sb.append(this.f8953fb);
        sb.append(", ");
        sb.append(this.f8954s != null);
        sb.append(")");
        return sb.toString();
    }
}
