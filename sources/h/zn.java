package h;

import android.graphics.Typeface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class zn {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final float f5245gv;
    public final String n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Typeface f5246v;
    public final String y;
    public final String zn;

    public zn(String str, String str2, String str3, float f3) {
        this.y = str;
        this.n3 = str2;
        this.zn = str3;
        this.f5245gv = f3;
    }

    @Nullable
    public Typeface gv() {
        return this.f5246v;
    }

    public String n3() {
        return this.n3;
    }

    public void v(@Nullable Typeface typeface) {
        this.f5246v = typeface;
    }

    public String y() {
        return this.y;
    }

    public String zn() {
        return this.zn;
    }
}
