package gf;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

/* JADX INFO: loaded from: classes.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = androidx.work.impl.model.n3.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
public class fb {

    @NonNull
    @ColumnInfo(name = "name")
    public final String name;

    @NonNull
    @ColumnInfo(name = "work_spec_id")
    public final String workSpecId;

    public fb(@NonNull String str, @NonNull String str2) {
        this.name = str;
        this.workSpecId = str2;
    }
}
