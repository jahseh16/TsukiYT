package com.google.protobuf;

import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i5, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i8, int i10, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i5;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z;
        this.intArray = iArr2;
        this.checkInitializedCount = i8;
        this.repeatedFieldOffsetStart = i10;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t3, T t5, int i) {
        return isFieldPresent(t3, i) == isFieldPresent(t5, i);
    }

    private static <T> boolean booleanAt(T t3, long j) {
        return UnsafeUtil.getBoolean(t3, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i5, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i8 = registers.int1;
        if (i8 < 0 || i8 > i5 - iDecodeVarint322) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i10 = iDecodeVarint322 + i8;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint322 < i10) {
            int i11 = iDecodeVarint322 + 1;
            int i12 = bArr[iDecodeVarint322];
            if (i12 < 0) {
                iDecodeVarint32 = ArrayDecoders.decodeVarint32(i12, bArr, i11, registers);
                i12 = registers.int1;
            } else {
                iDecodeVarint32 = i11;
            }
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i13 != 1) {
                if (i13 == 2 && i14 == metadata.valueType.getWireType()) {
                    iDecodeVarint322 = decodeMapEntryValue(bArr, iDecodeVarint32, i5, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint322 = ArrayDecoders.skipField(i12, bArr, iDecodeVarint32, i5, registers);
                }
            } else if (i14 == metadata.keyType.getWireType()) {
                iDecodeVarint322 = decodeMapEntryValue(bArr, iDecodeVarint32, i5, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint322 = ArrayDecoders.skipField(i12, bArr, iDecodeVarint32, i5, registers);
            }
        }
        if (iDecodeVarint322 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i10;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i5, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case Code.UNIMPLEMENTED /* 12 */:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i, i5, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t3, long j) {
        return UnsafeUtil.getDouble(t3, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i5, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i5, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t3, long j) {
        return UnsafeUtil.getFloat(t3, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i) {
        int i5 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i5];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i5 + 1]);
        this.objects[i5] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t3));
    }

    private static <T> int intAt(T t3, long j) {
        return UnsafeUtil.getInt(t3, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t3, int i, int i5, int i8, int i10) {
        return i5 == 1048575 ? isFieldPresent(t3, i) : (i8 & i10) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & LEGACY_ENUM_IS_CLOSED_MASK) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i5) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i5);
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!messageFieldSchema.isInitialized(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t3, int i, int i5) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t3, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i5)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t3, T t5, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(t3, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t5, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t3, int i, int i5) {
        return UnsafeUtil.getInt(t3, (long) (presenceMaskAndOffsetAt(i5) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t3, long j) {
        return UnsafeUtil.getLong(t3, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r0 = r18.checkInitializedCount;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r0 >= r18.repeatedFieldOffsetStart) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r4 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r4 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r7.setBuilderToMessage(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x064b A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #0 {all -> 0x0671, blocks: (B:168:0x0645, B:170:0x064b, B:182:0x0675, B:183:0x067a), top: B:204:0x0645 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06b1 A[LOOP:4: B:196:0x06ad->B:198:0x06b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r19, com.google.protobuf.ExtensionSchema<ET> r20, T r21, com.google.protobuf.Reader r22, com.google.protobuf.ExtensionRegistryLite r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t3, T t5, int i) {
        if (isFieldPresent(t5, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t5, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t5);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t3, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t3, jOffset, object);
                }
                setFieldPresent(t3, i);
                return;
            }
            Object object2 = unsafe.getObject(t3, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t3, T t5, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(t5, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t5, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t5);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t3, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t3, jOffset, object);
                }
                setOneofPresent(t3, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t3, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t3, T t5, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putDouble(t3, jOffset, UnsafeUtil.getDouble(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 1:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putFloat(t3, jOffset, UnsafeUtil.getFloat(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 2:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 3:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 4:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 5:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 6:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 7:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putBoolean(t3, jOffset, UnsafeUtil.getBoolean(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 8:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 9:
                mergeMessage(t3, t5, i);
                break;
            case 10:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 11:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case Code.UNIMPLEMENTED /* 12 */:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 13:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 14:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 15:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putInt(t3, jOffset, UnsafeUtil.getInt(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case 16:
                if (isFieldPresent(t5, i)) {
                    UnsafeUtil.putLong(t3, jOffset, UnsafeUtil.getLong(t5, jOffset));
                    setFieldPresent(t3, i);
                }
                break;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                mergeMessage(t3, t5, i);
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t3, t5, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t3, t5, jOffset);
                break;
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t5, iNumberAt, i)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t5, jOffset));
                    setOneofPresent(t3, iNumberAt, i);
                }
                break;
            case 60:
                mergeOneofMessage(t3, t5, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t5, iNumberAt, i)) {
                    UnsafeUtil.putObject(t3, jOffset, UnsafeUtil.getObject(t5, jOffset));
                    setOneofPresent(t3, iNumberAt, i);
                }
                break;
            case 68:
                mergeOneofMessage(t3, t5, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t3, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t3, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t3, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t3, int i, int i5) {
        Schema messageFieldSchema = getMessageFieldSchema(i5);
        if (!isOneofPresent(t3, i, i5)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t3, offset(typeAndOffsetAt(i5)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i5 = 0;
        int i8 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i5++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i8++;
            }
        }
        int[] iArr2 = i5 > 0 ? new int[i5] : null;
        int[] iArr3 = i8 > 0 ? new int[i8] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i10 < fields.length) {
            FieldInfo fieldInfo2 = fields[i10];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i11, objArr);
            if (i12 < checkInitialized.length && checkInitialized[i12] == fieldNumber3) {
                checkInitialized[i12] = i11;
                i12++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i13] = i11;
                i13++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    i = i11;
                    iArr3[i14] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i14++;
                }
                i10++;
                i11 = i + 3;
            }
            i = i11;
            i10++;
            i11 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo r31, com.google.protobuf.NewInstanceSchema r32, com.google.protobuf.ListFieldSchema r33, com.google.protobuf.UnknownFieldSchema<?, ?> r34, com.google.protobuf.ExtensionSchema<?> r35, com.google.protobuf.MapFieldSchema r36) {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t3, long j) {
        return ((Boolean) UnsafeUtil.getObject(t3, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t3, long j) {
        return ((Double) UnsafeUtil.getObject(t3, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t3, long j) {
        return ((Float) UnsafeUtil.getObject(t3, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t3, long j) {
        return ((Integer) UnsafeUtil.getObject(t3, j)).intValue();
    }

    private static <T> long oneofLongAt(T t3, long j) {
        return ((Long) UnsafeUtil.getObject(t3, j)).longValue();
    }

    private <K, V> int parseMapField(T t3, byte[] bArr, int i, int i5, int i8, long j, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i8);
        Object object = unsafe.getObject(t3, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t3, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i5, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t3, byte[] bArr, int i, int i5, int i8, int i10, int i11, int i12, int i13, long j, int i14, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j4 = this.buffer[i14 + 2] & 1048575;
        switch (i13) {
            case ONEOF_TYPE_OFFSET /* 51 */:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(t3, j, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i)));
                int i15 = i + 8;
                unsafe.putInt(t3, j4, i10);
                return i15;
            case 52:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(t3, j, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i)));
                int i16 = i + 4;
                unsafe.putInt(t3, j4, i10);
                return i16;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t3, j, Long.valueOf(registers.long1));
                unsafe.putInt(t3, j4, i10);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t3, j, Integer.valueOf(registers.int1));
                unsafe.putInt(t3, j4, i10);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(t3, j, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i)));
                int i17 = i + 8;
                unsafe.putInt(t3, j4, i10);
                return i17;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(t3, j, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i)));
                int i18 = i + 4;
                unsafe.putInt(t3, j4, i10);
                return i18;
            case 58:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t3, j, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t3, j4, i10);
                return iDecodeVarint642;
            case 59:
                if (i11 != 2) {
                    return i;
                }
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i19 = registers.int1;
                if (i19 == 0) {
                    unsafe.putObject(t3, j, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                } else {
                    if ((i12 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i19)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t3, j, new String(bArr, iDecodeVarint322, i19, Internal.UTF_8));
                    iDecodeVarint322 += i19;
                }
                unsafe.putInt(t3, j4, i10);
                return iDecodeVarint322;
            case 60:
                if (i11 != 2) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t3, i10, i14);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i14), bArr, i, i5, registers);
                storeOneofMessageField(t3, i10, i14, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i11 != 2) {
                    return i;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i, registers);
                unsafe.putObject(t3, j, registers.object1);
                unsafe.putInt(t3, j4, i10);
                return iDecodeBytes;
            case 63:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i20 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i14);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i20)) {
                    unsafe.putObject(t3, j, Integer.valueOf(i20));
                    unsafe.putInt(t3, j4, i10);
                } else {
                    getMutableUnknownFields(t3).storeField(i8, Long.valueOf(i20));
                }
                return iDecodeVarint323;
            case 66:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t3, j, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t3, j4, i10);
                return iDecodeVarint324;
            case 67:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t3, j, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t3, j4, i10);
                return iDecodeVarint643;
            case 68:
                if (i11 != 3) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t3, i10, i14);
                int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i14), bArr, i, i5, (i8 & (-8)) | 4, registers);
                storeOneofMessageField(t3, i10, i14, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return i;
        }
    }

    private int parseRepeatedField(T t3, byte[] bArr, int i, int i5, int i8, int i10, int i11, int i12, long j, int i13, long j4, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t3, j4);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t3, j4, protobufListMutableCopyWithCapacity2);
        }
        switch (i13) {
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 35:
                return i11 == 2 ? ArrayDecoders.decodePackedDoubleList(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 1 ? ArrayDecoders.decodeDoubleList(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 36:
                return i11 == 2 ? ArrayDecoders.decodePackedFloatList(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 5 ? ArrayDecoders.decodeFloatList(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 20:
            case 21:
            case 37:
            case 38:
                return i11 == 2 ? ArrayDecoders.decodePackedVarint64List(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 0 ? ArrayDecoders.decodeVarint64List(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
            case 29:
            case 39:
            case 43:
                return i11 == 2 ? ArrayDecoders.decodePackedVarint32List(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 0 ? ArrayDecoders.decodeVarint32List(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case ConnectionResult.API_DISABLED /* 23 */:
            case 32:
            case 40:
            case 46:
                return i11 == 2 ? ArrayDecoders.decodePackedFixed64List(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 1 ? ArrayDecoders.decodeFixed64List(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 31:
            case 41:
            case 45:
                return i11 == 2 ? ArrayDecoders.decodePackedFixed32List(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 5 ? ArrayDecoders.decodeFixed32List(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 25:
            case 42:
                return i11 == 2 ? ArrayDecoders.decodePackedBoolList(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 0 ? ArrayDecoders.decodeBoolList(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 26:
                return i11 == 2 ? (j & 536870912) == 0 ? ArrayDecoders.decodeStringList(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : ArrayDecoders.decodeStringListRequireUtf8(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 27:
                return i11 == 2 ? ArrayDecoders.decodeMessageList(getMessageFieldSchema(i12), i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 28:
                return i11 == 2 ? ArrayDecoders.decodeBytesList(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 30:
            case 44:
                if (i11 == 2) {
                    iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i, protobufListMutableCopyWithCapacity2, registers);
                } else {
                    if (i11 != 0) {
                        return i;
                    }
                    iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers);
                }
                SchemaUtil.filterUnknownEnumList((Object) t3, i10, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i12), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                return i11 == 2 ? ArrayDecoders.decodePackedSInt32List(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 0 ? ArrayDecoders.decodeSInt32List(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 34:
            case 48:
                return i11 == 2 ? ArrayDecoders.decodePackedSInt64List(bArr, i, protobufListMutableCopyWithCapacity2, registers) : i11 == 0 ? ArrayDecoders.decodeSInt64List(i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            case 49:
                return i11 == 3 ? ArrayDecoders.decodeGroupList(getMessageFieldSchema(i12), i8, bArr, i, i5, protobufListMutableCopyWithCapacity2, registers) : i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t3, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t3, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t3, j));
    }

    private void setOneofPresent(T t3, int i, int i5) {
        UnsafeUtil.putInt(t3, presenceMaskAndOffsetAt(i5) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i5) {
        int length = (this.buffer.length / 3) - 1;
        while (i5 <= length) {
            int i8 = (length + i5) >>> 1;
            int i10 = i8 * 3;
            int iNumberAt = numberAt(i10);
            if (i == iNumberAt) {
                return i10;
            }
            if (i < iNumberAt) {
                length = i8 - 1;
            } else {
                i5 = i8 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t3, int i, Object obj) {
        UNSAFE.putObject(t3, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t3, i);
    }

    private void storeOneofMessageField(T t3, int i, int i5, Object obj) {
        UNSAFE.putObject(t3, offset(typeAndOffsetAt(i5)), obj);
        setOneofPresent(t3, i, i5);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrder(T r22, com.google.protobuf.Writer r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i5) throws IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i5)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t3, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t3), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t3, T t5) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t3, t5, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t3).equals(this.unknownFieldSchema.getFromMessage(t5))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t3).equals(this.extensionSchema.getExtensions(t5));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t3) {
        int i;
        int i5;
        int i8;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i13);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i13);
            int i15 = this.buffer[i13 + 2];
            int i16 = i15 & i10;
            if (iType <= 17) {
                if (i16 != i11) {
                    i12 = i16 == i10 ? 0 : unsafe.getInt(t3, i16);
                    i11 = i16;
                }
                i = i11;
                i5 = i12;
                i8 = 1 << (i15 >>> 20);
            } else {
                i = i11;
                i5 = i12;
                i8 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i16 = 0;
            }
            switch (iType) {
                case 0:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i14 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i14 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t3, jOffset));
                        i14 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t3, jOffset));
                        i14 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t3, jOffset));
                        i14 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i14 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i14 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        Object object = unsafe.getObject(t3, jOffset);
                        iComputeBoolSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t3, jOffset), getMessageFieldSchema(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    if (isFieldPresent(t3, i13, i, i5, i8)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t3, jOffset), getMessageFieldSchema(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 20:
                    iComputeBoolSize = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 21:
                    iComputeBoolSize = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    iComputeBoolSize = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 25:
                    iComputeBoolSize = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 26:
                    iComputeBoolSize = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t3, jOffset));
                    i14 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t3, jOffset), getMessageFieldSchema(i13));
                    i14 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t3, jOffset));
                    i14 += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 30:
                    iComputeBoolSize = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 31:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 32:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 33:
                    iComputeBoolSize = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 34:
                    iComputeBoolSize = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t3, jOffset), false);
                    i14 += iComputeBoolSize;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t3, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t3, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t3, jOffset), getMessageFieldSchema(i13));
                    i14 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t3, jOffset), getMapFieldDefaultEntry(i13));
                    i14 += iComputeBoolSize;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        Object object2 = unsafe.getObject(t3, jOffset);
                        iComputeBoolSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t3, jOffset), getMessageFieldSchema(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i14 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t3, jOffset));
                        i14 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t3, iNumberAt, i13)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t3, jOffset), getMessageFieldSchema(i13));
                        i14 += iComputeBoolSize;
                    }
                    break;
            }
            i13 += 3;
            i11 = i;
            i12 = i5;
            i10 = 1048575;
        }
        int unknownFieldsSerializedSize = i14 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t3);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t3).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t3) {
        int i;
        int iHashLong;
        int length = this.buffer.length;
        int i5 = 0;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i8);
            int iNumberAt = numberAt(i8);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i5 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t3, jOffset)));
                    i5 = i + iHashLong;
                    break;
                case 1:
                    i = i5 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t3, jOffset));
                    i5 = i + iHashLong;
                    break;
                case 2:
                    i = i5 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i5 = i + iHashLong;
                    break;
                case 3:
                    i = i5 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i5 = i + iHashLong;
                    break;
                case 4:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getInt(t3, jOffset);
                    i5 = i + iHashLong;
                    break;
                case 5:
                    i = i5 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i5 = i + iHashLong;
                    break;
                case 6:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getInt(t3, jOffset);
                    i5 = i + iHashLong;
                    break;
                case 7:
                    i = i5 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t3, jOffset));
                    i5 = i + iHashLong;
                    break;
                case 8:
                    i = i5 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t3, jOffset)).hashCode();
                    i5 = i + iHashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t3, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 10:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                    i5 = i + iHashLong;
                    break;
                case 11:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getInt(t3, jOffset);
                    i5 = i + iHashLong;
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getInt(t3, jOffset);
                    i5 = i + iHashLong;
                    break;
                case 13:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getInt(t3, jOffset);
                    i5 = i + iHashLong;
                    break;
                case 14:
                    i = i5 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i5 = i + iHashLong;
                    break;
                case 15:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getInt(t3, jOffset);
                    i5 = i + iHashLong;
                    break;
                case 16:
                    i = i5 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t3, jOffset));
                    i5 = i + iHashLong;
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    Object object2 = UnsafeUtil.getObject(t3, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 20:
                case 21:
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                    i5 = i + iHashLong;
                    break;
                case 50:
                    i = i5 * 53;
                    iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                    i5 = i + iHashLong;
                    break;
                case ONEOF_TYPE_OFFSET /* 51 */:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t3, jOffset)));
                        i5 = i + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t3, jOffset));
                        i5 = i + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i5 = i + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i5 = i + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = oneofIntAt(t3, jOffset);
                        i5 = i + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i5 = i + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = oneofIntAt(t3, jOffset);
                        i5 = i + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t3, jOffset));
                        i5 = i + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t3, jOffset)).hashCode();
                        i5 = i + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                        i5 = i + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                        i5 = i + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = oneofIntAt(t3, jOffset);
                        i5 = i + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = oneofIntAt(t3, jOffset);
                        i5 = i + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = oneofIntAt(t3, jOffset);
                        i5 = i + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i5 = i + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = oneofIntAt(t3, jOffset);
                        i5 = i + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t3, jOffset));
                        i5 = i + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t3, iNumberAt, i8)) {
                        i = i5 * 53;
                        iHashLong = UnsafeUtil.getObject(t3, jOffset).hashCode();
                        i5 = i + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i5 * 53) + this.unknownFieldSchema.getFromMessage(t3).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t3).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r10 = 0
        Ld:
            int r2 = r6.checkInitializedCount
            r3 = 1
            if (r10 >= r2) goto Lb3
            int[] r2 = r6.intArray
            r11 = r2[r10]
            int r12 = r6.numberAt(r11)
            int r13 = r6.typeAndOffsetAt(r11)
            int[] r2 = r6.buffer
            int r4 = r11 + 2
            r2 = r2[r4]
            r4 = r2 & r8
            int r2 = r2 >>> 20
            int r14 = r3 << r2
            if (r4 == r0) goto L39
            if (r4 == r8) goto L35
            sun.misc.Unsafe r0 = com.google.protobuf.MessageSchema.UNSAFE
            long r1 = (long) r4
            int r1 = r0.getInt(r7, r1)
        L35:
            r16 = r1
            r15 = r4
            goto L3c
        L39:
            r15 = r0
            r16 = r1
        L3c:
            boolean r0 = isRequired(r13)
            if (r0 == 0) goto L52
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L52
            return r9
        L52:
            int r0 = type(r13)
            r1 = 9
            if (r0 == r1) goto L92
            r1 = 17
            if (r0 == r1) goto L92
            r1 = 27
            if (r0 == r1) goto L8b
            r1 = 60
            if (r0 == r1) goto L7a
            r1 = 68
            if (r0 == r1) goto L7a
            r1 = 49
            if (r0 == r1) goto L8b
            r1 = 50
            if (r0 == r1) goto L73
            goto Lac
        L73:
            boolean r0 = r6.isMapInitialized(r7, r13, r11)
            if (r0 != 0) goto Lac
            return r9
        L7a:
            boolean r0 = r6.isOneofPresent(r7, r12, r11)
            if (r0 == 0) goto Lac
            com.google.protobuf.Schema r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Lac
            return r9
        L8b:
            boolean r0 = r6.isListInitialized(r7, r13, r11)
            if (r0 != 0) goto Lac
            return r9
        L92:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r15
            r4 = r16
            r5 = r14
            boolean r0 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lac
            com.google.protobuf.Schema r0 = r6.getMessageFieldSchema(r11)
            boolean r0 = isInitialized(r7, r13, r0)
            if (r0 != 0) goto Lac
            return r9
        Lac:
            int r10 = r10 + 1
            r0 = r15
            r1 = r16
            goto Ld
        Lb3:
            boolean r0 = r6.hasExtensions
            if (r0 == 0) goto Lc4
            com.google.protobuf.ExtensionSchema<?> r0 = r6.extensionSchema
            com.google.protobuf.FieldSet r0 = r0.getExtensions(r7)
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto Lc4
            return r9
        Lc4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(T r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, T t5) {
        checkMutable(t3);
        t5.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t3, t5, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t3, t5);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t3, t5);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0098. Please report as an issue. */
    @CanIgnoreReturnValue
    public int parseMessage(T t3, byte[] bArr, int i, int i5, int i8, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe;
        int i10;
        MessageSchema<T> messageSchema;
        int i11;
        int i12;
        int i13;
        int i14;
        T t5;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        byte[] bArr2;
        int i22;
        int i23;
        byte[] bArr3;
        int iDecodeVarint64;
        int i24;
        int i25;
        MessageSchema<T> messageSchema2 = this;
        T t6 = t3;
        byte[] bArr4 = bArr;
        int i26 = i5;
        int i27 = i8;
        ArrayDecoders.Registers registers2 = registers;
        checkMutable(t3);
        Unsafe unsafe2 = UNSAFE;
        int iDecodeUnknownField = i;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i26) {
                int i33 = iDecodeUnknownField + 1;
                byte b4 = bArr4[iDecodeUnknownField];
                if (b4 < 0) {
                    int iDecodeVarint32 = ArrayDecoders.decodeVarint32(b4, bArr4, i33, registers2);
                    i15 = registers2.int1;
                    i33 = iDecodeVarint32;
                } else {
                    i15 = b4;
                }
                int i34 = i15 >>> 3;
                int i35 = i15 & 7;
                int iPositionForFieldNumber = i34 > i28 ? messageSchema2.positionForFieldNumber(i34, i29 / 3) : messageSchema2.positionForFieldNumber(i34);
                if (iPositionForFieldNumber == -1) {
                    i16 = i34;
                    i17 = i33;
                    i12 = i15;
                    i18 = i31;
                    i19 = i32;
                    unsafe = unsafe2;
                    i10 = i27;
                    i20 = 0;
                } else {
                    int i36 = messageSchema2.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i36);
                    long jOffset = offset(i36);
                    int i37 = i15;
                    if (iType <= 17) {
                        int i38 = messageSchema2.buffer[iPositionForFieldNumber + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = 1048575;
                        int i41 = i38 & 1048575;
                        if (i41 != i32) {
                            if (i32 != 1048575) {
                                unsafe2.putInt(t6, i32, i31);
                                i40 = 1048575;
                            }
                            i19 = i41;
                            i21 = i41 == i40 ? 0 : unsafe2.getInt(t6, i41);
                        } else {
                            i21 = i31;
                            i19 = i32;
                        }
                        switch (iType) {
                            case 0:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 1) {
                                    UnsafeUtil.putDouble(t6, jOffset, ArrayDecoders.decodeDouble(bArr2, i33));
                                    iDecodeUnknownField = i33 + 8;
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 5) {
                                    UnsafeUtil.putFloat(t6, jOffset, ArrayDecoders.decodeFloat(bArr2, i33));
                                    iDecodeUnknownField = i33 + 4;
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 0) {
                                    iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr3, i33, registers2);
                                    unsafe2.putLong(t3, jOffset, registers2.long1);
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, i33, registers2);
                                    unsafe2.putInt(t6, jOffset, registers2.int1);
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 1) {
                                    unsafe2.putLong(t3, jOffset, ArrayDecoders.decodeFixed64(bArr2, i33));
                                    iDecodeUnknownField = i33 + 8;
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 5) {
                                    unsafe2.putInt(t6, jOffset, ArrayDecoders.decodeFixed32(bArr2, i33));
                                    iDecodeUnknownField = i33 + 4;
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr2, i33, registers2);
                                    UnsafeUtil.putBoolean(t6, jOffset, registers2.long1 != 0);
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 2) {
                                    iDecodeUnknownField = isEnforceUtf8(i36) ? ArrayDecoders.decodeStringRequireUtf8(bArr2, i33, registers2) : ArrayDecoders.decodeString(bArr2, i33, registers2);
                                    unsafe2.putObject(t6, jOffset, registers2.object1);
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 2) {
                                    Object objMutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t6, i22);
                                    iDecodeUnknownField = ArrayDecoders.mergeMessageField(objMutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i22), bArr, i33, i5, registers);
                                    messageSchema2.storeMessageField(t6, i22, objMutableMessageFieldForMerge);
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 2) {
                                    iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr2, i33, registers2);
                                    unsafe2.putObject(t6, jOffset, registers2.object1);
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case Code.UNIMPLEMENTED /* 12 */:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, i33, registers2);
                                    int i42 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i22);
                                    if (!isLegacyEnumIsClosed(i36) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i42)) {
                                        unsafe2.putInt(t6, jOffset, i42);
                                        i31 = i21 | i39;
                                        i27 = i8;
                                        i29 = i22;
                                        bArr4 = bArr2;
                                        i30 = i23;
                                        i32 = i19;
                                        i28 = i16;
                                        i26 = i5;
                                    } else {
                                        getMutableUnknownFields(t3).storeField(i23, Long.valueOf(i42));
                                        i27 = i8;
                                        i29 = i22;
                                        i31 = i21;
                                        i30 = i23;
                                        i32 = i19;
                                        i28 = i16;
                                        i26 = i5;
                                        bArr4 = bArr2;
                                    }
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                if (i35 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, i33, registers2);
                                    unsafe2.putInt(t6, jOffset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr2;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case 16:
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                bArr3 = bArr;
                                if (i35 == 0) {
                                    iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr3, i33, registers2);
                                    unsafe2.putLong(t3, jOffset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i31 = i21 | i39;
                                    i27 = i8;
                                    i29 = i22;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                                if (i35 == 3) {
                                    Object objMutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t6, iPositionForFieldNumber);
                                    i16 = i34;
                                    i23 = i37;
                                    iDecodeUnknownField = ArrayDecoders.mergeGroupField(objMutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), bArr, i33, i5, (i34 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t6, iPositionForFieldNumber, objMutableMessageFieldForMerge2);
                                    i31 = i21 | i39;
                                    bArr4 = bArr;
                                    i27 = i8;
                                    i29 = iPositionForFieldNumber;
                                    i30 = i23;
                                    i32 = i19;
                                    i28 = i16;
                                    i26 = i5;
                                } else {
                                    i16 = i34;
                                    i23 = i37;
                                    i22 = iPositionForFieldNumber;
                                    i10 = i8;
                                    i17 = i33;
                                    i20 = i22;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i23;
                                }
                                break;
                            default:
                                i16 = i34;
                                i22 = iPositionForFieldNumber;
                                i23 = i37;
                                i10 = i8;
                                i17 = i33;
                                i20 = i22;
                                unsafe = unsafe2;
                                i18 = i21;
                                i12 = i23;
                                break;
                        }
                    } else {
                        i16 = i34;
                        int i43 = i32;
                        i18 = i31;
                        if (iType != 27) {
                            i19 = i43;
                            if (iType <= 49) {
                                int i44 = i33;
                                unsafe = unsafe2;
                                i20 = iPositionForFieldNumber;
                                i25 = i37;
                                iDecodeUnknownField = parseRepeatedField(t3, bArr, i33, i5, i37, i16, i35, iPositionForFieldNumber, i36, iType, jOffset, registers);
                                if (iDecodeUnknownField != i44) {
                                    messageSchema2 = this;
                                    t6 = t3;
                                    bArr4 = bArr;
                                    i26 = i5;
                                    i27 = i8;
                                    registers2 = registers;
                                    i30 = i25;
                                    i31 = i18;
                                    i29 = i20;
                                    i32 = i19;
                                    i28 = i16;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = i8;
                                    i17 = iDecodeUnknownField;
                                    i12 = i25;
                                }
                            } else {
                                i24 = i33;
                                unsafe = unsafe2;
                                i20 = iPositionForFieldNumber;
                                i25 = i37;
                                if (iType != 50) {
                                    iDecodeUnknownField = parseOneofField(t3, bArr, i24, i5, i25, i16, i35, i36, iType, jOffset, i20, registers);
                                    if (iDecodeUnknownField != i24) {
                                        messageSchema2 = this;
                                        t6 = t3;
                                        bArr4 = bArr;
                                        i26 = i5;
                                        i27 = i8;
                                        registers2 = registers;
                                        i30 = i25;
                                        i31 = i18;
                                        i29 = i20;
                                        i32 = i19;
                                        i28 = i16;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i8;
                                        i17 = iDecodeUnknownField;
                                        i12 = i25;
                                    }
                                } else if (i35 == 2) {
                                    iDecodeUnknownField = parseMapField(t3, bArr, i24, i5, i20, jOffset, registers);
                                    if (iDecodeUnknownField != i24) {
                                        messageSchema2 = this;
                                        t6 = t3;
                                        bArr4 = bArr;
                                        i26 = i5;
                                        i27 = i8;
                                        registers2 = registers;
                                        i30 = i25;
                                        i31 = i18;
                                        i29 = i20;
                                        i32 = i19;
                                        i28 = i16;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i8;
                                        i17 = iDecodeUnknownField;
                                        i12 = i25;
                                    }
                                }
                            }
                        } else if (i35 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t6, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t6, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            iDecodeUnknownField = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), i37, bArr, i33, i5, protobufListMutableCopyWithCapacity2, registers);
                            i27 = i8;
                            i29 = iPositionForFieldNumber;
                            i30 = i37;
                            i31 = i18;
                            i32 = i43;
                            i28 = i16;
                            bArr4 = bArr;
                            i26 = i5;
                        } else {
                            i19 = i43;
                            i24 = i33;
                            unsafe = unsafe2;
                            i20 = iPositionForFieldNumber;
                            i25 = i37;
                        }
                        i10 = i8;
                        i17 = i24;
                        i12 = i25;
                    }
                }
                if (i12 != i10 || i10 == 0) {
                    iDecodeUnknownField = (!this.hasExtensions || registers.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) ? ArrayDecoders.decodeUnknownField(i12, bArr, i17, i5, getMutableUnknownFields(t3), registers) : ArrayDecoders.decodeExtensionOrUnknownField(i12, bArr, i17, i5, t3, this.defaultInstance, this.unknownFieldSchema, registers);
                    t6 = t3;
                    bArr4 = bArr;
                    i26 = i5;
                    i30 = i12;
                    messageSchema2 = this;
                    registers2 = registers;
                    i31 = i18;
                    i29 = i20;
                    i32 = i19;
                    i28 = i16;
                    unsafe2 = unsafe;
                    i27 = i10;
                } else {
                    i14 = 1048575;
                    messageSchema = this;
                    i11 = i17;
                    i31 = i18;
                    i13 = i19;
                }
            } else {
                int i45 = i32;
                unsafe = unsafe2;
                i10 = i27;
                messageSchema = messageSchema2;
                i11 = iDecodeUnknownField;
                i12 = i30;
                i13 = i45;
                i14 = 1048575;
            }
        }
        if (i13 != i14) {
            t5 = t3;
            unsafe.putInt(t5, i13, i31);
        } else {
            t5 = t3;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i46 = messageSchema.checkInitializedCount; i46 < messageSchema.repeatedFieldOffsetStart; i46++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t3, messageSchema.intArray[i46], unknownFieldSetLite, messageSchema.unknownFieldSchema, t3);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t5, unknownFieldSetLite);
        }
        if (i10 == 0) {
            if (i11 != i5) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i11 > i5 || i12 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i11;
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t3, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t3, writer);
        } else {
            writeFieldsInAscendingOrder(t3, writer);
        }
    }

    private boolean isFieldPresent(T t3, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(t3, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t3, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t3, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t3, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t3, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t3, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t3, jOffset));
            case 11:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case Code.UNIMPLEMENTED /* 12 */:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t3, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t3, jOffset) != 0;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return UnsafeUtil.getObject(t3, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i, int i5) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i5);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        checkMutable(t3);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t3, reader, extensionRegistryLite);
    }

    private boolean equals(T t3, T t5, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t3, t5, i) && Double.doubleToLongBits(UnsafeUtil.getDouble(t3, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t5, jOffset));
            case 1:
                return arePresentForEquals(t3, t5, i) && Float.floatToIntBits(UnsafeUtil.getFloat(t3, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t5, jOffset));
            case 2:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getLong(t3, jOffset) == UnsafeUtil.getLong(t5, jOffset);
            case 3:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getLong(t3, jOffset) == UnsafeUtil.getLong(t5, jOffset);
            case 4:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getInt(t3, jOffset) == UnsafeUtil.getInt(t5, jOffset);
            case 5:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getLong(t3, jOffset) == UnsafeUtil.getLong(t5, jOffset);
            case 6:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getInt(t3, jOffset) == UnsafeUtil.getInt(t5, jOffset);
            case 7:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getBoolean(t3, jOffset) == UnsafeUtil.getBoolean(t5, jOffset);
            case 8:
                return arePresentForEquals(t3, t5, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t5, jOffset));
            case 9:
                return arePresentForEquals(t3, t5, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t5, jOffset));
            case 10:
                return arePresentForEquals(t3, t5, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t5, jOffset));
            case 11:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getInt(t3, jOffset) == UnsafeUtil.getInt(t5, jOffset);
            case Code.UNIMPLEMENTED /* 12 */:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getInt(t3, jOffset) == UnsafeUtil.getInt(t5, jOffset);
            case 13:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getInt(t3, jOffset) == UnsafeUtil.getInt(t5, jOffset);
            case 14:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getLong(t3, jOffset) == UnsafeUtil.getLong(t5, jOffset);
            case 15:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getInt(t3, jOffset) == UnsafeUtil.getInt(t5, jOffset);
            case 16:
                return arePresentForEquals(t3, t5, i) && UnsafeUtil.getLong(t3, jOffset) == UnsafeUtil.getLong(t5, jOffset);
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return arePresentForEquals(t3, t5, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t5, jOffset));
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t5, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t5, jOffset));
            case ONEOF_TYPE_OFFSET /* 51 */:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t3, t5, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t3, jOffset), UnsafeUtil.getObject(t5, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t3, byte[] bArr, int i, int i5, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t3, bArr, i, i5, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }
}
