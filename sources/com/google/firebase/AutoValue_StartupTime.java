package com.google.firebase;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_StartupTime extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    public AutoValue_StartupTime(long j, long j4, long j7) {
        this.epochMillis = j;
        this.elapsedRealtime = j4;
        this.uptimeMillis = j7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        return this.epochMillis == startupTime.getEpochMillis() && this.elapsedRealtime == startupTime.getElapsedRealtime() && this.uptimeMillis == startupTime.getUptimeMillis();
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.epochMillis;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        long j = this.epochMillis;
        long j4 = this.elapsedRealtime;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j7 = this.uptimeMillis;
        return ((int) ((j7 >>> 32) ^ j7)) ^ i;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.epochMillis + ", elapsedRealtime=" + this.elapsedRealtime + ", uptimeMillis=" + this.uptimeMillis + "}";
    }
}
