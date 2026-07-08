package vj1;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.d0;
import sj1.rz;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final y zn = new y(null);
    public final rz n3;
    public final d0 y;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Date f8844a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public long f8845c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f8846f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public String f8847fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public Date f8848gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public long f8849i9;
        public final d0 n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Date f8850s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8851t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f8852v;
        public final long y;
        public final rz zn;

        public n3(long j, d0 request, rz rzVar) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.y = j;
            this.n3 = request;
            this.zn = rzVar;
            this.f8851t = -1;
            if (rzVar != null) {
                this.f8845c5 = rzVar.jz();
                this.f8849i9 = rzVar.k();
                z zVarMg = rzVar.mg();
                int size = zVarMg.size();
                int i = 0;
                while (i < size) {
                    int i5 = i + 1;
                    String strZn = zVarMg.zn(i);
                    String strS = zVarMg.s(i);
                    if (StringsKt.equals(strZn, "Date", true)) {
                        this.f8848gv = yj1.zn.y(strS);
                        this.f8852v = strS;
                    } else if (StringsKt.equals(strZn, "Expires", true)) {
                        this.f8850s = yj1.zn.y(strS);
                    } else if (StringsKt.equals(strZn, "Last-Modified", true)) {
                        this.f8844a = yj1.zn.y(strS);
                        this.f8847fb = strS;
                    } else if (StringsKt.equals(strZn, "ETag", true)) {
                        this.f8846f = strS;
                    } else if (StringsKt.equals(strZn, "Age", true)) {
                        this.f8851t = tj1.gv.k(strS, -1);
                    }
                    i = i5;
                }
            }
        }

        public final boolean a() {
            rz rzVar = this.zn;
            Intrinsics.checkNotNull(rzVar);
            return rzVar.a().gv() == -1 && this.f8850s == null;
        }

        public final long gv() {
            Long lValueOf;
            rz rzVar = this.zn;
            Intrinsics.checkNotNull(rzVar);
            if (rzVar.a().gv() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.gv());
            }
            Date date = this.f8850s;
            if (date != null) {
                Date date2 = this.f8848gv;
                lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (lValueOf == null ? this.f8849i9 : lValueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f8844a == null || this.zn.f7().t().co() != null) {
                return 0L;
            }
            Date date3 = this.f8848gv;
            lValueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
            long jLongValue = lValueOf == null ? this.f8845c5 : lValueOf.longValue();
            Date date4 = this.f8844a;
            Intrinsics.checkNotNull(date4);
            long time2 = jLongValue - date4.getTime();
            if (time2 > 0) {
                return time2 / ((long) 10);
            }
            return 0L;
        }

        public final zn n3() {
            zn znVarZn = zn();
            return (znVarZn.n3() == null || !this.n3.n3().f()) ? znVarZn : new zn(null, null);
        }

        public final boolean v(d0 d0Var) {
            return (d0Var.gv("If-Modified-Since") == null && d0Var.gv("If-None-Match") == null) ? false : true;
        }

        public final long y() {
            Date date = this.f8848gv;
            long jMax = date != null ? Math.max(0L, this.f8849i9 - date.getTime()) : 0L;
            int i = this.f8851t;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f8849i9;
            return jMax + (j - this.f8845c5) + (this.y - j);
        }

        public final zn zn() {
            String str;
            if (this.zn == null) {
                return new zn(this.n3, null);
            }
            if (this.n3.fb() && this.zn.r() == null) {
                return new zn(this.n3, null);
            }
            if (!zn.zn.y(this.zn, this.n3)) {
                return new zn(this.n3, null);
            }
            sj1.gv gvVarN3 = this.n3.n3();
            if (gvVarN3.s() || v(this.n3)) {
                return new zn(this.n3, null);
            }
            sj1.gv gvVarA = this.zn.a();
            long jY = y();
            long jGv = gv();
            if (gvVarN3.gv() != -1) {
                jGv = Math.min(jGv, TimeUnit.SECONDS.toMillis(gvVarN3.gv()));
            }
            long millis = 0;
            long millis2 = gvVarN3.a() != -1 ? TimeUnit.SECONDS.toMillis(gvVarN3.a()) : 0L;
            if (!gvVarA.fb() && gvVarN3.v() != -1) {
                millis = TimeUnit.SECONDS.toMillis(gvVarN3.v());
            }
            if (!gvVarA.s()) {
                long j = millis2 + jY;
                if (j < millis + jGv) {
                    rz.y yVarEj = this.zn.ej();
                    if (j >= jGv) {
                        yVarEj.y("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jY > 86400000 && a()) {
                        yVarEj.y("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new zn(null, yVarEj.zn());
                }
            }
            String str2 = this.f8846f;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f8844a != null) {
                    str2 = this.f8847fb;
                } else {
                    if (this.f8848gv == null) {
                        return new zn(this.n3, null);
                    }
                    str2 = this.f8852v;
                }
                str = "If-Modified-Since";
            }
            z.y yVarV = this.n3.a().v();
            Intrinsics.checkNotNull(str2);
            yVarV.gv(str, str2);
            return new zn(this.n3.c5().i9(yVarV.a()).n3(), this.zn);
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean y(sj1.rz r5, sj1.d0 r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.p()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = sj1.rz.c(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                sj1.gv r0 = r5.a()
                int r0 = r0.gv()
                r1 = -1
                if (r0 != r1) goto L65
                sj1.gv r0 = r5.a()
                boolean r0 = r0.zn()
                if (r0 != 0) goto L65
                sj1.gv r0 = r5.a()
                boolean r0 = r0.n3()
                if (r0 != 0) goto L65
                return r2
            L65:
                sj1.gv r5 = r5.a()
                boolean r5 = r5.c5()
                if (r5 != 0) goto L7a
                sj1.gv r5 = r6.n3()
                boolean r5 = r5.c5()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: vj1.zn.y.y(sj1.rz, sj1.d0):boolean");
        }

        public y() {
        }
    }

    public zn(d0 d0Var, rz rzVar) {
        this.y = d0Var;
        this.n3 = rzVar;
    }

    public final d0 n3() {
        return this.y;
    }

    public final rz y() {
        return this.n3;
    }
}
