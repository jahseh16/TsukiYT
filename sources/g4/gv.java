package g4;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv implements w<Character> {

    /* JADX INFO: renamed from: g4.gv$gv, reason: collision with other inner class name */
    public static final class C0095gv extends zn {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final C0095gv f5197v = new C0095gv();

        public C0095gv() {
            super("CharMatcher.none()");
        }

        @Override // g4.gv
        public boolean v(char c) {
            return false;
        }

        @Override // g4.gv
        public int zn(CharSequence charSequence, int i) {
            xc.wz(i, charSequence.length());
            return -1;
        }
    }

    public static final class n3 extends y {
        public final char y;

        public n3(char c) {
            this.y = c;
        }

        public String toString() {
            String strFb = gv.fb(this.y);
            StringBuilder sb = new StringBuilder(String.valueOf(strFb).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strFb);
            sb.append("')");
            return sb.toString();
        }

        @Override // g4.gv
        public boolean v(char c) {
            return c == this.y;
        }
    }

    public static abstract class y extends gv {
        @Override // g4.w
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.n3(ch);
        }
    }

    public static abstract class zn extends y {
        public final String y;

        public zn(String str) {
            this.y = (String) xc.t(str);
        }

        public final String toString() {
            return this.y;
        }
    }

    public static gv a() {
        return C0095gv.f5197v;
    }

    public static String fb(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static gv gv(char c) {
        return new n3(c);
    }

    @Deprecated
    public boolean n3(Character ch) {
        return v(ch.charValue());
    }

    public abstract boolean v(char c);

    public int zn(CharSequence charSequence, int i) {
        int length = charSequence.length();
        xc.wz(i, length);
        while (i < length) {
            if (v(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
