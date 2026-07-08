package k0;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b0.c5;
import b0.f;
import b0.n3;
import b0.s;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import g4.v;
import java.nio.charset.Charset;
import java.util.List;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final String f5979co;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public final int f5980mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5981p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5982r;
    public final boolean w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final d f5983xc;
    public final float z;

    public y(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f5983xc = new d();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f5981p = 0;
            this.f5980mt = -1;
            this.f5979co = "sans-serif";
            this.w = false;
            this.z = 0.85f;
            this.f5982r = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f5981p = bArr[24];
        this.f5980mt = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f5979co = "Serif".equals(ut.ta(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f5982r = i;
        boolean z = (bArr[0] & 32) != 0;
        this.w = z;
        if (z) {
            this.z = ut.w(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.z = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, String str, int i, int i5) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i5, 16711713);
        }
    }

    public static void mg(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i8, int i10, int i11) {
        if (i != i5) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i8, i10, i11 | 33);
        }
    }

    public static void rz(boolean z) throws f {
        if (!z) {
            throw new f("Unexpected subtitle format.");
        }
    }

    public static void ta(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i8, int i10, int i11) {
        if (i != i5) {
            int i12 = i11 | 33;
            boolean z = (i & 1) != 0;
            boolean z5 = (i & 2) != 0;
            if (z) {
                if (z5) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i8, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i8, i10, i12);
                }
            } else if (z5) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i8, i10, i12);
            }
            boolean z7 = (i & 4) != 0;
            if (z7) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i10, i12);
            }
            if (z7 || z || z5) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i8, i10, i12);
        }
    }

    public static String z6(d dVar) throws f {
        rz(dVar.y() >= 2);
        int iYt = dVar.yt();
        if (iYt == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        int iA = dVar.a();
        Charset charsetHw = dVar.hw();
        int iA2 = iYt - (dVar.a() - iA);
        if (charsetHw == null) {
            charsetHw = v.zn;
        }
        return dVar.d(iA2, charsetHw);
    }

    @Override // b0.s
    public c5 c(byte[] bArr, int i, boolean z) throws f {
        this.f5983xc.o(bArr, i);
        String strZ6 = z6(this.f5983xc);
        if (strZ6.isEmpty()) {
            return n3.f5978v;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZ6);
        ta(spannableStringBuilder, this.f5981p, 0, 0, spannableStringBuilder.length(), 16711680);
        mg(spannableStringBuilder, this.f5980mt, -1, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.f5979co, 0, spannableStringBuilder.length());
        float fW = this.z;
        while (this.f5983xc.y() >= 8) {
            int iA = this.f5983xc.a();
            int iP = this.f5983xc.p();
            int iP2 = this.f5983xc.p();
            if (iP2 == 1937013100) {
                rz(this.f5983xc.y() >= 2);
                int iYt = this.f5983xc.yt();
                for (int i5 = 0; i5 < iYt; i5++) {
                    fh(this.f5983xc, spannableStringBuilder);
                }
            } else if (iP2 == 1952608120 && this.w) {
                rz(this.f5983xc.y() >= 2);
                fW = ut.w(this.f5983xc.yt() / this.f5982r, 0.0f, 0.95f);
            }
            this.f5983xc.oz(iA + iP);
        }
        return new n3(new n3.C0034n3().xc(spannableStringBuilder).s(fW, 0).c5(0).y());
    }

    public final void fh(d dVar, SpannableStringBuilder spannableStringBuilder) throws f {
        rz(dVar.y() >= 12);
        int iYt = dVar.yt();
        int iYt2 = dVar.yt();
        dVar.ut(2);
        int iEj = dVar.ej();
        dVar.ut(1);
        int iP = dVar.p();
        if (iYt2 > spannableStringBuilder.length()) {
            r.c5("Tx3gDecoder", "Truncating styl end (" + iYt2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iYt2 = spannableStringBuilder.length();
        }
        if (iYt < iYt2) {
            int i = iYt2;
            ta(spannableStringBuilder, iEj, this.f5981p, iYt, i, 0);
            mg(spannableStringBuilder, iP, this.f5980mt, iYt, i, 0);
            return;
        }
        r.c5("Tx3gDecoder", "Ignoring styl with start (" + iYt + ") >= end (" + iYt2 + ").");
    }
}
