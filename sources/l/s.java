package l;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import qj.t;

/* JADX INFO: loaded from: classes.dex */
public final class s extends fb implements t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SQLiteStatement f6106v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6106v = delegate;
    }

    @Override // qj.t
    public void execute() {
        this.f6106v.execute();
    }

    @Override // qj.t
    public long executeInsert() {
        return this.f6106v.executeInsert();
    }

    @Override // qj.t
    public int executeUpdateDelete() {
        return this.f6106v.executeUpdateDelete();
    }

    @Override // qj.t
    public long simpleQueryForLong() {
        return this.f6106v.simpleQueryForLong();
    }

    @Override // qj.t
    public String simpleQueryForString() {
        return this.f6106v.simpleQueryForString();
    }
}
