package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2Q implements Serializable {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public double A08;
    public double A09;
    public int A0A;

    public C2Q(double d4) {
        this.A04 = d4;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A03;
    }

    public final double A02() {
        return this.A05;
    }

    public final double A03() {
        return this.A06;
    }

    public final double A04() {
        return this.A07;
    }

    public final double A05() {
        if (this.A0A == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return this.A08;
    }

    public final void A06() {
        this.A00 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A02 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A03 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A05 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A0A = 0;
        this.A07 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.A08 = 1.0d;
        this.A09 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final void A07() {
        this.A01 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final void A08(double d4, double d5) {
        this.A0A++;
        double d6 = this.A07 + d4;
        this.A07 = d6;
        this.A02 = d5;
        double d7 = this.A09 + (d5 * d4);
        this.A09 = d7;
        this.A00 = d7 / d6;
        this.A08 = Math.min(this.A08, d5);
        this.A05 = Math.max(this.A05, d5);
        if (d5 >= this.A04) {
            this.A03 += d4;
            double d8 = this.A01 + d4;
            this.A01 = d8;
            this.A06 = Math.max(this.A06, d8);
            return;
        }
        this.A01 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }
}
