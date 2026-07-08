package ql1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import pl1.f;
import pl1.k5;
import sj1.fh;
import sj1.mg;

/* JADX INFO: loaded from: classes.dex */
public final class y extends f.y {
    public final Gson y;

    public y(Gson gson) {
        this.y = gson;
    }

    public static y a() {
        return fb(new Gson());
    }

    public static y fb(Gson gson) {
        if (gson != null) {
            return new y(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // pl1.f.y
    public f<mg, ?> gv(Type type, Annotation[] annotationArr, k5 k5Var) {
        return new zn(this.y, this.y.getAdapter(TypeToken.get(type)));
    }

    @Override // pl1.f.y
    public f<?, fh> zn(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, k5 k5Var) {
        return new n3(this.y, this.y.getAdapter(TypeToken.get(type)));
    }
}
