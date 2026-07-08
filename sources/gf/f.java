package gf;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

/* JADX INFO: loaded from: classes.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = androidx.work.impl.model.n3.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
public class f {

    @NonNull
    @ColumnInfo(name = "tag")
    public final String tag;

    @NonNull
    @ColumnInfo(name = "work_spec_id")
    public final String workSpecId;

    public f(@NonNull String str, @NonNull String str2) {
        this.tag = str;
        this.workSpecId = str2;
    }
}
