package gf;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

/* JADX INFO: loaded from: classes.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = androidx.work.impl.model.n3.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = androidx.work.impl.model.n3.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
public class y {

    @NonNull
    @ColumnInfo(name = "prerequisite_id")
    public final String prerequisiteId;

    @NonNull
    @ColumnInfo(name = "work_spec_id")
    public final String workSpecId;

    public y(@NonNull String str, @NonNull String str2) {
        this.workSpecId = str;
        this.prerequisiteId = str2;
    }
}
