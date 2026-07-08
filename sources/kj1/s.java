package kj1;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    public static final class gv implements Iterable<String>, KMappedMarker {
        public final /* synthetic */ a y;

        public gv(a aVar) {
            this.y = aVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new n3(this.y);
        }
    }

    public static final class n3 implements Iterator<String>, KMappedMarker {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a f6075v;
        public int y;

        public n3(a aVar) {
            this.f6075v = aVar;
            this.y = aVar.gv();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.y > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public String next() {
            a aVar = this.f6075v;
            int iGv = aVar.gv();
            int i = this.y;
            this.y = i - 1;
            return aVar.v(iGv - i);
        }
    }

    public static final class y implements Iterator<a>, KMappedMarker {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a f6076v;
        public int y;

        public y(a aVar) {
            this.f6076v = aVar;
            this.y = aVar.gv();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.y > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public a next() {
            a aVar = this.f6076v;
            int iGv = aVar.gv();
            int i = this.y;
            this.y = i - 1;
            return aVar.fb(iGv - i);
        }
    }

    public static final class zn implements Iterable<a>, KMappedMarker {
        public final /* synthetic */ a y;

        public zn(a aVar) {
            this.y = aVar;
        }

        @Override // java.lang.Iterable
        public Iterator<a> iterator() {
            return new y(this.y);
        }
    }

    public static final Iterable<String> n3(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new gv(aVar);
    }

    public static final Iterable<a> y(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new zn(aVar);
    }
}
