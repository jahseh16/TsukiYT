package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import de.gv;
import de.n3;
import de.v;
import de.zn;
import ft.a;
import ft.g;
import ft.k3;
import ft.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y extends a implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1664b;
    public final zn c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gv f1665d;
    public final v d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final boolean f1666ej;

    @Nullable
    public final Handler fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f1667hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public long f1668j5;
    public long o;

    @Nullable
    public Metadata qn;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public n3 f1669x;

    public y(v vVar, @Nullable Looper looper) {
        this(vVar, looper, zn.y);
    }

    @Override // ft.hk
    public boolean a() {
        return this.f1667hw;
    }

    @Override // ft.a
    public void b(g[] gVarArr, long j, long j4) {
        this.f1669x = this.c.zn(gVarArr[0]);
        Metadata metadata = this.qn;
        if (metadata != null) {
            this.qn = metadata.zn((metadata.f1575v + this.o) - j4);
        }
        this.o = j4;
    }

    @Override // ft.hk
    public void co(long j, long j4) {
        boolean zJ = true;
        while (zJ) {
            oz();
            zJ = j(j);
        }
    }

    @Override // ft.a
    public void d() {
        this.qn = null;
        this.f1669x = null;
        this.o = -9223372036854775807L;
    }

    @Override // ft.a
    public void ej(long j, boolean z) {
        this.qn = null;
        this.f1664b = false;
        this.f1667hw = false;
    }

    @Override // ft.hk, ft.ic
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        o((Metadata) message.obj);
        return true;
    }

    public final void hw(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.v(); i++) {
            g gVarP = metadata.gv(i).p();
            if (gVarP == null || !this.c.n3(gVarP)) {
                list.add(metadata.gv(i));
            } else {
                n3 n3VarZn = this.c.zn(gVarP);
                byte[] bArr = (byte[]) v0.y.v(metadata.gv(i).tg());
                this.f1665d.a();
                this.f1665d.mt(bArr.length);
                ((ByteBuffer) ut.i9(this.f1665d.f3179fb)).put(bArr);
                this.f1665d.co();
                Metadata metadataY = n3VarZn.y(this.f1665d);
                if (metadataY != null) {
                    hw(metadataY, list);
                }
            }
        }
    }

    @Override // ft.hk
    public boolean isReady() {
        return true;
    }

    public final boolean j(long j) {
        boolean z;
        Metadata metadata = this.qn;
        if (metadata == null || (!this.f1666ej && metadata.f1575v > j5(j))) {
            z = false;
        } else {
            qn(this.qn);
            this.qn = null;
            z = true;
        }
        if (this.f1664b && this.qn == null) {
            this.f1667hw = true;
        }
        return z;
    }

    public final long j5(long j) {
        v0.y.fb(j != -9223372036854775807L);
        v0.y.fb(this.o != -9223372036854775807L);
        return j - this.o;
    }

    @Override // ft.ic
    public int n3(g gVar) {
        if (this.c.n3(gVar)) {
            return k3.y(gVar.u == 0 ? 4 : 2);
        }
        return k3.y(0);
    }

    public final void o(Metadata metadata) {
        this.d0.onMetadata(metadata);
    }

    public final void oz() {
        if (this.f1664b || this.qn != null) {
            return;
        }
        this.f1665d.a();
        u0 u0VarD0 = d0();
        int iK5 = k5(u0VarD0, this.f1665d, 0);
        if (iK5 != -4) {
            if (iK5 == -5) {
                this.f1668j5 = ((g) v0.y.v(u0VarD0.n3)).fh;
            }
        } else {
            if (this.f1665d.t()) {
                this.f1664b = true;
                return;
            }
            gv gvVar = this.f1665d;
            gvVar.f3170co = this.f1668j5;
            gvVar.co();
            Metadata metadataY = ((n3) ut.i9(this.f1669x)).y(this.f1665d);
            if (metadataY != null) {
                ArrayList arrayList = new ArrayList(metadataY.v());
                hw(metadataY, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.qn = new Metadata(j5(this.f1665d.f3178f), arrayList);
            }
        }
    }

    public final void qn(Metadata metadata) {
        Handler handler = this.fh;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            o(metadata);
        }
    }

    public y(v vVar, @Nullable Looper looper, zn znVar) {
        this(vVar, looper, znVar, false);
    }

    public y(v vVar, @Nullable Looper looper, zn znVar, boolean z) {
        super(5);
        this.d0 = (v) v0.y.v(vVar);
        this.fh = looper == null ? null : ut.x4(looper, this);
        this.c = (zn) v0.y.v(znVar);
        this.f1666ej = z;
        this.f1665d = new gv();
        this.o = -9223372036854775807L;
    }
}
