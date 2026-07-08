package oh1;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import x8.gv;
import zh1.x4;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final zn y = new zn();
    public static final byte[] n3 = {111, 102, 102, 105, 99, 105, 97, 108, 112, 107, 103};

    public static final n3 n3(Context context, String str, boolean z) {
        if (str == null || Intrinsics.areEqual(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, str) || context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            ApplicationInfo applicationInfo = packageInfo != null ? packageInfo.applicationInfo : null;
            if (applicationInfo == null) {
                return null;
            }
            n3 n3Var = new n3();
            n3Var.n3(applicationInfo.loadLabel(packageManager).toString());
            n3Var.zn(packageInfo.firstInstallTime);
            n3Var.v(packageInfo.lastUpdateTime);
            n3Var.a(packageInfo.packageName);
            n3Var.fb(packageInfo.versionCode);
            n3Var.s(packageInfo.versionName);
            if (z) {
                n3Var.gv(applicationInfo.loadIcon(packageManager));
            }
            return n3Var;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final n3 y(Context context, String str) {
        return n3(context, str, false);
    }

    public final String a(byte[] bArr) {
        return x4.y.n3(bArr);
    }

    public final Signature gv(Application application) {
        PackageManager packageManager;
        Object objM31constructorimpl;
        Signature[] signatureArrY;
        String packageName = application.getPackageName();
        if (packageName == null) {
            return null;
        }
        if (packageName.length() <= 0) {
            packageName = null;
        }
        if (packageName == null || (packageManager = application.getPackageManager()) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfoY = gv.y(packageManager.getPackageInfo(packageName, 134217728));
                signatureArrY = signingInfoY != null ? sg0.n3.y(signingInfoY) : null;
            } else {
                signatureArrY = packageManager.getPackageInfo(packageName, 64).signatures;
            }
            objM31constructorimpl = Result.m31constructorimpl(signatureArrY);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m36isFailureimpl(objM31constructorimpl)) {
            objM31constructorimpl = null;
        }
        Signature[] signatureArr = (Signature[]) objM31constructorimpl;
        if (signatureArr != null) {
            return (Signature) ArraysKt.firstOrNull(signatureArr);
        }
        return null;
    }

    public final String v(Context context) {
        Application applicationZn;
        n3 n3VarY = y(context, (context == null || (applicationZn = rh1.n3.zn(context)) == null) ? null : applicationZn.getPackageName());
        if (n3VarY != null) {
            return n3VarY.y();
        }
        return null;
    }

    public final String zn(Application appContext) {
        byte[] byteArray;
        String strA;
        byte[] bArrPlus;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Signature signatureGv = gv(appContext);
        if (signatureGv != null && (byteArray = signatureGv.toByteArray()) != null && (strA = a(byteArray)) != null) {
            byte[] bytes = strA.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes != null && (bArrPlus = ArraysKt.plus(bytes, n3)) != null) {
                return a(bArrPlus);
            }
        }
        return null;
    }
}
