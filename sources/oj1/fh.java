package oj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class fh {
    public static final f3 a(int i, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return v(i, message + "\nJSON input: " + ((Object) s(input, i)));
    }

    public static /* synthetic */ CharSequence c5(CharSequence charSequence, int i, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = -1;
        }
        return s(charSequence, i);
    }

    public static final String f(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) c5(str2, 0, 1, null));
    }

    public static final f3 fb(String key, String input) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return v(-1, "Encountered unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) c5(input, 0, 1, null)));
    }

    public static final c gv(kj1.a keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new c("Value of type '" + keyDescriptor.s() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final Void i9(y yVar, Number result) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        y.n(yVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    public static final c n3(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new c("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) c5(output, 0, 1, null)));
    }

    public static final CharSequence s(CharSequence charSequence, int i) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i5 = i - 30;
        int i8 = i + 30;
        return (i5 <= 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : ".....") + charSequence.subSequence(RangesKt.coerceAtLeast(i5, 0), RangesKt.coerceAtMost(i8, charSequence.length())).toString() + (i8 >= charSequence.length() ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : ".....");
    }

    public static final f3 v(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new f3(message);
    }

    public static final f3 y(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return v(-1, f(value, key, output));
    }

    public static final c zn(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new c(f(value, key, output));
    }
}
