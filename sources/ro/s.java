package ro;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ix.i4;
import ix.j;
import ix.j5;
import ix.o;
import ix.qn;
import ix.y;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public static final Uri y = Uri.parse("*");
    public static final Uri n3 = Uri.parse(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);

    public interface y {
        void onPostMessage(@NonNull WebView webView, @NonNull a aVar, @NonNull Uri uri, boolean z, @NonNull ro.y yVar);
    }

    public static o a(WebView webView) {
        return new o(n3(webView));
    }

    public static void c5(@NonNull WebView webView, @NonNull String str) {
        if (!j5.oz.gv()) {
            throw j5.y();
        }
        a(webView).zn(str);
    }

    @NonNull
    public static WebViewClient fb(@NonNull WebView webView) {
        y.v vVar = j5.f5728ej;
        if (vVar.zn()) {
            return i4.gv(webView);
        }
        if (vVar.gv()) {
            return a(webView).n3();
        }
        throw j5.y();
    }

    public static j gv() {
        return qn.zn();
    }

    public static WebViewProviderBoundaryInterface n3(WebView webView) {
        return gv().createWebView(webView);
    }

    public static boolean s() {
        if (j5.qn.gv()) {
            return gv().getStatics().isMultiProcessEnabled();
        }
        throw j5.y();
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo v() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static void y(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull y yVar) {
        if (!j5.oz.gv()) {
            throw j5.y();
        }
        a(webView).y(str, (String[]) set.toArray(new String[0]), yVar);
    }

    @Nullable
    public static PackageInfo zn() {
        if (Build.VERSION.SDK_INT >= 26) {
            return i4.y();
        }
        try {
            return v();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
