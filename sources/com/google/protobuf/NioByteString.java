package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class NioByteString extends ByteString.LeafByteString {
    private final ByteBuffer buffer;

    public NioByteString(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i, int i5) {
        if (i < this.buffer.position() || i5 > this.buffer.limit() || i > i5) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i5)));
        }
        ByteBuffer byteBufferSlice = this.buffer.slice();
        Java8Compatibility.position(byteBufferSlice, i - this.buffer.position());
        Java8Compatibility.limit(byteBufferSlice, i5 - this.buffer.position());
        return byteBufferSlice;
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e5) {
            throw new ArrayIndexOutOfBoundsException(e5.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i5, int i8) {
        ByteBuffer byteBufferSlice = this.buffer.slice();
        Java8Compatibility.position(byteBufferSlice, i);
        byteBufferSlice.get(bArr, i5, i8);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? this.buffer.equals(((NioByteString) obj).buffer) : obj instanceof RopeByteString ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    public boolean equalsRange(ByteString byteString, int i, int i5) {
        return substring(0, i5).equals(byteString.substring(i, i5 + i));
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        return Utf8.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new 1(this);
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i5, int i8) {
        for (int i10 = i5; i10 < i5 + i8; i10++) {
            i = (i * 31) + this.buffer.get(i10);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i5, int i8) {
        return Utf8.partialIsValidUtf8(i, this.buffer, i5, i8 + i5);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i5) {
        try {
            return new NioByteString(slice(i, i5));
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e5) {
            throw new ArrayIndexOutOfBoundsException(e5.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            iArrayOffset = this.buffer.arrayOffset() + this.buffer.position();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i5) throws IOException {
        if (!this.buffer.hasArray()) {
            ByteBufferWriter.write(slice(i, i5 + i), outputStream);
        } else {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i, i5);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.buffer.slice());
    }
}
