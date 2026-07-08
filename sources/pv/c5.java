package pv;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import pv.wz;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class c5 extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7387t = true;
    public long w = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public gv f7386p = null;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // pv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<pv.wz.gv> e(org.xmlpull.v1.XmlPullParser r22, long r23, long r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            boolean r0 = r9.f7387t
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L19
            long r0 = r9.w
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
        L1b:
            r14 = 0
            r2 = r0
            r4 = r12
            r0 = 0
            r6 = 0
        L20:
            r22.next()
            java.lang.String r1 = "S"
            boolean r1 = v0.q9.a(r10, r1)
            if (r1 == 0) goto L53
            java.lang.String r1 = "t"
            long r15 = pv.a.k(r10, r1, r12)
            if (r0 == 0) goto L3b
            r0 = r21
            r1 = r11
            r7 = r15
            long r2 = r0.n3(r1, r2, r4, r6, r7)
        L3b:
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 == 0) goto L40
            goto L41
        L40:
            r15 = r2
        L41:
            java.lang.String r0 = "d"
            long r0 = pv.a.k(r10, r0, r12)
            java.lang.String r2 = "r"
            int r2 = pv.a.oz(r10, r2, r14)
            r3 = 1
            r4 = r0
            r6 = r2
            r2 = r15
            r0 = 1
            goto L56
        L53:
            pv.a.i4(r22)
        L56:
            java.lang.String r1 = "SegmentTimeline"
            boolean r1 = v0.q9.gv(r10, r1)
            if (r1 == 0) goto L20
            if (r0 == 0) goto L70
            r19 = 1000(0x3e8, double:4.94E-321)
            r15 = r25
            r17 = r23
            long r7 = v0.ut.x5(r15, r17, r19)
            r0 = r21
            r1 = r11
            r0.n3(r1, r2, r4, r6, r7)
        L70:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.c5.e(org.xmlpull.v1.XmlPullParser, long, long):java.util.List");
    }

    @Override // pv.a, r0.z6.y
    /* JADX INFO: renamed from: f3 */
    public zn y(Uri uri, InputStream inputStream) throws IOException {
        zn znVarY = super.y(uri, inputStream);
        gv gvVar = this.f7386p;
        if (gvVar != null) {
            return gvVar.n3(znVarY);
        }
        this.f7386p = new gv(znVarY);
        return znVarY;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x020e A[LOOP:0: B:25:0x00a5->B:91:0x020e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc A[SYNTHETIC] */
    @Override // pv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv.zn f7(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.c5.f7(org.xmlpull.v1.XmlPullParser, android.net.Uri):pv.zn");
    }

    public final long n3(List<wz.gv> list, long j, long j4, int i, long j7) {
        int iTl = i >= 0 ? i + 1 : (int) ut.tl(j7 - j, j4);
        for (int i5 = 0; i5 < iTl; i5++) {
            list.add(tl(j, j4));
            j += j4;
        }
        return j;
    }

    public final boolean x4(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }
}
