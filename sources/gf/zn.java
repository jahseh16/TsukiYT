package gf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes.dex */
@Entity
public class zn {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "key")
    public String mKey;

    @Nullable
    @ColumnInfo(name = "long_value")
    public Long mValue;

    public zn(@NonNull String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        if (!this.mKey.equals(znVar.mKey)) {
            return false;
        }
        Long l3 = this.mValue;
        Long l4 = znVar.mValue;
        return l3 != null ? l3.equals(l4) : l4 == null;
    }

    public int hashCode() {
        int iHashCode = this.mKey.hashCode() * 31;
        Long l3 = this.mValue;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }

    public zn(@NonNull String str, long j) {
        this.mKey = str;
        this.mValue = Long.valueOf(j);
    }
}
