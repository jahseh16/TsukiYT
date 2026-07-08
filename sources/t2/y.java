package t2;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class y extends v {
    public final InterfaceC0176y n3;
    public final Typeface y;
    public boolean zn;

    /* JADX INFO: renamed from: t2.y$y, reason: collision with other inner class name */
    public interface InterfaceC0176y {
        void y(Typeface typeface);
    }

    public y(InterfaceC0176y interfaceC0176y, Typeface typeface) {
        this.y = typeface;
        this.n3 = interfaceC0176y;
    }

    public final void gv(Typeface typeface) {
        if (this.zn) {
            return;
        }
        this.n3.y(typeface);
    }

    @Override // t2.v
    public void n3(Typeface typeface, boolean z) {
        gv(typeface);
    }

    @Override // t2.v
    public void y(int i) {
        gv(this.y);
    }

    public void zn() {
        this.zn = true;
    }
}
