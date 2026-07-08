package g4;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f5189gv;
        public final y n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f5190v;
        public final String y;
        public y zn;

        public static boolean gv(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof t ? !((t) obj).gv() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public final n3 n3(Object obj) {
            y().n3 = obj;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                r0 = 1
                boolean r1 = r8.f5189gv
                boolean r2 = r8.f5190v
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 32
                r3.<init>(r4)
                java.lang.String r4 = r8.y
                r3.append(r4)
                r4 = 123(0x7b, float:1.72E-43)
                r3.append(r4)
                g4.c5$n3$y r4 = r8.n3
                g4.c5$n3$y r4 = r4.zn
                java.lang.String r5 = ""
            L1c:
                if (r4 == 0) goto L62
                java.lang.Object r6 = r4.n3
                if (r6 != 0) goto L25
                if (r1 != 0) goto L5f
                goto L2d
            L25:
                if (r2 == 0) goto L2d
                boolean r7 = gv(r6)
                if (r7 != 0) goto L5f
            L2d:
                r3.append(r5)
                java.lang.String r5 = r4.y
                if (r5 == 0) goto L3c
                r3.append(r5)
                r5 = 61
                r3.append(r5)
            L3c:
                if (r6 == 0) goto L5a
                java.lang.Class r5 = r6.getClass()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L5a
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
                r5[r7] = r6
                java.lang.String r5 = java.util.Arrays.deepToString(r5)
                int r6 = r5.length()
                int r6 = r6 - r0
                r3.append(r5, r0, r6)
                goto L5d
            L5a:
                r3.append(r6)
            L5d:
                java.lang.String r5 = ", "
            L5f:
                g4.c5$n3$y r4 = r4.zn
                goto L1c
            L62:
                r0 = 125(0x7d, float:1.75E-43)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g4.c5.n3.toString():java.lang.String");
        }

        public final y y() {
            y yVar = new y((y) null);
            this.zn.zn = yVar;
            this.zn = yVar;
            return yVar;
        }

        public n3 zn(Object obj) {
            return n3(obj);
        }

        public n3(String str) {
            y yVar = new y((y) null);
            this.n3 = yVar;
            this.zn = yVar;
            this.f5189gv = false;
            this.f5190v = false;
            this.y = (String) xc.t(str);
        }
    }

    public static n3 n3(Object obj) {
        return new n3(obj.getClass().getSimpleName());
    }

    public static <T> T y(T t3, T t5) {
        if (t3 != null) {
            return t3;
        }
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
