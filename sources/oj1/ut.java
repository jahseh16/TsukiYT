package oj1;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ut extends y {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f7170v;

    public ut(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7170v = source;
    }

    @Override // oj1.y
    public boolean a() {
        int i = this.y;
        if (i == -1) {
            return false;
        }
        while (i < rz().length()) {
            char cCharAt = rz().charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.y = i;
                return mg(cCharAt);
            }
            i++;
        }
        this.y = i;
        return false;
    }

    @Override // oj1.y
    public boolean b() {
        int iUd = ud();
        if (iUd == rz().length() || iUd == -1 || rz().charAt(iUd) != ',') {
            return false;
        }
        this.y++;
        return true;
    }

    @Override // oj1.y
    public String f() {
        xc('\"');
        int i = this.y;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) rz(), '\"', i, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            c((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i5 = i; i5 < iIndexOf$default; i5++) {
            if (rz().charAt(i5) == '\\') {
                return mt(rz(), this.y, i5);
            }
        }
        this.y = iIndexOf$default + 1;
        String strSubstring = rz().substring(i, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // oj1.y
    /* JADX INFO: renamed from: hw, reason: merged with bridge method [inline-methods] */
    public String rz() {
        return this.f7170v;
    }

    @Override // oj1.y
    public String t(String keyToMatch, boolean z) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.y;
        try {
            if (tl() != 6) {
                this.y = i;
                return null;
            }
            if (!Intrinsics.areEqual(z ? f() : z(), keyToMatch)) {
                this.y = i;
                return null;
            }
            if (tl() != 5) {
                this.y = i;
                return null;
            }
            String strP = z ? p() : z();
            this.y = i;
            return strP;
        } catch (Throwable th) {
            this.y = i;
            throw th;
        }
    }

    @Override // oj1.y
    public byte tl() {
        byte bY;
        String strRz = rz();
        do {
            int i = this.y;
            if (i == -1 || i >= strRz.length()) {
                return (byte) 10;
            }
            int i5 = this.y;
            this.y = i5 + 1;
            bY = n3.y(strRz.charAt(i5));
        } while (bY == 3);
        return bY;
    }

    @Override // oj1.y
    public int ud() {
        char cCharAt;
        int i = this.y;
        if (i == -1) {
            return i;
        }
        while (i < rz().length() && ((cCharAt = rz().charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.y = i;
        return i;
    }

    @Override // oj1.y
    public void xc(char c) {
        if (this.y == -1) {
            yt(c);
        }
        String strRz = rz();
        while (this.y < strRz.length()) {
            int i = this.y;
            this.y = i + 1;
            char cCharAt = strRz.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c) {
                    return;
                } else {
                    yt(c);
                }
            }
        }
        yt(c);
    }

    @Override // oj1.y
    public int z6(int i) {
        if (i < rz().length()) {
            return i;
        }
        return -1;
    }
}
