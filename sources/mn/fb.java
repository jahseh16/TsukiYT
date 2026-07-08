package mn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.provider.Settings;
import android.util.Pair;
import androidx.annotation.Nullable;
import ft.g;
import java.util.Arrays;
import k4.i4;
import k4.k;
import k4.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class fb {
    public final int n3;
    public final int[] y;
    public static final fb zn = new fb(new int[]{2}, 8);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final fb f6554gv = new fb(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k4.i4<Integer, Integer> f6555v = new i4.y().gv(5, 6).gv(17, 6).gv(7, 6).gv(18, 6).gv(6, 8).gv(8, 8).gv(14, 8).n3();

    public static final class y {
        public static final AudioAttributes y = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int n3(int i, int i5) {
            for (int i8 = 8; i8 > 0; i8--) {
                if (cx.zn.y(new AudioFormat.Builder().setEncoding(i).setSampleRate(i5).setChannelMask(ut.z6(i8)).build(), y)) {
                    return i8;
                }
            }
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static int[] y() {
            r.y yVarN = k4.r.n();
            k it = fb.f6555v.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (cx.zn.y(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), y)) {
                    yVarN.y(num);
                }
            }
            yVarN.y(2);
            return n4.a.wz(yVarN.f());
        }
    }

    public fb(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.y = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.y = new int[0];
        }
        this.n3 = i;
    }

    public static int fb(int i, int i5) {
        return ut.y >= 29 ? y.n3(i, i5) : ((Integer) v0.y.v(f6555v.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    @SuppressLint({"InlinedApi"})
    public static fb gv(Context context, @Nullable Intent intent) {
        return (n3() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f6554gv : (ut.y < 29 || !(ut.tg(context) || ut.m(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? zn : new fb(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new fb(y.y(), 8);
    }

    public static boolean n3() {
        if (ut.y >= 17) {
            String str = ut.zn;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int v(int i) {
        int i5 = ut.y;
        if (i5 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i5 <= 26 && "fugu".equals(ut.n3) && i == 1) {
            i = 2;
        }
        return ut.z6(i);
    }

    public static fb zn(Context context) {
        return gv(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @Nullable
    public Pair<Integer, Integer> a(g gVar) {
        int iA = v0.n.a((String) v0.y.v(gVar.f3), gVar.f4778co);
        if (!f6555v.containsKey(Integer.valueOf(iA))) {
            return null;
        }
        if (iA == 18 && !c5(18)) {
            iA = 6;
        } else if (iA == 8 && !c5(8)) {
            iA = 7;
        }
        if (!c5(iA)) {
            return null;
        }
        int iFb = gVar.j;
        if (iFb == -1 || iA == 18) {
            int i = gVar.oz;
            if (i == -1) {
                i = 48000;
            }
            iFb = fb(iA, i);
        } else if (iFb > this.n3) {
            return null;
        }
        int iV = v(iFb);
        if (iV == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iA), Integer.valueOf(iV));
    }

    public boolean c5(int i) {
        return Arrays.binarySearch(this.y, i) >= 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return Arrays.equals(this.y, fbVar.y) && this.n3 == fbVar.n3;
    }

    public int hashCode() {
        return this.n3 + (Arrays.hashCode(this.y) * 31);
    }

    public boolean s(g gVar) {
        return a(gVar) != null;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.n3 + ", supportedEncodings=" + Arrays.toString(this.y) + "]";
    }
}
