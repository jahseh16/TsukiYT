package v5;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static String gv(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] n3(byte[] bArr) {
        if (ut.y >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(ut.mg(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(gv(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(gv(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return ut.ap(sb.toString());
        } catch (JSONException e4) {
            v0.r.gv("ClearKeyUtil", "Failed to adjust response data: " + ut.mg(bArr), e4);
            return bArr;
        }
    }

    public static byte[] y(byte[] bArr) {
        return ut.y >= 27 ? bArr : ut.ap(zn(ut.mg(bArr)));
    }

    public static String zn(String str) {
        return str.replace('+', '-').replace('/', '_');
    }
}
