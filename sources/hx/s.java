package hx;

import androidx.annotation.Nullable;
import ft.g;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final k4.i4<String, String> f5399gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5400v;
    public final int y;
    public final g zn;

    public s(g gVar, int i, int i5, Map<String, String> map, String str) {
        this.y = i;
        this.n3 = i5;
        this.zn = gVar;
        this.f5399gv = k4.i4.f(map);
        this.f5400v = str;
    }

    public static int n3(String str) {
        v0.y.y(str.equals("L8") || str.equals("L16"));
        return str.equals("L8") ? 3 : 268435456;
    }

    public static String y(String str) {
        String strA = g4.zn.a(str);
        strA.hashCode();
        switch (strA) {
            case "MPEG4-GENERIC":
            case "MP4A-LATM":
                return "audio/mp4a-latm";
            case "L8":
            case "L16":
                return "audio/raw";
            case "AC3":
                return "audio/ac3";
            case "AMR":
                return "audio/3gpp";
            case "VP8":
                return "video/x-vnd.on2.vp8";
            case "VP9":
                return "video/x-vnd.on2.vp9";
            case "H264":
                return "video/avc";
            case "H265":
                return "video/hevc";
            case "OPUS":
                return "audio/opus";
            case "PCMA":
                return "audio/g711-alaw";
            case "PCMU":
                return "audio/g711-mlaw";
            case "AMR-WB":
                return "audio/amr-wb";
            case "MP4V-ES":
                return "video/mp4v-es";
            case "H263-1998":
            case "H263-2000":
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static boolean zn(y yVar) {
        String strA = g4.zn.a(yVar.f5419i9.n3);
        strA.hashCode();
        switch (strA) {
            case "MPEG4-GENERIC":
            case "L8":
            case "AC3":
            case "AMR":
            case "L16":
            case "VP8":
            case "VP9":
            case "H264":
            case "H265":
            case "OPUS":
            case "PCMA":
            case "PCMU":
            case "MP4A-LATM":
            case "AMR-WB":
            case "MP4V-ES":
            case "H263-1998":
            case "H263-2000":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.y == sVar.y && this.n3 == sVar.n3 && this.zn.equals(sVar.zn) && this.f5399gv.equals(sVar.f5399gv) && this.f5400v.equals(sVar.f5400v);
    }

    public int hashCode() {
        return ((((((((217 + this.y) * 31) + this.n3) * 31) + this.zn.hashCode()) * 31) + this.f5399gv.hashCode()) * 31) + this.f5400v.hashCode();
    }
}
