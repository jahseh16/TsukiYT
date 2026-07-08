package pl1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import pl1.f;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends f.y {

    public static final class a implements f<sj1.mg, Void> {
        public static final a y = new a();

        @Override // pl1.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Void convert(sj1.mg mgVar) {
            mgVar.close();
            return null;
        }
    }

    public static final class gv implements f<Object, String> {
        public static final gv y = new gv();

        @Override // pl1.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class v implements f<sj1.mg, Unit> {
        public static final v y = new v();

        @Override // pl1.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Unit convert(sj1.mg mgVar) {
            mgVar.close();
            return Unit.INSTANCE;
        }
    }

    public static final class y implements f<sj1.mg, sj1.mg> {
        public static final y y = new y();

        @Override // pl1.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public sj1.mg convert(sj1.mg mgVar) throws IOException {
            try {
                return j5.y(mgVar);
            } finally {
                mgVar.close();
            }
        }
    }

    @Override // pl1.f.y
    public f<sj1.mg, ?> gv(Type type, Annotation[] annotationArr, k5 k5Var) {
        if (type == sj1.mg.class) {
            return j5.t(annotationArr, rl1.i4.class) ? zn.y : y.y;
        }
        if (type == Void.class) {
            return a.y;
        }
        if (j5.tl(type)) {
            return v.y;
        }
        return null;
    }

    @Override // pl1.f.y
    public f<?, sj1.fh> zn(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, k5 k5Var) {
        if (sj1.fh.class.isAssignableFrom(j5.s(type))) {
            return C0146n3.y;
        }
        return null;
    }

    /* JADX INFO: renamed from: pl1.n3$n3, reason: collision with other inner class name */
    public static final class C0146n3 implements f<sj1.fh, sj1.fh> {
        public static final C0146n3 y = new C0146n3();

        @Override // pl1.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public sj1.fh convert(sj1.fh fhVar) {
            return fhVar;
        }
    }

    public static final class zn implements f<sj1.mg, sj1.mg> {
        public static final zn y = new zn();

        @Override // pl1.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public sj1.mg convert(sj1.mg mgVar) {
            return mgVar;
        }
    }
}
