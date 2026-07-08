package r0;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r0.tl;

/* JADX INFO: loaded from: classes.dex */
public interface d0 extends tl {

    public static final class a {

        @Nullable
        public Map<String, String> n3;
        public final Map<String, String> y = new HashMap();

        public synchronized Map<String, String> y() {
            try {
                if (this.n3 == null) {
                    this.n3 = Collections.unmodifiableMap(new HashMap(this.y));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.n3;
        }
    }

    public static final class gv extends zn {
        public final String contentType;

        public gv(String str, p pVar) {
            super("Invalid content type: " + str, pVar, 2003, 1);
            this.contentType = str;
        }
    }

    public interface n3 extends tl.y {
        @Override // r0.tl.y
        d0 y();
    }

    public static final class v extends zn {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;

        @Nullable
        public final String responseMessage;

        public v(int i, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, p pVar, byte[] bArr) {
            super("Response code: " + i, iOException, pVar, 2004, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    public static final class y extends zn {
        public y(IOException iOException, p pVar) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, pVar, 2007, 1);
        }
    }

    public static class zn extends wz {
        public final p dataSpec;
        public final int type;

        public zn(p pVar, int i, int i5) {
            super(n3(i, i5));
            this.dataSpec = pVar;
            this.type = i5;
        }

        public static zn gv(IOException iOException, p pVar, int i) {
            String message = iOException.getMessage();
            int i5 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !g4.zn.v(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i5 == 2007 ? new y(iOException, pVar) : new zn(iOException, pVar, i5, i);
        }

        public static int n3(int i, int i5) {
            if (i == 2000 && i5 == 1) {
                return 2001;
            }
            return i;
        }

        public zn(String str, p pVar, int i, int i5) {
            super(str, n3(i, i5));
            this.dataSpec = pVar;
            this.type = i5;
        }

        public zn(IOException iOException, p pVar, int i, int i5) {
            super(iOException, n3(i, i5));
            this.dataSpec = pVar;
            this.type = i5;
        }

        public zn(String str, @Nullable IOException iOException, p pVar, int i, int i5) {
            super(str, iOException, n3(i, i5));
            this.dataSpec = pVar;
            this.type = i5;
        }
    }
}
