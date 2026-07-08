package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[UserMetadata.MAX_ATTRIBUTE_SIZE];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(UserMetadata.MAX_ATTRIBUTE_SIZE);
    private final Stack zat = new Stack();

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, @androidx.annotation.Nullable char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L60
            r4 = 0
        L12:
            if (r4 >= r3) goto L58
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L2b
            if (r11 == 0) goto L23
            char r6 = r11[r0]
            if (r6 != r5) goto L23
            goto L2b
        L23:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L2b:
            int r6 = r4 + 1
            r7 = 34
            if (r5 != r7) goto L4f
            if (r1 != 0) goto L4d
            r10.append(r9, r0, r4)
            r8.reset()
            long r0 = (long) r6
            r8.skip(r0)
            if (r2 == 0) goto L48
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L48:
            java.lang.String r8 = r10.toString()
            return r8
        L4d:
            r1 = 0
            goto L56
        L4f:
            r4 = 92
            if (r5 != r4) goto L4d
            r1 = r1 ^ 1
            r2 = 1
        L56:
            r4 = r6
            goto L12
        L58:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        return iZam == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : Double.parseDouble(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        int i5;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c = cArr[0];
        int i8 = c == '-' ? Integer.MIN_VALUE : -2147483647;
        int i10 = c == '-' ? 1 : 0;
        if (i10 < iZam) {
            i = i10 + 1;
            int iDigit = Character.digit(cArr[i10], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i5 = -iDigit;
        } else {
            i = i10;
            i5 = 0;
        }
        while (i < iZam) {
            int i11 = i + 1;
            int iDigit2 = Character.digit(cArr[i], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i5 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i12 = i5 * 10;
            if (i12 < i8 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i5 = i12 - iDigit2;
            i = i11;
        }
        if (i10 == 0) {
            return -i5;
        }
        if (i > 1) {
            return i5;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (cZai == '\"') {
            i = 0;
            boolean z = false;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i5 = i + 1;
                if (c != '\"') {
                    z = c == '\\' ? !z : false;
                    i = i5;
                } else if (!z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i5);
                    return i;
                }
                i = i5;
            }
        } else {
            cArr[0] = cZai;
            i = 1;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c3 = cArr[i];
                if (c3 == '}' || c3 == ',' || Character.isWhitespace(c3) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        int i;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c = cArr[0];
        long j4 = c == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i5 = c == '-' ? 1 : 0;
        if (i5 < iZam) {
            i = i5 + 1;
            int iDigit = Character.digit(cArr[i5], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j = -iDigit;
        } else {
            j = 0;
            i = i5;
        }
        while (i < iZam) {
            int i8 = i + 1;
            int iDigit2 = Character.digit(cArr[i], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j7 = j * 10;
            long j8 = iDigit2;
            if (j7 < j4 + j8) {
                throw new ParseException("Number too large");
            }
            j = j7 - j8;
            i = i8;
        }
        if (i5 == 0) {
            return -j;
        }
        if (i > 1) {
            return j;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @Nullable
    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (cZai != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @Nullable
    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZai == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (cZai == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @Nullable
    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(UserMetadata.MAX_ATTRIBUTE_SIZE);
        char cZai = zai(bufferedReader);
        int i = 1;
        if (cZai == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c = this.zao[0];
            boolean z = false;
            do {
                if (c == '\"') {
                    if (z) {
                        c = '\"';
                        z = true;
                    }
                }
                z = c == '\\' ? !z : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c = this.zao[0];
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z5 = false;
                loop1: while (true) {
                    boolean z7 = false;
                    while (i > 0) {
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cZai2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (cZai2 == '\"') {
                            if (!z7) {
                                z5 = !z5;
                            }
                            cZai2 = '\"';
                        }
                        if (cZai2 == '[') {
                            if (!z5) {
                                i++;
                            }
                            cZai2 = '[';
                        }
                        if (cZai2 == ']' && !z5) {
                            i--;
                        }
                        if (cZai2 != '\\' || !z5) {
                            break;
                        }
                        z7 = !z7;
                    }
                    zaw(5);
                }
            }
        } else if (cZai != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char cZai3 = zai(bufferedReader);
            if (cZai3 == '}') {
                zaw(1);
            } else {
                if (cZai3 != '\"') {
                    throw new ParseException("Unexpected token " + cZai3);
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
                zaw(1);
            }
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token " + cZai4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @Nullable
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @Nullable
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @Nullable
    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(UserMetadata.MAX_ATTRIBUTE_SIZE);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @Nullable
    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            throw new ParseException("Unexpected token: " + cZai);
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new ParseException("Unexpected token: " + cZai2);
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (IllegalAccessException e4) {
                throw new ParseException("Error instantiating inner object", e4);
            } catch (InstantiationException e5) {
                throw new ParseException("Error instantiating inner object", e5);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    private final void zaw(int i) throws ParseException {
        if (this.zat.isEmpty()) {
            throw new ParseException("Expected state " + i + " but had empty stack");
        }
        int iIntValue = ((Integer) this.zat.pop()).intValue();
        if (iIntValue == i) {
            return;
        }
        throw new ParseException("Expected state " + i + " but had " + iIntValue);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i >= length) {
                return;
            }
            int i5 = bufferedReader.read(this.zap, 0, length - i);
            if (i5 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i8 = 0; i8 < i5; i8++) {
                if (cArr[i8 + i] != this.zap[i8]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i += i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    public final boolean zay(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai == 't') {
            zax(bufferedReader, z ? zac : zab);
            return true;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.server.response.FastParser$ParseException */
    @ResultIgnorabilityUnspecified
    private final boolean zaz(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        HashMap map;
        Map fieldMappings = fastJsonResponse.getFieldMappings();
        String strZaq = zaq(bufferedReader);
        if (strZaq == null) {
            zaw(1);
            return false;
        }
        while (strZaq != null) {
            FastJsonResponse.Field field = (FastJsonResponse.Field) fieldMappings.get(strZaq);
            if (field == null) {
                strZaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i = field.zaa;
                switch (i) {
                    case 0:
                        if (!field.zab) {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                        } else {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                        }
                        break;
                    case 1:
                        if (!field.zab) {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                        } else {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                        }
                        break;
                    case 2:
                        if (!field.zab) {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                        } else {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                        }
                        break;
                    case 3:
                        if (!field.zab) {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                        } else {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                        }
                        break;
                    case 4:
                        if (!field.zab) {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                        } else {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                        }
                        break;
                    case 5:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                        } else {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                        }
                        break;
                    case 6:
                        if (!field.zab) {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                        } else {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                        }
                        break;
                    case 7:
                        if (!field.zab) {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                        } else {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        break;
                    case 9:
                        fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        break;
                    case 10:
                        char cZai = zai(bufferedReader);
                        if (cZai == 'n') {
                            zax(bufferedReader, zaa);
                            map = null;
                        } else {
                            if (cZai != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            map = new HashMap();
                            while (true) {
                                char cZai2 = zai(bufferedReader);
                                if (cZai2 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cZai2 == '\"') {
                                    String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        throw new ParseException("No map value found for key ".concat(String.valueOf(strZaA)));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        throw new ParseException("Expected String value for key ".concat(String.valueOf(strZaA)));
                                    }
                                    map.put(strZaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char cZai3 = zai(bufferedReader);
                                    if (cZai3 != ',') {
                                        if (cZai3 != '}') {
                                            throw new ParseException("Unexpected character while parsing string map: " + cZai3);
                                        }
                                        zaw(1);
                                    }
                                } else if (cZai2 == '}') {
                                    zaw(1);
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, map);
                        break;
                    case 11:
                        if (field.zab) {
                            char cZai4 = zai(bufferedReader);
                            if (cZai4 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, (ArrayList) null);
                            } else {
                                this.zat.push(5);
                                if (cZai4 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        } else {
                            char cZai5 = zai(bufferedReader);
                            if (cZai5 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, (FastJsonResponse) null);
                            } else {
                                this.zat.push(1);
                                if (cZai5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZad = field.zad();
                                    zaz(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZad);
                                } catch (IllegalAccessException e4) {
                                    throw new ParseException("Error instantiating inner object", e4);
                                } catch (InstantiationException e5) {
                                    throw new ParseException("Error instantiating inner object", e5);
                                }
                            }
                        }
                        break;
                    default:
                        throw new ParseException("Invalid field type " + i);
                }
                zaw(4);
                zaw(2);
                char cZai6 = zai(bufferedReader);
                if (cZai6 == ',') {
                    strZaq = zaq(bufferedReader);
                } else {
                    if (cZai6 != '}') {
                        throw new ParseException("Expected end of object or field separator, but found: " + cZai6);
                    }
                    strZaq = null;
                }
            }
        }
        zaw(1);
        return true;
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t3) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), UserMetadata.MAX_ATTRIBUTE_SIZE);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    Map fieldMappings = t3.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field field = (FastJsonResponse.Field) ((Map.Entry) fieldMappings.entrySet().iterator().next()).getValue();
                    t3.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                } else {
                    if (cZai != '{') {
                        throw new ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t3);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e4) {
                throw new ParseException(e4);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
