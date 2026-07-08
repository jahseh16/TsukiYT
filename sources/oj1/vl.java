package oj1;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vl {
    public final boolean n3;
    public final oj1.y y;
    public int zn;

    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {ConnectionResult.API_DISABLED}, m = "readObject")
    public static final class n3 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public n3(Continuation<? super n3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return vl.this.s(null, this);
        }
    }

    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
    public static final class y extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, nj1.s>, Unit, Continuation<? super nj1.s>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public y(Continuation<? super y> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.L$0;
                byte bTa = vl.this.y.ta();
                if (bTa == 1) {
                    return vl.this.i9(true);
                }
                if (bTa == 0) {
                    return vl.this.i9(false);
                }
                if (bTa != 6) {
                    if (bTa == 8) {
                        return vl.this.a();
                    }
                    oj1.y.n(vl.this.y, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                vl vlVar = vl.this;
                this.label = 1;
                obj = vlVar.s(deepRecursiveScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (nj1.s) obj;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DeepRecursiveScope<Unit, nj1.s> deepRecursiveScope, Unit unit, Continuation<? super nj1.s> continuation) {
            y yVar = vl.this.new y(continuation);
            yVar.L$0 = deepRecursiveScope;
            return yVar.invokeSuspend(Unit.INSTANCE);
        }
    }

    public vl(nj1.a configuration, oj1.y lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.y = lexer;
        this.n3 = configuration.t();
    }

    public final nj1.s a() {
        byte bTl = this.y.tl();
        if (this.y.ta() == 4) {
            oj1.y.n(this.y, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.y.a()) {
            arrayList.add(v());
            bTl = this.y.tl();
            if (bTl != 4) {
                oj1.y yVar = this.y;
                boolean z = bTl == 9;
                int i = yVar.y;
                if (!z) {
                    oj1.y.n(yVar, "Expected end of the array or comma", i, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bTl == 8) {
            this.y.wz((byte) 9);
        } else if (bTl == 4) {
            oj1.y.n(this.y, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new nj1.n3(arrayList);
    }

    public final nj1.s c5() {
        byte bWz = this.y.wz((byte) 6);
        if (this.y.ta() == 4) {
            oj1.y.n(this.y, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.y.a()) {
                break;
            }
            String strCo = this.n3 ? this.y.co() : this.y.p();
            this.y.wz((byte) 5);
            linkedHashMap.put(strCo, v());
            bWz = this.y.tl();
            if (bWz != 4) {
                if (bWz != 7) {
                    oj1.y.n(this.y, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bWz == 6) {
            this.y.wz((byte) 7);
        } else if (bWz == 4) {
            oj1.y.n(this.y, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new nj1.r(linkedHashMap);
    }

    public final nj1.s fb() {
        return (nj1.s) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new y(null)), Unit.INSTANCE);
    }

    public final nj1.f3 i9(boolean z) {
        String strCo = (this.n3 || !z) ? this.y.co() : this.y.p();
        return (z || !Intrinsics.areEqual(strCo, "null")) ? new nj1.w(strCo, z) : nj1.co.f6955fb;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(kotlin.DeepRecursiveScope<kotlin.Unit, nj1.s> r21, kotlin.coroutines.Continuation<? super nj1.s> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj1.vl.s(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final nj1.s v() {
        byte bTa = this.y.ta();
        if (bTa == 1) {
            return i9(true);
        }
        if (bTa == 0) {
            return i9(false);
        }
        if (bTa == 6) {
            int i = this.zn + 1;
            this.zn = i;
            this.zn--;
            return i == 200 ? fb() : c5();
        }
        if (bTa == 8) {
            return a();
        }
        oj1.y.n(this.y, "Cannot begin reading element, unexpected token: " + ((int) bTa), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
