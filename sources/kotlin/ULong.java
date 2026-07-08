package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o0.r;

/* JADX INFO: loaded from: classes.dex */
public final class ULong implements Comparable<ULong> {
    public static final Companion Companion = new Companion(null);
    private final long data;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m84boximpl(long j) {
        return new ULong(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m85constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m86equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).m89unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m87hashCodeimpl(long j) {
        return r.y(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m88toStringimpl(long j) {
        return UnsignedKt.ulongToString(j, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m89unboximpl(), uLong.m89unboximpl());
    }

    public boolean equals(Object obj) {
        return m86equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m87hashCodeimpl(this.data);
    }

    public String toString() {
        return m88toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m89unboximpl() {
        return this.data;
    }
}
