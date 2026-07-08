package sj1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class mg implements Closeable {
    public static final n3 Companion = new n3(null);
    private Reader reader;

    public static final class n3 {

        public static final class y extends mg {

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public final /* synthetic */ hk1.fb f7951fb;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ long f7952v;
            public final /* synthetic */ i4 y;

            public y(i4 i4Var, long j, hk1.fb fbVar) {
                this.y = i4Var;
                this.f7952v = j;
                this.f7951fb = fbVar;
            }

            @Override // sj1.mg
            public long contentLength() {
                return this.f7952v;
            }

            @Override // sj1.mg
            public i4 contentType() {
                return this.y;
            }

            @Override // sj1.mg
            public hk1.fb source() {
                return this.f7951fb;
            }
        }

        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ mg c5(n3 n3Var, byte[] bArr, i4 i4Var, int i, Object obj) {
            if ((i & 1) != 0) {
                i4Var = null;
            }
            return n3Var.s(bArr, i4Var);
        }

        public final mg a(i4 i4Var, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return zn(content, i4Var);
        }

        public final mg fb(i4 i4Var, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return s(content, i4Var);
        }

        public final mg gv(i4 i4Var, long j, hk1.fb content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return y(content, i4Var, j);
        }

        public final mg n3(hk1.s sVar, i4 i4Var) {
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            return y(new hk1.v().m(sVar), i4Var, sVar.ct());
        }

        public final mg s(byte[] bArr, i4 i4Var) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return y(new hk1.v().u0(bArr), i4Var, bArr.length);
        }

        public final mg v(i4 i4Var, hk1.s content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return n3(content, i4Var);
        }

        public final mg y(hk1.fb fbVar, i4 i4Var, long j) {
            Intrinsics.checkNotNullParameter(fbVar, "<this>");
            return new y(i4Var, j, fbVar);
        }

        public final mg zn(String str, i4 i4Var) {
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
            hk1.v vVarGq = new hk1.v().gq(str, charset);
            return y(vVarGq, i4Var, vVarGq.lc());
        }

        public n3() {
        }
    }

    public static final class y extends Reader {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f7953fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Reader f7954s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Charset f7955v;
        public final hk1.fb y;

        public y(hk1.fb source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.y = source;
            this.f7955v = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.f7953fb = true;
            Reader reader = this.f7954s;
            if (reader == null) {
                unit = null;
            } else {
                reader.close();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.y.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i, int i5) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f7953fb) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f7954s;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.y.o0(), tj1.gv.a8(this.y, this.f7955v));
                this.f7954s = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i5);
        }
    }

    private final Charset charset() {
        i4 i4VarContentType = contentType();
        Charset charsetZn = i4VarContentType == null ? null : i4VarContentType.zn(Charsets.UTF_8);
        return charsetZn == null ? Charsets.UTF_8 : charsetZn;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Function1<? super hk1.fb, ? extends T> function1, Function1<? super T, Integer> function12) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        hk1.fb fbVarSource = source();
        try {
            T tInvoke = function1.invoke(fbVarSource);
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(fbVarSource, null);
            InlineMarker.finallyEnd(1);
            int iIntValue = function12.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    public static final mg create(hk1.fb fbVar, i4 i4Var, long j) {
        return Companion.y(fbVar, i4Var, j);
    }

    public final InputStream byteStream() {
        return source().o0();
    }

    public final hk1.s byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        hk1.fb fbVarSource = source();
        try {
            hk1.s sVarS8 = fbVarSource.s8();
            CloseableKt.closeFinally(fbVarSource, null);
            int iCt = sVarS8.ct();
            if (jContentLength == -1 || jContentLength == iCt) {
                return sVarS8;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iCt + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        hk1.fb fbVarSource = source();
        try {
            byte[] bArrY5 = fbVarSource.y5();
            CloseableKt.closeFinally(fbVarSource, null);
            int length = bArrY5.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrY5;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        y yVar = new y(source(), charset());
        this.reader = yVar;
        return yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        tj1.gv.tl(source());
    }

    public abstract long contentLength();

    public abstract i4 contentType();

    public abstract hk1.fb source();

    public final String string() throws IOException {
        hk1.fb fbVarSource = source();
        try {
            String strRa = fbVarSource.ra(tj1.gv.a8(fbVarSource, charset()));
            CloseableKt.closeFinally(fbVarSource, null);
            return strRa;
        } finally {
        }
    }

    public static final mg create(hk1.s sVar, i4 i4Var) {
        return Companion.n3(sVar, i4Var);
    }

    public static final mg create(String str, i4 i4Var) {
        return Companion.zn(str, i4Var);
    }

    public static final mg create(i4 i4Var, long j, hk1.fb fbVar) {
        return Companion.gv(i4Var, j, fbVar);
    }

    public static final mg create(i4 i4Var, hk1.s sVar) {
        return Companion.v(i4Var, sVar);
    }

    public static final mg create(i4 i4Var, String str) {
        return Companion.a(i4Var, str);
    }

    public static final mg create(i4 i4Var, byte[] bArr) {
        return Companion.fb(i4Var, bArr);
    }

    public static final mg create(byte[] bArr, i4 i4Var) {
        return Companion.s(bArr, i4Var);
    }
}
