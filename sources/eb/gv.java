package eb;

import eb.n3;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends n3<gv> {
    public v d0;
    public float fh;
    public boolean rz;

    public <K> gv(K k3, zn<K> znVar) {
        super(k3, znVar);
        this.d0 = null;
        this.fh = Float.MAX_VALUE;
        this.rz = false;
    }

    @Override // eb.n3
    public void i9() {
        xc();
        this.d0.fb(v());
        super.i9();
    }

    @Override // eb.n3
    public boolean t(long j) {
        if (this.rz) {
            float f3 = this.fh;
            if (f3 != Float.MAX_VALUE) {
                this.d0.v(f3);
                this.fh = Float.MAX_VALUE;
            }
            this.n3 = this.d0.y();
            this.y = 0.0f;
            this.rz = false;
            return true;
        }
        if (this.fh != Float.MAX_VALUE) {
            this.d0.y();
            long j4 = j / 2;
            n3.xc xcVarS = this.d0.s(this.n3, this.y, j4);
            this.d0.v(this.fh);
            this.fh = Float.MAX_VALUE;
            n3.xc xcVarS2 = this.d0.s(xcVarS.y, xcVarS.n3, j4);
            this.n3 = xcVarS2.y;
            this.y = xcVarS2.n3;
        } else {
            n3.xc xcVarS3 = this.d0.s(this.n3, this.y, j);
            this.n3 = xcVarS3.y;
            this.y = xcVarS3.n3;
        }
        float fMax = Math.max(this.n3, this.f3315s);
        this.n3 = fMax;
        float fMin = Math.min(fMax, this.f3312fb);
        this.n3 = fMin;
        if (!wz(fMin, this.y)) {
            return false;
        }
        this.n3 = this.d0.y();
        this.y = 0.0f;
        return true;
    }

    public void tl(float f3) {
        if (a()) {
            this.fh = f3;
            return;
        }
        if (this.d0 == null) {
            this.d0 = new v(f3);
        }
        this.d0.v(f3);
        i9();
    }

    public gv w(v vVar) {
        this.d0 = vVar;
        return this;
    }

    public boolean wz(float f3, float f4) {
        return this.d0.zn(f3, f4);
    }

    public final void xc() {
        v vVar = this.d0;
        if (vVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dY = vVar.y();
        if (dY > this.f3312fb) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dY < this.f3315s) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }
}
