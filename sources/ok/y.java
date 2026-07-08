package ok;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import de.a;
import de.gv;
import g4.v;
import g4.zn;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a {
    public static final Pattern zn = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder y = v.zn.newDecoder();
    public final CharsetDecoder n3 = v.n3.newDecoder();

    @Override // de.a
    public Metadata n3(gv gvVar, ByteBuffer byteBuffer) {
        String strZn = zn(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strZn == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = zn.matcher(strZn);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strV = zn.v(strGroup);
                strV.hashCode();
                if (strV.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strV.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    @Nullable
    public final String zn(ByteBuffer byteBuffer) {
        try {
            return this.y.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.n3.decode(byteBuffer).toString();
                this.n3.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.n3.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.n3.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.y.reset();
            byteBuffer.rewind();
        }
    }
}
