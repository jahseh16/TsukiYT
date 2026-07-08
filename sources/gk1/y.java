package gk1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import hk1.fb;
import hk1.p;
import hk1.v;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import sj1.d0;
import sj1.fh;
import sj1.i4;
import sj1.i9;
import sj1.mg;
import sj1.rz;
import sj1.x4;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class y implements x4 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Charset f5237gv = Charset.forName("UTF-8");
    public final n3 y;
    public volatile Set<String> n3 = Collections.emptySet();
    public volatile EnumC0098y zn = EnumC0098y.NONE;

    public interface n3 {
        void log(String str);
    }

    /* JADX INFO: renamed from: gk1.y$y, reason: collision with other inner class name */
    public enum EnumC0098y {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public y(n3 n3Var) {
        this.y = n3Var;
    }

    public static boolean n3(v vVar) {
        try {
            v vVar2 = new v();
            vVar.f3(vVar2, 0L, vVar.lc() < 64 ? vVar.lc() : 64L);
            for (int i = 0; i < 16; i++) {
                if (vVar2.dm()) {
                    return true;
                }
                int iRs = vVar2.rs();
                if (Character.isISOControl(iRs) && !Character.isWhitespace(iRs)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean y(z zVar) {
        String strY = zVar.y("Content-Encoding");
        return (strY == null || strY.equalsIgnoreCase("identity") || strY.equalsIgnoreCase("gzip")) ? false : true;
    }

    public y gv(EnumC0098y enumC0098y) {
        if (enumC0098y == null) {
            throw new NullPointerException("level == null. Use Level.NONE instead.");
        }
        this.zn = enumC0098y;
        return this;
    }

    @Override // sj1.x4
    public rz intercept(x4.y yVar) throws Exception {
        long j;
        char c;
        String string;
        EnumC0098y enumC0098y = this.zn;
        d0 d0VarY = yVar.y();
        if (enumC0098y == EnumC0098y.NONE) {
            return yVar.n3(d0VarY);
        }
        boolean z = enumC0098y == EnumC0098y.BODY;
        boolean z5 = z || enumC0098y == EnumC0098y.HEADERS;
        fh fhVarY = d0VarY.y();
        boolean z7 = fhVarY != null;
        i9 i9VarZn = yVar.zn();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(d0VarY.s());
        sb.append(' ');
        sb.append(d0VarY.t());
        sb.append(i9VarZn != null ? " " + i9VarZn.y() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        String string2 = sb.toString();
        if (!z5 && z7) {
            string2 = string2 + " (" + fhVarY.contentLength() + "-byte body)";
        }
        this.y.log(string2);
        if (z5) {
            if (z7) {
                if (fhVarY.contentType() != null) {
                    this.y.log("Content-Type: " + fhVarY.contentType());
                }
                if (fhVarY.contentLength() != -1) {
                    this.y.log("Content-Length: " + fhVarY.contentLength());
                }
            }
            z zVarA = d0VarY.a();
            int size = zVarA.size();
            for (int i = 0; i < size; i++) {
                String strZn = zVarA.zn(i);
                if (!"Content-Type".equalsIgnoreCase(strZn) && !"Content-Length".equalsIgnoreCase(strZn)) {
                    zn(zVarA, i);
                }
            }
            if (!z || !z7) {
                this.y.log("--> END " + d0VarY.s());
            } else if (y(d0VarY.a())) {
                this.y.log("--> END " + d0VarY.s() + " (encoded body omitted)");
            } else {
                v vVar = new v();
                fhVarY.writeTo(vVar);
                Charset charsetZn = f5237gv;
                i4 i4VarContentType = fhVarY.contentType();
                if (i4VarContentType != null) {
                    charsetZn = i4VarContentType.zn(charsetZn);
                }
                this.y.log(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                if (n3(vVar)) {
                    this.y.log(vVar.ra(charsetZn));
                    this.y.log("--> END " + d0VarY.s() + " (" + fhVarY.contentLength() + "-byte body)");
                } else {
                    this.y.log("--> END " + d0VarY.s() + " (binary " + fhVarY.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            rz rzVarN3 = yVar.n3(d0VarY);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            mg mgVarY = rzVarN3.y();
            long jContentLength = mgVarY.contentLength();
            String str = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            n3 n3Var = this.y;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(rzVarN3.p());
            if (rzVarN3.ta().isEmpty()) {
                string = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                j = jContentLength;
                c = ' ';
            } else {
                StringBuilder sb3 = new StringBuilder();
                j = jContentLength;
                c = ' ';
                sb3.append(' ');
                sb3.append(rzVarN3.ta());
                string = sb3.toString();
            }
            sb2.append(string);
            sb2.append(c);
            sb2.append(rzVarN3.f7().t());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z5 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : ", " + str + " body");
            sb2.append(')');
            n3Var.log(sb2.toString());
            if (z5) {
                z zVarMg = rzVarN3.mg();
                int size2 = zVarMg.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    zn(zVarMg, i5);
                }
                if (!z || !yj1.v.y(rzVarN3)) {
                    this.y.log("<-- END HTTP");
                } else if (y(rzVarN3.mg())) {
                    this.y.log("<-- END HTTP (encoded body omitted)");
                } else {
                    fb fbVarSource = mgVarY.source();
                    fbVarSource.gv(Long.MAX_VALUE);
                    v vVarN3 = fbVarSource.n3();
                    p pVar = null;
                    if ("gzip".equalsIgnoreCase(zVarMg.y("Content-Encoding"))) {
                        p pVarValueOf = Long.valueOf(vVarN3.lc());
                        try {
                            p pVar2 = new p(vVarN3.w());
                            try {
                                vVarN3 = new v();
                                vVarN3.b(pVar2);
                                pVar2.close();
                                pVar = pVarValueOf;
                            } catch (Throwable th) {
                                th = th;
                                pVar = pVar2;
                                if (pVar != null) {
                                    pVar.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    Charset charsetZn2 = f5237gv;
                    i4 i4VarContentType2 = mgVarY.contentType();
                    if (i4VarContentType2 != null) {
                        charsetZn2 = i4VarContentType2.zn(charsetZn2);
                    }
                    if (!n3(vVarN3)) {
                        this.y.log(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                        this.y.log("<-- END HTTP (binary " + vVarN3.lc() + "-byte body omitted)");
                        return rzVarN3;
                    }
                    if (j != 0) {
                        this.y.log(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                        this.y.log(vVarN3.w().ra(charsetZn2));
                    }
                    if (pVar != null) {
                        this.y.log("<-- END HTTP (" + vVarN3.lc() + "-byte, " + pVar + "-gzipped-byte body)");
                    } else {
                        this.y.log("<-- END HTTP (" + vVarN3.lc() + "-byte body)");
                    }
                }
            }
            return rzVarN3;
        } catch (Exception e4) {
            this.y.log("<-- HTTP FAILED: " + e4);
            throw e4;
        }
    }

    public final void zn(z zVar, int i) {
        String strS = this.n3.contains(zVar.zn(i)) ? "██" : zVar.s(i);
        this.y.log(zVar.zn(i) + ": " + strS);
    }
}
