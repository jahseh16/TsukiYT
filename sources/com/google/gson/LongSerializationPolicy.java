package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l3) {
            return l3 == null ? JsonNull.INSTANCE : new JsonPrimitive(l3);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l3) {
            return l3 == null ? JsonNull.INSTANCE : new JsonPrimitive(l3.toString());
        }
    };

    public abstract JsonElement serialize(Long l3);
}
