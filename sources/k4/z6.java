package k4;

import g4.xc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class z6<K0, V0> {

    public static abstract class gv<K0, V0> extends z6<K0, V0> {
        public gv() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> fh<K, V> v();
    }

    public class n3 extends v<K0> {
        public final /* synthetic */ Comparator y;

        public n3(Comparator comparator) {
            this.y = comparator;
        }

        @Override // k4.z6.v
        public <K extends K0, V> Map<K, Collection<V>> zn() {
            return new TreeMap(this.y);
        }
    }

    public static abstract class v<K0> {

        public class y extends gv<K0, Object> {
            public final /* synthetic */ int y;

            public y(int i) {
                this.y = i;
            }

            @Override // k4.z6.gv
            public <K extends K0, V> fh<K, V> v() {
                return ej.n3(v.this.zn(), new zn(this.y));
            }
        }

        public gv<K0, Object> n3(int i) {
            c5.n3(i, "expectedValuesPerKey");
            return new y(i);
        }

        public gv<K0, Object> y() {
            return n3(2);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> zn();
    }

    public class y extends v<Object> {
        public final /* synthetic */ int y;

        public y(int i) {
            this.y = i;
        }

        @Override // k4.z6.v
        public <K, V> Map<K, Collection<V>> zn() {
            return yt.zn(this.y);
        }
    }

    public static final class zn<V> implements g4.r<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public zn(int i) {
            this.expectedValuesPerKey = c5.n3(i, "expectedValuesPerKey");
        }

        @Override // g4.r
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    public /* synthetic */ z6(y yVar) {
        this();
    }

    public static <K0> v<K0> gv(Comparator<K0> comparator) {
        xc.t(comparator);
        return new n3(comparator);
    }

    public static v<Object> n3(int i) {
        c5.n3(i, "expectedKeys");
        return new y(i);
    }

    public static v<Object> y() {
        return n3(8);
    }

    public static v<Comparable> zn() {
        return gv(k5.gv());
    }

    public z6() {
    }
}
