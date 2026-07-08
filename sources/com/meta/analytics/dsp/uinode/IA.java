package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IA {
    public static String[] A07 = {"5DRquCQGg5fv0P6nja7IsOodPXBGhUeG", "CLJKgVN4XJask5diLy7MGSBxba0Pch5a", "wHftqcE0jDwIdOqBDBC3mNx0B5SBQznZ", "ol9v552kFRhJ1T6A32CtEuz", "A1CuUzQu9jwyUqSqJ17msfwDUTn6GREa", "TbNgrGyLzvQfDvkF0WCoqwQu2K", "lR0XC8VxWttqZJTwOmQs4gh4fjIE6f", "2mBuumTUpjmiSXNoBcdi8fBRoWPOanRf"};
    public static final Comparator<I9> A08 = new I7();
    public static final Comparator<I9> A09 = new I8();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final I9[] A06 = new I9[5];
    public final ArrayList<I9> A05 = new ArrayList<>();
    public int A00 = -1;

    public IA(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f3) {
        A01();
        float f4 = this.A03 * f3;
        int i = 0;
        for (int i5 = 0; i5 < this.A05.size(); i5++) {
            I9 i92 = this.A05.get(i5);
            i += i92.A02;
            float desiredWeight = i;
            if (desiredWeight >= f4) {
                float desiredWeight2 = i92.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<I9> arrayList = this.A05;
        int size = arrayList.size();
        int accumulatedWeight = A07[3].length();
        if (accumulatedWeight == 12) {
            throw new RuntimeException();
        }
        A07[3] = "XkLaJBoD11zWycQ";
        float desiredWeight3 = arrayList.get(size - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i, float f3) {
        I9 oldestSample;
        A00();
        int i5 = this.A02;
        if (i5 > 0) {
            I9[] i9Arr = this.A06;
            int i8 = i5 - 1;
            this.A02 = i8;
            oldestSample = i9Arr[i8];
        } else {
            oldestSample = new I9(null);
        }
        int i10 = this.A01;
        this.A01 = i10 + 1;
        oldestSample.A01 = i10;
        oldestSample.A02 = i;
        oldestSample.A00 = f3;
        this.A05.add(oldestSample);
        this.A03 += i;
        while (true) {
            int i11 = this.A03;
            int i12 = this.A04;
            if (i11 > i12) {
                int excessWeight = i11 - i12;
                I9 i92 = this.A05.get(0);
                if (i92.A02 <= excessWeight) {
                    int i13 = this.A03;
                    int i14 = i92.A02;
                    if (A07[5].length() != 26) {
                        throw new RuntimeException();
                    }
                    A07[6] = "uvvU8EqEwFGMOcNu2z1EziqDegtCkn";
                    this.A03 = i13 - i14;
                    this.A05.remove(0);
                    int excessWeight2 = this.A02;
                    if (excessWeight2 < 5) {
                        I9[] i9Arr2 = this.A06;
                        this.A02 = excessWeight2 + 1;
                        i9Arr2[excessWeight2] = i92;
                    }
                } else {
                    i92.A02 -= excessWeight;
                    this.A03 -= excessWeight;
                }
            } else {
                return;
            }
        }
    }
}
