package ft;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import ft.s;

/* JADX INFO: loaded from: classes.dex */
public class bv extends Exception implements s {
    public final int errorCode;
    public final long timestampMs;
    public static final String y = v0.ut.g3(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f4650v = v0.ut.g3(1);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final String f4647fb = v0.ut.g3(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f4648s = v0.ut.g3(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f4646f = v0.ut.g3(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s.y<bv> f4649t = new s.y() { // from class: ft.gf
        @Override // ft.s.y
        public final s fromBundle(Bundle bundle) {
            return new bv(bundle);
        }
    };

    public bv(Bundle bundle) {
        this(bundle.getString(f4647fb), gv(bundle), bundle.getInt(y, 1000), bundle.getLong(f4650v, SystemClock.elapsedRealtime()));
    }

    @Nullable
    public static Throwable gv(Bundle bundle) {
        String string = bundle.getString(f4648s);
        String string2 = bundle.getString(f4646f);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, bv.class.getClassLoader());
            Throwable thN3 = Throwable.class.isAssignableFrom(cls) ? n3(cls, string2) : null;
            if (thN3 != null) {
                return thN3;
            }
        } catch (Throwable unused) {
        }
        return y(string2);
    }

    public static Throwable n3(Class<?> cls, @Nullable String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static String w(int i) {
        if (i == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (i) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i) {
                    case 2000:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case 2001:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case 2002:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case 2003:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case 2004:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case 2006:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case 2008:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case 6001:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case 6002:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case 6003:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    public static RemoteException y(@Nullable String str) {
        return new RemoteException(str);
    }

    public final String t() {
        return w(this.errorCode);
    }

    @Override // ft.s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(y, this.errorCode);
        bundle.putLong(f4650v, this.timestampMs);
        bundle.putString(f4647fb, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f4648s, cause.getClass().getName());
            bundle.putString(f4646f, cause.getMessage());
        }
        return bundle;
    }

    public bv(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }
}
