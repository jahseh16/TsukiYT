package ta;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f8206a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Set<String> f8207fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f8208gv;
    public final CharSequence n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8209v;
    public final String y;
    public final CharSequence[] zn;

    public static class y {
        public static RemoteInput n3(z zVar) {
            Set<String> setGv;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(zVar.c5()).setLabel(zVar.s()).setChoices(zVar.v()).setAllowFreeFormInput(zVar.zn()).addExtras(zVar.fb());
            if (Build.VERSION.SDK_INT >= 26 && (setGv = zVar.gv()) != null) {
                Iterator<String> it = setGv.iterator();
                while (it.hasNext()) {
                    n3.gv(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                zn.n3(builderAddExtras, zVar.a());
            }
            return builderAddExtras.build();
        }

        public static void y(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static Bundle zn(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public z(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.y = str;
        this.n3 = charSequence;
        this.zn = charSequenceArr;
        this.f8208gv = z;
        this.f8209v = i;
        this.f8206a = bundle;
        this.f8207fb = set;
        if (a() == 2 && !zn()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput[] n3(z[] zVarArr) {
        if (zVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[zVarArr.length];
        for (int i = 0; i < zVarArr.length; i++) {
            remoteInputArr[i] = y(zVarArr[i]);
        }
        return remoteInputArr;
    }

    public static RemoteInput y(z zVar) {
        return y.n3(zVar);
    }

    public int a() {
        return this.f8209v;
    }

    @NonNull
    public String c5() {
        return this.y;
    }

    @NonNull
    public Bundle fb() {
        return this.f8206a;
    }

    @Nullable
    public Set<String> gv() {
        return this.f8207fb;
    }

    public boolean i9() {
        return (zn() || (v() != null && v().length != 0) || gv() == null || gv().isEmpty()) ? false : true;
    }

    @Nullable
    public CharSequence s() {
        return this.n3;
    }

    @Nullable
    public CharSequence[] v() {
        return this.zn;
    }

    public boolean zn() {
        return this.f8208gv;
    }
}
