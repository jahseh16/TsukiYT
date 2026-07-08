package oj1;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class i4 extends lj1.y {
    public final pj1.zn n3;
    public final y y;

    public i4(y lexer, nj1.y json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.y = lexer;
        this.n3 = json.y();
    }

    @Override // lj1.y, lj1.v
    public int s() {
        y yVar = this.y;
        String strCo = yVar.co();
        try {
            return UStringsKt.toUInt(strCo);
        } catch (IllegalArgumentException unused) {
            y.n(yVar, "Failed to parse type 'UInt' for input '" + strCo + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // lj1.y, lj1.v
    public long t() {
        y yVar = this.y;
        String strCo = yVar.co();
        try {
            return UStringsKt.toULong(strCo);
        } catch (IllegalArgumentException unused) {
            y.n(yVar, "Failed to parse type 'ULong' for input '" + strCo + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // lj1.zn
    public int x4(kj1.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // lj1.y, lj1.v
    public short xc() {
        y yVar = this.y;
        String strCo = yVar.co();
        try {
            return UStringsKt.toUShort(strCo);
        } catch (IllegalArgumentException unused) {
            y.n(yVar, "Failed to parse type 'UShort' for input '" + strCo + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // lj1.v, lj1.zn
    public pj1.zn y() {
        return this.n3;
    }

    @Override // lj1.y, lj1.v
    public byte z6() {
        y yVar = this.y;
        String strCo = yVar.co();
        try {
            return UStringsKt.toUByte(strCo);
        } catch (IllegalArgumentException unused) {
            y.n(yVar, "Failed to parse type 'UByte' for input '" + strCo + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
