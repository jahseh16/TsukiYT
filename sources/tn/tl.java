package tn;

import b1.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import ft.q;
import g4.co;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class tl {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final co f8303gv = co.gv(':');

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final co f8304v = co.gv('*');
    public int zn;
    public final List<y> y = new ArrayList();
    public int n3 = 0;

    public static final class y {
        public final long n3;
        public final int y;
        public final int zn;

        public y(int i, long j, int i5) {
            this.y = i;
            this.n3 = j;
            this.zn = i5;
        }
    }

    public static SlowMotionData a(d dVar, int i) throws q {
        ArrayList arrayList = new ArrayList();
        List<String> listA = f8304v.a(dVar.ta(i));
        for (int i5 = 0; i5 < listA.size(); i5++) {
            List<String> listA2 = f8303gv.a(listA.get(i5));
            if (listA2.size() != 3) {
                throw q.y(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listA2.get(0)), Long.parseLong(listA2.get(1)), 1 << (Integer.parseInt(listA2.get(2)) - 1)));
            } catch (NumberFormatException e4) {
                throw q.y(null, e4);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public static int n3(String str) throws q {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw q.y("Invalid SEF name", null);
        }
    }

    public void fb() {
        this.y.clear();
        this.n3 = 0;
    }

    public final void gv(b1.tl tlVar, d0 d0Var) throws IOException {
        long length = tlVar.getLength();
        int i = this.zn - 20;
        d dVar = new d(i);
        tlVar.readFully(dVar.v(), 0, i);
        for (int i5 = 0; i5 < i / 12; i5++) {
            dVar.ut(2);
            short sI4 = dVar.i4();
            if (sI4 == 2192 || sI4 == 2816 || sI4 == 2817 || sI4 == 2819 || sI4 == 2820) {
                this.y.add(new y(sI4, (length - ((long) this.zn)) - ((long) dVar.r()), dVar.r()));
            } else {
                dVar.ut(8);
            }
        }
        if (this.y.isEmpty()) {
            d0Var.y = 0L;
        } else {
            this.n3 = 3;
            d0Var.y = this.y.get(0).n3;
        }
    }

    public final void v(b1.tl tlVar, List<Metadata.Entry> list) throws IOException {
        long position = tlVar.getPosition();
        int length = (int) ((tlVar.getLength() - tlVar.getPosition()) - ((long) this.zn));
        d dVar = new d(length);
        tlVar.readFully(dVar.v(), 0, length);
        for (int i = 0; i < this.y.size(); i++) {
            y yVar = this.y.get(i);
            dVar.oz((int) (yVar.n3 - position));
            dVar.ut(4);
            int iR = dVar.r();
            int iN3 = n3(dVar.ta(iR));
            int i5 = yVar.zn - (iR + 8);
            if (iN3 == 2192) {
                list.add(a(dVar, i5));
            } else if (iN3 != 2816 && iN3 != 2817 && iN3 != 2819 && iN3 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public final void y(b1.tl tlVar, d0 d0Var) throws IOException {
        d dVar = new d(8);
        tlVar.readFully(dVar.v(), 0, 8);
        this.zn = dVar.r() + 8;
        if (dVar.p() != 1397048916) {
            d0Var.y = 0L;
        } else {
            d0Var.y = tlVar.getPosition() - ((long) (this.zn - 12));
            this.n3 = 2;
        }
    }

    public int zn(b1.tl tlVar, d0 d0Var, List<Metadata.Entry> list) throws IOException {
        int i = this.n3;
        long j = 0;
        if (i == 0) {
            long length = tlVar.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            d0Var.y = j;
            this.n3 = 1;
        } else if (i == 1) {
            y(tlVar, d0Var);
        } else if (i == 2) {
            gv(tlVar, d0Var);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            v(tlVar, list);
            d0Var.y = 0L;
        }
        return 1;
    }
}
