package de;

import ft.g;

/* JADX INFO: loaded from: classes.dex */
public interface zn {
    public static final zn y = new y();

    public class y implements zn {
        @Override // de.zn
        public boolean n3(g gVar) {
            String str = gVar.f3;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // de.zn
        public n3 zn(g gVar) {
            String str = gVar.f3;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new td.y();
                    case "application/x-icy":
                        return new ok.y();
                    case "application/id3":
                        return new bp.n3();
                    case "application/x-emsg":
                        return new qg.y();
                    case "application/x-scte35":
                        return new w3.y();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean n3(g gVar);

    n3 zn(g gVar);
}
