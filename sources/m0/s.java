package m0;

import android.text.TextUtils;
import ft.q;
import java.util.ArrayList;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b0.s {
    public final zn w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final d f6487xc;

    public s() {
        super("WebvttDecoder");
        this.f6487xc = new d();
        this.w = new zn();
    }

    public static int fh(d dVar) {
        int i = -1;
        int iA = 0;
        while (i == -1) {
            iA = dVar.a();
            String strCo = dVar.co();
            i = strCo == null ? 0 : "STYLE".equals(strCo) ? 2 : strCo.startsWith("NOTE") ? 1 : 3;
        }
        dVar.oz(iA);
        return i;
    }

    public static void rz(d dVar) {
        while (!TextUtils.isEmpty(dVar.co())) {
        }
    }

    @Override // b0.s
    public b0.c5 c(byte[] bArr, int i, boolean z) throws b0.f {
        v vVarWz;
        this.f6487xc.o(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            c5.v(this.f6487xc);
            while (!TextUtils.isEmpty(this.f6487xc.co())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iFh = fh(this.f6487xc);
                if (iFh == 0) {
                    return new f(arrayList2);
                }
                if (iFh == 1) {
                    rz(this.f6487xc);
                } else if (iFh == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new b0.f("A style block was found after the first cue.");
                    }
                    this.f6487xc.co();
                    arrayList.addAll(this.w.gv(this.f6487xc));
                } else if (iFh == 3 && (vVarWz = a.wz(this.f6487xc, arrayList)) != null) {
                    arrayList2.add(vVarWz);
                }
            }
        } catch (q e4) {
            throw new b0.f(e4);
        }
    }
}
