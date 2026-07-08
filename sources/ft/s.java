package ft;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    public interface y<T extends s> {
        T fromBundle(Bundle bundle);
    }

    Bundle toBundle();
}
