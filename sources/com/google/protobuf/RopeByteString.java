package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Reader.READ_DONE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        return size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new RopeByteString(byteString, byteString2) : Balancer.access$100(new Balancer((1) null), byteString, byteString2);
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        PieceIterator pieceIterator = new PieceIterator(this, (1) null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString, (1) null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
        int i = 0;
        int i5 = 0;
        int i8 = 0;
        while (true) {
            int size = leafByteString.size() - i;
            int size2 = leafByteString2.size() - i5;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? leafByteString.equalsRange(leafByteString2, i5, iMin) : leafByteString2.equalsRange(leafByteString, i, iMin))) {
                return false;
            }
            i8 += iMin;
            int i10 = this.totalLength;
            if (i8 >= i10) {
                if (i8 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i = 0;
                leafByteString = (ByteString.LeafByteString) pieceIterator.next();
            } else {
                i += iMin;
                leafByteString = leafByteString;
            }
            if (iMin == size2) {
                leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
                i5 = 0;
            } else {
                i5 += iMin;
            }
        }
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        return i >= iArr.length ? Reader.READ_DONE : iArr[i];
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this, (1) null);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i5, int i8) {
        int i10 = i + i8;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            this.left.copyToInternal(bArr, i, i5, i8);
        } else {
            if (i >= i11) {
                this.right.copyToInternal(bArr, i - i11, i5, i8);
                return;
            }
            int i12 = i11 - i;
            this.left.copyToInternal(bArr, i, i5, i12);
            this.right.copyToInternal(bArr, 0, i5 + i12, i8 - i12);
        }
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
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsFragments(byteString);
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i5 = this.leftLength;
        return i < i5 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i5);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new RopeInputStream(this);
    }

    @Override // com.google.protobuf.ByteString
    public int partialHash(int i, int i5, int i8) {
        int i10 = i5 + i8;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            return this.left.partialHash(i, i5, i8);
        }
        if (i5 >= i11) {
            return this.right.partialHash(i, i5 - i11, i8);
        }
        int i12 = i11 - i5;
        return this.right.partialHash(this.left.partialHash(i, i5, i12), 0, i8 - i12);
    }

    @Override // com.google.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i5, int i8) {
        int i10 = i5 + i8;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            return this.left.partialIsValidUtf8(i, i5, i8);
        }
        if (i5 >= i11) {
            return this.right.partialIsValidUtf8(i, i5 - i11, i8);
        }
        int i12 = i11 - i5;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i5, i12), 0, i8 - i12);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i, int i5) {
        int iCheckRange = ByteString.checkRange(i, i5, this.totalLength);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i8 = this.leftLength;
        return i5 <= i8 ? this.left.substring(i, i5) : i >= i8 ? this.right.substring(i - i8, i5 - i8) : new RopeByteString(this.left.substring(i), this.right.substring(0, i5 - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i5) throws IOException {
        int i8 = i + i5;
        int i10 = this.leftLength;
        if (i8 <= i10) {
            this.left.writeToInternal(outputStream, i, i5);
        } else {
            if (i >= i10) {
                this.right.writeToInternal(outputStream, i - i10, i5);
                return;
            }
            int i11 = i10 - i;
            this.left.writeToInternal(outputStream, i, i11);
            this.right.writeToInternal(outputStream, 0, i5 - i11);
        }
    }

    @Override // com.google.protobuf.ByteString
    public void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.right.writeToReverse(byteOutput);
        this.left.writeToReverse(byteOutput);
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new 1(this);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        this.left.writeTo(byteOutput);
        this.right.writeTo(byteOutput);
    }
}
