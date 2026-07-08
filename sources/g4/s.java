package g4;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public final String y;

    public s(String str) {
        this.y = (String) xc.t(str);
    }

    public static s a(char c) {
        return new s(String.valueOf(c));
    }

    public static s fb(String str) {
        return new s(str);
    }

    public final String gv(Iterable<? extends Object> iterable) {
        return v(iterable.iterator());
    }

    public final StringBuilder n3(StringBuilder sb, Iterable<? extends Object> iterable) {
        return zn(sb, iterable.iterator());
    }

    public CharSequence s(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String v(Iterator<? extends Object> it) {
        return zn(new StringBuilder(), it).toString();
    }

    public <A extends Appendable> A y(A a6, Iterator<? extends Object> it) throws IOException {
        xc.t(a6);
        if (it.hasNext()) {
            a6.append(s(it.next()));
            while (it.hasNext()) {
                a6.append(this.y);
                a6.append(s(it.next()));
            }
        }
        return a6;
    }

    public final StringBuilder zn(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            y(sb, it);
            return sb;
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
