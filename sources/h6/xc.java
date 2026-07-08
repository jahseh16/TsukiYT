package h6;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public interface xc {
    public static final xc y = new y();

    public class y implements xc {
        @Override // h6.xc
        public long n3() {
            throw new NoSuchElementException();
        }

        @Override // h6.xc
        public boolean next() {
            return false;
        }

        @Override // h6.xc
        public long y() {
            throw new NoSuchElementException();
        }
    }

    long n3();

    boolean next();

    long y();
}
