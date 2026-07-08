package kotlin.text;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RegexOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RegexOption[] $VALUES;
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ RegexOption[] $values() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i = 2;
        IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, i, 0, 2, null);
        int i5 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i8 = 0;
        MULTILINE = new RegexOption("MULTILINE", 1, 8, i8, i5, defaultConstructorMarker);
        int i10 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i11 = 0;
        LITERAL = new RegexOption("LITERAL", i, 16, i11, i10, defaultConstructorMarker2);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, i8, i5, defaultConstructorMarker);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, i11, i10, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, i8, i5, defaultConstructorMarker);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, i11, i10, defaultConstructorMarker2);
        RegexOption[] regexOptionArr$values = $values();
        $VALUES = regexOptionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(regexOptionArr$values);
    }

    private RegexOption(String str, int i, int i5, int i8) {
        this.value = i5;
        this.mask = i8;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }

    public /* synthetic */ RegexOption(String str, int i, int i5, int i8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i5, (i10 & 2) != 0 ? i5 : i8);
    }
}
