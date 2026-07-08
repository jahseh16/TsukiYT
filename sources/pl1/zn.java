package pl1;

import android.annotation.TargetApi;
import com.google.android.gms.common.ConnectionResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import pl1.f;
import pl1.v;

/* JADX INFO: loaded from: classes.dex */
public class zn {

    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static final class y extends zn {
        @Override // pl1.zn
        public List<? extends f.y> n3() {
            return Collections.singletonList(new fh());
        }

        @Override // pl1.zn
        public List<? extends v.y> y(Executor executor) {
            return Arrays.asList(new i9(), new t(executor));
        }
    }

    public List<? extends f.y> n3() {
        return Collections.emptyList();
    }

    public List<? extends v.y> y(Executor executor) {
        return Collections.singletonList(new t(executor));
    }
}
