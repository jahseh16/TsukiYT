package yj1;

import hk1.p;
import hk1.x;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.d0;
import sj1.fh;
import sj1.i4;
import sj1.mg;
import sj1.rz;
import sj1.tl;
import sj1.wz;
import sj1.x4;

/* JADX INFO: loaded from: classes.dex */
public final class y implements x4 {
    public final wz y;

    public y(wz cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.y = cookieJar;
    }

    @Override // sj1.x4
    public rz intercept(x4.y chain) throws IOException {
        mg mgVarY;
        Intrinsics.checkNotNullParameter(chain, "chain");
        d0 d0VarY = chain.y();
        d0.y yVarC5 = d0VarY.c5();
        fh fhVarY = d0VarY.y();
        if (fhVarY != null) {
            i4 i4VarContentType = fhVarY.contentType();
            if (i4VarContentType != null) {
                yVarC5.c5("Content-Type", i4VarContentType.toString());
            }
            long jContentLength = fhVarY.contentLength();
            if (jContentLength != -1) {
                yVarC5.c5("Content-Length", String.valueOf(jContentLength));
                yVarC5.xc("Transfer-Encoding");
            } else {
                yVarC5.c5("Transfer-Encoding", "chunked");
                yVarC5.xc("Content-Length");
            }
        }
        boolean z = false;
        if (d0VarY.gv("Host") == null) {
            yVarC5.c5("Host", tj1.gv.j(d0VarY.t(), false, 1, null));
        }
        if (d0VarY.gv("Connection") == null) {
            yVarC5.c5("Connection", "Keep-Alive");
        }
        if (d0VarY.gv("Accept-Encoding") == null && d0VarY.gv("Range") == null) {
            yVarC5.c5("Accept-Encoding", "gzip");
            z = true;
        }
        List<tl> listLoadForRequest = this.y.loadForRequest(d0VarY.t());
        if (!listLoadForRequest.isEmpty()) {
            yVarC5.c5("Cookie", y(listLoadForRequest));
        }
        if (d0VarY.gv("User-Agent") == null) {
            yVarC5.c5("User-Agent", "okhttp/4.10.0");
        }
        rz rzVarN3 = chain.n3(yVarC5.n3());
        v.fb(this.y, d0VarY.t(), rzVarN3.mg());
        rz.y yVarZ = rzVarN3.ej().z(d0VarY);
        if (z && StringsKt.equals("gzip", rz.c(rzVarN3, "Content-Encoding", null, 2, null), true) && v.zn(rzVarN3) && (mgVarY = rzVarN3.y()) != null) {
            p pVar = new p(mgVarY.source());
            yVarZ.t(rzVarN3.mg().v().c5("Content-Encoding").c5("Content-Length").a());
            yVarZ.n3(new s(rz.c(rzVarN3, "Content-Type", null, 2, null), -1L, x.gv(pVar)));
        }
        return yVarZ.zn();
    }

    public final String y(List<tl> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i5 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tl tlVar = (tl) obj;
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(tlVar.c5());
            sb.append('=');
            sb.append(tlVar.wz());
            i = i5;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
