package u4;

import b1.ta;
import ft.g;
import ft.q;
import java.util.Collections;
import mn.y;
import u4.v;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class y extends v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f8352v = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8353gv;
    public boolean n3;
    public boolean zn;

    public y(ta taVar) {
        super(taVar);
    }

    @Override // u4.v
    public boolean n3(d dVar) throws v.y {
        if (this.n3) {
            dVar.ut(1);
        } else {
            int iEj = dVar.ej();
            int i = (iEj >> 4) & 15;
            this.f8353gv = i;
            if (i == 2) {
                this.y.y(new g.n3().o4("audio/mpeg").a8(1).rs(f8352v[(iEj >> 2) & 3]).z6());
                this.zn = true;
            } else if (i == 7 || i == 8) {
                this.y.y(new g.n3().o4(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").a8(1).rs(8000).z6());
                this.zn = true;
            } else if (i != 10) {
                throw new v.y("Audio format not supported: " + this.f8353gv);
            }
            this.n3 = true;
        }
        return true;
    }

    @Override // u4.v
    public boolean zn(d dVar, long j) throws q {
        if (this.f8353gv == 2) {
            int iY = dVar.y();
            this.y.n3(dVar, iY);
            this.y.a(j, 1, iY, 0, null);
            return true;
        }
        int iEj = dVar.ej();
        if (iEj != 0 || this.zn) {
            if (this.f8353gv == 10 && iEj != 1) {
                return false;
            }
            int iY2 = dVar.y();
            this.y.n3(dVar, iY2);
            this.y.a(j, 1, iY2, 0, null);
            return true;
        }
        int iY3 = dVar.y();
        byte[] bArr = new byte[iY3];
        dVar.t(bArr, 0, iY3);
        y.n3 n3VarA = mn.y.a(bArr);
        this.y.y(new g.n3().o4("audio/mp4a-latm").x(n3VarA.zn).a8(n3VarA.n3).rs(n3VarA.y).ut(Collections.singletonList(bArr)).z6());
        this.zn = true;
        return false;
    }
}
