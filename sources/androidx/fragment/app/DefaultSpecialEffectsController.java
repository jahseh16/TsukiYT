package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qn.f7;
import qn.ud;
import qn.ut;
import ta.i4;
import yt.a;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    public static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, a signal, boolean z) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.isPop = z;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;
        private final a signal;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, a signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.operation = operation;
            this.signal = signal;
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final a getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateAsOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            return stateAsOperationState == finalState || !(stateAsOperationState == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3, reason: invalid class name */
    public static final class AnonymousClass3 implements Animation.AnimationListener {
        final /* synthetic */ AnimationInfo $animationInfo;
        final /* synthetic */ SpecialEffectsController.Operation $operation;
        final /* synthetic */ View $viewToAnimate;
        final /* synthetic */ DefaultSpecialEffectsController this$0;

        public AnonymousClass3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, AnimationInfo animationInfo) {
            this.$operation = operation;
            this.this$0 = defaultSpecialEffectsController;
            this.$viewToAnimate = view;
            this.$animationInfo = animationInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAnimationEnd$lambda$0(DefaultSpecialEffectsController this$0, View view, AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
            this$0.getContainer().endViewTransition(view);
            animationInfo.completeSpecialEffect();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ViewGroup container = this.this$0.getContainer();
            final DefaultSpecialEffectsController defaultSpecialEffectsController = this.this$0;
            final View view = this.$viewToAnimate;
            final AnimationInfo animationInfo = this.$animationInfo;
            container.post(new Runnable() { // from class: androidx.fragment.app.zn
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.AnonymousClass3.onAnimationEnd$lambda$0(defaultSpecialEffectsController, view, animationInfo);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        finalState.applyState(view);
    }

    private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (f7.y(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                captureTransitioningViews(arrayList, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.applyContainerChanges(operation);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        String strYt = ut.yt(view);
        if (strYt != null) {
            map.put(strYt, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(map, child);
                }
            }
        }
    }

    private final void retainMatchingViews(x4.y<String, View> yVar, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = yVar.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Map.Entry<String, View> entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(CollectionsKt.contains(collection, ut.yt(entry.getValue())));
            }
        });
    }

    private final void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z, Map<SpecialEffectsController.Operation, Boolean> map) {
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z5 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (Intrinsics.areEqual(map.get(operation), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z7 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z7) {
                                list2.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.startAnimations.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator anim) {
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z7) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View viewToAnimate = view;
                                        Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
                            }
                            animationInfo.getSignal().n3(new a.n3() { // from class: nf.y
                                @Override // yt.a.n3
                                public final void y() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z5 = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (z5) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation3 = animation2.animation;
                if (animation3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation3);
                    animationInfo2.completeSpecialEffect();
                } else {
                    getContainer().startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                    endViewTransitionAnimation.setAnimationListener(new AnonymousClass3(operation2, this, view2, animationInfo2));
                    view2.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has started.");
                    }
                }
                animationInfo2.getSignal().n3(new a.n3() { // from class: androidx.fragment.app.y
                    @Override // yt.a.n3
                    public final void y() {
                        DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController this$0, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, boolean z, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        String str;
        String str2;
        Object obj;
        View view;
        Object obj2;
        String str3;
        Object obj3;
        ArrayList arrayList;
        ArrayList<View> arrayList2;
        View view2;
        final ArrayList<View> arrayList3;
        LinkedHashMap linkedHashMap;
        SpecialEffectsController.Operation operation3;
        View view3;
        ArrayList arrayList4;
        FragmentTransitionImpl fragmentTransitionImpl;
        LinkedHashMap linkedHashMap2;
        View view4;
        Rect rect;
        FragmentTransitionImpl fragmentTransitionImpl2;
        final FragmentTransitionImpl fragmentTransitionImpl3;
        Object obj4;
        View view5;
        final Rect rect2;
        final View view6;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        final boolean z5 = z;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (!((TransitionInfo) obj5).isVisibilityUnchanged()) {
                arrayList5.add(obj5);
            }
        }
        ArrayList<TransitionInfo> arrayList6 = new ArrayList();
        for (Object obj6 : arrayList5) {
            if (((TransitionInfo) obj6).getHandlingImpl() != null) {
                arrayList6.add(obj6);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl4 = null;
        for (TransitionInfo transitionInfo : arrayList6) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl4 != null && handlingImpl != fragmentTransitionImpl4) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl4 = handlingImpl;
        }
        if (fragmentTransitionImpl4 == null) {
            for (TransitionInfo transitionInfo2 : list) {
                linkedHashMap3.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap3;
        }
        View view7 = new View(getContainer().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        x4.y yVar = new x4.y();
        Iterator<TransitionInfo> it = list.iterator();
        View view8 = null;
        Object obj7 = null;
        boolean z7 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            str = FragmentManager.TAG;
            if (!zHasNext) {
                break;
            }
            TransitionInfo next = it.next();
            if (!next.hasSharedElementTransition() || operation == null || operation2 == null) {
                fragmentTransitionImpl = fragmentTransitionImpl4;
                Rect rect4 = rect3;
                linkedHashMap2 = linkedHashMap3;
                view4 = view7;
                rect = rect4;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                yVar = yVar;
                view8 = view8;
                fragmentTransitionImpl4 = fragmentTransitionImpl;
                z5 = z;
                Rect rect5 = rect;
                view7 = view4;
                linkedHashMap3 = linkedHashMap2;
                rect3 = rect5;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl4.wrapTransitionInSet(fragmentTransitionImpl4.cloneTransition(next.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                View view9 = view8;
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view10 = view7;
                Rect rect6 = rect3;
                int i = 0;
                while (i < size) {
                    int i5 = size;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    size = i5;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                Pair pair = !z5 ? TuplesKt.to(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback()) : TuplesKt.to(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                i4 i4Var = (i4) pair.component1();
                i4 i4Var2 = (i4) pair.component2();
                int size2 = sharedElementSourceNames.size();
                int i8 = 0;
                while (i8 < size2) {
                    yVar.put(sharedElementSourceNames.get(i8), sharedElementTargetNames2.get(i8));
                    i8++;
                    size2 = size2;
                    objWrapTransitionInSet = objWrapTransitionInSet;
                }
                Object obj8 = objWrapTransitionInSet;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    for (Iterator<String> it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v(FragmentManager.TAG, "Name: " + it2.next());
                    }
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v(FragmentManager.TAG, "Name: " + it3.next());
                    }
                }
                x4.y<String, View> yVar2 = new x4.y<>();
                View view11 = operation.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view11, "firstOut.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(yVar2, view11);
                yVar2.p(sharedElementSourceNames);
                if (i4Var != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation);
                    }
                    i4Var.gv(sharedElementSourceNames, yVar2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i10 = size3 - 1;
                            String str4 = sharedElementSourceNames.get(size3);
                            View view12 = (View) yVar2.get(str4);
                            if (view12 == null) {
                                yVar.remove(str4);
                                fragmentTransitionImpl2 = fragmentTransitionImpl4;
                            } else {
                                fragmentTransitionImpl2 = fragmentTransitionImpl4;
                                if (!Intrinsics.areEqual(str4, ut.yt(view12))) {
                                    yVar.put(ut.yt(view12), (String) yVar.remove(str4));
                                }
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size3 = i10;
                            fragmentTransitionImpl4 = fragmentTransitionImpl2;
                        }
                    } else {
                        fragmentTransitionImpl2 = fragmentTransitionImpl4;
                    }
                } else {
                    fragmentTransitionImpl2 = fragmentTransitionImpl4;
                    yVar.p(yVar2.keySet());
                }
                final x4.y<String, View> yVar3 = new x4.y<>();
                View view13 = operation2.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view13, "lastIn.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(yVar3, view13);
                yVar3.p(sharedElementTargetNames2);
                yVar3.p(yVar.values());
                if (i4Var2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                    }
                    i4Var2.gv(sharedElementTargetNames2, yVar3);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i11 = size4 - 1;
                            String name = sharedElementTargetNames2.get(size4);
                            View view14 = yVar3.get(name);
                            if (view14 == null) {
                                Intrinsics.checkNotNullExpressionValue(name, "name");
                                String strFindKeyForValue = FragmentTransition.findKeyForValue(yVar, name);
                                if (strFindKeyForValue != null) {
                                    yVar.remove(strFindKeyForValue);
                                }
                            } else if (!Intrinsics.areEqual(name, ut.yt(view14))) {
                                Intrinsics.checkNotNullExpressionValue(name, "name");
                                String strFindKeyForValue2 = FragmentTransition.findKeyForValue(yVar, name);
                                if (strFindKeyForValue2 != null) {
                                    yVar.put(strFindKeyForValue2, ut.yt(view14));
                                }
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size4 = i11;
                        }
                    }
                } else {
                    FragmentTransition.retainValues(yVar, yVar3);
                }
                Collection<String> collectionKeySet = yVar.keySet();
                Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                defaultSpecialEffectsController.retainMatchingViews(yVar2, collectionKeySet);
                Collection<String> collectionValues = yVar.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                defaultSpecialEffectsController.retainMatchingViews(yVar3, collectionValues);
                if (yVar.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    view8 = view9;
                    linkedHashMap3 = linkedHashMap4;
                    view7 = view10;
                    rect3 = rect6;
                    fragmentTransitionImpl4 = fragmentTransitionImpl2;
                    obj7 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z5, yVar2, true);
                    ud.y(getContainer(), new Runnable() { // from class: nf.zn
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(operation2, operation, z5, yVar3);
                        }
                    });
                    arrayList7.addAll(yVar2.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        fragmentTransitionImpl3 = fragmentTransitionImpl2;
                        obj4 = obj8;
                        view5 = view9;
                    } else {
                        view5 = (View) yVar2.get(sharedElementSourceNames.get(0));
                        fragmentTransitionImpl3 = fragmentTransitionImpl2;
                        obj4 = obj8;
                        fragmentTransitionImpl3.setEpicenter(obj4, view5);
                    }
                    arrayList8.addAll(yVar3.values());
                    if (sharedElementTargetNames2.isEmpty() || (view6 = yVar3.get(sharedElementTargetNames2.get(0))) == null) {
                        rect2 = rect6;
                        view4 = view10;
                        fragmentTransitionImpl3.setSharedElementTargets(obj4, view4, arrayList7);
                        Object obj9 = obj4;
                        ArrayList<View> arrayList9 = arrayList8;
                        View view15 = view5;
                        fragmentTransitionImpl = fragmentTransitionImpl3;
                        rect = rect2;
                        fragmentTransitionImpl3.scheduleRemoveTargets(obj4, null, null, null, null, obj9, arrayList9);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(operation, bool);
                        linkedHashMap2.put(operation2, bool);
                        arrayList8 = arrayList9;
                        arrayList7 = arrayList7;
                        view8 = view15;
                        yVar = yVar;
                        obj7 = obj9;
                        fragmentTransitionImpl4 = fragmentTransitionImpl;
                        z5 = z;
                        Rect rect52 = rect;
                        view7 = view4;
                        linkedHashMap3 = linkedHashMap2;
                        rect3 = rect52;
                    } else {
                        rect2 = rect6;
                        ud.y(getContainer(), new Runnable() { // from class: nf.gv
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.startTransitions$lambda$10(fragmentTransitionImpl3, view6, rect2);
                            }
                        });
                        view4 = view10;
                        z7 = true;
                        fragmentTransitionImpl3.setSharedElementTargets(obj4, view4, arrayList7);
                        Object obj92 = obj4;
                        ArrayList<View> arrayList92 = arrayList8;
                        View view152 = view5;
                        fragmentTransitionImpl = fragmentTransitionImpl3;
                        rect = rect2;
                        fragmentTransitionImpl3.scheduleRemoveTargets(obj4, null, null, null, null, obj92, arrayList92);
                        Boolean bool2 = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(operation, bool2);
                        linkedHashMap2.put(operation2, bool2);
                        arrayList8 = arrayList92;
                        arrayList7 = arrayList7;
                        view8 = view152;
                        yVar = yVar;
                        obj7 = obj92;
                        fragmentTransitionImpl4 = fragmentTransitionImpl;
                        z5 = z;
                        Rect rect522 = rect;
                        view7 = view4;
                        linkedHashMap3 = linkedHashMap2;
                        rect3 = rect522;
                    }
                }
            }
        }
        View view16 = view8;
        x4.y yVar4 = yVar;
        ArrayList<View> arrayList10 = arrayList8;
        FragmentTransitionImpl fragmentTransitionImpl5 = fragmentTransitionImpl4;
        Rect rect7 = rect3;
        LinkedHashMap linkedHashMap5 = linkedHashMap3;
        View view17 = view7;
        ArrayList arrayList11 = new ArrayList();
        Object objMergeTransitionsTogether = null;
        Object objMergeTransitionsTogether2 = null;
        for (TransitionInfo transitionInfo3 : list) {
            if (transitionInfo3.isVisibilityUnchanged()) {
                linkedHashMap5.put(transitionInfo3.getOperation(), Boolean.FALSE);
                transitionInfo3.completeSpecialEffect();
            } else {
                Object objCloneTransition = fragmentTransitionImpl5.cloneTransition(transitionInfo3.getTransition());
                SpecialEffectsController.Operation operation4 = transitionInfo3.getOperation();
                boolean z8 = obj7 != null && (operation4 == operation || operation4 == operation2);
                if (objCloneTransition != null) {
                    LinkedHashMap linkedHashMap6 = linkedHashMap5;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj10 = objMergeTransitionsTogether;
                    View view18 = operation4.getFragment().mView;
                    Object obj11 = obj7;
                    Intrinsics.checkNotNullExpressionValue(view18, "operation.fragment.mView");
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList12, view18);
                    if (z8) {
                        if (operation4 == operation) {
                            arrayList12.removeAll(CollectionsKt.toSet(arrayList7));
                        } else {
                            arrayList12.removeAll(CollectionsKt.toSet(arrayList10));
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        fragmentTransitionImpl5.addTarget(objCloneTransition, view17);
                        obj = obj10;
                        view2 = view17;
                        operation3 = operation4;
                        str3 = str;
                        obj3 = objMergeTransitionsTogether2;
                        arrayList = arrayList11;
                        arrayList3 = arrayList12;
                        view = view16;
                        linkedHashMap = linkedHashMap6;
                        obj2 = obj11;
                        arrayList2 = arrayList7;
                    } else {
                        fragmentTransitionImpl5.addTargets(objCloneTransition, arrayList12);
                        obj = obj10;
                        view = view16;
                        obj2 = obj11;
                        str3 = str;
                        obj3 = objMergeTransitionsTogether2;
                        arrayList = arrayList11;
                        arrayList2 = arrayList7;
                        view2 = view17;
                        arrayList3 = arrayList12;
                        linkedHashMap = linkedHashMap6;
                        fragmentTransitionImpl5.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList12, null, null, null, null);
                        if (operation4.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation4;
                            list2.remove(operation3);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList3);
                            arrayList13.remove(operation3.getFragment().mView);
                            fragmentTransitionImpl5.scheduleHideFragmentView(objCloneTransition, operation3.getFragment().mView, arrayList13);
                            ud.y(getContainer(), new Runnable() { // from class: nf.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList3);
                                }
                            });
                        } else {
                            operation3 = operation4;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList4 = arrayList;
                        arrayList4.addAll(arrayList3);
                        if (z7) {
                            fragmentTransitionImpl5.setEpicenter(objCloneTransition, rect7);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        arrayList4 = arrayList;
                        fragmentTransitionImpl5.setEpicenter(objCloneTransition, view3);
                    }
                    linkedHashMap.put(operation3, Boolean.TRUE);
                    if (transitionInfo3.isOverlapAllowed()) {
                        objMergeTransitionsTogether2 = fragmentTransitionImpl5.mergeTransitionsTogether(obj3, objCloneTransition, null);
                        linkedHashMap5 = linkedHashMap;
                        arrayList11 = arrayList4;
                        arrayList7 = arrayList2;
                        objMergeTransitionsTogether = obj;
                    } else {
                        objMergeTransitionsTogether2 = obj3;
                        linkedHashMap5 = linkedHashMap;
                        objMergeTransitionsTogether = fragmentTransitionImpl5.mergeTransitionsTogether(obj, objCloneTransition, null);
                        arrayList11 = arrayList4;
                        arrayList7 = arrayList2;
                    }
                    obj7 = obj2;
                    str = str3;
                    defaultSpecialEffectsController = this;
                    view16 = view3;
                    view17 = view2;
                } else if (!z8) {
                    linkedHashMap5.put(operation4, Boolean.FALSE);
                    transitionInfo3.completeSpecialEffect();
                }
            }
        }
        String str5 = str;
        ArrayList<View> arrayList14 = arrayList7;
        LinkedHashMap linkedHashMap7 = linkedHashMap5;
        Object obj12 = obj7;
        ArrayList arrayList15 = arrayList11;
        Object objMergeTransitionsInSequence = fragmentTransitionImpl5.mergeTransitionsInSequence(objMergeTransitionsTogether2, objMergeTransitionsTogether, obj12);
        if (objMergeTransitionsInSequence == null) {
            return linkedHashMap7;
        }
        ArrayList<TransitionInfo> arrayList16 = new ArrayList();
        for (Object obj13 : list) {
            if (!((TransitionInfo) obj13).isVisibilityUnchanged()) {
                arrayList16.add(obj13);
            }
        }
        for (final TransitionInfo transitionInfo4 : arrayList16) {
            Object transition = transitionInfo4.getTransition();
            final SpecialEffectsController.Operation operation5 = transitionInfo4.getOperation();
            boolean z9 = obj12 != null && (operation5 == operation || operation5 == operation2);
            if (transition == null && !z9) {
                str2 = str5;
            } else if (ut.q9(getContainer())) {
                str2 = str5;
                fragmentTransitionImpl5.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(transitionInfo4, operation5);
                    }
                });
            } else {
                if (FragmentManager.isLoggingEnabled(2)) {
                    str2 = str5;
                    Log.v(str2, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation5);
                } else {
                    str2 = str5;
                }
                transitionInfo4.completeSpecialEffect();
            }
            str5 = str2;
        }
        String str6 = str5;
        if (!ut.q9(getContainer())) {
            return linkedHashMap7;
        }
        FragmentTransition.setViewVisibility(arrayList15, 4);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl5.prepareSetNameOverridesReordered(arrayList10);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(str6, ">>>>> Beginning transition <<<<<");
            Log.v(str6, ">>>>> SharedElementFirstOutViews <<<<<");
            for (View sharedElementFirstOutViews : arrayList14) {
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view19 = sharedElementFirstOutViews;
                Log.v(str6, "View: " + view19 + " Name: " + ut.yt(view19));
            }
            Log.v(str6, ">>>>> SharedElementLastInViews <<<<<");
            for (View sharedElementLastInViews : arrayList10) {
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view20 = sharedElementLastInViews;
                Log.v(str6, "View: " + view20 + " Name: " + ut.yt(view20));
            }
        }
        fragmentTransitionImpl5.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl5.setNameOverridesReordered(getContainer(), arrayList14, arrayList10, arrayListPrepareSetNameOverridesReordered, yVar4);
        FragmentTransition.setViewVisibility(arrayList15, 0);
        fragmentTransitionImpl5.swapSharedElementTargets(obj12, arrayList14, arrayList10);
        return linkedHashMap7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, x4.y lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z, lastInViews, false);
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List) list)).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeOperations(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.executeOperations(java.util.List, boolean):void");
    }

    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, a signal, boolean z, boolean z5) {
            Object returnTransition;
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == state ? z ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z5 ? z ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
