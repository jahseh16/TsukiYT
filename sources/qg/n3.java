package qg;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public final DataOutputStream n3;
    public final ByteArrayOutputStream y;

    public n3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(NotificationCompat.FLAG_GROUP_SUMMARY);
        this.y = byteArrayOutputStream;
        this.n3 = new DataOutputStream(byteArrayOutputStream);
    }

    public static void n3(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] y(EventMessage eventMessage) {
        this.y.reset();
        try {
            n3(this.n3, eventMessage.y);
            String str = eventMessage.f1582v;
            if (str == null) {
                str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            }
            n3(this.n3, str);
            this.n3.writeLong(eventMessage.f1579fb);
            this.n3.writeLong(eventMessage.f1580s);
            this.n3.write(eventMessage.f1578f);
            this.n3.flush();
            return this.y.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
