package t0;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k4.k;
import k4.n;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public zn f8138a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final SparseBooleanArray f8139gv;
    public final SparseArray<String> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public zn f8140v;
    public final HashMap<String, f> y;
    public final SparseBooleanArray zn;

    public static final class y implements zn {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String[] f8145v = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public String f8146gv;
        public final SparseArray<f> n3 = new SparseArray<>();
        public final kx.n3 y;
        public String zn;

        public y(kx.n3 n3Var) {
            this.y = n3Var;
        }

        public static void c5(kx.n3 n3Var, String str) throws kx.y {
            try {
                String strTl = tl(str);
                SQLiteDatabase writableDatabase = n3Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    kx.gv.zn(writableDatabase, 1, str);
                    f(writableDatabase, strTl);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e4) {
                throw new kx.y(e4);
            }
        }

        public static void f(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String tl(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // t0.t.zn
        public void a(f fVar) {
            this.n3.put(fVar.y, fVar);
        }

        @Override // t0.t.zn
        public void delete() throws kx.y {
            c5(this.y, (String) v0.y.v(this.zn));
        }

        @Override // t0.t.zn
        public void fb(HashMap<String, f> map, SparseArray<String> sparseArray) throws IOException {
            v0.y.fb(this.n3.size() == 0);
            try {
                if (kx.gv.n3(this.y.getReadableDatabase(), 1, (String) v0.y.v(this.zn)) != 1) {
                    SQLiteDatabase writableDatabase = this.y.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        wz(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorT = t();
                while (cursorT.moveToNext()) {
                    try {
                        f fVar = new f(cursorT.getInt(0), (String) v0.y.v(cursorT.getString(1)), t.mt(new DataInputStream(new ByteArrayInputStream(cursorT.getBlob(2)))));
                        map.put(fVar.n3, fVar);
                        sparseArray.put(fVar.y, fVar.n3);
                    } finally {
                    }
                }
                cursorT.close();
            } catch (SQLiteException e4) {
                map.clear();
                sparseArray.clear();
                throw new kx.y(e4);
            }
        }

        @Override // t0.t.zn
        public void gv(HashMap<String, f> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.y.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    wz(writableDatabase);
                    Iterator<f> it = map.values().iterator();
                    while (it.hasNext()) {
                        s(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.n3.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e4) {
                throw new kx.y(e4);
            }
        }

        public final void i9(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((String) v0.y.v(this.f8146gv), "id = ?", new String[]{Integer.toString(i)});
        }

        @Override // t0.t.zn
        public void n3(HashMap<String, f> map) throws IOException {
            if (this.n3.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.y.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.n3.size(); i++) {
                    try {
                        f fVarValueAt = this.n3.valueAt(i);
                        if (fVarValueAt == null) {
                            i9(writableDatabase, this.n3.keyAt(i));
                        } else {
                            s(writableDatabase, fVarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.n3.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e4) {
                throw new kx.y(e4);
            }
        }

        public final void s(SQLiteDatabase sQLiteDatabase, f fVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            t.r(fVar.gv(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(fVar.y));
            contentValues.put("key", fVar.n3);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) v0.y.v(this.f8146gv), null, contentValues);
        }

        public final Cursor t() {
            return this.y.getReadableDatabase().query((String) v0.y.v(this.f8146gv), f8145v, null, null, null, null, null);
        }

        @Override // t0.t.zn
        public void v(f fVar, boolean z) {
            if (z) {
                this.n3.delete(fVar.y);
            } else {
                this.n3.put(fVar.y, null);
            }
        }

        public final void wz(SQLiteDatabase sQLiteDatabase) throws kx.y {
            kx.gv.gv(sQLiteDatabase, 1, (String) v0.y.v(this.zn), 1);
            f(sQLiteDatabase, (String) v0.y.v(this.f8146gv));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f8146gv + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // t0.t.zn
        public boolean y() throws kx.y {
            try {
                return kx.gv.n3(this.y.getReadableDatabase(), 1, (String) v0.y.v(this.zn)) != -1;
            } catch (SQLException e4) {
                throw new kx.y(e4);
            }
        }

        @Override // t0.t.zn
        public void zn(long j) {
            String hexString = Long.toHexString(j);
            this.zn = hexString;
            this.f8146gv = tl(hexString);
        }
    }

    public interface zn {
        void a(f fVar);

        void delete() throws IOException;

        void fb(HashMap<String, f> map, SparseArray<String> sparseArray) throws IOException;

        void gv(HashMap<String, f> map) throws IOException;

        void n3(HashMap<String, f> map) throws IOException;

        void v(f fVar, boolean z);

        boolean y() throws IOException;

        void zn(long j);
    }

    public t(@Nullable kx.n3 n3Var, @Nullable File file, @Nullable byte[] bArr, boolean z, boolean z5) {
        v0.y.fb((n3Var == null && file == null) ? false : true);
        this.y = new HashMap<>();
        this.n3 = new SparseArray<>();
        this.zn = new SparseBooleanArray();
        this.f8139gv = new SparseBooleanArray();
        y yVar = n3Var != null ? new y(n3Var) : null;
        n3 n3Var2 = file != null ? new n3(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (yVar == null || (n3Var2 != null && z5)) {
            this.f8140v = (zn) ut.i9(n3Var2);
            this.f8138a = yVar;
        } else {
            this.f8140v = yVar;
            this.f8138a = n3Var2;
        }
    }

    @SuppressLint({"GetInstance"})
    public static Cipher c5() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (ut.y == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static w mt(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < i; i5++) {
            String utf = dataInputStream.readUTF();
            int i8 = dataInputStream.readInt();
            if (i8 < 0) {
                throw new IOException("Invalid value size: " + i8);
            }
            int iMin = Math.min(i8, 10485760);
            byte[] bArrCopyOf = ut.f8757a;
            int i10 = 0;
            while (i10 != i8) {
                int i11 = i10 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                dataInputStream.readFully(bArrCopyOf, i10, iMin);
                iMin = Math.min(i8 - i11, 10485760);
                i10 = i11;
            }
            map.put(utf, bArrCopyOf);
        }
        return new w(map);
    }

    public static void r(w wVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setA = wVar.a();
        dataOutputStream.writeInt(setA.size());
        for (Map.Entry<String, byte[]> entry : setA) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static int tl(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    public static boolean w(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public int a(String str) {
        return wz(str).y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void co() {
        k it = n.n(this.y.keySet()).iterator();
        while (it.hasNext()) {
            p((String) it.next());
        }
    }

    @Nullable
    public String f(int i) {
        return this.n3.get(i);
    }

    @Nullable
    public f fb(String str) {
        return this.y.get(str);
    }

    public final f gv(String str) {
        int iTl = tl(this.n3);
        f fVar = new f(iTl, str);
        this.y.put(str, fVar);
        this.n3.put(iTl, str);
        this.f8139gv.put(iTl, true);
        this.f8140v.a(fVar);
        return fVar;
    }

    public wz i9(String str) {
        f fVarFb = fb(str);
        return fVarFb != null ? fVarFb.gv() : w.zn;
    }

    public void p(String str) {
        f fVar = this.y.get(str);
        if (fVar != null && fVar.fb() && fVar.c5()) {
            this.y.remove(str);
            int i = fVar.y;
            boolean z = this.f8139gv.get(i);
            this.f8140v.v(fVar, z);
            if (z) {
                this.n3.remove(i);
                this.f8139gv.delete(i);
            } else {
                this.n3.put(i, null);
                this.zn.put(i, true);
            }
        }
    }

    public Collection<f> s() {
        return Collections.unmodifiableCollection(this.y.values());
    }

    public Set<String> t() {
        return this.y.keySet();
    }

    public void v(String str, xc xcVar) {
        f fVarWz = wz(str);
        if (fVarWz.n3(xcVar)) {
            this.f8140v.a(fVarWz);
        }
    }

    public f wz(String str) {
        f fVar = this.y.get(str);
        return fVar == null ? gv(str) : fVar;
    }

    public void xc(long j) throws IOException {
        zn znVar;
        this.f8140v.zn(j);
        zn znVar2 = this.f8138a;
        if (znVar2 != null) {
            znVar2.zn(j);
        }
        if (this.f8140v.y() || (znVar = this.f8138a) == null || !znVar.y()) {
            this.f8140v.fb(this.y, this.n3);
        } else {
            this.f8138a.fb(this.y, this.n3);
            this.f8140v.gv(this.y);
        }
        zn znVar3 = this.f8138a;
        if (znVar3 != null) {
            znVar3.delete();
            this.f8138a = null;
        }
    }

    public void z() throws IOException {
        this.f8140v.n3(this.y);
        int size = this.zn.size();
        for (int i = 0; i < size; i++) {
            this.n3.remove(this.zn.keyAt(i));
        }
        this.zn.clear();
        this.f8139gv.clear();
    }

    public static class n3 implements zn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8141a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public co f8142fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final SecureRandom f8143gv;

        @Nullable
        public final Cipher n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final v0.n3 f8144v;
        public final boolean y;

        @Nullable
        public final SecretKeySpec zn;

        public n3(File file, @Nullable byte[] bArr, boolean z) {
            Cipher cipherC5;
            SecretKeySpec secretKeySpec;
            v0.y.fb((bArr == null && z) ? false : true);
            if (bArr != null) {
                v0.y.y(bArr.length == 16);
                try {
                    cipherC5 = t.c5();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
                    throw new IllegalStateException(e4);
                }
            } else {
                v0.y.y(!z);
                cipherC5 = null;
                secretKeySpec = null;
            }
            this.y = z;
            this.n3 = cipherC5;
            this.zn = secretKeySpec;
            this.f8143gv = z ? new SecureRandom() : null;
            this.f8144v = new v0.n3(file);
        }

        @Override // t0.t.zn
        public void a(f fVar) {
            this.f8141a = true;
        }

        public final f c5(int i, DataInputStream dataInputStream) throws IOException {
            w wVarMt;
            int i5 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                xc xcVar = new xc();
                xc.fb(xcVar, j);
                wVarMt = w.zn.v(xcVar);
            } else {
                wVarMt = t.mt(dataInputStream);
            }
            return new f(i5, utf, wVarMt);
        }

        @Override // t0.t.zn
        public void delete() {
            this.f8144v.y();
        }

        public final void f(f fVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(fVar.y);
            dataOutputStream.writeUTF(fVar.n3);
            t.r(fVar.gv(), dataOutputStream);
        }

        @Override // t0.t.zn
        public void fb(HashMap<String, f> map, SparseArray<String> sparseArray) {
            v0.y.fb(!this.f8141a);
            if (i9(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f8144v.y();
        }

        @Override // t0.t.zn
        public void gv(HashMap<String, f> map) throws Throwable {
            t(map);
            this.f8141a = false;
        }

        public final boolean i9(HashMap<String, f> map, SparseArray<String> sparseArray) throws Throwable {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.f8144v.zn()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f8144v.gv());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int i = dataInputStream.readInt();
                if (i >= 0 && i <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.n3 == null) {
                            ut.wz(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.n3.init(2, (Key) ut.i9(this.zn), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.n3));
                        } catch (InvalidAlgorithmParameterException e4) {
                            e = e4;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e5) {
                            e = e5;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.y) {
                        this.f8141a = true;
                    }
                    int i5 = dataInputStream.readInt();
                    int iS = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        f fVarC5 = c5(i, dataInputStream);
                        map.put(fVarC5.n3, fVarC5);
                        sparseArray.put(fVarC5.y, fVarC5.n3);
                        iS += s(fVarC5, i);
                    }
                    int i10 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (i10 == iS && z) {
                        ut.wz(dataInputStream);
                        return true;
                    }
                    ut.wz(dataInputStream);
                    return false;
                }
                ut.wz(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    ut.wz(dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    ut.wz(dataInputStream2);
                }
                throw th;
            }
        }

        @Override // t0.t.zn
        public void n3(HashMap<String, f> map) throws Throwable {
            if (this.f8141a) {
                gv(map);
            }
        }

        public final int s(f fVar, int i) {
            int iHashCode = (fVar.y * 31) + fVar.n3.hashCode();
            if (i >= 2) {
                return (iHashCode * 31) + fVar.gv().hashCode();
            }
            long jY = tl.y(fVar.gv());
            return (iHashCode * 31) + ((int) (jY ^ (jY >>> 32)));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void t(HashMap<String, f> map) throws Throwable {
            co coVar;
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream outputStreamA = this.f8144v.a();
                co coVar2 = this.f8142fb;
                if (coVar2 == null) {
                    this.f8142fb = new co(outputStreamA);
                } else {
                    coVar2.y(outputStreamA);
                }
                coVar = this.f8142fb;
                dataOutputStream = new DataOutputStream(coVar);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                int iS = 0;
                dataOutputStream.writeInt(this.y ? 1 : 0);
                if (this.y) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) ut.i9(this.f8143gv)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) ut.i9(this.n3)).init(1, (Key) ut.i9(this.zn), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(coVar, this.n3));
                    } catch (InvalidAlgorithmParameterException e4) {
                        e = e4;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e5) {
                        e = e5;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(map.size());
                for (f fVar : map.values()) {
                    f(fVar, dataOutputStream);
                    iS += s(fVar, 2);
                }
                dataOutputStream.writeInt(iS);
                this.f8144v.n3(dataOutputStream);
                ut.wz(null);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                ut.wz(dataOutputStream2);
                throw th;
            }
        }

        @Override // t0.t.zn
        public void v(f fVar, boolean z) {
            this.f8141a = true;
        }

        @Override // t0.t.zn
        public boolean y() {
            return this.f8144v.zn();
        }

        @Override // t0.t.zn
        public void zn(long j) {
        }
    }
}
