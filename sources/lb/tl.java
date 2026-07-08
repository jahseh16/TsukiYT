package lb;

import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.internal.Code;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import lb.f;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends f {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f6149co = 0;
    public String f3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hk1.v f6150p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6151r;
    public final hk1.fb w;
    public long z;
    public static final hk1.s n = hk1.s.a("'\\");
    public static final hk1.s c = hk1.s.a("\"\\");
    public static final hk1.s d0 = hk1.s.a("{}[]:, \n\t\r\f/\\;#=");
    public static final hk1.s fh = hk1.s.a("\n\r");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hk1.s f6148d = hk1.s.a("*/");

    public tl(hk1.fb fbVar) {
        if (fbVar == null) {
            throw new NullPointerException("source == null");
        }
        this.w = fbVar;
        this.f6150p = fbVar.zn();
        yt(6);
    }

    @Override // lb.f
    public void a() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 1) {
            yt(3);
            this.f6149co = 0;
            return;
        }
        throw new s("Expected BEGIN_OBJECT but was " + d() + " at path " + getPath());
    }

    public String ap() throws IOException {
        String strRb;
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 14) {
            strRb = m();
        } else if (iCt == 13) {
            strRb = rb(c);
        } else if (iCt == 12) {
            strRb = rb(n);
        } else {
            if (iCt != 15) {
                throw new s("Expected a name but was " + d() + " at path " + getPath());
            }
            strRb = this.f3;
            this.f3 = null;
        }
        this.f6149co = 0;
        this.f6117fb[this.y - 1] = strRb;
        return strRb;
    }

    @Override // lb.f
    public long c() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 16) {
            this.f6149co = 0;
            int[] iArr = this.f6118s;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
            return this.z;
        }
        if (iCt == 17) {
            this.f3 = this.f6150p.ut(this.f6151r);
        } else if (iCt == 9 || iCt == 8) {
            String strRb = iCt == 9 ? rb(c) : rb(n);
            this.f3 = strRb;
            try {
                long j = Long.parseLong(strRb);
                this.f6149co = 0;
                int[] iArr2 = this.f6118s;
                int i5 = this.y - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        } else if (iCt != 11) {
            throw new s("Expected a long but was " + d() + " at path " + getPath());
        }
        this.f6149co = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f3).longValueExact();
            this.f3 = null;
            this.f6149co = 0;
            int[] iArr3 = this.f6118s;
            int i8 = this.y - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new s("Expected a long but was " + this.f3 + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6149co = 0;
        this.f6120v[0] = 8;
        this.y = 1;
        this.f6150p.t();
        this.w.close();
    }

    public final int ct() throws IOException {
        int[] iArr = this.f6120v;
        int i = this.y;
        int i5 = iArr[i - 1];
        if (i5 == 1) {
            iArr[i - 1] = 2;
        } else if (i5 == 2) {
            int iKp = kp(true);
            this.f6150p.readByte();
            if (iKp != 44) {
                if (iKp != 59) {
                    if (iKp != 93) {
                        throw jz("Unterminated array");
                    }
                    this.f6149co = 4;
                    return 4;
                }
                u();
            }
        } else {
            if (i5 == 3 || i5 == 5) {
                iArr[i - 1] = 4;
                if (i5 == 5) {
                    int iKp2 = kp(true);
                    this.f6150p.readByte();
                    if (iKp2 != 44) {
                        if (iKp2 != 59) {
                            if (iKp2 != 125) {
                                throw jz("Unterminated object");
                            }
                            this.f6149co = 2;
                            return 2;
                        }
                        u();
                    }
                }
                int iKp3 = kp(true);
                if (iKp3 == 34) {
                    this.f6150p.readByte();
                    this.f6149co = 13;
                    return 13;
                }
                if (iKp3 == 39) {
                    this.f6150p.readByte();
                    u();
                    this.f6149co = 12;
                    return 12;
                }
                if (iKp3 != 125) {
                    u();
                    if (!lc((char) iKp3)) {
                        throw jz("Expected name");
                    }
                    this.f6149co = 14;
                    return 14;
                }
                if (i5 == 5) {
                    throw jz("Expected name");
                }
                this.f6150p.readByte();
                this.f6149co = 2;
                return 2;
            }
            if (i5 == 4) {
                iArr[i - 1] = 5;
                int iKp4 = kp(true);
                this.f6150p.readByte();
                if (iKp4 != 58) {
                    if (iKp4 != 61) {
                        throw jz("Expected ':'");
                    }
                    u();
                    if (this.w.gv(1L) && this.f6150p.rz(0L) == 62) {
                        this.f6150p.readByte();
                    }
                }
            } else if (i5 == 6) {
                iArr[i - 1] = 7;
            } else if (i5 == 7) {
                if (kp(false) == -1) {
                    this.f6149co = 18;
                    return 18;
                }
                u();
            } else {
                if (i5 == 9) {
                    throw null;
                }
                if (i5 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iKp5 = kp(true);
        if (iKp5 == 34) {
            this.f6150p.readByte();
            this.f6149co = 9;
            return 9;
        }
        if (iKp5 == 39) {
            u();
            this.f6150p.readByte();
            this.f6149co = 8;
            return 8;
        }
        if (iKp5 != 44 && iKp5 != 59) {
            if (iKp5 == 91) {
                this.f6150p.readByte();
                this.f6149co = 3;
                return 3;
            }
            if (iKp5 != 93) {
                if (iKp5 == 123) {
                    this.f6150p.readByte();
                    this.f6149co = 1;
                    return 1;
                }
                int iG = g();
                if (iG != 0) {
                    return iG;
                }
                int iU0 = u0();
                if (iU0 != 0) {
                    return iU0;
                }
                if (!lc(this.f6150p.rz(0L))) {
                    throw jz("Expected value");
                }
                u();
                this.f6149co = 10;
                return 10;
            }
            if (i5 == 1) {
                this.f6150p.readByte();
                this.f6149co = 4;
                return 4;
            }
        }
        if (i5 != 1 && i5 != 2) {
            throw jz("Unexpected value");
        }
        u();
        this.f6149co = 7;
        return 7;
    }

    @Override // lb.f
    public f.n3 d() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        switch (iCt) {
            case 1:
                return f.n3.BEGIN_OBJECT;
            case 2:
                return f.n3.END_OBJECT;
            case 3:
                return f.n3.BEGIN_ARRAY;
            case 4:
                return f.n3.END_ARRAY;
            case 5:
            case 6:
                return f.n3.BOOLEAN;
            case 7:
                return f.n3.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return f.n3.STRING;
            case Code.UNIMPLEMENTED /* 12 */:
            case 13:
            case 14:
            case 15:
                return f.n3.NAME;
            case 16:
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return f.n3.NUMBER;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return f.n3.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int eb(String str, f.y yVar) {
        int length = yVar.y.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(yVar.y[i])) {
                this.f6149co = 0;
                int[] iArr = this.f6118s;
                int i5 = this.y - 1;
                iArr[i5] = iArr[i5] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // lb.f
    public void ej() throws IOException {
        if (p()) {
            this.f3 = ap();
            this.f6149co = 11;
        }
    }

    @Override // lb.f
    public double f3() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 16) {
            this.f6149co = 0;
            int[] iArr = this.f6118s;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
            return this.z;
        }
        if (iCt == 17) {
            this.f3 = this.f6150p.ut(this.f6151r);
        } else if (iCt == 9) {
            this.f3 = rb(c);
        } else if (iCt == 8) {
            this.f3 = rb(n);
        } else if (iCt == 10) {
            this.f3 = m();
        } else if (iCt != 11) {
            throw new s("Expected a double but was " + d() + " at path " + getPath());
        }
        this.f6149co = 11;
        try {
            double d4 = Double.parseDouble(this.f3);
            if (this.f6116f || !(Double.isNaN(d4) || Double.isInfinite(d4))) {
                this.f3 = null;
                this.f6149co = 0;
                int[] iArr2 = this.f6118s;
                int i5 = this.y - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return d4;
            }
            throw new c5("JSON forbids NaN and infinities: " + d4 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new s("Expected a double but was " + this.f3 + " at path " + getPath());
        }
    }

    @Override // lb.f
    public void f7() throws IOException {
        if (this.f6119t) {
            throw new s("Cannot skip unexpected " + d() + " at " + getPath());
        }
        int i = 0;
        do {
            int iCt = this.f6149co;
            if (iCt == 0) {
                iCt = ct();
            }
            if (iCt == 3) {
                yt(1);
            } else if (iCt == 1) {
                yt(3);
            } else {
                if (iCt == 4) {
                    i--;
                    if (i < 0) {
                        throw new s("Expected a value but was " + d() + " at path " + getPath());
                    }
                    this.y--;
                } else if (iCt == 2) {
                    i--;
                    if (i < 0) {
                        throw new s("Expected a value but was " + d() + " at path " + getPath());
                    }
                    this.y--;
                } else if (iCt == 14 || iCt == 10) {
                    wf();
                } else if (iCt == 9 || iCt == 13) {
                    tg(c);
                } else if (iCt == 8 || iCt == 12) {
                    tg(n);
                } else if (iCt == 17) {
                    this.f6150p.skip(this.f6151r);
                } else if (iCt == 18) {
                    throw new s("Expected a value but was " + d() + " at path " + getPath());
                }
                this.f6149co = 0;
            }
            i++;
            this.f6149co = 0;
        } while (i != 0);
        int[] iArr = this.f6118s;
        int i5 = this.y;
        int i8 = i5 - 1;
        iArr[i8] = iArr[i8] + 1;
        this.f6117fb[i5 - 1] = "null";
    }

    public final int g() throws IOException {
        String str;
        String str2;
        int i;
        byte bRz = this.f6150p.rz(0L);
        if (bRz == 116 || bRz == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (bRz == 102 || bRz == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (bRz != 110 && bRz != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i5 = 1;
        while (i5 < length) {
            int i8 = i5 + 1;
            if (!this.w.gv(i8)) {
                return 0;
            }
            char cRz = this.f6150p.rz(i5);
            if (cRz != str.charAt(i5) && cRz != str2.charAt(i5)) {
                return 0;
            }
            i5 = i8;
        }
        if (this.w.gv(length + 1) && lc(this.f6150p.rz(length))) {
            return 0;
        }
        this.f6150p.skip(length);
        this.f6149co = i;
        return i;
    }

    @Override // lb.f
    public int j(f.y yVar) throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt < 12 || iCt > 15) {
            return -1;
        }
        if (iCt == 15) {
            return rs(this.f3, yVar);
        }
        int iV = this.w.v(yVar.n3);
        if (iV != -1) {
            this.f6149co = 0;
            this.f6117fb[this.y - 1] = yVar.y[iV];
            return iV;
        }
        String str = this.f6117fb[this.y - 1];
        String strAp = ap();
        int iRs = rs(strAp, yVar);
        if (iRs == -1) {
            this.f6149co = 15;
            this.f3 = strAp;
            this.f6117fb[this.y - 1] = str;
        }
        return iRs;
    }

    @Override // lb.f
    public void k() throws IOException {
        if (this.f6119t) {
            f.n3 n3VarD = d();
            ap();
            throw new s("Cannot skip unexpected " + n3VarD + " at " + getPath());
        }
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 14) {
            wf();
        } else if (iCt == 13) {
            tg(c);
        } else if (iCt == 12) {
            tg(n);
        } else if (iCt != 15) {
            throw new s("Expected a name but was " + d() + " at path " + getPath());
        }
        this.f6149co = 0;
        this.f6117fb[this.y - 1] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f6150p.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.w.gv(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        u();
        r3 = r6.f6150p.rz(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f6150p.readByte();
        r6.f6150p.readByte();
        xb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f6150p.readByte();
        r6.f6150p.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (pz() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw jz("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        u();
        xb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int kp(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            hk1.fb r2 = r6.w
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.gv(r4)
            if (r2 == 0) goto L80
            hk1.v r2 = r6.f6150p
            long r4 = (long) r1
            byte r2 = r2.rz(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            hk1.v r3 = r6.f6150p
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            hk1.fb r3 = r6.w
            r4 = 2
            boolean r3 = r3.gv(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.u()
            hk1.v r3 = r6.f6150p
            r4 = 1
            byte r3 = r3.rz(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            hk1.v r1 = r6.f6150p
            r1.readByte()
            hk1.v r1 = r6.f6150p
            r1.readByte()
            r6.xb()
            goto L1
        L5a:
            hk1.v r1 = r6.f6150p
            r1.readByte()
            hk1.v r1 = r6.f6150p
            r1.readByte()
            boolean r1 = r6.pz()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            lb.c5 r7 = r6.jz(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.u()
            r6.xb()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.tl.kp(boolean):int");
    }

    public final boolean lc(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u();
        return false;
    }

    public final String m() throws IOException {
        long jX = this.w.x(d0);
        return jX != -1 ? this.f6150p.ut(jX) : this.f6150p.yc();
    }

    @Override // lb.f
    public String mg() throws IOException {
        String strUt;
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 10) {
            strUt = m();
        } else if (iCt == 9) {
            strUt = rb(c);
        } else if (iCt == 8) {
            strUt = rb(n);
        } else if (iCt == 11) {
            strUt = this.f3;
            this.f3 = null;
        } else if (iCt == 16) {
            strUt = Long.toString(this.z);
        } else {
            if (iCt != 17) {
                throw new s("Expected a string but was " + d() + " at path " + getPath());
            }
            strUt = this.f6150p.ut(this.f6151r);
        }
        this.f6149co = 0;
        int[] iArr = this.f6118s;
        int i = this.y - 1;
        iArr[i] = iArr[i] + 1;
        return strUt;
    }

    @Override // lb.f
    public int n() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 16) {
            long j = this.z;
            int i = (int) j;
            if (j == i) {
                this.f6149co = 0;
                int[] iArr = this.f6118s;
                int i5 = this.y - 1;
                iArr[i5] = iArr[i5] + 1;
                return i;
            }
            throw new s("Expected an int but was " + this.z + " at path " + getPath());
        }
        if (iCt == 17) {
            this.f3 = this.f6150p.ut(this.f6151r);
        } else if (iCt == 9 || iCt == 8) {
            String strRb = iCt == 9 ? rb(c) : rb(n);
            this.f3 = strRb;
            try {
                int i8 = Integer.parseInt(strRb);
                this.f6149co = 0;
                int[] iArr2 = this.f6118s;
                int i10 = this.y - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i8;
            } catch (NumberFormatException unused) {
            }
        } else if (iCt != 11) {
            throw new s("Expected an int but was " + d() + " at path " + getPath());
        }
        this.f6149co = 11;
        try {
            double d4 = Double.parseDouble(this.f3);
            int i11 = (int) d4;
            if (i11 == d4) {
                this.f3 = null;
                this.f6149co = 0;
                int[] iArr3 = this.f6118s;
                int i12 = this.y - 1;
                iArr3[i12] = iArr3[i12] + 1;
                return i11;
            }
            throw new s("Expected an int but was " + this.f3 + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new s("Expected an int but was " + this.f3 + " at path " + getPath());
        }
    }

    @Override // lb.f
    public int oz(f.y yVar) throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt < 8 || iCt > 11) {
            return -1;
        }
        if (iCt == 11) {
            return eb(this.f3, yVar);
        }
        int iV = this.w.v(yVar.n3);
        if (iV != -1) {
            this.f6149co = 0;
            int[] iArr = this.f6118s;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
            return iV;
        }
        String strMg = mg();
        int iEb = eb(strMg, yVar);
        if (iEb == -1) {
            this.f6149co = 11;
            this.f3 = strMg;
            this.f6118s[this.y - 1] = r0[r1] - 1;
        }
        return iEb;
    }

    @Override // lb.f
    public boolean p() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        return (iCt == 2 || iCt == 4 || iCt == 18) ? false : true;
    }

    public final boolean pz() throws IOException {
        hk1.fb fbVar = this.w;
        hk1.s sVar = f6148d;
        long jXc = fbVar.xc(sVar);
        boolean z = jXc != -1;
        hk1.v vVar = this.f6150p;
        vVar.skip(z ? jXc + ((long) sVar.ct()) : vVar.lc());
        return z;
    }

    @Override // lb.f
    public boolean r() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 5) {
            this.f6149co = 0;
            int[] iArr = this.f6118s;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iCt == 6) {
            this.f6149co = 0;
            int[] iArr2 = this.f6118s;
            int i5 = this.y - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return false;
        }
        throw new s("Expected a boolean but was " + d() + " at path " + getPath());
    }

    public final String rb(hk1.s sVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jX = this.w.x(sVar);
            if (jX == -1) {
                throw jz("Unterminated string");
            }
            if (this.f6150p.rz(jX) != 92) {
                if (sb == null) {
                    String strUt = this.f6150p.ut(jX);
                    this.f6150p.readByte();
                    return strUt;
                }
                sb.append(this.f6150p.ut(jX));
                this.f6150p.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f6150p.ut(jX));
            this.f6150p.readByte();
            sb.append(y4());
        }
    }

    public final int rs(String str, f.y yVar) {
        int length = yVar.y.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(yVar.y[i])) {
                this.f6149co = 0;
                this.f6117fb[this.y - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // lb.f
    public <T> T rz() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 7) {
            this.f6149co = 0;
            int[] iArr = this.f6118s;
            int i = this.y - 1;
            iArr[i] = iArr[i] + 1;
            return null;
        }
        throw new s("Expected null but was " + d() + " at path " + getPath());
    }

    @Override // lb.f
    public void t() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt != 4) {
            throw new s("Expected END_ARRAY but was " + d() + " at path " + getPath());
        }
        int i = this.y;
        this.y = i - 1;
        int[] iArr = this.f6118s;
        int i5 = i - 2;
        iArr[i5] = iArr[i5] + 1;
        this.f6149co = 0;
    }

    public final void tg(hk1.s sVar) throws IOException {
        while (true) {
            long jX = this.w.x(sVar);
            if (jX == -1) {
                throw jz("Unterminated string");
            }
            if (this.f6150p.rz(jX) != 92) {
                this.f6150p.skip(jX + 1);
                return;
            } else {
                this.f6150p.skip(jX + 1);
                y4();
            }
        }
    }

    public String toString() {
        return "JsonReader(" + this.w + ")";
    }

    public final void u() throws IOException {
        if (!this.f6116f) {
            throw jz("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (lc(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r16.z = r8;
        r16.f6150p.skip(r5);
        r16.f6149co = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r16.f6151r = r5;
        r16.f6149co = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u0() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.tl.u0():int");
    }

    @Override // lb.f
    public void w() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt != 2) {
            throw new s("Expected END_OBJECT but was " + d() + " at path " + getPath());
        }
        int i = this.y;
        int i5 = i - 1;
        this.y = i5;
        this.f6117fb[i5] = null;
        int[] iArr = this.f6118s;
        int i8 = i - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f6149co = 0;
    }

    public final void wf() throws IOException {
        long jX = this.w.x(d0);
        hk1.v vVar = this.f6150p;
        if (jX == -1) {
            jX = vVar.lc();
        }
        vVar.skip(jX);
    }

    public final void xb() throws IOException {
        long jX = this.w.x(fh);
        hk1.v vVar = this.f6150p;
        vVar.skip(jX != -1 ? jX + 1 : vVar.lc());
    }

    @Override // lb.f
    public void y() throws IOException {
        int iCt = this.f6149co;
        if (iCt == 0) {
            iCt = ct();
        }
        if (iCt == 3) {
            yt(1);
            this.f6118s[this.y - 1] = 0;
            this.f6149co = 0;
        } else {
            throw new s("Expected BEGIN_ARRAY but was " + d() + " at path " + getPath());
        }
    }

    public final char y4() throws IOException {
        int i;
        if (!this.w.gv(1L)) {
            throw jz("Unterminated escape sequence");
        }
        byte b4 = this.f6150p.readByte();
        if (b4 == 10 || b4 == 34 || b4 == 39 || b4 == 47 || b4 == 92) {
            return (char) b4;
        }
        if (b4 == 98) {
            return '\b';
        }
        if (b4 == 102) {
            return '\f';
        }
        if (b4 == 110) {
            return '\n';
        }
        if (b4 == 114) {
            return '\r';
        }
        if (b4 == 116) {
            return '\t';
        }
        if (b4 != 117) {
            if (this.f6116f) {
                return (char) b4;
            }
            throw jz("Invalid escape sequence: \\" + ((char) b4));
        }
        if (!this.w.gv(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c3 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            byte bRz = this.f6150p.rz(i5);
            char c4 = (char) (c3 << 4);
            if (bRz >= 48 && bRz <= 57) {
                i = bRz - 48;
            } else if (bRz >= 97 && bRz <= 102) {
                i = bRz - 87;
            } else {
                if (bRz < 65 || bRz > 70) {
                    throw jz("\\u" + this.f6150p.ut(4L));
                }
                i = bRz - 55;
            }
            c3 = (char) (c4 + i);
        }
        this.f6150p.skip(4L);
        return c3;
    }
}
