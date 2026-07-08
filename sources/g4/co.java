package g4;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class co {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f5191gv;
    public final boolean n3;
    public final gv y;
    public final zn zn;

    public static abstract class n3 extends g4.n3<String> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5192f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final CharSequence f5193fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final gv f5194s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5195t = 0;
        public int w;

        public n3(co coVar, CharSequence charSequence) {
            this.f5194s = coVar.y;
            this.f5192f = coVar.n3;
            this.w = coVar.f5191gv;
            this.f5193fb = charSequence;
        }

        public abstract int a(int i);

        @Override // g4.n3
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public String y() {
            int iA;
            int i = this.f5195t;
            while (true) {
                int i5 = this.f5195t;
                if (i5 == -1) {
                    return n3();
                }
                iA = a(i5);
                if (iA == -1) {
                    iA = this.f5193fb.length();
                    this.f5195t = -1;
                } else {
                    this.f5195t = v(iA);
                }
                int i8 = this.f5195t;
                if (i8 == i) {
                    int i10 = i8 + 1;
                    this.f5195t = i10;
                    if (i10 > this.f5193fb.length()) {
                        this.f5195t = -1;
                    }
                } else {
                    while (i < iA && this.f5194s.v(this.f5193fb.charAt(i))) {
                        i++;
                    }
                    while (iA > i && this.f5194s.v(this.f5193fb.charAt(iA - 1))) {
                        iA--;
                    }
                    if (!this.f5192f || i != iA) {
                        break;
                    }
                    i = this.f5195t;
                }
            }
            int i11 = this.w;
            if (i11 == 1) {
                iA = this.f5193fb.length();
                this.f5195t = -1;
                while (iA > i && this.f5194s.v(this.f5193fb.charAt(iA - 1))) {
                    iA--;
                }
            } else {
                this.w = i11 - 1;
            }
            return this.f5193fb.subSequence(i, iA).toString();
        }

        public abstract int v(int i);
    }

    public class y implements zn {
        public final /* synthetic */ gv y;

        /* JADX INFO: renamed from: g4.co$y$y, reason: collision with other inner class name */
        public class C0094y extends n3 {
            public C0094y(co coVar, CharSequence charSequence) {
                super(coVar, charSequence);
            }

            @Override // g4.co.n3
            public int a(int i) {
                return y.this.y.zn(this.f5193fb, i);
            }

            @Override // g4.co.n3
            public int v(int i) {
                return i + 1;
            }
        }

        public y(gv gvVar) {
            this.y = gvVar;
        }

        @Override // g4.co.zn
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public n3 y(co coVar, CharSequence charSequence) {
            return new C0094y(coVar, charSequence);
        }
    }

    public interface zn {
        Iterator<String> y(co coVar, CharSequence charSequence);
    }

    public co(zn znVar) {
        this(znVar, false, gv.a(), Reader.READ_DONE);
    }

    public static co gv(char c) {
        return v(gv.gv(c));
    }

    public static co v(gv gvVar) {
        xc.t(gvVar);
        return new co(new y(gvVar));
    }

    public List<String> a(CharSequence charSequence) {
        xc.t(charSequence);
        Iterator<String> itFb = fb(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itFb.hasNext()) {
            arrayList.add(itFb.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> fb(CharSequence charSequence) {
        return this.zn.y(this, charSequence);
    }

    public co(zn znVar, boolean z, gv gvVar, int i) {
        this.zn = znVar;
        this.n3 = z;
        this.y = gvVar;
        this.f5191gv = i;
    }
}
