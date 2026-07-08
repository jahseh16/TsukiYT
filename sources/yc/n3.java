package yc;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.rz;
import ap.b;
import ap.d0;
import ap.fh;
import ap.hw;
import ap.mt;
import ap.yt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import x4.c5;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends yc.y {
    public static boolean zn = false;

    @NonNull
    public final C0199n3 n3;

    @NonNull
    public final mt y;

    /* JADX INFO: renamed from: yc.n3$n3, reason: collision with other inner class name */
    public static class C0199n3 extends b {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public static final rz.n3 f9319fb = new y();
        public c5<y> y = new c5<>();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9320v = false;

        /* JADX INFO: renamed from: yc.n3$n3$y */
        public static class y implements rz.n3 {
            @Override // androidx.lifecycle.rz.n3
            public /* synthetic */ b create(Class cls, yg.y yVar) {
                return yt.n3(this, cls, yVar);
            }

            @Override // androidx.lifecycle.rz.n3
            @NonNull
            public <T extends b> T create(@NonNull Class<T> cls) {
                return new C0199n3();
            }
        }

        @NonNull
        public static C0199n3 t6(hw hwVar) {
            return (C0199n3) new rz(hwVar, f9319fb).y(C0199n3.class);
        }

        @Override // ap.b
        public void onCleared() {
            super.onCleared();
            int iW = this.y.w();
            for (int i = 0; i < iW; i++) {
                this.y.p(i).y(true);
            }
            this.y.zn();
        }

        public void t3() {
            int iW = this.y.w();
            for (int i = 0; i < iW; i++) {
                this.y.p(i).zn();
            }
        }

        public void y0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.y.w() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.y.w(); i++) {
                    y yVarP = this.y.p(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.y.t(i));
                    printWriter.print(": ");
                    printWriter.println(yVarP.toString());
                    yVarP.n3(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    public n3(@NonNull mt mtVar, @NonNull hw hwVar) {
        this.y = mtVar;
        this.n3 = C0199n3.t6(hwVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        j5.n3.y(this.y, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // yc.y
    @Deprecated
    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.n3.y0(str, fileDescriptor, printWriter, strArr);
    }

    @Override // yc.y
    public void zn() {
        this.n3.t3();
    }

    public static class y<D> extends d0<D> {

        @Nullable
        public final Bundle n3;
        public final int y;
        public mt zn;

        public void n3(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.y);
            printWriter.print(" mArgs=");
            printWriter.println(this.n3);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        @Override // androidx.lifecycle.xc
        public void onActive() {
            if (n3.zn) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.xc
        public void onInactive() {
            if (n3.zn) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.xc
        public void removeObserver(@NonNull fh<? super D> fhVar) {
            super.removeObserver(fhVar);
            this.zn = null;
        }

        @Override // ap.d0, androidx.lifecycle.xc
        public void setValue(D d4) {
            super.setValue(d4);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.y);
            sb.append(" : ");
            j5.n3.y(null, sb);
            sb.append("}}");
            return sb.toString();
        }

        public kp.y<D> y(boolean z) {
            if (n3.zn) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void zn() {
        }
    }
}
