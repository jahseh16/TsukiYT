package ur;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements vl {

    @Nullable
    public b1.t n3;
    public final b1.mt y;

    @Nullable
    public b1.tl zn;

    public zn(b1.mt mtVar) {
        this.y = mtVar;
    }

    @Override // ur.vl
    public int gv(b1.d0 d0Var) throws IOException {
        return ((b1.t) v0.y.v(this.n3)).fb((b1.tl) v0.y.v(this.zn), d0Var);
    }

    @Override // ur.vl
    public void n3() {
        b1.t tVar = this.n3;
        if (tVar instanceof ao.a) {
            ((ao.a) tVar).i9();
        }
    }

    @Override // ur.vl
    public void release() {
        b1.t tVar = this.n3;
        if (tVar != null) {
            tVar.release();
            this.n3 = null;
        }
        this.zn = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    @Override // ur.vl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(r0.c5 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, b1.wz r15) throws java.io.IOException {
        /*
            r7 = this;
            b1.a r6 = new b1.a
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zn = r6
            b1.t r8 = r7.n3
            if (r8 == 0) goto L10
            return
        L10:
            b1.mt r8 = r7.y
            b1.t[] r8 = r8.y(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.n3 = r8
            goto L78
        L20:
            int r10 = r8.length
            r0 = 0
        L22:
            if (r0 >= r10) goto L74
            r1 = r8[r0]
            boolean r2 = r1.gv(r6)     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L37
            if (r2 == 0) goto L39
            r7.n3 = r1     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L37
            v0.y.fb(r14)
            r6.s()
            goto L74
        L35:
            r8 = move-exception
            goto L50
        L37:
            goto L64
        L39:
            b1.t r1 = r7.n3
            if (r1 != 0) goto L48
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L46
            goto L48
        L46:
            r1 = 0
            goto L49
        L48:
            r1 = 1
        L49:
            v0.y.fb(r1)
            r6.s()
            goto L71
        L50:
            b1.t r9 = r7.n3
            if (r9 != 0) goto L5c
            long r9 = r6.getPosition()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L5d
        L5c:
            r13 = 1
        L5d:
            v0.y.fb(r13)
            r6.s()
            throw r8
        L64:
            b1.t r1 = r7.n3
            if (r1 != 0) goto L48
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L46
            goto L48
        L71:
            int r0 = r0 + 1
            goto L22
        L74:
            b1.t r10 = r7.n3
            if (r10 == 0) goto L7e
        L78:
            b1.t r8 = r7.n3
            r8.zn(r15)
            return
        L7e:
            ur.nf r10 = new ur.nf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = v0.ut.k5(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = v0.y.v(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.zn.v(r0.c5, android.net.Uri, java.util.Map, long, long, b1.wz):void");
    }

    @Override // ur.vl
    public void y(long j, long j4) {
        ((b1.t) v0.y.v(this.n3)).y(j, j4);
    }

    @Override // ur.vl
    public long zn() {
        b1.tl tlVar = this.zn;
        if (tlVar != null) {
            return tlVar.getPosition();
        }
        return -1L;
    }
}
