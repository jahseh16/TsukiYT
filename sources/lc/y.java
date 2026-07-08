package lc;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import lc.n3;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final Charset f6163ap;
    public static final gv[] ct;
    public static final gv[] dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet<String> f6166e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final gv[][] f6167eb;
    public static final gv[] en;
    public static final gv[] f7;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final Pattern f6169g3;
    public static SimpleDateFormat j;
    public static final gv[] jz;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public static final Pattern f6175kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public static final gv[] f6176lc;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f6177m;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public static final HashMap<Integer, gv>[] f6178nf;
    public static final gv[] o4;
    public static SimpleDateFormat oz;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final HashMap<String, gv>[] f6180ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public static final Pattern f6181rb;
    public static final gv[] rs;
    public static final HashMap<Integer, Integer> s8;
    public static final gv[] u;
    public static final gv xg;
    public static final gv[] y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public static final byte[] f6187yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public static final byte[] f6188yg;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, zn>[] f6191a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f6192c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f6193co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6194f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Set<Integer> f6195fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f6196gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f6197i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f6198mt;
    public FileDescriptor n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6199p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteOrder f6200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6201t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f6202tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6203v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public byte[] f6204wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f6205xc;
    public String y;
    public boolean z;
    public AssetManager.AssetInputStream zn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f6179r = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final List<Integer> f6186x4 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final List<Integer> f6171i4 = Arrays.asList(2, 7, 4, 5);
    public static final int[] f3 = {8, 8, 8};
    public static final int[] n = {4};
    public static final int[] c = {8};
    public static final byte[] d0 = {-1, -40, -1};
    public static final byte[] fh = {102, 116, 121, 112};
    public static final byte[] rz = {109, 105, 102, 49};
    public static final byte[] mg = {104, 101, 105, 99};

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static final byte[] f6182ta = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f6165d = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final byte[] f6190z6 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final byte[] f6168ej = {101, 88, 73, 102};

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final byte[] f6183ud = {73, 72, 68, 82};

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public static final byte[] f6162a8 = {73, 69, 78, 68};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f6185x = {82, 73, 70, 70};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6164b = {87, 69, 66, 80};

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final byte[] f6174k5 = {69, 88, 73, 70};

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public static final byte[] f6189yt = {-99, 1, 42};
    public static final byte[] vl = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static final byte[] f6170hw = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final byte[] f6172j5 = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] qn = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] o = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public static final String[] f6184ut = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] q9 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f6173k = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        gv[] gvVarArr = {new gv("NewSubfileType", 254, 4), new gv("SubfileType", 255, 4), new gv("ImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new gv("ImageLength", 257, 3, 4), new gv("BitsPerSample", 258, 3), new gv("Compression", 259, 3), new gv("PhotometricInterpretation", 262, 3), new gv("ImageDescription", 270, 2), new gv("Make", 271, 2), new gv("Model", 272, 2), new gv("StripOffsets", 273, 3, 4), new gv("Orientation", 274, 3), new gv("SamplesPerPixel", 277, 3), new gv("RowsPerStrip", 278, 3, 4), new gv("StripByteCounts", 279, 3, 4), new gv("XResolution", 282, 5), new gv("YResolution", 283, 5), new gv("PlanarConfiguration", 284, 3), new gv("ResolutionUnit", 296, 3), new gv("TransferFunction", 301, 3), new gv("Software", 305, 2), new gv("DateTime", 306, 2), new gv("Artist", 315, 2), new gv("WhitePoint", 318, 5), new gv("PrimaryChromaticities", 319, 5), new gv("SubIFDPointer", 330, 4), new gv("JPEGInterchangeFormat", 513, 4), new gv("JPEGInterchangeFormatLength", 514, 4), new gv("YCbCrCoefficients", 529, 5), new gv("YCbCrSubSampling", 530, 3), new gv("YCbCrPositioning", 531, 3), new gv("ReferenceBlackWhite", 532, 5), new gv("Copyright", 33432, 2), new gv("ExifIFDPointer", 34665, 4), new gv("GPSInfoIFDPointer", 34853, 4), new gv("SensorTopBorder", 4, 4), new gv("SensorLeftBorder", 5, 4), new gv("SensorBottomBorder", 6, 4), new gv("SensorRightBorder", 7, 4), new gv("ISO", 23, 3), new gv("JpgFromRaw", 46, 7), new gv("Xmp", 700, 1)};
        f7 = gvVarArr;
        gv[] gvVarArr2 = {new gv("ExposureTime", 33434, 5), new gv("FNumber", 33437, 5), new gv("ExposureProgram", 34850, 3), new gv("SpectralSensitivity", 34852, 2), new gv("PhotographicSensitivity", 34855, 3), new gv("OECF", 34856, 7), new gv("SensitivityType", 34864, 3), new gv("StandardOutputSensitivity", 34865, 4), new gv("RecommendedExposureIndex", 34866, 4), new gv("ISOSpeed", 34867, 4), new gv("ISOSpeedLatitudeyyy", 34868, 4), new gv("ISOSpeedLatitudezzz", 34869, 4), new gv("ExifVersion", 36864, 2), new gv("DateTimeOriginal", 36867, 2), new gv("DateTimeDigitized", 36868, 2), new gv("OffsetTime", 36880, 2), new gv("OffsetTimeOriginal", 36881, 2), new gv("OffsetTimeDigitized", 36882, 2), new gv("ComponentsConfiguration", 37121, 7), new gv("CompressedBitsPerPixel", 37122, 5), new gv("ShutterSpeedValue", 37377, 10), new gv("ApertureValue", 37378, 5), new gv("BrightnessValue", 37379, 10), new gv("ExposureBiasValue", 37380, 10), new gv("MaxApertureValue", 37381, 5), new gv("SubjectDistance", 37382, 5), new gv("MeteringMode", 37383, 3), new gv("LightSource", 37384, 3), new gv("Flash", 37385, 3), new gv("FocalLength", 37386, 5), new gv("SubjectArea", 37396, 3), new gv("MakerNote", 37500, 7), new gv("UserComment", 37510, 7), new gv("SubSecTime", 37520, 2), new gv("SubSecTimeOriginal", 37521, 2), new gv("SubSecTimeDigitized", 37522, 2), new gv("FlashpixVersion", 40960, 7), new gv("ColorSpace", 40961, 3), new gv("PixelXDimension", 40962, 3, 4), new gv("PixelYDimension", 40963, 3, 4), new gv("RelatedSoundFile", 40964, 2), new gv("InteroperabilityIFDPointer", 40965, 4), new gv("FlashEnergy", 41483, 5), new gv("SpatialFrequencyResponse", 41484, 7), new gv("FocalPlaneXResolution", 41486, 5), new gv("FocalPlaneYResolution", 41487, 5), new gv("FocalPlaneResolutionUnit", 41488, 3), new gv("SubjectLocation", 41492, 3), new gv("ExposureIndex", 41493, 5), new gv("SensingMethod", 41495, 3), new gv("FileSource", 41728, 7), new gv("SceneType", 41729, 7), new gv("CFAPattern", 41730, 7), new gv("CustomRendered", 41985, 3), new gv("ExposureMode", 41986, 3), new gv("WhiteBalance", 41987, 3), new gv("DigitalZoomRatio", 41988, 5), new gv("FocalLengthIn35mmFilm", 41989, 3), new gv("SceneCaptureType", 41990, 3), new gv("GainControl", 41991, 3), new gv("Contrast", 41992, 3), new gv("Saturation", 41993, 3), new gv("Sharpness", 41994, 3), new gv("DeviceSettingDescription", 41995, 7), new gv("SubjectDistanceRange", 41996, 3), new gv("ImageUniqueID", 42016, 2), new gv("CameraOwnerName", 42032, 2), new gv("BodySerialNumber", 42033, 2), new gv("LensSpecification", 42034, 5), new gv("LensMake", 42035, 2), new gv("LensModel", 42036, 2), new gv("Gamma", 42240, 5), new gv("DNGVersion", 50706, 1), new gv("DefaultCropSize", 50720, 3, 4)};
        en = gvVarArr2;
        gv[] gvVarArr3 = {new gv("GPSVersionID", 0, 1), new gv("GPSLatitudeRef", 1, 2), new gv("GPSLatitude", 2, 5, 10), new gv("GPSLongitudeRef", 3, 2), new gv("GPSLongitude", 4, 5, 10), new gv("GPSAltitudeRef", 5, 1), new gv("GPSAltitude", 6, 5), new gv("GPSTimeStamp", 7, 5), new gv("GPSSatellites", 8, 2), new gv("GPSStatus", 9, 2), new gv("GPSMeasureMode", 10, 2), new gv("GPSDOP", 11, 5), new gv("GPSSpeedRef", 12, 2), new gv("GPSSpeed", 13, 5), new gv("GPSTrackRef", 14, 2), new gv("GPSTrack", 15, 5), new gv("GPSImgDirectionRef", 16, 2), new gv("GPSImgDirection", 17, 5), new gv("GPSMapDatum", 18, 2), new gv("GPSDestLatitudeRef", 19, 2), new gv("GPSDestLatitude", 20, 5), new gv("GPSDestLongitudeRef", 21, 2), new gv("GPSDestLongitude", 22, 5), new gv("GPSDestBearingRef", 23, 2), new gv("GPSDestBearing", 24, 5), new gv("GPSDestDistanceRef", 25, 2), new gv("GPSDestDistance", 26, 5), new gv("GPSProcessingMethod", 27, 7), new gv("GPSAreaInformation", 28, 7), new gv("GPSDateStamp", 29, 2), new gv("GPSDifferential", 30, 3), new gv("GPSHPositioningError", 31, 5)};
        jz = gvVarArr3;
        gv[] gvVarArr4 = {new gv("InteroperabilityIndex", 1, 2)};
        u = gvVarArr4;
        gv[] gvVarArr5 = {new gv("NewSubfileType", 254, 4), new gv("SubfileType", 255, 4), new gv("ThumbnailImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new gv("ThumbnailImageLength", 257, 3, 4), new gv("BitsPerSample", 258, 3), new gv("Compression", 259, 3), new gv("PhotometricInterpretation", 262, 3), new gv("ImageDescription", 270, 2), new gv("Make", 271, 2), new gv("Model", 272, 2), new gv("StripOffsets", 273, 3, 4), new gv("ThumbnailOrientation", 274, 3), new gv("SamplesPerPixel", 277, 3), new gv("RowsPerStrip", 278, 3, 4), new gv("StripByteCounts", 279, 3, 4), new gv("XResolution", 282, 5), new gv("YResolution", 283, 5), new gv("PlanarConfiguration", 284, 3), new gv("ResolutionUnit", 296, 3), new gv("TransferFunction", 301, 3), new gv("Software", 305, 2), new gv("DateTime", 306, 2), new gv("Artist", 315, 2), new gv("WhitePoint", 318, 5), new gv("PrimaryChromaticities", 319, 5), new gv("SubIFDPointer", 330, 4), new gv("JPEGInterchangeFormat", 513, 4), new gv("JPEGInterchangeFormatLength", 514, 4), new gv("YCbCrCoefficients", 529, 5), new gv("YCbCrSubSampling", 530, 3), new gv("YCbCrPositioning", 531, 3), new gv("ReferenceBlackWhite", 532, 5), new gv("Copyright", 33432, 2), new gv("ExifIFDPointer", 34665, 4), new gv("GPSInfoIFDPointer", 34853, 4), new gv("DNGVersion", 50706, 1), new gv("DefaultCropSize", 50720, 3, 4)};
        y5 = gvVarArr5;
        xg = new gv("StripOffsets", 273, 3);
        gv[] gvVarArr6 = {new gv("ThumbnailImage", NotificationCompat.FLAG_LOCAL_ONLY, 7), new gv("CameraSettingsIFDPointer", 8224, 4), new gv("ImageProcessingIFDPointer", 8256, 4)};
        dm = gvVarArr6;
        gv[] gvVarArr7 = {new gv("PreviewImageStart", 257, 4), new gv("PreviewImageLength", 258, 4)};
        ct = gvVarArr7;
        gv[] gvVarArr8 = {new gv("AspectFrame", 4371, 3)};
        o4 = gvVarArr8;
        gv[] gvVarArr9 = {new gv("ColorSpace", 55, 3)};
        rs = gvVarArr9;
        gv[][] gvVarArr10 = {gvVarArr, gvVarArr2, gvVarArr3, gvVarArr4, gvVarArr5, gvVarArr, gvVarArr6, gvVarArr7, gvVarArr8, gvVarArr9};
        f6167eb = gvVarArr10;
        f6176lc = new gv[]{new gv("SubIFDPointer", 330, 4), new gv("ExifIFDPointer", 34665, 4), new gv("GPSInfoIFDPointer", 34853, 4), new gv("InteroperabilityIFDPointer", 40965, 4), new gv("CameraSettingsIFDPointer", 8224, 1), new gv("ImageProcessingIFDPointer", 8256, 1)};
        f6178nf = new HashMap[gvVarArr10.length];
        f6180ra = new HashMap[gvVarArr10.length];
        f6166e = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        s8 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f6163ap = charsetForName;
        f6188yg = "Exif\u0000\u0000".getBytes(charsetForName);
        f6187yc = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        j = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        oz = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            gv[][] gvVarArr11 = f6167eb;
            if (i >= gvVarArr11.length) {
                HashMap<Integer, Integer> map = s8;
                gv[] gvVarArr12 = f6176lc;
                map.put(Integer.valueOf(gvVarArr12[0].y), 5);
                map.put(Integer.valueOf(gvVarArr12[1].y), 1);
                map.put(Integer.valueOf(gvVarArr12[2].y), 2);
                map.put(Integer.valueOf(gvVarArr12[3].y), 3);
                map.put(Integer.valueOf(gvVarArr12[4].y), 7);
                map.put(Integer.valueOf(gvVarArr12[5].y), 8);
                f6175kp = Pattern.compile(".*[1-9].*");
                f6181rb = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f6169g3 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f6177m = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f6178nf[i] = new HashMap<>();
            f6180ra[i] = new HashMap<>();
            for (gv gvVar : gvVarArr11[i]) {
                f6178nf[i].put(Integer.valueOf(gvVar.y), gvVar);
                f6180ra[i].put(gvVar.n3, gvVar);
            }
            i++;
        }
    }

    public y(@NonNull InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public static boolean co(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = d0;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean f3(FileDescriptor fileDescriptor) {
        try {
            n3.y.zn(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f6179r) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean p(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f6188yg;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f6188yg;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    public static boolean x(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b A[LOOP:0: B:10:0x0037->B:63:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(lc.y.n3 r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.y.a(lc.y$n3, int, int):void");
    }

    public final void a8(n3 n3Var) throws IOException {
        HashMap<String, zn> map = this.f6191a[4];
        zn znVar = map.get("Compression");
        if (znVar == null) {
            this.f6205xc = 6;
            xc(n3Var, map);
            return;
        }
        int iC5 = znVar.c5(this.f6200s);
        this.f6205xc = iC5;
        if (iC5 != 1) {
            if (iC5 == 6) {
                xc(n3Var, map);
                return;
            } else if (iC5 != 7) {
                return;
            }
        }
        if (n(map)) {
            w(n3Var, map);
        }
    }

    public final void b(int i, int i5) throws IOException {
        if (this.f6191a[i].isEmpty() || this.f6191a[i5].isEmpty()) {
            if (f6179r) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        zn znVar = this.f6191a[i].get("ImageLength");
        zn znVar2 = this.f6191a[i].get("ImageWidth");
        zn znVar3 = this.f6191a[i5].get("ImageLength");
        zn znVar4 = this.f6191a[i5].get("ImageWidth");
        if (znVar == null || znVar2 == null) {
            if (f6179r) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (znVar3 == null || znVar4 == null) {
            if (f6179r) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iC5 = znVar.c5(this.f6200s);
        int iC52 = znVar2.c5(this.f6200s);
        int iC53 = znVar3.c5(this.f6200s);
        int iC54 = znVar4.c5(this.f6200s);
        if (iC5 >= iC53 || iC52 >= iC54) {
            return;
        }
        HashMap<String, zn>[] mapArr = this.f6191a;
        HashMap<String, zn> map = mapArr[i];
        mapArr[i] = mapArr[i5];
        mapArr[i5] = map;
    }

    public final boolean c(HashMap map) throws IOException {
        zn znVar = (zn) map.get("ImageLength");
        zn znVar2 = (zn) map.get("ImageWidth");
        if (znVar == null || znVar2 == null) {
            return false;
        }
        return znVar.c5(this.f6200s) <= 512 && znVar2.c5(this.f6200s) <= 512;
    }

    public final void c5(n3 n3Var) throws IOException {
        if (f6179r) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + n3Var);
        }
        n3Var.t(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f6190z6;
        n3Var.w(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = n3Var.readInt();
                byte[] bArr2 = new byte[4];
                if (n3Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i5 = length + 8;
                if (i5 == 16 && !Arrays.equals(bArr2, f6183ud)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f6162a8)) {
                    return;
                }
                if (Arrays.equals(bArr2, f6168ej)) {
                    byte[] bArr3 = new byte[i];
                    if (n3Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + n3.y(bArr2));
                    }
                    int i8 = n3Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i8) {
                        this.w = i5;
                        d(bArr3, 0);
                        yt();
                        a8(new n3(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                }
                int i10 = i + 4;
                n3Var.w(i10);
                length = i5 + i10;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void d(byte[] bArr, int i) throws IOException {
        a aVar = new a(bArr);
        rz(aVar);
        z6(aVar, i);
    }

    public final boolean d0(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f6185x;
            if (i >= bArr2.length) {
                int i5 = 0;
                while (true) {
                    byte[] bArr3 = f6164b;
                    if (i5 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f6185x.length + i5 + 4] != bArr3[i5]) {
                        return false;
                    }
                    i5++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    public final void ej(int i, String str, String str2) {
        if (this.f6191a[i].isEmpty() || this.f6191a[i].get(str) == null) {
            return;
        }
        HashMap<String, zn> map = this.f6191a[i];
        map.put(str2, map.get(str));
        this.f6191a[i].remove(str);
    }

    public final void f(a aVar) throws IOException {
        zn znVar;
        rz(aVar);
        z6(aVar, 0);
        k5(aVar, 0);
        k5(aVar, 5);
        k5(aVar, 4);
        yt();
        if (this.f6196gv != 8 || (znVar = this.f6191a[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(znVar.gv);
        aVar2.t(this.f6200s);
        aVar2.w(6);
        z6(aVar2, 9);
        zn znVar2 = this.f6191a[9].get("ColorSpace");
        if (znVar2 != null) {
            this.f6191a[1].put("ColorSpace", znVar2);
        }
    }

    public final int fb(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (co(bArr)) {
            return 4;
        }
        if (x4(bArr)) {
            return 9;
        }
        if (mt(bArr)) {
            return 12;
        }
        if (z(bArr)) {
            return 7;
        }
        if (i4(bArr)) {
            return 10;
        }
        if (r(bArr)) {
            return 13;
        }
        return d0(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fh(@androidx.annotation.NonNull java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = 0
        L4:
            lc.y$gv[][] r2 = lc.y.f6167eb     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap<java.lang.String, lc.y$zn>[] r2 = r4.f6191a     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f6203v     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.fb(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f6196gv = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f6196gv     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = x(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            lc.y$a r0 = new lc.y$a     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f6203v     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.tl(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f6196gv     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.v(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.s(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.t(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.f(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.w     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.p(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.a8(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            lc.y$n3 r1 = new lc.y$n3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f6196gv     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.a(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.c5(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.i9(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.wz(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.y()
            boolean r5 = lc.y.f6179r
            if (r5 == 0) goto Lac
        L97:
            r4.mg()
            goto Lac
        L9b:
            boolean r0 = lc.y.f6179r     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.y()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.y()
            boolean r0 = lc.y.f6179r
            if (r0 == 0) goto Lb7
            r4.mg()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.y.fh(java.io.InputStream):void");
    }

    @Nullable
    public final zn gv(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f6179r) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f6167eb.length; i++) {
            zn znVar = this.f6191a[i].get(str);
            if (znVar != null) {
                return znVar;
            }
        }
        return null;
    }

    public final boolean i4(byte[] bArr) throws Throwable {
        InputStream inputStream = null;
        try {
            InputStream n3Var = new n3(bArr);
            try {
                ByteOrder byteOrderTa = ta(n3Var);
                this.f6200s = byteOrderTa;
                n3Var.t(byteOrderTa);
                boolean z = n3Var.readShort() == 85;
                n3Var.close();
                return z;
            } catch (Exception unused) {
                inputStream = n3Var;
                if (inputStream != null) {
                    inputStream.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                inputStream = n3Var;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void i9(n3 n3Var) throws IOException {
        boolean z = f6179r;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + n3Var);
        }
        n3Var.w(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        n3Var.read(bArr);
        n3Var.read(bArr2);
        n3Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        n3Var.w(i - n3Var.y());
        n3Var.read(bArr4);
        a(new n3(bArr4), i, 5);
        n3Var.w(i8 - n3Var.y());
        n3Var.t(ByteOrder.BIG_ENDIAN);
        int i10 = n3Var.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int unsignedShort = n3Var.readUnsignedShort();
            int unsignedShort2 = n3Var.readUnsignedShort();
            if (unsignedShort == xg.y) {
                short s3 = n3Var.readShort();
                short s5 = n3Var.readShort();
                zn znVarA = zn.a(s3, this.f6200s);
                zn znVarA2 = zn.a(s5, this.f6200s);
                this.f6191a[0].put("ImageLength", znVarA);
                this.f6191a[0].put("ImageWidth", znVarA2);
                if (f6179r) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s3) + ", width: " + ((int) s5));
                    return;
                }
                return;
            }
            n3Var.w(unsignedShort2);
        }
    }

    public final void k5(a aVar, int i) throws IOException {
        zn znVarA;
        zn znVarA2;
        zn znVar = this.f6191a[i].get("DefaultCropSize");
        zn znVar2 = this.f6191a[i].get("SensorTopBorder");
        zn znVar3 = this.f6191a[i].get("SensorLeftBorder");
        zn znVar4 = this.f6191a[i].get("SensorBottomBorder");
        zn znVar5 = this.f6191a[i].get("SensorRightBorder");
        if (znVar == null) {
            if (znVar2 == null || znVar3 == null || znVar4 == null || znVar5 == null) {
                ud(aVar, i);
                return;
            }
            int iC5 = znVar2.c5(this.f6200s);
            int iC52 = znVar4.c5(this.f6200s);
            int iC53 = znVar5.c5(this.f6200s);
            int iC54 = znVar3.c5(this.f6200s);
            if (iC52 <= iC5 || iC53 <= iC54) {
                return;
            }
            zn znVarA3 = zn.a(iC52 - iC5, this.f6200s);
            zn znVarA4 = zn.a(iC53 - iC54, this.f6200s);
            this.f6191a[i].put("ImageLength", znVarA3);
            this.f6191a[i].put("ImageWidth", znVarA4);
            return;
        }
        if (znVar.y == 5) {
            v[] vVarArr = (v[]) znVar.f(this.f6200s);
            if (vVarArr == null || vVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(vVarArr));
                return;
            }
            znVarA = zn.gv(vVarArr[0], this.f6200s);
            znVarA2 = zn.gv(vVarArr[1], this.f6200s);
        } else {
            int[] iArr = (int[]) znVar.f(this.f6200s);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            znVarA = zn.a(iArr[0], this.f6200s);
            znVarA2 = zn.a(iArr[1], this.f6200s);
        }
        this.f6191a[i].put("ImageWidth", znVarA);
        this.f6191a[i].put("ImageLength", znVarA2);
    }

    public final void mg() {
        for (int i = 0; i < this.f6191a.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f6191a[i].size());
            for (Map.Entry<String, zn> entry : this.f6191a[i].entrySet()) {
                zn value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.i9(this.f6200s) + "'");
            }
        }
    }

    public final boolean mt(byte[] bArr) throws Throwable {
        InputStream n3Var;
        long j4;
        InputStream inputStream = null;
        try {
            try {
                n3Var = new n3(bArr);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = n3Var.readInt();
            byte[] bArr2 = new byte[4];
            n3Var.read(bArr2);
            if (!Arrays.equals(bArr2, fh)) {
                n3Var.close();
                return false;
            }
            if (length == 1) {
                length = n3Var.readLong();
                j4 = 16;
                if (length < 16) {
                    n3Var.close();
                    return false;
                }
            } else {
                j4 = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j7 = length - j4;
            if (j7 < 8) {
                n3Var.close();
                return false;
            }
            byte[] bArr3 = new byte[4];
            boolean z = false;
            boolean z5 = false;
            for (long j8 = 0; j8 < j7 / 4; j8++) {
                if (n3Var.read(bArr3) != 4) {
                    n3Var.close();
                    return false;
                }
                if (j8 != 1) {
                    if (Arrays.equals(bArr3, rz)) {
                        z = true;
                    } else if (Arrays.equals(bArr3, mg)) {
                        z5 = true;
                    }
                    if (z && z5) {
                        n3Var.close();
                        return true;
                    }
                }
            }
            n3Var.close();
        } catch (Exception e5) {
            e = e5;
            inputStream = n3Var;
            if (f6179r) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = n3Var;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        return false;
    }

    public final boolean n(HashMap map) throws IOException {
        zn znVar;
        int iC5;
        zn znVar2 = (zn) map.get("BitsPerSample");
        if (znVar2 != null) {
            int[] iArr = (int[]) znVar2.f(this.f6200s);
            int[] iArr2 = f3;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f6196gv == 3 && (znVar = (zn) map.get("PhotometricInterpretation")) != null && (((iC5 = znVar.c5(this.f6200s)) == 1 && Arrays.equals(iArr, c)) || (iC5 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f6179r) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    @Nullable
    public String n3(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        zn znVarGv = gv(str);
        if (znVarGv != null) {
            if (!f6166e.contains(str)) {
                return znVarGv.i9(this.f6200s);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = znVarGv.y;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + znVarGv.y);
                    return null;
                }
                v[] vVarArr = (v[]) znVarGv.f(this.f6200s);
                if (vVarArr == null || vVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(vVarArr));
                    return null;
                }
                v vVar = vVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (vVar.y / vVar.n3));
                v vVar2 = vVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (vVar2.y / vVar2.n3));
                v vVar3 = vVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (vVar3.y / vVar3.n3)));
            }
            try {
                return Double.toString(znVarGv.s(this.f6200s));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final boolean r(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f6190z6;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    public final void rz(n3 n3Var) throws IOException {
        ByteOrder byteOrderTa = ta(n3Var);
        this.f6200s = byteOrderTa;
        n3Var.t(byteOrderTa);
        int unsignedShort = n3Var.readUnsignedShort();
        int i = this.f6196gv;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i5 = n3Var.readInt();
        if (i5 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i5);
        }
        int i8 = i5 - 8;
        if (i8 > 0) {
            n3Var.w(i8);
        }
    }

    public final void s(a aVar) throws IOException {
        int i;
        int i5;
        f(aVar);
        zn znVar = this.f6191a[1].get("MakerNote");
        if (znVar != null) {
            a aVar2 = new a(znVar.gv);
            aVar2.t(this.f6200s);
            byte[] bArr = f6182ta;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.p(0L);
            byte[] bArr3 = f6165d;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.p(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.p(12L);
            }
            z6(aVar2, 6);
            zn znVar2 = this.f6191a[7].get("PreviewImageStart");
            zn znVar3 = this.f6191a[7].get("PreviewImageLength");
            if (znVar2 != null && znVar3 != null) {
                this.f6191a[5].put("JPEGInterchangeFormat", znVar2);
                this.f6191a[5].put("JPEGInterchangeFormatLength", znVar3);
            }
            zn znVar4 = this.f6191a[8].get("AspectFrame");
            if (znVar4 != null) {
                int[] iArr = (int[]) znVar4.f(this.f6200s);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i8 = iArr[2];
                int i10 = iArr[0];
                if (i8 <= i10 || (i = iArr[3]) <= (i5 = iArr[1])) {
                    return;
                }
                int i11 = (i8 - i10) + 1;
                int i12 = (i - i5) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                zn znVarA = zn.a(i11, this.f6200s);
                zn znVarA2 = zn.a(i12, this.f6200s);
                this.f6191a[0].put("ImageWidth", znVarA);
                this.f6191a[0].put("ImageLength", znVarA2);
            }
        }
    }

    public final void t(a aVar) throws IOException {
        if (f6179r) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + aVar);
        }
        f(aVar);
        zn znVar = this.f6191a[0].get("JpgFromRaw");
        if (znVar != null) {
            a(new n3(znVar.gv), (int) znVar.zn, 5);
        }
        zn znVar2 = this.f6191a[0].get("ISO");
        zn znVar3 = this.f6191a[1].get("PhotographicSensitivity");
        if (znVar2 == null || znVar3 != null) {
            return;
        }
        this.f6191a[1].put("PhotographicSensitivity", znVar2);
    }

    public final ByteOrder ta(n3 n3Var) throws IOException {
        short s3 = n3Var.readShort();
        if (s3 == 18761) {
            if (f6179r) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            if (f6179r) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    public final void tl(a aVar) throws IOException {
        byte[] bArr = f6188yg;
        aVar.w(bArr.length);
        byte[] bArr2 = new byte[aVar.available()];
        aVar.readFully(bArr2);
        this.w = bArr.length;
        d(bArr2, 0);
    }

    public final void ud(a aVar, int i) throws IOException {
        zn znVar = this.f6191a[i].get("ImageLength");
        zn znVar2 = this.f6191a[i].get("ImageWidth");
        if (znVar == null || znVar2 == null) {
            zn znVar3 = this.f6191a[i].get("JPEGInterchangeFormat");
            zn znVar4 = this.f6191a[i].get("JPEGInterchangeFormatLength");
            if (znVar3 == null || znVar4 == null) {
                return;
            }
            int iC5 = znVar3.c5(this.f6200s);
            int iC52 = znVar3.c5(this.f6200s);
            aVar.p(iC5);
            byte[] bArr = new byte[iC52];
            aVar.read(bArr);
            a(new n3(bArr), iC5, i);
        }
    }

    public final void v(a aVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                n3.n3.y(mediaMetadataRetriever, new y(this, aVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f6191a[0].put("ImageWidth", zn.a(Integer.parseInt(strExtractMetadata), this.f6200s));
                }
                if (strExtractMetadata2 != null) {
                    this.f6191a[0].put("ImageLength", zn.a(Integer.parseInt(strExtractMetadata2), this.f6200s));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    this.f6191a[0].put("Orientation", zn.a(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f6200s));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i8 = Integer.parseInt(strExtractMetadata5);
                    if (i8 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    aVar.p(i5);
                    byte[] bArr = new byte[6];
                    if (aVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i10 = i5 + 6;
                    int i11 = i8 - 6;
                    if (!Arrays.equals(bArr, f6188yg)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i11];
                    if (aVar.read(bArr2) != i11) {
                        throw new IOException("Can't read exif");
                    }
                    this.w = i10;
                    d(bArr2, 0);
                }
                if (f6179r) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    public final void w(n3 n3Var, HashMap map) throws IOException {
        zn znVar = (zn) map.get("StripOffsets");
        zn znVar2 = (zn) map.get("StripByteCounts");
        if (znVar == null || znVar2 == null) {
            return;
        }
        long[] jArrN3 = n3.n3(znVar.f(this.f6200s));
        long[] jArrN32 = n3.n3(znVar2.f(this.f6200s));
        if (jArrN3 == null || jArrN3.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrN32 == null || jArrN32.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrN3.length != jArrN32.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j4 = 0;
        for (long j7 : jArrN32) {
            j4 += j7;
        }
        int i = (int) j4;
        byte[] bArr = new byte[i];
        int i5 = 1;
        this.f6194f = true;
        this.f6197i9 = true;
        this.f6192c5 = true;
        int i8 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < jArrN3.length) {
            int i12 = (int) jArrN3[i8];
            int i13 = (int) jArrN32[i8];
            if (i8 < jArrN3.length - i5 && i12 + i13 != jArrN3[i8 + 1]) {
                this.f6194f = false;
            }
            int i14 = i12 - i10;
            if (i14 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j8 = i14;
            if (n3Var.skip(j8) != j8) {
                Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                return;
            }
            int i15 = i10 + i14;
            byte[] bArr2 = new byte[i13];
            if (n3Var.read(bArr2) != i13) {
                Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                return;
            }
            i10 = i15 + i13;
            System.arraycopy(bArr2, 0, bArr, i11, i13);
            i11 += i13;
            i8++;
            i5 = 1;
        }
        this.f6204wz = bArr;
        if (this.f6194f) {
            this.f6201t = (int) jArrN3[0];
            this.f6202tl = i;
        }
    }

    public final void wz(n3 n3Var) throws IOException {
        if (f6179r) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + n3Var);
        }
        n3Var.t(ByteOrder.LITTLE_ENDIAN);
        n3Var.w(f6185x.length);
        int i = n3Var.readInt() + 8;
        byte[] bArr = f6164b;
        n3Var.w(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (n3Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i5 = n3Var.readInt();
                int i8 = length + 8;
                if (Arrays.equals(f6174k5, bArr2)) {
                    byte[] bArr3 = new byte[i5];
                    if (n3Var.read(bArr3) == i5) {
                        this.w = i8;
                        d(bArr3, 0);
                        a8(new n3(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + n3.y(bArr2));
                    }
                }
                if (i5 % 2 == 1) {
                    i5++;
                }
                length = i8 + i5;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                n3Var.w(i5);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final boolean x4(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    public final void xc(n3 n3Var, HashMap map) throws IOException {
        zn znVar = (zn) map.get("JPEGInterchangeFormat");
        zn znVar2 = (zn) map.get("JPEGInterchangeFormatLength");
        if (znVar == null || znVar2 == null) {
            return;
        }
        int iC5 = znVar.c5(this.f6200s);
        int iC52 = znVar2.c5(this.f6200s);
        if (this.f6196gv == 7) {
            iC5 += this.f6199p;
        }
        if (iC5 > 0 && iC52 > 0) {
            this.f6192c5 = true;
            if (this.y == null && this.zn == null && this.n3 == null) {
                byte[] bArr = new byte[iC52];
                n3Var.skip(iC5);
                n3Var.read(bArr);
                this.f6204wz = bArr;
            }
            this.f6201t = iC5;
            this.f6202tl = iC52;
        }
        if (f6179r) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iC5 + ", length: " + iC52);
        }
    }

    public final void y() {
        String strN3 = n3("DateTimeOriginal");
        if (strN3 != null && n3("DateTime") == null) {
            this.f6191a[0].put("DateTime", zn.y(strN3));
        }
        if (n3("ImageWidth") == null) {
            this.f6191a[0].put("ImageWidth", zn.n3(0L, this.f6200s));
        }
        if (n3("ImageLength") == null) {
            this.f6191a[0].put("ImageLength", zn.n3(0L, this.f6200s));
        }
        if (n3("Orientation") == null) {
            this.f6191a[0].put("Orientation", zn.n3(0L, this.f6200s));
        }
        if (n3("LightSource") == null) {
            this.f6191a[1].put("LightSource", zn.n3(0L, this.f6200s));
        }
    }

    public final void yt() throws IOException {
        b(0, 5);
        b(0, 4);
        b(5, 4);
        zn znVar = this.f6191a[1].get("PixelXDimension");
        zn znVar2 = this.f6191a[1].get("PixelYDimension");
        if (znVar != null && znVar2 != null) {
            this.f6191a[0].put("ImageWidth", znVar);
            this.f6191a[0].put("ImageLength", znVar2);
        }
        if (this.f6191a[4].isEmpty() && c(this.f6191a[5])) {
            HashMap<String, zn>[] mapArr = this.f6191a;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!c(this.f6191a[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        ej(0, "ThumbnailOrientation", "Orientation");
        ej(0, "ThumbnailImageLength", "ImageLength");
        ej(0, "ThumbnailImageWidth", "ImageWidth");
        ej(5, "ThumbnailOrientation", "Orientation");
        ej(5, "ThumbnailImageLength", "ImageLength");
        ej(5, "ThumbnailImageWidth", "ImageWidth");
        ej(4, "Orientation", "ThumbnailOrientation");
        ej(4, "ImageLength", "ThumbnailImageLength");
        ej(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final boolean z(byte[] bArr) throws Throwable {
        InputStream inputStream = null;
        try {
            InputStream n3Var = new n3(bArr);
            try {
                ByteOrder byteOrderTa = ta(n3Var);
                this.f6200s = byteOrderTa;
                n3Var.t(byteOrderTa);
                short s3 = n3Var.readShort();
                boolean z = s3 == 20306 || s3 == 21330;
                n3Var.close();
                return z;
            } catch (Exception unused) {
                inputStream = n3Var;
                if (inputStream != null) {
                    inputStream.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                inputStream = n3Var;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z6(lc.y.a r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.y.z6(lc.y$a, int):void");
    }

    public int zn(@NonNull String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        zn znVarGv = gv(str);
        if (znVarGv == null) {
            return i;
        }
        try {
            return znVarGv.c5(this.f6200s);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(@androidx.annotation.NonNull java.io.InputStream r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            r3.<init>()
            lc.y$gv[][] r0 = lc.y.f6167eb
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f6191a = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f6195fb = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f6200s = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.y = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = lc.y.f6188yg
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = p(r5)
            if (r4 != 0) goto L34
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L34:
            r3.f6203v = r1
            r3.zn = r0
            r3.n3 = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.zn = r5
            r3.n3 = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = f3(r1)
            if (r1 == 0) goto L62
            r3.zn = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.n3 = r5
            goto L66
        L62:
            r3.zn = r0
            r3.n3 = r0
        L66:
            r3.fh(r4)
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.y.<init>(java.io.InputStream, int):void");
    }
}
