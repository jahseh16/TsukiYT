package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class SerializedMap implements Externalizable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SerializedMap(Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        byte b4 = input.readByte();
        if (b4 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b4));
        }
        int i = input.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(i);
        for (int i5 = 0; i5 < i; i5++) {
            mapCreateMapBuilder.put(input.readObject(), input.readObject());
        }
        this.map = MapsKt.build(mapCreateMapBuilder);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(MapsKt.emptyMap());
    }
}
