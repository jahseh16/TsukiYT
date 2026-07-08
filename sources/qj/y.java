package qj;

import android.annotation.SuppressLint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y implements f {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final C0149y f7471fb = new C0149y(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object[] f7472v;
    public final String y;

    /* JADX INFO: renamed from: qj.y$y, reason: collision with other inner class name */
    public static final class C0149y {
        public /* synthetic */ C0149y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void n3(i9 statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                y(statement, i, obj);
            }
        }

        public final void y(i9 i9Var, int i, Object obj) {
            if (obj == null) {
                i9Var.bindNull(i);
                return;
            }
            if (obj instanceof byte[]) {
                i9Var.bindBlob(i, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                i9Var.bindDouble(i, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                i9Var.bindDouble(i, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                i9Var.bindLong(i, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                i9Var.bindLong(i, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                i9Var.bindLong(i, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                i9Var.bindLong(i, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                i9Var.bindString(i, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                i9Var.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public C0149y() {
        }
    }

    public y(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.y = query;
        this.f7472v = objArr;
    }

    @Override // qj.f
    public void bindTo(i9 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f7471fb.n3(statement, this.f7472v);
    }

    @Override // qj.f
    public int getArgCount() {
        Object[] objArr = this.f7472v;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // qj.f
    public String getSql() {
        return this.y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
