package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a6, B b4, C c) {
        this.first = a6;
        this.second = b4;
        this.third = c;
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.areEqual(this.first, triple.first) && Intrinsics.areEqual(this.second, triple.second) && Intrinsics.areEqual(this.third, triple.third);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a6 = this.first;
        int iHashCode = (a6 == null ? 0 : a6.hashCode()) * 31;
        B b4 = this.second;
        int iHashCode2 = (iHashCode + (b4 == null ? 0 : b4.hashCode())) * 31;
        C c = this.third;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
