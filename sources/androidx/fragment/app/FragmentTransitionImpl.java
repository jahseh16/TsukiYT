package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import qn.ud;
import qn.ut;
import yt.a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class FragmentTransitionImpl {
    public static void bfsAddViewChildren(List<View> list, View view) {
        int size = list.size();
        if (containedBeforeIndex(list, view, size)) {
            return;
        }
        if (ut.yt(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    if (!containedBeforeIndex(list, childAt, size) && ut.yt(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean containedBeforeIndex(List<View> list, View view, int i) {
        for (int i5 = 0; i5 < i; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void addTarget(@NonNull Object obj, @NonNull View view);

    public abstract void addTargets(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    public abstract void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Object obj);

    public abstract boolean canHandle(@NonNull Object obj);

    public abstract Object cloneTransition(@Nullable Object obj);

    public void getBoundsOnScreen(View view, Rect rect) {
        if (ut.ut(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object mergeTransitionsInSequence(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3);

    public abstract Object mergeTransitionsTogether(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3);

    public ArrayList<String> prepareSetNameOverridesReordered(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(ut.yt(view));
            ut.gq(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void removeTarget(@NonNull Object obj, @NonNull View view);

    public abstract void replaceTargets(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2);

    public abstract void scheduleHideFragmentView(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void scheduleRemoveTargets(@NonNull Object obj, @Nullable Object obj2, @Nullable ArrayList<View> arrayList, @Nullable Object obj3, @Nullable ArrayList<View> arrayList2, @Nullable Object obj4, @Nullable ArrayList<View> arrayList3);

    public abstract void setEpicenter(@NonNull Object obj, @NonNull Rect rect);

    public abstract void setEpicenter(@NonNull Object obj, @Nullable View view);

    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull a aVar, @NonNull Runnable runnable) {
        runnable.run();
    }

    public void setNameOverridesReordered(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strYt = ut.yt(view2);
            arrayList4.add(strYt);
            if (strYt != null) {
                ut.gq(view2, (String) null);
                String str = map.get(strYt);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i5))) {
                        ut.gq(arrayList2.get(i5), strYt);
                        break;
                    }
                    i5++;
                }
            }
        }
        ud.y(view, new Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i8 = 0; i8 < size; i8++) {
                    ut.gq((View) arrayList2.get(i8), (String) arrayList3.get(i8));
                    ut.gq((View) arrayList.get(i8), (String) arrayList4.get(i8));
                }
            }
        });
    }

    public abstract void setSharedElementTargets(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void swapSharedElementTargets(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2);

    public abstract Object wrapTransitionInSet(@Nullable Object obj);
}
