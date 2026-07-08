package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class JsonPrimitive extends JsonElement {
    public final Object y;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.y = bool;
    }

    public static boolean y(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.y;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.y == null) {
            return jsonPrimitive.y == null;
        }
        if (y(this) && y(jsonPrimitive)) {
            return ((this.y instanceof BigInteger) || (jsonPrimitive.y instanceof BigInteger)) ? getAsBigInteger().equals(jsonPrimitive.getAsBigInteger()) : getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
        }
        Object obj2 = this.y;
        if (obj2 instanceof Number) {
            Object obj3 = jsonPrimitive.y;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return getAsBigDecimal().compareTo(jsonPrimitive.getAsBigDecimal()) == 0;
                }
                double asDouble = getAsDouble();
                double asDouble2 = jsonPrimitive.getAsDouble();
                if (asDouble != asDouble2) {
                    return Double.isNaN(asDouble) && Double.isNaN(asDouble2);
                }
                return true;
            }
        }
        return obj2.equals(jsonPrimitive.y);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object obj = this.y;
        return obj instanceof BigDecimal ? (BigDecimal) obj : NumberLimits.parseBigDecimal(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object obj = this.y;
        return obj instanceof BigInteger ? (BigInteger) obj : y(this) ? BigInteger.valueOf(getAsNumber().longValue()) : NumberLimits.parseBigInteger(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return isBoolean() ? ((Boolean) this.y).booleanValue() : Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (asString.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return asString.charAt(0);
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object obj = this.y;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        Object obj = this.y;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return ((Boolean) this.y).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.y.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.y == null) {
            return 31;
        }
        if (y(this)) {
            jDoubleToLongBits = getAsNumber().longValue();
        } else {
            Object obj = this.y;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean isBoolean() {
        return this.y instanceof Boolean;
    }

    public boolean isNumber() {
        return this.y instanceof Number;
    }

    public boolean isString() {
        return this.y instanceof String;
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.y = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.y = str;
    }

    public JsonPrimitive(Character ch) {
        Objects.requireNonNull(ch);
        this.y = ch.toString();
    }
}
