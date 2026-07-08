package nr;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b1.d0;
import b1.fh;
import b1.ta;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import ft.q;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.d;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class z implements b1.t {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Pattern f7070fb = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f7071s = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7072a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public b1.wz f7073gv;
    public final hw n3;

    @Nullable
    public final String y;
    public final d zn = new d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f7074v = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];

    public z(@Nullable String str, hw hwVar) {
        this.y = str;
        this.n3 = hwVar;
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, d0 d0Var) throws IOException {
        v0.y.v(this.f7073gv);
        int length = (int) tlVar.getLength();
        int i = this.f7072a;
        byte[] bArr = this.f7074v;
        if (i == bArr.length) {
            this.f7074v = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f7074v;
        int i5 = this.f7072a;
        int i8 = tlVar.read(bArr2, i5, bArr2.length - i5);
        if (i8 != -1) {
            int i10 = this.f7072a + i8;
            this.f7072a = i10;
            if (length == -1 || i10 != length) {
                return 0;
            }
        }
        v();
        return -1;
    }

    @Override // b1.t
    public boolean gv(b1.tl tlVar) throws IOException {
        tlVar.v(this.f7074v, 0, 6, false);
        this.zn.o(this.f7074v, 6);
        if (m0.c5.n3(this.zn)) {
            return true;
        }
        tlVar.v(this.f7074v, 6, 3, false);
        this.zn.o(this.f7074v, 9);
        return m0.c5.n3(this.zn);
    }

    public final ta n3(long j) {
        ta taVarA = this.f7073gv.a(0, 3);
        taVarA.y(new g.n3().o4("text/vtt").k(this.y).nf(j).z6());
        this.f7073gv.p();
        return taVarA;
    }

    public final void v() throws q {
        d dVar = new d(this.f7074v);
        m0.c5.v(dVar);
        long jA = 0;
        long jGv = 0;
        for (String strCo = dVar.co(); !TextUtils.isEmpty(strCo); strCo = dVar.co()) {
            if (strCo.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f7070fb.matcher(strCo);
                if (!matcher.find()) {
                    throw q.y("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strCo, null);
                }
                Matcher matcher2 = f7071s.matcher(strCo);
                if (!matcher2.find()) {
                    throw q.y("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strCo, null);
                }
                jGv = m0.c5.gv((String) v0.y.v(matcher.group(1)));
                jA = hw.a(Long.parseLong((String) v0.y.v(matcher2.group(1))));
            }
        }
        Matcher matcherY = m0.c5.y(dVar);
        if (matcherY == null) {
            n3(0L);
            return;
        }
        long jGv2 = m0.c5.gv((String) v0.y.v(matcherY.group(1)));
        long jN3 = this.n3.n3(hw.i9((jA + jGv2) - jGv));
        ta taVarN3 = n3(jN3 - jGv2);
        this.zn.o(this.f7074v, this.f7072a);
        taVarN3.n3(this.zn, this.f7072a);
        taVarN3.a(jN3, 1, this.f7072a, 0, null);
    }

    @Override // b1.t
    public void y(long j, long j4) {
        throw new IllegalStateException();
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.f7073gv = wzVar;
        wzVar.z(new fh.n3(-9223372036854775807L));
    }

    @Override // b1.t
    public void release() {
    }
}
