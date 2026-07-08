package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a6, B b4) {
        this.first = a6;
        this.second = b4;
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.areEqual(this.first, pair.first) && Intrinsics.areEqual(this.second, pair.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a6 = this.first;
        int iHashCode = (a6 == null ? 0 : a6.hashCode()) * 31;
        B b4 = this.second;
        return iHashCode + (b4 != null ? b4.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
