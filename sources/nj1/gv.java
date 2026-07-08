package nj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6958a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f6959c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6960f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public String f6961fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f6962gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public String f6963i9;
    public boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6965t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public pj1.zn f6966tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6967v;
    public boolean y;
    public boolean zn;

    public gv(y json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.y = json.v().v();
        this.n3 = json.v().a();
        this.zn = json.v().fb();
        this.f6962gv = json.v().t();
        this.f6967v = json.v().n3();
        this.f6958a = json.v().s();
        this.f6961fb = json.v().c5();
        this.f6964s = json.v().gv();
        this.f6959c5 = json.v().f();
        this.f6963i9 = json.v().zn();
        this.f6960f = json.v().y();
        this.f6965t = json.v().i9();
        this.f6966tl = json.y();
    }

    public final void a(boolean z) {
        this.zn = z;
    }

    public final void gv(boolean z) {
        this.y = z;
    }

    public final pj1.zn n3() {
        return this.f6966tl;
    }

    public final void v(boolean z) {
        this.n3 = z;
    }

    public final a y() {
        if (this.f6959c5 && !Intrinsics.areEqual(this.f6963i9, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
        }
        if (this.f6958a) {
            if (!Intrinsics.areEqual(this.f6961fb, "    ")) {
                String str = this.f6961fb;
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f6961fb).toString());
                    }
                }
            }
        } else if (!Intrinsics.areEqual(this.f6961fb, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new a(this.y, this.zn, this.f6962gv, this.f6967v, this.f6958a, this.n3, this.f6961fb, this.f6964s, this.f6959c5, this.f6963i9, this.f6960f, this.f6965t);
    }

    public final void zn(boolean z) {
        this.f6967v = z;
    }
}
