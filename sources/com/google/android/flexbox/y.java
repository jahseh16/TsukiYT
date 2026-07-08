package com.google.android.flexbox;

import android.view.View;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2144a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f2145c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2146f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f2147fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public float f2149i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f2150mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2151p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2153t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f2154tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2155v;
    public int w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f2157xc;
    public int y = Reader.READ_DONE;
    public int n3 = Reader.READ_DONE;
    public int zn = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f2148gv = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public List<Integer> f2156wz = new ArrayList();

    public void gv(View view, int i, int i5, int i8, int i10) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.y = Math.min(this.y, (view.getLeft() - flexItem.eb()) - i);
        this.n3 = Math.min(this.n3, (view.getTop() - flexItem.n()) - i5);
        this.zn = Math.max(this.zn, view.getRight() + flexItem.m() + i8);
        this.f2148gv = Math.max(this.f2148gv, view.getBottom() + flexItem.rs() + i10);
    }

    public int n3() {
        return this.f2152s;
    }

    public int y() {
        return this.f2147fb;
    }

    public int zn() {
        return this.f2152s - this.f2145c5;
    }
}
