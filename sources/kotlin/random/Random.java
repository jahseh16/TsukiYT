package kotlin.random;

import java.io.Serializable;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class Random {
    public static final Default Default = new Default(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public static final class Default extends Random implements Serializable {

        public static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i) {
            return Random.defaultRandom.nextBits(i);
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        private Default() {
        }

        @Override // kotlin.random.Random
        public int nextInt(int i) {
            return Random.defaultRandom.nextInt(i);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j) {
            return Random.defaultRandom.nextLong(j);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i, int i5) {
            return Random.defaultRandom.nextInt(i, i5);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j, long j4) {
            return Random.defaultRandom.nextLong(j, j4);
        }
    }

    public abstract int nextBits(int i);

    public abstract int nextInt();

    public abstract int nextInt(int i);

    public int nextInt(int i, int i5) {
        int iNextInt;
        int i8;
        int iNextBits;
        RandomKt.checkRangeBounds(i, i5);
        int i10 = i5 - i;
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            if (((-i10) & i10) == i10) {
                iNextBits = nextBits(RandomKt.fastLog2(i10));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i8 = iNextInt % i10;
                } while ((iNextInt - i8) + (i10 - 1) < 0);
                iNextBits = i8;
            }
            return i + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i <= iNextInt2 && iNextInt2 < i5) {
                return iNextInt2;
            }
        }
    }

    public abstract long nextLong();

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    public long nextLong(long j, long j4) {
        long jNextLong;
        long j7;
        long jNextBits;
        int iNextInt;
        RandomKt.checkRangeBounds(j, j4);
        long j8 = j4 - j;
        if (j8 > 0) {
            if (((-j8) & j8) == j8) {
                int i = (int) j8;
                int i5 = (int) (j8 >>> 32);
                if (i != 0) {
                    iNextInt = nextBits(RandomKt.fastLog2(i));
                } else if (i5 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (((long) nextBits(RandomKt.fastLog2(i5))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                jNextBits = ((long) iNextInt) & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j7 = jNextLong % j8;
                } while ((jNextLong - j7) + (j8 - 1) < 0);
                jNextBits = j7;
            }
            return j + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j <= jNextLong2 && jNextLong2 < j4) {
                return jNextLong2;
            }
        }
    }
}
