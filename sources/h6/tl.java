package h6;

import androidx.annotation.Nullable;
import ft.g;
import h6.fb;
import java.io.IOException;
import r0.j5;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fb.n3 f5316f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final fb f5317i9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5318t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public volatile boolean f5319tl;

    public tl(r0.tl tlVar, p pVar, g gVar, int i, @Nullable Object obj, fb fbVar) {
        super(tlVar, pVar, 2, gVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f5317i9 = fbVar;
    }

    @Override // r0.ta.v
    public void f() {
        this.f5319tl = true;
    }

    @Override // r0.ta.v
    public void i9() throws IOException {
        if (this.f5318t == 0) {
            this.f5317i9.gv(this.f5316f, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p pVarV = this.n3.v(this.f5318t);
            j5 j5Var = this.f5286c5;
            b1.a aVar = new b1.a(j5Var, pVarV.f7521fb, j5Var.y(pVarV));
            while (!this.f5319tl && this.f5317i9.n3(aVar)) {
                try {
                } finally {
                    this.f5318t = aVar.getPosition() - this.n3.f7521fb;
                }
            }
        } finally {
            r0.w.y(this.f5286c5);
        }
    }

    public void v(fb.n3 n3Var) {
        this.f5316f = n3Var;
    }
}
