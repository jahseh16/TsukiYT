package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.AlertController;
import i9.f;

/* JADX INFO: loaded from: classes.dex */
public class y extends f implements DialogInterface {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final AlertController f573fb;

    /* JADX INFO: renamed from: androidx.appcompat.app.y$y, reason: collision with other inner class name */
    public static class C0010y {
        public final int n3;
        public final AlertController.a y;

        public C0010y(@NonNull Context context) {
            this(context, y.a(context, 0));
        }

        public C0010y a(int i) {
            AlertController.a aVar = this.y;
            aVar.f549s = aVar.y.getText(i);
            return this;
        }

        public C0010y c5(DialogInterface.OnCancelListener onCancelListener) {
            this.y.f537co = onCancelListener;
            return this;
        }

        @NonNull
        public y create() {
            y yVar = new y(this.y.y, this.n3);
            this.y.y(yVar.f573fb);
            yVar.setCancelable(this.y.f546mt);
            if (this.y.f546mt) {
                yVar.setCanceledOnTouchOutside(true);
            }
            yVar.setOnCancelListener(this.y.f537co);
            yVar.setOnDismissListener(this.y.z);
            DialogInterface.OnKeyListener onKeyListener = this.y.f548r;
            if (onKeyListener != null) {
                yVar.setOnKeyListener(onKeyListener);
            }
            return yVar;
        }

        public C0010y f(DialogInterface.OnKeyListener onKeyListener) {
            this.y.f548r = onKeyListener;
            return this;
        }

        public C0010y fb(@Nullable CharSequence charSequence) {
            this.y.f549s = charSequence;
            return this;
        }

        @NonNull
        public Context getContext() {
            return this.y.y;
        }

        public C0010y gv(int i) {
            this.y.zn = i;
            return this;
        }

        public C0010y i9(DialogInterface.OnDismissListener onDismissListener) {
            this.y.z = onDismissListener;
            return this;
        }

        public C0010y n3(boolean z) {
            this.y.f546mt = z;
            return this;
        }

        public C0010y s(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.y;
            aVar.f558xc = aVar.y.getText(i);
            this.y.f547p = onClickListener;
            return this;
        }

        public C0010y setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.y;
            aVar.f550t = aVar.y.getText(i);
            this.y.f555wz = onClickListener;
            return this;
        }

        public C0010y setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.y;
            aVar.f536c5 = aVar.y.getText(i);
            this.y.f540f = onClickListener;
            return this;
        }

        public C0010y setTitle(@Nullable CharSequence charSequence) {
            this.y.f533a = charSequence;
            return this;
        }

        public C0010y setView(View view) {
            AlertController.a aVar = this.y;
            aVar.c = view;
            aVar.n = 0;
            aVar.f551ta = false;
            return this;
        }

        public C0010y t(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.y;
            aVar.f536c5 = charSequence;
            aVar.f540f = onClickListener;
            return this;
        }

        public C0010y tl(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.y;
            aVar.f543i4 = listAdapter;
            aVar.f3 = onClickListener;
            aVar.f553ud = i;
            aVar.f539ej = true;
            return this;
        }

        public C0010y v(@Nullable Drawable drawable) {
            this.y.f542gv = drawable;
            return this;
        }

        public C0010y wz(int i) {
            AlertController.a aVar = this.y;
            aVar.f533a = aVar.y.getText(i);
            return this;
        }

        public y xc() {
            y yVarCreate = create();
            yVarCreate.show();
            return yVarCreate;
        }

        public C0010y y(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.y;
            aVar.f543i4 = listAdapter;
            aVar.f3 = onClickListener;
            return this;
        }

        public C0010y zn(@Nullable View view) {
            this.y.f541fb = view;
            return this;
        }

        public C0010y(@NonNull Context context, int i) {
            this.y = new AlertController.a(new ContextThemeWrapper(context, y.a(context, i)));
            this.n3 = i;
        }
    }

    public y(@NonNull Context context, int i) {
        super(context, a(context, i));
        this.f573fb = new AlertController(getContext(), this, getWindow());
    }

    public static int a(@NonNull Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.f307xc, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // i9.f, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f573fb.v();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f573fb.fb(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f573fb.s(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // i9.f, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f573fb.p(charSequence);
    }

    public ListView v() {
        return this.f573fb.gv();
    }
}
