package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    public static final TypeAdapterFactory n3 = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat y;

    private SqlTimeTypeAdapter() {
        this.y = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    public Time read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.y.getTimeZone();
            try {
                try {
                    time = new Time(this.y.parse(strNextString).getTime());
                } catch (ParseException e4) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e4);
                }
            } finally {
                this.y.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.y.format((Date) time);
        }
        jsonWriter.value(str);
    }
}
