package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.source.rtsp.s;
import ft.q;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String f1854gv;
    public final String n3;
    public final int y;
    public final String zn;

    public zn(int i, String str, String str2, String str3) {
        this.y = i;
        this.n3 = str;
        this.zn = str2;
        this.f1854gv = str3;
    }

    public final String n3(s.y yVar) {
        return ut.rz("Basic %s", Base64.encodeToString(s.gv(yVar.y + ":" + yVar.n3), 0));
    }

    public String y(s.y yVar, Uri uri, int i) throws q {
        int i5 = this.y;
        if (i5 == 1) {
            return n3(yVar);
        }
        if (i5 == 2) {
            return zn(yVar, uri, i);
        }
        throw q.a(null, new UnsupportedOperationException());
    }

    public final String zn(s.y yVar, Uri uri, int i) throws q {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strZ = s.z(i);
            String strJ3 = ut.j3(messageDigest.digest(s.gv(yVar.y + ":" + this.n3 + ":" + yVar.n3)));
            StringBuilder sb = new StringBuilder();
            sb.append(strZ);
            sb.append(":");
            sb.append(uri);
            String strJ32 = ut.j3(messageDigest.digest(s.gv(strJ3 + ":" + this.zn + ":" + ut.j3(messageDigest.digest(s.gv(sb.toString()))))));
            return this.f1854gv.isEmpty() ? ut.rz("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", yVar.y, this.n3, this.zn, uri, strJ32) : ut.rz("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", yVar.y, this.n3, this.zn, uri, strJ32, this.f1854gv);
        } catch (NoSuchAlgorithmException e4) {
            throw q.a(null, e4);
        }
    }
}
