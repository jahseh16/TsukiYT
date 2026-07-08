package com.google.gson;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class FormattingStyle {
    public static final FormattingStyle COMPACT = new FormattingStyle(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, false);
    public static final FormattingStyle PRETTY = new FormattingStyle("\n", "  ", true);
    public final String n3;
    public final String y;
    public final boolean zn;

    public FormattingStyle(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.y = str;
        this.n3 = str2;
        this.zn = z;
    }

    public String getIndent() {
        return this.n3;
    }

    public String getNewline() {
        return this.y;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.zn;
    }

    public FormattingStyle withIndent(String str) {
        return new FormattingStyle(this.y, str, this.zn);
    }

    public FormattingStyle withNewline(String str) {
        return new FormattingStyle(str, this.n3, this.zn);
    }

    public FormattingStyle withSpaceAfterSeparators(boolean z) {
        return new FormattingStyle(this.y, this.n3, z);
    }
}
