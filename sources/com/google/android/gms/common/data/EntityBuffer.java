package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    public EntityBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(((AbstractDataBuffer) this).mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = ((AbstractDataBuffer) this).mDataHolder.getString(primaryDataMarkerColumn, 0, ((AbstractDataBuffer) this).mDataHolder.getWindowIndex(0));
                        for (int i = 1; i < count; i++) {
                            int windowIndex = ((AbstractDataBuffer) this).mDataHolder.getWindowIndex(i);
                            String string2 = ((AbstractDataBuffer) this).mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i + ", for window: " + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i);
        int i5 = 0;
        if (i >= 0 && i != this.zab.size()) {
            if (i == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(((AbstractDataBuffer) this).mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i)).intValue();
            }
            int i8 = iIntValue - iIntValue2;
            if (i8 == 1) {
                int iZaa2 = zaa(i);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(((AbstractDataBuffer) this).mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || ((AbstractDataBuffer) this).mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i5 = 1;
                }
            } else {
                i5 = i8;
            }
        }
        return getEntry(iZaa, i5);
    }

    @Nullable
    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @NonNull
    @KeepForSdk
    public abstract T getEntry(int i, int i5);

    @NonNull
    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i) {
        if (i >= 0 && i < this.zab.size()) {
            return ((Integer) this.zab.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }
}
