package i7;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import i7.rz;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5562a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f5563c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5564f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f5565fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f5566gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final boolean f5567i9;
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f5568s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f5569v;
    public final String y;
    public final String zn;

    public static final class y {
        public static int y(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i5, double d4) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || z.ta()) {
                return 0;
            }
            w.y();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointY = xc.y(i, i5, (int) d4);
            for (int i8 = 0; i8 < supportedPerformancePoints.size(); i8++) {
                if (mt.y(supportedPerformancePoints.get(i8)).covers(performancePointY)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public z(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z5, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.y = (String) v0.y.v(str);
        this.n3 = str2;
        this.zn = str3;
        this.f5566gv = codecCapabilities;
        this.f5568s = z;
        this.f5563c5 = z5;
        this.f5567i9 = z7;
        this.f5569v = z8;
        this.f5562a = z9;
        this.f5565fb = z10;
        this.f5564f = v0.n.co(str2);
    }

    public static int c5(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    public static boolean d(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = ut.n3;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static z ej(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z5, boolean z7, boolean z8, boolean z9) {
        return new z(str, str2, str3, codecCapabilities, z, z5, z7, (z8 || codecCapabilities == null || !f(codecCapabilities) || mg(str)) ? false : true, codecCapabilities != null && i4(codecCapabilities), z9 || (codecCapabilities != null && r(codecCapabilities)));
    }

    public static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ut.y >= 19 && t(codecCapabilities);
    }

    public static boolean f3(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static MediaCodecInfo.CodecProfileLevel[] fb(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i = iIntValue >= 180000000 ? UserMetadata.MAX_ATTRIBUTE_SIZE : iIntValue >= 120000000 ? NotificationCompat.FLAG_GROUP_SUMMARY : iIntValue >= 60000000 ? NotificationCompat.FLAG_LOCAL_ONLY : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean fh(String str) {
        return "audio/opus".equals(str);
    }

    public static Point gv(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i5) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(ut.t(i, widthAlignment) * widthAlignment, ut.t(i5, heightAlignment) * heightAlignment);
    }

    public static boolean i4(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ut.y >= 21 && f3(codecCapabilities);
    }

    public static boolean mg(String str) {
        if (ut.y <= 22) {
            String str2 = ut.f8761gv;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static int n3(String str, String str2, int i) {
        if (i > 1 || ((ut.y >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        v0.r.c5("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i5 + "]");
        return i5;
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ut.y >= 21 && x4(codecCapabilities);
    }

    public static boolean rz(String str) {
        return ut.f8761gv.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean ta() {
        String str = ut.n3;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = ut.f8761gv;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i5, double d4) {
        Point pointGv = gv(videoCapabilities, i, i5);
        int i8 = pointGv.x;
        int i10 = pointGv.y;
        return (d4 == -1.0d || d4 < 1.0d) ? videoCapabilities.isSizeSupported(i8, i10) : videoCapabilities.areSizeAndRateSupported(i8, i10, Math.floor(d4));
    }

    public static boolean x4(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean z6(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(ut.n3)) ? false : true;
    }

    public di.c5 a(g gVar, g gVar2) {
        int i = !ut.zn(gVar.f3, gVar2.f3) ? 8 : 0;
        if (this.f5564f) {
            if (gVar.f4777b != gVar2.f4777b) {
                i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (!this.f5569v && (gVar.f4779d != gVar2.f4779d || gVar.f4780ej != gVar2.f4780ej)) {
                i |= NotificationCompat.FLAG_GROUP_SUMMARY;
            }
            if (!ut.zn(gVar.o, gVar2.o)) {
                i |= 2048;
            }
            if (rz(this.y) && !gVar.fb(gVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new di.c5(this.y, gVar, gVar2, gVar.fb(gVar2) ? 3 : 2, 0);
            }
        } else {
            if (gVar.j != gVar2.j) {
                i |= 4096;
            }
            if (gVar.oz != gVar2.oz) {
                i |= 8192;
            }
            if (gVar.f4790ut != gVar2.f4790ut) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.n3)) {
                Pair<Integer, Integer> pairP = rz.p(gVar);
                Pair<Integer, Integer> pairP2 = rz.p(gVar2);
                if (pairP != null && pairP2 != null) {
                    int iIntValue = ((Integer) pairP.first).intValue();
                    int iIntValue2 = ((Integer) pairP2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new di.c5(this.y, gVar, gVar2, 3, 0);
                    }
                }
            }
            if (!gVar.fb(gVar2)) {
                i |= 32;
            }
            if (fh(this.n3)) {
                i |= 2;
            }
            if (i == 0) {
                return new di.c5(this.y, gVar, gVar2, 1, 0);
            }
        }
        return new di.c5(this.y, gVar, gVar2, 0, i);
    }

    public final void c(String str) {
        v0.r.n3("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.y + ", " + this.n3 + "] [" + ut.f8766v + "]");
    }

    public final boolean co(g gVar) {
        return this.n3.equals(gVar.f3) || this.n3.equals(rz.tl(gVar));
    }

    public final void d0(String str) {
        v0.r.n3("MediaCodecInfo", "NoSupport [" + str + "] [" + this.y + ", " + this.n3 + "] [" + ut.f8766v + "]");
    }

    public MediaCodecInfo.CodecProfileLevel[] i9() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5566gv;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean mt() {
        if (ut.y >= 29 && "video/x-vnd.on2.vp9".equals(this.n3)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : i9()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n(int i, int i5, double d4) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5566gv;
        if (codecCapabilities == null) {
            d0("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            d0("sizeAndRate.vCaps");
            return false;
        }
        if (ut.y >= 29) {
            int iY = y.y(videoCapabilities, i, i5, d4);
            if (iY == 2) {
                return true;
            }
            if (iY == 1) {
                d0("sizeAndRate.cover, " + i + "x" + i5 + "@" + d4);
                return false;
            }
        }
        if (!v(videoCapabilities, i, i5, d4)) {
            if (i >= i5 || !z6(this.y) || !v(videoCapabilities, i5, i, d4)) {
                d0("sizeAndRate.support, " + i + "x" + i5 + "@" + d4);
                return false;
            }
            c("sizeAndRate.rotated, " + i + "x" + i5 + "@" + d4);
        }
        return true;
    }

    public boolean p(g gVar) throws rz.zn {
        int i;
        if (!co(gVar) || !xc(gVar, true)) {
            return false;
        }
        if (!this.f5564f) {
            if (ut.y >= 21) {
                int i5 = gVar.oz;
                if (i5 != -1 && !wz(i5)) {
                    return false;
                }
                int i8 = gVar.j;
                if (i8 != -1 && !tl(i8)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = gVar.f4779d;
        if (i10 <= 0 || (i = gVar.f4780ej) <= 0) {
            return true;
        }
        if (ut.y >= 21) {
            return n(i10, i, gVar.f4792x);
        }
        boolean z = i10 * i <= rz.yt();
        if (!z) {
            d0("legacyFrameSize, " + gVar.f4779d + "x" + gVar.f4780ej);
        }
        return z;
    }

    public int s() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (ut.y < 23 || (codecCapabilities = this.f5566gv) == null) {
            return -1;
        }
        return c5(codecCapabilities);
    }

    public boolean tl(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5566gv;
        if (codecCapabilities == null) {
            d0("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            d0("channelCount.aCaps");
            return false;
        }
        if (n3(this.y, this.n3, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        d0("channelCount.support, " + i);
        return false;
    }

    public String toString() {
        return this.y;
    }

    public boolean w(g gVar) {
        return co(gVar) && xc(gVar, false);
    }

    public boolean wz(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5566gv;
        if (codecCapabilities == null) {
            d0("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            d0("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        d0("sampleRate.support, " + i);
        return false;
    }

    public final boolean xc(g gVar, boolean z) {
        Pair<Integer, Integer> pairP = rz.p(gVar);
        if (pairP == null) {
            return true;
        }
        int iIntValue = ((Integer) pairP.first).intValue();
        int iIntValue2 = ((Integer) pairP.second).intValue();
        if ("video/dolby-vision".equals(gVar.f3)) {
            if (!"video/avc".equals(this.n3)) {
                iIntValue = "video/hevc".equals(this.n3) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f5564f && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI9 = i9();
        if (ut.y <= 23 && "video/x-vnd.on2.vp9".equals(this.n3) && codecProfileLevelArrI9.length == 0) {
            codecProfileLevelArrI9 = fb(this.f5566gv);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrI9) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !d(this.n3, iIntValue))) {
                return true;
            }
        }
        d0("codec.profileLevel, " + gVar.f4778co + ", " + this.zn);
        return false;
    }

    public boolean z(g gVar) {
        if (this.f5564f) {
            return this.f5569v;
        }
        Pair<Integer, Integer> pairP = rz.p(gVar);
        return pairP != null && ((Integer) pairP.first).intValue() == 42;
    }

    @Nullable
    public Point zn(int i, int i5) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5566gv;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return gv(videoCapabilities, i, i5);
    }
}
