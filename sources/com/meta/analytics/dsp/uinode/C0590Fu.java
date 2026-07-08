package com.meta.analytics.dsp.uinode;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0590Fu {
    public static String[] A08 = {"XC7eQ7mnDigGIQL7dx0KfLpc2FT", "IUrjEkKy3b2jJtDJZ33sGt", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "4VXLd4NK2UMSrr9tKiehY90A", "S2gwvpBwwRoio7AP3LwECfAaRkk6O4ZY", "9TUF7Ks7YtQxur", "s5iWH5PZ", "Ea283cgdBM89En3yGupwQHUZzzjf5u4Q"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C0589Ft> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C0583Fn A05() {
        float f3;
        int i;
        int i5;
        int i8;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < this.A07.size(); i10++) {
            spannableStringBuilder.append((CharSequence) this.A07.get(i10));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (A08[2].length() != 4) {
            A08[4] = "XUGi3jQBIuRQftqARNMB36bn2TyuzRos";
            if (spannableStringBuilder.length() == 0) {
                if (A08[1].length() != 22) {
                    A08[1] = "sMaadG1MTySiyP3TGzo1T4";
                    return null;
                }
                A08[1] = "nS4SC9sWxiUu8g9Arai4ZN";
                return null;
            }
            int i11 = this.A02;
            int i12 = this.A04;
            if (A08[7].charAt(3) != 'N') {
                A08[4] = "yDKFp8g0FkQkvFDtr9inWFZi093Wo6Xo";
                int i13 = i11 + i12;
                int length = (32 - i13) - spannableStringBuilder.length();
                int i14 = i13 - length;
                if (this.A00 == 2 && (Math.abs(i14) < 3 || length < 0)) {
                    f3 = 0.5f;
                    i = 1;
                } else if (this.A00 != 2 || i14 <= 0) {
                    f3 = (0.8f * (i13 / 32.0f)) + 0.1f;
                    i = 0;
                } else {
                    int i15 = 32 - length;
                    if (A08[4].charAt(13) == 'W') {
                        throw new RuntimeException();
                    }
                    A08[2] = "dWj1xsuyJgYxC";
                    f3 = (0.8f * (i15 / 32.0f)) + 0.1f;
                    i = 2;
                }
                if (this.A00 == 1 || this.A03 > 7) {
                    i5 = 2;
                    i8 = (this.A03 - 15) - 2;
                } else {
                    i5 = 0;
                    i8 = this.A03;
                }
                return new C0583Fn(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i8, 1, i5, f3, i, Float.MIN_VALUE);
            }
        }
        throw new RuntimeException();
    }

    public C0590Fu(int i, int i5) {
        A09(i);
        A0A(i5);
    }

    private final SpannableString A00() {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int length = spannableStringBuilder.length();
        int i5 = -1;
        int nextColor = -1;
        int i8 = 0;
        int color = -1;
        boolean z = false;
        int colorStartPosition = -1;
        for (int italicStartPosition = 0; italicStartPosition < this.A06.size(); italicStartPosition++) {
            C0589Ft c0589Ft = this.A06.get(italicStartPosition);
            boolean z5 = c0589Ft.A02;
            int i10 = c0589Ft.A01;
            if (i10 != 8) {
                z = i10 == 7;
                if (i10 != 7) {
                    colorStartPosition = C5A.A0K[i10];
                }
            }
            int length2 = c0589Ft.A00;
            if (A08[1].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "A7DJ6NHY";
            strArr[5] = "4roHVg72rzpV8d";
            if (italicStartPosition + 1 < this.A06.size()) {
                i = this.A06.get(italicStartPosition + 1).A00;
            } else {
                i = length;
            }
            if (length2 != i) {
                if (i5 != -1 && !z5) {
                    A02(spannableStringBuilder, i5, length2);
                    i5 = -1;
                } else if (i5 == -1 && z5) {
                    i5 = length2;
                }
                if (nextColor != -1 && !z) {
                    A01(spannableStringBuilder, nextColor, length2);
                    nextColor = -1;
                } else if (nextColor == -1 && z) {
                    nextColor = length2;
                }
                if (colorStartPosition != color) {
                    A03(spannableStringBuilder, i8, length2, color);
                    color = colorStartPosition;
                    i8 = length2;
                }
            }
        }
        if (i5 != -1 && i5 != length) {
            A02(spannableStringBuilder, i5, length);
        }
        if (nextColor != -1 && nextColor != length) {
            A01(spannableStringBuilder, nextColor, length);
        }
        if (i8 != length) {
            A03(spannableStringBuilder, i8, length, color);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i, int i5) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i5, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i, int i5) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i5, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i8) {
        if (i8 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i, i5, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i = length3 - 1; i >= 0; i--) {
                C0589Ft c0589Ft = this.A06.get(i);
                int length4 = c0589Ft.A00;
                if (length4 == length) {
                    int length5 = c0589Ft.A00;
                    c0589Ft.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07() {
        this.A07.add(A00());
        this.A05.setLength(0);
        this.A06.clear();
        int iMin = Math.min(this.A01, this.A03);
        while (true) {
            int size = this.A07.size();
            String[] strArr = A08;
            String str = strArr[6];
            String str2 = strArr[5];
            int length = str.length();
            int numRows = str2.length();
            if (length == numRows) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "4Kk3waKD";
            strArr2[5] = "8nOP5N7C4Kf2hN";
            if (size >= iMin) {
                this.A07.remove(0);
            } else {
                return;
            }
        }
    }

    public final void A08(char c) {
        this.A05.append(c);
    }

    public final void A09(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i) {
        this.A01 = i;
    }

    public final void A0B(int i) {
        this.A02 = i;
    }

    public final void A0C(int i) {
        this.A03 = i;
    }

    public final void A0D(int i) {
        this.A04 = i;
    }

    public final void A0E(int i, boolean z) {
        this.A06.add(new C0589Ft(i, z, this.A05.length()));
    }

    public final boolean A0F() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
