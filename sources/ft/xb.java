package ft;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.s;
import ft.xb;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public final class xb implements ft.s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qj f5075f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    @Deprecated
    public final c5 f5076fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9 f5077p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fb f5078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gv f5079t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final s f5080v;

    @Deprecated
    public final v w;
    public final String y;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final xb f5073co = new zn().y();
    public static final String z = v0.ut.g3(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f5074r = v0.ut.g3(1);
    public static final String f3 = v0.ut.g3(2);
    public static final String n = v0.ut.g3(3);
    public static final String c = v0.ut.g3(4);
    public static final s.y<xb> d0 = new s.y() { // from class: ft.o0
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return xb.zn(bundle);
        }
    };

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5081a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Deprecated
        public final k4.r<Integer> f5082c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final byte[] f5083f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final boolean f5084fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Deprecated
        public final k4.i4<String, String> f5085gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final k4.r<Integer> f5086i9;

        @Deprecated
        public final UUID n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f5087s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final k4.i4<String, String> f5088v;
        public final UUID y;

        @Nullable
        public final Uri zn;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.y.equals(aVar.y) && v0.ut.zn(this.zn, aVar.zn) && v0.ut.zn(this.f5088v, aVar.f5088v) && this.f5081a == aVar.f5081a && this.f5087s == aVar.f5087s && this.f5084fb == aVar.f5084fb && this.f5086i9.equals(aVar.f5086i9) && Arrays.equals(this.f5083f, aVar.f5083f);
        }

        public int hashCode() {
            int iHashCode = this.y.hashCode() * 31;
            Uri uri = this.zn;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f5088v.hashCode()) * 31) + (this.f5081a ? 1 : 0)) * 31) + (this.f5087s ? 1 : 0)) * 31) + (this.f5084fb ? 1 : 0)) * 31) + this.f5086i9.hashCode()) * 31) + Arrays.hashCode(this.f5083f);
        }

        public y n3() {
            return new y();
        }

        @Nullable
        public byte[] zn() {
            byte[] bArr = this.f5083f;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public static final class y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f5089a;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public k4.r<Integer> f5090fb;

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public boolean f5091gv;

            @Nullable
            public Uri n3;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            @Nullable
            public byte[] f5092s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public boolean f5093v;

            @Nullable
            public UUID y;
            public k4.i4<String, String> zn;

            public a c5() {
                return new a(this);
            }

            @Deprecated
            public y() {
                this.zn = k4.i4.f3();
                this.f5090fb = k4.r.yt();
            }

            public y(a aVar) {
                this.y = aVar.y;
                this.n3 = aVar.zn;
                this.zn = aVar.f5088v;
                this.f5091gv = aVar.f5081a;
                this.f5093v = aVar.f5084fb;
                this.f5089a = aVar.f5087s;
                this.f5090fb = aVar.f5086i9;
                this.f5092s = aVar.f5083f;
            }
        }

        public a(y yVar) {
            v0.y.fb((yVar.f5089a && yVar.n3 == null) ? false : true);
            UUID uuid = (UUID) v0.y.v(yVar.y);
            this.y = uuid;
            this.n3 = uuid;
            this.zn = yVar.n3;
            this.f5085gv = yVar.zn;
            this.f5088v = yVar.zn;
            this.f5081a = yVar.f5091gv;
            this.f5087s = yVar.f5089a;
            this.f5084fb = yVar.f5093v;
            this.f5082c5 = yVar.f5090fb;
            this.f5086i9 = yVar.f5090fb;
            this.f5083f = yVar.f5092s != null ? Arrays.copyOf(yVar.f5092s, yVar.f5092s.length) : null;
        }
    }

    @Deprecated
    public static final class c5 extends s {
        public c5(Uri uri, @Nullable String str, @Nullable a aVar, @Nullable n3 n3Var, List<StreamKey> list, @Nullable String str2, k4.r<t> rVar, @Nullable Object obj) {
            super(uri, str, aVar, n3Var, list, str2, rVar, obj);
        }
    }

    @Deprecated
    public static final class f extends t {
        public f(t.y yVar) {
            super(yVar);
        }
    }

    public static final class fb implements ft.s {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f5098f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final long f5099fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float f5100s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f5101v;
        public final long y;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final fb f5097t = new y().a();
        public static final String w = v0.ut.g3(0);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f5095p = v0.ut.g3(1);

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public static final String f5094co = v0.ut.g3(2);
        public static final String z = v0.ut.g3(3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f5096r = v0.ut.g3(4);
        public static final s.y<fb> f3 = new s.y() { // from class: ft.ad
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return xb.fb.zn(bundle);
            }
        };

        public static final class y {

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public float f5102gv;
            public long n3;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public float f5103v;
            public long y;
            public long zn;

            public fb a() {
                return new fb(this);
            }

            public y c5(long j) {
                this.n3 = j;
                return this;
            }

            public y f(long j) {
                this.y = j;
                return this;
            }

            public y fb(long j) {
                this.zn = j;
                return this;
            }

            public y i9(float f3) {
                this.f5102gv = f3;
                return this;
            }

            public y s(float f3) {
                this.f5103v = f3;
                return this;
            }

            public y() {
                this.y = -9223372036854775807L;
                this.n3 = -9223372036854775807L;
                this.zn = -9223372036854775807L;
                this.f5102gv = -3.4028235E38f;
                this.f5103v = -3.4028235E38f;
            }

            public y(fb fbVar) {
                this.y = fbVar.y;
                this.n3 = fbVar.f5101v;
                this.zn = fbVar.f5099fb;
                this.f5102gv = fbVar.f5100s;
                this.f5103v = fbVar.f5098f;
            }
        }

        public static /* synthetic */ fb zn(Bundle bundle) {
            String str = w;
            fb fbVar = f5097t;
            return new fb(bundle.getLong(str, fbVar.y), bundle.getLong(f5095p, fbVar.f5101v), bundle.getLong(f5094co, fbVar.f5099fb), bundle.getFloat(z, fbVar.f5100s), bundle.getFloat(f5096r, fbVar.f5098f));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof fb)) {
                return false;
            }
            fb fbVar = (fb) obj;
            return this.y == fbVar.y && this.f5101v == fbVar.f5101v && this.f5099fb == fbVar.f5099fb && this.f5100s == fbVar.f5100s && this.f5098f == fbVar.f5098f;
        }

        public int hashCode() {
            long j = this.y;
            long j4 = this.f5101v;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j7 = this.f5099fb;
            int i5 = (i + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            float f4 = this.f5100s;
            int iFloatToIntBits = (i5 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f5098f;
            return iFloatToIntBits + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
        }

        public y n3() {
            return new y();
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.y;
            fb fbVar = f5097t;
            if (j != fbVar.y) {
                bundle.putLong(w, j);
            }
            long j4 = this.f5101v;
            if (j4 != fbVar.f5101v) {
                bundle.putLong(f5095p, j4);
            }
            long j7 = this.f5099fb;
            if (j7 != fbVar.f5099fb) {
                bundle.putLong(f5094co, j7);
            }
            float f4 = this.f5100s;
            if (f4 != fbVar.f5100s) {
                bundle.putFloat(z, f4);
            }
            float f5 = this.f5098f;
            if (f5 != fbVar.f5098f) {
                bundle.putFloat(f5096r, f5);
            }
            return bundle;
        }

        public fb(y yVar) {
            this(yVar.y, yVar.n3, yVar.zn, yVar.f5102gv, yVar.f5103v);
        }

        @Deprecated
        public fb(long j, long j4, long j7, float f4, float f5) {
            this.y = j;
            this.f5101v = j4;
            this.f5099fb = j7;
            this.f5100s = f4;
            this.f5098f = f5;
        }
    }

    public static class gv implements ft.s {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5108f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final boolean f5109fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f5110s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f5111v;
        public final long y;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final gv f5107t = new y().a();
        public static final String w = v0.ut.g3(0);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f5105p = v0.ut.g3(1);

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public static final String f5104co = v0.ut.g3(2);
        public static final String z = v0.ut.g3(3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f5106r = v0.ut.g3(4);
        public static final s.y<v> f3 = new s.y() { // from class: ft.wf
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return xb.gv.zn(bundle);
            }
        };

        public static final class y {

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public boolean f5112gv;
            public long n3;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public boolean f5113v;
            public long y;
            public boolean zn;

            public gv a() {
                return fb();
            }

            public y c5(boolean z) {
                this.f5112gv = z;
                return this;
            }

            public y f(long j) {
                v0.y.y(j >= 0);
                this.y = j;
                return this;
            }

            @Deprecated
            public v fb() {
                return new v(this);
            }

            public y i9(boolean z) {
                this.zn = z;
                return this;
            }

            public y s(long j) {
                v0.y.y(j == Long.MIN_VALUE || j >= 0);
                this.n3 = j;
                return this;
            }

            public y t(boolean z) {
                this.f5113v = z;
                return this;
            }

            public y() {
                this.n3 = Long.MIN_VALUE;
            }

            public y(gv gvVar) {
                this.y = gvVar.y;
                this.n3 = gvVar.f5111v;
                this.zn = gvVar.f5109fb;
                this.f5112gv = gvVar.f5110s;
                this.f5113v = gvVar.f5108f;
            }
        }

        public static /* synthetic */ v zn(Bundle bundle) {
            y yVar = new y();
            String str = w;
            gv gvVar = f5107t;
            return yVar.f(bundle.getLong(str, gvVar.y)).s(bundle.getLong(f5105p, gvVar.f5111v)).i9(bundle.getBoolean(f5104co, gvVar.f5109fb)).c5(bundle.getBoolean(z, gvVar.f5110s)).t(bundle.getBoolean(f5106r, gvVar.f5108f)).fb();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gv)) {
                return false;
            }
            gv gvVar = (gv) obj;
            return this.y == gvVar.y && this.f5111v == gvVar.f5111v && this.f5109fb == gvVar.f5109fb && this.f5110s == gvVar.f5110s && this.f5108f == gvVar.f5108f;
        }

        public int hashCode() {
            long j = this.y;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j4 = this.f5111v;
            return ((((((i + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f5109fb ? 1 : 0)) * 31) + (this.f5110s ? 1 : 0)) * 31) + (this.f5108f ? 1 : 0);
        }

        public y n3() {
            return new y();
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.y;
            gv gvVar = f5107t;
            if (j != gvVar.y) {
                bundle.putLong(w, j);
            }
            long j4 = this.f5111v;
            if (j4 != gvVar.f5111v) {
                bundle.putLong(f5105p, j4);
            }
            boolean z5 = this.f5109fb;
            if (z5 != gvVar.f5109fb) {
                bundle.putBoolean(f5104co, z5);
            }
            boolean z7 = this.f5110s;
            if (z7 != gvVar.f5110s) {
                bundle.putBoolean(z, z7);
            }
            boolean z8 = this.f5108f;
            if (z8 != gvVar.f5108f) {
                bundle.putBoolean(f5106r, z8);
            }
            return bundle;
        }

        public gv(y yVar) {
            this.y = yVar.y;
            this.f5111v = yVar.n3;
            this.f5109fb = yVar.zn;
            this.f5110s = yVar.f5112gv;
            this.f5108f = yVar.f5113v;
        }
    }

    public static final class i9 implements ft.s {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public final Bundle f5118fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final String f5119v;

        @Nullable
        public final Uri y;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final i9 f5116s = new y().gv();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f5114f = v0.ut.g3(0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f5117t = v0.ut.g3(1);
        public static final String w = v0.ut.g3(2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final s.y<i9> f5115p = new s.y() { // from class: ft.cy
            @Override // ft.s.y
            public final s fromBundle(Bundle bundle) {
                return xb.i9.n3(bundle);
            }
        };

        public static final class y {

            @Nullable
            public String n3;

            @Nullable
            public Uri y;

            @Nullable
            public Bundle zn;

            public y a(@Nullable Uri uri) {
                this.y = uri;
                return this;
            }

            public y fb(@Nullable String str) {
                this.n3 = str;
                return this;
            }

            public i9 gv() {
                return new i9(this);
            }

            public y v(@Nullable Bundle bundle) {
                this.zn = bundle;
                return this;
            }
        }

        public static /* synthetic */ i9 n3(Bundle bundle) {
            return new y().a((Uri) bundle.getParcelable(f5114f)).fb(bundle.getString(f5117t)).v(bundle.getBundle(w)).gv();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i9)) {
                return false;
            }
            i9 i9Var = (i9) obj;
            return v0.ut.zn(this.y, i9Var.y) && v0.ut.zn(this.f5119v, i9Var.f5119v);
        }

        public int hashCode() {
            Uri uri = this.y;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f5119v;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // ft.s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.y;
            if (uri != null) {
                bundle.putParcelable(f5114f, uri);
            }
            String str = this.f5119v;
            if (str != null) {
                bundle.putString(f5117t, str);
            }
            Bundle bundle2 = this.f5118fb;
            if (bundle2 != null) {
                bundle.putBundle(w, bundle2);
            }
            return bundle;
        }

        public i9(y yVar) {
            this.y = yVar.y;
            this.f5119v = yVar.n3;
            this.f5118fb = yVar.zn;
        }
    }

    public static final class n3 {
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k4.r<t> f5120a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Deprecated
        public final List<f> f5121fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final List<StreamKey> f5122gv;

        @Nullable
        public final String n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public final Object f5123s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final String f5124v;
        public final Uri y;

        @Nullable
        public final a zn;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.y.equals(sVar.y) && v0.ut.zn(this.n3, sVar.n3) && v0.ut.zn(this.zn, sVar.zn) && v0.ut.zn(null, null) && this.f5122gv.equals(sVar.f5122gv) && v0.ut.zn(this.f5124v, sVar.f5124v) && this.f5120a.equals(sVar.f5120a) && v0.ut.zn(this.f5123s, sVar.f5123s);
        }

        public int hashCode() {
            int iHashCode = this.y.hashCode() * 31;
            String str = this.n3;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.zn;
            int iHashCode3 = (((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 961) + this.f5122gv.hashCode()) * 31;
            String str2 = this.f5124v;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f5120a.hashCode()) * 31;
            Object obj = this.f5123s;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        public s(Uri uri, @Nullable String str, @Nullable a aVar, @Nullable n3 n3Var, List<StreamKey> list, @Nullable String str2, k4.r<t> rVar, @Nullable Object obj) {
            this.y = uri;
            this.n3 = str;
            this.zn = aVar;
            this.f5122gv = list;
            this.f5124v = str2;
            this.f5120a = rVar;
            r.y yVarN = k4.r.n();
            for (int i = 0; i < rVar.size(); i++) {
                yVarN.y(rVar.get(i).y().i9());
            }
            this.f5121fb = yVarN.f();
            this.f5123s = obj;
        }
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f5125a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public final String f5126fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f5127gv;

        @Nullable
        public final String n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f5128v;
        public final Uri y;

        @Nullable
        public final String zn;

        public static final class y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public String f5129a;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            @Nullable
            public String f5130fb;

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public int f5131gv;

            @Nullable
            public String n3;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f5132v;
            public Uri y;

            @Nullable
            public String zn;

            public t c5() {
                return new t(this);
            }

            public y f(@Nullable String str) {
                this.f5129a = str;
                return this;
            }

            public final f i9() {
                return new f(this);
            }

            public y t(@Nullable String str) {
                this.zn = str;
                return this;
            }

            public y tl(@Nullable String str) {
                this.n3 = str;
                return this;
            }

            public y wz(int i) {
                this.f5132v = i;
                return this;
            }

            public y xc(int i) {
                this.f5131gv = i;
                return this;
            }

            public y(Uri uri) {
                this.y = uri;
            }

            public y(t tVar) {
                this.y = tVar.y;
                this.n3 = tVar.n3;
                this.zn = tVar.zn;
                this.f5131gv = tVar.f5127gv;
                this.f5132v = tVar.f5128v;
                this.f5129a = tVar.f5125a;
                this.f5130fb = tVar.f5126fb;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.y.equals(tVar.y) && v0.ut.zn(this.n3, tVar.n3) && v0.ut.zn(this.zn, tVar.zn) && this.f5127gv == tVar.f5127gv && this.f5128v == tVar.f5128v && v0.ut.zn(this.f5125a, tVar.f5125a) && v0.ut.zn(this.f5126fb, tVar.f5126fb);
        }

        public int hashCode() {
            int iHashCode = this.y.hashCode() * 31;
            String str = this.n3;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.zn;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f5127gv) * 31) + this.f5128v) * 31;
            String str3 = this.f5125a;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f5126fb;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public y y() {
            return new y();
        }

        public t(y yVar) {
            this.y = yVar.y;
            this.n3 = yVar.n3;
            this.zn = yVar.zn;
            this.f5127gv = yVar.f5131gv;
            this.f5128v = yVar.f5132v;
            this.f5125a = yVar.f5129a;
            this.f5126fb = yVar.f5130fb;
        }
    }

    @Deprecated
    public static final class v extends gv {
        public static final v n = new gv.y().fb();

        public v(gv.y yVar) {
            super(yVar);
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<StreamKey> f5133a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Nullable
        public Object f5134c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public fb.y f5135f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public String f5136fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public gv.y f5137gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        @Nullable
        public qj f5138i9;

        @Nullable
        public Uri n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public k4.r<t> f5139s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public i9 f5140t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public a.y f5141v;

        @Nullable
        public String y;

        @Nullable
        public String zn;

        public zn a(List<t> list) {
            this.f5139s = k4.r.rz(list);
            return this;
        }

        public zn c5(@Nullable String str) {
            return s(str == null ? null : Uri.parse(str));
        }

        public zn fb(@Nullable Object obj) {
            this.f5134c5 = obj;
            return this;
        }

        public zn gv(String str) {
            this.y = (String) v0.y.v(str);
            return this;
        }

        public zn n3(@Nullable String str) {
            this.f5136fb = str;
            return this;
        }

        public zn s(@Nullable Uri uri) {
            this.n3 = uri;
            return this;
        }

        public zn v(@Nullable String str) {
            this.zn = str;
            return this;
        }

        public xb y() {
            c5 c5Var;
            v0.y.fb(this.f5141v.n3 == null || this.f5141v.y != null);
            Uri uri = this.n3;
            if (uri != null) {
                c5Var = new c5(uri, this.zn, this.f5141v.y != null ? this.f5141v.c5() : null, null, this.f5133a, this.f5136fb, this.f5139s, this.f5134c5);
            } else {
                c5Var = null;
            }
            String str = this.y;
            if (str == null) {
                str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            }
            String str2 = str;
            v vVarFb = this.f5137gv.fb();
            fb fbVarA = this.f5135f.a();
            qj qjVar = this.f5138i9;
            if (qjVar == null) {
                qjVar = qj.xg;
            }
            return new xb(str2, vVarFb, c5Var, fbVarA, qjVar, this.f5140t);
        }

        public zn zn(fb fbVar) {
            this.f5135f = fbVar.n3();
            return this;
        }

        public zn() {
            this.f5137gv = new gv.y();
            this.f5141v = new a.y();
            this.f5133a = Collections.emptyList();
            this.f5139s = k4.r.yt();
            this.f5135f = new fb.y();
            this.f5140t = i9.f5116s;
        }

        public zn(xb xbVar) {
            a.y yVar;
            this();
            this.f5137gv = xbVar.f5079t.n3();
            this.y = xbVar.y;
            this.f5138i9 = xbVar.f5075f;
            this.f5135f = xbVar.f5078s.n3();
            this.f5140t = xbVar.f5077p;
            s sVar = xbVar.f5080v;
            if (sVar != null) {
                this.f5136fb = sVar.f5124v;
                this.zn = sVar.n3;
                this.n3 = sVar.y;
                this.f5133a = sVar.f5122gv;
                this.f5139s = sVar.f5120a;
                this.f5134c5 = sVar.f5123s;
                a aVar = sVar.zn;
                if (aVar != null) {
                    yVar = aVar.n3();
                } else {
                    yVar = new a.y();
                }
                this.f5141v = yVar;
            }
        }
    }

    public static xb gv(String str) {
        return new zn().c5(str).y();
    }

    public static xb zn(Bundle bundle) {
        String str = (String) v0.y.v(bundle.getString(z, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING));
        Bundle bundle2 = bundle.getBundle(f5074r);
        fb fbVar = bundle2 == null ? fb.f5097t : (fb) fb.f3.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(f3);
        qj qjVar = bundle3 == null ? qj.xg : (qj) qj.f4985gq.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(n);
        v vVar = bundle4 == null ? v.n : (v) gv.f3.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(c);
        return new xb(str, vVar, null, fbVar, qjVar, bundle5 == null ? i9.f5116s : (i9) i9.f5115p.fromBundle(bundle5));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return v0.ut.zn(this.y, xbVar.y) && this.f5079t.equals(xbVar.f5079t) && v0.ut.zn(this.f5080v, xbVar.f5080v) && v0.ut.zn(this.f5078s, xbVar.f5078s) && v0.ut.zn(this.f5075f, xbVar.f5075f) && v0.ut.zn(this.f5077p, xbVar.f5077p);
    }

    public int hashCode() {
        int iHashCode = this.y.hashCode() * 31;
        s sVar = this.f5080v;
        return ((((((((iHashCode + (sVar != null ? sVar.hashCode() : 0)) * 31) + this.f5078s.hashCode()) * 31) + this.f5079t.hashCode()) * 31) + this.f5075f.hashCode()) * 31) + this.f5077p.hashCode();
    }

    public zn n3() {
        return new zn();
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (!this.y.equals(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING)) {
            bundle.putString(z, this.y);
        }
        if (!this.f5078s.equals(fb.f5097t)) {
            bundle.putBundle(f5074r, this.f5078s.toBundle());
        }
        if (!this.f5075f.equals(qj.xg)) {
            bundle.putBundle(f3, this.f5075f.toBundle());
        }
        if (!this.f5079t.equals(gv.f5107t)) {
            bundle.putBundle(n, this.f5079t.toBundle());
        }
        if (!this.f5077p.equals(i9.f5116s)) {
            bundle.putBundle(c, this.f5077p.toBundle());
        }
        return bundle;
    }

    public xb(String str, v vVar, @Nullable c5 c5Var, fb fbVar, qj qjVar, i9 i9Var) {
        this.y = str;
        this.f5080v = c5Var;
        this.f5076fb = c5Var;
        this.f5078s = fbVar;
        this.f5075f = qjVar;
        this.f5079t = vVar;
        this.w = vVar;
        this.f5077p = i9Var;
    }
}
