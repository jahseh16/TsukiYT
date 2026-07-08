package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.core.widget.NestedScrollView;
import i9.f;
import java.lang.ref.WeakReference;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f502a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public int f503a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f504b;
    public Drawable c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f505c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public Button f506co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f507d;
    public NestedScrollView d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public ListAdapter f508ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f509f;
    public CharSequence f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public ListView f510fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f511gv;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public boolean f512hw;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public Button f513i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f514i9;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public int f516k5;
    public ImageView mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public Drawable f517mt;
    public Message n;
    public final f n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Message f518p;
    public Handler qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Message f519r;
    public Drawable rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f521t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public TextView f522ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f523tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f525v;
    public int vl;
    public CharSequence w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f527x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public Drawable f528x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public Button f529xc;
    public final Context y;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public int f530yt;
    public CharSequence z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public View f531z6;
    public final Window zn;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f526wz = false;
    public int fh = 0;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public int f524ud = -1;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public int f515j5 = 0;
    public final View.OnClickListener o = new y();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f532v;
        public final int y;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.w7);
            this.f532v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.ou, -1);
            this.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.vi, -1);
        }

        public void y(boolean z, boolean z5) {
            if (z5 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.y, getPaddingRight(), z5 ? getPaddingBottom() : this.f532v);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f533a;

        /* JADX INFO: renamed from: a8, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f534a8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f535b;
        public View c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public CharSequence f536c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public DialogInterface.OnCancelListener f537co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean[] f538d;
        public int d0;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public boolean f539ej;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public DialogInterface.OnClickListener f540f;
        public DialogInterface.OnClickListener f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public View f541fb;
        public int fh;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public Drawable f542gv;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public ListAdapter f543i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public Drawable f544i9;

        /* JADX INFO: renamed from: k5, reason: collision with root package name */
        public String f545k5;
        public int mg;
        public int n;
        public final LayoutInflater n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DialogInterface.OnClickListener f547p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public DialogInterface.OnKeyListener f548r;
        public int rz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence f549s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public CharSequence f550t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public Drawable f552tl;
        public Drawable w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public DialogInterface.OnClickListener f555wz;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Cursor f556x;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public CharSequence[] f557x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public CharSequence f558xc;
        public final Context y;

        /* JADX INFO: renamed from: yt, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f559yt;
        public DialogInterface.OnDismissListener z;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        public boolean f560z6;
        public int zn = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f554v = 0;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        public boolean f551ta = false;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public int f553ud = -1;
        public boolean vl = true;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public boolean f546mt = true;

        public class gv implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ AlertController f562v;
            public final /* synthetic */ RecycleListView y;

            public gv(RecycleListView recycleListView, AlertController alertController) {
                this.y = recycleListView;
                this.f562v = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = a.this.f538d;
                if (zArr != null) {
                    zArr[i] = this.y.isItemChecked(i);
                }
                a.this.f534a8.onClick(this.f562v.n3, i, this.y.isItemChecked(i));
            }
        }

        public class n3 extends CursorAdapter {

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f564fb;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ AlertController f565s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final int f566v;
            public final int y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n3(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f564fb = recycleListView;
                this.f565s = alertController;
                Cursor cursor2 = getCursor();
                this.y = cursor2.getColumnIndexOrThrow(a.this.f535b);
                this.f566v = cursor2.getColumnIndexOrThrow(a.this.f545k5);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.y));
                this.f564fb.setItemChecked(cursor.getPosition(), cursor.getInt(this.f566v) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return a.this.n3.inflate(this.f565s.f516k5, viewGroup, false);
            }
        }

        public class y extends ArrayAdapter<CharSequence> {
            public final /* synthetic */ RecycleListView y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(Context context, int i, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i5, charSequenceArr);
                this.y = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = a.this.f538d;
                if (zArr != null && zArr[i]) {
                    this.y.setItemChecked(i, true);
                }
                return view2;
            }
        }

        public class zn implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AlertController y;

            public zn(AlertController alertController) {
                this.y = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                a.this.f3.onClick(this.y.n3, i);
                if (a.this.f539ej) {
                    return;
                }
                this.y.n3.dismiss();
            }
        }

        public a(Context context) {
            this.y = context;
            this.n3 = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public final void n3(AlertController alertController) {
            ListAdapter sVar;
            RecycleListView recycleListView = (RecycleListView) this.n3.inflate(alertController.f504b, (ViewGroup) null);
            if (this.f560z6) {
                sVar = this.f556x == null ? new y(this.y, alertController.f516k5, R.id.text1, this.f557x4, recycleListView) : new n3(this.y, this.f556x, false, recycleListView, alertController);
            } else {
                int i = this.f539ej ? alertController.f530yt : alertController.vl;
                if (this.f556x != null) {
                    sVar = new SimpleCursorAdapter(this.y, i, this.f556x, new String[]{this.f535b}, new int[]{R.id.text1});
                } else {
                    sVar = this.f543i4;
                    if (sVar == null) {
                        sVar = new s(this.y, i, R.id.text1, this.f557x4);
                    }
                }
            }
            alertController.f508ej = sVar;
            alertController.f524ud = this.f553ud;
            if (this.f3 != null) {
                recycleListView.setOnItemClickListener(new zn(alertController));
            } else if (this.f534a8 != null) {
                recycleListView.setOnItemClickListener(new gv(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f559yt;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f539ej) {
                recycleListView.setChoiceMode(1);
            } else if (this.f560z6) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f510fb = recycleListView;
        }

        public void y(AlertController alertController) {
            View view = this.f541fb;
            if (view != null) {
                alertController.t(view);
            } else {
                CharSequence charSequence = this.f533a;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f542gv;
                if (drawable != null) {
                    alertController.wz(drawable);
                }
                int i = this.zn;
                if (i != 0) {
                    alertController.tl(i);
                }
                int i5 = this.f554v;
                if (i5 != 0) {
                    alertController.tl(alertController.zn(i5));
                }
            }
            CharSequence charSequence2 = this.f549s;
            if (charSequence2 != null) {
                alertController.xc(charSequence2);
            }
            CharSequence charSequence3 = this.f536c5;
            if (charSequence3 != null || this.f544i9 != null) {
                alertController.f(-1, charSequence3, this.f540f, null, this.f544i9);
            }
            CharSequence charSequence4 = this.f550t;
            if (charSequence4 != null || this.f552tl != null) {
                alertController.f(-2, charSequence4, this.f555wz, null, this.f552tl);
            }
            CharSequence charSequence5 = this.f558xc;
            if (charSequence5 != null || this.w != null) {
                alertController.f(-3, charSequence5, this.f547p, null, this.w);
            }
            if (this.f557x4 != null || this.f556x != null || this.f543i4 != null) {
                n3(alertController);
            }
            View view2 = this.c;
            if (view2 != null) {
                if (this.f551ta) {
                    alertController.z(view2, this.d0, this.fh, this.rz, this.mg);
                    return;
                } else {
                    alertController.co(view2);
                    return;
                }
            }
            int i8 = this.n;
            if (i8 != 0) {
                alertController.mt(i8);
            }
        }
    }

    public static final class fb extends Handler {
        public WeakReference<DialogInterface> y;

        public fb(DialogInterface dialogInterface) {
            this.y = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.y.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public class gv implements AbsListView.OnScrollListener {
        public final /* synthetic */ View n3;
        public final /* synthetic */ View y;

        public gv(View view, View view2) {
            this.y = view;
            this.n3 = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i5, int i8) {
            AlertController.a(absListView, this.y, this.n3);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    public class n3 implements NestedScrollView.zn {
        public final /* synthetic */ View n3;
        public final /* synthetic */ View y;

        public n3(View view, View view2) {
            this.y = view;
            this.n3 = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.zn
        public void y(NestedScrollView nestedScrollView, int i, int i5, int i8, int i10) {
            AlertController.a(nestedScrollView, this.y, this.n3);
        }
    }

    public static class s extends ArrayAdapter<CharSequence> {
        public s(Context context, int i, int i5, CharSequence[] charSequenceArr) {
            super(context, i, i5, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public class v implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ View f570v;
        public final /* synthetic */ View y;

        public v(View view, View view2) {
            this.y = view;
            this.f570v = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.a(AlertController.this.f510fb, this.y, this.f570v);
        }
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f529xc || (message3 = alertController.f518p) == null) ? (view != alertController.f506co || (message2 = alertController.f519r) == null) ? (view != alertController.f513i4 || (message = alertController.n) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.qn.obtainMessage(1, alertController2.n3).sendToTarget();
        }
    }

    public class zn implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ View f572v;
        public final /* synthetic */ View y;

        public zn(View view, View view2) {
            this.y = view;
            this.f572v = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.a(AlertController.this.d0, this.y, this.f572v);
        }
    }

    public AlertController(Context context, f fVar, Window window) {
        this.y = context;
        this.n3 = fVar;
        this.zn = window;
        this.qn = new fb(fVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.f426d, R$attr.f304wz, 0);
        this.f503a8 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f501z6, 0);
        this.f527x = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f485ud, 0);
        this.f504b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f494x, 0);
        this.f516k5 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f417b, 0);
        this.f530yt = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f500yt, 0);
        this.vl = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f414a8, 0);
        this.f512hw = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f454k5, true);
        this.f511gv = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f429ej, 0);
        typedArrayObtainStyledAttributes.recycle();
        fVar.gv(1);
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static boolean c(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.f301tl, typedValue, true);
        return typedValue.data != 0;
    }

    public static boolean y(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (y(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final ViewGroup c5(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void co(View view) {
        this.f520s = view;
        this.f505c5 = 0;
        this.f526wz = false;
    }

    public void f(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.qn.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f3 = charSequence;
            this.n = message;
            this.c = drawable;
        } else if (i == -2) {
            this.z = charSequence;
            this.f519r = message;
            this.f528x4 = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.w = charSequence;
            this.f518p = message;
            this.f517mt = drawable;
        }
    }

    public final void f3(ViewGroup viewGroup) {
        if (this.f531z6 != null) {
            viewGroup.addView(this.f531z6, 0, new ViewGroup.LayoutParams(-1, -2));
            this.zn.findViewById(R$id.vl).setVisibility(8);
            return;
        }
        this.mg = (ImageView) this.zn.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f525v) || !this.f512hw) {
            this.zn.findViewById(R$id.vl).setVisibility(8);
            this.mg.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.zn.findViewById(R$id.f369i9);
        this.f522ta = textView;
        textView.setText(this.f525v);
        int i = this.fh;
        if (i != 0) {
            this.mg.setImageResource(i);
            return;
        }
        Drawable drawable = this.rz;
        if (drawable != null) {
            this.mg.setImageDrawable(drawable);
        } else {
            this.f522ta.setPadding(this.mg.getPaddingLeft(), this.mg.getPaddingTop(), this.mg.getPaddingRight(), this.mg.getPaddingBottom());
            this.mg.setVisibility(8);
        }
    }

    public boolean fb(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.d0;
        return nestedScrollView != null && nestedScrollView.co(keyEvent);
    }

    public ListView gv() {
        return this.f510fb;
    }

    public final void i4(ViewGroup viewGroup) {
        View viewInflate = this.f520s;
        if (viewInflate == null) {
            viewInflate = this.f505c5 != 0 ? LayoutInflater.from(this.y).inflate(this.f505c5, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !y(viewInflate)) {
            this.zn.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.zn.findViewById(R$id.f380wz);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f526wz) {
            frameLayout.setPadding(this.f514i9, this.f509f, this.f521t, this.f523tl);
        }
        if (this.f510fb != null) {
            ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
        }
    }

    public final int i9() {
        int i = this.f527x;
        return i == 0 ? this.f503a8 : this.f515j5 == 1 ? i : this.f503a8;
    }

    public void mt(int i) {
        this.f520s = null;
        this.f505c5 = i;
        this.f526wz = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.zn.findViewById(R$id.z);
        View viewFindViewById4 = viewFindViewById3.findViewById(R$id.f367hw);
        View viewFindViewById5 = viewFindViewById3.findViewById(R$id.f377tl);
        View viewFindViewById6 = viewFindViewById3.findViewById(R$id.f364f);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(R$id.f383xc);
        i4(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(R$id.f367hw);
        View viewFindViewById8 = viewGroup.findViewById(R$id.f377tl);
        View viewFindViewById9 = viewGroup.findViewById(R$id.f364f);
        ViewGroup viewGroupC5 = c5(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC52 = c5(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupC53 = c5(viewFindViewById9, viewFindViewById6);
        x4(viewGroupC52);
        r(viewGroupC53);
        f3(viewGroupC5);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z5 = (viewGroupC5 == null || viewGroupC5.getVisibility() == 8) ? 0 : 1;
        boolean z7 = (viewGroupC53 == null || viewGroupC53.getVisibility() == 8) ? false : true;
        if (!z7 && viewGroupC52 != null && (viewFindViewById2 = viewGroupC52.findViewById(R$id.f381x)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z5 != 0) {
            NestedScrollView nestedScrollView = this.d0;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f502a == null && this.f510fb == null) ? null : viewGroupC5.findViewById(R$id.f384yt);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupC52 != null && (viewFindViewById = viewGroupC52.findViewById(R$id.f359b)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f510fb;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).y(z5, z7);
        }
        if (!z) {
            View view = this.f510fb;
            if (view == null) {
                view = this.d0;
            }
            if (view != null) {
                w(viewGroupC52, view, z5 | (z7 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f510fb;
        if (listView2 == null || (listAdapter = this.f508ej) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f524ud;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    public final void n3(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public void p(CharSequence charSequence) {
        this.f525v = charSequence;
        TextView textView = this.f522ta;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void r(ViewGroup viewGroup) {
        int i;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f529xc = button;
        button.setOnClickListener(this.o);
        if (TextUtils.isEmpty(this.w) && this.f517mt == null) {
            this.f529xc.setVisibility(8);
            i = 0;
        } else {
            this.f529xc.setText(this.w);
            Drawable drawable = this.f517mt;
            if (drawable != null) {
                int i5 = this.f511gv;
                drawable.setBounds(0, 0, i5, i5);
                this.f529xc.setCompoundDrawables(this.f517mt, null, null, null);
            }
            this.f529xc.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f506co = button2;
        button2.setOnClickListener(this.o);
        if (TextUtils.isEmpty(this.z) && this.f528x4 == null) {
            this.f506co.setVisibility(8);
        } else {
            this.f506co.setText(this.z);
            Drawable drawable2 = this.f528x4;
            if (drawable2 != null) {
                int i8 = this.f511gv;
                drawable2.setBounds(0, 0, i8, i8);
                this.f506co.setCompoundDrawables(this.f528x4, null, null, null);
            }
            this.f506co.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f513i4 = button3;
        button3.setOnClickListener(this.o);
        if (TextUtils.isEmpty(this.f3) && this.c == null) {
            this.f513i4.setVisibility(8);
        } else {
            this.f513i4.setText(this.f3);
            Drawable drawable3 = this.c;
            if (drawable3 != null) {
                int i10 = this.f511gv;
                drawable3.setBounds(0, 0, i10, i10);
                this.f513i4.setCompoundDrawables(this.c, null, null, null);
            }
            this.f513i4.setVisibility(0);
            i |= 4;
        }
        if (c(this.y)) {
            if (i == 1) {
                n3(this.f529xc);
            } else if (i == 2) {
                n3(this.f506co);
            } else if (i == 4) {
                n3(this.f513i4);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public boolean s(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.d0;
        return nestedScrollView != null && nestedScrollView.co(keyEvent);
    }

    public void t(View view) {
        this.f531z6 = view;
    }

    public void tl(int i) {
        this.rz = null;
        this.fh = i;
        ImageView imageView = this.mg;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.mg.setImageResource(this.fh);
            }
        }
    }

    public void v() {
        this.n3.setContentView(i9());
        n();
    }

    public final void w(ViewGroup viewGroup, View view, int i, int i5) {
        View viewFindViewById = this.zn.findViewById(R$id.f382x4);
        View viewFindViewById2 = this.zn.findViewById(R$id.f373r);
        if (Build.VERSION.SDK_INT >= 23) {
            ut.qj(view, i, i5);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        if (viewFindViewById != null && (i & 1) == 0) {
            viewGroup.removeView(viewFindViewById);
            viewFindViewById = null;
        }
        if (viewFindViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(viewFindViewById2);
            viewFindViewById2 = null;
        }
        if (viewFindViewById == null && viewFindViewById2 == null) {
            return;
        }
        if (this.f502a != null) {
            this.d0.setOnScrollChangeListener(new n3(viewFindViewById, viewFindViewById2));
            this.d0.post(new zn(viewFindViewById, viewFindViewById2));
            return;
        }
        ListView listView = this.f510fb;
        if (listView != null) {
            listView.setOnScrollListener(new gv(viewFindViewById, viewFindViewById2));
            this.f510fb.post(new v(viewFindViewById, viewFindViewById2));
            return;
        }
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void wz(Drawable drawable) {
        this.rz = drawable;
        this.fh = 0;
        ImageView imageView = this.mg;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.mg.setImageDrawable(drawable);
            }
        }
    }

    public final void x4(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.zn.findViewById(R$id.f368i4);
        this.d0 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.d0.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f507d = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f502a;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.d0.removeView(this.f507d);
        if (this.f510fb == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.d0.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.d0);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f510fb, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public void xc(CharSequence charSequence) {
        this.f502a = charSequence;
        TextView textView = this.f507d;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void z(View view, int i, int i5, int i8, int i10) {
        this.f520s = view;
        this.f505c5 = 0;
        this.f526wz = true;
        this.f514i9 = i;
        this.f509f = i5;
        this.f521t = i8;
        this.f523tl = i10;
    }

    public int zn(int i) {
        TypedValue typedValue = new TypedValue();
        this.y.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }
}
