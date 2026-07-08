package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

/* JADX INFO: loaded from: classes.dex */
public final class IntProgressionIterator extends IntIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public IntProgressionIterator(int i, int i5, int i8) {
        this.step = i8;
        this.finalElement = i5;
        boolean z = false;
        if (i8 <= 0 ? i >= i5 : i <= i5) {
            z = true;
        }
        this.hasNext = z;
        this.next = z ? i : i5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = this.step + i;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i;
    }
}
