package ua;

import androidx.annotation.Nullable;
import ft.g;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements y {
    public final g y;

    public fb(g gVar) {
        this.y = gVar;
    }

    @Nullable
    public static y gv(int i, d dVar) {
        if (i == 2) {
            return zn(dVar);
        }
        if (i == 1) {
            return v(dVar);
        }
        r.c5("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + ut.s8(i));
        return null;
    }

    @Nullable
    public static String n3(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @Nullable
    public static y v(d dVar) {
        int iC = dVar.c();
        String strN3 = n3(iC);
        if (strN3 == null) {
            r.c5("StreamFormatChunk", "Ignoring track with unsupported format tag " + iC);
            return null;
        }
        int iC2 = dVar.c();
        int iR = dVar.r();
        dVar.ut(6);
        int iXg = ut.xg(dVar.yt());
        int iC3 = dVar.c();
        byte[] bArr = new byte[iC3];
        dVar.t(bArr, 0, iC3);
        g.n3 n3Var = new g.n3();
        n3Var.o4(strN3).a8(iC2).rs(iR);
        if ("audio/raw".equals(strN3) && iXg != 0) {
            n3Var.jz(iXg);
        }
        if ("audio/mp4a-latm".equals(strN3) && iC3 > 0) {
            n3Var.ut(k4.r.j(bArr));
        }
        return new fb(n3Var.z6());
    }

    @Nullable
    public static String y(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    @Nullable
    public static y zn(d dVar) {
        dVar.ut(4);
        int iR = dVar.r();
        int iR2 = dVar.r();
        dVar.ut(4);
        int iR3 = dVar.r();
        String strY = y(iR3);
        if (strY != null) {
            g.n3 n3Var = new g.n3();
            n3Var.s8(iR).o(iR2).o4(strY);
            return new fb(n3Var.z6());
        }
        r.c5("StreamFormatChunk", "Ignoring track with unsupported compression " + iR3);
        return null;
    }

    @Override // ua.y
    public int getType() {
        return 1718776947;
    }
}
