package ne;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import q.a;
import q.fb;
import q.s;
import q.v;
import q.zn;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class gv implements zn.y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final String f6936gv = f.a("WorkConstraintsTracker");
    public final q.zn<?>[] n3;

    @Nullable
    public final zn y;
    public final Object zn;

    public gv(@NonNull Context context, @NonNull br.y yVar, @Nullable zn znVar) {
        Context applicationContext = context.getApplicationContext();
        this.y = znVar;
        this.n3 = new q.zn[]{new q.y(applicationContext, yVar), new q.n3(applicationContext, yVar), new s(applicationContext, yVar), new q.gv(applicationContext, yVar), new fb(applicationContext, yVar), new a(applicationContext, yVar), new v(applicationContext, yVar)};
        this.zn = new Object();
    }

    public void gv(@NonNull Iterable<androidx.work.impl.model.n3> iterable) {
        synchronized (this.zn) {
            try {
                for (q.zn<?> znVar : this.n3) {
                    znVar.fb(null);
                }
                for (q.zn<?> znVar2 : this.n3) {
                    znVar2.v(iterable);
                }
                for (q.zn<?> znVar3 : this.n3) {
                    znVar3.fb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q.zn.y
    public void n3(@NonNull List<String> list) {
        synchronized (this.zn) {
            try {
                zn znVar = this.y;
                if (znVar != null) {
                    znVar.n3(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v() {
        synchronized (this.zn) {
            try {
                for (q.zn<?> znVar : this.n3) {
                    znVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q.zn.y
    public void y(@NonNull List<String> list) {
        synchronized (this.zn) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (zn(str)) {
                        f.zn().y(f6936gv, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                zn znVar = this.y;
                if (znVar != null) {
                    znVar.a(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean zn(@NonNull String str) {
        synchronized (this.zn) {
            try {
                for (q.zn<?> znVar : this.n3) {
                    if (znVar.gv(str)) {
                        f.zn().y(f6936gv, String.format("Work %s constrained by %s", str, znVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
