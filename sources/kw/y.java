package kw;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import rw.n3;

/* JADX INFO: loaded from: classes.dex */
public final class y implements n3 {
    public final Pair<IntRange, Integer>[] y = {TuplesKt.to(new IntRange(48, 57), 5), TuplesKt.to(new IntRange(65, 90), 23), TuplesKt.to(new IntRange(97, 122), 1)};

    public final char gv(char c) {
        for (Pair<IntRange, Integer> pair : this.y) {
            IntRange first = pair.getFirst();
            int last = (first.getLast() - first.getFirst()) + 1;
            int iIntValue = pair.getSecond().intValue();
            int first2 = first.getFirst();
            if (c <= first.getLast() && first2 <= c) {
                return (char) ((((c - first.getFirst()) + iIntValue) % last) + first.getFirst());
            }
        }
        return c;
    }

    @Override // rw.n3
    public String n3(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb = new StringBuilder(data.length());
        for (int i = 0; i < data.length(); i++) {
            sb.append(zn(data.charAt(i)));
        }
        return sb.toString();
    }

    @Override // rw.n3
    public String y(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb = new StringBuilder(data.length());
        for (int i = 0; i < data.length(); i++) {
            sb.append(gv(data.charAt(i)));
        }
        return sb.toString();
    }

    public final char zn(char c) {
        for (Pair<IntRange, Integer> pair : this.y) {
            IntRange first = pair.getFirst();
            int last = (first.getLast() - first.getFirst()) + 1;
            int iIntValue = pair.getSecond().intValue();
            int first2 = first.getFirst();
            if (c <= first.getLast() && first2 <= c) {
                return (char) (((((c - first.getFirst()) - (iIntValue % last)) + last) % last) + first.getFirst());
            }
        }
        return c;
    }
}
