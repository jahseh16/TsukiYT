package kotlin.collections;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    public static <T> Sequence<T> asSequence(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new Sequence<T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <T> List<List<T>> chunked(Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return windowed(iterable, i, i, true);
    }

    public static <T> boolean contains(Iterable<? extends T> iterable, T t3) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t3) : indexOf(iterable, t3) >= 0;
    }

    public static <T> List<T> distinct(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.toList(CollectionsKt.toMutableSet(iterable));
    }

    public static <T> List<T> drop(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt.toList(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return CollectionsKt.emptyList();
            }
            if (size == 1) {
                return CollectionsKt.listOf(CollectionsKt.last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i5 = 0;
        for (T t3 : iterable) {
            if (i5 >= i) {
                arrayList.add(t3);
            } else {
                i5++;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> dropLast(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            return CollectionsKt.take(list, RangesKt.coerceAtLeast(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> T elementAt(Iterable<? extends T> iterable, final int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i) : (T) elementAtOrElse(iterable, i, new Function1() { // from class: kotlin.collections.n3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectionsKt___CollectionsKt.elementAt$lambda$0$CollectionsKt___CollectionsKt(i, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object elementAt$lambda$0$CollectionsKt___CollectionsKt(int i, int i5) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
    }

    public static final <T> T elementAtOrElse(Iterable<? extends T> iterable, int i, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i >= list.size()) ? defaultValue.invoke(Integer.valueOf(i)) : (T) list.get(i);
        }
        if (i < 0) {
            return defaultValue.invoke(Integer.valueOf(i));
        }
        int i5 = 0;
        for (T t3 : iterable) {
            int i8 = i5 + 1;
            if (i == i5) {
                return t3;
            }
            i5 = i8;
        }
        return defaultValue.invoke(Integer.valueOf(i));
    }

    public static <T> List<T> filterNotNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t3 : iterable) {
            if (t3 != null) {
                destination.add(t3);
            }
        }
        return destination;
    }

    public static <T> T first(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T firstOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T getOrNull(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final <T> int indexOf(Iterable<? extends T> iterable, T t3) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t3);
        }
        int i = 0;
        for (T t5 : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t3, t5)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> Set<T> intersect(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet(iterable);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T, A extends Appendable> A joinTo(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (T t3 : iterable) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i5 > i) {
                break;
            }
            StringsKt.appendElement(buffer, t3, function1);
        }
        if (i >= 0 && i5 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable joinTo$default(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        CharSequence charSequence5 = (i5 & 2) != 0 ? ", " : charSequence;
        int i8 = i5 & 4;
        CharSequence charSequence6 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        CharSequence charSequence7 = i8 != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : charSequence2;
        if ((i5 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return joinTo(iterable, appendable, charSequence5, charSequence7, charSequence6, (i5 & 16) != 0 ? -1 : i, (i5 & 32) != 0 ? "..." : charSequence4, (i5 & 64) != 0 ? null : function1);
    }

    public static final <T> String joinToString(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(iterable, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        int i8 = i5 & 2;
        CharSequence charSequence5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        CharSequence charSequence6 = i8 != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : charSequence2;
        if ((i5 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i10 = (i5 & 8) != 0 ? -1 : i;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            function1 = null;
        }
        return joinToString(iterable, charSequence, charSequence6, charSequence5, i10, charSequence7, function1);
    }

    public static <T> T last(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) CollectionsKt.last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T lastOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T maxOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T maxWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T extends Comparable<? super T>> T minOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> minus(Iterable<? extends T> iterable, T t3) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        boolean z = false;
        for (T t5 : iterable) {
            boolean z5 = true;
            if (!z && Intrinsics.areEqual(t5, t3)) {
                z = true;
                z5 = false;
            }
            if (z5) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T t3) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t3);
        return arrayList;
    }

    public static <T> T random(Collection<? extends T> collection, Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) CollectionsKt.elementAt(collection, random.nextInt(collection.size()));
    }

    public static <T> T randomOrNull(Collection<? extends T> collection, Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) CollectionsKt.elementAt(collection, random.nextInt(collection.size()));
    }

    public static <T> List<T> reversed(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return CollectionsKt.toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static <T> T single(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T singleOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> slice(List<? extends T> list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : CollectionsKt.toList(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static <T extends Comparable<? super T>> List<T> sorted(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            CollectionsKt.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return CollectionsKt.toList(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        ArraysKt.sort((Comparable[]) array);
        return ArraysKt.asList(array);
    }

    public static <T extends Comparable<? super T>> List<T> sortedDescending(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return CollectionsKt.sortedWith(iterable, ComparisonsKt.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> sortedWith(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            CollectionsKt.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return CollectionsKt.toList(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        ArraysKt___ArraysJvmKt.sortWith(array, comparator);
        return ArraysKt.asList(array);
    }

    public static <T> Set<T> subtract(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet(iterable);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static int sumOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static <T> List<T> take(Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return CollectionsKt.toList(iterable);
            }
            if (i == 1) {
                return CollectionsKt.listOf(CollectionsKt.first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i5++;
            if (i5 == i) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> takeLast(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt.emptyList();
        }
        int size = list.size();
        if (i >= size) {
            return CollectionsKt.toList(list);
        }
        if (i == 1) {
            return CollectionsKt.listOf(CollectionsKt.last((List) list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i5 = size - i; i5 < size; i5++) {
                arrayList.add(list.get(i5));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] toBooleanArray(Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> HashSet<T> toHashSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) toCollection(iterable, new HashSet(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 12))));
    }

    public static int[] toIntArray(Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> toList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.optimizeReadOnlyList(toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt.emptyList();
        }
        if (size != 1) {
            return CollectionsKt.toMutableList(collection);
        }
        return CollectionsKt.listOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? CollectionsKt.toMutableList((Collection) iterable) : (List) toCollection(iterable, new ArrayList());
    }

    public static <T> Set<T> toMutableSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> toSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return SetsKt__SetsKt.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return SetsKt.emptySet();
        }
        if (size != 1) {
            return (Set) toCollection(iterable, new LinkedHashSet(MapsKt.mapCapacity(collection.size())));
        }
        return SetsKt.setOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> Set<T> union(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = CollectionsKt.toMutableSet(iterable);
        CollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> List<List<T>> windowed(Iterable<? extends T> iterable, int i, int i5, boolean z) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        SlidingWindowKt.checkWindowSizeStep(i, i5);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itWindowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i, i5, z, false);
            while (itWindowedIterator.hasNext()) {
                arrayList.add((List) itWindowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i5) + (size % i5 == 0 ? 0 : 1));
        int i8 = 0;
        while (i8 >= 0 && i8 < size) {
            int iCoerceAtMost = RangesKt.coerceAtMost(i, size - i8);
            if (iCoerceAtMost < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iCoerceAtMost);
            for (int i10 = 0; i10 < iCoerceAtMost; i10++) {
                arrayList3.add(list.get(i10 + i8));
            }
            arrayList2.add(arrayList3);
            i8 += i5;
        }
        return arrayList2;
    }

    public static <T> Iterable<IndexedValue<T>> withIndex(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.zn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iterable.iterator();
            }
        });
    }

    public static <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(TuplesKt.to(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        CollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> toMutableList(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> int indexOf(List<? extends T> list, T t3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t3);
    }

    public static <T> T first(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> List<T> plus(Collection<? extends T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        CollectionsKt.addAll(arrayList2, elements);
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static <T> T firstOrNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                return t3;
            }
        }
        return null;
    }

    public static <T> T last(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(CollectionsKt.getLastIndex(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T single(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }
}
