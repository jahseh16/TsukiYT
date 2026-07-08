package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class UInt implements Comparable<UInt> {
    public static final Companion Companion = new Companion(null);
    private final int data;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ UInt(int i) {
        this.data = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m62boximpl(int i) {
        return new UInt(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m63constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m64equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).m67unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m65hashCodeimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m66toStringimpl(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(m67unboximpl(), uInt.m67unboximpl());
    }

    public boolean equals(Object obj) {
        return m64equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m65hashCodeimpl(this.data);
    }

    public String toString() {
        return m66toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m67unboximpl() {
        return this.data;
    }
}
