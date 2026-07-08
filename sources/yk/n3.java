package yk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {
    public static final n3 y = new y().y();

    @ColumnInfo(name = "content_uri_triggers")
    private zn mContentUriTriggers;

    @ColumnInfo(name = "required_network_type")
    private t mRequiredNetworkType;

    @ColumnInfo(name = "requires_battery_not_low")
    private boolean mRequiresBatteryNotLow;

    @ColumnInfo(name = "requires_charging")
    private boolean mRequiresCharging;

    @ColumnInfo(name = "requires_device_idle")
    private boolean mRequiresDeviceIdle;

    @ColumnInfo(name = "requires_storage_not_low")
    private boolean mRequiresStorageNotLow;

    @ColumnInfo(name = "trigger_content_update_delay")
    private long mTriggerContentUpdateDelay;

    @ColumnInfo(name = "trigger_max_content_delay")
    private long mTriggerMaxContentDelay;

    public static final class y {
        public boolean y = false;
        public boolean n3 = false;
        public t zn = t.NOT_REQUIRED;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f9334gv = false;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9336v = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f9332a = -1;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public long f9333fb = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public zn f9335s = new zn();

        @NonNull
        public y n3(@NonNull t tVar) {
            this.zn = tVar;
            return this;
        }

        @NonNull
        public n3 y() {
            return new n3(this);
        }
    }

    public n3() {
        this.mRequiredNetworkType = t.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new zn();
    }

    public boolean a() {
        return this.mRequiresBatteryNotLow;
    }

    public boolean c5() {
        return this.mRequiresStorageNotLow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        if (this.mRequiresCharging == n3Var.mRequiresCharging && this.mRequiresDeviceIdle == n3Var.mRequiresDeviceIdle && this.mRequiresBatteryNotLow == n3Var.mRequiresBatteryNotLow && this.mRequiresStorageNotLow == n3Var.mRequiresStorageNotLow && this.mTriggerContentUpdateDelay == n3Var.mTriggerContentUpdateDelay && this.mTriggerMaxContentDelay == n3Var.mTriggerMaxContentDelay && this.mRequiredNetworkType == n3Var.mRequiredNetworkType) {
            return this.mContentUriTriggers.equals(n3Var.mContentUriTriggers);
        }
        return false;
    }

    public void f(@NonNull t tVar) {
        this.mRequiredNetworkType = tVar;
    }

    public boolean fb() {
        return this.mRequiresCharging;
    }

    public long gv() {
        return this.mTriggerMaxContentDelay;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.mRequiredNetworkType.hashCode() * 31) + (this.mRequiresCharging ? 1 : 0)) * 31) + (this.mRequiresDeviceIdle ? 1 : 0)) * 31) + (this.mRequiresBatteryNotLow ? 1 : 0)) * 31) + (this.mRequiresStorageNotLow ? 1 : 0)) * 31;
        long j = this.mTriggerContentUpdateDelay;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.mTriggerMaxContentDelay;
        return ((i + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.mContentUriTriggers.hashCode();
    }

    public void i9(@Nullable zn znVar) {
        this.mContentUriTriggers = znVar;
    }

    @NonNull
    public t n3() {
        return this.mRequiredNetworkType;
    }

    public void p(long j) {
        this.mTriggerMaxContentDelay = j;
    }

    public boolean s() {
        return this.mRequiresDeviceIdle;
    }

    public void t(boolean z) {
        this.mRequiresBatteryNotLow = z;
    }

    public void tl(boolean z) {
        this.mRequiresCharging = z;
    }

    public boolean v() {
        return this.mContentUriTriggers.zn() > 0;
    }

    public void w(long j) {
        this.mTriggerContentUpdateDelay = j;
    }

    public void wz(boolean z) {
        this.mRequiresDeviceIdle = z;
    }

    public void xc(boolean z) {
        this.mRequiresStorageNotLow = z;
    }

    @NonNull
    public zn y() {
        return this.mContentUriTriggers;
    }

    public long zn() {
        return this.mTriggerContentUpdateDelay;
    }

    public n3(y yVar) {
        this.mRequiredNetworkType = t.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new zn();
        this.mRequiresCharging = yVar.y;
        int i = Build.VERSION.SDK_INT;
        this.mRequiresDeviceIdle = i >= 23 && yVar.n3;
        this.mRequiredNetworkType = yVar.zn;
        this.mRequiresBatteryNotLow = yVar.f9334gv;
        this.mRequiresStorageNotLow = yVar.f9336v;
        if (i >= 24) {
            this.mContentUriTriggers = yVar.f9335s;
            this.mTriggerContentUpdateDelay = yVar.f9332a;
            this.mTriggerMaxContentDelay = yVar.f9333fb;
        }
    }

    public n3(@NonNull n3 n3Var) {
        this.mRequiredNetworkType = t.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new zn();
        this.mRequiresCharging = n3Var.mRequiresCharging;
        this.mRequiresDeviceIdle = n3Var.mRequiresDeviceIdle;
        this.mRequiredNetworkType = n3Var.mRequiredNetworkType;
        this.mRequiresBatteryNotLow = n3Var.mRequiresBatteryNotLow;
        this.mRequiresStorageNotLow = n3Var.mRequiresStorageNotLow;
        this.mContentUriTriggers = n3Var.mContentUriTriggers;
    }
}
