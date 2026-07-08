package sj1;

import hk1.en;
import hk1.x;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class fh {
    public static final y Companion = new y(null);

    public static final class y {

        public static final class n3 extends fh {
            public final /* synthetic */ hk1.s n3;
            public final /* synthetic */ i4 y;

            public n3(i4 i4Var, hk1.s sVar) {
                this.y = i4Var;
                this.n3 = sVar;
            }

            @Override // sj1.fh
            public long contentLength() {
                return this.n3.ct();
            }

            @Override // sj1.fh
            public i4 contentType() {
                return this.y;
            }

            @Override // sj1.fh
            public void writeTo(hk1.a sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.ud(this.n3);
            }
        }

        /* JADX INFO: renamed from: sj1.fh$y$y, reason: collision with other inner class name */
        public static final class C0162y extends fh {
            public final /* synthetic */ File n3;
            public final /* synthetic */ i4 y;

            public C0162y(i4 i4Var, File file) {
                this.y = i4Var;
                this.n3 = file;
            }

            @Override // sj1.fh
            public long contentLength() {
                return this.n3.length();
            }

            @Override // sj1.fh
            public i4 contentType() {
                return this.y;
            }

            @Override // sj1.fh
            public void writeTo(hk1.a sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                en enVarI9 = x.i9(this.n3);
                try {
                    sink.b(enVarI9);
                    CloseableKt.closeFinally(enVarI9, null);
                } finally {
                }
            }
        }

        public static final class zn extends fh {

            /* JADX INFO: renamed from: gv, reason: collision with root package name */
            public final /* synthetic */ int f7929gv;
            public final /* synthetic */ int n3;
            public final /* synthetic */ i4 y;
            public final /* synthetic */ byte[] zn;

            public zn(i4 i4Var, int i, byte[] bArr, int i5) {
                this.y = i4Var;
                this.n3 = i;
                this.zn = bArr;
                this.f7929gv = i5;
            }

            @Override // sj1.fh
            public long contentLength() {
                return this.n3;
            }

            @Override // sj1.fh
            public i4 contentType() {
                return this.y;
            }

            @Override // sj1.fh
            public void writeTo(hk1.a sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.zn, this.f7929gv, this.n3);
            }
        }

        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ fh w(y yVar, byte[] bArr, i4 i4Var, int i, int i5, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i4Var = null;
            }
            if ((i8 & 2) != 0) {
                i = 0;
            }
            if ((i8 & 4) != 0) {
                i5 = bArr.length;
            }
            return yVar.tl(bArr, i4Var, i, i5);
        }

        public static /* synthetic */ fh wz(y yVar, String str, i4 i4Var, int i, Object obj) {
            if ((i & 1) != 0) {
                i4Var = null;
            }
            return yVar.zn(str, i4Var);
        }

        public static /* synthetic */ fh xc(y yVar, i4 i4Var, byte[] bArr, int i, int i5, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                i = 0;
            }
            if ((i8 & 8) != 0) {
                i5 = bArr.length;
            }
            return yVar.c5(i4Var, bArr, i, i5);
        }

        public final fh a(i4 i4Var, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return zn(content, i4Var);
        }

        public final fh c5(i4 i4Var, byte[] content, int i, int i5) {
            Intrinsics.checkNotNullParameter(content, "content");
            return tl(content, i4Var, i, i5);
        }

        public final fh f(byte[] bArr, i4 i4Var) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return w(this, bArr, i4Var, 0, 0, 6, null);
        }

        public final fh fb(i4 i4Var, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return xc(this, i4Var, content, 0, 0, 12, null);
        }

        public final fh gv(i4 i4Var, hk1.s content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return y(content, i4Var);
        }

        public final fh i9(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return w(this, bArr, null, 0, 0, 7, null);
        }

        public final fh n3(File file, i4 i4Var) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C0162y(i4Var, file);
        }

        public final fh s(i4 i4Var, byte[] content, int i) {
            Intrinsics.checkNotNullParameter(content, "content");
            return xc(this, i4Var, content, i, 0, 8, null);
        }

        public final fh t(byte[] bArr, i4 i4Var, int i) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return w(this, bArr, i4Var, i, 0, 4, null);
        }

        public final fh tl(byte[] bArr, i4 i4Var, int i, int i5) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            tj1.gv.t(bArr.length, i, i5);
            return new zn(i4Var, i5, bArr, i);
        }

        public final fh v(i4 i4Var, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return n3(file, i4Var);
        }

        public final fh y(hk1.s sVar, i4 i4Var) {
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            return new n3(i4Var, sVar);
        }

        public final fh zn(String str, i4 i4Var) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (i4Var != null) {
                Charset charsetGv = i4.gv(i4Var, null, 1, null);
                if (charsetGv == null) {
                    i4Var = i4.f7949v.n3(i4Var + "; charset=utf-8");
                } else {
                    charset = charsetGv;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return tl(bytes, i4Var, 0, bytes.length);
        }

        public y() {
        }
    }

    public static final fh create(hk1.s sVar, i4 i4Var) {
        return Companion.y(sVar, i4Var);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract i4 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(hk1.a aVar) throws IOException;

    public static final fh create(File file, i4 i4Var) {
        return Companion.n3(file, i4Var);
    }

    public static final fh create(String str, i4 i4Var) {
        return Companion.zn(str, i4Var);
    }

    public static final fh create(i4 i4Var, hk1.s sVar) {
        return Companion.gv(i4Var, sVar);
    }

    public static final fh create(i4 i4Var, File file) {
        return Companion.v(i4Var, file);
    }

    public static final fh create(i4 i4Var, String str) {
        return Companion.a(i4Var, str);
    }

    public static final fh create(i4 i4Var, byte[] bArr) {
        return Companion.fb(i4Var, bArr);
    }

    public static final fh create(i4 i4Var, byte[] bArr, int i) {
        return Companion.s(i4Var, bArr, i);
    }

    public static final fh create(i4 i4Var, byte[] bArr, int i, int i5) {
        return Companion.c5(i4Var, bArr, i, i5);
    }

    public static final fh create(byte[] bArr) {
        return Companion.i9(bArr);
    }

    public static final fh create(byte[] bArr, i4 i4Var) {
        return Companion.f(bArr, i4Var);
    }

    public static final fh create(byte[] bArr, i4 i4Var, int i) {
        return Companion.t(bArr, i4Var, i);
    }

    public static final fh create(byte[] bArr, i4 i4Var, int i, int i5) {
        return Companion.tl(bArr, i4Var, i, i5);
    }
}
