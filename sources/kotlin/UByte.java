package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UByte implements Comparable<UByte> {
    public static final Companion Companion = new Companion(null);
    private final byte data;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ UByte(byte b4) {
        this.data = b4;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m40boximpl(byte b4) {
        return new UByte(b4);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m41constructorimpl(byte b4) {
        return b4;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m42equalsimpl(byte b4, Object obj) {
        return (obj instanceof UByte) && b4 == ((UByte) obj).m45unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m43hashCodeimpl(byte b4) {
        return b4;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m44toStringimpl(byte b4) {
        return String.valueOf(b4 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(m45unboximpl() & 255, uByte.m45unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m42equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m43hashCodeimpl(this.data);
    }

    public String toString() {
        return m44toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m45unboximpl() {
        return this.data;
    }
}
