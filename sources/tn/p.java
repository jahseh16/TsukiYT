package tn;

import androidx.annotation.Nullable;
import java.io.IOException;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8289a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f8293gv;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f8295mt;
    public long n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8296p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8298t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8300v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public w f8301wz;
    public zn y;
    public long zn;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long[] f8292fb = new long[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f8297s = new int[0];

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int[] f8290c5 = new int[0];

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long[] f8294i9 = new long[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean[] f8291f = new boolean[0];

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean[] f8299tl = new boolean[0];

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final d f8302xc = new d();

    public void a() {
        this.f8300v = 0;
        this.f8296p = 0L;
        this.f8295mt = false;
        this.f8298t = false;
        this.w = false;
        this.f8301wz = null;
    }

    public boolean fb(int i) {
        return this.f8298t && this.f8299tl[i];
    }

    public void gv(int i) {
        this.f8302xc.j5(i);
        this.f8298t = true;
        this.w = true;
    }

    public void n3(d dVar) {
        dVar.t(this.f8302xc.v(), 0, this.f8302xc.fb());
        this.f8302xc.oz(0);
        this.w = false;
    }

    public void v(int i, int i5) {
        this.f8300v = i;
        this.f8289a = i5;
        if (this.f8297s.length < i) {
            this.f8292fb = new long[i];
            this.f8297s = new int[i];
        }
        if (this.f8290c5.length < i5) {
            int i8 = (i5 * 125) / 100;
            this.f8290c5 = new int[i8];
            this.f8294i9 = new long[i8];
            this.f8291f = new boolean[i8];
            this.f8299tl = new boolean[i8];
        }
    }

    public void y(b1.tl tlVar) throws IOException {
        tlVar.readFully(this.f8302xc.v(), 0, this.f8302xc.fb());
        this.f8302xc.oz(0);
        this.w = false;
    }

    public long zn(int i) {
        return this.f8294i9[i];
    }
}
