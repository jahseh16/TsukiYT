package wz;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x.y;

/* JADX INFO: loaded from: classes.dex */
public class fb extends MenuInflater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?>[] f9058a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Class<?>[] f9059v;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public Object f9060gv;
    public final Object[] n3;
    public final Object[] y;
    public Context zn;

    static {
        Class<?>[] clsArr = {Context.class};
        f9059v = clsArr;
        f9058a = clsArr;
    }

    public fb(Context context) {
        super(context);
        this.zn = context;
        Object[] objArr = {context};
        this.y = objArr;
        this.n3 = objArr;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof y)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.zn.getResources().getLayout(i);
                    zn(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }

    public Object n3() {
        if (this.f9060gv == null) {
            this.f9060gv = y(this.zn);
        }
        return this.f9060gv;
    }

    public final Object y(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? y(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void zn(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        n3 n3Var = new n3(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z5 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z5 && name2.equals(str)) {
                        str = null;
                        z5 = false;
                    } else if (name2.equals("group")) {
                        n3Var.s();
                    } else if (name2.equals("item")) {
                        if (!n3Var.gv()) {
                            qn.n3 n3Var2 = n3Var.d0;
                            if (n3Var2 == null || !n3Var2.y()) {
                                n3Var.y();
                            } else {
                                n3Var.n3();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z5) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    n3Var.a(attributeSet);
                } else if (name3.equals("item")) {
                    n3Var.fb(attributeSet);
                } else if (name3.equals("menu")) {
                    zn(xmlPullParser, attributeSet, n3Var.n3());
                } else {
                    str = name3;
                    z5 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
