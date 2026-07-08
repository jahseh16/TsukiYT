package oj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public int y;
    public String zn;
    public final mg n3 = new mg();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public StringBuilder f7174gv = new StringBuilder();

    public static /* synthetic */ Void n(y yVar, String str, int i, String str2, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i5 & 2) != 0) {
            i = yVar.y;
        }
        if ((i5 & 4) != 0) {
            str2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        return yVar.f3(str, i, str2);
    }

    public abstract boolean a();

    public String a8(int i, int i5) {
        return rz().subSequence(i, i5).toString();
    }

    public abstract boolean b();

    public final Void c(byte b4) {
        n(this, "Expected " + (b4 == 1 ? "quotation mark '\"'" : b4 == 4 ? "comma ','" : b4 == 5 ? "colon ':'" : b4 == 6 ? "start of the object '{'" : b4 == 7 ? "end of the object '}'" : b4 == 8 ? "start of the array '['" : b4 == 9 ? "end of the array ']'" : "valid token") + ", but had '" + ((this.y == rz().length() || this.y <= 0) ? "EOF" : String.valueOf(rz().charAt(this.y - 1))) + "' instead", this.y - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final boolean c5() {
        boolean z;
        int iUd = ud();
        if (iUd == rz().length()) {
            n(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (rz().charAt(iUd) == '\"') {
            iUd++;
            z = true;
        } else {
            z = false;
        }
        boolean zS = s(iUd);
        if (z) {
            if (this.y == rz().length()) {
                n(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (rz().charAt(this.y) != '\"') {
                n(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.y++;
        }
        return zS;
    }

    public final String co() {
        if (this.zn != null) {
            return x();
        }
        int iUd = ud();
        if (iUd >= rz().length() || iUd == -1) {
            n(this, "EOF", iUd, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bY = n3.y(rz().charAt(iUd));
        if (bY == 1) {
            return p();
        }
        if (bY != 0) {
            n(this, "Expected beginning of the string, but got " + rz().charAt(iUd), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z = false;
        while (n3.y(rz().charAt(iUd)) == 0) {
            iUd++;
            if (iUd >= rz().length()) {
                v(this.y, iUd);
                int iZ6 = z6(iUd);
                if (iZ6 == -1) {
                    this.y = iUd;
                    return r(0, 0);
                }
                iUd = iZ6;
                z = true;
            }
        }
        String strA8 = !z ? a8(this.y, iUd) : r(this.y, iUd);
        this.y = iUd;
        return strA8;
    }

    public final String d(boolean z) {
        String strP;
        byte bTa = ta();
        if (z) {
            if (bTa != 1 && bTa != 0) {
                return null;
            }
            strP = co();
        } else {
            if (bTa != 1) {
                return null;
            }
            strP = p();
        }
        this.zn = strP;
        return strP;
    }

    public final void d0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f3("Encountered an unknown key '" + key + '\'', StringsKt.lastIndexOf$default((CharSequence) a8(0, this.y), key, 0, false, 6, (Object) null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    public final void ej(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte bTa = ta();
        if (bTa != 8 && bTa != 6) {
            co();
            return;
        }
        while (true) {
            byte bTa2 = ta();
            if (bTa2 != 1) {
                if (bTa2 == 8 || bTa2 == 6) {
                    arrayList.add(Byte.valueOf(bTa2));
                } else if (bTa2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw fh.a(this.y, "found ] instead of } at path: " + this.n3, rz());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bTa2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw fh.a(this.y, "found } instead of ] at path: " + this.n3, rz());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bTa2 == 10) {
                    n(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                tl();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                co();
            } else {
                f();
            }
        }
    }

    public abstract String f();

    public final Void f3(String message, int i, String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        } else {
            str = '\n' + hint;
        }
        throw fh.a(i, message + " at path: " + this.n3.y() + str, rz());
    }

    public final boolean fb() {
        return s(ud());
    }

    public final int fh(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final int gv(CharSequence charSequence, int i) {
        int i5 = i + 4;
        if (i5 < charSequence.length()) {
            this.f7174gv.append((char) ((fh(charSequence, i) << 12) + (fh(charSequence, i + 1) << 8) + (fh(charSequence, i + 2) << 4) + fh(charSequence, i + 3)));
            return i5;
        }
        this.y = i;
        x4();
        if (this.y + 4 < charSequence.length()) {
            return gv(charSequence, this.y);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void i4() {
        if (tl() == 10) {
            return;
        }
        n(this, "Expected EOF after parsing, but had " + rz().charAt(this.y - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void i9(String str, int i) {
        if (rz().length() - i < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (str.charAt(i5) != (rz().charAt(i + i5) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + co() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.y = i + str.length();
    }

    public final boolean k5() {
        int iZ6 = z6(ud());
        int length = rz().length() - iZ6;
        if (length < 4 || iZ6 == -1) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != rz().charAt(iZ6 + i)) {
                return true;
            }
        }
        if (length > 4 && n3.y(rz().charAt(iZ6 + 4)) == 0) {
            return true;
        }
        this.y = iZ6 + 4;
        return false;
    }

    public final boolean mg(char c) {
        return !(c == '}' || c == ']' || c == ':' || c == ',');
    }

    public final String mt(CharSequence source, int i, int i5) {
        int iZ6;
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i5);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iZ6 = z6(zn(i, i5));
                if (iZ6 == -1) {
                    n(this, "EOF", iZ6, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i5++;
                if (i5 >= source.length()) {
                    v(i, i5);
                    iZ6 = z6(i5);
                    if (iZ6 == -1) {
                        n(this, "EOF", iZ6, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i5);
                }
            }
            i = iZ6;
            i5 = i;
            z = true;
            cCharAt = source.charAt(i5);
        }
        String strA8 = !z ? a8(i, i5) : r(i, i5);
        this.y = i5 + 1;
        return strA8;
    }

    public final int n3(int i) {
        int iZ6 = z6(i);
        if (iZ6 == -1) {
            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i5 = iZ6 + 1;
        char cCharAt = rz().charAt(iZ6);
        if (cCharAt == 'u') {
            return gv(rz(), i5);
        }
        char cN3 = n3.n3(cCharAt);
        if (cN3 != 0) {
            this.f7174gv.append(cN3);
            return i5;
        }
        n(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String p() {
        return this.zn != null ? x() : f();
    }

    public final String r(int i, int i5) {
        v(i, i5);
        String string = this.f7174gv.toString();
        Intrinsics.checkNotNullExpressionValue(string, "escapedString.toString()");
        this.f7174gv.setLength(0);
        return string;
    }

    public abstract CharSequence rz();

    public final boolean s(int i) {
        int iZ6 = z6(i);
        if (iZ6 >= rz().length() || iZ6 == -1) {
            n(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i5 = iZ6 + 1;
        int iCharAt = rz().charAt(iZ6) | ' ';
        if (iCharAt == 102) {
            i9("alse", i5);
            return false;
        }
        if (iCharAt == 116) {
            i9("rue", i5);
            return true;
        }
        n(this, "Expected valid boolean literal prefix, but had '" + co() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract String t(String str, boolean z);

    public final byte ta() {
        CharSequence charSequenceRz = rz();
        int i = this.y;
        while (true) {
            int iZ6 = z6(i);
            if (iZ6 == -1) {
                this.y = iZ6;
                return (byte) 10;
            }
            char cCharAt = charSequenceRz.charAt(iZ6);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.y = iZ6;
                return n3.y(cCharAt);
            }
            i = iZ6 + 1;
        }
    }

    public abstract byte tl();

    public String toString() {
        return "JsonReader(source='" + ((Object) rz()) + "', currentPosition=" + this.y + ')';
    }

    public abstract int ud();

    public void v(int i, int i5) {
        this.f7174gv.append(rz(), i, i5);
    }

    public final boolean vl() {
        return rz().charAt(this.y - 1) != '\"';
    }

    public final long w() {
        boolean z;
        int iZ6 = z6(ud());
        if (iZ6 >= rz().length() || iZ6 == -1) {
            n(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (rz().charAt(iZ6) == '\"') {
            iZ6++;
            if (iZ6 == rz().length()) {
                n(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z = true;
        } else {
            z = false;
        }
        int i = iZ6;
        long j = 0;
        boolean z5 = true;
        boolean z7 = false;
        while (z5) {
            char cCharAt = rz().charAt(i);
            if (cCharAt != '-') {
                if (n3.y(cCharAt) != 0) {
                    break;
                }
                i++;
                z5 = i != rz().length();
                int i5 = cCharAt - '0';
                if (i5 < 0 || i5 >= 10) {
                    n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                j = (j * ((long) 10)) - ((long) i5);
                if (j > 0) {
                    n(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                if (i != iZ6) {
                    n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                i++;
                z7 = true;
            }
        }
        if (iZ6 == i || (z7 && iZ6 == i - 1)) {
            n(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z) {
            if (!z5) {
                n(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (rz().charAt(i) != '\"') {
                n(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i++;
        }
        this.y = i;
        if (z7) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        n(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final byte wz(byte b4) {
        byte bTl = tl();
        if (bTl == b4) {
            return bTl;
        }
        c(b4);
        throw new KotlinNothingValueException();
    }

    public final String x() {
        String str = this.zn;
        Intrinsics.checkNotNull(str);
        this.zn = null;
        return str;
    }

    public abstract void xc(char c);

    public final void yt(char c) {
        int i = this.y - 1;
        this.y = i;
        if (i >= 0 && c == '\"' && Intrinsics.areEqual(co(), "null")) {
            f3("Expected string literal but 'null' literal was found", this.y - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new KotlinNothingValueException();
        }
        c(n3.y(c));
        throw new KotlinNothingValueException();
    }

    public final String z() {
        String strCo = co();
        if (!Intrinsics.areEqual(strCo, "null") || !vl()) {
            return strCo;
        }
        n(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract int z6(int i);

    public final int zn(int i, int i5) {
        v(i, i5);
        return n3(i5 + 1);
    }

    public void x4() {
    }
}
