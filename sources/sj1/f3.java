package sj1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.fh;
import sj1.i4;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends fh {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final i4 f7917c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i4 f7918f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final n3 f7919fb = new n3(null);

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final i4 f7920i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i4 f7921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i4 f7922t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final byte[] f7923tl;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final byte[] f7924wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final byte[] f7925xc;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final i4 f7926gv;
    public final i4 n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7927v;
    public final hk1.s y;
    public final List<zn> zn;

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void y(StringBuilder sb, String key) {
            Intrinsics.checkNotNullParameter(sb, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb.append('\"');
            int length = key.length();
            int i = 0;
            while (i < length) {
                int i5 = i + 1;
                char cCharAt = key.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
                i = i5;
            }
            sb.append('\"');
        }

        public n3() {
        }
    }

    public static final class y {
        public i4 n3;
        public final hk1.s y;
        public final List<zn> zn;

        /* JADX WARN: Multi-variable type inference failed */
        public y() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final y a(i4 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Intrinsics.areEqual(type.c5(), "multipart")) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("multipart != ", type).toString());
            }
            this.n3 = type;
            return this;
        }

        public final y gv(zn part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.zn.add(part);
            return this;
        }

        public final y n3(String name, String str, fh body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            gv(zn.zn.zn(name, str, body));
            return this;
        }

        public final f3 v() {
            if (this.zn.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new f3(this.y, this.n3, tj1.gv.oz(this.zn));
        }

        public final y y(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            gv(zn.zn.n3(name, value));
            return this;
        }

        public final y zn(z zVar, fh body) {
            Intrinsics.checkNotNullParameter(body, "body");
            gv(zn.zn.y(zVar, body));
            return this;
        }

        public y(String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.y = hk1.s.fb.gv(boundary);
            this.n3 = f3.f7921s;
            this.zn = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ y(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class zn {
        public static final y zn = new y(null);
        public final fh n3;
        public final z y;

        public static final class y {
            public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final zn n3(String name, String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return zn(name, null, fh.y.wz(fh.Companion, value, null, 1, null));
            }

            public final zn y(z zVar, fh body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((zVar == null ? null : zVar.y("Content-Type")) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((zVar == null ? null : zVar.y("Content-Length")) == null) {
                    return new zn(zVar, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final zn zn(String name, String str, fh body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                n3 n3Var = f3.f7919fb;
                n3Var.y(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    n3Var.y(sb, str);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return y(new z.y().v("Content-Disposition", string).a(), body);
            }

            public y() {
            }
        }

        public /* synthetic */ zn(z zVar, fh fhVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(zVar, fhVar);
        }

        public final z n3() {
            return this.y;
        }

        public final fh y() {
            return this.n3;
        }

        public zn(z zVar, fh fhVar) {
            this.y = zVar;
            this.n3 = fhVar;
        }
    }

    static {
        i4.y yVar = i4.f7949v;
        f7921s = yVar.y("multipart/mixed");
        f7917c5 = yVar.y("multipart/alternative");
        f7920i9 = yVar.y("multipart/digest");
        f7918f = yVar.y("multipart/parallel");
        f7922t = yVar.y("multipart/form-data");
        f7923tl = new byte[]{58, 32};
        f7924wz = new byte[]{13, 10};
        f7925xc = new byte[]{45, 45};
    }

    public f3(hk1.s boundaryByteString, i4 type, List<zn> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.y = boundaryByteString;
        this.n3 = type;
        this.zn = parts;
        this.f7926gv = i4.f7949v.y(type + "; boundary=" + y());
        this.f7927v = -1L;
    }

    private final long n3(hk1.a aVar, boolean z) throws IOException {
        hk1.a aVar2;
        if (z) {
            aVar = new hk1.v();
            aVar2 = aVar;
        } else {
            aVar2 = null;
        }
        int size = this.zn.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            int i5 = i + 1;
            zn znVar = this.zn.get(i);
            z zVarN3 = znVar.n3();
            fh fhVarY = znVar.y();
            Intrinsics.checkNotNull(aVar);
            aVar.write(f7925xc);
            aVar.ud(this.y);
            aVar.write(f7924wz);
            if (zVarN3 != null) {
                int size2 = zVarN3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    aVar.z(zVarN3.zn(i8)).write(f7923tl).z(zVarN3.s(i8)).write(f7924wz);
                }
            }
            i4 i4VarContentType = fhVarY.contentType();
            if (i4VarContentType != null) {
                aVar.z("Content-Type: ").z(i4VarContentType.toString()).write(f7924wz);
            }
            long jContentLength = fhVarY.contentLength();
            if (jContentLength != -1) {
                aVar.z("Content-Length: ").o(jContentLength).write(f7924wz);
            } else if (z) {
                Intrinsics.checkNotNull(aVar2);
                aVar2.t();
                return -1L;
            }
            byte[] bArr = f7924wz;
            aVar.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                fhVarY.writeTo(aVar);
            }
            aVar.write(bArr);
            i = i5;
        }
        Intrinsics.checkNotNull(aVar);
        byte[] bArr2 = f7925xc;
        aVar.write(bArr2);
        aVar.ud(this.y);
        aVar.write(bArr2);
        aVar.write(f7924wz);
        if (!z) {
            return j;
        }
        Intrinsics.checkNotNull(aVar2);
        long jLc = j + aVar2.lc();
        aVar2.t();
        return jLc;
    }

    @Override // sj1.fh
    public long contentLength() throws IOException {
        long j = this.f7927v;
        if (j != -1) {
            return j;
        }
        long jN3 = n3(null, true);
        this.f7927v = jN3;
        return jN3;
    }

    @Override // sj1.fh
    public i4 contentType() {
        return this.f7926gv;
    }

    @Override // sj1.fh
    public void writeTo(hk1.a sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        n3(sink, false);
    }

    public final String y() {
        return this.y.yg();
    }
}
