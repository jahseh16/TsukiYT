package r0;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r0.tl;
import r0.x4;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class r implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public tl f7534a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public tl f7535c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public tl f7536f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public tl f7537fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public tl f7538gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public tl f7539i9;
    public final List<o> n3 = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public tl f7540s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public tl f7541v;
    public final Context y;
    public final tl zn;

    public static final class y implements tl.y {
        public final tl.y n3;
        public final Context y;

        @Nullable
        public o zn;

        public y(Context context) {
            this(context, new x4.n3());
        }

        @Override // r0.tl.y
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public r y() {
            r rVar = new r(this.y, this.n3.y());
            o oVar = this.zn;
            if (oVar != null) {
                rVar.co(oVar);
            }
            return rVar;
        }

        public y zn(@Nullable o oVar) {
            this.zn = oVar;
            return this;
        }

        public y(Context context, tl.y yVar) {
            this.y = context.getApplicationContext();
            this.n3 = yVar;
        }
    }

    public r(Context context, tl tlVar) {
        this.y = context.getApplicationContext();
        this.zn = (tl) v0.y.v(tlVar);
    }

    public final void a(tl tlVar) {
        for (int i = 0; i < this.n3.size(); i++) {
            tlVar.co(this.n3.get(i));
        }
    }

    public final void c(@Nullable tl tlVar, o oVar) {
        if (tlVar != null) {
            tlVar.co(oVar);
        }
    }

    public final tl c5() {
        if (this.f7541v == null) {
            zn znVar = new zn(this.y);
            this.f7541v = znVar;
            a(znVar);
        }
        return this.f7541v;
    }

    @Override // r0.tl
    public void close() throws IOException {
        tl tlVar = this.f7536f;
        if (tlVar != null) {
            try {
                tlVar.close();
            } finally {
                this.f7536f = null;
            }
        }
    }

    @Override // r0.tl
    public void co(o oVar) {
        v0.y.v(oVar);
        this.zn.co(oVar);
        this.n3.add(oVar);
        c(this.f7538gv, oVar);
        c(this.f7541v, oVar);
        c(this.f7534a, oVar);
        c(this.f7537fb, oVar);
        c(this.f7540s, oVar);
        c(this.f7535c5, oVar);
        c(this.f7539i9, oVar);
    }

    public final tl f3() {
        if (this.f7537fb == null) {
            try {
                tl tlVar = (tl) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f7537fb = tlVar;
                a(tlVar);
            } catch (ClassNotFoundException unused) {
                v0.r.c5("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating RTMP extension", e4);
            }
            if (this.f7537fb == null) {
                this.f7537fb = this.zn;
            }
        }
        return this.f7537fb;
    }

    @Override // r0.tl
    public Map<String, List<String>> fb() {
        tl tlVar = this.f7536f;
        return tlVar == null ? Collections.emptyMap() : tlVar.fb();
    }

    public final tl i4() {
        if (this.f7539i9 == null) {
            x xVar = new x(this.y);
            this.f7539i9 = xVar;
            a(xVar);
        }
        return this.f7539i9;
    }

    public final tl n() {
        if (this.f7540s == null) {
            j jVar = new j();
            this.f7540s = jVar;
            a(jVar);
        }
        return this.f7540s;
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        tl tlVar = this.f7536f;
        if (tlVar == null) {
            return null;
        }
        return tlVar.n3();
    }

    public final tl p() {
        if (this.f7534a == null) {
            s sVar = new s(this.y);
            this.f7534a = sVar;
            a(sVar);
        }
        return this.f7534a;
    }

    public final tl r() {
        if (this.f7535c5 == null) {
            i9 i9Var = new i9();
            this.f7535c5 = i9Var;
            a(i9Var);
        }
        return this.f7535c5;
    }

    @Override // r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        return ((tl) v0.y.v(this.f7536f)).read(bArr, i, i5);
    }

    public final tl x4() {
        if (this.f7538gv == null) {
            c cVar = new c();
            this.f7538gv = cVar;
            a(cVar);
        }
        return this.f7538gv;
    }

    @Override // r0.tl
    public long y(p pVar) throws IOException {
        v0.y.fb(this.f7536f == null);
        String scheme = pVar.y.getScheme();
        if (ut.y4(pVar.y)) {
            String path = pVar.y.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f7536f = x4();
            } else {
                this.f7536f = c5();
            }
        } else if ("asset".equals(scheme)) {
            this.f7536f = c5();
        } else if ("content".equals(scheme)) {
            this.f7536f = p();
        } else if ("rtmp".equals(scheme)) {
            this.f7536f = f3();
        } else if ("udp".equals(scheme)) {
            this.f7536f = n();
        } else if ("data".equals(scheme)) {
            this.f7536f = r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f7536f = i4();
        } else {
            this.f7536f = this.zn;
        }
        return this.f7536f.y(pVar);
    }
}
