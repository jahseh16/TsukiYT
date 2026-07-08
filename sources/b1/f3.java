package b1;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {
    public static final Pattern zn = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int y = -1;
    public int n3 = -1;

    public boolean gv(int i) {
        int i5 = i >> 12;
        int i8 = i & 4095;
        if (i5 <= 0 && i8 <= 0) {
            return false;
        }
        this.y = i5;
        this.n3 = i8;
        return true;
    }

    public final boolean n3(String str) {
        Matcher matcher = zn.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) ut.i9(matcher.group(1)), 16);
            int i5 = Integer.parseInt((String) ut.i9(matcher.group(2)), 16);
            if (i <= 0 && i5 <= 0) {
                return false;
            }
            this.y = i;
            this.n3 = i5;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean y() {
        return (this.y == -1 || this.n3 == -1) ? false : true;
    }

    public boolean zn(Metadata metadata) {
        for (int i = 0; i < metadata.v(); i++) {
            Metadata.Entry entryGv = metadata.gv(i);
            if (entryGv instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryGv;
                if ("iTunSMPB".equals(commentFrame.f1612fb) && n3(commentFrame.f1613s)) {
                    return true;
                }
            } else if (entryGv instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryGv;
                if ("com.apple.iTunes".equals(internalFrame.f1621v) && "iTunSMPB".equals(internalFrame.f1619fb) && n3(internalFrame.f1620s)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
