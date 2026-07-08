package eb;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import eb.n3;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f3318a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public double f3319c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public double f3320fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public double f3321gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final n3.xc f3322i9;
    public double n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f3323s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f3324v;
    public double y;
    public boolean zn;

    public v() {
        this.y = Math.sqrt(1500.0d);
        this.n3 = 0.5d;
        this.zn = false;
        this.f3319c5 = Double.MAX_VALUE;
        this.f3322i9 = new n3.xc();
    }

    public v a(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.y = Math.sqrt(f3);
        this.zn = false;
        return this;
    }

    public void fb(double d4) {
        double dAbs = Math.abs(d4);
        this.f3321gv = dAbs;
        this.f3324v = dAbs * 62.5d;
    }

    public v gv(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.n3 = f3;
        this.zn = false;
        return this;
    }

    public final void n3() {
        if (this.zn) {
            return;
        }
        if (this.f3319c5 == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d4 = this.n3;
        if (d4 > 1.0d) {
            double d5 = this.y;
            this.f3318a = ((-d4) * d5) + (d5 * Math.sqrt((d4 * d4) - 1.0d));
            double d6 = this.n3;
            double d7 = this.y;
            this.f3320fb = ((-d6) * d7) - (d7 * Math.sqrt((d6 * d6) - 1.0d));
        } else if (d4 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d4 < 1.0d) {
            this.f3323s = this.y * Math.sqrt(1.0d - (d4 * d4));
        }
        this.zn = true;
    }

    public n3.xc s(double d4, double d5, long j) {
        double dCos;
        double dPow;
        n3();
        double d6 = j / 1000.0d;
        double d7 = d4 - this.f3319c5;
        double d8 = this.n3;
        if (d8 > 1.0d) {
            double d9 = this.f3320fb;
            double d10 = this.f3318a;
            double d11 = d7 - (((d9 * d7) - d5) / (d9 - d10));
            double d12 = ((d7 * d9) - d5) / (d9 - d10);
            dPow = (Math.pow(2.718281828459045d, d9 * d6) * d11) + (Math.pow(2.718281828459045d, this.f3318a * d6) * d12);
            double d13 = this.f3320fb;
            double dPow2 = d11 * d13 * Math.pow(2.718281828459045d, d13 * d6);
            double d14 = this.f3318a;
            dCos = dPow2 + (d12 * d14 * Math.pow(2.718281828459045d, d14 * d6));
        } else if (d8 == 1.0d) {
            double d15 = this.y;
            double d16 = d5 + (d15 * d7);
            double d17 = d7 + (d16 * d6);
            dPow = Math.pow(2.718281828459045d, (-d15) * d6) * d17;
            double dPow3 = d17 * Math.pow(2.718281828459045d, (-this.y) * d6);
            double d18 = this.y;
            dCos = (d16 * Math.pow(2.718281828459045d, (-d18) * d6)) + (dPow3 * (-d18));
        } else {
            double d19 = 1.0d / this.f3323s;
            double d20 = this.y;
            double d21 = d19 * ((d8 * d20 * d7) + d5);
            double dPow4 = Math.pow(2.718281828459045d, (-d8) * d20 * d6) * ((Math.cos(this.f3323s * d6) * d7) + (Math.sin(this.f3323s * d6) * d21));
            double d22 = this.y;
            double d23 = this.n3;
            double d24 = (-d22) * dPow4 * d23;
            double dPow5 = Math.pow(2.718281828459045d, (-d23) * d22 * d6);
            double d25 = this.f3323s;
            double dSin = (-d25) * d7 * Math.sin(d25 * d6);
            double d26 = this.f3323s;
            dCos = d24 + (dPow5 * (dSin + (d21 * d26 * Math.cos(d26 * d6))));
            dPow = dPow4;
        }
        n3.xc xcVar = this.f3322i9;
        xcVar.y = (float) (dPow + this.f3319c5);
        xcVar.n3 = (float) dCos;
        return xcVar;
    }

    public v v(float f3) {
        this.f3319c5 = f3;
        return this;
    }

    public float y() {
        return (float) this.f3319c5;
    }

    public boolean zn(float f3, float f4) {
        return ((double) Math.abs(f4)) < this.f3324v && ((double) Math.abs(f3 - y())) < this.f3321gv;
    }

    public v(float f3) {
        this.y = Math.sqrt(1500.0d);
        this.n3 = 0.5d;
        this.zn = false;
        this.f3319c5 = Double.MAX_VALUE;
        this.f3322i9 = new n3.xc();
        this.f3319c5 = f3;
    }
}
