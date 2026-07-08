package b1;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface mt {
    public static final mt y = new mt() { // from class: b1.w
        @Override // b1.mt
        public final t[] createExtractors() {
            return p.n3();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };

    t[] createExtractors();

    t[] y(Uri uri, Map<String, List<String>> map);
}
