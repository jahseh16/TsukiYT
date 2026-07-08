package hw;

import android.text.SpannableStringBuilder;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5357a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final y f5358fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final x4 f5359gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f5360s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f5361v;
    public final int n3;
    public final boolean y;
    public final x4 zn;

    public static class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f5362a = new byte[1792];

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f5363gv;
        public final boolean n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public char f5364v;
        public final CharSequence y;
        public final int zn;

        static {
            for (int i = 0; i < 1792; i++) {
                f5362a[i] = Character.getDirectionality(i);
            }
        }

        public n3(CharSequence charSequence, boolean z) {
            this.y = charSequence;
            this.n3 = z;
            this.zn = charSequence.length();
        }

        public static byte zn(char c) {
            return c < 1792 ? f5362a[c] : Character.getDirectionality(c);
        }

        public final byte a() {
            char cCharAt;
            int i = this.f5363gv;
            do {
                int i5 = this.f5363gv;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.y;
                int i8 = i5 - 1;
                this.f5363gv = i8;
                cCharAt = charSequence.charAt(i8);
                this.f5364v = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f5363gv = i;
            this.f5364v = ';';
            return (byte) 13;
        }

        public final byte c5() {
            char cCharAt;
            int i = this.f5363gv;
            while (true) {
                int i5 = this.f5363gv;
                if (i5 >= this.zn) {
                    this.f5363gv = i;
                    this.f5364v = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.y;
                this.f5363gv = i5 + 1;
                char cCharAt2 = charSequence.charAt(i5);
                this.f5364v = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i8 = this.f5363gv;
                        if (i8 < this.zn) {
                            CharSequence charSequence2 = this.y;
                            this.f5363gv = i8 + 1;
                            cCharAt = charSequence2.charAt(i8);
                            this.f5364v = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        public final byte fb() {
            char cCharAt;
            do {
                int i = this.f5363gv;
                if (i >= this.zn) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.y;
                this.f5363gv = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f5364v = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public int gv() {
            this.f5363gv = 0;
            int i = 0;
            int i5 = 0;
            int i8 = 0;
            while (this.f5363gv < this.zn && i == 0) {
                byte bN3 = n3();
                if (bN3 != 0) {
                    if (bN3 == 1 || bN3 == 2) {
                        if (i8 == 0) {
                            return 1;
                        }
                    } else if (bN3 != 9) {
                        switch (bN3) {
                            case 14:
                            case 15:
                                i8++;
                                i5 = -1;
                                continue;
                            case 16:
                            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                                i8++;
                                i5 = 1;
                                continue;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                i8--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i8 == 0) {
                    return -1;
                }
                i = i8;
            }
            if (i == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f5363gv > 0) {
                switch (y()) {
                    case 14:
                    case 15:
                        if (i == i8) {
                            return -1;
                        }
                        break;
                    case 16:
                    case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                        if (i == i8) {
                            return 1;
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        i8++;
                        continue;
                }
                i8--;
            }
            return 0;
        }

        public byte n3() {
            char cCharAt = this.y.charAt(this.f5363gv);
            this.f5364v = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.y, this.f5363gv);
                this.f5363gv += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f5363gv++;
            byte bZn = zn(this.f5364v);
            if (!this.n3) {
                return bZn;
            }
            char c = this.f5364v;
            return c == '<' ? c5() : c == '&' ? fb() : bZn;
        }

        public final byte s() {
            char cCharAt;
            int i = this.f5363gv;
            while (true) {
                int i5 = this.f5363gv;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.y;
                int i8 = i5 - 1;
                this.f5363gv = i8;
                char cCharAt2 = charSequence.charAt(i8);
                this.f5364v = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i10 = this.f5363gv;
                        if (i10 > 0) {
                            CharSequence charSequence2 = this.y;
                            int i11 = i10 - 1;
                            this.f5363gv = i11;
                            cCharAt = charSequence2.charAt(i11);
                            this.f5364v = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f5363gv = i;
            this.f5364v = '>';
            return (byte) 13;
        }

        public int v() {
            this.f5363gv = this.zn;
            int i = 0;
            int i5 = 0;
            while (this.f5363gv > 0) {
                byte bY = y();
                if (bY == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i5 == 0) {
                        i5 = i;
                    }
                } else if (bY == 1 || bY == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i5 == 0) {
                        i5 = i;
                    }
                } else if (bY != 9) {
                    switch (bY) {
                        case 14:
                        case 15:
                            if (i5 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                            if (i5 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            i++;
                            break;
                        default:
                            if (i5 == 0) {
                                i5 = i;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }

        public byte y() {
            char cCharAt = this.y.charAt(this.f5363gv - 1);
            this.f5364v = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.y, this.f5363gv);
                this.f5363gv -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f5363gv--;
            byte bZn = zn(this.f5364v);
            if (!this.n3) {
                return bZn;
            }
            char c = this.f5364v;
            return c == '>' ? s() : c == ';' ? a() : bZn;
        }
    }

    /* JADX INFO: renamed from: hw.y$y, reason: collision with other inner class name */
    public static final class C0100y {
        public int n3;
        public boolean y;
        public x4 zn;

        public C0100y() {
            zn(y.v(Locale.getDefault()));
        }

        public static y n3(boolean z) {
            return z ? y.f5360s : y.f5358fb;
        }

        public y y() {
            return (this.n3 == 2 && this.zn == y.f5359gv) ? n3(this.y) : new y(this.y, this.n3, this.zn);
        }

        public final void zn(boolean z) {
            this.y = z;
            this.zn = y.f5359gv;
            this.n3 = 2;
        }
    }

    static {
        x4 x4Var = i4.zn;
        f5359gv = x4Var;
        f5361v = Character.toString((char) 8206);
        f5357a = Character.toString((char) 8207);
        f5358fb = new y(false, 2, x4Var);
        f5360s = new y(true, 2, x4Var);
    }

    public y(boolean z, int i, x4 x4Var) {
        this.y = z;
        this.n3 = i;
        this.zn = x4Var;
    }

    public static int n3(CharSequence charSequence) {
        return new n3(charSequence, false).v();
    }

    public static boolean v(Locale locale) {
        return f3.y(locale) == 1;
    }

    public static int y(CharSequence charSequence) {
        return new n3(charSequence, false).gv();
    }

    public static y zn() {
        return new C0100y().y();
    }

    public final String a(CharSequence charSequence, x4 x4Var) {
        boolean zY = x4Var.y(charSequence, 0, charSequence.length());
        return (this.y || !(zY || n3(charSequence) == 1)) ? this.y ? (!zY || n3(charSequence) == -1) ? f5357a : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : f5361v;
    }

    public CharSequence c5(CharSequence charSequence, x4 x4Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zY = x4Var.y(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (gv() && z) {
            spannableStringBuilder.append((CharSequence) fb(charSequence, zY ? i4.n3 : i4.y));
        }
        if (zY != this.y) {
            spannableStringBuilder.append(zY ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) a(charSequence, zY ? i4.n3 : i4.y));
        }
        return spannableStringBuilder;
    }

    public String f(String str, x4 x4Var, boolean z) {
        if (str == null) {
            return null;
        }
        return c5(str, x4Var, z).toString();
    }

    public final String fb(CharSequence charSequence, x4 x4Var) {
        boolean zY = x4Var.y(charSequence, 0, charSequence.length());
        return (this.y || !(zY || y(charSequence) == 1)) ? this.y ? (!zY || y(charSequence) == -1) ? f5357a : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : f5361v;
    }

    public boolean gv() {
        return (this.n3 & 2) != 0;
    }

    public String i9(String str) {
        return f(str, this.zn, true);
    }

    public CharSequence s(CharSequence charSequence) {
        return c5(charSequence, this.zn, true);
    }
}
