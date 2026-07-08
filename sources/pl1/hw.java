package pl1;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes.dex */
public final class hw implements vl {
    public static final vl y = new hw();

    public static Annotation[] y(Annotation[] annotationArr) {
        if (j5.t(annotationArr, vl.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = y;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return vl.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof vl;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + vl.class.getName() + "()";
    }
}
