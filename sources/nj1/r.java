package nj1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import oj1.q9;

/* JADX INFO: loaded from: classes.dex */
@ij1.c5(with = i4.class)
public final class r extends s implements Map<String, s>, KMappedMarker {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final y f6970fb = new y(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, s> f6971v;

    public static final class n3 extends Lambda implements Function1<Map.Entry<? extends String, ? extends s>, CharSequence> {
        public static final n3 y = new n3();

        public n3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, ? extends s> entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            String key = entry.getKey();
            s value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            q9.zn(sb, key);
            sb.append(':');
            sb.append(value);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(Map<String, ? extends s> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f6971v = content;
    }

    public int c5() {
        return this.f6971v.size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ s compute(String str, BiFunction<? super String, ? super s, ? extends s> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ s computeIfAbsent(String str, Function<? super String, ? extends s> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ s computeIfPresent(String str, BiFunction<? super String, ? super s, ? extends s> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return y((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof s) {
            return zn((s) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, s>> entrySet() {
        return fb();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f6971v, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public s remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<Map.Entry<String, s>> fb() {
        return this.f6971v.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ s get(Object obj) {
        if (obj instanceof String) {
            return v((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f6971v.hashCode();
    }

    public Collection<s> i9() {
        return this.f6971v.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f6971v.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return s();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ s merge(String str, s sVar, BiFunction<? super s, ? super s, ? extends s> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ s put(String str, s sVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends s> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ s putIfAbsent(String str, s sVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ s replace(String str, s sVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super s, ? extends s> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<String> s() {
        return this.f6971v.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c5();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f6971v.entrySet(), ",", "{", "}", 0, null, n3.y, 24, null);
    }

    public s v(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f6971v.get(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<s> values() {
        return i9();
    }

    public boolean y(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f6971v.containsKey(key);
    }

    public boolean zn(s value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f6971v.containsValue(value);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, s sVar, s sVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
