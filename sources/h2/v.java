package h2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class v extends BaseAdapter {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f5279s;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f5280fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5281v;

    @NonNull
    public final Calendar y;

    static {
        f5279s = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public v() {
        Calendar calendarF = xc.f();
        this.y = calendarF;
        this.f5281v = calendarF.getMaximum(7);
        this.f5280fb = calendarF.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5281v;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.w, viewGroup, false);
        }
        this.y.set(7, n3(i));
        textView.setText(this.y.getDisplayName(7, f5279s, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R$string.f2290wz), this.y.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public final int n3(int i) {
        int i5 = i + this.f5280fb;
        int i8 = this.f5281v;
        return i5 > i8 ? i5 - i8 : i5;
    }

    @Override // android.widget.Adapter
    @Nullable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.f5281v) {
            return null;
        }
        return Integer.valueOf(n3(i));
    }
}
