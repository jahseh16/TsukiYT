package im;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import ic.c5;

/* JADX INFO: loaded from: classes.dex */
public class y extends Paint {
    public y() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(c5.zn(i, 0, 255));
        } else {
            setColor((c5.zn(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public y(int i) {
        super(i);
    }

    public y(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public y(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }
}
