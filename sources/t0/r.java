package t0;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class r extends c5 {
    public static final Pattern w = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f8137p = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final Pattern f8136co = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public r(String str, long j, long j4, long j7, @Nullable File file) {
        super(str, j, j4, j7, file);
    }

    @Nullable
    public static r a(File file, long j, t tVar) {
        return v(file, j, -9223372036854775807L, tVar);
    }

    public static File c5(File file, int i, long j, long j4) {
        return new File(file, i + "." + j + "." + j4 + ".v3.exo");
    }

    public static r fb(String str, long j, long j4) {
        return new r(str, j, j4, -9223372036854775807L, null);
    }

    @Nullable
    public static File i9(File file, t tVar) {
        String strNd;
        String name = file.getName();
        Matcher matcher = f8137p.matcher(name);
        if (matcher.matches()) {
            strNd = ut.nd((String) v0.y.v(matcher.group(1)));
        } else {
            matcher = w.matcher(name);
            strNd = matcher.matches() ? (String) v0.y.v(matcher.group(1)) : null;
        }
        if (strNd == null) {
            return null;
        }
        File fileC5 = c5((File) v0.y.c5(file.getParentFile()), tVar.a(strNd), Long.parseLong((String) v0.y.v(matcher.group(2))), Long.parseLong((String) v0.y.v(matcher.group(3))));
        if (file.renameTo(fileC5)) {
            return fileC5;
        }
        return null;
    }

    public static r s(String str, long j) {
        return new r(str, j, -1L, -9223372036854775807L, null);
    }

    @Nullable
    public static r v(File file, long j, long j4, t tVar) {
        File file2;
        String strF;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileI9 = i9(file, tVar);
            if (fileI9 == null) {
                return null;
            }
            file2 = fileI9;
            name = fileI9.getName();
        }
        Matcher matcher = f8136co.matcher(name);
        if (!matcher.matches() || (strF = tVar.f(Integer.parseInt((String) v0.y.v(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new r(strF, Long.parseLong((String) v0.y.v(matcher.group(2))), length, j4 == -9223372036854775807L ? Long.parseLong((String) v0.y.v(matcher.group(3))) : j4, file2);
    }

    public r gv(File file, long j) {
        v0.y.fb(this.f8118s);
        return new r(this.y, this.f8120v, this.f8117fb, j, file);
    }
}
