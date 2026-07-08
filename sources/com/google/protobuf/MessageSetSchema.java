package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(messageLite);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3) {
        return unknownFieldSchema.getSerializedSizeAsMessageSet(unknownFieldSchema.getFromMessage(t3));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t3, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(t3);
        FieldSet<ET> mutableExtensions = extensionSchema.getMutableExtensions(t3);
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(reader, extensionRegistryLite, extensionSchema, mutableExtensions, unknownFieldSchema, builderFromMessage)) {
                    return;
                }
            } finally {
                unknownFieldSchema.setBuilderToMessage(t3, builderFromMessage);
            }
        }
    }

    public static <T> MessageSetSchema<T> newSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub) throws IOException {
        int tag = reader.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return reader.skipField();
            }
            Object objFindExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return unknownFieldSchema.mergeOneFieldFrom(ub, reader, 0);
            }
            extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = reader.readUInt32();
                objFindExtensionByNumber2 = extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                extensionSchema.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                unknownFieldSchema.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3, Writer writer) throws IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(t3), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t3, T t5) {
        if (!this.unknownFieldSchema.getFromMessage(t3).equals(this.unknownFieldSchema.getFromMessage(t5))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t3).equals(this.extensionSchema.getExtensions(t5));
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t3) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t3);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t3).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t3) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t3).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t3).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t3) {
        return this.extensionSchema.getExtensions(t3).isInitialized();
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t3) {
        this.unknownFieldSchema.makeImmutable(t3);
        this.extensionSchema.makeImmutable(t3);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, T t5) {
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t3, t5);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t3, t5);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t3, Writer writer) throws IOException {
        for (T t5 : this.extensionSchema.getExtensions(t3)) {
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) t5.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t5 instanceof LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.LazyEntry) t5).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t5.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t3, writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(T r11, byte[] r12, int r13, int r14, com.google.protobuf.ArrayDecoders.Registers r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSetSchema.mergeFrom(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):void");
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t3, reader, extensionRegistryLite);
    }
}
