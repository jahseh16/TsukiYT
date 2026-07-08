package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b4, byte b6, byte b7, byte b8, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b6) || (((b4 << 28) + (b6 + 112)) >> 30) != 0 || isNotTrailingByte(b7) || isNotTrailingByte(b8)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((b4 & 7) << 18) | (trailingByteValue(b6) << 12) | (trailingByteValue(b7) << 6) | trailingByteValue(b8);
            cArr[i] = highSurrogate(iTrailingByteValue);
            cArr[i + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b4, char[] cArr, int i) {
            cArr[i] = (char) b4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b4, byte b6, byte b7, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b6) || ((b4 == -32 && b6 < -96) || ((b4 == -19 && b6 >= -96) || isNotTrailingByte(b7)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b4 & 15) << 12) | (trailingByteValue(b6) << 6) | trailingByteValue(b7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b4, byte b6, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b4 < -62 || isNotTrailingByte(b6)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b4 & 31) << 6) | trailingByteValue(b6));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b4) {
            return b4 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b4) {
            return b4 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b4) {
            return b4 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b4) {
            return b4 < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b4) {
            return b4 & 63;
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i5) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i5);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i, i5) : decodeUtf8Default(byteBuffer, i, i5);
        }

        public abstract String decodeUtf8(byte[] bArr, int i, int i5) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i5) throws InvalidProtocolBufferException {
            if ((i | i5 | ((byteBuffer.limit() - i) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i5)));
            }
            int i8 = i + i5;
            char[] cArr = new char[i5];
            int i10 = 0;
            while (i < i8) {
                byte b4 = byteBuffer.get(i);
                if (!DecodeUtil.isOneByte(b4)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b4, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i < i8) {
                int i12 = i + 1;
                byte b6 = byteBuffer.get(i);
                if (DecodeUtil.isOneByte(b6)) {
                    int i13 = i11 + 1;
                    DecodeUtil.handleOneByte(b6, cArr, i11);
                    while (i12 < i8) {
                        byte b7 = byteBuffer.get(i12);
                        if (!DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        i12++;
                        DecodeUtil.handleOneByte(b7, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i = i12;
                } else if (DecodeUtil.isTwoBytes(b6)) {
                    if (i12 >= i8) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b6, byteBuffer.get(i12), cArr, i11);
                    i11++;
                } else if (DecodeUtil.isThreeBytes(b6)) {
                    if (i12 >= i8 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i14 = i + 2;
                    i += 3;
                    DecodeUtil.handleThreeBytes(b6, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i8 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b8 = byteBuffer.get(i12);
                    int i15 = i + 3;
                    byte b9 = byteBuffer.get(i + 2);
                    i += 4;
                    DecodeUtil.handleFourBytes(b6, b8, b9, byteBuffer.get(i15), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i5) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i5);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i;
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i5 = 0;
            while (i5 < length) {
                try {
                    char cCharAt = charSequence.charAt(i5);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i5, (byte) cCharAt);
                    i5++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                }
            }
            if (i5 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i5);
                return;
            }
            iPosition += i5;
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i8 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i8, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i8;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i8;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i10 = i5 + 1;
                        if (i10 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i11;
                                        i5 = i10;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                    try {
                                        byteBuffer.put(i11, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i5 = i10;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i5 = i10;
                                        iPosition = i;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i5 = i10;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i5, length);
                    }
                    int i12 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i5++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i, int i5) {
            return partialIsValidUtf8(0, bArr, i, i5) == 0;
        }

        public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i5, int i8) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i5, i8) : partialIsValidUtf8Default(i, byteBuffer, i5, i8);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i, byteBuffer.array(), i5 + iArrayOffset, iArrayOffset + i8);
        }

        public abstract int partialIsValidUtf8(int i, byte[] bArr, int i5, int i8);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i5, int i8);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i5) {
            return partialIsValidUtf8(0, byteBuffer, i, i5) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i5) {
            int iEstimateConsecutiveAscii = i + Utf8.estimateConsecutiveAscii(byteBuffer, i, i5);
            while (iEstimateConsecutiveAscii < i5) {
                int i8 = iEstimateConsecutiveAscii + 1;
                byte b4 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b4 >= 0) {
                    iEstimateConsecutiveAscii = i8;
                } else if (b4 < -32) {
                    if (i8 >= i5) {
                        return b4;
                    }
                    if (b4 < -62 || byteBuffer.get(i8) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b4 >= -16) {
                        if (i8 >= i5 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b4, i8, i5 - i8);
                        }
                        int i10 = iEstimateConsecutiveAscii + 2;
                        byte b6 = byteBuffer.get(i8);
                        if (b6 <= -65 && (((b4 << 28) + (b6 + 112)) >> 30) == 0) {
                            int i11 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i10) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i11) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i5 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b4, i8, i5 - i8);
                    }
                    int i12 = iEstimateConsecutiveAscii + 2;
                    byte b7 = byteBuffer.get(i8);
                    if (b7 > -65 || ((b4 == -32 && b7 < -96) || ((b4 == -19 && b7 >= -96) || byteBuffer.get(i12) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i5) {
            super("Unpaired surrogate at index " + i + " of " + i5);
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i, int i5) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i, i5);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i, int i5) {
        return processor.encodeUtf8(charSequence, bArr, i, i5);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i5 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i5 += (127 - cCharAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i5) {
        int i8 = i5 - 7;
        int i10 = i;
        while (i10 < i8 && (byteBuffer.getLong(i10) & ASCII_MASK_LONG) == 0) {
            i10 += 8;
        }
        return i10 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i5, int i8) {
        return processor.partialIsValidUtf8(i, bArr, i5, i8);
    }

    public static String decodeUtf8(byte[] bArr, int i, int i5) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i5) {
        if (i > -12 || i5 > -65) {
            return -1;
        }
        return i ^ (i5 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i5) {
        return processor.isValidUtf8(bArr, i, i5);
    }

    public static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i5, int i8) {
        return processor.partialIsValidUtf8(i, byteBuffer, i5, i8);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i5 = 0;
            if (i < 16) {
                return 0;
            }
            int i8 = 8 - (((int) j) & 7);
            while (i5 < i8) {
                long j4 = 1 + j;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i5;
                }
                i5++;
                j = j4;
            }
            while (true) {
                int i10 = i5 + 8;
                if (i10 > i || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j += 8;
                i5 = i10;
            }
            while (i5 < i) {
                long j7 = j + 1;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i5;
                }
                i5++;
                j = j7;
            }
            return i;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i5) {
            if (i5 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i5 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i5 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i5) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i, i5, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i5 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i5) throws InvalidProtocolBufferException {
            if ((i | i5 | ((byteBuffer.limit() - i) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i5)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i);
            long j = ((long) i5) + jAddressOffset;
            char[] cArr = new char[i5];
            int i8 = 0;
            while (jAddressOffset < j) {
                byte b4 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b4)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b4, cArr, i8);
                i8++;
            }
            while (jAddressOffset < j) {
                long j4 = jAddressOffset + 1;
                byte b6 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b6)) {
                    int i10 = i8 + 1;
                    DecodeUtil.handleOneByte(b6, cArr, i8);
                    while (j4 < j) {
                        byte b7 = UnsafeUtil.getByte(j4);
                        if (!DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        j4++;
                        DecodeUtil.handleOneByte(b7, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    jAddressOffset = j4;
                } else if (DecodeUtil.isTwoBytes(b6)) {
                    if (j4 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b6, UnsafeUtil.getByte(j4), cArr, i8);
                    i8++;
                } else if (DecodeUtil.isThreeBytes(b6)) {
                    if (j4 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j7 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b6, UnsafeUtil.getByte(j4), UnsafeUtil.getByte(j7), cArr, i8);
                    i8++;
                } else {
                    if (j4 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b8 = UnsafeUtil.getByte(j4);
                    long j8 = jAddressOffset + 3;
                    byte b9 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b6, b8, b9, UnsafeUtil.getByte(j8), cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i5) {
            long j;
            String str;
            String str2;
            int i8;
            long j4;
            long j7;
            char cCharAt;
            long j8 = i;
            long j9 = ((long) i5) + j8;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i5 || bArr.length - i5 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i5));
            }
            int i10 = 0;
            while (true) {
                j = 1;
                if (i10 >= length || (cCharAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j8, (byte) cCharAt);
                i10++;
                j8 = 1 + j8;
            }
            if (i10 == length) {
                return (int) j8;
            }
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 >= 128 || j8 >= j9) {
                    if (cCharAt2 >= 2048 || j8 > j9 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j8 > j9 - 3) {
                            if (j8 > j9 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i8 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i8)))) {
                                    throw new UnpairedSurrogateException(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j8);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j4 = 1;
                                    UnsafeUtil.putByte(bArr, j8, (byte) ((codePoint >>> 18) | 240));
                                    j7 = j9;
                                    UnsafeUtil.putByte(bArr, j8 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j10 = j8 + 3;
                                    UnsafeUtil.putByte(bArr, j8 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j8 += 4;
                                    UnsafeUtil.putByte(bArr, j10, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new UnpairedSurrogateException(i10 - 1, length);
                        }
                        UnsafeUtil.putByte(bArr, j8, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j11 = j8 + 2;
                        UnsafeUtil.putByte(bArr, j8 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j8 += 3;
                        UnsafeUtil.putByte(bArr, j11, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j12 = j8 + j;
                        UnsafeUtil.putByte(bArr, j8, (byte) ((cCharAt2 >>> 6) | 960));
                        j8 += 2;
                        UnsafeUtil.putByte(bArr, j12, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j7 = j9;
                    j4 = 1;
                } else {
                    UnsafeUtil.putByte(bArr, j8, (byte) cCharAt2);
                    j7 = j9;
                    str2 = str4;
                    j4 = j;
                    j8 += j;
                    str = str3;
                }
                i10++;
                str3 = str;
                str4 = str2;
                j = j4;
                j9 = j7;
            }
            return (int) j8;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j;
            char c;
            long j4;
            long j7;
            int i;
            long j8;
            int i5;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i8 = 0;
            while (true) {
                j = 1;
                c = 128;
                if (i8 >= length || (cCharAt = charSequence.charAt(i8)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i8++;
                jPosition = 1 + jPosition;
            }
            if (i8 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i8 < length) {
                char cCharAt2 = charSequence.charAt(i8);
                if (cCharAt2 < c && jPosition < jLimit) {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j4 = jAddressOffset;
                    j7 = jLimit;
                    i = i8;
                    j8 = j;
                    jPosition += j;
                } else if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                    j4 = jAddressOffset;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                        if (jPosition > jLimit - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                throw new UnpairedSurrogateException(i8, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                        }
                        i = i8 + 1;
                        if (i != length) {
                            char cCharAt3 = charSequence.charAt(i);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                j8 = 1;
                                UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                j7 = jLimit;
                                UnsafeUtil.putByte(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = jPosition + 3;
                                UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                jPosition += 4;
                                UnsafeUtil.putByte(j9, (byte) ((codePoint & 63) | 128));
                            } else {
                                i8 = i;
                            }
                        }
                        throw new UnpairedSurrogateException(i8 - 1, length);
                    }
                    long j10 = jPosition + j;
                    UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j11 = jPosition + 2;
                    UnsafeUtil.putByte(j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    jPosition += 3;
                    UnsafeUtil.putByte(j11, (byte) ((cCharAt2 & '?') | 128));
                    j7 = jLimit;
                    i = i8;
                    j8 = 1;
                    i8 = i + 1;
                    jAddressOffset = j4;
                    j = j8;
                    jLimit = j7;
                    c = 128;
                } else {
                    j4 = jAddressOffset;
                    long j12 = jPosition + j;
                    UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                    jPosition += 2;
                    UnsafeUtil.putByte(j12, (byte) ((cCharAt2 & '?') | 128));
                    j7 = jLimit;
                    i = i8;
                    j8 = j;
                }
                i8 = i + 1;
                jAddressOffset = j4;
                j = j8;
                jLimit = j7;
                c = 128;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r13, r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i5 = (int) ((-j) & 7);
            int i8 = i5;
            while (i8 > 0) {
                long j4 = 1 + j;
                if (UnsafeUtil.getByte(j) < 0) {
                    return i5 - i8;
                }
                i8--;
                j = j4;
            }
            int i10 = i - i5;
            while (i10 >= 8 && (UnsafeUtil.getLong(j) & Utf8.ASCII_MASK_LONG) == 0) {
                j += 8;
                i10 -= 8;
            }
            return i - i10;
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i5) {
            if (i5 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i5 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j));
            }
            if (i5 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j), UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i5, int i8) {
        if (i > -12 || i5 > -65 || i8 > -65) {
            return -1;
        }
        return (i ^ (i5 << 8)) ^ (i8 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i5) {
        byte b4 = bArr[i - 1];
        int i8 = i5 - i;
        if (i8 == 0) {
            return incompleteStateFor(b4);
        }
        if (i8 == 1) {
            return incompleteStateFor(b4, bArr[i]);
        }
        if (i8 == 2) {
            return incompleteStateFor(b4, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i5, int i8) {
        if (i8 == 0) {
            return incompleteStateFor(i);
        }
        if (i8 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i5));
        }
        if (i8 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i5), byteBuffer.get(i5 + 1));
        }
        throw new AssertionError();
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i5) {
            while (i < i5) {
                int i8 = i + 1;
                byte b4 = bArr[i];
                if (b4 < 0) {
                    if (b4 < -32) {
                        if (i8 >= i5) {
                            return b4;
                        }
                        if (b4 >= -62) {
                            i += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b4 >= -16) {
                        if (i8 >= i5 - 2) {
                            return Utf8.incompleteStateFor(bArr, i8, i5);
                        }
                        int i10 = i + 2;
                        byte b6 = bArr[i8];
                        if (b6 <= -65 && (((b4 << 28) + (b6 + 112)) >> 30) == 0) {
                            int i11 = i + 3;
                            if (bArr[i10] <= -65) {
                                i += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i8 >= i5 - 1) {
                        return Utf8.incompleteStateFor(bArr, i8, i5);
                    }
                    int i12 = i + 2;
                    byte b7 = bArr[i8];
                    if (b7 <= -65 && ((b4 != -32 || b7 >= -96) && (b4 != -19 || b7 < -96))) {
                        i += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                i = i8;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i5) throws InvalidProtocolBufferException {
            if ((i | i5 | ((bArr.length - i) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i5)));
            }
            int i8 = i + i5;
            char[] cArr = new char[i5];
            int i10 = 0;
            while (i < i8) {
                byte b4 = bArr[i];
                if (!DecodeUtil.isOneByte(b4)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b4, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i < i8) {
                int i12 = i + 1;
                byte b6 = bArr[i];
                if (DecodeUtil.isOneByte(b6)) {
                    int i13 = i11 + 1;
                    DecodeUtil.handleOneByte(b6, cArr, i11);
                    while (i12 < i8) {
                        byte b7 = bArr[i12];
                        if (!DecodeUtil.isOneByte(b7)) {
                            break;
                        }
                        i12++;
                        DecodeUtil.handleOneByte(b7, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i = i12;
                } else if (DecodeUtil.isTwoBytes(b6)) {
                    if (i12 >= i8) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b6, bArr[i12], cArr, i11);
                    i11++;
                } else if (DecodeUtil.isThreeBytes(b6)) {
                    if (i12 >= i8 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i14 = i + 2;
                    i += 3;
                    DecodeUtil.handleThreeBytes(b6, bArr[i12], bArr[i14], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i8 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b8 = bArr[i12];
                    int i15 = i + 3;
                    byte b9 = bArr[i + 2];
                    i += 4;
                    DecodeUtil.handleFourBytes(b6, b8, b9, bArr[i15], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i5) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i5);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i5) {
            int i8;
            int i10;
            char cCharAt;
            int length = charSequence.length();
            int i11 = i5 + i;
            int i12 = 0;
            while (i12 < length && (i10 = i12 + i) < i11 && (cCharAt = charSequence.charAt(i12)) < 128) {
                bArr[i10] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length) {
                return i + length;
            }
            int i13 = i + i12;
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 < 128 && i13 < i11) {
                    bArr[i13] = (byte) cCharAt2;
                    i13++;
                } else if (cCharAt2 < 2048 && i13 <= i11 - 2) {
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                    i13 += 2;
                    bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i13 > i11 - 3) {
                        if (i13 > i11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i8 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i8)))) {
                                throw new UnpairedSurrogateException(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i13);
                        }
                        int i15 = i12 + 1;
                        if (i15 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i16 = i13 + 3;
                                bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i13 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                                i12 = i15;
                            } else {
                                i12 = i15;
                            }
                        }
                        throw new UnpairedSurrogateException(i12 - 1, length);
                    }
                    bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i17 = i13 + 2;
                    bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i13 += 3;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                }
                i12++;
            }
            return i13;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i5, int i8) {
            return partialIsValidUtf8Default(i, byteBuffer, i5, i8);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i5) {
            while (i < i5 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i5) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i5);
        }
    }
}
