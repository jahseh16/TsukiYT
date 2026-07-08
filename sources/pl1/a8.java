package pl1;

import java.io.IOException;
import java.util.regex.Pattern;
import sj1.d0;
import sj1.f3;
import sj1.mt;
import sj1.r;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final char[] f7294t = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final Pattern f7295tl = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z.y f7296a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public f3.y f7297c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sj1.fh f7298f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public sj1.i4 f7299fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public r.y f7300gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public mt.y f7301i9;
    public final sj1.r n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7302s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0.y f7303v = new d0.y();
    public final String y;
    public String zn;

    public static class y extends sj1.fh {
        public final sj1.i4 n3;
        public final sj1.fh y;

        public y(sj1.fh fhVar, sj1.i4 i4Var) {
            this.y = fhVar;
            this.n3 = i4Var;
        }

        @Override // sj1.fh
        public long contentLength() throws IOException {
            return this.y.contentLength();
        }

        @Override // sj1.fh
        public sj1.i4 contentType() {
            return this.n3;
        }

        @Override // sj1.fh
        public void writeTo(hk1.a aVar) throws IOException {
            this.y.writeTo(aVar);
        }
    }

    public a8(String str, sj1.r rVar, String str2, sj1.z zVar, sj1.i4 i4Var, boolean z, boolean z5, boolean z7) {
        this.y = str;
        this.n3 = rVar;
        this.zn = str2;
        this.f7299fb = i4Var;
        this.f7302s = z;
        if (zVar != null) {
            this.f7296a = zVar.v();
        } else {
            this.f7296a = new z.y();
        }
        if (z5) {
            this.f7301i9 = new mt.y();
        } else if (z7) {
            f3.y yVar = new f3.y();
            this.f7297c5 = yVar;
            yVar.a(sj1.f3.f7922t);
        }
    }

    public static String c5(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                hk1.v vVar = new hk1.v();
                vVar.oa(str, 0, iCharCount);
                i9(vVar, str, iCharCount, length, z);
                return vVar.yc();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public static void i9(hk1.v vVar, String str, int i, int i5, boolean z) {
        hk1.v vVar2 = null;
        while (i < i5) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (vVar2 == null) {
                        vVar2 = new hk1.v();
                    }
                    vVar2.w9(iCodePointAt);
                    while (!vVar2.dm()) {
                        byte b4 = vVar2.readByte();
                        vVar.tg(37);
                        char[] cArr = f7294t;
                        vVar.tg(cArr[((b4 & 255) >> 4) & 15]);
                        vVar.tg(cArr[b4 & 15]);
                    }
                } else {
                    vVar.w9(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (this.zn == null) {
            throw new AssertionError();
        }
        String strC5 = c5(str2, z);
        String strReplace = this.zn.replace("{" + str + "}", strC5);
        if (!f7295tl.matcher(strReplace).matches()) {
            this.zn = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public d0.y f() {
        sj1.r rVarR;
        r.y yVar = this.f7300gv;
        if (yVar != null) {
            rVarR = yVar.gv();
        } else {
            rVarR = this.n3.r(this.zn);
            if (rVarR == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.n3 + ", Relative: " + this.zn);
            }
        }
        sj1.fh yVar2 = this.f7298f;
        if (yVar2 == null) {
            mt.y yVar3 = this.f7301i9;
            if (yVar3 != null) {
                yVar2 = yVar3.zn();
            } else {
                f3.y yVar4 = this.f7297c5;
                if (yVar4 != null) {
                    yVar2 = yVar4.v();
                } else if (this.f7302s) {
                    yVar2 = sj1.fh.create((sj1.i4) null, new byte[0]);
                }
            }
        }
        sj1.i4 i4Var = this.f7299fb;
        if (i4Var != null) {
            if (yVar2 != null) {
                yVar2 = new y(yVar2, i4Var);
            } else {
                this.f7296a.y("Content-Type", i4Var.toString());
            }
        }
        return this.f7303v.f3(rVarR).i9(this.f7296a.a()).f(this.y, yVar2);
    }

    public void fb(String str, String str2, boolean z) {
        String str3 = this.zn;
        if (str3 != null) {
            r.y yVarWz = this.n3.wz(str3);
            this.f7300gv = yVarWz;
            if (yVarWz == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.n3 + ", Relative: " + this.zn);
            }
            this.zn = null;
        }
        if (z) {
            this.f7300gv.n3(str, str2);
        } else {
            this.f7300gv.zn(str, str2);
        }
    }

    public void gv(sj1.z zVar, sj1.fh fhVar) {
        this.f7297c5.zn(zVar, fhVar);
    }

    public void n3(String str, String str2, boolean z) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z) {
                this.f7296a.v(str, str2);
                return;
            } else {
                this.f7296a.y(str, str2);
                return;
            }
        }
        try {
            this.f7299fb = sj1.i4.v(str2);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e4);
        }
    }

    public <T> void s(Class<T> cls, T t3) {
        this.f7303v.r(cls, t3);
    }

    public void t(sj1.fh fhVar) {
        this.f7298f = fhVar;
    }

    public void tl(Object obj) {
        this.zn = obj.toString();
    }

    public void v(f3.zn znVar) {
        this.f7297c5.gv(znVar);
    }

    public void y(String str, String str2, boolean z) {
        if (z) {
            this.f7301i9.n3(str, str2);
        } else {
            this.f7301i9.y(str, str2);
        }
    }

    public void zn(sj1.z zVar) {
        this.f7296a.n3(zVar);
    }
}
