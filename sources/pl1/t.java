package pl1;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import pl1.v;

/* JADX INFO: loaded from: classes.dex */
public final class t extends v.y {
    public final Executor y;

    public static final class n3<T> implements gv<T> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final gv<T> f7336v;
        public final Executor y;

        public class y implements a<T> {
            public final /* synthetic */ a y;

            public y(a aVar) {
                this.y = aVar;
            }

            public final /* synthetic */ void a(a aVar, b bVar) {
                if (n3.this.f7336v.isCanceled()) {
                    aVar.n3(n3.this, new IOException("Canceled"));
                } else {
                    aVar.y(n3.this, bVar);
                }
            }

            @Override // pl1.a
            public void n3(gv<T> gvVar, final Throwable th) {
                Executor executor = n3.this.y;
                final a aVar = this.y;
                executor.execute(new Runnable() { // from class: pl1.wz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.v(aVar, th);
                    }
                });
            }

            public final /* synthetic */ void v(a aVar, Throwable th) {
                aVar.n3(n3.this, th);
            }

            @Override // pl1.a
            public void y(gv<T> gvVar, final b<T> bVar) {
                Executor executor = n3.this.y;
                final a aVar = this.y;
                executor.execute(new Runnable() { // from class: pl1.tl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.a(aVar, bVar);
                    }
                });
            }
        }

        public n3(Executor executor, gv<T> gvVar) {
            this.y = executor;
            this.f7336v = gvVar;
        }

        @Override // pl1.gv
        public void a(a<T> aVar) {
            Objects.requireNonNull(aVar, "callback == null");
            this.f7336v.a(new y(aVar));
        }

        @Override // pl1.gv
        public void cancel() {
            this.f7336v.cancel();
        }

        @Override // pl1.gv
        public b<T> execute() throws IOException {
            return this.f7336v.execute();
        }

        @Override // pl1.gv
        public boolean isCanceled() {
            return this.f7336v.isCanceled();
        }

        @Override // pl1.gv
        public sj1.d0 y() {
            return this.f7336v.y();
        }

        @Override // pl1.gv
        public gv<T> clone() {
            return new n3(this.y, this.f7336v.clone());
        }
    }

    public class y implements v<Object, gv<?>> {
        public final /* synthetic */ Executor n3;
        public final /* synthetic */ Type y;

        public y(Type type, Executor executor) {
            this.y = type;
            this.n3 = executor;
        }

        @Override // pl1.v
        public Type y() {
            return this.y;
        }

        @Override // pl1.v
        /* JADX INFO: renamed from: zn, reason: merged with bridge method [inline-methods] */
        public gv<Object> n3(gv<Object> gvVar) {
            Executor executor = this.n3;
            return executor == null ? gvVar : new n3(executor, gvVar);
        }
    }

    public t(Executor executor) {
        this.y = executor;
    }

    @Override // pl1.v.y
    public v<?, ?> y(Type type, Annotation[] annotationArr, k5 k5Var) {
        if (v.y.zn(type) != gv.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new y(j5.fb(0, (ParameterizedType) type), j5.t(annotationArr, vl.class) ? null : this.y);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
