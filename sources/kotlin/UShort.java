package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UShort implements Comparable<UShort> {
    public static final Companion Companion = new Companion(null);
    private final short data;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ UShort(short s3) {
        this.data = s3;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m106boximpl(short s3) {
        return new UShort(s3);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m107constructorimpl(short s3) {
        return s3;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m108equalsimpl(short s3, Object obj) {
        return (obj instanceof UShort) && s3 == ((UShort) obj).m111unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m109hashCodeimpl(short s3) {
        return s3;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m110toStringimpl(short s3) {
        return String.valueOf(s3 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m111unboximpl() & 65535, uShort.m111unboximpl() & 65535);
    }

    public boolean equals(Object obj) {
        return m108equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m109hashCodeimpl(this.data);
    }

    public String toString() {
        return m110toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m111unboximpl() {
        return this.data;
    }
}
