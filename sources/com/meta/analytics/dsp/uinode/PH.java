package com.meta.analytics.dsp.uinode;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PH extends InputStream {
    public static byte[] A04;
    public static String[] A05 = {"5FxkjmViipfuOEmeGZRh1rWuAhi58BIY", "P0uDFh8HOwAWvDVGkGeATzc", "FQ2HPVuJ9Fju5P7EfteSFhbDkCSiUGCr", "lMnDCDrcSzZtU6RMhKfYe1rO633Hkzz8", "BZaCeAJ4mpNw1z6aTzzGkvXJAvKgKDg7", "gl5vlYV0aCgrCc0s0sEnhviYHRKbo8Yg", "Tgc0UJMQxUN8PgOF6KJ9ZKrej2a3tpw", "OSPCme8ftb56UzOVrw2bgiBSvmZFYlRk"};
    public MessageDigest A00;
    public final C1063Ym A01;
    public final PG A02;
    public final FileInputStream A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[7].charAt(24) == 'i') {
                break;
            }
            A05[7] = "wkBtkBfOXubsKwfKzYpxBJzZI93GSJMw";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b4 = bArrCopyOfRange[i10];
            String[] strArr = A05;
            if (strArr[0].charAt(11) == strArr[3].charAt(11)) {
                break;
            }
            String[] strArr2 = A05;
            strArr2[1] = "6MRboz4pfSS0DylRcsmX7nz";
            strArr2[6] = "Z3yJOYkAPU5AGas9ZlGFYfEzislvm9u";
            bArrCopyOfRange[i10] = (byte) ((b4 - i8) - 45);
            i10++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A04 = new byte[]{-104, -113, -128, 11, 26, 19};
    }

    static {
        A01();
    }

    public PH(C1063Ym c1063Ym, FileInputStream fileInputStream, PG pg) {
        this.A03 = fileInputStream;
        this.A02 = pg;
        this.A01 = c1063Ym;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 30));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b4 = new byte[1];
        return read(b4);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        int i8 = this.A03.read(bArr, i, i5);
        MessageDigest messageDigest = this.A00;
        if (messageDigest != null) {
            if (A05[7].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A05[2] = "wFnf9K6AarqF2rYbRIkm3wGElU25UaCd";
            try {
                if (i8 > 0) {
                    messageDigest.update(bArr, i, i8);
                } else if (i8 == -1) {
                    String hash = LG.A05(messageDigest.digest());
                    this.A02.A8d(hash);
                    this.A00 = null;
                }
            } catch (Exception e4) {
                this.A00 = null;
                this.A01.A07().AA2(A00(3, 3, 122), C8A.A13, new C8B(e4));
            }
        }
        return i8;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int actuallyRead = (int) j;
        byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
        long j4 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, UserMetadata.MAX_ATTRIBUTE_SIZE));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j4 += (long) bytesToRead;
        }
        return j4;
    }
}
