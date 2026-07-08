package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.i9;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k4.i4;
import r0.d0;
import r0.j5;
import r0.p;
import r0.tl;
import r0.xc;
import v0.ut;
import v5.mg;

/* JADX INFO: loaded from: classes.dex */
public final class t implements tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<String, String> f1543gv;

    @Nullable
    public final String n3;
    public final tl.y y;
    public final boolean zn;

    public t(@Nullable String str, boolean z, tl.y yVar) {
        v0.y.y((z && TextUtils.isEmpty(str)) ? false : true);
        this.y = yVar;
        this.n3 = str;
        this.zn = z;
        this.f1543gv = new HashMap();
    }

    @Nullable
    public static String gv(d0.v vVar, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i5 = vVar.responseCode;
        if ((i5 != 307 && i5 != 308) || i >= 5 || (map = vVar.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static byte[] zn(tl.y yVar, String str, @Nullable byte[] bArr, Map<String, String> map) throws mg {
        j5 j5Var = new j5(yVar.y());
        p pVarY = new p.n3().i9(str).v(map).gv(2).zn(bArr).n3(1).y();
        int i = 0;
        p pVarY2 = pVarY;
        while (true) {
            try {
                xc xcVar = new xc(j5Var, pVarY2);
                try {
                    try {
                        return ut.vn(xcVar);
                    } catch (d0.v e4) {
                        String strGv = gv(e4, i);
                        if (strGv == null) {
                            throw e4;
                        }
                        i++;
                        pVarY2 = pVarY2.y().i9(strGv).y();
                    }
                } finally {
                    ut.wz(xcVar);
                }
            } catch (Exception e5) {
                throw new mg(pVarY, (Uri) v0.y.v(j5Var.c5()), j5Var.fb(), j5Var.a(), e5);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.tl
    public byte[] n3(UUID uuid, i9.y yVar) throws mg {
        String strN3 = yVar.n3();
        if (this.zn || TextUtils.isEmpty(strN3)) {
            strN3 = this.n3;
        }
        if (TextUtils.isEmpty(strN3)) {
            p.n3 n3Var = new p.n3();
            Uri uri = Uri.EMPTY;
            throw new mg(n3Var.c5(uri).y(), uri, i4.f3(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = ft.c5.f4652v;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : ft.c5.zn.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f1543gv) {
            map.putAll(this.f1543gv);
        }
        return zn(this.y, strN3, yVar.y(), map);
    }

    public void v(String str, String str2) {
        v0.y.v(str);
        v0.y.v(str2);
        synchronized (this.f1543gv) {
            this.f1543gv.put(str, str2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.tl
    public byte[] y(UUID uuid, i9.gv gvVar) throws mg {
        return zn(this.y, gvVar.n3() + "&signedRequest=" + ut.mg(gvVar.y()), null, Collections.emptyMap());
    }
}
