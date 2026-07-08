package kj1;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    public static final class y {
        public static boolean n3(a aVar) {
            return false;
        }

        public static List<Annotation> y(a aVar) {
            return CollectionsKt.emptyList();
        }

        public static boolean zn(a aVar) {
            return false;
        }
    }

    List<Annotation> a(int i);

    boolean c5(int i);

    a fb(int i);

    List<Annotation> getAnnotations();

    i9 getKind();

    int gv();

    boolean isInline();

    boolean n3();

    String s();

    String v(int i);

    int zn(String str);
}
