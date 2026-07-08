package com.google.protobuf;

import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* JADX INFO: renamed from: com.google.protobuf.ArrayDecoders$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int i) throws InvalidProtocolBufferException {
        if (i >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int decodeBoolList(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i5, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i5 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i5 == 0) {
            registers.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i5);
        return iDecodeVarint32 + i5;
    }

    public static int decodeBytesList(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
        int i10 = registers.int1;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i10 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i10 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i10));
            iDecodeVarint32 += i10;
        }
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i11 = registers.int1;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i11 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i11 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i11));
                iDecodeVarint32 += i11;
            }
        }
        return iDecodeVarint32;
    }

    public static double decodeDouble(byte[] bArr, int i) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i));
    }

    public static int decodeDoubleList(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i5));
        int i10 = i5 + 8;
        while (i10 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
            if (i != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i10 = iDecodeVarint32 + 8;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i, byte[] bArr, int i5, int i8, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i10 = i >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i5, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i5, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i5, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i5, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i5, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i5, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i5, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case Code.UNIMPLEMENTED /* 12 */:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i5, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i5, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i5, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) extendableMessage, i10, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i5 = decodeVarint32(bArr, i5, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                SchemaUtil.storeUnknownEnum(extendableMessage, i10, registers.int1, null, unknownFieldSchema);
                return i5;
            }
            objValueOf = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(decodeDouble(bArr, i5));
                    i5 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(decodeFloat(bArr, i5));
                    i5 += 4;
                    break;
                case 3:
                case 4:
                    i5 = decodeVarint64(bArr, i5, registers);
                    objValueOf = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i5 = decodeVarint32(bArr, i5, registers);
                    objValueOf = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i5));
                    i5 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i5));
                    i5 += 4;
                    break;
                case 11:
                    i5 = decodeVarint64(bArr, i5, registers);
                    objValueOf = Boolean.valueOf(registers.long1 != 0);
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    i5 = decodeVarint32(bArr, i5, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i5 = decodeVarint64(bArr, i5, registers);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i5 = decodeBytes(bArr, i5, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    i5 = decodeString(bArr, i5, registers);
                    objValueOf = registers.object1;
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    int i11 = (i10 << 3) | 4;
                    Schema schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, bArr, i5, i8, i11, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, bArr, i5, i8, i11, registers);
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    Schema schemaSchemaFor2 = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, bArr, i5, i8, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, bArr, i5, i8, registers);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
        } else {
            fieldSet.setField(generatedExtension.descriptor, objValueOf);
        }
        return i5;
    }

    public static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i5, int i8, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i5, i8, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i5, i8, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    public static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int decodeFixed32List(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i5));
        int i10 = i5 + 4;
        while (i10 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
            if (i != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i10 = iDecodeVarint32 + 4;
        }
        return i10;
    }

    public static long decodeFixed64(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int decodeFixed64List(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i5));
        int i10 = i5 + 8;
        while (i10 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
            if (i != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i10 = iDecodeVarint32 + 8;
        }
        return i10;
    }

    public static float decodeFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    public static int decodeFloatList(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i5));
        int i10 = i5 + 4;
        while (i10 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
            if (i != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i10 = iDecodeVarint32 + 4;
        }
        return i10;
    }

    public static int decodeGroupField(Schema schema, byte[] bArr, int i, int i5, int i8, Registers registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, schema, bArr, i, i5, i8, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(Schema schema, int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int i10 = (i & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(schema, bArr, i5, i8, i10, registers);
        protobufList.add(registers.object1);
        while (iDecodeGroupField < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, bArr, iDecodeVarint32, i8, i10, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    public static int decodeMessageField(Schema schema, byte[] bArr, int i, int i5, Registers registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, schema, bArr, i, i5, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(Schema<?> schema, int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int iDecodeMessageField = decodeMessageField(schema, bArr, i5, i8, registers);
        protobufList.add(registers.object1);
        while (iDecodeMessageField < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, bArr, iDecodeVarint32, i8, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i5) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i5) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i5, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i5 == 0) {
            registers.object1 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            return iDecodeVarint32;
        }
        registers.object1 = new String(bArr, iDecodeVarint32, i5, Internal.UTF_8);
        return iDecodeVarint32 + i5;
    }

    public static int decodeStringList(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
        int i10 = registers.int1;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i10 == 0) {
            protobufList.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        } else {
            protobufList.add(new String(bArr, iDecodeVarint32, i10, Internal.UTF_8));
            iDecodeVarint32 += i10;
        }
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i11 = registers.int1;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i11 == 0) {
                protobufList.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            } else {
                protobufList.add(new String(bArr, iDecodeVarint32, i11, Internal.UTF_8));
                iDecodeVarint32 += i11;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
        int i10 = registers.int1;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i10 == 0) {
            protobufList.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        } else {
            int i11 = iDecodeVarint32 + i10;
            if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i11)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i10, Internal.UTF_8));
            iDecodeVarint32 = i11;
        }
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i12 = registers.int1;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i12 == 0) {
                protobufList.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            } else {
                int i13 = iDecodeVarint32 + i12;
                if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i13)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i12, Internal.UTF_8));
                iDecodeVarint32 = i13;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, registers);
        int i5 = registers.int1;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i5 == 0) {
            registers.object1 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            return iDecodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(bArr, iDecodeVarint32, i5);
        return iDecodeVarint32 + i5;
    }

    public static int decodeUnknownField(int i, byte[] bArr, int i5, int i8, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i5, registers);
            unknownFieldSetLite.storeField(i, Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(decodeFixed64(bArr, i5)));
            return i5 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
            int i10 = registers.int1;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i10 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, ByteString.copyFrom(bArr, iDecodeVarint32, i10));
            }
            return iDecodeVarint32 + i10;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i, Integer.valueOf(decodeFixed32(bArr, i5)));
            return i5 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i11 = (i & (-8)) | 4;
        int i12 = registers.recursionDepth + 1;
        registers.recursionDepth = i12;
        checkRecursionLimit(i12);
        int i13 = 0;
        while (true) {
            if (i5 >= i8) {
                break;
            }
            int iDecodeVarint322 = decodeVarint32(bArr, i5, registers);
            int i14 = registers.int1;
            if (i14 == i11) {
                i13 = i14;
                i5 = iDecodeVarint322;
                break;
            }
            i13 = i14;
            i5 = decodeUnknownField(i14, bArr, iDecodeVarint322, i8, unknownFieldSetLiteNewInstance, registers);
        }
        registers.recursionDepth--;
        if (i5 > i8 || i13 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, unknownFieldSetLiteNewInstance);
        return i5;
    }

    public static int decodeVarint32(byte[] bArr, int i, Registers registers) {
        int i5 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return decodeVarint32(b4, bArr, i5, registers);
        }
        registers.int1 = b4;
        return i5;
    }

    public static int decodeVarint32List(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i5, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i, Registers registers) {
        int i5 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return decodeVarint64(j, bArr, i5, registers);
        }
        registers.long1 = j;
        return i5;
    }

    public static int decodeVarint64List(int i, byte[] bArr, int i5, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i5, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    public static int mergeGroupField(Object obj, Schema schema, byte[] bArr, int i, int i5, int i8, Registers registers) throws IOException {
        MessageSchema messageSchema = (MessageSchema) schema;
        int i10 = registers.recursionDepth + 1;
        registers.recursionDepth = i10;
        checkRecursionLimit(i10);
        int message = messageSchema.parseMessage(obj, bArr, i, i5, i8, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return message;
    }

    public static int mergeMessageField(Object obj, Schema schema, byte[] bArr, int i, int i5, Registers registers) throws IOException {
        int iDecodeVarint32 = i + 1;
        int i8 = bArr[i];
        if (i8 < 0) {
            iDecodeVarint32 = decodeVarint32(i8, bArr, iDecodeVarint32, registers);
            i8 = registers.int1;
        }
        int i10 = iDecodeVarint32;
        if (i8 < 0 || i8 > i5 - i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i11 = registers.recursionDepth + 1;
        registers.recursionDepth = i11;
        checkRecursionLimit(i11);
        int i12 = i8 + i10;
        schema.mergeFrom(obj, bArr, i10, i12, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return i12;
    }

    public static void setRecursionLimit(int i) {
        recursionLimit = i;
    }

    public static int skipField(int i, byte[] bArr, int i5, int i8, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i5, registers);
        }
        if (tagWireType == 1) {
            return i5 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i5, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i5 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i10 = (i & (-8)) | 4;
        int i11 = 0;
        while (i5 < i8) {
            i5 = decodeVarint32(bArr, i5, registers);
            i11 = registers.int1;
            if (i11 == i10) {
                break;
            }
            i5 = skipField(i11, bArr, i5, i8, registers);
        }
        if (i5 > i8 || i11 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i5;
    }

    public static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        public Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public static int decodeVarint32(int i, byte[] bArr, int i5, Registers registers) {
        int i8 = i & 127;
        int i10 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            registers.int1 = i8 | (b4 << 7);
            return i10;
        }
        int i11 = i8 | ((b4 & 127) << 7);
        int i12 = i5 + 2;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            registers.int1 = i11 | (b6 << 14);
            return i12;
        }
        int i13 = i11 | ((b6 & 127) << 14);
        int i14 = i5 + 3;
        byte b7 = bArr[i12];
        if (b7 >= 0) {
            registers.int1 = i13 | (b7 << 21);
            return i14;
        }
        int i15 = i13 | ((b7 & 127) << 21);
        int i16 = i5 + 4;
        byte b8 = bArr[i14];
        if (b8 >= 0) {
            registers.int1 = i15 | (b8 << 28);
            return i16;
        }
        int i17 = i15 | ((b8 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                registers.int1 = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int decodeVarint64(long j, byte[] bArr, int i, Registers registers) {
        int i5 = i + 1;
        byte b4 = bArr[i];
        long j4 = (j & 127) | (((long) (b4 & 127)) << 7);
        int i8 = 7;
        while (b4 < 0) {
            int i10 = i5 + 1;
            byte b6 = bArr[i5];
            i8 += 7;
            j4 |= ((long) (b6 & 127)) << i8;
            i5 = i10;
            b4 = b6;
        }
        registers.long1 = j4;
        return i5;
    }
}
