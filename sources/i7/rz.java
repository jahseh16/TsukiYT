package i7;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.internal.Code;
import ft.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class rz {
    public static final Pattern y = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<n3, List<z>> n3 = new HashMap<>();
    public static int zn = -1;

    public static final class a implements gv {

        @Nullable
        public MediaCodecInfo[] n3;
        public final int y;

        public a(boolean z, boolean z5) {
            this.y = (z || z5) ? 1 : 0;
        }

        public final void a() {
            if (this.n3 == null) {
                this.n3 = new MediaCodecList(this.y).getCodecInfos();
            }
        }

        @Override // i7.rz.gv
        public int gv() {
            a();
            return this.n3.length;
        }

        @Override // i7.rz.gv
        public boolean n3(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // i7.rz.gv
        public boolean v() {
            return true;
        }

        @Override // i7.rz.gv
        public MediaCodecInfo y(int i) {
            a();
            return this.n3[i];
        }

        @Override // i7.rz.gv
        public boolean zn(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    public interface fb<T> {
        int getScore(T t3);
    }

    public interface gv {
        int gv();

        boolean n3(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean v();

        MediaCodecInfo y(int i);

        boolean zn(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    public static final class n3 {
        public final boolean n3;
        public final String y;
        public final boolean zn;

        public n3(String str, boolean z, boolean z5) {
            this.y = str;
            this.n3 = z;
            this.zn = z5;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != n3.class) {
                return false;
            }
            n3 n3Var = (n3) obj;
            return TextUtils.equals(this.y, n3Var.y) && this.n3 == n3Var.n3 && this.zn == n3Var.zn;
        }

        public int hashCode() {
            return ((((this.y.hashCode() + 31) * 31) + (this.n3 ? 1231 : 1237)) * 31) + (this.zn ? 1231 : 1237);
        }
    }

    public static final class v implements gv {
        public v() {
        }

        @Override // i7.rz.gv
        public int gv() {
            return MediaCodecList.getCodecCount();
        }

        @Override // i7.rz.gv
        public boolean n3(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // i7.rz.gv
        public boolean v() {
            return false;
        }

        @Override // i7.rz.gv
        public MediaCodecInfo y(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // i7.rz.gv
        public boolean zn(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }
    }

    public static class zn extends Exception {
        public zn(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return NotificationCompat.FLAG_LOCAL_ONLY;
            case 9:
                return NotificationCompat.FLAG_GROUP_SUMMARY;
            case 10:
                return UserMetadata.MAX_ATTRIBUTE_SIZE;
            case 11:
                return 2048;
            case Code.UNIMPLEMENTED /* 12 */:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return 131072;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return 262144;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return 524288;
            case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                return 1048576;
            case 21:
                return 2097152;
            case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                return 4194304;
            case ConnectionResult.API_DISABLED /* 23 */:
                return 8388608;
            default:
                return -1;
        }
    }

    public static /* synthetic */ int a8(z zVar) {
        String str = zVar.y;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (ut.y >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int b(g gVar, z zVar) {
        return zVar.w(gVar) ? 1 : 0;
    }

    @Nullable
    public static Integer c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static int c5(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    public static synchronized List<z> co(String str, boolean z, boolean z5) throws zn {
        try {
            n3 n3Var = new n3(str, z, z5);
            HashMap<n3, List<z>> map = n3;
            List<z> list = map.get(n3Var);
            if (list != null) {
                return list;
            }
            int i = ut.y;
            ArrayList<z> arrayListZ = z(n3Var, i >= 21 ? new a(z, z5) : new v());
            if (z && arrayListZ.isEmpty() && 21 <= i && i <= 23) {
                arrayListZ = z(n3Var, new v());
                if (!arrayListZ.isEmpty()) {
                    v0.r.c5("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListZ.get(0).y);
                }
            }
            v(str, arrayListZ);
            k4.r rVarRz = k4.r.rz(arrayListZ);
            map.put(n3Var, rVarRz);
            return rVarRz;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean d(MediaCodecInfo mediaCodecInfo, String str) {
        if (ut.y >= 29) {
            return z6(mediaCodecInfo);
        }
        if (v0.n.xc(str)) {
            return true;
        }
        String strV = g4.zn.v(mediaCodecInfo.getName());
        if (strV.startsWith("arc.")) {
            return false;
        }
        if (strV.startsWith("omx.google.") || strV.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strV.startsWith("omx.sec.") && strV.contains(".sw.")) || strV.equals("omx.qcom.video.decoder.hevcswvdec") || strV.startsWith("c2.android.") || strV.startsWith("c2.google.")) {
            return true;
        }
        return (strV.startsWith("omx.") || strV.startsWith("c2.")) ? false : true;
    }

    public static boolean d0(MediaCodecInfo mediaCodecInfo) {
        return ut.y >= 29 && fh(mediaCodecInfo);
    }

    public static boolean ej(MediaCodecInfo mediaCodecInfo) {
        if (ut.y >= 29) {
            return ud(mediaCodecInfo);
        }
        String strV = g4.zn.v(mediaCodecInfo.getName());
        return (strV.startsWith("omx.google.") || strV.startsWith("c2.android.") || strV.startsWith("c2.google.")) ? false : true;
    }

    @Nullable
    public static Integer f(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> f3(String str, String[] strArr, @Nullable w0.zn znVar) {
        if (strArr.length < 4) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = y.matcher(strArr[1]);
        if (!matcher.matches()) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                v0.r.c5("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i = (znVar == null || znVar.f8953fb != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numC = c(str2);
        if (numC != null) {
            return new Pair<>(Integer.valueOf(i), numC);
        }
        v0.r.c5("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    public static int fb(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case Code.UNIMPLEMENTED /* 12 */:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                        return 32;
                    case 21:
                        return 64;
                    case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return NotificationCompat.FLAG_LOCAL_ONLY;
                            case 31:
                                return NotificationCompat.FLAG_GROUP_SUMMARY;
                            case 32:
                                return UserMetadata.MAX_ATTRIBUTE_SIZE;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static boolean fh(MediaCodecInfo mediaCodecInfo) {
        return ob.tl.y(mediaCodecInfo);
    }

    public static <T> void hw(List<T> list, final fb<T> fbVar) {
        Collections.sort(list, new Comparator() { // from class: i7.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return rz.k5(fbVar, obj, obj2);
            }
        });
    }

    @Nullable
    public static Pair<Integer, Integer> i4(String str, String[] strArr) {
        if (strArr.length < 3) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = y.matcher(strArr[1]);
        if (!matcher.matches()) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numF = f(strGroup);
        if (numF == null) {
            v0.r.c5("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numI9 = i9(str2);
        if (numI9 != null) {
            return new Pair<>(numF, numI9);
        }
        v0.r.c5("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    public static Integer i9(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static int j5(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (i == 51) {
            return NotificationCompat.FLAG_GROUP_SUMMARY;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static /* synthetic */ int k5(fb fbVar, Object obj, Object obj2) {
        return fbVar.getScore(obj2) - fbVar.getScore(obj);
    }

    public static boolean mg(MediaCodecInfo mediaCodecInfo, String str) {
        return ut.y >= 29 ? ta(mediaCodecInfo) : !d(mediaCodecInfo, str);
    }

    @Nullable
    public static z mt(String str, boolean z, boolean z5) throws zn {
        List<z> listCo = co(str, z, z5);
        if (listCo.isEmpty()) {
            return null;
        }
        return listCo.get(0);
    }

    @Nullable
    public static Pair<Integer, Integer> n(String str, String[] strArr) {
        if (strArr.length < 3) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i5 = Integer.parseInt(strArr[2]);
            int iQn = qn(i);
            if (iQn == -1) {
                v0.r.c5("MediaCodecUtil", "Unknown VP9 profile: " + i);
                return null;
            }
            int iJ5 = j5(i5);
            if (iJ5 != -1) {
                return new Pair<>(Integer.valueOf(iQn), Integer.valueOf(iJ5));
            }
            v0.r.c5("MediaCodecUtil", "Unknown VP9 level: " + i5);
            return null;
        } catch (NumberFormatException unused) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    public static void o(String str, boolean z, boolean z5) {
        try {
            co(str, z, z5);
        } catch (zn e4) {
            v0.r.gv("MediaCodecUtil", "Codec warming failed", e4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> p(ft.g r6) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.rz.p(ft.g):android.util.Pair");
    }

    public static int qn(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    @CheckResult
    public static List<z> r(List<z> list, final g gVar) {
        ArrayList arrayList = new ArrayList(list);
        hw(arrayList, new fb() { // from class: i7.fh
            @Override // i7.rz.fb
            public final int getScore(Object obj) {
                return rz.b(gVar, (z) obj);
            }
        });
        return arrayList;
    }

    public static boolean rz(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = ut.y;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = ut.n3;
            if ("a70".equals(str3) || ("Xiaomi".equals(ut.zn) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = ut.n3;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = ut.n3;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(ut.zn))) {
            String str6 = ut.n3;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(ut.zn)) {
            String str7 = ut.n3;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && ut.n3.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static int s(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return 414720;
            case NotificationCompat.FLAG_GROUP_SUMMARY /* 512 */:
                return 921600;
            case UserMetadata.MAX_ATTRIBUTE_SIZE /* 1024 */:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> t(String str, String[] strArr) {
        int iVl;
        if (strArr.length != 3) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(v0.n.s(Integer.parseInt(strArr[1], 16))) && (iVl = vl(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iVl), 0);
            }
        } catch (NumberFormatException unused) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static boolean ta(MediaCodecInfo mediaCodecInfo) {
        return ob.t.y(mediaCodecInfo);
    }

    @Nullable
    public static String tl(g gVar) {
        Pair<Integer, Integer> pairP;
        if ("audio/eac3-joc".equals(gVar.f3)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(gVar.f3) || (pairP = p(gVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairP.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static boolean ud(MediaCodecInfo mediaCodecInfo) {
        return ob.f.y(mediaCodecInfo);
    }

    public static void v(String str, List<z> list) {
        if ("audio/raw".equals(str)) {
            if (ut.y < 26 && ut.n3.equals("R9") && list.size() == 1 && list.get(0).y.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(z.ej("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            hw(list, new fb() { // from class: i7.n
                @Override // i7.rz.fb
                public final int getScore(Object obj) {
                    return rz.a8((z) obj);
                }
            });
        }
        int i = ut.y;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).y;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                hw(list, new fb() { // from class: i7.c
                    @Override // i7.rz.fb
                    public final int getScore(Object obj) {
                        return rz.x((z) obj);
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).y)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static int vl(int i) {
        int i5 = 17;
        if (i != 17) {
            i5 = 20;
            if (i != 20) {
                i5 = 23;
                if (i != 23) {
                    i5 = 29;
                    if (i != 29) {
                        i5 = 39;
                        if (i != 39) {
                            i5 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i5;
    }

    @Nullable
    public static String w(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> wz(String str, String[] strArr, @Nullable w0.zn znVar) {
        int i;
        if (strArr.length < 4) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i5 = Integer.parseInt(strArr[1]);
            int i8 = Integer.parseInt(strArr[2].substring(0, 2));
            int i10 = Integer.parseInt(strArr[3]);
            if (i5 != 0) {
                v0.r.c5("MediaCodecUtil", "Unknown AV1 profile: " + i5);
                return null;
            }
            if (i10 != 8 && i10 != 10) {
                v0.r.c5("MediaCodecUtil", "Unknown AV1 bit depth: " + i10);
                return null;
            }
            int i11 = i10 != 8 ? (znVar == null || !(znVar.f8954s != null || (i = znVar.f8953fb) == 7 || i == 6)) ? 2 : 4096 : 1;
            int iA = a(i8);
            if (iA != -1) {
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(iA));
            }
            v0.r.c5("MediaCodecUtil", "Unknown AV1 level: " + i8);
            return null;
        } catch (NumberFormatException unused) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    public static /* synthetic */ int x(z zVar) {
        return zVar.y.startsWith("OMX.google") ? 1 : 0;
    }

    @Nullable
    public static z x4() throws zn {
        return mt("audio/raw", false, false);
    }

    @Nullable
    public static Pair<Integer, Integer> xc(String str, String[] strArr) {
        int i;
        int i5;
        if (strArr.length < 2) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i5 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    v0.r.c5("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i8 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i5 = i8;
            }
            int iC5 = c5(i5);
            if (iC5 == -1) {
                v0.r.c5("MediaCodecUtil", "Unknown AVC profile: " + i5);
                return null;
            }
            int iFb = fb(i);
            if (iFb != -1) {
                return new Pair<>(Integer.valueOf(iC5), Integer.valueOf(iFb));
            }
            v0.r.c5("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            v0.r.c5("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static int yt() throws zn {
        if (zn == -1) {
            int iMax = 0;
            z zVarMt = mt("video/avc", false, false);
            if (zVarMt != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI9 = zVarMt.i9();
                int length = codecProfileLevelArrI9.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(s(codecProfileLevelArrI9[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, ut.y >= 21 ? 345600 : 172800);
            }
            zn = iMax;
        }
        return zn;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:61:0x0124, B:8:0x002d, B:11:0x0038, B:55:0x00fd, B:58:0x0105, B:60:0x010b, B:64:0x0130, B:65:0x0153), top: B:71:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<i7.z> z(i7.rz.n3 r24, i7.rz.gv r25) throws i7.rz.zn {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.rz.z(i7.rz$n3, i7.rz$gv):java.util.ArrayList");
    }

    public static boolean z6(MediaCodecInfo mediaCodecInfo) {
        return ob.i9.y(mediaCodecInfo);
    }
}
