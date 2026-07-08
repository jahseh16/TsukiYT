package nr;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import ft.g;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lf.ej;
import v0.hw;
import v0.n;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements s {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final int[] f6997gv = {8, 13, 11, 2, 0, 1, 7};
    public final int n3;
    public final boolean zn;

    public gv() {
        this(0, true);
    }

    public static ej a(int i, boolean z, g gVar, @Nullable List<g> list, hw hwVar) {
        int i5 = i | 16;
        if (list != null) {
            i5 = i | 48;
        } else {
            list = z ? Collections.singletonList(new g.n3().o4("application/cea-608").z6()) : Collections.emptyList();
        }
        String str = gVar.f4778co;
        if (!TextUtils.isEmpty(str)) {
            if (!n.n3(str, "audio/mp4a-latm")) {
                i5 |= 2;
            }
            if (!n.n3(str, "video/avc")) {
                i5 |= 4;
            }
        }
        return new ej(2, hwVar, new lf.i9(i5, list));
    }

    public static boolean fb(g gVar) {
        Metadata metadata = gVar.z;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.v(); i++) {
            if (metadata.gv(i) instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).f1777fb.isEmpty();
            }
        }
        return false;
    }

    public static void n3(int i, List<Integer> list) {
        if (n4.a.c5(f6997gv, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    public static boolean s(b1.t tVar, b1.tl tlVar) throws IOException {
        try {
            boolean zGv = tVar.gv(tlVar);
            tlVar.s();
            return zGv;
        } catch (EOFException unused) {
            tlVar.s();
            return false;
        } catch (Throwable th) {
            tlVar.s();
            throw th;
        }
    }

    public static tn.fb v(hw hwVar, g gVar, @Nullable List<g> list) {
        int i = fb(gVar) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new tn.fb(i, hwVar, null, list);
    }

    @Nullable
    @SuppressLint({"SwitchIntDef"})
    public final b1.t gv(int i, g gVar, @Nullable List<g> list, hw hwVar) {
        if (i == 0) {
            return new lf.n3();
        }
        if (i == 1) {
            return new lf.v();
        }
        if (i == 2) {
            return new lf.s();
        }
        if (i == 7) {
            return new ao.a(0, 0L);
        }
        if (i == 8) {
            return v(hwVar, gVar, list);
        }
        if (i == 11) {
            return a(this.n3, this.zn, gVar, list, hwVar);
        }
        if (i != 13) {
            return null;
        }
        return new z(gVar.f4782fb, hwVar);
    }

    @Override // nr.s
    /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
    public n3 y(Uri uri, g gVar, @Nullable List<g> list, hw hwVar, Map<String, List<String>> map, b1.tl tlVar, gn gnVar) throws IOException {
        int iY = v0.tl.y(gVar.f3);
        int iN3 = v0.tl.n3(map);
        int iZn = v0.tl.zn(uri);
        int[] iArr = f6997gv;
        ArrayList arrayList = new ArrayList(iArr.length);
        n3(iY, arrayList);
        n3(iN3, arrayList);
        n3(iZn, arrayList);
        for (int i : iArr) {
            n3(i, arrayList);
        }
        tlVar.s();
        b1.t tVar = null;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            int iIntValue = ((Integer) arrayList.get(i5)).intValue();
            b1.t tVar2 = (b1.t) v0.y.v(gv(iIntValue, gVar, list, hwVar));
            if (s(tVar2, tlVar)) {
                return new n3(tVar2, gVar, hwVar);
            }
            if (tVar == null && (iIntValue == iY || iIntValue == iN3 || iIntValue == iZn || iIntValue == 11)) {
                tVar = tVar2;
            }
        }
        return new n3((b1.t) v0.y.v(tVar), gVar, hwVar);
    }

    public gv(int i, boolean z) {
        this.n3 = i;
        this.zn = z;
    }
}
