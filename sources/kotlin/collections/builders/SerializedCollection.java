package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SerializedCollection implements Externalizable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SerializedCollection(Collection<?> collection, int i) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.collection = collection;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        List listBuild;
        Intrinsics.checkNotNullParameter(input, "input");
        byte b4 = input.readByte();
        int i = b4 & 1;
        if ((b4 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b4) + '.');
        }
        int i5 = input.readInt();
        if (i5 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i5 + '.');
        }
        int i8 = 0;
        if (i == 0) {
            List listCreateListBuilder = CollectionsKt.createListBuilder(i5);
            while (i8 < i5) {
                listCreateListBuilder.add(input.readObject());
                i8++;
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            Set setCreateSetBuilder = SetsKt.createSetBuilder(i5);
            while (i8 < i5) {
                setCreateSetBuilder.add(input.readObject());
                i8++;
            }
            listBuild = SetsKt.build(setCreateSetBuilder);
        }
        this.collection = listBuild;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(CollectionsKt.emptyList(), 0);
    }
}
