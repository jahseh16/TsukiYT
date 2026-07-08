package mn;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mn.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f6536a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public ByteBuffer f6537fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public s.y f6538gv;
    public s.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6539s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s.y f6540v;
    public s.y zn;

    public d0() {
        ByteBuffer byteBuffer = s.y;
        this.f6536a = byteBuffer;
        this.f6537fb = byteBuffer;
        s.y yVar = s.y.f6679v;
        this.f6538gv = yVar;
        this.f6540v = yVar;
        this.n3 = yVar;
        this.zn = yVar;
    }

    @Override // mn.s
    public boolean a() {
        return this.f6539s && this.f6537fb == s.y;
    }

    public final boolean fb() {
        return this.f6537fb.hasRemaining();
    }

    @Override // mn.s
    public final void flush() {
        this.f6537fb = s.y;
        this.f6539s = false;
        this.n3 = this.f6538gv;
        this.zn = this.f6540v;
        c5();
    }

    @Override // mn.s
    public boolean isActive() {
        return this.f6540v != s.y.f6679v;
    }

    @Override // mn.s
    public ByteBuffer n3() {
        ByteBuffer byteBuffer = this.f6537fb;
        this.f6537fb = s.y;
        return byteBuffer;
    }

    public s.y s(s.y yVar) throws s.n3 {
        return s.y.f6679v;
    }

    public final ByteBuffer t(int i) {
        if (this.f6536a.capacity() < i) {
            this.f6536a = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f6536a.clear();
        }
        ByteBuffer byteBuffer = this.f6536a;
        this.f6537fb = byteBuffer;
        return byteBuffer;
    }

    @Override // mn.s
    public final void v() {
        this.f6539s = true;
        i9();
    }

    @Override // mn.s
    public final void y() {
        flush();
        this.f6536a = s.y;
        s.y yVar = s.y.f6679v;
        this.f6538gv = yVar;
        this.f6540v = yVar;
        this.n3 = yVar;
        this.zn = yVar;
        f();
    }

    @Override // mn.s
    public final s.y zn(s.y yVar) throws s.n3 {
        this.f6538gv = yVar;
        this.f6540v = s(yVar);
        return isActive() ? this.f6540v : s.y.f6679v;
    }

    public void c5() {
    }

    public void f() {
    }

    public void i9() {
    }
}
