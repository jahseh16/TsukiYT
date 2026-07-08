package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface Schema<T> {
    boolean equals(T t3, T t5);

    int getSerializedSize(T t3);

    int hashCode(T t3);

    boolean isInitialized(T t3);

    void makeImmutable(T t3);

    void mergeFrom(T t3, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t3, T t5);

    void mergeFrom(T t3, byte[] bArr, int i, int i5, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t3, Writer writer) throws IOException;
}
