package pv;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i9 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<s> f7390gv;
    public final long n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final fb f7391v;

    @Nullable
    public final String y;
    public final List<y> zn;

    public i9(@Nullable String str, long j, List<y> list) {
        this(str, j, list, Collections.emptyList(), null);
    }

    public int y(int i) {
        int size = this.zn.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.zn.get(i5).n3 == i) {
                return i5;
            }
        }
        return -1;
    }

    public i9(@Nullable String str, long j, List<y> list, List<s> list2) {
        this(str, j, list, list2, null);
    }

    public i9(@Nullable String str, long j, List<y> list, List<s> list2, @Nullable fb fbVar) {
        this.y = str;
        this.n3 = j;
        this.zn = Collections.unmodifiableList(list);
        this.f7390gv = Collections.unmodifiableList(list2);
        this.f7391v = fbVar;
    }
}
