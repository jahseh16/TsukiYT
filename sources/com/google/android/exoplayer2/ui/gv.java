package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.gv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import k4.i4;
import q0.fb;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public static final Pattern y = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.gv$gv, reason: collision with other inner class name */
    public static final class C0059gv {
        public final List<zn> y = new ArrayList();
        public final List<zn> n3 = new ArrayList();
    }

    public static class n3 {
        public final Map<String, String> n3;
        public final String y;

        public n3(String str, Map<String, String> map) {
            this.y = str;
            this.n3 = map;
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final String f2013gv;
        public final int n3;
        public final int y;
        public final String zn;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final Comparator<zn> f2012v = new Comparator() { // from class: q0.i9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gv.zn.v((gv.zn) obj, (gv.zn) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Comparator<zn> f2011a = new Comparator() { // from class: q0.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gv.zn.a((gv.zn) obj, (gv.zn) obj2);
            }
        };

        public static /* synthetic */ int a(zn znVar, zn znVar2) {
            int iCompare = Integer.compare(znVar2.y, znVar.y);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = znVar2.zn.compareTo(znVar.zn);
            return iCompareTo != 0 ? iCompareTo : znVar2.f2013gv.compareTo(znVar.f2013gv);
        }

        public static /* synthetic */ int v(zn znVar, zn znVar2) {
            int iCompare = Integer.compare(znVar2.n3, znVar.n3);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = znVar.zn.compareTo(znVar2.zn);
            return iCompareTo != 0 ? iCompareTo : znVar.f2013gv.compareTo(znVar2.f2013gv);
        }

        public zn(int i, int i5, String str, String str2) {
            this.y = i;
            this.n3 = i5;
            this.zn = str;
            this.f2013gv = str2;
        }
    }

    public static C0059gv a(SparseArray<C0059gv> sparseArray, int i) {
        C0059gv c0059gv = sparseArray.get(i);
        if (c0059gv != null) {
            return c0059gv;
        }
        C0059gv c0059gv2 = new C0059gv();
        sparseArray.put(i, c0059gv2);
        return c0059gv2;
    }

    public static String fb(int i) {
        return i != 2 ? "over right" : "under left";
    }

    @Nullable
    public static String gv(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof g0.y) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof g0.v)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof g0.zn) {
                return "<rt>" + n3(((g0.zn) obj).y) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    public static String n3(CharSequence charSequence) {
        return y.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static String s(int i, int i5) {
        StringBuilder sb = new StringBuilder();
        if (i5 == 1) {
            sb.append("filled ");
        } else if (i5 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }

    @Nullable
    public static String v(Object obj, float f3) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return ut.rz("<span style='color:%s;'>", fb.n3(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return ut.rz("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof g0.y) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return ut.rz("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r4.getSize() : r4.getSize() / f3));
        }
        if (obj instanceof RelativeSizeSpan) {
            return ut.rz("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return ut.rz("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof g0.zn)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof g0.v)) {
                return null;
            }
            g0.v vVar = (g0.v) obj;
            return ut.rz("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", s(vVar.y, vVar.n3), fb(vVar.zn));
        }
        int i = ((g0.zn) obj).n3;
        if (i == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    public static n3 y(@Nullable CharSequence charSequence, float f3) {
        int i = 0;
        if (charSequence == null) {
            return new n3(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, i4.f3());
        }
        if (!(charSequence instanceof Spanned)) {
            return new n3(n3(charSequence), i4.f3());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(fb.y("bg_" + iIntValue), ut.rz("background-color:%s;", fb.n3(iIntValue)));
        }
        SparseArray<C0059gv> sparseArrayZn = zn(spanned, f3);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i5 = 0;
        while (i < sparseArrayZn.size()) {
            int iKeyAt = sparseArrayZn.keyAt(i);
            sb.append(n3(spanned.subSequence(i5, iKeyAt)));
            C0059gv c0059gv = sparseArrayZn.get(iKeyAt);
            Collections.sort(c0059gv.n3, zn.f2011a);
            Iterator it2 = c0059gv.n3.iterator();
            while (it2.hasNext()) {
                sb.append(((zn) it2.next()).f2013gv);
            }
            Collections.sort(c0059gv.y, zn.f2012v);
            Iterator it3 = c0059gv.y.iterator();
            while (it3.hasNext()) {
                sb.append(((zn) it3.next()).zn);
            }
            i++;
            i5 = iKeyAt;
        }
        sb.append(n3(spanned.subSequence(i5, spanned.length())));
        return new n3(sb.toString(), map);
    }

    public static SparseArray<C0059gv> zn(Spanned spanned, float f3) {
        SparseArray<C0059gv> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strV = v(obj, f3);
            String strGv = gv(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strV != null) {
                v0.y.v(strGv);
                zn znVar = new zn(spanStart, spanEnd, strV, strGv);
                a(sparseArray, spanStart).y.add(znVar);
                a(sparseArray, spanEnd).n3.add(znVar);
            }
        }
        return sparseArray;
    }
}
