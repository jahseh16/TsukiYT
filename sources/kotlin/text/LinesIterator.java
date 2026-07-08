package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
final class LinesIterator implements Iterator<String>, KMappedMarker {
    private static final State State = new State(null);
    private int delimiterLength;
    private int delimiterStartIndex;
    private int state;
    private final CharSequence string;
    private int tokenStartIndex;

    public static final class State {
        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }
    }

    public LinesIterator(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.string = string;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i5;
        int i8 = this.state;
        if (i8 != 0) {
            return i8 == 1;
        }
        if (this.delimiterLength < 0) {
            this.state = 2;
            return false;
        }
        int length = this.string.length();
        int length2 = this.string.length();
        for (int i10 = this.tokenStartIndex; i10 < length2; i10++) {
            char cCharAt = this.string.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i5 = i10 + 1) < this.string.length() && this.string.charAt(i5) == '\n') ? 2 : 1;
                length = i10;
                this.state = 1;
                this.delimiterLength = i;
                this.delimiterStartIndex = length;
                return true;
            }
        }
        i = -1;
        this.state = 1;
        this.delimiterLength = i;
        this.delimiterStartIndex = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        int i = this.delimiterStartIndex;
        int i5 = this.tokenStartIndex;
        this.tokenStartIndex = this.delimiterLength + i;
        return this.string.subSequence(i5, i).toString();
    }
}
