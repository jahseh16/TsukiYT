package pv;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class zn implements np.y<zn> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7425a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public final mt f7426c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Uri f7427f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f7428fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f7429gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public final xc f7430i9;
    public final long n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f7431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final f f7432t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final List<i9> f7433tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7434v;
    public final long y;
    public final long zn;

    public zn(long j, long j4, long j7, boolean z, long j8, long j9, long j10, long j11, @Nullable f fVar, @Nullable mt mtVar, @Nullable xc xcVar, @Nullable Uri uri, List<i9> list) {
        this.y = j;
        this.n3 = j4;
        this.zn = j7;
        this.f7429gv = z;
        this.f7434v = j8;
        this.f7425a = j9;
        this.f7428fb = j10;
        this.f7431s = j11;
        this.f7432t = fVar;
        this.f7426c5 = mtVar;
        this.f7427f = uri;
        this.f7430i9 = xcVar;
        this.f7433tl = list == null ? Collections.emptyList() : list;
    }

    public static ArrayList<y> zn(List<y> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.y;
        ArrayList<y> arrayList = new ArrayList<>();
        do {
            int i5 = streamKeyPoll.f1672v;
            y yVar = list.get(i5);
            List<tl> list2 = yVar.zn;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.f1670fb));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.y != i) {
                    break;
                }
            } while (streamKeyPoll.f1672v == i5);
            arrayList.add(new y(yVar.y, yVar.n3, arrayList2, yVar.f7423gv, yVar.f7424v, yVar.f7422a));
        } while (streamKeyPoll.y == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    public final long a(int i) {
        long j;
        long j4;
        if (i == this.f7433tl.size() - 1) {
            j = this.n3;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j4 = this.f7433tl.get(i).n3;
        } else {
            j = this.f7433tl.get(i + 1).n3;
            j4 = this.f7433tl.get(i).n3;
        }
        return j - j4;
    }

    public final long fb(int i) {
        return ut.xb(a(i));
    }

    public final i9 gv(int i) {
        return this.f7433tl.get(i);
    }

    @Override // np.y
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public final zn y(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= v()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).y != i) {
                long jA = a(i);
                if (jA != -9223372036854775807L) {
                    j += jA;
                }
            } else {
                i9 i9VarGv = gv(i);
                arrayList.add(new i9(i9VarGv.y, i9VarGv.n3 - j, zn(i9VarGv.zn, linkedList), i9VarGv.f7390gv));
            }
            i++;
        }
        long j4 = this.n3;
        return new zn(this.y, j4 != -9223372036854775807L ? j4 - j : -9223372036854775807L, this.zn, this.f7429gv, this.f7434v, this.f7425a, this.f7428fb, this.f7431s, this.f7432t, this.f7426c5, this.f7430i9, this.f7427f, arrayList);
    }

    public final int v() {
        return this.f7433tl.size();
    }
}
