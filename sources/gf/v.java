package gf;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = androidx.work.impl.model.n3.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
public class v {

    @ColumnInfo(name = "system_id")
    public final int systemId;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    public final String workSpecId;

    public v(@NonNull String str, int i) {
        this.workSpecId = str;
        this.systemId = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.systemId != vVar.systemId) {
            return false;
        }
        return this.workSpecId.equals(vVar.workSpecId);
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.systemId;
    }
}
