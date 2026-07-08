package sj1;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface wz {
    public static final y y = y.y;
    public static final wz n3 = new y.C0165y();

    public static final class y {
        public static final /* synthetic */ y y = new y();

        /* JADX INFO: renamed from: sj1.wz$y$y, reason: collision with other inner class name */
        public static final class C0165y implements wz {
            @Override // sj1.wz
            public List<tl> loadForRequest(r url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.emptyList();
            }

            @Override // sj1.wz
            public void saveFromResponse(r url, List<tl> cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }
        }
    }

    List<tl> loadForRequest(r rVar);

    void saveFromResponse(r rVar, List<tl> list);
}
