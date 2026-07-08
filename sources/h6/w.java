package h6;

import androidx.annotation.Nullable;
import b1.ta;
import com.google.protobuf.Reader;
import ft.g;
import java.io.IOException;
import r0.p;

/* JADX INFO: loaded from: classes.dex */
public final class w extends y {

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f5332mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5333p;
    public final g w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final int f5334xc;

    public w(r0.tl tlVar, p pVar, g gVar, int i, @Nullable Object obj, long j, long j4, long j7, int i5, g gVar2) {
        super(tlVar, pVar, gVar, i, obj, j, j4, -9223372036854775807L, -9223372036854775807L, j7);
        this.f5334xc = i5;
        this.w = gVar2;
    }

    @Override // h6.wz
    public boolean a() {
        return this.f5332mt;
    }

    @Override // r0.ta.v
    public void i9() throws IOException {
        zn znVarS = s();
        znVarS.n3(0L);
        ta taVarA = znVarS.a(0, this.f5334xc);
        taVarA.y(this.w);
        try {
            long jY = this.f5286c5.y(this.n3.v(this.f5333p));
            if (jY != -1) {
                jY += this.f5333p;
            }
            b1.a aVar = new b1.a(this.f5286c5, this.f5333p, jY);
            for (int iV = 0; iV != -1; iV = taVarA.v(aVar, Reader.READ_DONE, true)) {
                this.f5333p += (long) iV;
            }
            taVarA.a(this.f5287fb, 1, (int) this.f5333p, 0, null);
            r0.w.y(this.f5286c5);
            this.f5332mt = true;
        } catch (Throwable th) {
            r0.w.y(this.f5286c5);
            throw th;
        }
    }

    @Override // r0.ta.v
    public void f() {
    }
}
