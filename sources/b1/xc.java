package b1;

import androidx.annotation.Nullable;
import ft.q;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class xc {
    public static boolean gv(tl tlVar, byte[] bArr, int i, int i5) throws IOException {
        try {
            tlVar.readFully(bArr, i, i5);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean n3(tl tlVar, byte[] bArr, int i, int i5, boolean z) throws IOException {
        try {
            return tlVar.v(bArr, i, i5, z);
        } catch (EOFException e4) {
            if (z) {
                return false;
            }
            throw e4;
        }
    }

    public static boolean v(tl tlVar, int i) throws IOException {
        try {
            tlVar.w(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static void y(boolean z, @Nullable String str) throws q {
        if (!z) {
            throw q.y(str, null);
        }
    }

    public static int zn(tl tlVar, byte[] bArr, int i, int i5) throws IOException {
        int i8 = 0;
        while (i8 < i5) {
            int iXc = tlVar.xc(bArr, i + i8, i5 - i8);
            if (iXc == -1) {
                break;
            }
            i8 += iXc;
        }
        return i8;
    }
}
