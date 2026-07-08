package mn;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.Nullable;
import ft.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ft.s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6688f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f6689fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public gv f6691t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6692v;
    public final int y;
    public static final v w = new C0132v().y();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f6686p = ut.g3(0);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final String f6685co = ut.g3(1);
    public static final String z = ut.g3(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f6687r = ut.g3(3);
    public static final String f3 = ut.g3(4);
    public static final s.y<v> n = new s.y() { // from class: mn.gv
        @Override // ft.s.y
        public final ft.s fromBundle(Bundle bundle) {
            return v.zn(bundle);
        }
    };

    public static final class gv {
        public final AudioAttributes y;

        public gv(v vVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(vVar.y).setFlags(vVar.f6692v).setUsage(vVar.f6689fb);
            int i = ut.y;
            if (i >= 29) {
                n3.y(usage, vVar.f6690s);
            }
            if (i >= 32) {
                zn.y(usage, vVar.f6688f);
            }
            this.y = usage.build();
        }
    }

    public static final class n3 {
        public static void y(AudioAttributes.Builder builder, int i) {
            cx.y.y(builder, i);
        }
    }

    /* JADX INFO: renamed from: mn.v$v, reason: collision with other inner class name */
    public static final class C0132v {
        public int y = 0;
        public int n3 = 0;
        public int zn = 1;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6693gv = 1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6694v = 0;

        public C0132v a(int i) {
            this.zn = i;
            return this;
        }

        public C0132v gv(int i) {
            this.n3 = i;
            return this;
        }

        public C0132v n3(int i) {
            this.f6693gv = i;
            return this;
        }

        public C0132v v(int i) {
            this.f6694v = i;
            return this;
        }

        public v y() {
            return new v(this.y, this.n3, this.zn, this.f6693gv, this.f6694v);
        }

        public C0132v zn(int i) {
            this.y = i;
            return this;
        }
    }

    public static final class zn {
        public static void y(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    public static /* synthetic */ v zn(Bundle bundle) {
        C0132v c0132v = new C0132v();
        String str = f6686p;
        if (bundle.containsKey(str)) {
            c0132v.zn(bundle.getInt(str));
        }
        String str2 = f6685co;
        if (bundle.containsKey(str2)) {
            c0132v.gv(bundle.getInt(str2));
        }
        String str3 = z;
        if (bundle.containsKey(str3)) {
            c0132v.a(bundle.getInt(str3));
        }
        String str4 = f6687r;
        if (bundle.containsKey(str4)) {
            c0132v.n3(bundle.getInt(str4));
        }
        String str5 = f3;
        if (bundle.containsKey(str5)) {
            c0132v.v(bundle.getInt(str5));
        }
        return c0132v.y();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.y == vVar.y && this.f6692v == vVar.f6692v && this.f6689fb == vVar.f6689fb && this.f6690s == vVar.f6690s && this.f6688f == vVar.f6688f;
    }

    public int hashCode() {
        return ((((((((527 + this.y) * 31) + this.f6692v) * 31) + this.f6689fb) * 31) + this.f6690s) * 31) + this.f6688f;
    }

    public gv n3() {
        if (this.f6691t == null) {
            this.f6691t = new gv();
        }
        return this.f6691t;
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6686p, this.y);
        bundle.putInt(f6685co, this.f6692v);
        bundle.putInt(z, this.f6689fb);
        bundle.putInt(f6687r, this.f6690s);
        bundle.putInt(f3, this.f6688f);
        return bundle;
    }

    public v(int i, int i5, int i8, int i10, int i11) {
        this.y = i;
        this.f6692v = i5;
        this.f6689fb = i8;
        this.f6690s = i10;
        this.f6688f = i11;
    }
}
