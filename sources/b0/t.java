package b0;

import ft.g;

/* JADX INFO: loaded from: classes.dex */
public interface t {
    public static final t y = new y();

    public class y implements t {
        @Override // b0.t
        public boolean n3(g gVar) {
            String str = gVar.f3;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // b0.t
        public i9 zn(g gVar) {
            String str = gVar.f3;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new e0.y(gVar.c);
                    case "application/pgs":
                        return new f0.y();
                    case "application/x-mp4-vtt":
                        return new m0.y();
                    case "text/vtt":
                        return new m0.s();
                    case "application/x-quicktime-tx3g":
                        return new k0.y(gVar.c);
                    case "text/x-ssa":
                        return new h0.y(gVar.c);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new c0.y(str, gVar.f7, 16000L);
                    case "text/x-exoplayer-cues":
                        return new fb();
                    case "application/cea-708":
                        return new c0.zn(gVar.f7, gVar.c);
                    case "application/x-subrip":
                        return new i0.y();
                    case "application/ttml+xml":
                        return new j0.zn();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean n3(g gVar);

    i9 zn(g gVar);
}
