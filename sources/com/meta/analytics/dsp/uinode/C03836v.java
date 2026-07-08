package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX WARN: Unexpected interfaces in signature: [kotlin.jvm.internal.markers.KMappedMarker] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "index", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class C03836v<E> extends AbstractC03826u<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ AbstractC03826u<E> A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{6, 39, 28, 41, 24, 43, 32, 38, 37, -41, 32, 42, -41, 37, 38, 43, -41, 42, 44, 39, 39, 38, 41, 43, 28, 27, -41, 29, 38, 41, -41, 41, 28, 24, 27, -28, 38, 37, 35, 48, -41, 26, 38, 35, 35, 28, 26, 43, 32, 38, 37};
    }

    @Override // java.util.ListIterator
    public final void add(E e4) {
        throw new UnsupportedOperationException(A00(0, 51, 99));
    }

    @Override // java.util.ListIterator
    public final void set(E e4) {
        throw new UnsupportedOperationException(A00(0, 51, 99));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03836v(AbstractC03826u abstractC03826u, int i) {
        super(abstractC03826u);
        this.A00 = abstractC03826u;
        AbstractC03826u.A02.A04(i, abstractC03826u.size());
        A05(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return getA00() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return getA00();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            AbstractC03826u<E> abstractC03826u = this.A00;
            A05(getA00() - 1);
            return abstractC03826u.get(getA00());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return getA00() - 1;
    }
}
