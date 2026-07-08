package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.xc;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.work.impl.model.n3;
import java.util.List;
import qj.f;

/* JADX INFO: loaded from: classes.dex */
@Dao
public interface y {
    @NonNull
    @RawQuery(observedEntities = {n3.class})
    List<n3.zn> getWorkInfoPojos(@NonNull f fVar);

    @NonNull
    @RawQuery(observedEntities = {n3.class})
    xc<List<n3.zn>> getWorkInfoPojosLiveData(@NonNull f fVar);
}
