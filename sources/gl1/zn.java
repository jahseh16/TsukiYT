package gl1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements y {
    public final String y;

    public zn(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.y = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn) && Intrinsics.areEqual(getValue(), ((zn) obj).getValue());
    }

    @Override // gl1.y
    public String getValue() {
        return this.y;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue();
    }
}
