package pv;

import ft.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pv.tl;
import pv.wz;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public static final y n3 = new y(null);
    public zn y;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tl.n3 y(tl.n3 representation, t tVar, long j, long j4, long j7, long j8, long j9) {
            Intrinsics.checkNotNullParameter(representation, "representation");
            wz.y yVar = representation.f7402c5;
            Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate");
            wz.zn znVar = (wz.zn) yVar;
            wz.zn znVarN3 = v.n3(tVar, znVar.n3, znVar.zn, j, j4, j7, znVar.f7411a, znVar.f7412c5, znVar.f7418i9, znVar.f7417f, j8, j9);
            Intrinsics.checkNotNullExpressionValue(znVarN3, "buildSegmentTemplate(...)");
            return new tl.n3(representation.y, representation.n3, representation.zn, znVarN3, representation.f7401v, representation.f7397a, representation.f7398fb);
        }

        public y() {
        }
    }

    public gv(zn baseManifest) {
        Intrinsics.checkNotNullParameter(baseManifest, "baseManifest");
        this.y = baseManifest;
    }

    public final tl a(List<? extends tl> list, tl tlVar) {
        String str = tlVar.n3.y;
        for (tl tlVar2 : list) {
            if (Intrinsics.areEqual(tlVar2.n3.y, str)) {
                return tlVar2;
            }
        }
        return null;
    }

    public final boolean fb(List<? extends pv.y> list) {
        if (list.isEmpty()) {
            return false;
        }
        List<tl> representations = list.get(0).zn;
        Intrinsics.checkNotNullExpressionValue(representations, "representations");
        if (representations.isEmpty()) {
            return false;
        }
        tl tlVar = representations.get(0);
        Intrinsics.checkNotNullExpressionValue(tlVar, "get(...)");
        tl tlVar2 = tlVar;
        if (tlVar2 instanceof tl.n3) {
            wz.y yVar = ((tl.n3) tlVar2).f7402c5;
            if ((yVar instanceof wz.n3) && yVar.f7411a != null) {
                return true;
            }
        }
        return false;
    }

    public final wz.n3 gv(wz.n3 n3Var, wz.n3 n3Var2, i9 i9Var) {
        long j = this.y.y;
        long j4 = j != -9223372036854775807L ? i9Var.n3 + j : -9223372036854775807L;
        List<wz.gv> list = n3Var2.f7411a;
        Intrinsics.checkNotNull(list);
        List<t> list2 = n3Var2.f7408i9;
        Intrinsics.checkNotNull(list2);
        List<wz.gv> list3 = n3Var.f7411a;
        Intrinsics.checkNotNull(list3);
        ArrayList arrayList = new ArrayList(list3);
        List<t> list4 = n3Var.f7408i9;
        Intrinsics.checkNotNull(list4);
        ArrayList arrayList2 = new ArrayList(list4);
        long size = n3Var.f7414gv + ((long) arrayList.size());
        long j7 = n3Var2.f7414gv;
        int i = j7 >= size ? 0 : (int) (size - j7);
        if (i < list.size()) {
            List<wz.gv> listSubList = list.subList(i, list.size());
            wz.gv gvVar = (wz.gv) CollectionsKt.last((List) arrayList);
            long j8 = (gvVar.y + gvVar.n3) - ((wz.gv) CollectionsKt.first((List) listSubList)).y;
            for (wz.gv gvVar2 : listSubList) {
                arrayList.add(new wz.gv(gvVar2.y + j8, gvVar2.n3));
                j8 = j8;
            }
            arrayList2.addAll(list2.subList(i, list2.size()));
        }
        wz.n3 n3VarY = v.y(n3Var.y, n3Var.n3, n3Var.zn, n3Var.f7414gv, n3Var.f7416v, arrayList, n3Var.f7412c5, arrayList2, ut.xb(this.y.f7425a), ut.xb(j4));
        Intrinsics.checkNotNullExpressionValue(n3VarY, "buildSegmentList(...)");
        return n3VarY;
    }

    public final zn n3(zn newManifest) {
        Intrinsics.checkNotNullParameter(newManifest, "newManifest");
        i9 i9VarGv = this.y.gv(0);
        Intrinsics.checkNotNullExpressionValue(i9VarGv, "getPeriod(...)");
        i9 i9VarGv2 = newManifest.gv(0);
        Intrinsics.checkNotNullExpressionValue(i9VarGv2, "getPeriod(...)");
        List<pv.y> adaptationSets = i9VarGv.zn;
        Intrinsics.checkNotNullExpressionValue(adaptationSets, "adaptationSets");
        if (fb(adaptationSets)) {
            List<pv.y> adaptationSets2 = i9VarGv2.zn;
            Intrinsics.checkNotNullExpressionValue(adaptationSets2, "adaptationSets");
            if (fb(adaptationSets2)) {
                tl tlVar = i9VarGv.zn.get(0).zn.get(0);
                Intrinsics.checkNotNull(tlVar, "null cannot be cast to non-null type com.google.android.exoplayer2.source.dash.manifest.Representation.MultiSegmentRepresentation");
                long jC5 = ((tl.n3) tlVar).c5();
                tl tlVar2 = i9VarGv2.zn.get(0).zn.get(0);
                Intrinsics.checkNotNull(tlVar2, "null cannot be cast to non-null type com.google.android.exoplayer2.source.dash.manifest.Representation.MultiSegmentRepresentation");
                if (((tl.n3) tlVar2).c5() <= jC5) {
                    this.y = newManifest;
                    return newManifest;
                }
                List<pv.y> adaptationSets3 = i9VarGv2.zn;
                Intrinsics.checkNotNullExpressionValue(adaptationSets3, "adaptationSets");
                i9 i9Var = new i9(i9VarGv.y, i9VarGv.n3, y(i9VarGv, adaptationSets3), i9VarGv.f7390gv, i9VarGv.f7391v);
                zn znVar = this.y;
                zn znVar2 = new zn(znVar.y, znVar.n3, znVar.zn, znVar.f7429gv, znVar.f7434v, znVar.f7425a, znVar.f7428fb, newManifest.f7431s, znVar.f7432t, newManifest.f7426c5, znVar.f7430i9, newManifest.f7427f, CollectionsKt.listOf(i9Var));
                this.y = znVar2;
                return znVar2;
            }
        }
        this.y = newManifest;
        return newManifest;
    }

    public final pv.y v(List<? extends pv.y> list, pv.y yVar) {
        g format = yVar.zn.get(0).n3;
        Intrinsics.checkNotNullExpressionValue(format, "format");
        for (pv.y yVar2 : list) {
            if (yVar2.n3 == yVar.n3) {
                g format2 = yVar2.zn.get(0).n3;
                Intrinsics.checkNotNullExpressionValue(format2, "format");
                if (Intrinsics.areEqual(format2.f4787r, format.f4787r) && Intrinsics.areEqual(format2.f3, format.f3)) {
                    return yVar2;
                }
            }
        }
        return null;
    }

    public final List<pv.y> y(i9 i9Var, List<? extends pv.y> list) {
        List<pv.y> adaptationSets = i9Var.zn;
        Intrinsics.checkNotNullExpressionValue(adaptationSets, "adaptationSets");
        ArrayList arrayList = new ArrayList();
        for (pv.y yVar : adaptationSets) {
            pv.y yVarV = v(list, yVar);
            if (yVarV == null) {
                arrayList.add(yVar);
            } else {
                List<tl> representations = yVar.zn;
                Intrinsics.checkNotNullExpressionValue(representations, "representations");
                List<tl> representations2 = yVarV.zn;
                Intrinsics.checkNotNullExpressionValue(representations2, "representations");
                arrayList.add(new pv.y(yVar.y, yVar.n3, zn(representations, representations2, i9Var), yVar.f7423gv, yVar.f7424v, yVar.f7422a));
            }
        }
        return arrayList;
    }

    public final List<tl> zn(List<? extends tl> list, List<? extends tl> list2, i9 i9Var) {
        ArrayList arrayList = new ArrayList();
        for (tl tlVar : list) {
            tl tlVarA = a(list2, tlVar);
            if (tlVarA == null) {
                arrayList.add(tlVar);
            } else {
                Intrinsics.checkNotNull(tlVar, "null cannot be cast to non-null type com.google.android.exoplayer2.source.dash.manifest.Representation.MultiSegmentRepresentation");
                wz.y yVar = ((tl.n3) tlVar).f7402c5;
                Intrinsics.checkNotNull(yVar, "null cannot be cast to non-null type com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList");
                wz.y yVar2 = ((tl.n3) tlVarA).f7402c5;
                Intrinsics.checkNotNull(yVar2, "null cannot be cast to non-null type com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList");
                arrayList.add(tl.w(tlVar.y, tlVar.n3, tlVar.zn, gv((wz.n3) yVar, (wz.n3) yVar2, i9Var), tlVar.f7401v, tlVar.f7397a, tlVar.f7398fb, null));
            }
        }
        return arrayList;
    }
}
