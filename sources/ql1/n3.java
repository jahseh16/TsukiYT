package ql1;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import hk1.v;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import pl1.f;
import sj1.fh;
import sj1.i4;

/* JADX INFO: loaded from: classes.dex */
public final class n3<T> implements f<T, fh> {
    public static final i4 zn = i4.v("application/json; charset=UTF-8");
    public final TypeAdapter<T> n3;
    public final Gson y;

    public n3(Gson gson, TypeAdapter<T> typeAdapter) {
        this.y = gson;
        this.n3 = typeAdapter;
    }

    @Override // pl1.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public fh convert(T t3) throws IOException {
        v vVar = new v();
        JsonWriter jsonWriterNewJsonWriter = this.y.newJsonWriter(new OutputStreamWriter(vVar.pq(), StandardCharsets.UTF_8));
        this.n3.write(jsonWriterNewJsonWriter, t3);
        jsonWriterNewJsonWriter.close();
        return fh.create(zn, vVar.s8());
    }
}
