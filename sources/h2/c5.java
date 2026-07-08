package h2;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5<S> extends Fragment {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final LinkedHashSet<s<S>> f5272fb = new LinkedHashSet<>();

    public boolean ez(s<S> sVar) {
        return this.f5272fb.add(sVar);
    }

    public void wb() {
        this.f5272fb.clear();
    }
}
