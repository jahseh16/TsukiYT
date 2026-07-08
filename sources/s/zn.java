package s;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import ap.mt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn {
    public Random y = new Random();
    public final Map<Integer, String> n3 = new HashMap();
    public final Map<String, Integer> zn = new HashMap();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<String, v> f7763gv = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<String> f7765v = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Map<String, gv<?>> f7761a = new HashMap();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Map<String, Object> f7762fb = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f7764s = new Bundle();

    public static class gv<O> {
        public final c5.y<?, O> n3;
        public final s.y<O> y;

        public gv(s.y<O> yVar, c5.y<?, O> yVar2) {
            this.y = yVar;
            this.n3 = yVar2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class n3<I> extends s.n3<I> {
        public final /* synthetic */ c5.y n3;
        public final /* synthetic */ String y;

        public n3(String str, c5.y yVar) {
            this.y = str;
            this.n3 = yVar;
        }

        @Override // s.n3
        @NonNull
        public c5.y<I, ?> getContract() {
            return this.n3;
        }

        @Override // s.n3
        public void launch(I i, @Nullable ta.gv gvVar) throws Exception {
            Integer num = zn.this.zn.get(this.y);
            if (num != null) {
                zn.this.f7765v.add(this.y);
                try {
                    zn.this.a(num.intValue(), this.n3, i, gvVar);
                    return;
                } catch (Exception e4) {
                    zn.this.f7765v.remove(this.y);
                    throw e4;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.n3 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // s.n3
        public void unregister() {
            zn.this.t(this.y);
        }
    }

    public static class v {
        public final ArrayList<t> n3 = new ArrayList<>();
        public final s y;

        public v(@NonNull s sVar) {
            this.y = sVar;
        }

        public void n3() {
            Iterator<t> it = this.n3.iterator();
            while (it.hasNext()) {
                this.y.gv(it.next());
            }
            this.n3.clear();
        }

        public void y(@NonNull t tVar) {
            this.y.y(tVar);
            this.n3.add(tVar);
        }
    }

    public class y implements t {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ c5.y f7766fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s.y f7768v;
        public final /* synthetic */ String y;

        public y(String str, s.y yVar, c5.y yVar2) {
            this.y = str;
            this.f7768v = yVar;
            this.f7766fb = yVar2;
        }

        @Override // androidx.lifecycle.t
        public void onStateChanged(@NonNull mt mtVar, @NonNull s.y yVar) {
            if (!s.y.ON_START.equals(yVar)) {
                if (s.y.ON_STOP.equals(yVar)) {
                    zn.this.f7761a.remove(this.y);
                    return;
                } else {
                    if (s.y.ON_DESTROY.equals(yVar)) {
                        zn.this.t(this.y);
                        return;
                    }
                    return;
                }
            }
            zn.this.f7761a.put(this.y, new gv<>(this.f7768v, this.f7766fb));
            if (zn.this.f7762fb.containsKey(this.y)) {
                Object obj = zn.this.f7762fb.get(this.y);
                zn.this.f7762fb.remove(this.y);
                this.f7768v.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) zn.this.f7764s.getParcelable(this.y);
            if (activityResult != null) {
                zn.this.f7764s.remove(this.y);
                this.f7768v.onActivityResult(this.f7766fb.parseResult(activityResult.n3(), activityResult.y()));
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: s.zn$zn, reason: collision with other inner class name */
    public class C0157zn<I> extends s.n3<I> {
        public final /* synthetic */ c5.y n3;
        public final /* synthetic */ String y;

        public C0157zn(String str, c5.y yVar) {
            this.y = str;
            this.n3 = yVar;
        }

        @Override // s.n3
        @NonNull
        public c5.y<I, ?> getContract() {
            return this.n3;
        }

        @Override // s.n3
        public void launch(I i, @Nullable ta.gv gvVar) throws Exception {
            Integer num = zn.this.zn.get(this.y);
            if (num != null) {
                zn.this.f7765v.add(this.y);
                try {
                    zn.this.a(num.intValue(), this.n3, i, gvVar);
                    return;
                } catch (Exception e4) {
                    zn.this.f7765v.remove(this.y);
                    throw e4;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.n3 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // s.n3
        public void unregister() {
            zn.this.t(this.y);
        }
    }

    public abstract <I, O> void a(int i, @NonNull c5.y<I, O> yVar, @SuppressLint({"UnknownNullness"}) I i5, @Nullable ta.gv gvVar);

    @NonNull
    public final <I, O> s.n3<I> c5(@NonNull String str, @NonNull mt mtVar, @NonNull c5.y<I, O> yVar, @NonNull s.y<O> yVar2) {
        s lifecycle = mtVar.getLifecycle();
        if (lifecycle.n3().n3(s.n3.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + mtVar + " is attempting to register while current state is " + lifecycle.n3() + ". LifecycleOwners must call register before they are STARTED.");
        }
        f(str);
        v vVar = this.f7763gv.get(str);
        if (vVar == null) {
            vVar = new v(lifecycle);
        }
        vVar.y(new y(str, yVar2, yVar));
        this.f7763gv.put(str, vVar);
        return new n3(str, yVar);
    }

    public final void f(String str) {
        if (this.zn.get(str) != null) {
            return;
        }
        y(v(), str);
    }

    public final void fb(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f7765v = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.y = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f7764s.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.zn.containsKey(str)) {
                Integer numRemove = this.zn.remove(str);
                if (!this.f7764s.containsKey(str)) {
                    this.n3.remove(numRemove);
                }
            }
            y(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final <O> void gv(String str, int i, @Nullable Intent intent, @Nullable gv<O> gvVar) {
        if (gvVar == null || gvVar.y == null || !this.f7765v.contains(str)) {
            this.f7762fb.remove(str);
            this.f7764s.putParcelable(str, new ActivityResult(i, intent));
        } else {
            gvVar.y.onActivityResult(gvVar.n3.parseResult(i, intent));
            this.f7765v.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <I, O> s.n3<I> i9(@NonNull String str, @NonNull c5.y<I, O> yVar, @NonNull s.y<O> yVar2) {
        f(str);
        this.f7761a.put(str, new gv<>(yVar2, yVar));
        if (this.f7762fb.containsKey(str)) {
            Object obj = this.f7762fb.get(str);
            this.f7762fb.remove(str);
            yVar2.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f7764s.getParcelable(str);
        if (activityResult != null) {
            this.f7764s.remove(str);
            yVar2.onActivityResult(yVar.parseResult(activityResult.n3(), activityResult.y()));
        }
        return new C0157zn(str, yVar);
    }

    public final boolean n3(int i, int i5, @Nullable Intent intent) {
        String str = this.n3.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        gv(str, i5, intent, this.f7761a.get(str));
        return true;
    }

    public final void s(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.zn.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.zn.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f7765v));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f7764s.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.y);
    }

    public final void t(@NonNull String str) {
        Integer numRemove;
        if (!this.f7765v.contains(str) && (numRemove = this.zn.remove(str)) != null) {
            this.n3.remove(numRemove);
        }
        this.f7761a.remove(str);
        if (this.f7762fb.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f7762fb.get(str));
            this.f7762fb.remove(str);
        }
        if (this.f7764s.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f7764s.getParcelable(str));
            this.f7764s.remove(str);
        }
        v vVar = this.f7763gv.get(str);
        if (vVar != null) {
            vVar.n3();
            this.f7763gv.remove(str);
        }
    }

    public final int v() {
        int iNextInt = this.y.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.n3.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iNextInt = this.y.nextInt(2147418112);
        }
    }

    public final void y(int i, String str) {
        this.n3.put(Integer.valueOf(i), str);
        this.zn.put(str, Integer.valueOf(i));
    }

    public final <O> boolean zn(int i, @SuppressLint({"UnknownNullness"}) O o) {
        s.y<?> yVar;
        String str = this.n3.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        gv<?> gvVar = this.f7761a.get(str);
        if (gvVar == null || (yVar = gvVar.y) == null) {
            this.f7764s.remove(str);
            this.f7762fb.put(str, o);
            return true;
        }
        if (!this.f7765v.remove(str)) {
            return true;
        }
        yVar.onActivityResult(o);
        return true;
    }
}
