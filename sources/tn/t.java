package tn;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.UUID;
import v0.d;
import v0.r;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static class y {
        public final int n3;
        public final UUID y;
        public final byte[] zn;

        public y(UUID uuid, int i, byte[] bArr) {
            this.y = uuid;
            this.n3 = i;
            this.zn = bArr;
        }
    }

    @Nullable
    public static UUID a(byte[] bArr) {
        y yVarGv = gv(bArr);
        if (yVarGv == null) {
            return null;
        }
        return yVarGv.y;
    }

    public static int fb(byte[] bArr) {
        y yVarGv = gv(bArr);
        if (yVarGv == null) {
            return -1;
        }
        return yVarGv.n3;
    }

    @Nullable
    public static y gv(byte[] bArr) {
        d dVar = new d(bArr);
        if (dVar.fb() < 32) {
            return null;
        }
        dVar.oz(0);
        if (dVar.p() != dVar.y() + 4 || dVar.p() != 1886614376) {
            return null;
        }
        int iZn = tn.y.zn(dVar.p());
        if (iZn > 1) {
            r.c5("PsshAtomUtil", "Unsupported pssh version: " + iZn);
            return null;
        }
        UUID uuid = new UUID(dVar.d0(), dVar.d0());
        if (iZn == 1) {
            dVar.ut(dVar.b() * 16);
        }
        int iB = dVar.b();
        if (iB != dVar.y()) {
            return null;
        }
        byte[] bArr2 = new byte[iB];
        dVar.t(bArr2, 0, iB);
        return new y(uuid, iZn, bArr2);
    }

    public static byte[] n3(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    @Nullable
    public static byte[] v(byte[] bArr, UUID uuid) {
        y yVarGv = gv(bArr);
        if (yVarGv == null) {
            return null;
        }
        if (uuid.equals(yVarGv.y)) {
            return yVarGv.zn;
        }
        r.c5("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + yVarGv.y + ".");
        return null;
    }

    public static byte[] y(UUID uuid, @Nullable byte[] bArr) {
        return n3(uuid, null, bArr);
    }

    public static boolean zn(byte[] bArr) {
        return gv(bArr) != null;
    }
}
