package sj1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final y y = new y(null);
    private final String javaName;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final d y(String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return d.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return d.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return d.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return d.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return d.SSL_3_0;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", javaName));
        }

        public y() {
        }
    }

    d(String str) {
        this.javaName = str;
    }

    public final String n3() {
        return this.javaName;
    }
}
