package mn;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import ft.g;
import ft.uo;
import java.nio.ByteBuffer;
import mn.i4;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public class x implements i4 {
    public final i4 y;

    public x(i4 i4Var) {
        this.y = i4Var;
    }

    @Override // mn.i4
    public boolean a() {
        return this.y.a();
    }

    @Override // mn.i4
    public void c5(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.y.c5(audioDeviceInfo);
    }

    @Override // mn.i4
    public int co(g gVar) {
        return this.y.co(gVar);
    }

    @Override // mn.i4
    public void d0() {
        this.y.d0();
    }

    @Override // mn.i4
    public void f(int i) {
        this.y.f(i);
    }

    @Override // mn.i4
    public void f3(long j) {
        this.y.f3(j);
    }

    @Override // mn.i4
    public void flush() {
        this.y.flush();
    }

    @Override // mn.i4
    public long i4(boolean z) {
        return this.y.i4(z);
    }

    @Override // mn.i4
    public boolean i9() {
        return this.y.i9();
    }

    @Override // mn.i4
    public void mt(@Nullable gn gnVar) {
        this.y.mt(gnVar);
    }

    @Override // mn.i4
    public void n() {
        this.y.n();
    }

    @Override // mn.i4
    public boolean n3(g gVar) {
        return this.y.n3(gVar);
    }

    @Override // mn.i4
    public void p(v vVar) {
        this.y.p(vVar);
    }

    @Override // mn.i4
    public void pause() {
        this.y.pause();
    }

    @Override // mn.i4
    public void play() {
        this.y.play();
    }

    @Override // mn.i4
    public void s(boolean z) {
        this.y.s(z);
    }

    @Override // mn.i4
    public void setVolume(float f3) {
        this.y.setVolume(f3);
    }

    @Override // mn.i4
    public void tl() {
        this.y.tl();
    }

    @Override // mn.i4
    public uo v() {
        return this.y.v();
    }

    @Override // mn.i4
    public void w() {
        this.y.w();
    }

    @Override // mn.i4
    public boolean wz(ByteBuffer byteBuffer, long j, int i) throws i4.n3, i4.v {
        return this.y.wz(byteBuffer, j, i);
    }

    @Override // mn.i4
    public void x4(c cVar) {
        this.y.x4(cVar);
    }

    @Override // mn.i4
    public void xc(g gVar, int i, @Nullable int[] iArr) throws i4.y {
        this.y.xc(gVar, i, iArr);
    }

    @Override // mn.i4
    public void y() {
        this.y.y();
    }

    @Override // mn.i4
    public void z() throws i4.v {
        this.y.z();
    }

    @Override // mn.i4
    public void zn(uo uoVar) {
        this.y.zn(uoVar);
    }
}
