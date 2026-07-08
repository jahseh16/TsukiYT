package h2;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fb<S> extends c5<S> {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f5273co;

    @Nullable
    public CalendarConstraints d0;

    @Nullable
    public DateSelector<S> f3;

    public class y extends s<S> {
        public y() {
        }

        @Override // h2.s
        public void y(S s3) {
            Iterator<s<S>> it = fb.this.f5272fb.iterator();
            while (it.hasNext()) {
                it.next().y(s3);
            }
        }
    }

    @NonNull
    public static <T> fb<T> j4(DateSelector<T> dateSelector, int i, @NonNull CalendarConstraints calendarConstraints) {
        fb<T> fbVar = new fb<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        fbVar.setArguments(bundle);
        return fbVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f5273co = bundle.getInt("THEME_RES_ID_KEY");
        this.f3 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.d0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f3.u(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f5273co)), viewGroup, bundle, this.d0, new y());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5273co);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d0);
    }
}
