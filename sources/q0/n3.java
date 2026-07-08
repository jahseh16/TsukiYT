package q0;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final n3 f7438fb = new n3(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Typeface f7439a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f7440gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7441v;
    public final int y;
    public final int zn;

    public n3(int i, int i5, int i8, int i10, int i11, @Nullable Typeface typeface) {
        this.y = i;
        this.n3 = i5;
        this.zn = i8;
        this.f7440gv = i10;
        this.f7441v = i11;
        this.f7439a = typeface;
    }

    public static n3 n3(CaptioningManager.CaptionStyle captionStyle) {
        return new n3(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public static n3 y(CaptioningManager.CaptionStyle captionStyle) {
        return ut.y >= 21 ? zn(captionStyle) : n3(captionStyle);
    }

    public static n3 zn(CaptioningManager.CaptionStyle captionStyle) {
        return new n3(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f7438fb.y, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f7438fb.n3, captionStyle.hasWindowColor() ? captionStyle.windowColor : f7438fb.zn, captionStyle.hasEdgeType() ? captionStyle.edgeType : f7438fb.f7440gv, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f7438fb.f7441v, captionStyle.getTypeface());
    }
}
