package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private final void mergeFrom(B b4, Reader reader, int i) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b4, reader, i)) {
        }
    }

    public abstract void addFixed32(B b4, int i, int i5);

    public abstract void addFixed64(B b4, int i, long j);

    public abstract void addGroup(B b4, int i, T t3);

    public abstract void addLengthDelimited(B b4, int i, ByteString byteString);

    public abstract void addVarint(B b4, int i, long j);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t3);

    public abstract int getSerializedSizeAsMessageSet(T t3);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t3, T t5);

    public final boolean mergeOneFieldFrom(B b4, Reader reader, int i) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b4, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b4, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b4, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b4, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i5 = i + 1;
        if (i5 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, reader, i5);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b4, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b4);

    public void setRecursionLimit(int i) {
        recursionLimit = i;
    }

    public abstract void setToMessage(Object obj, T t3);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b4);

    public abstract void writeAsMessageSetTo(T t3, Writer writer) throws IOException;

    public abstract void writeTo(T t3, Writer writer) throws IOException;
}
