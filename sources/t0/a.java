package t0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String[] zn = {"name", "length", "last_touch_timestamp"};
    public String n3;
    public final kx.n3 y;

    public a(kx.n3 n3Var) {
        this.y = n3Var;
    }

    public static String gv(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public static void y(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public void a(String str) throws kx.y {
        v0.y.v(this.n3);
        try {
            this.y.getWritableDatabase().delete(this.n3, "name = ?", new String[]{str});
        } catch (SQLException e4) {
            throw new kx.y(e4);
        }
    }

    public void fb(Set<String> set) throws kx.y {
        v0.y.v(this.n3);
        try {
            SQLiteDatabase writableDatabase = this.y.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.n3, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e4) {
            throw new kx.y(e4);
        }
    }

    public Map<String, v> n3() throws kx.y {
        try {
            Cursor cursorZn = zn();
            try {
                HashMap map = new HashMap(cursorZn.getCount());
                while (cursorZn.moveToNext()) {
                    map.put((String) v0.y.v(cursorZn.getString(0)), new v(cursorZn.getLong(1), cursorZn.getLong(2)));
                }
                cursorZn.close();
                return map;
            } finally {
            }
        } catch (SQLException e4) {
            throw new kx.y(e4);
        }
    }

    public void s(String str, long j, long j4) throws kx.y {
        v0.y.v(this.n3);
        try {
            SQLiteDatabase writableDatabase = this.y.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j4));
            writableDatabase.replaceOrThrow(this.n3, null, contentValues);
        } catch (SQLException e4) {
            throw new kx.y(e4);
        }
    }

    public void v(long j) throws kx.y {
        try {
            String hexString = Long.toHexString(j);
            this.n3 = gv(hexString);
            if (kx.gv.n3(this.y.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.y.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    kx.gv.gv(writableDatabase, 2, hexString, 1);
                    y(writableDatabase, this.n3);
                    writableDatabase.execSQL("CREATE TABLE " + this.n3 + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e4) {
            throw new kx.y(e4);
        }
    }

    public final Cursor zn() {
        v0.y.v(this.n3);
        return this.y.getReadableDatabase().query(this.n3, zn, null, null, null, null, null);
    }
}
