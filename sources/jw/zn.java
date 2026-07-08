package jw;

import android.app.Application;
import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jw.zn;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
public interface zn {
    public static final y y = y.n3;

    public static final class y implements zn {
        public static final /* synthetic */ y n3 = new y();
        public static final Lazy<List<zn>> zn = LazyKt.lazy(new Function0() { // from class: jw.n3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zn.y.c5();
            }
        });

        public static final List c5() {
            return CollectionsKt.toList(zk1.n3.y.zn().v().n3().gv(Reflection.getOrCreateKotlinClass(zn.class)));
        }

        public static /* synthetic */ void fb(y yVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            }
            yVar.a(str, str2, str3);
        }

        public final void a(String tag, String msg, String head) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(head, "head");
            Iterator<T> it = s().iterator();
            while (it.hasNext()) {
                ((zn) it.next()).y(jw.y.y.y(head, tag, msg));
            }
        }

        @Override // jw.zn
        public void n3(Context context, Map<String, String> datas) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(datas, "datas");
            Iterator<T> it = s().iterator();
            while (it.hasNext()) {
                ((zn) it.next()).n3(context, datas);
            }
        }

        public final List<zn> s() {
            return zn.getValue();
        }

        @Override // jw.zn
        public void setUserId(String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Iterator<T> it = s().iterator();
            while (it.hasNext()) {
                ((zn) it.next()).setUserId(userId);
            }
        }

        public final void v(String tag, String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            fb(this, tag, msg, null, 4, null);
        }

        @Override // jw.zn
        public void y(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Iterator<T> it = s().iterator();
            while (it.hasNext()) {
                ((zn) it.next()).y(msg);
            }
        }

        @Override // jw.zn
        public void zn(Application context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Iterator<T> it = s().iterator();
            while (it.hasNext()) {
                ((zn) it.next()).zn(context, z);
            }
        }
    }

    void n3(Context context, Map<String, String> map);

    void setUserId(String str);

    void y(String str);

    void zn(Application application, boolean z);
}
