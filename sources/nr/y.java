package nr;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r0.o;

/* JADX INFO: loaded from: classes.dex */
public class y implements r0.tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public CipherInputStream f7069gv;
    public final byte[] n3;
    public final r0.tl y;
    public final byte[] zn;

    public y(r0.tl tlVar, byte[] bArr, byte[] bArr2) {
        this.y = tlVar;
        this.n3 = bArr;
        this.zn = bArr2;
    }

    public Cipher a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // r0.tl
    public void close() throws IOException {
        if (this.f7069gv != null) {
            this.f7069gv = null;
            this.y.close();
        }
    }

    @Override // r0.tl
    public final void co(o oVar) {
        v0.y.v(oVar);
        this.y.co(oVar);
    }

    @Override // r0.tl
    public final Map<String, List<String>> fb() {
        return this.y.fb();
    }

    @Override // r0.tl
    @Nullable
    public final Uri n3() {
        return this.y.n3();
    }

    @Override // r0.c5
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        v0.y.v(this.f7069gv);
        int i8 = this.f7069gv.read(bArr, i, i5);
        if (i8 < 0) {
            return -1;
        }
        return i8;
    }

    @Override // r0.tl
    public final long y(r0.p pVar) throws IOException {
        try {
            Cipher cipherA = a();
            try {
                cipherA.init(2, new SecretKeySpec(this.n3, "AES"), new IvParameterSpec(this.zn));
                r0.xc xcVar = new r0.xc(this.y, pVar);
                this.f7069gv = new CipherInputStream(xcVar, cipherA);
                xcVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }
}
