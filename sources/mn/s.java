package mn;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public interface s {
    public static final ByteBuffer y = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class n3 extends Exception {
        public n3(y yVar) {
            super("Unhandled format: " + yVar);
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final y f6679v = new y(-1, -1, -1);

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6680gv;
        public final int n3;
        public final int y;
        public final int zn;

        public y(int i, int i5, int i8) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f6680gv = ut.u0(i8) ? ut.ct(i8, i5) : -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.y == yVar.y && this.n3 == yVar.n3 && this.zn == yVar.zn;
        }

        public int hashCode() {
            return g4.f.n3(Integer.valueOf(this.y), Integer.valueOf(this.n3), Integer.valueOf(this.zn));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.y + ", channelCount=" + this.n3 + ", encoding=" + this.zn + ']';
        }
    }

    boolean a();

    void flush();

    void gv(ByteBuffer byteBuffer);

    boolean isActive();

    ByteBuffer n3();

    void v();

    void y();

    y zn(y yVar) throws n3;
}
