package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes.dex */
public class Settings {
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeatureFlagData featureFlagData;
    public final double onDemandBackoffBase;
    public final int onDemandBackoffStepDurationSeconds;
    public final double onDemandUploadRatePerMinute;
    public final SessionData sessionData;
    public final int settingsVersion;

    public static class FeatureFlagData {
        public final boolean collectAnrs;
        public final boolean collectBuildIds;
        public final boolean collectReports;

        public FeatureFlagData(boolean z, boolean z5, boolean z7) {
            this.collectReports = z;
            this.collectAnrs = z5;
            this.collectBuildIds = z7;
        }
    }

    public Settings(long j, SessionData sessionData, FeatureFlagData featureFlagData, int i, int i5, double d4, double d5, int i8) {
        this.expiresAtMillis = j;
        this.sessionData = sessionData;
        this.featureFlagData = featureFlagData;
        this.settingsVersion = i;
        this.cacheDuration = i5;
        this.onDemandUploadRatePerMinute = d4;
        this.onDemandBackoffBase = d5;
        this.onDemandBackoffStepDurationSeconds = i8;
    }

    public boolean isExpired(long j) {
        return this.expiresAtMillis < j;
    }
}
