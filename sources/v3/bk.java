package v3;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bk {
    public static ByteBuffer a(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(iRemaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return v(byteBuffer, i);
        }
        int iRemaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i);
        sb2.append(", remaining: ");
        sb2.append(iRemaining2);
        throw new IOException(sb2.toString());
    }

    public static byte[] c5(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(iRemaining);
        throw new IOException(sb.toString());
    }

    public static byte[][] f(int[] iArr, f7[] f7VarArr) throws DigestException {
        long j;
        int i;
        int length;
        long j4 = 0;
        int i5 = 0;
        long jZza = 0;
        int i8 = 0;
        while (true) {
            j = 1048576;
            if (i8 >= 3) {
                break;
            }
            jZza += (f7VarArr[i8].zza() + 1048575) / 1048576;
            i8++;
        }
        if (jZza >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(jZza);
            throw new DigestException(sb.toString());
        }
        int i10 = (int) jZza;
        byte[][] bArr = new byte[iArr.length][];
        int i11 = 0;
        while (true) {
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(n3(iArr[i11]) * i10) + 5];
            bArr2[0] = 90;
            fb(i10, bArr2, 1);
            bArr[i11] = bArr2;
            i11++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            String strGv = gv(iArr[i12]);
            try {
                messageDigestArr[i12] = MessageDigest.getInstance(strGv);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strGv.concat(" digest not supported"), e4);
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (i = 3; i13 < i; i = 3) {
            f7 f7Var = f7VarArr[i13];
            long j7 = j4;
            long jZza2 = f7Var.zza();
            while (jZza2 > j4) {
                int iMin = (int) Math.min(jZza2, j);
                fb(iMin, bArr3, 1);
                for (int i15 = 0; i15 < length; i15++) {
                    messageDigestArr[i15].update(bArr3);
                }
                long j8 = j7;
                try {
                    f7Var.zzb(messageDigestArr, j8, iMin);
                    byte[] bArr4 = bArr3;
                    int i16 = 0;
                    while (i16 < iArr.length) {
                        int i17 = iArr[i16];
                        f7 f7Var2 = f7Var;
                        byte[] bArr5 = bArr[i16];
                        int iN3 = n3(i17);
                        int i18 = length;
                        MessageDigest messageDigest = messageDigestArr[i16];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i14 * iN3) + 5, iN3);
                        if (iDigest != iN3) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i16++;
                        f7Var = f7Var2;
                        length = i18;
                        messageDigestArr = messageDigestArr2;
                    }
                    MessageDigest[] messageDigestArr3 = messageDigestArr;
                    long j9 = iMin;
                    long j10 = j8 + j9;
                    jZza2 -= j9;
                    i14++;
                    bArr3 = bArr4;
                    j4 = 0;
                    j7 = j10;
                    messageDigestArr = messageDigestArr3;
                    j = 1048576;
                } catch (IOException e5) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i14);
                    sb3.append(" of section #");
                    sb3.append(i5);
                    throw new DigestException(sb3.toString(), e5);
                }
            }
            i5++;
            i13++;
            j4 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i20 = iArr[i19];
            byte[] bArr7 = bArr[i19];
            String strGv2 = gv(i20);
            try {
                bArr6[i19] = MessageDigest.getInstance(strGv2).digest(bArr7);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(strGv2.concat(" digest not supported"), e6);
            }
        }
        return bArr6;
    }

    public static void fb(int i, byte[] bArr, int i5) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static String gv(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static X509Certificate[] i9(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferA = a(byteBuffer);
        ByteBuffer byteBufferA2 = a(byteBuffer);
        byte[] bArrC5 = c5(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrC52 = null;
        byte[] bArrC53 = null;
        int i = -1;
        int i5 = 0;
        while (byteBufferA2.hasRemaining()) {
            i5++;
            try {
                ByteBuffer byteBufferA3 = a(byteBufferA2);
                if (byteBufferA3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i8 = byteBufferA3.getInt();
                arrayList.add(Integer.valueOf(i8));
                if (i8 != 513 && i8 != 514 && i8 != 769) {
                    switch (i8) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iZn = zn(i8);
                    int iZn2 = zn(i);
                    if (iZn != 1 && iZn2 == 1) {
                    }
                }
                bArrC53 = c5(byteBufferA3);
                i = i8;
            } catch (IOException e4) {
                e = e4;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i5);
                throw new SecurityException(sb.toString(), e);
            } catch (BufferUnderflowException e5) {
                e = e5;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Failed to parse signature record #");
                sb2.append(i5);
                throw new SecurityException(sb2.toString(), e);
            }
        }
        if (i == -1) {
            if (i5 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    String strValueOf = String.valueOf(Long.toHexString(i));
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    String strValueOf2 = String.valueOf(Long.toHexString(i));
                    throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf2) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrC5));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferA);
            if (!signature.verify(bArrC53)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferA.clear();
            ByteBuffer byteBufferA4 = a(byteBufferA);
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (byteBufferA4.hasRemaining()) {
                i10++;
                try {
                    ByteBuffer byteBufferA5 = a(byteBufferA4);
                    if (byteBufferA5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i11 = byteBufferA5.getInt();
                    arrayList2.add(Integer.valueOf(i11));
                    if (i11 == i) {
                        bArrC52 = c5(byteBufferA5);
                    }
                } catch (IOException e6) {
                    e = e6;
                    StringBuilder sb3 = new StringBuilder(42);
                    sb3.append("Failed to parse digest record #");
                    sb3.append(i10);
                    throw new IOException(sb3.toString(), e);
                } catch (BufferUnderflowException e8) {
                    e = e8;
                    StringBuilder sb32 = new StringBuilder(42);
                    sb32.append("Failed to parse digest record #");
                    sb32.append(i10);
                    throw new IOException(sb32.toString(), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZn3 = zn(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZn3), bArrC52);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrC52)) {
                throw new SecurityException(gv(iZn3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferA6 = a(byteBufferA);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (byteBufferA6.hasRemaining()) {
                i12++;
                byte[] bArrC54 = c5(byteBufferA6);
                try {
                    arrayList3.add(new g((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrC54)), bArrC54));
                } catch (CertificateException e9) {
                    StringBuilder sb4 = new StringBuilder(41);
                    sb4.append("Failed to decode certificate #");
                    sb4.append(i12);
                    throw new SecurityException(sb4.toString(), e9);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrC5, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e10) {
            e = e10;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb5.append("Failed to verify ");
            sb5.append(str2);
            sb5.append(" signature");
            throw new SecurityException(sb5.toString(), e);
        } catch (InvalidKeyException e11) {
            e = e11;
            StringBuilder sb52 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb52.append("Failed to verify ");
            sb52.append(str2);
            sb52.append(" signature");
            throw new SecurityException(sb52.toString(), e);
        } catch (NoSuchAlgorithmException e12) {
            e = e12;
            StringBuilder sb522 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb522.append("Failed to verify ");
            sb522.append(str2);
            sb522.append(" signature");
            throw new SecurityException(sb522.toString(), e);
        } catch (SignatureException e13) {
            e = e13;
            StringBuilder sb5222 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb5222.append("Failed to verify ");
            sb5222.append(str2);
            sb5222.append(" signature");
            throw new SecurityException(sb5222.toString(), e);
        } catch (InvalidKeySpecException e14) {
            e = e14;
            StringBuilder sb52222 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb52222.append("Failed to verify ");
            sb52222.append(str2);
            sb52222.append(" signature");
            throw new SecurityException(sb52222.toString(), e);
        }
    }

    public static int n3(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void s(Map map, FileChannel fileChannel, long j, long j4, long j7, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        f7 rbVar = new rb(fileChannel, 0L, j);
        f7 rbVar2 = new rb(fileChannel, j4, j7 - j4);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        y4.gv(byteBufferDuplicate, j);
        f7 i4Var = new i4(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrF = f(iArr, new f7[]{rbVar, rbVar2, i4Var});
            for (int i5 = 0; i5 < size; i5++) {
                int i8 = iArr[i5];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i8)), bArrF[i5])) {
                    throw new SecurityException(gv(i8).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e4) {
            throw new SecurityException("Failed to compute digest(s) of contents", e4);
        }
    }

    public static X509Certificate[][] t(FileChannel fileChannel, g3 g3Var) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferA = a(g3.gv(g3Var));
                int i = 0;
                while (byteBufferA.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(i9(a(byteBufferA), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e4) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e4);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                s(map, fileChannel, g3.y(g3Var), g3.n3(g3Var), g3.zn(g3Var), g3.v(g3Var));
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e5) {
                throw new SecurityException("Failed to read list of signers", e5);
            }
        } catch (CertificateException e6) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e6);
        }
    }

    public static ByteBuffer v(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i5 = i + iPosition;
        if (i5 < iPosition || i5 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i5);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i5);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static X509Certificate[][] y(String str) throws m, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairZn = y4.zn(randomAccessFile);
            if (pairZn == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(102);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new m(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairZn.first;
            long jLongValue = ((Long) pairZn.second).longValue();
            long j = (-20) + jLongValue;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new m("ZIP64 APK not supported");
                }
            }
            long jY = y4.y(byteBuffer);
            if (jY >= jLongValue) {
                StringBuilder sb2 = new StringBuilder(122);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(jY);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(jLongValue);
                throw new m(sb2.toString());
            }
            if (y4.n3(byteBuffer) + jY != jLongValue) {
                throw new m("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jY < 32) {
                StringBuilder sb3 = new StringBuilder(87);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(jY);
                throw new m(sb3.toString());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jY - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new m("No APK Signing Block before ZIP Central Directory");
            }
            int i = 0;
            long j4 = byteBufferAllocate.getLong(0);
            if (j4 < byteBufferAllocate.capacity() || j4 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(57);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j4);
                throw new m(sb4.toString());
            }
            int i5 = (int) (8 + j4);
            long j7 = jY - ((long) i5);
            if (j7 < 0) {
                StringBuilder sb5 = new StringBuilder(59);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j7);
                throw new m(sb5.toString());
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i5);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j7);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j8 = byteBufferAllocate2.getLong(0);
            if (j8 != j4) {
                StringBuilder sb6 = new StringBuilder(103);
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j8);
                sb6.append(" vs ");
                sb6.append(j4);
                throw new m(sb6.toString());
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j7));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                StringBuilder sb7 = new StringBuilder(38);
                sb7.append("end < start: ");
                sb7.append(iCapacity);
                sb7.append(" < ");
                sb7.append(8);
                throw new IllegalArgumentException(sb7.toString());
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(41);
                sb8.append("end > capacity: ");
                sb8.append(iCapacity);
                sb8.append(" > ");
                sb8.append(iCapacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i++;
                    if (byteBufferSlice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(70);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i);
                        throw new m(sb9.toString());
                    }
                    long j9 = byteBufferSlice.getLong();
                    if (j9 < 4 || j9 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(76);
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i);
                        sb10.append(" size out of range: ");
                        sb10.append(j9);
                        throw new m(sb10.toString());
                    }
                    int i8 = (int) j9;
                    int iPosition2 = byteBufferSlice.position() + i8;
                    if (i8 > byteBufferSlice.remaining()) {
                        int iRemaining = byteBufferSlice.remaining();
                        StringBuilder sb11 = new StringBuilder(91);
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i);
                        sb11.append(" size out of range: ");
                        sb11.append(i8);
                        sb11.append(", available: ");
                        sb11.append(iRemaining);
                        throw new m(sb11.toString());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrT = t(randomAccessFile.getChannel(), new g3(v(byteBufferSlice, i8 - 4), jLongValue2, jY, jLongValue, byteBuffer, (y) null));
                        randomAccessFile.close();
                        return x509CertificateArrT;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new m("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int zn(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String strValueOf = String.valueOf(Long.toHexString(i));
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }
}
