package i7;

import i7.rz;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface f3 {
    public static final f3 y = new f3() { // from class: i7.i4
        @Override // i7.f3
        public final List getDecoderInfos(String str, boolean z, boolean z5) {
            return rz.co(str, z, z5);
        }
    };

    List<z> getDecoderInfos(String str, boolean z, boolean z5) throws rz.zn;
}
