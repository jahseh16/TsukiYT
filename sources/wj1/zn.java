package wj1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9027a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f9028fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f9029v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(String str, boolean z, Function0<Unit> function0) {
        super(str, z);
        this.f9029v = str;
        this.f9027a = z;
        this.f9028fb = function0;
    }

    @Override // wj1.y
    public long a() {
        this.f9028fb.invoke();
        return -1L;
    }
}
