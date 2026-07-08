package uo;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Bitmap f8429a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String f8430gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f8431v;
    public final int y;
    public final String zn;

    public ta(int i, int i5, String str, String str2, String str3) {
        this.y = i;
        this.n3 = i5;
        this.zn = str;
        this.f8430gv = str2;
        this.f8431v = str3;
    }

    public void a(@Nullable Bitmap bitmap) {
        this.f8429a = bitmap;
    }

    public String gv() {
        return this.zn;
    }

    public String n3() {
        return this.f8430gv;
    }

    public int v() {
        return this.y;
    }

    @Nullable
    public Bitmap y() {
        return this.f8429a;
    }

    public int zn() {
        return this.n3;
    }
}
