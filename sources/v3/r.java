package v3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import z3.a;
import z3.n3;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final z f8796gv;
    public final p n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public PackageInfo f8797v;
    public final a y;
    public final Context zn;

    public r(Context context, a aVar, p pVar) {
        z zVar = new z(new n3(aVar));
        this.y = aVar;
        this.n3 = pVar;
        this.zn = context;
        this.f8796gv = zVar;
    }

    @Nullable
    public static X509Certificate v(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e4) {
            Log.e("SplitCompat", "Cannot decode certificate.", e4);
            return null;
        }
    }

    @Nullable
    public final PackageInfo gv() {
        if (this.f8797v == null) {
            try {
                this.f8797v = this.zn.getPackageManager().getPackageInfo(this.zn.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f8797v;
    }

    public final boolean n3(List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.y.fb(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean y(File[] fileArr) throws XmlPullParserException, IOException {
        long longVersionCode = Build.VERSION.SDK_INT >= 28 ? gv().getLongVersionCode() : r0.versionCode;
        AssetManager assetManager = (AssetManager) oz.zn(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f8796gv.n3(assetManager, fileArr[length]);
        } while (longVersionCode == this.f8796gv.y());
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: v3.m */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 32);
        r3.append("Downloaded split ");
        r3.append(r6);
        r3.append(" is not signed.");
        android.util.Log.e("SplitCompat", r3.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zn(java.io.File[] r13) throws v3.m {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.r.zn(java.io.File[]):boolean");
    }
}
