package bv;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public class t implements Runnable {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public WorkerParameters.y f1342fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1343v;
    public i2.i9 y;

    public t(i2.i9 i9Var, String str, WorkerParameters.y yVar) {
        this.y = i9Var;
        this.f1343v = str;
        this.f1342fb = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.y.p().f(this.f1343v, this.f1342fb);
    }
}
