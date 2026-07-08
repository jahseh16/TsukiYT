package jw;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public interface y {
    public static final C0111y y = C0111y.zn;

    /* JADX INFO: renamed from: jw.y$y, reason: collision with other inner class name */
    public static final class C0111y implements y {
        public static final /* synthetic */ C0111y zn = new C0111y();
        public final /* synthetic */ y n3 = (y) zk1.n3.y.zn().v().n3().zn(Reflection.getOrCreateKotlinClass(y.class), null, null);

        @Override // jw.y
        public String y(String head, String tag, String msg) {
            Intrinsics.checkNotNullParameter(head, "head");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            return this.n3.y(head, tag, msg);
        }
    }

    String y(String str, String str2, String str3);
}
