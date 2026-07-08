package pl1;

import android.annotation.TargetApi;
import com.google.android.gms.common.ConnectionResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import pl1.v;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
@IgnoreJRERequirement
public final class i9 extends v.y {

    @IgnoreJRERequirement
    public static final class n3<T> extends CompletableFuture<T> {
        public final gv<?> y;

        public n3(gv<?> gvVar) {
            this.y = gvVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.y.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class y<R> implements v<R, CompletableFuture<R>> {
        public final Type y;

        /* JADX INFO: renamed from: pl1.i9$y$y, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0145y implements a<R> {
            public final CompletableFuture<R> y;

            public C0145y(CompletableFuture<R> completableFuture) {
                this.y = completableFuture;
            }

            @Override // pl1.a
            public void n3(gv<R> gvVar, Throwable th) {
                this.y.completeExceptionally(th);
            }

            @Override // pl1.a
            public void y(gv<R> gvVar, b<R> bVar) {
                if (bVar.gv()) {
                    this.y.complete(bVar.y());
                } else {
                    this.y.completeExceptionally(new r(bVar));
                }
            }
        }

        public y(Type type) {
            this.y = type;
        }

        @Override // pl1.v
        public Type y() {
            return this.y;
        }

        @Override // pl1.v
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> n3(gv<R> gvVar) {
            n3 n3Var = new n3(gvVar);
            gvVar.a(new C0145y(n3Var));
            return n3Var;
        }
    }

    @IgnoreJRERequirement
    public static final class zn<R> implements v<R, CompletableFuture<b<R>>> {
        public final Type y;

        @IgnoreJRERequirement
        public class y implements a<R> {
            public final CompletableFuture<b<R>> y;

            public y(CompletableFuture<b<R>> completableFuture) {
                this.y = completableFuture;
            }

            @Override // pl1.a
            public void n3(gv<R> gvVar, Throwable th) {
                this.y.completeExceptionally(th);
            }

            @Override // pl1.a
            public void y(gv<R> gvVar, b<R> bVar) {
                this.y.complete(bVar);
            }
        }

        public zn(Type type) {
            this.y = type;
        }

        @Override // pl1.v
        public Type y() {
            return this.y;
        }

        @Override // pl1.v
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<b<R>> n3(gv<R> gvVar) {
            n3 n3Var = new n3(gvVar);
            gvVar.a(new y(n3Var));
            return n3Var;
        }
    }

    @Override // pl1.v.y
    public v<?, ?> y(Type type, Annotation[] annotationArr, k5 k5Var) {
        if (v.y.zn(type) != fb.y()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeN3 = v.y.n3(0, (ParameterizedType) type);
        if (v.y.zn(typeN3) != b.class) {
            return new y(typeN3);
        }
        if (typeN3 instanceof ParameterizedType) {
            return new zn(v.y.n3(0, (ParameterizedType) typeN3));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
