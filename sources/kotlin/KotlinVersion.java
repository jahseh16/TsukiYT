package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final Companion Companion = new Companion(null);
    public static final KotlinVersion CURRENT = KotlinVersionCurrentValue.get();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public KotlinVersion(int i, int i5, int i8) {
        this.major = i;
        this.minor = i5;
        this.patch = i8;
        this.version = versionOf(i, i5, i8);
    }

    private final int versionOf(int i, int i5, int i8) {
        if (i >= 0 && i < 256 && i5 >= 0 && i5 < 256 && i8 >= 0 && i8 < 256) {
            return (i << 16) + (i5 << 8) + i8;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i5 + '.' + i8).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public int hashCode() {
        return this.version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }
}
