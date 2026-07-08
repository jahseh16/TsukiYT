package h6;

import androidx.annotation.Nullable;
import ft.g;
import java.io.IOException;
import java.util.Arrays;
import r0.p;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5314f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public byte[] f5315i9;

    public t(r0.tl tlVar, p pVar, int i, g gVar, int i5, @Nullable Object obj, @Nullable byte[] bArr) {
        t tVar;
        byte[] bArr2;
        super(tlVar, pVar, i, gVar, i5, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = ut.f8757a;
            tVar = this;
        } else {
            tVar = this;
            bArr2 = bArr;
        }
        tVar.f5315i9 = bArr2;
    }

    public byte[] a() {
        return this.f5315i9;
    }

    @Override // r0.ta.v
    public final void f() {
        this.f5314f = true;
    }

    public final void fb(int i) {
        byte[] bArr = this.f5315i9;
        if (bArr.length < i + 16384) {
            this.f5315i9 = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // r0.ta.v
    public final void i9() throws IOException {
        try {
            this.f5286c5.y(this.n3);
            int i = 0;
            int i5 = 0;
            while (i != -1 && !this.f5314f) {
                fb(i5);
                i = this.f5286c5.read(this.f5315i9, i5, 16384);
                if (i != -1) {
                    i5 += i;
                }
            }
            if (!this.f5314f) {
                v(this.f5315i9, i5);
            }
            r0.w.y(this.f5286c5);
        } catch (Throwable th) {
            r0.w.y(this.f5286c5);
            throw th;
        }
    }

    public abstract void v(byte[] bArr, int i) throws IOException;
}
