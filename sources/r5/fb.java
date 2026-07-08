package r5;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class fb {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static boolean f7664fb = true;
    public d y = null;
    public String n3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
    public String zn = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public float f7666gv = 96.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n3$mt f7667v = new n3$mt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, b> f7665a = new HashMap();

    public interface a8 {
        void f(yt ytVar) throws i9;

        List<yt> n3();
    }

    public static abstract class b extends yt {
        public String zn = null;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public Boolean f7670gv = null;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ta f7671v = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ta f7668a = null;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public List<String> f7669fb = null;

        public String toString() {
            return wz();
        }
    }

    public static class d extends qn {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public w f7672co;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public w f7673mt;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public w f7674p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f7675r;
        public w z;

        @Override // r5.fb.yt
        public String wz() {
            return "svg";
        }
    }

    public static abstract class ej extends x implements a8, z6 {

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public List<yt> f7676c5 = new ArrayList();

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public Set<String> f7678i9 = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f7677f = null;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Set<String> f7679t = null;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public Set<String> f7680tl = null;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public Set<String> f7681wz = null;

        @Override // r5.fb.z6
        public void a(Set<String> set) {
            this.f7678i9 = set;
        }

        @Override // r5.fb.z6
        public void c5(String str) {
            this.f7677f = str;
        }

        @Override // r5.fb.a8
        public void f(yt ytVar) throws i9 {
            this.f7676c5.add(ytVar);
        }

        @Override // r5.fb.z6
        public void fb(Set<String> set) {
            this.f7679t = set;
        }

        @Override // r5.fb.z6
        public Set<String> getRequiredFeatures() {
            return this.f7678i9;
        }

        @Override // r5.fb.z6
        public void gv(Set<String> set) {
            this.f7681wz = set;
        }

        @Override // r5.fb.a8
        public List<yt> n3() {
            return this.f7676c5;
        }

        @Override // r5.fb.z6
        public void s(Set<String> set) {
            this.f7680tl = set;
        }

        @Override // r5.fb.z6
        public Set<String> t() {
            return this.f7680tl;
        }

        @Override // r5.fb.z6
        public Set<String> tl() {
            return this.f7681wz;
        }

        @Override // r5.fb.z6
        public Set<String> y() {
            return null;
        }

        @Override // r5.fb.z6
        public String zn() {
            return this.f7677f;
        }
    }

    public static abstract class hw extends ej {

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public v f7682xc = null;
    }

    public static abstract class qn extends hw {
        public n3 w;
    }

    public static class ta implements Cloneable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s f7684b;
        public a c;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public gv f7685co;
        public Float ct;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f7686d;
        public List<String> d0;
        public vl dm;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public n3 f7687ej;
        public String en;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public vl f7688f;
        public w f3;
        public Float f7;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public y f7689fb;
        public w fh;

        /* JADX INFO: renamed from: hw, reason: collision with root package name */
        public a f7690hw;
        public String j;

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        public Boolean f7691j5;
        public y jz;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public vl f7692k;
        public Float n;
        public String o;
        public c5 o4;
        public String oz;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public zn f7693p;
        public Boolean q9;
        public zn qn;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public w[] f7694r;
        public v rs;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Float f7695s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Float f7696t;
        public String u;

        /* JADX INFO: renamed from: ut, reason: collision with root package name */
        public Boolean f7697ut;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public vl f7698v;
        public w w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public fb f7699x;
        public Float xg;
        public long y = 0;
        public vl y5;
        public Float z;

        public static ta n3() {
            ta taVar = new ta();
            taVar.y = -1L;
            a aVar = a.v;
            taVar.f7698v = aVar;
            y yVar = y.y;
            taVar.f7689fb = yVar;
            Float fValueOf = Float.valueOf(1.0f);
            taVar.f7695s = fValueOf;
            taVar.f7688f = null;
            taVar.f7696t = fValueOf;
            taVar.w = new w(1.0f);
            taVar.f7693p = zn.y;
            taVar.f7685co = gv.y;
            taVar.z = Float.valueOf(4.0f);
            taVar.f7694r = null;
            taVar.f3 = new w(0.0f);
            taVar.n = fValueOf;
            taVar.c = aVar;
            taVar.d0 = null;
            taVar.fh = new w(12.0f, xg.pt);
            taVar.f7686d = 400;
            taVar.f7687ej = n3.y;
            taVar.f7699x = fb.y;
            taVar.f7684b = s.y;
            taVar.f7690hw = a.y;
            Boolean bool = Boolean.TRUE;
            taVar.f7691j5 = bool;
            taVar.qn = null;
            taVar.o = null;
            taVar.j = null;
            taVar.oz = null;
            taVar.f7697ut = bool;
            taVar.q9 = bool;
            taVar.f7692k = aVar;
            taVar.f7 = fValueOf;
            taVar.en = null;
            taVar.jz = yVar;
            taVar.u = null;
            taVar.y5 = null;
            taVar.xg = fValueOf;
            taVar.dm = null;
            taVar.ct = fValueOf;
            taVar.o4 = c5.y;
            taVar.rs = v.y;
            return taVar;
        }

        public Object clone() throws CloneNotSupportedException {
            ta taVar = (ta) super.clone();
            w[] wVarArr = this.f7694r;
            if (wVarArr != null) {
                taVar.f7694r = (w[]) wVarArr.clone();
            }
            return taVar;
        }

        public void zn(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.f7697ut = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.f7691j5 = bool;
            this.qn = null;
            this.en = null;
            this.n = Float.valueOf(1.0f);
            this.f7692k = a.v;
            this.f7 = Float.valueOf(1.0f);
            this.u = null;
            this.y5 = null;
            this.xg = Float.valueOf(1.0f);
            this.dm = null;
            this.ct = Float.valueOf(1.0f);
            this.o4 = c5.y;
        }
    }

    public static abstract class x extends b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public n3 f7701s = null;
    }

    public enum xg {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static class yt {
        public a8 n3;
        public fb y;

        public String wz() {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
    }

    public interface z6 {
        void a(Set<String> set);

        void c5(String str);

        void fb(Set<String> set);

        Set<String> getRequiredFeatures();

        void gv(Set<String> set);

        void s(Set<String> set);

        Set<String> t();

        Set<String> tl();

        Set<String> y();

        String zn();
    }

    public static c5 fb() {
        return null;
    }

    public static fb s(InputStream inputStream) throws i9 {
        return new f().c(inputStream, f7664fb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b a(a8 a8Var, String str) {
        b bVarA;
        b bVar = (b) a8Var;
        if (str.equals(bVar.zn)) {
            return bVar;
        }
        for (Object obj : a8Var.n3()) {
            if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (str.equals(bVar2.zn)) {
                    return bVar2;
                }
                if ((obj instanceof a8) && (bVarA = a((a8) obj, str)) != null) {
                    return bVarA;
                }
            }
        }
        return null;
    }

    public d c5() {
        return this.y;
    }

    public Picture f() {
        return tl(null);
    }

    public List<n3$w> gv() {
        return this.f7667v.zn();
    }

    public boolean i9() {
        return !this.f7667v.gv();
    }

    public void n3() {
        this.f7667v.v(n3$r.RenderOptions);
    }

    public void p(String str) {
        this.n3 = str;
    }

    public Picture t(int i, int i5, a aVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i5);
        if (aVar == null || aVar.f7655a == null) {
            aVar = aVar == null ? new a() : new a(aVar);
            aVar.fb(0.0f, 0.0f, i, i5);
        }
        new s(canvasBeginRecording, this.f7666gv).ad(this, aVar);
        picture.endRecording();
        return picture;
    }

    public Picture tl(a aVar) {
        w wVar;
        n3 n3Var = (aVar == null || !aVar.v()) ? this.y.w : aVar.f7656gv;
        if (aVar != null && aVar.a()) {
            return t((int) Math.ceil(aVar.f7655a.n3()), (int) Math.ceil(aVar.f7655a.zn()), aVar);
        }
        d dVar = this.y;
        w wVar2 = dVar.f7672co;
        if (wVar2 != null) {
            xg xgVar = wVar2.f7700v;
            xg xgVar2 = xg.percent;
            if (xgVar != xgVar2 && (wVar = dVar.z) != null && wVar.f7700v != xgVar2) {
                return t((int) Math.ceil(wVar2.zn(this.f7666gv)), (int) Math.ceil(this.y.z.zn(this.f7666gv)), aVar);
            }
        }
        if (wVar2 != null && n3Var != null) {
            return t((int) Math.ceil(wVar2.zn(this.f7666gv)), (int) Math.ceil((n3Var.f7683gv * r1) / n3Var.zn), aVar);
        }
        w wVar3 = dVar.z;
        if (wVar3 == null || n3Var == null) {
            return t(NotificationCompat.FLAG_GROUP_SUMMARY, NotificationCompat.FLAG_GROUP_SUMMARY, aVar);
        }
        return t((int) Math.ceil((n3Var.zn * r1) / n3Var.f7683gv), (int) Math.ceil(wVar3.zn(this.f7666gv)), aVar);
    }

    public b v(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.y.zn)) {
            return this.y;
        }
        if (this.f7665a.containsKey(str)) {
            return this.f7665a.get(str);
        }
        b bVarA = a(this.y, str);
        this.f7665a.put(str, bVarA);
        return bVarA;
    }

    public void w(d dVar) {
        this.y = dVar;
    }

    public yt wz(String str) {
        if (str == null) {
            return null;
        }
        String strZn = zn(str);
        if (strZn.length() <= 1 || !strZn.startsWith("#")) {
            return null;
        }
        return v(strZn.substring(1));
    }

    public void xc(String str) {
        this.zn = str;
    }

    public void y(n3$mt n3_mt) {
        this.f7667v.n3(n3_mt);
    }

    public final String zn(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING).replace("\\A", "\n");
    }

    public static class w implements Cloneable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public xg f7700v;
        public float y;

        public w(float f3, xg xgVar) {
            this.y = f3;
            this.f7700v = xgVar;
        }

        public boolean c5() {
            return this.y < 0.0f;
        }

        public float fb(s sVar) {
            switch (y.y[this.f7700v.ordinal()]) {
                case 9:
                    n3 n3VarO = sVar.o();
                    if (n3VarO != null) {
                    }
                    break;
            }
            return this.y;
        }

        public float gv(s sVar) {
            if (this.f7700v != xg.percent) {
                return fb(sVar);
            }
            n3 n3VarO = sVar.o();
            if (n3VarO == null) {
                return this.y;
            }
            float f3 = n3VarO.zn;
            if (f3 == n3VarO.f7683gv) {
                return (this.y * f3) / 100.0f;
            }
            return (this.y * ((float) (Math.sqrt((f3 * f3) + (r7 * r7)) / 1.414213562373095d))) / 100.0f;
        }

        public boolean i9() {
            return this.y == 0.0f;
        }

        public float n3() {
            return this.y;
        }

        public float s(s sVar) {
            if (this.f7700v != xg.percent) {
                return fb(sVar);
            }
            n3 n3VarO = sVar.o();
            return n3VarO == null ? this.y : (this.y * n3VarO.f7683gv) / 100.0f;
        }

        public String toString() {
            return String.valueOf(this.y) + this.f7700v;
        }

        public float v(s sVar, float f3) {
            return this.f7700v == xg.percent ? (this.y * f3) / 100.0f : fb(sVar);
        }

        public float zn(float f3) {
            int i = y.y[this.f7700v.ordinal()];
            if (i == 1) {
                return this.y;
            }
            switch (i) {
                case 4:
                    return this.y * f3;
                case 5:
                    return (this.y * f3) / 2.54f;
                case 6:
                    return (this.y * f3) / 25.4f;
                case 7:
                    return (this.y * f3) / 72.0f;
                case 8:
                    return (this.y * f3) / 6.0f;
                default:
                    return this.y;
            }
        }

        public w(float f3) {
            this.y = f3;
            this.f7700v = xg.px;
        }
    }

    public static class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public float f7683gv;
        public float n3;
        public float y;
        public float zn;

        public n3(float f3, float f4, float f5, float f7) {
            this.y = f3;
            this.n3 = f4;
            this.zn = f5;
            this.f7683gv = f7;
        }

        public static n3 y(float f3, float f4, float f5, float f7) {
            return new n3(f3, f4, f5 - f3, f7 - f4);
        }

        public void gv(n3 n3Var) {
            float f3 = n3Var.y;
            if (f3 < this.y) {
                this.y = f3;
            }
            float f4 = n3Var.n3;
            if (f4 < this.n3) {
                this.n3 = f4;
            }
            if (n3Var.n3() > n3()) {
                this.zn = n3Var.n3() - this.y;
            }
            if (n3Var.zn() > zn()) {
                this.f7683gv = n3Var.zn() - this.n3;
            }
        }

        public float n3() {
            return this.y + this.zn;
        }

        public String toString() {
            return "[" + this.y + " " + this.n3 + " " + this.zn + " " + this.f7683gv + "]";
        }

        public float zn() {
            return this.n3 + this.f7683gv;
        }

        public n3(n3 n3Var) {
            this.y = n3Var.y;
            this.n3 = n3Var.n3;
            this.zn = n3Var.zn;
            this.f7683gv = n3Var.f7683gv;
        }
    }
}
