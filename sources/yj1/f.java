package yj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y f9321gv = new y(null);
    public final int n3;
    public final c y;
    public final String zn;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f y(String statusLine) throws IOException {
            c cVar;
            int i;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.startsWith$default(statusLine, "HTTP/1.", false, 2, (Object) null)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    cVar = c.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                    }
                    cVar = c.HTTP_1_1;
                }
            } else {
                if (!StringsKt.startsWith$default(statusLine, "ICY ", false, 2, (Object) null)) {
                    throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                }
                cVar = c.HTTP_1_0;
                i = 4;
            }
            int i5 = i + 3;
            if (statusLine.length() < i5) {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i5);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i8 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i5) {
                    strSubstring = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                } else {
                    if (statusLine.charAt(i5) != ' ') {
                        throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new f(cVar, i8, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
            }
        }

        public y() {
        }
    }

    public f(c protocol, int i, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.y = protocol;
        this.n3 = i;
        this.zn = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.y == c.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.n3);
        sb.append(' ');
        sb.append(this.zn);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
