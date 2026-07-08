package ak1;

import hk1.en;
import hk1.jz;
import hk1.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.c;
import sj1.d0;
import sj1.n;
import sj1.rz;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements yj1.gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f150a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public volatile c5 f151gv;
    public final yj1.fb n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f152v;
    public final xj1.a y;
    public final a zn;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final y f148fb = new y(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List<String> f149s = tj1.gv.i4("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final List<String> f147c5 = tj1.gv.i4("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rz.y n3(z headerBlock, c protocol) throws IOException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            z.y yVar = new z.y();
            int size = headerBlock.size();
            yj1.f fVarY = null;
            int i = 0;
            while (i < size) {
                int i5 = i + 1;
                String strZn = headerBlock.zn(i);
                String strS = headerBlock.s(i);
                if (Intrinsics.areEqual(strZn, ":status")) {
                    fVarY = yj1.f.f9321gv.y(Intrinsics.stringPlus("HTTP/1.1 ", strS));
                } else if (!fb.f147c5.contains(strZn)) {
                    yVar.gv(strZn, strS);
                }
                i = i5;
            }
            if (fVarY != null) {
                return new rz.y().p(protocol).fb(fVarY.n3).wz(fVarY.zn).t(yVar.a());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public final List<zn> y(d0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            z zVarA = request.a();
            ArrayList arrayList = new ArrayList(zVarA.size() + 4);
            arrayList.add(new zn(zn.f193fb, request.s()));
            arrayList.add(new zn(zn.f196s, yj1.c5.y.zn(request.t())));
            String strGv = request.gv("Host");
            if (strGv != null) {
                arrayList.add(new zn(zn.f195i9, strGv));
            }
            arrayList.add(new zn(zn.f192c5, request.t().x4()));
            int size = zVarA.size();
            int i = 0;
            while (i < size) {
                int i5 = i + 1;
                String strZn = zVarA.zn(i);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strZn.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!fb.f149s.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(zVarA.s(i), "trailers"))) {
                    arrayList.add(new zn(lowerCase, zVarA.s(i)));
                }
                i = i5;
            }
            return arrayList;
        }

        public y() {
        }
    }

    public fb(n client, xj1.a connection, yj1.fb chain, a http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.y = connection;
        this.n3 = chain;
        this.zn = http2Connection;
        List<c> listRz = client.rz();
        c cVar = c.H2_PRIOR_KNOWLEDGE;
        this.f152v = listRz.contains(cVar) ? cVar : c.HTTP_2;
    }

    @Override // yj1.gv
    public rz.y a(boolean z) throws IOException {
        c5 c5Var = this.f151gv;
        Intrinsics.checkNotNull(c5Var);
        rz.y yVarN3 = f148fb.n3(c5Var.ta(), this.f152v);
        if (z && yVarN3.s() == 100) {
            return null;
        }
        return yVarN3;
    }

    @Override // yj1.gv
    public void cancel() {
        this.f150a = true;
        c5 c5Var = this.f151gv;
        if (c5Var == null) {
            return;
        }
        c5Var.a(n3.CANCEL);
    }

    @Override // yj1.gv
    public void fb() throws IOException {
        this.zn.flush();
    }

    @Override // yj1.gv
    public xj1.a gv() {
        return this.y;
    }

    @Override // yj1.gv
    public k n3(d0 request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        c5 c5Var = this.f151gv;
        Intrinsics.checkNotNull(c5Var);
        return c5Var.wz();
    }

    @Override // yj1.gv
    public en s(rz response) {
        Intrinsics.checkNotNullParameter(response, "response");
        c5 c5Var = this.f151gv;
        Intrinsics.checkNotNull(c5Var);
        return c5Var.w();
    }

    @Override // yj1.gv
    public long v(rz response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (yj1.v.zn(response)) {
            return tj1.gv.x4(response);
        }
        return 0L;
    }

    @Override // yj1.gv
    public void y() {
        c5 c5Var = this.f151gv;
        Intrinsics.checkNotNull(c5Var);
        c5Var.wz().close();
    }

    @Override // yj1.gv
    public void zn(d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f151gv != null) {
            return;
        }
        this.f151gv = this.zn.xb(f148fb.y(request), request.y() != null);
        if (this.f150a) {
            c5 c5Var = this.f151gv;
            Intrinsics.checkNotNull(c5Var);
            c5Var.a(n3.CANCEL);
            throw new IOException("Canceled");
        }
        c5 c5Var2 = this.f151gv;
        Intrinsics.checkNotNull(c5Var2);
        jz jzVarX4 = c5Var2.x4();
        long jC5 = this.n3.c5();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jzVarX4.s(jC5, timeUnit);
        c5 c5Var3 = this.f151gv;
        Intrinsics.checkNotNull(c5Var3);
        c5Var3.z6().s(this.n3.f(), timeUnit);
    }
}
