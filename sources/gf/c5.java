package gf;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = androidx.work.impl.model.n3.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
public class c5 {

    @NonNull
    @ColumnInfo(name = NotificationCompat.CATEGORY_PROGRESS)
    public final androidx.work.n3 mProgress;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    public final String mWorkSpecId;

    public c5(@NonNull String str, @NonNull androidx.work.n3 n3Var) {
        this.mWorkSpecId = str;
        this.mProgress = n3Var;
    }
}
