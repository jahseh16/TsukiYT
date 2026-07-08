package jn;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    @Nullable
    public f y(hx.s sVar) {
        String str = (String) v0.y.v(sVar.zn.f3);
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return new v(sVar);
            case "video/hevc":
                return new fb(sVar);
            case "audio/amr-wb":
            case "audio/3gpp":
                return new gv(sVar);
            case "audio/mp4a-latm":
                return sVar.f5400v.equals("MP4A-LATM") ? new s(sVar) : new n3(sVar);
            case "audio/ac3":
                return new zn(sVar);
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return new t(sVar);
            case "video/mp4v-es":
                return new c5(sVar);
            case "video/avc":
                return new a(sVar);
            case "audio/opus":
                return new i9(sVar);
            case "video/x-vnd.on2.vp8":
                return new wz(sVar);
            case "video/x-vnd.on2.vp9":
                return new xc(sVar);
            default:
                return null;
        }
    }
}
