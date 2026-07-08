package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.n3;
import ft.xb;
import java.util.Map;
import k4.k;
import r0.tl;
import r0.x4;
import v0.ut;
import v5.r;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements r {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public tl.y f1564gv;
    public xb.a n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public String f1565v;
    public final Object y = new Object();
    public a zn;

    public final a n3(xb.a aVar) {
        tl.y yVarV = this.f1564gv;
        if (yVarV == null) {
            yVarV = new x4.n3().v(this.f1565v);
        }
        Uri uri = aVar.zn;
        t tVar = new t(uri == null ? null : uri.toString(), aVar.f5087s, yVarV);
        k<Map.Entry<String, String>> it = aVar.f5088v.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            tVar.v(next.getKey(), next.getValue());
        }
        n3 n3VarY = new n3.C0049n3().v(aVar.y, f.f1517gv).n3(aVar.f5081a).zn(aVar.f5084fb).gv(n4.a.wz(aVar.f5086i9)).y(tVar);
        n3VarY.ta(0, aVar.zn());
        return n3VarY;
    }

    @Override // v5.r
    public a y(xb xbVar) {
        a aVar;
        v0.y.v(xbVar.f5080v);
        xb.a aVar2 = xbVar.f5080v.zn;
        if (aVar2 == null || ut.y < 18) {
            return a.y;
        }
        synchronized (this.y) {
            try {
                if (!ut.zn(aVar2, this.n3)) {
                    this.n3 = aVar2;
                    this.zn = n3(aVar2);
                }
                aVar = (a) v0.y.v(this.zn);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
