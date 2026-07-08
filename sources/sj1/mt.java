package sj1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.r;

/* JADX INFO: loaded from: classes.dex */
public final class mt extends fh {
    public final List<String> n3;
    public final List<String> y;
    public static final n3 zn = new n3(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final i4 f7956gv = i4.f7949v.y("application/x-www-form-urlencoded");

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n3() {
        }
    }

    public static final class y {
        public final List<String> n3;
        public final Charset y;
        public final List<String> zn;

        /* JADX WARN: Multi-variable type inference failed */
        public y() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final y n3(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = this.n3;
            r.n3 n3Var = r.f7991f;
            list.add(r.n3.n3(n3Var, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.y, 83, null));
            this.zn.add(r.n3.n3(n3Var, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.y, 83, null));
            return this;
        }

        public final y y(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = this.n3;
            r.n3 n3Var = r.f7991f;
            list.add(r.n3.n3(n3Var, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.y, 91, null));
            this.zn.add(r.n3.n3(n3Var, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.y, 91, null));
            return this;
        }

        public final mt zn() {
            return new mt(this.n3, this.zn);
        }

        public y(Charset charset) {
            this.y = charset;
            this.n3 = new ArrayList();
            this.zn = new ArrayList();
        }

        public /* synthetic */ y(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    public mt(List<String> encodedNames, List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.y = tj1.gv.oz(encodedNames);
        this.n3 = tj1.gv.oz(encodedValues);
    }

    public final long a(hk1.a aVar, boolean z) {
        hk1.v vVarZn;
        if (z) {
            vVarZn = new hk1.v();
        } else {
            Intrinsics.checkNotNull(aVar);
            vVarZn = aVar.zn();
        }
        int size = this.y.size();
        int i = 0;
        while (i < size) {
            int i5 = i + 1;
            if (i > 0) {
                vVarZn.tg(38);
            }
            vVarZn.vp(this.y.get(i));
            vVarZn.tg(61);
            vVarZn.vp(this.n3.get(i));
            i = i5;
        }
        if (!z) {
            return 0L;
        }
        long jLc = vVarZn.lc();
        vVarZn.t();
        return jLc;
    }

    @Override // sj1.fh
    public long contentLength() {
        return a(null, true);
    }

    @Override // sj1.fh
    public i4 contentType() {
        return f7956gv;
    }

    public final int gv() {
        return this.y.size();
    }

    public final String n3(int i) {
        return this.n3.get(i);
    }

    public final String v(int i) {
        return r.n3.s(r.f7991f, n3(i), 0, 0, true, 3, null);
    }

    @Override // sj1.fh
    public void writeTo(hk1.a sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }

    public final String y(int i) {
        return this.y.get(i);
    }

    public final String zn(int i) {
        return r.n3.s(r.f7991f, y(i), 0, 0, true, 3, null);
    }
}
