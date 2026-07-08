package wz;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R$style;

/* JADX INFO: loaded from: classes.dex */
public class gv extends ContextWrapper {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public Configuration f9061gv;
    public Resources.Theme n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Resources f9062v;
    public int y;
    public LayoutInflater zn;

    public gv() {
        super(null);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return n3();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.zn == null) {
            this.zn = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.zn;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.n3;
        if (theme != null) {
            return theme;
        }
        if (this.y == 0) {
            this.y = R$style.f412gv;
        }
        gv();
        return this.n3;
    }

    public final void gv() {
        boolean z = this.n3 == null;
        if (z) {
            this.n3 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.n3.setTo(theme);
            }
        }
        v(this.n3, this.y, z);
    }

    public final Resources n3() {
        if (this.f9062v == null) {
            Configuration configuration = this.f9061gv;
            if (configuration == null) {
                this.f9062v = super.getResources();
            } else {
                this.f9062v = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f9062v;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.y != i) {
            this.y = i;
            gv();
        }
    }

    public void v(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public void y(Configuration configuration) {
        if (this.f9062v != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f9061gv != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f9061gv = new Configuration(configuration);
    }

    public int zn() {
        return this.y;
    }

    public gv(Context context, int i) {
        super(context);
        this.y = i;
    }

    public gv(Context context, Resources.Theme theme) {
        super(context);
        this.n3 = theme;
    }
}
