package os;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s extends c5 {

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final s f7251wz = new s(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<y> f7252a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final List<y> f7253c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<g> f7254f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<y> f7255fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<Uri> f7256gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public final g f7257i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<y> f7258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map<String, String> f7259t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final List<DrmInitData> f7260tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List<n3> f7261v;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f7262a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final String f7263gv;
        public final g n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final String f7264v;
        public final Uri y;

        @Nullable
        public final String zn;

        public n3(Uri uri, g gVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.y = uri;
            this.n3 = gVar;
            this.zn = str;
            this.f7263gv = str2;
            this.f7264v = str3;
            this.f7262a = str4;
        }

        public static n3 n3(Uri uri) {
            return new n3(uri, new g.n3().oz("0").k5("application/x-mpegURL").z6(), null, null, null, null);
        }

        public n3 y(g gVar) {
            return new n3(this.y, gVar, this.zn, this.f7263gv, this.f7264v, this.f7262a);
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final String f7265gv;
        public final g n3;

        @Nullable
        public final Uri y;
        public final String zn;

        public y(@Nullable Uri uri, g gVar, String str, String str2) {
            this.y = uri;
            this.n3 = gVar;
            this.zn = str;
            this.f7265gv = str2;
        }
    }

    public s(String str, List<String> list, List<n3> list2, List<y> list3, List<y> list4, List<y> list5, List<y> list6, @Nullable g gVar, @Nullable List<g> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.f7256gv = Collections.unmodifiableList(a(list2, list3, list4, list5, list6));
        this.f7261v = Collections.unmodifiableList(list2);
        this.f7252a = Collections.unmodifiableList(list3);
        this.f7255fb = Collections.unmodifiableList(list4);
        this.f7258s = Collections.unmodifiableList(list5);
        this.f7253c5 = Collections.unmodifiableList(list6);
        this.f7257i9 = gVar;
        this.f7254f = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f7259t = Collections.unmodifiableMap(map);
        this.f7260tl = Collections.unmodifiableList(list8);
    }

    public static List<Uri> a(List<n3> list, List<y> list2, List<y> list3, List<y> list4, List<y> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).y;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        n3(list2, arrayList);
        n3(list3, arrayList);
        n3(list4, arrayList);
        n3(list5, arrayList);
        return arrayList;
    }

    public static <T> List<T> gv(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            T t3 = list.get(i5);
            int i8 = 0;
            while (true) {
                if (i8 < list2.size()) {
                    StreamKey streamKey = list2.get(i8);
                    if (streamKey.f1672v == i && streamKey.f1670fb == i5) {
                        arrayList.add(t3);
                        break;
                    }
                    i8++;
                }
            }
        }
        return arrayList;
    }

    public static void n3(List<y> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).y;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static s v(String str) {
        return new s(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, Collections.emptyList(), Collections.singletonList(n3.n3(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    @Override // np.y
    /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
    public s y(List<StreamKey> list) {
        return new s(this.y, this.n3, gv(this.f7261v, 0, list), Collections.emptyList(), gv(this.f7255fb, 1, list), gv(this.f7258s, 2, list), Collections.emptyList(), this.f7257i9, this.f7254f, this.zn, this.f7259t, this.f7260tl);
    }
}
