package pl1;

import android.annotation.TargetApi;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import pl1.f;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
@IgnoreJRERequirement
public final class fh extends f.y {

    @IgnoreJRERequirement
    public static final class y<T> implements f<sj1.mg, Optional<T>> {
        public final f<sj1.mg, T> y;

        public y(f<sj1.mg, T> fVar) {
            this.y = fVar;
        }

        @Override // pl1.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(sj1.mg mgVar) throws IOException {
            return Optional.ofNullable(this.y.convert(mgVar));
        }
    }

    @Override // pl1.f.y
    public f<sj1.mg, ?> gv(Type type, Annotation[] annotationArr, k5 k5Var) {
        if (f.y.n3(type) != c.y()) {
            return null;
        }
        return new y(k5Var.s(f.y.y(0, (ParameterizedType) type), annotationArr));
    }
}
