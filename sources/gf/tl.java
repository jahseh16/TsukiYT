package gf;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.room.TypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import yk.xc;
import yk.z;
import yk.zn;

/* JADX INFO: loaded from: classes.dex */
public class tl {
    @TypeConverter
    public static int backoffPolicyToInt(yk.y yVar) {
        int i = y.n3[yVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + yVar + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.room.TypeConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yk.zn byteArrayToContentUriTriggers(byte[] r6) throws java.lang.Throwable {
        /*
            yk.zn r0 = new yk.zn
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.y(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L58
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L58
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L59
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L3b
        L58:
            return r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.tl.byteArrayToContentUriTriggers(byte[]):yk.zn");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0053 -> B:34:0x006a). Please report as a decompilation issue!!! */
    @TypeConverter
    public static byte[] contentUriTriggersToByteArray(yk.zn znVar) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (znVar.zn() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                objectOutputStream.writeInt(znVar.zn());
                for (zn.y yVar : znVar.n3()) {
                    objectOutputStream.writeUTF(yVar.y().toString());
                    objectOutputStream.writeBoolean(yVar.n3());
                }
                try {
                    objectOutputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                e = e6;
                objectOutputStream2 = objectOutputStream;
                e.printStackTrace();
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    throw th;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    @TypeConverter
    public static yk.y intToBackoffPolicy(int i) {
        if (i == 0) {
            return yk.y.EXPONENTIAL;
        }
        if (i == 1) {
            return yk.y.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    @TypeConverter
    public static yk.t intToNetworkType(int i) {
        if (i == 0) {
            return yk.t.NOT_REQUIRED;
        }
        if (i == 1) {
            return yk.t.CONNECTED;
        }
        if (i == 2) {
            return yk.t.UNMETERED;
        }
        if (i == 3) {
            return yk.t.NOT_ROAMING;
        }
        if (i == 4) {
            return yk.t.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return yk.t.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    @NonNull
    @TypeConverter
    public static xc intToOutOfQuotaPolicy(int i) {
        if (i == 0) {
            return xc.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return xc.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    @TypeConverter
    public static z.y intToState(int i) {
        if (i == 0) {
            return z.y.ENQUEUED;
        }
        if (i == 1) {
            return z.y.RUNNING;
        }
        if (i == 2) {
            return z.y.SUCCEEDED;
        }
        if (i == 3) {
            return z.y.FAILED;
        }
        if (i == 4) {
            return z.y.BLOCKED;
        }
        if (i == 5) {
            return z.y.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    @TypeConverter
    public static int networkTypeToInt(yk.t tVar) {
        int i = y.zn[tVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && tVar == yk.t.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + tVar + " to int");
    }

    @TypeConverter
    public static int outOfQuotaPolicyToInt(@NonNull xc xcVar) {
        int i = y.gv[xcVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + xcVar + " to int");
    }

    @TypeConverter
    public static int stateToInt(z.y yVar) {
        switch (y.y[yVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + yVar + " to int");
        }
    }
}
