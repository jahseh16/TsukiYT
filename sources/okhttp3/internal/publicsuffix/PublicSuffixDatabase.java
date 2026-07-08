package okhttp3.internal.publicsuffix;

import ck1.i9;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import hk1.fb;
import hk1.p;
import hk1.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import tj1.gv;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public byte[] f7183gv;
    public byte[] zn;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f7182v = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7179a = {42};

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final List<String> f7180fb = CollectionsKt.listOf("*");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final PublicSuffixDatabase f7181s = new PublicSuffixDatabase();
    public final AtomicBoolean y = new AtomicBoolean(false);
    public final CountDownLatch n3 = new CountDownLatch(1);

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String n3(byte[] bArr, byte[][] bArr2, int i) {
            int i5;
            int iGv;
            boolean z;
            int iGv2;
            int length = bArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i10 = (i8 + length) / 2;
                while (i10 > -1 && bArr[i10] != 10) {
                    i10--;
                }
                int i11 = i10 + 1;
                int i12 = 1;
                while (true) {
                    i5 = i11 + i12;
                    if (bArr[i5] == 10) {
                        break;
                    }
                    i12++;
                }
                int i13 = i5 - i11;
                int i14 = i;
                boolean z5 = false;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (z5) {
                        iGv = 46;
                        z = false;
                    } else {
                        boolean z7 = z5;
                        iGv = gv.gv(bArr2[i14][i15], 255);
                        z = z7;
                    }
                    iGv2 = iGv - gv.gv(bArr[i11 + i16], 255);
                    if (iGv2 != 0) {
                        break;
                    }
                    i16++;
                    i15++;
                    if (i16 == i13) {
                        break;
                    }
                    if (bArr2[i14].length != i15) {
                        z5 = z;
                    } else {
                        if (i14 == bArr2.length - 1) {
                            break;
                        }
                        i14++;
                        z5 = true;
                        i15 = -1;
                    }
                }
                if (iGv2 >= 0) {
                    if (iGv2 <= 0) {
                        int i17 = i13 - i16;
                        int length2 = bArr2[i14].length - i15;
                        int length3 = bArr2.length;
                        for (int i18 = i14 + 1; i18 < length3; i18++) {
                            length2 += bArr2[i18].length;
                        }
                        if (length2 >= i17) {
                            if (length2 <= i17) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i11, i13, UTF_8);
                            }
                        }
                    }
                    i8 = i5 + 1;
                }
                length = i10;
            }
            return null;
        }

        public final PublicSuffixDatabase zn() {
            return PublicSuffixDatabase.f7181s;
        }

        public y() {
        }
    }

    public final List<String> a(String str) {
        List<String> listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt.last((List) listSplit$default), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING) ? CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }

    public final void gv() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        fb fbVarGv = x.gv(new p(x.f(resourceAsStream)));
        try {
            byte[] bArrA8 = fbVarGv.a8(fbVarGv.readInt());
            byte[] bArrA82 = fbVarGv.a8(fbVarGv.readInt());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fbVarGv, null);
            synchronized (this) {
                Intrinsics.checkNotNull(bArrA8);
                this.zn = bArrA8;
                Intrinsics.checkNotNull(bArrA82);
                this.f7183gv = bArrA82;
            }
            this.n3.countDown();
        } finally {
        }
    }

    public final List<String> n3(List<String> list) {
        String str;
        String str2;
        String strN3;
        if (this.y.get() || !this.y.compareAndSet(false, true)) {
            try {
                this.n3.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            v();
        }
        if (this.zn == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str3 = list.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                str = null;
                break;
            }
            int i8 = i5 + 1;
            y yVar = f7182v;
            byte[] bArr2 = this.zn;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            String strN32 = yVar.n3(bArr2, bArr, i5);
            if (strN32 != null) {
                str = strN32;
                break;
            }
            i5 = i8;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                bArr3[i10] = f7179a;
                y yVar2 = f7182v;
                byte[] bArr4 = this.zn;
                if (bArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strN33 = yVar2.n3(bArr4, bArr3, i10);
                if (strN33 != null) {
                    str2 = strN33;
                    break;
                }
                i10 = i11;
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i12 = size - 1;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                y yVar3 = f7182v;
                byte[] bArr5 = this.f7183gv;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                strN3 = yVar3.n3(bArr5, bArr, i13);
                if (strN3 != null) {
                    break;
                }
                i13 = i14;
            }
            strN3 = null;
        } else {
            strN3 = null;
        }
        if (strN3 != null) {
            return StringsKt.split$default((CharSequence) Intrinsics.stringPlus("!", strN3), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (str == null && str2 == null) {
            return f7180fb;
        }
        List<String> listSplit$default = str == null ? null : StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (listSplit$default == null) {
            listSplit$default = CollectionsKt.emptyList();
        }
        List<String> listSplit$default2 = str2 != null ? StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null) : null;
        if (listSplit$default2 == null) {
            listSplit$default2 = CollectionsKt.emptyList();
        }
        return listSplit$default.size() > listSplit$default2.size() ? listSplit$default : listSplit$default2;
    }

    public final void v() {
        boolean z = false;
        while (true) {
            try {
                try {
                    gv();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e4) {
                    i9.y.fb().f("Failed to read public suffix list", 5, e4);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final String zn(String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List<String> listA = a(unicodeDomain);
        List<String> listN3 = n3(listA);
        if (listA.size() == listN3.size() && listN3.get(0).charAt(0) != '!') {
            return null;
        }
        if (listN3.get(0).charAt(0) == '!') {
            size = listA.size();
            size2 = listN3.size();
        } else {
            size = listA.size();
            size2 = listN3.size() + 1;
        }
        return SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(a(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
