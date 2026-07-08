package com.google.gson;

import com.google.gson.internal.NonNullElementWrapperList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    public final ArrayList<JsonElement> y;

    public JsonArray() {
        this.y = new ArrayList<>();
    }

    public void add(Boolean bool) {
        this.y.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addAll(JsonArray jsonArray) {
        this.y.addAll(jsonArray.y);
    }

    public List<JsonElement> asList() {
        return new NonNullElementWrapperList(this.y);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.y.contains(jsonElement);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).y.equals(this.y));
    }

    public JsonElement get(int i) {
        return this.y.get(i);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return y().getAsBigDecimal();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return y().getAsBigInteger();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return y().getAsBoolean();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return y().getAsByte();
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        return y().getAsCharacter();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return y().getAsDouble();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return y().getAsFloat();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return y().getAsInt();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return y().getAsLong();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        return y().getAsNumber();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return y().getAsShort();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        return y().getAsString();
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public boolean isEmpty() {
        return this.y.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.y.iterator();
    }

    public boolean remove(JsonElement jsonElement) {
        return this.y.remove(jsonElement);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        ArrayList<JsonElement> arrayList = this.y;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        return arrayList.set(i, jsonElement);
    }

    public int size() {
        return this.y.size();
    }

    public final JsonElement y() {
        int size = this.y.size();
        if (size == 1) {
            return this.y.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public void add(Character ch) {
        this.y.add(ch == null ? JsonNull.INSTANCE : new JsonPrimitive(ch));
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        if (this.y.isEmpty()) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(this.y.size());
        Iterator<JsonElement> it = this.y.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next().deepCopy());
        }
        return jsonArray;
    }

    public JsonElement remove(int i) {
        return this.y.remove(i);
    }

    public JsonArray(int i) {
        this.y = new ArrayList<>(i);
    }

    public void add(Number number) {
        this.y.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    public void add(String str) {
        this.y.add(str == null ? JsonNull.INSTANCE : new JsonPrimitive(str));
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.y.add(jsonElement);
    }
}
