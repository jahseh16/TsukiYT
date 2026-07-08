package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import k4.c;
import k4.r;
import k4.x4;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final v n3 = new n3().v();
    public final x4<String, String> y;

    public static String zn(String str) {
        return g4.zn.y(str, "Accept") ? "Accept" : g4.zn.y(str, "Allow") ? "Allow" : g4.zn.y(str, "Authorization") ? "Authorization" : g4.zn.y(str, "Bandwidth") ? "Bandwidth" : g4.zn.y(str, "Blocksize") ? "Blocksize" : g4.zn.y(str, "Cache-Control") ? "Cache-Control" : g4.zn.y(str, "Connection") ? "Connection" : g4.zn.y(str, "Content-Base") ? "Content-Base" : g4.zn.y(str, "Content-Encoding") ? "Content-Encoding" : g4.zn.y(str, "Content-Language") ? "Content-Language" : g4.zn.y(str, "Content-Length") ? "Content-Length" : g4.zn.y(str, "Content-Location") ? "Content-Location" : g4.zn.y(str, "Content-Type") ? "Content-Type" : g4.zn.y(str, "CSeq") ? "CSeq" : g4.zn.y(str, "Date") ? "Date" : g4.zn.y(str, "Expires") ? "Expires" : g4.zn.y(str, "Location") ? "Location" : g4.zn.y(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : g4.zn.y(str, "Proxy-Require") ? "Proxy-Require" : g4.zn.y(str, "Public") ? "Public" : g4.zn.y(str, "Range") ? "Range" : g4.zn.y(str, "RTP-Info") ? "RTP-Info" : g4.zn.y(str, "RTCP-Interval") ? "RTCP-Interval" : g4.zn.y(str, "Scale") ? "Scale" : g4.zn.y(str, "Session") ? "Session" : g4.zn.y(str, "Speed") ? "Speed" : g4.zn.y(str, "Supported") ? "Supported" : g4.zn.y(str, "Timestamp") ? "Timestamp" : g4.zn.y(str, "Transport") ? "Transport" : g4.zn.y(str, "User-Agent") ? "User-Agent" : g4.zn.y(str, "Via") ? "Via" : g4.zn.y(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.y.equals(((v) obj).y);
        }
        return false;
    }

    @Nullable
    public String gv(String str) {
        r<String> rVarV = v(str);
        if (rVarV.isEmpty()) {
            return null;
        }
        return (String) c.gv(rVarV);
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public x4<String, String> n3() {
        return this.y;
    }

    public r<String> v(String str) {
        return this.y.k(zn(str));
    }

    public static final class n3 {
        public final x4.y<String, String> y;

        public n3() {
            this.y = new x4.y<>();
        }

        public n3 gv(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                n3(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public n3 n3(String str, String str2) {
            this.y.v(v.zn(str.trim()), str2.trim());
            return this;
        }

        public v v() {
            return new v(this);
        }

        public n3 zn(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] strArrIx = ut.ix(list.get(i), ":\\s?");
                if (strArrIx.length == 2) {
                    n3(strArrIx[0], strArrIx[1]);
                }
            }
            return this;
        }

        public n3(String str, @Nullable String str2, int i) {
            this();
            n3("User-Agent", str);
            n3("CSeq", String.valueOf(i));
            if (str2 != null) {
                n3("Session", str2);
            }
        }
    }

    public v(n3 n3Var) {
        this.y = n3Var.y.gv();
    }
}
