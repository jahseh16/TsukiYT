package c8;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import h.c5;
import h.zn;
import ic.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final AssetManager f1416gv;
    public final c5<String> y = new c5<>();
    public final Map<c5<String>, Typeface> n3 = new HashMap();
    public final Map<String, Typeface> zn = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1417v = ".ttf";

    public y(Drawable.Callback callback, @Nullable uo.y yVar) {
        if (callback instanceof View) {
            this.f1416gv = ((View) callback).getContext().getAssets();
        } else {
            a.zn("LottieDrawable must be inside of a view for images to work.");
            this.f1416gv = null;
        }
    }

    public Typeface n3(zn znVar) {
        this.y.n3(znVar.y(), znVar.zn());
        Typeface typeface = this.n3.get(this.y);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceV = v(y(znVar), znVar.zn());
        this.n3.put(this.y, typefaceV);
        return typefaceV;
    }

    public final Typeface v(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public final Typeface y(zn znVar) {
        String strY = znVar.y();
        Typeface typeface = this.zn.get(strY);
        if (typeface != null) {
            return typeface;
        }
        znVar.zn();
        znVar.n3();
        if (znVar.gv() != null) {
            return znVar.gv();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f1416gv, "fonts/" + strY + this.f1417v);
        this.zn.put(strY, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void zn(String str) {
        this.f1417v = str;
    }

    public void gv(@Nullable uo.y yVar) {
    }
}
