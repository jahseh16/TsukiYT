package qg;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import de.a;
import de.gv;
import java.nio.ByteBuffer;
import java.util.Arrays;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a {
    @Override // de.a
    public Metadata n3(gv gvVar, ByteBuffer byteBuffer) {
        return new Metadata(zn(new d(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage zn(d dVar) {
        return new EventMessage((String) v0.y.v(dVar.fh()), (String) v0.y.v(dVar.fh()), dVar.d0(), dVar.d0(), Arrays.copyOfRange(dVar.v(), dVar.a(), dVar.fb()));
    }
}
