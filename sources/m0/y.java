package m0;

import b0.n3;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y extends b0.s {

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final d f6488xc;

    public y() {
        super("Mp4WebvttDecoder");
        this.f6488xc = new d();
    }

    public static b0.n3 fh(d dVar, int i) throws b0.f {
        CharSequence charSequenceP = null;
        n3.C0034n3 c0034n3Xc = null;
        while (i > 0) {
            if (i < 8) {
                throw new b0.f("Incomplete vtt cue box header found.");
            }
            int iP = dVar.p();
            int iP2 = dVar.p();
            int i5 = iP - 8;
            String strTa = ut.ta(dVar.v(), dVar.a(), i5);
            dVar.ut(i5);
            i = (i - 8) - i5;
            if (iP2 == 1937011815) {
                c0034n3Xc = a.xc(strTa);
            } else if (iP2 == 1885436268) {
                charSequenceP = a.p(null, strTa.trim(), Collections.emptyList());
            }
        }
        if (charSequenceP == null) {
            charSequenceP = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        return c0034n3Xc != null ? c0034n3Xc.xc(charSequenceP).y() : a.t(charSequenceP);
    }

    @Override // b0.s
    public b0.c5 c(byte[] bArr, int i, boolean z) throws b0.f {
        this.f6488xc.o(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f6488xc.y() > 0) {
            if (this.f6488xc.y() < 8) {
                throw new b0.f("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iP = this.f6488xc.p();
            if (this.f6488xc.p() == 1987343459) {
                arrayList.add(fh(this.f6488xc, iP - 8));
            } else {
                this.f6488xc.ut(iP - 8);
            }
        }
        return new n3(arrayList);
    }
}
