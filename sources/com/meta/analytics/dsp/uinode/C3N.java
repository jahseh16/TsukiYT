package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.RandomAccess;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C3N<E> extends AbstractC03826u<E> implements RandomAccess {
    public static byte[] A03;
    public int A00;
    public final int A01;
    public final AbstractC03826u<E> A02;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{15, 10, 16, 23};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3N(AbstractC03826u<? extends E> abstractC03826u, int i, int i5) {
        C1218bu.A07(abstractC03826u, A00(0, 4, 90));
        this.A02 = abstractC03826u;
        this.A01 = i;
        AbstractC03826u.A02.A05(i, i5, abstractC03826u.size());
        this.A00 = i5 - i;
    }

    @Override // com.meta.analytics.dsp.uinode.H0
    /* JADX INFO: renamed from: A0A, reason: from getter */
    public final int getA00() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03826u, java.util.List
    public final E get(int index) {
        AbstractC03826u.A02.A03(index, this.A00);
        return this.A02.get(this.A01 + index);
    }
}
