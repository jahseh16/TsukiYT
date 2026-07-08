package x9;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import b1.d0;
import b1.fh;
import b1.mt;
import b1.p;
import b1.t;
import b1.ta;
import b1.tl;
import b1.wz;
import com.google.android.exoplayer2.drm.DrmInitData;
import ft.c5;
import ft.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import v0.c;
import v0.d;
import v0.r;
import v0.ut;
import v0.x4;

/* JADX INFO: loaded from: classes.dex */
public class v implements t {

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final Map<String, Integer> f9106eb;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f9107a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public int f9108a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9109b;
    public long c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final d f9110c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f9111co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9112d;
    public long d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public long f9113ej;
    public byte en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f9114f;
    public long f3;
    public int f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final d f9115fb;
    public long fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f9116gv;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public int f9117hw;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public int f9118i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final d f9119i9;
    public int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public boolean f9120j5;
    public boolean jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9121k;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public int f9122k5;

    @Nullable
    public x4 mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public long f9123mt;
    public boolean n;
    public final fb n3;
    public int o;
    public int oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9124p;
    public boolean q9;
    public long qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public zn f9125r;

    @Nullable
    public x4 rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f9126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f9127t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public boolean f9128ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final d f9129tl;
    public wz u;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public long f9130ud;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public boolean f9131ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f9132v;
    public int vl;
    public long w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final d f9133wz;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9134x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public boolean f9135x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public ByteBuffer f9136xc;
    public final x9.zn y;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public int f9137yt;
    public long z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public int f9138z6;
    public final SparseArray<zn> zn;
    public static final mt y5 = new mt() { // from class: x9.gv
        @Override // b1.mt
        public final t[] createExtractors() {
            return v.d0();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };
    public static final byte[] xg = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] dm = ut.ap("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] ct = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] o4 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID rs = new UUID(72057594037932032L, -9223371306706625679L);

    public final class n3 implements x9.n3 {
        public n3() {
        }

        @Override // x9.n3
        public boolean a(int i) {
            return v.this.c(i);
        }

        @Override // x9.n3
        public void fb(int i, String str) throws q {
            v.this.ej(i, str);
        }

        @Override // x9.n3
        public void gv(int i, long j) throws q {
            v.this.f3(i, j);
        }

        @Override // x9.n3
        public void n3(int i, double d4) throws q {
            v.this.mt(i, d4);
        }

        @Override // x9.n3
        public void s(int i, long j, long j4) throws q {
            v.this.z6(i, j, j4);
        }

        @Override // x9.n3
        public int v(int i) {
            return v.this.r(i);
        }

        @Override // x9.n3
        public void y(int i) throws q {
            v.this.xc(i);
        }

        @Override // x9.n3
        public void zn(int i, int i5, tl tlVar) throws IOException {
            v.this.t(i, i5, tlVar);
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9139a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public byte[] f9142c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f9146f;
        public int f7;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f9147fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f9148gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public ta.y f9151i9;
        public b1.d j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ta f9153k;
        public String n3;
        public boolean oz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f9158s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DrmInitData f9159t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9164v;
        public String y;

        /* JADX INFO: renamed from: yt, reason: collision with root package name */
        public byte[] f9169yt;
        public int zn;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public int f9161tl = -1;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public int f9165wz = -1;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public int f9168xc = -1;
        public int w = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f9156p = 0;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public int f9155mt = -1;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public float f9143co = 0.0f;
        public float z = 0.0f;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f9157r = 0.0f;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public byte[] f9167x4 = null;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public int f9150i4 = -1;
        public boolean f3 = false;
        public int n = -1;
        public int c = -1;
        public int d0 = -1;
        public int fh = 1000;
        public int rz = 200;
        public float mg = -1.0f;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        public float f9160ta = -1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f9144d = -1.0f;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        public float f9170z6 = -1.0f;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public float f9145ej = -1.0f;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public float f9162ud = -1.0f;

        /* JADX INFO: renamed from: a8, reason: collision with root package name */
        public float f9140a8 = -1.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f9166x = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f9141b = -1.0f;

        /* JADX INFO: renamed from: k5, reason: collision with root package name */
        public float f9154k5 = -1.0f;
        public int vl = 1;

        /* JADX INFO: renamed from: hw, reason: collision with root package name */
        public int f9149hw = -1;

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        public int f9152j5 = 8000;
        public long qn = 0;
        public long o = 0;

        /* JADX INFO: renamed from: ut, reason: collision with root package name */
        public boolean f9163ut = true;
        public String q9 = "eng";

        public static Pair<String, List<byte[]>> f(d dVar) throws q {
            try {
                dVar.ut(16);
                long jF3 = dVar.f3();
                if (jF3 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jF3 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jF3 != 826496599) {
                    r.c5("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrV = dVar.v();
                for (int iA = dVar.a() + 20; iA < bArrV.length - 4; iA++) {
                    if (bArrV[iA] == 0 && bArrV[iA + 1] == 0 && bArrV[iA + 2] == 1 && bArrV[iA + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrV, iA, bArrV.length)));
                    }
                }
                throw q.y("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw q.y("Error parsing FourCC private data", null);
            }
        }

        public static boolean t(d dVar) throws q {
            try {
                int iC = dVar.c();
                if (iC == 1) {
                    return true;
                }
                if (iC != 65534) {
                    return false;
                }
                dVar.oz(24);
                if (dVar.d0() == v.rs.getMostSignificantBits()) {
                    if (dVar.d0() == v.rs.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw q.y("Error parsing MS/ACM codec private", null);
            }
        }

        public static List<byte[]> tl(byte[] bArr) throws q {
            int i;
            int i5;
            try {
                if (bArr[0] != 2) {
                    throw q.y("Error parsing vorbis codec private", null);
                }
                int i8 = 1;
                int i10 = 0;
                while (true) {
                    i = bArr[i8];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i10 += 255;
                    i8++;
                }
                int i11 = i8 + 1;
                int i12 = i10 + (i & 255);
                int i13 = 0;
                while (true) {
                    i5 = bArr[i11];
                    if ((i5 & 255) != 255) {
                        break;
                    }
                    i13 += 255;
                    i11++;
                }
                int i14 = i11 + 1;
                int i15 = i13 + (i5 & 255);
                if (bArr[i14] != 1) {
                    throw q.y("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i14, bArr2, 0, i12);
                int i16 = i14 + i12;
                if (bArr[i16] != 3) {
                    throw q.y("Error parsing vorbis codec private", null);
                }
                int i17 = i16 + i15;
                if (bArr[i17] != 5) {
                    throw q.y("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i17];
                System.arraycopy(bArr, i17, bArr3, 0, bArr.length - i17);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw q.y("Error parsing vorbis codec private", null);
            }
        }

        public final void a() {
            v0.y.v(this.f9153k);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:205:0x042f  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0448  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x044a  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0457  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0469  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0575  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c5(b1.wz r20, int r21) throws ft.q {
            /*
                Method dump skipped, instruction units count: 1674
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x9.v.zn.c5(b1.wz, int):void");
        }

        public final byte[] fb(String str) throws q {
            byte[] bArr = this.f9146f;
            if (bArr != null) {
                return bArr;
            }
            throw q.y("Missing CodecPrivate for codec " + str, null);
        }

        public void i9() {
            b1.d dVar = this.j;
            if (dVar != null) {
                dVar.y(this.f9153k, this.f9151i9);
            }
        }

        @Nullable
        public final byte[] s() {
            if (this.mg == -1.0f || this.f9160ta == -1.0f || this.f9144d == -1.0f || this.f9170z6 == -1.0f || this.f9145ej == -1.0f || this.f9162ud == -1.0f || this.f9140a8 == -1.0f || this.f9166x == -1.0f || this.f9141b == -1.0f || this.f9154k5 == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.mg * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f9160ta * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f9144d * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f9170z6 * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f9145ej * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f9162ud * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f9140a8 * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f9166x * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f9141b + 0.5f));
            byteBufferOrder.putShort((short) (this.f9154k5 + 0.5f));
            byteBufferOrder.putShort((short) this.fh);
            byteBufferOrder.putShort((short) this.rz);
            return bArr;
        }

        public void wz() {
            b1.d dVar = this.j;
            if (dVar != null) {
                dVar.n3();
            }
        }

        public final boolean xc(boolean z) {
            return "A_OPUS".equals(this.n3) ? z : this.f9139a > 0;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f9106eb = Collections.unmodifiableMap(map);
    }

    public v() {
        this(0);
    }

    public static byte[] co(long j, String str, long j4) {
        v0.y.y(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j7 = j - (((long) i) * 3600000000L);
        int i5 = (int) (j7 / 60000000);
        long j8 = j7 - (((long) i5) * 60000000);
        int i8 = (int) (j8 / 1000000);
        return ut.ap(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i8), Integer.valueOf((int) ((j8 - (((long) i8) * 1000000)) / j4))));
    }

    public static void d(String str, long j, byte[] bArr) {
        byte[] bArrCo;
        int i;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                bArrCo = co(j, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrCo = co(j, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                bArrCo = co(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrCo, 0, bArr, i, bArrCo.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t[] d0() {
        return new t[]{new v()};
    }

    private void f() {
        v0.y.c5(this.u);
    }

    public static boolean n(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    public static int[] w(@Nullable int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    public final void a8(tl tlVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f9114f.n3() < length) {
            this.f9114f.qn(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f9114f.v(), 0, bArr.length);
        }
        tlVar.readFully(this.f9114f.v(), bArr.length, i);
        this.f9114f.oz(0);
        this.f9114f.j(length);
    }

    public final void b(tl tlVar, byte[] bArr, int i, int i5) throws IOException {
        int iMin = Math.min(i5, this.f9119i9.y());
        tlVar.readFully(bArr, i + iMin, i5 - iMin);
        if (iMin > 0) {
            this.f9119i9.t(bArr, i, iMin);
        }
    }

    public boolean c(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public final void c5(int i) throws q {
        if (this.rz == null || this.mg == null) {
            throw q.y("Element " + i + " must be in a Cues", null);
        }
    }

    public void ej(int i, String str) throws q {
        if (i == 134) {
            z(i).n3 = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                z(i).y = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                z(i).q9 = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw q.y("DocType " + str + " not supported", null);
    }

    public void f3(int i, long j) throws q {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw q.y("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw q.y("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                z(i).f9148gv = (int) j;
                return;
            case 136:
                z(i).f9163ut = j == 1;
                return;
            case 155:
                this.f9130ud = ta(j);
                return;
            case 159:
                z(i).vl = (int) j;
                return;
            case 176:
                z(i).f9161tl = (int) j;
                return;
            case 179:
                c5(i);
                this.rz.y(ta(j));
                return;
            case 186:
                z(i).f9165wz = (int) j;
                return;
            case 215:
                z(i).zn = (int) j;
                return;
            case 231:
                this.fh = ta(j);
                return;
            case 238:
                this.f9117hw = (int) j;
                return;
            case 241:
                if (this.f9128ta) {
                    return;
                }
                c5(i);
                this.mg.y(j);
                this.f9128ta = true;
                return;
            case 251:
                this.f9120j5 = true;
                return;
            case 16871:
                z(i).f9147fb = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw q.y("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw q.y("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw q.y("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw q.y("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw q.y("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.f3 = j + this.f9124p;
                return;
            case 21432:
                int i5 = (int) j;
                i9(i);
                if (i5 == 0) {
                    this.f9125r.f9150i4 = 0;
                    return;
                }
                if (i5 == 1) {
                    this.f9125r.f9150i4 = 2;
                    return;
                } else if (i5 == 3) {
                    this.f9125r.f9150i4 = 1;
                    return;
                } else {
                    if (i5 != 15) {
                        return;
                    }
                    this.f9125r.f9150i4 = 3;
                    return;
                }
            case 21680:
                z(i).f9168xc = (int) j;
                return;
            case 21682:
                z(i).f9156p = (int) j;
                return;
            case 21690:
                z(i).w = (int) j;
                return;
            case 21930:
                z(i).oz = j == 1;
                return;
            case 21998:
                z(i).f9139a = (int) j;
                return;
            case 22186:
                z(i).qn = j;
                return;
            case 22203:
                z(i).o = j;
                return;
            case 25188:
                z(i).f9149hw = (int) j;
                return;
            case 30114:
                this.qn = j;
                return;
            case 30321:
                i9(i);
                int i8 = (int) j;
                if (i8 == 0) {
                    this.f9125r.f9155mt = 0;
                    return;
                }
                if (i8 == 1) {
                    this.f9125r.f9155mt = 1;
                    return;
                } else if (i8 == 2) {
                    this.f9125r.f9155mt = 2;
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    this.f9125r.f9155mt = 3;
                    return;
                }
            case 2352003:
                z(i).f9164v = (int) j;
                return;
            case 2807729:
                this.f9123mt = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        i9(i);
                        int i10 = (int) j;
                        if (i10 == 1) {
                            this.f9125r.d0 = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.f9125r.d0 = 1;
                            return;
                        }
                    case 21946:
                        i9(i);
                        int iZn = w0.zn.zn((int) j);
                        if (iZn != -1) {
                            this.f9125r.c = iZn;
                            return;
                        }
                        return;
                    case 21947:
                        i9(i);
                        this.f9125r.f3 = true;
                        int iN3 = w0.zn.n3((int) j);
                        if (iN3 != -1) {
                            this.f9125r.n = iN3;
                            return;
                        }
                        return;
                    case 21948:
                        z(i).fh = (int) j;
                        return;
                    case 21949:
                        z(i).rz = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // b1.t
    public final int fb(tl tlVar, d0 d0Var) throws IOException {
        this.f9112d = false;
        boolean zN3 = true;
        while (zN3 && !this.f9112d) {
            zN3 = this.y.n3(tlVar);
            if (zN3 && fh(d0Var, tlVar.getPosition())) {
                return 1;
            }
        }
        if (zN3) {
            return 0;
        }
        for (int i = 0; i < this.zn.size(); i++) {
            zn znVarValueAt = this.zn.valueAt(i);
            znVarValueAt.a();
            znVarValueAt.i9();
        }
        return -1;
    }

    public final boolean fh(d0 d0Var, long j) {
        if (this.n) {
            this.d0 = j;
            d0Var.y = this.c;
            this.n = false;
            return true;
        }
        if (this.f9135x4) {
            long j4 = this.d0;
            if (j4 != -1) {
                d0Var.y = j4;
                this.d0 = -1L;
                return true;
            }
        }
        return false;
    }

    @Override // b1.t
    public final boolean gv(tl tlVar) throws IOException {
        return new a().n3(tlVar);
    }

    public void i4(zn znVar, int i, tl tlVar, int i5) throws IOException {
        if (i != 4 || !"V_VP9".equals(znVar.n3)) {
            tlVar.w(i5);
        } else {
            this.f9133wz.j5(i5);
            tlVar.readFully(this.f9133wz.v(), 0, i5);
        }
    }

    public final void i9(int i) throws q {
        if (this.f9125r != null) {
            return;
        }
        throw q.y("Element " + i + " must be in a TrackEntry", null);
    }

    public final void mg() {
        this.o = 0;
        this.j = 0;
        this.oz = 0;
        this.f9131ut = false;
        this.q9 = false;
        this.f9121k = false;
        this.f7 = 0;
        this.en = (byte) 0;
        this.jz = false;
        this.f9119i9.j5(0);
    }

    public void mt(int i, double d4) throws q {
        if (i == 181) {
            z(i).f9152j5 = (int) d4;
        }
        if (i == 17545) {
            this.f9111co = (long) d4;
            return;
        }
        switch (i) {
            case 21969:
                z(i).mg = (float) d4;
                break;
            case 21970:
                z(i).f9160ta = (float) d4;
                break;
            case 21971:
                z(i).f9144d = (float) d4;
                break;
            case 21972:
                z(i).f9170z6 = (float) d4;
                break;
            case 21973:
                z(i).f9145ej = (float) d4;
                break;
            case 21974:
                z(i).f9162ud = (float) d4;
                break;
            case 21975:
                z(i).f9140a8 = (float) d4;
                break;
            case 21976:
                z(i).f9166x = (float) d4;
                break;
            case 21977:
                z(i).f9141b = (float) d4;
                break;
            case 21978:
                z(i).f9154k5 = (float) d4;
                break;
            default:
                switch (i) {
                    case 30323:
                        z(i).f9143co = (float) d4;
                        break;
                    case 30324:
                        z(i).z = (float) d4;
                        break;
                    case 30325:
                        z(i).f9157r = (float) d4;
                        break;
                }
                break;
        }
    }

    public final int p() {
        int i = this.j;
        mg();
        return i;
    }

    public int r(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public final void rz(tl tlVar, int i) throws IOException {
        if (this.f9115fb.fb() >= i) {
            return;
        }
        if (this.f9115fb.n3() < i) {
            d dVar = this.f9115fb;
            dVar.zn(Math.max(dVar.n3() * 2, i));
        }
        tlVar.readFully(this.f9115fb.v(), this.f9115fb.fb(), i - this.f9115fb.fb());
        this.f9115fb.j(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0231, code lost:
    
        throw ft.q.y("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(int r22, int r23, b1.tl r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.v.t(int, int, b1.tl):void");
    }

    public final long ta(long j) throws q {
        long j4 = this.f9123mt;
        if (j4 != -9223372036854775807L) {
            return ut.x5(j, j4, 1000L);
        }
        throw q.y("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final fh tl(@Nullable x4 x4Var, @Nullable x4 x4Var2) {
        int i;
        if (this.f9124p == -1 || this.z == -9223372036854775807L || x4Var == null || x4Var.zn() == 0 || x4Var2 == null || x4Var2.zn() != x4Var.zn()) {
            return new fh.n3(this.z);
        }
        int iZn = x4Var.zn();
        int[] iArrCopyOf = new int[iZn];
        long[] jArrCopyOf = new long[iZn];
        long[] jArrCopyOf2 = new long[iZn];
        long[] jArrCopyOf3 = new long[iZn];
        int i5 = 0;
        for (int i8 = 0; i8 < iZn; i8++) {
            jArrCopyOf3[i8] = x4Var.n3(i8);
            jArrCopyOf[i8] = this.f9124p + x4Var2.n3(i8);
        }
        while (true) {
            i = iZn - 1;
            if (i5 >= i) {
                break;
            }
            int i10 = i5 + 1;
            iArrCopyOf[i5] = (int) (jArrCopyOf[i10] - jArrCopyOf[i5]);
            jArrCopyOf2[i5] = jArrCopyOf3[i10] - jArrCopyOf3[i5];
            i5 = i10;
        }
        iArrCopyOf[i] = (int) ((this.f9124p + this.w) - jArrCopyOf[i]);
        long j = this.z - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            r.c5("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new b1.gv(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    public final int ud(tl tlVar, zn znVar, int i, boolean z) throws IOException {
        int i5;
        if ("S_TEXT/UTF8".equals(znVar.n3)) {
            a8(tlVar, xg, i);
            return p();
        }
        if ("S_TEXT/ASS".equals(znVar.n3)) {
            a8(tlVar, ct, i);
            return p();
        }
        if ("S_TEXT/WEBVTT".equals(znVar.n3)) {
            a8(tlVar, o4, i);
            return p();
        }
        ta taVar = znVar.f9153k;
        if (!this.f9131ut) {
            if (znVar.f9158s) {
                this.vl &= -1073741825;
                if (!this.q9) {
                    tlVar.readFully(this.f9115fb.v(), 0, 1);
                    this.o++;
                    if ((this.f9115fb.v()[0] & 128) == 128) {
                        throw q.y("Extension bit is set in signal byte", null);
                    }
                    this.en = this.f9115fb.v()[0];
                    this.q9 = true;
                }
                byte b4 = this.en;
                if ((b4 & 1) == 1) {
                    boolean z5 = (b4 & 2) == 2;
                    this.vl |= 1073741824;
                    if (!this.jz) {
                        tlVar.readFully(this.f9127t.v(), 0, 8);
                        this.o += 8;
                        this.jz = true;
                        this.f9115fb.v()[0] = (byte) ((z5 ? 128 : 0) | 8);
                        this.f9115fb.oz(0);
                        taVar.zn(this.f9115fb, 1, 1);
                        this.j++;
                        this.f9127t.oz(0);
                        taVar.zn(this.f9127t, 8, 1);
                        this.j += 8;
                    }
                    if (z5) {
                        if (!this.f9121k) {
                            tlVar.readFully(this.f9115fb.v(), 0, 1);
                            this.o++;
                            this.f9115fb.oz(0);
                            this.f7 = this.f9115fb.ej();
                            this.f9121k = true;
                        }
                        int i8 = this.f7 * 4;
                        this.f9115fb.j5(i8);
                        tlVar.readFully(this.f9115fb.v(), 0, i8);
                        this.o += i8;
                        short s3 = (short) ((this.f7 / 2) + 1);
                        int i10 = (s3 * 6) + 2;
                        ByteBuffer byteBuffer = this.f9136xc;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.f9136xc = ByteBuffer.allocate(i10);
                        }
                        this.f9136xc.position(0);
                        this.f9136xc.putShort(s3);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i5 = this.f7;
                            if (i11 >= i5) {
                                break;
                            }
                            int iB = this.f9115fb.b();
                            if (i11 % 2 == 0) {
                                this.f9136xc.putShort((short) (iB - i12));
                            } else {
                                this.f9136xc.putInt(iB - i12);
                            }
                            i11++;
                            i12 = iB;
                        }
                        int i13 = (i - this.o) - i12;
                        if (i5 % 2 == 1) {
                            this.f9136xc.putInt(i13);
                        } else {
                            this.f9136xc.putShort((short) i13);
                            this.f9136xc.putInt(0);
                        }
                        this.f9129tl.o(this.f9136xc.array(), i10);
                        taVar.zn(this.f9129tl, i10, 1);
                        this.j += i10;
                    }
                }
            } else {
                byte[] bArr = znVar.f9142c5;
                if (bArr != null) {
                    this.f9119i9.o(bArr, bArr.length);
                }
            }
            if (znVar.xc(z)) {
                this.vl |= 268435456;
                this.f9133wz.j5(0);
                int iFb = (this.f9119i9.fb() + i) - this.o;
                this.f9115fb.j5(4);
                this.f9115fb.v()[0] = (byte) ((iFb >> 24) & 255);
                this.f9115fb.v()[1] = (byte) ((iFb >> 16) & 255);
                this.f9115fb.v()[2] = (byte) ((iFb >> 8) & 255);
                this.f9115fb.v()[3] = (byte) (iFb & 255);
                taVar.zn(this.f9115fb, 4, 2);
                this.j += 4;
            }
            this.f9131ut = true;
        }
        int iFb2 = i + this.f9119i9.fb();
        if (!"V_MPEG4/ISO/AVC".equals(znVar.n3) && !"V_MPEGH/ISO/HEVC".equals(znVar.n3)) {
            if (znVar.j != null) {
                v0.y.fb(this.f9119i9.fb() == 0);
                znVar.j.gv(tlVar);
            }
            while (true) {
                int i14 = this.o;
                if (i14 >= iFb2) {
                    break;
                }
                int iX = x(tlVar, taVar, iFb2 - i14);
                this.o += iX;
                this.j += iX;
            }
        } else {
            byte[] bArrV = this.f9107a.v();
            bArrV[0] = 0;
            bArrV[1] = 0;
            bArrV[2] = 0;
            int i15 = znVar.f7;
            int i16 = 4 - i15;
            while (this.o < iFb2) {
                int i17 = this.oz;
                if (i17 == 0) {
                    b(tlVar, bArrV, i16, i15);
                    this.o += i15;
                    this.f9107a.oz(0);
                    this.oz = this.f9107a.b();
                    this.f9132v.oz(0);
                    taVar.n3(this.f9132v, 4);
                    this.j += 4;
                } else {
                    int iX2 = x(tlVar, taVar, i17);
                    this.o += iX2;
                    this.j += iX2;
                    this.oz -= iX2;
                }
            }
        }
        if ("A_VORBIS".equals(znVar.n3)) {
            this.f9126s.oz(0);
            taVar.n3(this.f9126s, 4);
            this.j += 4;
        }
        return p();
    }

    public final void wz(zn znVar, long j, int i, int i5, int i8) {
        b1.d dVar = znVar.j;
        if (dVar != null) {
            dVar.zn(znVar.f9153k, j, i, i5, i8, znVar.f9151i9);
        } else {
            if ("S_TEXT/UTF8".equals(znVar.n3) || "S_TEXT/ASS".equals(znVar.n3) || "S_TEXT/WEBVTT".equals(znVar.n3)) {
                if (this.f9134x > 1) {
                    r.c5("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j4 = this.f9130ud;
                    if (j4 == -9223372036854775807L) {
                        r.c5("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        d(znVar.n3, j4, this.f9114f.v());
                        int iA = this.f9114f.a();
                        while (true) {
                            if (iA >= this.f9114f.fb()) {
                                break;
                            }
                            if (this.f9114f.v()[iA] == 0) {
                                this.f9114f.j(iA);
                                break;
                            }
                            iA++;
                        }
                        ta taVar = znVar.f9153k;
                        d dVar2 = this.f9114f;
                        taVar.n3(dVar2, dVar2.fb());
                        i5 += this.f9114f.fb();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f9134x > 1) {
                    this.f9133wz.j5(0);
                } else {
                    int iFb = this.f9133wz.fb();
                    znVar.f9153k.zn(this.f9133wz, iFb, 2);
                    i5 += iFb;
                }
            }
            znVar.f9153k.a(j, i, i5, i8, znVar.f9151i9);
        }
        this.f9112d = true;
    }

    public final int x(tl tlVar, ta taVar, int i) throws IOException {
        int iY = this.f9119i9.y();
        if (iY <= 0) {
            return taVar.v(tlVar, i, false);
        }
        int iMin = Math.min(i, iY);
        taVar.n3(this.f9119i9, iMin);
        return iMin;
    }

    public void x4(zn znVar, tl tlVar, int i) throws IOException {
        if (znVar.f9147fb != 1685485123 && znVar.f9147fb != 1685480259) {
            tlVar.w(i);
            return;
        }
        byte[] bArr = new byte[i];
        znVar.f9169yt = bArr;
        tlVar.readFully(bArr, 0, i);
    }

    public void xc(int i) throws q {
        f();
        if (i == 160) {
            if (this.f9138z6 != 2) {
                return;
            }
            zn znVar = this.zn.get(this.f9122k5);
            znVar.a();
            if (this.qn > 0 && "A_OPUS".equals(znVar.n3)) {
                this.f9133wz.qn(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.qn).array());
            }
            int i5 = 0;
            for (int i8 = 0; i8 < this.f9134x; i8++) {
                i5 += this.f9109b[i8];
            }
            int i10 = 0;
            while (i10 < this.f9134x) {
                long j = this.f9113ej + ((long) ((znVar.f9164v * i10) / 1000));
                int i11 = this.vl;
                if (i10 == 0 && !this.f9120j5) {
                    i11 |= 1;
                }
                int i12 = this.f9109b[i10];
                int i13 = i5 - i12;
                wz(znVar, j, i11, i12, i13);
                i10++;
                i5 = i13;
            }
            this.f9138z6 = 0;
            return;
        }
        if (i == 174) {
            zn znVar2 = (zn) v0.y.c5(this.f9125r);
            String str = znVar2.n3;
            if (str == null) {
                throw q.y("CodecId is missing in TrackEntry element", null);
            }
            if (n(str)) {
                znVar2.c5(this.u, znVar2.zn);
                this.zn.put(znVar2.zn, znVar2);
            }
            this.f9125r = null;
            return;
        }
        if (i == 19899) {
            int i14 = this.f9118i4;
            if (i14 != -1) {
                long j4 = this.f3;
                if (j4 != -1) {
                    if (i14 == 475249515) {
                        this.c = j4;
                        return;
                    }
                    return;
                }
            }
            throw q.y("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            i9(i);
            zn znVar3 = this.f9125r;
            if (znVar3.f9158s) {
                if (znVar3.f9151i9 == null) {
                    throw q.y("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                znVar3.f9159t = new DrmInitData(new DrmInitData.SchemeData(c5.y, "video/webm", this.f9125r.f9151i9.n3));
                return;
            }
            return;
        }
        if (i == 28032) {
            i9(i);
            zn znVar4 = this.f9125r;
            if (znVar4.f9158s && znVar4.f9142c5 != null) {
                throw q.y("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.f9123mt == -9223372036854775807L) {
                this.f9123mt = 1000000L;
            }
            long j7 = this.f9111co;
            if (j7 != -9223372036854775807L) {
                this.z = ta(j7);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.zn.size() == 0) {
                throw q.y("No valid tracks were found", null);
            }
            this.u.p();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.f9135x4) {
                this.u.z(tl(this.rz, this.mg));
                this.f9135x4 = true;
            }
            this.rz = null;
            this.mg = null;
        }
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.fh = -9223372036854775807L;
        this.f9138z6 = 0;
        this.y.y();
        this.n3.v();
        mg();
        for (int i = 0; i < this.zn.size(); i++) {
            this.zn.valueAt(i).wz();
        }
    }

    public zn z(int i) throws q {
        i9(i);
        return this.f9125r;
    }

    public void z6(int i, long j, long j4) throws q {
        f();
        if (i == 160) {
            this.f9120j5 = false;
            this.qn = 0L;
            return;
        }
        if (i == 174) {
            this.f9125r = new zn();
            return;
        }
        if (i == 187) {
            this.f9128ta = false;
            return;
        }
        if (i == 19899) {
            this.f9118i4 = -1;
            this.f3 = -1L;
            return;
        }
        if (i == 20533) {
            z(i).f9158s = true;
            return;
        }
        if (i == 21968) {
            z(i).f3 = true;
            return;
        }
        if (i == 408125543) {
            long j7 = this.f9124p;
            if (j7 != -1 && j7 != j) {
                throw q.y("Multiple Segment elements not supported", null);
            }
            this.f9124p = j;
            this.w = j4;
            return;
        }
        if (i == 475249515) {
            this.rz = new x4();
            this.mg = new x4();
        } else if (i == 524531317 && !this.f9135x4) {
            if (this.f9116gv && this.c != -1) {
                this.n = true;
            } else {
                this.u.z(new fh.n3(this.z));
                this.f9135x4 = true;
            }
        }
    }

    @Override // b1.t
    public final void zn(wz wzVar) {
        this.u = wzVar;
    }

    public v(int i) {
        this(new x9.y(), i);
    }

    public v(x9.zn znVar, int i) {
        this.f9124p = -1L;
        this.f9123mt = -9223372036854775807L;
        this.f9111co = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.c = -1L;
        this.d0 = -1L;
        this.fh = -9223372036854775807L;
        this.y = znVar;
        znVar.zn(new n3());
        this.f9116gv = (i & 1) == 0;
        this.n3 = new fb();
        this.zn = new SparseArray<>();
        this.f9115fb = new d(4);
        this.f9126s = new d(ByteBuffer.allocate(4).putInt(-1).array());
        this.f9110c5 = new d(4);
        this.f9132v = new d(c.y);
        this.f9107a = new d(4);
        this.f9119i9 = new d();
        this.f9114f = new d();
        this.f9127t = new d(8);
        this.f9129tl = new d();
        this.f9133wz = new d();
        this.f9109b = new int[1];
    }

    @Override // b1.t
    public final void release() {
    }
}
