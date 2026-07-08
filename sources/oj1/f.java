package oj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public boolean n3;
    public final hw y;

    public f(hw writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.y = writer;
        this.n3 = true;
    }

    public void a(double d4) {
        this.y.zn(String.valueOf(d4));
    }

    public void c5(long j) {
        this.y.writeLong(j);
    }

    public void f(short s3) {
        this.y.writeLong(s3);
    }

    public void fb(float f3) {
        this.y.zn(String.valueOf(f3));
    }

    public void gv(byte b4) {
        this.y.writeLong(b4);
    }

    public final void i9(String v6) {
        Intrinsics.checkNotNullParameter(v6, "v");
        this.y.zn(v6);
    }

    public void n3() {
        this.n3 = true;
    }

    public void s(int i) {
        this.y.writeLong(i);
    }

    public void t(boolean z) {
        this.y.zn(String.valueOf(z));
    }

    public final void tl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.y.n3(value);
    }

    public final void v(char c) {
        this.y.y(c);
    }

    public final void wz(boolean z) {
        this.n3 = z;
    }

    public final boolean y() {
        return this.n3;
    }

    public void zn() {
        this.n3 = false;
    }

    public void w() {
    }

    public void xc() {
    }
}
