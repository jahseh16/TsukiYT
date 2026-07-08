package u0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateFlow<Set<androidx.navigation.zn>> f8318a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f8319gv;
    public final MutableStateFlow<List<androidx.navigation.zn>> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final StateFlow<List<androidx.navigation.zn>> f8320v;
    public final ReentrantLock y = new ReentrantLock(true);
    public final MutableStateFlow<Set<androidx.navigation.zn>> zn;

    public wz() {
        MutableStateFlow<List<androidx.navigation.zn>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.n3 = MutableStateFlow;
        MutableStateFlow<Set<androidx.navigation.zn>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this.zn = MutableStateFlow2;
        this.f8320v = FlowKt.asStateFlow(MutableStateFlow);
        this.f8318a = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public void a(androidx.navigation.zn backStackEntry) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            List<androidx.navigation.zn> mutableList = CollectionsKt.toMutableList((Collection) this.f8320v.getValue());
            ListIterator<androidx.navigation.zn> listIterator = mutableList.listIterator(mutableList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (Intrinsics.areEqual(listIterator.previous().a(), backStackEntry.a())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            mutableList.set(iNextIndex, backStackEntry);
            this.n3.setValue(mutableList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void c5(androidx.navigation.zn popUpTo, boolean z) {
        androidx.navigation.zn znVarPrevious;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Set<androidx.navigation.zn> value = this.zn.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((androidx.navigation.zn) it.next()) == popUpTo) {
                    List<androidx.navigation.zn> value2 = this.f8320v.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((androidx.navigation.zn) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        MutableStateFlow<Set<androidx.navigation.zn>> mutableStateFlow = this.zn;
        mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), popUpTo));
        List<androidx.navigation.zn> value3 = this.f8320v.getValue();
        ListIterator<androidx.navigation.zn> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                znVarPrevious = null;
                break;
            }
            znVarPrevious = listIterator.previous();
            androidx.navigation.zn znVar = znVarPrevious;
            if (!Intrinsics.areEqual(znVar, popUpTo) && this.f8320v.getValue().lastIndexOf(znVar) < this.f8320v.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        androidx.navigation.zn znVar2 = znVarPrevious;
        if (znVar2 != null) {
            MutableStateFlow<Set<androidx.navigation.zn>> mutableStateFlow2 = this.zn;
            mutableStateFlow2.setValue(SetsKt.plus(mutableStateFlow2.getValue(), znVar2));
        }
        s(popUpTo, z);
    }

    public void f(androidx.navigation.zn backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<androidx.navigation.zn>> mutableStateFlow = this.n3;
            mutableStateFlow.setValue(CollectionsKt.plus(mutableStateFlow.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void fb(androidx.navigation.zn backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List<androidx.navigation.zn> value = this.f8320v.getValue();
        ListIterator<androidx.navigation.zn> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            androidx.navigation.zn znVarPrevious = listIterator.previous();
            if (Intrinsics.areEqual(znVarPrevious.a(), backStackEntry.a())) {
                MutableStateFlow<Set<androidx.navigation.zn>> mutableStateFlow = this.zn;
                mutableStateFlow.setValue(SetsKt.plus((Set<? extends androidx.navigation.zn>) SetsKt.plus(mutableStateFlow.getValue(), znVarPrevious), backStackEntry));
                a(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public final boolean gv() {
        return this.f8319gv;
    }

    public void i9(androidx.navigation.zn entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow<Set<androidx.navigation.zn>> mutableStateFlow = this.zn;
        mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), entry));
    }

    public final StateFlow<List<androidx.navigation.zn>> n3() {
        return this.f8320v;
    }

    public void s(androidx.navigation.zn popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.y;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<androidx.navigation.zn>> mutableStateFlow = this.n3;
            List<androidx.navigation.zn> value = mutableStateFlow.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (Intrinsics.areEqual((androidx.navigation.zn) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void t(androidx.navigation.zn backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Set<androidx.navigation.zn> value = this.zn.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((androidx.navigation.zn) it.next()) == backStackEntry) {
                    List<androidx.navigation.zn> value2 = this.f8320v.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((androidx.navigation.zn) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        androidx.navigation.zn znVar = (androidx.navigation.zn) CollectionsKt.lastOrNull(this.f8320v.getValue());
        if (znVar != null) {
            MutableStateFlow<Set<androidx.navigation.zn>> mutableStateFlow = this.zn;
            mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), znVar));
        }
        MutableStateFlow<Set<androidx.navigation.zn>> mutableStateFlow2 = this.zn;
        mutableStateFlow2.setValue(SetsKt.plus(mutableStateFlow2.getValue(), backStackEntry));
        f(backStackEntry);
    }

    public final void tl(boolean z) {
        this.f8319gv = z;
    }

    public void v(androidx.navigation.zn entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow<Set<androidx.navigation.zn>> mutableStateFlow = this.zn;
        mutableStateFlow.setValue(SetsKt.minus(mutableStateFlow.getValue(), entry));
    }

    public abstract androidx.navigation.zn y(androidx.navigation.s sVar, Bundle bundle);

    public final StateFlow<Set<androidx.navigation.zn>> zn() {
        return this.f8318a;
    }
}
