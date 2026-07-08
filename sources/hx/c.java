package hx;

import ft.q;
import hx.n;
import hx.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Pattern y = Pattern.compile("([a-z])=\\s?(.+)");
    public static final Pattern n3 = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    public static final Pattern zn = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a0, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static hx.n n3(java.lang.String r12) throws ft.q {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx.c.n3(java.lang.String):hx.n");
    }

    public static void y(n.n3 n3Var, y.n3 n3Var2) throws q {
        try {
            n3Var.wz(n3Var2.i9());
        } catch (IllegalArgumentException | IllegalStateException e4) {
            throw q.gv(null, e4);
        }
    }

    public static y.n3 zn(String str) throws q {
        Matcher matcher = zn.matcher(str);
        if (!matcher.matches()) {
            throw q.gv("Malformed SDP media description line: " + str, null);
        }
        try {
            return new y.n3((String) v0.y.v(matcher.group(1)), Integer.parseInt((String) v0.y.v(matcher.group(2))), (String) v0.y.v(matcher.group(3)), Integer.parseInt((String) v0.y.v(matcher.group(4))));
        } catch (NumberFormatException e4) {
            throw q.gv("Malformed SDP media description line: " + str, e4);
        }
    }
}
