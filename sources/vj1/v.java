package vj1;

import hk1.k;
import hk1.tl;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class v extends tl {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8840v;
    public final Function1<IOException, Unit> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(k delegate, Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.y = onException;
    }

    public void close() {
        if (this.f8840v) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.f8840v = true;
            this.y.invoke(e4);
        }
    }

    public void flush() {
        if (this.f8840v) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.f8840v = true;
            this.y.invoke(e4);
        }
    }

    public void write(hk1.v source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f8840v) {
            source.skip(j);
            return;
        }
        try {
            super.write(source, j);
        } catch (IOException e4) {
            this.f8840v = true;
            this.y.invoke(e4);
        }
    }
}
