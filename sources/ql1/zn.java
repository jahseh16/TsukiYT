package ql1;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import pl1.f;
import sj1.mg;

/* JADX INFO: loaded from: classes.dex */
public final class zn<T> implements f<mg, T> {
    public final TypeAdapter<T> n3;
    public final Gson y;

    public zn(Gson gson, TypeAdapter<T> typeAdapter) {
        this.y = gson;
        this.n3 = typeAdapter;
    }

    @Override // pl1.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public T convert(mg mgVar) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.y.newJsonReader(mgVar.charStream());
        try {
            T t3 = this.n3.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return t3;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            mgVar.close();
        }
    }
}
