package z4;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static Set a(ComponentContainer componentContainer, Class cls) {
        return componentContainer.setOf(Qualified.unqualified(cls));
    }

    public static Provider fb(ComponentContainer componentContainer, Class cls) {
        return componentContainer.setOfProvider(Qualified.unqualified(cls));
    }

    public static Provider gv(ComponentContainer componentContainer, Class cls) {
        return componentContainer.getProvider(Qualified.unqualified(cls));
    }

    public static Object n3(ComponentContainer componentContainer, Class cls) {
        return componentContainer.get(Qualified.unqualified(cls));
    }

    public static Set v(ComponentContainer componentContainer, Qualified qualified) {
        return (Set) componentContainer.setOfProvider(qualified).get();
    }

    public static Object y(ComponentContainer componentContainer, Qualified qualified) {
        Provider provider = componentContainer.getProvider(qualified);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    public static Deferred zn(ComponentContainer componentContainer, Class cls) {
        return componentContainer.getDeferred(Qualified.unqualified(cls));
    }
}
