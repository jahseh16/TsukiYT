package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.xc;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@xc.n3("activity")
public class y extends xc<n3> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0026y f1017v = new C0026y(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Activity f1018gv;
    public final Context zn;

    public static final class gv extends Lambda implements Function1<Context, Context> {
        public static final gv y = new gv();

        public gv() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public static class n3 extends s {
        public Intent f3;
        public String n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(xc<? extends n3> activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        public final n3 a8(String str) {
            if (this.f3 == null) {
                this.f3 = new Intent();
            }
            Intent intent = this.f3;
            Intrinsics.checkNotNull(intent);
            intent.setPackage(str);
            return this;
        }

        public final n3 d(ComponentName componentName) {
            if (this.f3 == null) {
                this.f3 = new Intent();
            }
            Intent intent = this.f3;
            Intrinsics.checkNotNull(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final ComponentName d0() {
            Intent intent = this.f3;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @Override // androidx.navigation.s
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof n3) && super.equals(obj)) {
                Intent intent = this.f3;
                if ((intent != null ? intent.filterEquals(((n3) obj).f3) : ((n3) obj).f3 == null) && Intrinsics.areEqual(this.n, ((n3) obj).n)) {
                    return true;
                }
            }
            return false;
        }

        public final String fh() {
            return this.n;
        }

        @Override // androidx.navigation.s
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f3;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.n;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.s
        public boolean i4() {
            return false;
        }

        public final String mg(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            return StringsKt.replace$default(str, "${applicationId}", packageName, false, 4, (Object) null);
        }

        @Override // androidx.navigation.s
        public void mt(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.mt(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R$styleable.y);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            a8(mg(context, typedArrayObtainAttributes.getString(R$styleable.f884a)));
            String string = typedArrayObtainAttributes.getString(R$styleable.n3);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                d(new ComponentName(context, string));
            }
            ta(typedArrayObtainAttributes.getString(R$styleable.zn));
            String strMg = mg(context, typedArrayObtainAttributes.getString(R$styleable.f887gv));
            if (strMg != null) {
                z6(Uri.parse(strMg));
            }
            ud(mg(context, typedArrayObtainAttributes.getString(R$styleable.f890v)));
            typedArrayObtainAttributes.recycle();
        }

        public final String n() {
            Intent intent = this.f3;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final Intent rz() {
            return this.f3;
        }

        public final n3 ta(String str) {
            if (this.f3 == null) {
                this.f3 = new Intent();
            }
            Intent intent = this.f3;
            Intrinsics.checkNotNull(intent);
            intent.setAction(str);
            return this;
        }

        @Override // androidx.navigation.s
        public String toString() {
            ComponentName componentNameD0 = d0();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentNameD0 != null) {
                sb.append(" class=");
                sb.append(componentNameD0.getClassName());
            } else {
                String strN = n();
                if (strN != null) {
                    sb.append(" action=");
                    sb.append(strN);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        public final n3 ud(String str) {
            this.n = str;
            return this;
        }

        public final n3 z6(Uri uri) {
            if (this.f3 == null) {
                this.f3 = new Intent();
            }
            Intent intent = this.f3;
            Intrinsics.checkNotNull(intent);
            intent.setData(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.y$y, reason: collision with other inner class name */
    public static final class C0026y {
        public /* synthetic */ C0026y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0026y() {
        }
    }

    public static final class zn implements xc.y {
        public final int y;

        public final int n3() {
            return this.y;
        }

        public final ta.gv y() {
            return null;
        }
    }

    public y(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        this.zn = context;
        Iterator it = SequencesKt.generateSequence(context, gv.y).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f1018gv = (Activity) next;
    }

    @Override // androidx.navigation.xc
    public boolean f() {
        Activity activity = this.f1018gv;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.xc
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public n3 y() {
        return new n3(this);
    }

    @Override // androidx.navigation.xc
    /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
    public s gv(n3 destination, Bundle bundle, t tVar, xc.y yVar) {
        Intent intent;
        int intExtra;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.rz() == null) {
            throw new IllegalStateException(("Destination " + destination.i9() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.rz());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strFh = destination.fh();
            if (strFh != null && strFh.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strFh);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strFh);
                    }
                    matcher.appendReplacement(stringBuffer, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = yVar instanceof zn;
        if (z) {
            intent2.addFlags(((zn) yVar).n3());
        }
        if (this.f1018gv == null) {
            intent2.addFlags(268435456);
        }
        if (tVar != null && tVar.s()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f1018gv;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.i9());
        Resources resources = this.zn.getResources();
        if (tVar != null) {
            int iZn = tVar.zn();
            int iGv = tVar.gv();
            if ((iZn <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iZn), "animator")) && (iGv <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iGv), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iZn);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iGv);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iZn) + " and popExit resource " + resources.getResourceName(iGv) + " when launching " + destination);
            }
        }
        if (z) {
            ((zn) yVar).y();
            this.zn.startActivity(intent2);
        } else {
            this.zn.startActivity(intent2);
        }
        if (tVar == null || this.f1018gv == null) {
            return null;
        }
        int iY = tVar.y();
        int iN3 = tVar.n3();
        if ((iY <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iY), "animator")) && (iN3 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(iN3), "animator"))) {
            if (iY < 0 && iN3 < 0) {
                return null;
            }
            this.f1018gv.overridePendingTransition(RangesKt.coerceAtLeast(iY, 0), RangesKt.coerceAtLeast(iN3, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iY) + " and exit resource " + resources.getResourceName(iN3) + "when launching " + destination);
        return null;
    }
}
