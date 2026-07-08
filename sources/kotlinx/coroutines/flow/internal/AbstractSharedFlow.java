package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {
    private SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    public final S allocateSlot() {
        S s3;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) createSlotArray(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                    this.slots = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
                }
                int i = this.nextIndex;
                do {
                    s3 = sArr[i];
                    if (s3 == null) {
                        s3 = (S) createSlot();
                        sArr[i] = s3;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    Intrinsics.checkNotNull(s3, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s3.allocateLocked(this));
                this.nextIndex = i;
                this.nCollectors++;
                subscriptionCountStateFlow = this._subscriptionCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(1);
        }
        return s3;
    }

    public abstract S createSlot();

    public abstract S[] createSlotArray(int i);

    public final void freeSlot(S s3) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i;
        Continuation<Unit>[] continuationArrFreeLocked;
        synchronized (this) {
            try {
                int i5 = this.nCollectors - 1;
                this.nCollectors = i5;
                subscriptionCountStateFlow = this._subscriptionCount;
                if (i5 == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.checkNotNull(s3, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrFreeLocked = s3.freeLocked(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrFreeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(-1);
        }
    }

    public final int getNCollectors() {
        return this.nCollectors;
    }

    public final S[] getSlots() {
        return this.slots;
    }

    public final StateFlow<Integer> getSubscriptionCount() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this._subscriptionCount;
            if (subscriptionCountStateFlow == null) {
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(this.nCollectors);
                this._subscriptionCount = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }
}
