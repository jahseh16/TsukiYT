package h6;

import androidx.annotation.Nullable;
import ft.g;
import h6.fb;
import java.io.IOException;
import r0.j5;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
public class f extends y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public volatile boolean f5309co;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public long f5310mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fb f5311p;
    public final long w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final int f5312xc;
    public boolean z;

    public f(r0.tl tlVar, p pVar, g gVar, int i, @Nullable Object obj, long j, long j4, long j7, long j8, long j9, int i5, long j10, fb fbVar) {
        super(tlVar, pVar, gVar, i, obj, j, j4, j7, j8, j9);
        this.f5312xc = i5;
        this.w = j10;
        this.f5311p = fbVar;
    }

    @Override // h6.wz
    public boolean a() {
        return this.z;
    }

    @Override // r0.ta.v
    public final void f() {
        this.f5309co = true;
    }

    @Override // r0.ta.v
    public final void i9() throws IOException {
        if (this.f5310mt == 0) {
            zn znVarS = s();
            znVarS.n3(this.w);
            fb fbVar = this.f5311p;
            fb.n3 n3VarT = t(znVarS);
            long j = this.f5336f;
            long j4 = j == -9223372036854775807L ? -9223372036854775807L : j - this.w;
            long j7 = this.f5337t;
            fbVar.gv(n3VarT, j4, j7 == -9223372036854775807L ? -9223372036854775807L : j7 - this.w);
        }
        try {
            p pVarV = this.n3.v(this.f5310mt);
            j5 j5Var = this.f5286c5;
            b1.a aVar = new b1.a(j5Var, pVarV.f7521fb, j5Var.y(pVarV));
            do {
                try {
                    if (this.f5309co) {
                        break;
                    }
                } finally {
                    this.f5310mt = aVar.getPosition() - this.n3.f7521fb;
                }
            } while (this.f5311p.n3(aVar));
            r0.w.y(this.f5286c5);
            this.z = !this.f5309co;
        } catch (Throwable th) {
            r0.w.y(this.f5286c5);
            throw th;
        }
    }

    @Override // h6.wz
    public long v() {
        return this.f5335i9 + ((long) this.f5312xc);
    }

    public fb.n3 t(zn znVar) {
        return znVar;
    }
}
