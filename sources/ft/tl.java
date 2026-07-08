package ft;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import i7.t;
import java.util.ArrayList;
import mn.mg;

/* JADX INFO: loaded from: classes.dex */
public class tl implements vc {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f5052c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f5053fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5055s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5056v;
    public final Context y;
    public final i7.i9 n3 = new i7.i9();
    public int zn = 0;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5054gv = 5000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i7.f3 f5051a = i7.f3.y;

    public tl(Context context) {
        this.y = context;
    }

    public tl c5() {
        this.n3.n3();
        return this;
    }

    public t.n3 f() {
        return this.n3;
    }

    public void fb(Context context, b0.w wVar, Looper looper, int i, ArrayList<hk> arrayList) {
        arrayList.add(new b0.p(wVar, looper));
    }

    public void gv(Context context, int i, ArrayList<hk> arrayList) {
        arrayList.add(new z0.n3());
    }

    public tl i9() {
        this.n3.zn();
        return this;
    }

    public void n3(Context context, int i, i7.f3 f3Var, boolean z, mn.i4 i4Var, Handler handler, mn.r rVar, ArrayList<hk> arrayList) {
        int i5;
        int i8;
        int i10;
        arrayList.add(new mn.b(context, f(), f3Var, z, handler, rVar, i4Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i5 = size + 1;
                try {
                    arrayList.add(size, (hk) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                    v0.r.a("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i5;
                    i5 = size;
                }
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating MIDI extension", e4);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i8 = i5 + 1;
            } catch (ClassNotFoundException unused3) {
            }
            try {
                arrayList.add(i5, (hk) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, mn.r.class, mn.i4.class).newInstance(handler, rVar, i4Var));
                v0.r.a("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused4) {
                i5 = i8;
                i8 = i5;
            }
            try {
                try {
                    i10 = i8 + 1;
                    try {
                        arrayList.add(i8, (hk) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, mn.r.class, mn.i4.class).newInstance(handler, rVar, i4Var));
                        v0.r.a("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i8 = i10;
                        i10 = i8;
                    }
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    arrayList.add(i10, (hk) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, mn.r.class, mn.i4.class).newInstance(handler, rVar, i4Var));
                    v0.r.a("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e5);
                }
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating FLAC extension", e6);
            }
        } catch (Exception e8) {
            throw new RuntimeException("Error instantiating Opus extension", e8);
        }
    }

    public void s(Context context, int i, i7.f3 f3Var, boolean z, Handler handler, w0.fh fhVar, long j, ArrayList<hk> arrayList) {
        String str;
        int i5;
        arrayList.add(new w0.f(context, f(), f3Var, j, z, handler, fhVar, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i5 = size + 1;
                try {
                    arrayList.add(size, (hk) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, w0.fh.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, fhVar, 50));
                    str = "DefaultRenderersFactory";
                    try {
                        v0.r.a(str, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i5;
                        i5 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                    str = "DefaultRenderersFactory";
                }
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating VP9 extension", e4);
            }
        } catch (ClassNotFoundException unused3) {
            str = "DefaultRenderersFactory";
        }
        try {
            arrayList.add(i5, (hk) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, w0.fh.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, fhVar, 50));
            v0.r.a(str, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e5) {
            throw new RuntimeException("Error instantiating AV1 extension", e5);
        }
    }

    public tl t(boolean z) {
        this.f5056v = z;
        return this;
    }

    public tl tl(i7.f3 f3Var) {
        this.f5051a = f3Var;
        return this;
    }

    public void v(Context context, de.v vVar, Looper looper, int i, ArrayList<hk> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.y(vVar, looper));
    }

    @Override // ft.vc
    public hk[] y(Handler handler, w0.fh fhVar, mn.r rVar, b0.w wVar, de.v vVar) {
        ArrayList<hk> arrayList = new ArrayList<>();
        s(this.y, this.zn, this.f5051a, this.f5056v, handler, fhVar, this.f5054gv, arrayList);
        mn.i4 i4VarZn = zn(this.y, this.f5053fb, this.f5055s, this.f5052c5);
        if (i4VarZn != null) {
            n3(this.y, this.zn, this.f5051a, this.f5056v, i4VarZn, handler, rVar, arrayList);
        }
        fb(this.y, wVar, handler.getLooper(), this.zn, arrayList);
        v(this.y, vVar, handler.getLooper(), this.zn, arrayList);
        gv(this.y, this.zn, arrayList);
        a(this.y, handler, this.zn, arrayList);
        return (hk[]) arrayList.toArray(new hk[0]);
    }

    @Nullable
    public mn.i4 zn(Context context, boolean z, boolean z5, boolean z7) {
        return new mg.fb().fb(mn.fb.zn(context)).i9(z).c5(z5).f(z7 ? 1 : 0).a();
    }

    public void a(Context context, Handler handler, int i, ArrayList<hk> arrayList) {
    }
}
