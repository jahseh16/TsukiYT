package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0.r;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
@IgnoreJRERequirement
public final class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {
    public static final Key Key = new Key(null);
    private final long id;

    public static final class Key implements CoroutineContext.Key<CoroutineId> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    public CoroutineId(long j) {
        super(Key);
        this.id = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.id == ((CoroutineId) obj).id;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return r.y(this.id);
    }

    public String toString() {
        return "CoroutineId(" + this.id + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(CoroutineContext coroutineContext, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public String updateThreadContext(CoroutineContext coroutineContext) {
        String name;
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) name2, " @", 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0) {
            iLastIndexOf$default = name2.length();
        }
        StringBuilder sb = new StringBuilder(name.length() + iLastIndexOf$default + 10);
        String strSubstring = name2.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(name);
        sb.append('#');
        sb.append(this.id);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        threadCurrentThread.setName(string);
        return name2;
    }
}
