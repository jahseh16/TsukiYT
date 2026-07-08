package ix;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import ix.k5;
import ix.y;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class j5 {
    public static final y.n3 y = new y.n3("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final y.n3 n3 = new y.n3("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final y.v zn = new y.v("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y.zn f5731gv = new y.zn("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y.a f5747v = new y.a("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final y.a f5722a = new y.a("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Deprecated
    public static final y.a f5730fb = new y.a("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y.a f5741s = new y.a("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final y.a f5725c5 = new y.a("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final y.a f5734i9 = new y.a("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y.zn f5729f = new y.zn("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y.zn f5742t = new y.zn("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final y.zn f5744tl = new y.zn("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final y.zn f5748wz = new y.zn("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final y.zn f5751xc = new y.zn("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final y.zn w = new y.zn("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y.n3 f5739p = new y.n3("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final y.n3 f5738mt = new y.n3("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final y.zn f5726co = new y.zn("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final y.a z = new y.a("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y.zn f5740r = new y.zn("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final y.n3 f5750x4 = new y.n3("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final y.n3 f5733i4 = new y.n3("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final y.a f3 = new y.a("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final y.a n = new y.a("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final y.a c = new y.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final y.n3 d0 = new y.n3("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final y.n3 fh = new y.n3("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final y.gv rz = new y.gv("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final y.n3 mg = new y.n3("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static final y.n3 f5743ta = new y.n3("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y.n3 f5727d = new y.n3("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final y.n3 f5753z6 = new y.n3("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final y.v f5728ej = new y.v("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final y.v f5745ud = new y.v("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public static final y.s f5723a8 = new y.s("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y.s f5749x = new y.s("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y.fb f5724b = new y.fb("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final k5.n3 f5737k5 = new k5.n3("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public static final k5.y f5752yt = new k5.y("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final y.s vl = new y.s("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static final y.c5 f5732hw = new y("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final y.gv f5735j5 = new y.gv("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final y.gv qn = new y.gv("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final y.s o = new y.s("FORCE_DARK", "FORCE_DARK");
    public static final y.gv j = new y.gv("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final y.gv oz = new y.gv("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public static final y.gv f5746ut = new y.gv("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final y.gv q9 = new y.gv("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y.gv f5736k = new y.gv("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final y.gv f7 = new y.gv("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final y.gv en = new y.gv("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    public static final y.gv jz = new y.gv("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    public static final y.gv u = new y.gv("USER_AGENT_METADATA", "USER_AGENT_METADATA");
    public static final y.gv y5 = new n3("MULTI_PROFILE", "MULTI_PROFILE");
    public static final y.gv xg = new y.gv("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    public class n3 extends y.gv {
        public n3(String str, String str2) {
            super(str, str2);
        }

        @Override // ix.y
        public boolean gv() {
            if (super.gv() && ro.c5.y("MULTI_PROCESS")) {
                return ro.s.s();
            }
            return false;
        }
    }

    public class y extends y.c5 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Pattern f5754gv;

        public y(String str, String str2) {
            super(str, str2);
            this.f5754gv = Pattern.compile("\\A\\d+");
        }

        @Override // ix.y
        public boolean gv() {
            boolean zGv = super.gv();
            if (!zGv || Build.VERSION.SDK_INT >= 29) {
                return zGv;
            }
            PackageInfo packageInfoZn = ro.s.zn();
            if (packageInfoZn == null) {
                return false;
            }
            Matcher matcher = this.f5754gv.matcher(packageInfoZn.versionName);
            return matcher.find() && Integer.parseInt(packageInfoZn.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public static boolean n3(@NonNull String str) {
        return zn(str, ix.y.v());
    }

    @NonNull
    public static UnsupportedOperationException y() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static <T extends d> boolean zn(@NonNull String str, @NonNull Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t3 : collection) {
            if (t3.y().equals(str)) {
                hashSet.add(t3);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).n3()) {
                return true;
            }
        }
        return false;
    }
}
