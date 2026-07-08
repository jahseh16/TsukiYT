package v3;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements fh {
    @Override // v3.fh
    public final boolean y(Object obj, File file, File file2) {
        return new File((String) oz.fb(obj.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2)).exists();
    }
}
