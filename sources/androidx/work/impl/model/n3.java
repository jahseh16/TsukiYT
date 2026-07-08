package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import com.google.firebase.remoteconfig.RemoteConfigConstants$ResponseFieldKey;
import gf.c5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import yk.f;
import yk.xc;
import yk.z;

/* JADX INFO: loaded from: classes.dex */
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
public final class n3 {

    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @NonNull
    @ColumnInfo(name = "backoff_policy")
    public yk.y backoffPolicy;

    @NonNull
    @Embedded
    public yk.n3 constraints;

    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    public String id;

    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @NonNull
    @ColumnInfo(name = "input")
    public androidx.work.n3 input;

    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName;

    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @NonNull
    @ColumnInfo(name = "out_of_quota_policy")
    public xc outOfQuotaPolicy;

    @NonNull
    @ColumnInfo(name = "output")
    public androidx.work.n3 output;

    @ColumnInfo(name = "period_start_time")
    public long periodStartTime;

    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @NonNull
    @ColumnInfo(name = RemoteConfigConstants$ResponseFieldKey.STATE)
    public z.y state;

    @NonNull
    @ColumnInfo(name = "worker_class_name")
    public String workerClassName;
    public static final String y = f.a("WorkSpec");
    public static final co.y<List<zn>, List<z>> n3 = new y();

    /* JADX INFO: renamed from: androidx.work.impl.model.n3$n3, reason: collision with other inner class name */
    public static class C0028n3 {

        @ColumnInfo(name = "id")
        public String id;

        @ColumnInfo(name = RemoteConfigConstants$ResponseFieldKey.STATE)
        public z.y state;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0028n3)) {
                return false;
            }
            C0028n3 c0028n3 = (C0028n3) obj;
            if (this.state != c0028n3.state) {
                return false;
            }
            return this.id.equals(c0028n3.id);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }
    }

    public class y implements co.y<List<zn>, List<z>> {
        @Override // co.y
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public List<z> apply(List<zn> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<zn> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().y());
            }
            return arrayList;
        }
    }

    public static class zn {

        @ColumnInfo(name = "id")
        public String id;

        @ColumnInfo(name = "output")
        public androidx.work.n3 output;

        @Relation(entity = c5.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {NotificationCompat.CATEGORY_PROGRESS})
        public List<androidx.work.n3> progress;

        @ColumnInfo(name = "run_attempt_count")
        public int runAttemptCount;

        @ColumnInfo(name = RemoteConfigConstants$ResponseFieldKey.STATE)
        public z.y state;

        @Relation(entity = gf.f.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public List<String> tags;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zn)) {
                return false;
            }
            zn znVar = (zn) obj;
            if (this.runAttemptCount != znVar.runAttemptCount) {
                return false;
            }
            String str = this.id;
            if (str == null ? znVar.id != null : !str.equals(znVar.id)) {
                return false;
            }
            if (this.state != znVar.state) {
                return false;
            }
            androidx.work.n3 n3Var = this.output;
            if (n3Var == null ? znVar.output != null : !n3Var.equals(znVar.output)) {
                return false;
            }
            List<String> list = this.tags;
            if (list == null ? znVar.tags != null : !list.equals(znVar.tags)) {
                return false;
            }
            List<androidx.work.n3> list2 = this.progress;
            List<androidx.work.n3> list3 = znVar.progress;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            z.y yVar = this.state;
            int iHashCode2 = (iHashCode + (yVar != null ? yVar.hashCode() : 0)) * 31;
            androidx.work.n3 n3Var = this.output;
            int iHashCode3 = (((iHashCode2 + (n3Var != null ? n3Var.hashCode() : 0)) * 31) + this.runAttemptCount) * 31;
            List<String> list = this.tags;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.n3> list2 = this.progress;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        @NonNull
        public z y() {
            List<androidx.work.n3> list = this.progress;
            return new z(UUID.fromString(this.id), this.state, this.output, this.tags, (list == null || list.isEmpty()) ? androidx.work.n3.zn : this.progress.get(0), this.runAttemptCount);
        }
    }

    public n3(@NonNull String str, @NonNull String str2) {
        this.state = z.y.ENQUEUED;
        androidx.work.n3 n3Var = androidx.work.n3.zn;
        this.input = n3Var;
        this.output = n3Var;
        this.constraints = yk.n3.y;
        this.backoffPolicy = yk.y.EXPONENTIAL;
        this.backoffDelayDuration = 30000L;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = xc.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = str;
        this.workerClassName = str2;
    }

    public void a(long j, long j4) {
        if (j < 900000) {
            f.zn().s(y, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j = 900000;
        }
        if (j4 < 300000) {
            f.zn().s(y, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j4 = 300000;
        }
        if (j4 > j) {
            f.zn().s(y, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j)), new Throwable[0]);
            j4 = j;
        }
        this.intervalDuration = j;
        this.flexDuration = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        if (this.initialDelay != n3Var.initialDelay || this.intervalDuration != n3Var.intervalDuration || this.flexDuration != n3Var.flexDuration || this.runAttemptCount != n3Var.runAttemptCount || this.backoffDelayDuration != n3Var.backoffDelayDuration || this.periodStartTime != n3Var.periodStartTime || this.minimumRetentionDuration != n3Var.minimumRetentionDuration || this.scheduleRequestedAt != n3Var.scheduleRequestedAt || this.expedited != n3Var.expedited || !this.id.equals(n3Var.id) || this.state != n3Var.state || !this.workerClassName.equals(n3Var.workerClassName)) {
            return false;
        }
        String str = this.inputMergerClassName;
        if (str == null ? n3Var.inputMergerClassName == null : str.equals(n3Var.inputMergerClassName)) {
            return this.input.equals(n3Var.input) && this.output.equals(n3Var.output) && this.constraints.equals(n3Var.constraints) && this.backoffPolicy == n3Var.backoffPolicy && this.outOfQuotaPolicy == n3Var.outOfQuotaPolicy;
        }
        return false;
    }

    public boolean gv() {
        return this.intervalDuration != 0;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31;
        String str = this.inputMergerClassName;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31;
        long j = this.initialDelay;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.intervalDuration;
        int i5 = (i + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j7 = this.flexDuration;
        int iHashCode3 = (((((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.constraints.hashCode()) * 31) + this.runAttemptCount) * 31) + this.backoffPolicy.hashCode()) * 31;
        long j8 = this.backoffDelayDuration;
        int i8 = (iHashCode3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.periodStartTime;
        int i10 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.minimumRetentionDuration;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.scheduleRequestedAt;
        return ((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.expedited ? 1 : 0)) * 31) + this.outOfQuotaPolicy.hashCode();
    }

    public boolean n3() {
        return !yk.n3.y.equals(this.constraints);
    }

    @NonNull
    public String toString() {
        return "{WorkSpec: " + this.id + "}";
    }

    public void v(long j) {
        if (j < 900000) {
            f.zn().s(y, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j = 900000;
        }
        a(j, j);
    }

    public long y() {
        if (zn()) {
            return this.periodStartTime + Math.min(18000000L, this.backoffPolicy == yk.y.LINEAR ? this.backoffDelayDuration * ((long) this.runAttemptCount) : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1));
        }
        if (!gv()) {
            long jCurrentTimeMillis = this.periodStartTime;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.initialDelay;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.periodStartTime;
        long j4 = j == 0 ? jCurrentTimeMillis2 + this.initialDelay : j;
        long j7 = this.flexDuration;
        long j8 = this.intervalDuration;
        if (j7 != j8) {
            return j4 + j8 + (j == 0 ? j7 * (-1) : 0L);
        }
        return j4 + (j != 0 ? j8 : 0L);
    }

    public boolean zn() {
        return this.state == z.y.ENQUEUED && this.runAttemptCount > 0;
    }

    public n3(@NonNull n3 n3Var) {
        this.state = z.y.ENQUEUED;
        androidx.work.n3 n3Var2 = androidx.work.n3.zn;
        this.input = n3Var2;
        this.output = n3Var2;
        this.constraints = yk.n3.y;
        this.backoffPolicy = yk.y.EXPONENTIAL;
        this.backoffDelayDuration = 30000L;
        this.scheduleRequestedAt = -1L;
        this.outOfQuotaPolicy = xc.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.id = n3Var.id;
        this.workerClassName = n3Var.workerClassName;
        this.state = n3Var.state;
        this.inputMergerClassName = n3Var.inputMergerClassName;
        this.input = new androidx.work.n3(n3Var.input);
        this.output = new androidx.work.n3(n3Var.output);
        this.initialDelay = n3Var.initialDelay;
        this.intervalDuration = n3Var.intervalDuration;
        this.flexDuration = n3Var.flexDuration;
        this.constraints = new yk.n3(n3Var.constraints);
        this.runAttemptCount = n3Var.runAttemptCount;
        this.backoffPolicy = n3Var.backoffPolicy;
        this.backoffDelayDuration = n3Var.backoffDelayDuration;
        this.periodStartTime = n3Var.periodStartTime;
        this.minimumRetentionDuration = n3Var.minimumRetentionDuration;
        this.scheduleRequestedAt = n3Var.scheduleRequestedAt;
        this.expedited = n3Var.expedited;
        this.outOfQuotaPolicy = n3Var.outOfQuotaPolicy;
    }
}
