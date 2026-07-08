package kx;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import ft.rb;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    static {
        rb.y("goog.exo.database");
    }

    public static void gv(SQLiteDatabase sQLiteDatabase, int i, String str, int i5) throws y {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i5));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e4) {
            throw new y(e4);
        }
    }

    public static int n3(SQLiteDatabase sQLiteDatabase, int i, String str) throws y {
        try {
        } catch (SQLException e4) {
            throw new y(e4);
        }
        if (!ut.i3(sQLiteDatabase, "ExoPlayerVersions")) {
            return -1;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", y(i, str), null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                cursorQuery.close();
                return -1;
            }
            cursorQuery.moveToNext();
            int i5 = cursorQuery.getInt(0);
            cursorQuery.close();
            return i5;
        } finally {
        }
        throw new y(e4);
    }

    public static String[] y(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }

    public static void zn(SQLiteDatabase sQLiteDatabase, int i, String str) throws y {
        try {
            if (ut.i3(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", y(i, str));
            }
        } catch (SQLException e4) {
            throw new y(e4);
        }
    }
}
