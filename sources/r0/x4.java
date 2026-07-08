package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import k4.oz;
import r0.d0;
import r0.x4;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class x4 extends fb implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7569a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final d0.a f7570c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f7571co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7572f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f7573fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final d0.a f7574i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public long f7575mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7576p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f7577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public g4.w<String> f7578t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public p f7579tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f7580v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public HttpURLConnection f7581wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public InputStream f7582xc;

    public static final class n3 implements d0.n3 {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f7584fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public String f7585gv;

        @Nullable
        public o n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f7586s;

        @Nullable
        public g4.w<String> zn;
        public final d0.a y = new d0.a();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f7587v = 8000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7583a = 8000;

        public n3 gv(int i) {
            this.f7583a = i;
            return this;
        }

        @Override // r0.tl.y
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public x4 y() {
            x4 x4Var = new x4(this.f7585gv, this.f7587v, this.f7583a, this.f7584fb, this.y, this.zn, this.f7586s);
            o oVar = this.n3;
            if (oVar != null) {
                x4Var.co(oVar);
            }
            return x4Var;
        }

        public n3 v(@Nullable String str) {
            this.f7585gv = str;
            return this;
        }

        public n3 zn(int i) {
            this.f7587v = i;
            return this;
        }
    }

    public static class zn extends k4.w<String, List<String>> {
        public final Map<String, List<String>> y;

        public zn(Map<String, List<String>> map) {
            this.y = map;
        }

        public static /* synthetic */ boolean f(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean t(String str) {
            return str != null;
        }

        @Override // k4.w, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return super.v(obj);
        }

        @Override // k4.w, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return oz.n3(super.entrySet(), new g4.w() { // from class: r0.f3
                @Override // g4.w
                public final boolean apply(Object obj) {
                    return x4.zn.f((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(@Nullable Object obj) {
            return obj != null && super.a(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.fb();
        }

        @Override // k4.w, java.util.Map
        @Nullable
        /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
        public List<String> get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // k4.w, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // k4.w, java.util.Map
        public Set<String> keySet() {
            return oz.n3(super.keySet(), new g4.w() { // from class: r0.i4
                @Override // g4.w
                public final boolean apply(Object obj) {
                    return x4.zn.t((String) obj);
                }
            });
        }

        @Override // k4.w, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // k4.p
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public Map<String, List<String>> y() {
            return this.y;
        }
    }

    public static boolean c(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection fh(p pVar) throws IOException {
        HttpURLConnection httpURLConnectionD0;
        URL url;
        URL url2 = new URL(pVar.y.toString());
        int i = pVar.zn;
        byte[] bArr = pVar.f7522gv;
        long j = pVar.f7521fb;
        long j4 = pVar.f7524s;
        boolean zGv = pVar.gv(1);
        if (!this.f7580v && !this.f7572f) {
            return d0(url2, i, bArr, j, j4, zGv, true, pVar.f7525v);
        }
        int i5 = 0;
        URL urlN = url2;
        int i8 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i10 = i5 + 1;
            if (i5 > 20) {
                throw new d0.zn(new NoRouteToHostException("Too many redirects: " + i10), pVar, 2001, 1);
            }
            long j7 = j;
            long j8 = j;
            int i11 = i8;
            URL url3 = urlN;
            long j9 = j4;
            httpURLConnectionD0 = d0(urlN, i8, bArr2, j7, j4, zGv, false, pVar.f7525v);
            int responseCode = httpURLConnectionD0.getResponseCode();
            String headerField = httpURLConnectionD0.getHeaderField("Location");
            if ((i11 == 1 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionD0.disconnect();
                urlN = n(url3, headerField, pVar);
                i8 = i11;
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionD0.disconnect();
                if (this.f7572f && responseCode == 302) {
                    i8 = i11;
                    url = url3;
                } else {
                    bArr2 = null;
                    url = url3;
                    i8 = 1;
                }
                urlN = n(url, headerField, pVar);
            }
            i5 = i10;
            j = j8;
            j4 = j9;
        }
        return httpURLConnectionD0;
    }

    public static void rz(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = ut.y) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) v0.y.v(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // r0.tl
    public void close() throws d0.zn {
        try {
            InputStream inputStream = this.f7582xc;
            if (inputStream != null) {
                long j = this.f7575mt;
                long j4 = -1;
                if (j != -1) {
                    j4 = j - this.f7571co;
                }
                rz(this.f7581wz, j4);
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new d0.zn(e4, (p) ut.i9(this.f7579tl), 2000, 3);
                }
            }
        } finally {
            this.f7582xc = null;
            f3();
            if (this.w) {
                this.w = false;
                r();
            }
        }
    }

    public final void d(long j, p pVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) ut.i9(this.f7582xc)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new d0.zn(new InterruptedIOException(), pVar, 2000, 1);
            }
            if (i == -1) {
                throw new d0.zn(pVar, 2008, 1);
            }
            j -= (long) i;
            p(i);
        }
    }

    public final HttpURLConnection d0(URL url, int i, @Nullable byte[] bArr, long j, long j4, boolean z, boolean z5, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionMg = mg(url);
        httpURLConnectionMg.setConnectTimeout(this.f7569a);
        httpURLConnectionMg.setReadTimeout(this.f7573fb);
        HashMap map2 = new HashMap();
        d0.a aVar = this.f7570c5;
        if (aVar != null) {
            map2.putAll(aVar.y());
        }
        map2.putAll(this.f7574i9.y());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionMg.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strY = fh.y(j, j4);
        if (strY != null) {
            httpURLConnectionMg.setRequestProperty("Range", strY);
        }
        String str = this.f7577s;
        if (str != null) {
            httpURLConnectionMg.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionMg.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnectionMg.setInstanceFollowRedirects(z5);
        httpURLConnectionMg.setDoOutput(bArr != null);
        httpURLConnectionMg.setRequestMethod(p.zn(i));
        if (bArr != null) {
            httpURLConnectionMg.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionMg.connect();
            OutputStream outputStream = httpURLConnectionMg.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionMg.connect();
        }
        return httpURLConnectionMg;
    }

    public final void f3() {
        HttpURLConnection httpURLConnection = this.f7581wz;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                v0.r.gv("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.f7581wz = null;
        }
    }

    @Override // r0.fb, r0.tl
    public Map<String, List<String>> fb() {
        HttpURLConnection httpURLConnection = this.f7581wz;
        return httpURLConnection == null ? k4.i4.f3() : new zn(httpURLConnection.getHeaderFields());
    }

    public HttpURLConnection mg(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public final URL n(URL url, @Nullable String str, p pVar) throws d0.zn {
        if (str == null) {
            throw new d0.zn("Null location redirect", pVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new d0.zn("Unsupported protocol redirect: " + protocol, pVar, 2001, 1);
            }
            if (this.f7580v || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new d0.zn("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", pVar, 2001, 1);
        } catch (MalformedURLException e4) {
            throw new d0.zn(e4, pVar, 2001, 1);
        }
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        HttpURLConnection httpURLConnection = this.f7581wz;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws d0.zn {
        try {
            return ta(bArr, i, i5);
        } catch (IOException e4) {
            throw d0.zn.gv(e4, (p) ut.i9(this.f7579tl), 2);
        }
    }

    public final int ta(byte[] bArr, int i, int i5) throws IOException {
        if (i5 == 0) {
            return 0;
        }
        long j = this.f7575mt;
        if (j != -1) {
            long j4 = j - this.f7571co;
            if (j4 == 0) {
                return -1;
            }
            i5 = (int) Math.min(i5, j4);
        }
        int i8 = ((InputStream) ut.i9(this.f7582xc)).read(bArr, i, i5);
        if (i8 == -1) {
            return -1;
        }
        this.f7571co += (long) i8;
        p(i8);
        return i8;
    }

    @Override // r0.tl
    public long y(p pVar) throws d0.zn {
        byte[] bArrVn;
        this.f7579tl = pVar;
        long j = 0;
        this.f7571co = 0L;
        this.f7575mt = 0L;
        x4(pVar);
        try {
            HttpURLConnection httpURLConnectionFh = fh(pVar);
            this.f7581wz = httpURLConnectionFh;
            this.f7576p = httpURLConnectionFh.getResponseCode();
            String responseMessage = httpURLConnectionFh.getResponseMessage();
            int i = this.f7576p;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionFh.getHeaderFields();
                if (this.f7576p == 416) {
                    if (pVar.f7521fb == fh.zn(httpURLConnectionFh.getHeaderField("Content-Range"))) {
                        this.w = true;
                        i4(pVar);
                        long j4 = pVar.f7524s;
                        if (j4 != -1) {
                            return j4;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionFh.getErrorStream();
                try {
                    bArrVn = errorStream != null ? ut.vn(errorStream) : ut.f8757a;
                } catch (IOException unused) {
                    bArrVn = ut.f8757a;
                }
                byte[] bArr = bArrVn;
                f3();
                throw new d0.v(this.f7576p, responseMessage, this.f7576p == 416 ? new wz(2008) : null, headerFields, pVar, bArr);
            }
            String contentType = httpURLConnectionFh.getContentType();
            g4.w<String> wVar = this.f7578t;
            if (wVar != null && !wVar.apply(contentType)) {
                f3();
                throw new d0.gv(contentType, pVar);
            }
            if (this.f7576p == 200) {
                long j7 = pVar.f7521fb;
                if (j7 != 0) {
                    j = j7;
                }
            }
            boolean zC = c(httpURLConnectionFh);
            if (zC) {
                this.f7575mt = pVar.f7524s;
            } else {
                long j8 = pVar.f7524s;
                if (j8 != -1) {
                    this.f7575mt = j8;
                } else {
                    long jN3 = fh.n3(httpURLConnectionFh.getHeaderField("Content-Length"), httpURLConnectionFh.getHeaderField("Content-Range"));
                    this.f7575mt = jN3 != -1 ? jN3 - j : -1L;
                }
            }
            try {
                this.f7582xc = httpURLConnectionFh.getInputStream();
                if (zC) {
                    this.f7582xc = new GZIPInputStream(this.f7582xc);
                }
                this.w = true;
                i4(pVar);
                try {
                    d(j, pVar);
                    return this.f7575mt;
                } catch (IOException e4) {
                    f3();
                    if (e4 instanceof d0.zn) {
                        throw ((d0.zn) e4);
                    }
                    throw new d0.zn(e4, pVar, 2000, 1);
                }
            } catch (IOException e5) {
                f3();
                throw new d0.zn(e5, pVar, 2000, 1);
            }
        } catch (IOException e6) {
            f3();
            throw d0.zn.gv(e6, pVar, 1);
        }
    }

    public x4(@Nullable String str, int i, int i5, boolean z, @Nullable d0.a aVar, @Nullable g4.w<String> wVar, boolean z5) {
        super(true);
        this.f7577s = str;
        this.f7569a = i;
        this.f7573fb = i5;
        this.f7580v = z;
        this.f7570c5 = aVar;
        this.f7578t = wVar;
        this.f7574i9 = new d0.a();
        this.f7572f = z5;
    }
}
