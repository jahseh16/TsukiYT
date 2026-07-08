package ak1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.Reader;
import hk1.en;
import hk1.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public static final zn[] n3;
    public static final gv y;
    public static final Map<hk1.s, Integer> zn;

    static {
        gv gvVar = new gv();
        y = gvVar;
        zn znVar = new zn(zn.f195i9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        hk1.s sVar = zn.f193fb;
        zn znVar2 = new zn(sVar, "GET");
        zn znVar3 = new zn(sVar, "POST");
        hk1.s sVar2 = zn.f196s;
        zn znVar4 = new zn(sVar2, "/");
        zn znVar5 = new zn(sVar2, "/index.html");
        hk1.s sVar3 = zn.f192c5;
        zn znVar6 = new zn(sVar3, "http");
        zn znVar7 = new zn(sVar3, "https");
        hk1.s sVar4 = zn.f191a;
        n3 = new zn[]{znVar, znVar2, znVar3, znVar4, znVar5, znVar6, znVar7, new zn(sVar4, "200"), new zn(sVar4, "204"), new zn(sVar4, "206"), new zn(sVar4, "304"), new zn(sVar4, "400"), new zn(sVar4, "404"), new zn(sVar4, "500"), new zn("accept-charset", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("accept-encoding", "gzip, deflate"), new zn("accept-language", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("accept-ranges", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("accept", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("access-control-allow-origin", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("age", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("allow", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("authorization", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("cache-control", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("content-disposition", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("content-encoding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("content-language", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("content-length", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("content-location", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("content-range", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("content-type", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("cookie", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("date", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("etag", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("expect", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("expires", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("from", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("host", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("if-match", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("if-modified-since", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("if-none-match", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("if-range", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("if-unmodified-since", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("last-modified", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("link", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("location", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("max-forwards", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("proxy-authenticate", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("proxy-authorization", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("range", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("referer", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("refresh", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("retry-after", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("server", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("set-cookie", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("strict-transport-security", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("transfer-encoding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("user-agent", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("vary", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("via", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING), new zn("www-authenticate", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING)};
        zn = gvVar.gv();
    }

    public final Map<hk1.s, Integer> gv() {
        zn[] znVarArr = n3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(znVarArr.length);
        int length = znVarArr.length;
        int i = 0;
        while (i < length) {
            int i5 = i + 1;
            zn[] znVarArr2 = n3;
            if (!linkedHashMap.containsKey(znVarArr2[i].y)) {
                linkedHashMap.put(znVarArr2[i].y, Integer.valueOf(i));
            }
            i = i5;
        }
        Map<hk1.s, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final Map<hk1.s, Integer> n3() {
        return zn;
    }

    public final hk1.s y(hk1.s name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iCt = name.ct();
        int i = 0;
        while (i < iCt) {
            int i5 = i + 1;
            byte bW = name.w(i);
            if (65 <= bW && bW <= 90) {
                throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", name.yg()));
            }
            i = i5;
        }
        return name;
    }

    public final zn[] zn() {
        return n3;
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f161fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final hk1.fb f162gv;
        public int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f163s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public zn[] f164v;
        public final int y;
        public final List<zn> zn;

        public y(en source, int i, int i5) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.y = i;
            this.n3 = i5;
            this.zn = new ArrayList();
            this.f162gv = x.gv(source);
            this.f164v = new zn[8];
            this.f160a = r2.length - 1;
        }

        public final hk1.s a(int i) throws IOException {
            if (s(i)) {
                return gv.y.zn()[i].y;
            }
            int iZn = zn(i - gv.y.zn().length);
            if (iZn >= 0) {
                zn[] znVarArr = this.f164v;
                if (iZn < znVarArr.length) {
                    zn znVar = znVarArr[iZn];
                    Intrinsics.checkNotNull(znVar);
                    return znVar.y;
                }
            }
            throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i + 1)));
        }

        public final int c5() throws IOException {
            return tj1.gv.gv(this.f162gv.readByte(), 255);
        }

        public final void f() throws IOException {
            while (!this.f162gv.dm()) {
                int iGv = tj1.gv.gv(this.f162gv.readByte(), 255);
                if (iGv == 128) {
                    throw new IOException("index == 0");
                }
                if ((iGv & 128) == 128) {
                    t(tl(iGv, 127) - 1);
                } else if (iGv == 64) {
                    xc();
                } else if ((iGv & 64) == 64) {
                    wz(tl(iGv, 63) - 1);
                } else if ((iGv & 32) == 32) {
                    int iTl = tl(iGv, 31);
                    this.n3 = iTl;
                    if (iTl < 0 || iTl > this.y) {
                        throw new IOException(Intrinsics.stringPlus("Invalid dynamic table size update ", Integer.valueOf(this.n3)));
                    }
                    y();
                } else if (iGv == 16 || iGv == 0) {
                    p();
                } else {
                    w(tl(iGv, 15) - 1);
                }
            }
        }

        public final void fb(int i, zn znVar) {
            this.zn.add(znVar);
            int i5 = znVar.zn;
            if (i != -1) {
                zn znVar2 = this.f164v[zn(i)];
                Intrinsics.checkNotNull(znVar2);
                i5 -= znVar2.zn;
            }
            int i8 = this.n3;
            if (i5 > i8) {
                n3();
                return;
            }
            int iGv = gv((this.f163s + i5) - i8);
            if (i == -1) {
                int i10 = this.f161fb + 1;
                zn[] znVarArr = this.f164v;
                if (i10 > znVarArr.length) {
                    zn[] znVarArr2 = new zn[znVarArr.length * 2];
                    System.arraycopy(znVarArr, 0, znVarArr2, znVarArr.length, znVarArr.length);
                    this.f160a = this.f164v.length - 1;
                    this.f164v = znVarArr2;
                }
                int i11 = this.f160a;
                this.f160a = i11 - 1;
                this.f164v[i11] = znVar;
                this.f161fb++;
            } else {
                this.f164v[i + zn(i) + iGv] = znVar;
            }
            this.f163s += i5;
        }

        public final int gv(int i) {
            int i5;
            int i8 = 0;
            if (i > 0) {
                int length = this.f164v.length;
                while (true) {
                    length--;
                    i5 = this.f160a;
                    if (length < i5 || i <= 0) {
                        break;
                    }
                    zn znVar = this.f164v[length];
                    Intrinsics.checkNotNull(znVar);
                    int i10 = znVar.zn;
                    i -= i10;
                    this.f163s -= i10;
                    this.f161fb--;
                    i8++;
                }
                zn[] znVarArr = this.f164v;
                System.arraycopy(znVarArr, i5 + 1, znVarArr, i5 + 1 + i8, this.f161fb);
                this.f160a += i8;
            }
            return i8;
        }

        public final hk1.s i9() throws IOException {
            int iC5 = c5();
            boolean z = (iC5 & 128) == 128;
            long jTl = tl(iC5, 127);
            if (!z) {
                return this.f162gv.q9(jTl);
            }
            hk1.a vVar = new hk1.v();
            f.y.n3(this.f162gv, jTl, vVar);
            return vVar.s8();
        }

        public final void n3() {
            ArraysKt.fill$default(this.f164v, null, 0, 0, 6, null);
            this.f160a = this.f164v.length - 1;
            this.f161fb = 0;
            this.f163s = 0;
        }

        public final void p() throws IOException {
            this.zn.add(new zn(gv.y.y(i9()), i9()));
        }

        public final boolean s(int i) {
            return i >= 0 && i <= gv.y.zn().length - 1;
        }

        public final void t(int i) throws IOException {
            if (s(i)) {
                this.zn.add(gv.y.zn()[i]);
                return;
            }
            int iZn = zn(i - gv.y.zn().length);
            if (iZn >= 0) {
                zn[] znVarArr = this.f164v;
                if (iZn < znVarArr.length) {
                    List<zn> list = this.zn;
                    zn znVar = znVarArr[iZn];
                    Intrinsics.checkNotNull(znVar);
                    list.add(znVar);
                    return;
                }
            }
            throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i + 1)));
        }

        public final int tl(int i, int i5) throws IOException {
            int i8 = i & i5;
            if (i8 < i5) {
                return i8;
            }
            int i10 = 0;
            while (true) {
                int iC5 = c5();
                if ((iC5 & 128) == 0) {
                    return i5 + (iC5 << i10);
                }
                i5 += (iC5 & 127) << i10;
                i10 += 7;
            }
        }

        public final List<zn> v() {
            List<zn> list = CollectionsKt.toList(this.zn);
            this.zn.clear();
            return list;
        }

        public final void w(int i) throws IOException {
            this.zn.add(new zn(a(i), i9()));
        }

        public final void wz(int i) throws IOException {
            fb(-1, new zn(a(i), i9()));
        }

        public final void xc() throws IOException {
            fb(-1, new zn(gv.y.y(i9()), i9()));
        }

        public final void y() {
            int i = this.n3;
            int i5 = this.f163s;
            if (i < i5) {
                if (i == 0) {
                    n3();
                } else {
                    gv(i5 - i);
                }
            }
        }

        public final int zn(int i) {
            return this.f160a + 1 + i;
        }

        public /* synthetic */ y(en enVar, int i, int i5, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this(enVar, i, (i8 & 4) != 0 ? i : i5);
        }
    }

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f154c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public zn[] f155fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f156gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f157i9;
        public final boolean n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f158s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f159v;
        public int y;
        public final hk1.v zn;

        public n3(int i, boolean z, hk1.v out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.y = i;
            this.n3 = z;
            this.zn = out;
            this.f156gv = Reader.READ_DONE;
            this.f153a = i;
            this.f155fb = new zn[8];
            this.f158s = r2.length - 1;
        }

        public final void a(hk1.s data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.n3) {
                f fVar = f.y;
                if (fVar.gv(data) < data.ct()) {
                    hk1.v vVar = new hk1.v();
                    fVar.zn(data, vVar);
                    hk1.s sVarS8 = vVar.s8();
                    s(sVarS8.ct(), 127, 128);
                    this.zn.m(sVarS8);
                    return;
                }
            }
            s(data.ct(), 127, 0);
            this.zn.m(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void fb(java.util.List<ak1.zn> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ak1.gv.n3.fb(java.util.List):void");
        }

        public final void gv(zn znVar) {
            int i = znVar.zn;
            int i5 = this.f153a;
            if (i > i5) {
                n3();
                return;
            }
            zn((this.f157i9 + i) - i5);
            int i8 = this.f154c5 + 1;
            zn[] znVarArr = this.f155fb;
            if (i8 > znVarArr.length) {
                zn[] znVarArr2 = new zn[znVarArr.length * 2];
                System.arraycopy(znVarArr, 0, znVarArr2, znVarArr.length, znVarArr.length);
                this.f158s = this.f155fb.length - 1;
                this.f155fb = znVarArr2;
            }
            int i10 = this.f158s;
            this.f158s = i10 - 1;
            this.f155fb[i10] = znVar;
            this.f154c5++;
            this.f157i9 += i;
        }

        public final void n3() {
            ArraysKt.fill$default(this.f155fb, null, 0, 0, 6, null);
            this.f158s = this.f155fb.length - 1;
            this.f154c5 = 0;
            this.f157i9 = 0;
        }

        public final void s(int i, int i5, int i8) {
            if (i < i5) {
                this.zn.tg(i | i8);
                return;
            }
            this.zn.tg(i8 | i5);
            int i10 = i - i5;
            while (i10 >= 128) {
                this.zn.tg(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.zn.tg(i10);
        }

        public final void v(int i) {
            this.y = i;
            int iMin = Math.min(i, 16384);
            int i5 = this.f153a;
            if (i5 == iMin) {
                return;
            }
            if (iMin < i5) {
                this.f156gv = Math.min(this.f156gv, iMin);
            }
            this.f159v = true;
            this.f153a = iMin;
            y();
        }

        public final void y() {
            int i = this.f153a;
            int i5 = this.f157i9;
            if (i < i5) {
                if (i == 0) {
                    n3();
                } else {
                    zn(i5 - i);
                }
            }
        }

        public final int zn(int i) {
            int i5;
            int i8 = 0;
            if (i > 0) {
                int length = this.f155fb.length;
                while (true) {
                    length--;
                    i5 = this.f158s;
                    if (length < i5 || i <= 0) {
                        break;
                    }
                    zn znVar = this.f155fb[length];
                    Intrinsics.checkNotNull(znVar);
                    i -= znVar.zn;
                    int i10 = this.f157i9;
                    zn znVar2 = this.f155fb[length];
                    Intrinsics.checkNotNull(znVar2);
                    this.f157i9 = i10 - znVar2.zn;
                    this.f154c5--;
                    i8++;
                }
                zn[] znVarArr = this.f155fb;
                System.arraycopy(znVarArr, i5 + 1, znVarArr, i5 + 1 + i8, this.f154c5);
                zn[] znVarArr2 = this.f155fb;
                int i11 = this.f158s;
                Arrays.fill(znVarArr2, i11 + 1, i11 + 1 + i8, (Object) null);
                this.f158s += i8;
            }
            return i8;
        }

        public /* synthetic */ n3(int i, boolean z, hk1.v vVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 4096 : i, (i5 & 2) != 0 ? true : z, vVar);
        }
    }
}
