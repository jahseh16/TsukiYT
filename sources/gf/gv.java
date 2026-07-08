package gf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.xc;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

/* JADX INFO: loaded from: classes.dex */
@Dao
public interface gv {
    @Nullable
    @Query("SELECT long_value FROM Preference where `key`=:key")
    Long getLongValue(@NonNull String str);

    @NonNull
    @Query("SELECT long_value FROM Preference where `key`=:key")
    xc<Long> getObservableLongValue(@NonNull String str);

    @Insert(onConflict = 1)
    void insertPreference(@NonNull zn znVar);
}
