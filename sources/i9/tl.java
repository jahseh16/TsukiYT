package i9;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import qn.ut;
import w.c5;
import w.o0;
import w.u;
import x4.s;

/* JADX INFO: loaded from: classes.dex */
public class tl {
    public final Object[] y = new Object[2];
    public static final Class<?>[] n3 = {Context.class, AttributeSet.class};
    public static final int[] zn = {R.attr.onClick};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final String[] f5598gv = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s<String, Constructor<? extends View>> f5599v = new s<>();

    public static Context z(Context context, AttributeSet attributeSet, boolean z, boolean z5) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.fj, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(R$styleable.d9, 0) : 0;
        if (z5 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.da, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof wz.gv) && ((wz.gv) context).zn() == resourceId) ? context : new wz.gv(context, resourceId) : context;
    }

    @NonNull
    public AppCompatEditText a(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @NonNull
    public w.wz c5(Context context, AttributeSet attributeSet) {
        return new w.wz(context, attributeSet);
    }

    public final View co(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.y;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return mt(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f5598gv;
                if (i >= strArr.length) {
                    return null;
                }
                View viewMt = mt(context, str, strArr[i]);
                if (viewMt != null) {
                    return viewMt;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.y;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    @NonNull
    public w.mt f(Context context, AttributeSet attributeSet) {
        return new w.mt(context, attributeSet);
    }

    @NonNull
    public AppCompatImageButton fb(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @NonNull
    public w.s gv(Context context, AttributeSet attributeSet) {
        return new w.s(context, attributeSet);
    }

    @NonNull
    public w.p i9(Context context, AttributeSet attributeSet) {
        return new w.p(context, attributeSet);
    }

    public final View mt(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        s<String, Constructor<? extends View>> sVar = f5599v;
        Constructor<? extends View> constructor = sVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(n3);
            sVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.y);
    }

    @NonNull
    public w.a n3(Context context, AttributeSet attributeSet) {
        return new w.a(context, attributeSet);
    }

    public final View p(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z, boolean z5, boolean z7, boolean z8) {
        Context context2;
        View viewF;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z5 || z7) {
            context2 = z(context2, attributeSet, z5, z7);
        }
        if (z8) {
            context2 = o0.n3(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewF = f(context2, attributeSet);
                r(viewF, str);
                break;
            case "CheckedTextView":
                viewF = v(context2, attributeSet);
                r(viewF, str);
                break;
            case "MultiAutoCompleteTextView":
                viewF = c5(context2, attributeSet);
                r(viewF, str);
                break;
            case "TextView":
                viewF = wz(context2, attributeSet);
                r(viewF, str);
                break;
            case "ImageButton":
                viewF = fb(context2, attributeSet);
                r(viewF, str);
                break;
            case "SeekBar":
                viewF = t(context2, attributeSet);
                r(viewF, str);
                break;
            case "Spinner":
                viewF = tl(context2, attributeSet);
                r(viewF, str);
                break;
            case "RadioButton":
                viewF = i9(context2, attributeSet);
                r(viewF, str);
                break;
            case "ToggleButton":
                viewF = xc(context2, attributeSet);
                r(viewF, str);
                break;
            case "ImageView":
                viewF = s(context2, attributeSet);
                r(viewF, str);
                break;
            case "AutoCompleteTextView":
                viewF = n3(context2, attributeSet);
                r(viewF, str);
                break;
            case "CheckBox":
                viewF = gv(context2, attributeSet);
                r(viewF, str);
                break;
            case "EditText":
                viewF = a(context2, attributeSet);
                r(viewF, str);
                break;
            case "Button":
                viewF = zn(context2, attributeSet);
                r(viewF, str);
                break;
            default:
                viewF = w(context2, str, attributeSet);
                break;
        }
        if (viewF == null && context != context2) {
            viewF = co(context2, str, attributeSet);
        }
        if (viewF != null) {
            y(viewF, attributeSet);
        }
        return viewF;
    }

    public final void r(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @NonNull
    public AppCompatImageView s(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    public AppCompatSeekBar t(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSpinner tl(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    public c5 v(Context context, AttributeSet attributeSet) {
        return new c5(context, attributeSet);
    }

    @Nullable
    public View w(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    @NonNull
    public AppCompatTextView wz(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @NonNull
    public u xc(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public final void y(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && ut.qn(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zn);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new y(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public AppCompatButton zn(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }
}
