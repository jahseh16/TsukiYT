package yt;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class co implements tl {
    public final LocaleList y;

    public co(Object obj) {
        this.y = mt.y(obj);
    }

    public boolean equals(Object obj) {
        return this.y.equals(((tl) obj).y());
    }

    @Override // yt.tl
    public Locale get(int i) {
        return this.y.get(i);
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    @Override // yt.tl
    public boolean isEmpty() {
        return this.y.isEmpty();
    }

    public String toString() {
        return this.y.toString();
    }

    @Override // yt.tl
    public Object y() {
        return this.y;
    }
}
