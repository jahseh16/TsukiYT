package gf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Dao
public interface i9 {
    @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void delete(@NonNull String str);

    @Query("DELETE FROM WorkProgress")
    void deleteAll();

    @Nullable
    @Query("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    androidx.work.n3 getProgressForWorkSpecId(@NonNull String str);

    @NonNull
    @Query("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    List<androidx.work.n3> getProgressForWorkSpecIds(@NonNull List<String> list);

    @Insert(onConflict = 1)
    void insert(@NonNull c5 c5Var);
}
