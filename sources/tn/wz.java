package tn;

import java.io.IOException;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public static final int[] y = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean gv(b1.tl tlVar, boolean z) throws IOException {
        return zn(tlVar, false, z);
    }

    public static boolean n3(b1.tl tlVar) throws IOException {
        return zn(tlVar, true, false);
    }

    public static boolean y(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i5 : y) {
            if (i5 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean zn(b1.tl tlVar, boolean z, boolean z5) throws IOException {
        boolean z7;
        boolean z8;
        int i;
        long length = tlVar.getLength();
        long j = 4096;
        long j4 = -1;
        int i5 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i5 != 0 && length <= 4096) {
            j = length;
        }
        int i8 = (int) j;
        d dVar = new d(64);
        boolean z9 = false;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i8) {
            dVar.j5(8);
            if (!tlVar.v(dVar.v(), z9 ? 1 : 0, 8, true)) {
                break;
            }
            long jA8 = dVar.a8();
            int iP = dVar.p();
            if (jA8 == 1) {
                tlVar.z(dVar.v(), 8, 8);
                dVar.j(16);
                jA8 = dVar.d0();
                i = 16;
            } else {
                if (jA8 == 0) {
                    long length2 = tlVar.getLength();
                    if (length2 != j4) {
                        jA8 = (length2 - tlVar.f()) + ((long) 8);
                    }
                }
                i = 8;
            }
            long j7 = i;
            if (jA8 < j7) {
                return z9;
            }
            i10 += i;
            if (iP == 1836019574) {
                i8 += (int) jA8;
                if (i5 != 0 && i8 > length) {
                    i8 = (int) length;
                }
                j4 = -1;
            } else {
                if (iP == 1836019558 || iP == 1836475768) {
                    z7 = true;
                    z8 = true;
                    break;
                }
                int i11 = i5;
                if ((((long) i10) + jA8) - j7 >= i8) {
                    break;
                }
                int i12 = (int) (jA8 - j7);
                i10 += i12;
                if (iP == 1718909296) {
                    if (i12 < 8) {
                        return false;
                    }
                    dVar.j5(i12);
                    tlVar.z(dVar.v(), 0, i12);
                    int i13 = i12 / 4;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            break;
                        }
                        if (i14 == 1) {
                            dVar.ut(4);
                        } else if (y(dVar.p(), z5)) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    if (!z10) {
                        return false;
                    }
                } else if (i12 != 0) {
                    tlVar.tl(i12);
                }
                i5 = i11;
                j4 = -1;
                z9 = false;
            }
        }
        z7 = true;
        z8 = false;
        if (z10 && z == z8) {
            return z7;
        }
        return false;
    }
}
