package tn;

import androidx.annotation.Nullable;
import b1.f3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import k4.r;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final String[] y = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    public static MdtaMetadataEntry a(d dVar, int i, String str) {
        while (true) {
            int iA = dVar.a();
            if (iA >= i) {
                return null;
            }
            int iP = dVar.p();
            if (dVar.p() == 1684108385) {
                int iP2 = dVar.p();
                int iP3 = dVar.p();
                int i5 = iP - 16;
                byte[] bArr = new byte[i5];
                dVar.t(bArr, 0, i5);
                return new MdtaMetadataEntry(str, bArr, iP3, iP2);
            }
            dVar.oz(iA + iP);
        }
    }

    @Nullable
    public static Id3Frame c5(int i, String str, d dVar, boolean z, boolean z5) {
        int iI9 = i9(dVar);
        if (z5) {
            iI9 = Math.min(1, iI9);
        }
        if (iI9 >= 0) {
            return z ? new TextInformationFrame(str, null, r.j(Integer.toString(iI9))) : new CommentFrame("und", str, Integer.toString(iI9));
        }
        v0.r.c5("MetadataUtil", "Failed to parse uint8 attribute: " + y.y(i));
        return null;
    }

    public static void f(int i, f3 f3Var, g.n3 n3Var) {
        if (i == 1 && f3Var.y()) {
            n3Var.hw(f3Var.y).j5(f3Var.n3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame fb(v0.d r3) {
        /*
            int r3 = i9(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = tn.s.y
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L20
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            k4.r r3 = k4.r.j(r3)
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            v0.r.c5(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.s.fb(v0.d):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    @Nullable
    public static TextInformationFrame gv(int i, String str, d dVar) {
        int iP = dVar.p();
        if (dVar.p() == 1684108385 && iP >= 22) {
            dVar.ut(10);
            int iYt = dVar.yt();
            if (iYt > 0) {
                String str2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING + iYt;
                int iYt2 = dVar.yt();
                if (iYt2 > 0) {
                    str2 = str2 + "/" + iYt2;
                }
                return new TextInformationFrame(str, null, r.j(str2));
            }
        }
        v0.r.c5("MetadataUtil", "Failed to parse index/count attribute: " + y.y(i));
        return null;
    }

    public static int i9(d dVar) {
        dVar.ut(4);
        if (dVar.p() == 1684108385) {
            dVar.ut(8);
            return dVar.ej();
        }
        v0.r.c5("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    public static ApicFrame n3(d dVar) {
        int iP = dVar.p();
        if (dVar.p() != 1684108385) {
            v0.r.c5("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iN3 = y.n3(dVar.p());
        String str = iN3 == 13 ? "image/jpeg" : iN3 == 14 ? "image/png" : null;
        if (str == null) {
            v0.r.c5("MetadataUtil", "Unrecognized cover art flags: " + iN3);
            return null;
        }
        dVar.ut(4);
        int i = iP - 16;
        byte[] bArr = new byte[i];
        dVar.t(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static TextInformationFrame s(int i, String str, d dVar) {
        int iP = dVar.p();
        if (dVar.p() == 1684108385) {
            dVar.ut(8);
            return new TextInformationFrame(str, null, r.j(dVar.rz(iP - 16)));
        }
        v0.r.c5("MetadataUtil", "Failed to parse text attribute: " + y.y(i));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(int r5, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r6, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r7, ft.g.n3 r8, com.google.android.exoplayer2.metadata.Metadata... r9) {
        /*
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3b
            goto L3c
        Le:
            r6 = 2
            if (r5 != r6) goto L3b
            if (r7 == 0) goto L3b
            r5 = 0
        L14:
            int r6 = r7.v()
            if (r5 >= r6) goto L3b
            com.google.android.exoplayer2.metadata.Metadata$Entry r6 = r7.gv(r5)
            boolean r3 = r6 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r6 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r6
            java.lang.String r3 = r6.y
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.Metadata r5 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3c
        L39:
            int r5 = r5 + r2
            goto L14
        L3b:
            r6 = r0
        L3c:
            int r5 = r9.length
        L3d:
            if (r1 >= r5) goto L47
            r7 = r9[r1]
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.n3(r7)
            int r1 = r1 + r2
            goto L3d
        L47:
            int r5 = r6.v()
            if (r5 <= 0) goto L50
            r8.en(r6)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.s.t(int, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.metadata.Metadata, ft.g$n3, com.google.android.exoplayer2.metadata.Metadata[]):void");
    }

    @Nullable
    public static Id3Frame v(d dVar, int i) {
        String strRz = null;
        String strRz2 = null;
        int i5 = -1;
        int i8 = -1;
        while (dVar.a() < i) {
            int iA = dVar.a();
            int iP = dVar.p();
            int iP2 = dVar.p();
            dVar.ut(4);
            if (iP2 == 1835360622) {
                strRz = dVar.rz(iP - 12);
            } else if (iP2 == 1851878757) {
                strRz2 = dVar.rz(iP - 12);
            } else {
                if (iP2 == 1684108385) {
                    i5 = iA;
                    i8 = iP;
                }
                dVar.ut(iP - 12);
            }
        }
        if (strRz == null || strRz2 == null || i5 == -1) {
            return null;
        }
        dVar.oz(i5);
        dVar.ut(16);
        return new InternalFrame(strRz, strRz2, dVar.rz(i8 - 16));
    }

    @Nullable
    public static CommentFrame y(int i, d dVar) {
        int iP = dVar.p();
        if (dVar.p() == 1684108385) {
            dVar.ut(8);
            String strRz = dVar.rz(iP - 16);
            return new CommentFrame("und", strRz, strRz);
        }
        v0.r.c5("MetadataUtil", "Failed to parse comment attribute: " + y.y(i));
        return null;
    }

    @Nullable
    public static Metadata.Entry zn(d dVar) {
        int iA = dVar.a() + dVar.p();
        int iP = dVar.p();
        int i = (iP >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i5 = 16777215 & iP;
                if (i5 == 6516084) {
                    return y(iP, dVar);
                }
                if (i5 == 7233901 || i5 == 7631467) {
                    return s(iP, "TIT2", dVar);
                }
                if (i5 == 6516589 || i5 == 7828084) {
                    return s(iP, "TCOM", dVar);
                }
                if (i5 == 6578553) {
                    return s(iP, "TDRC", dVar);
                }
                if (i5 == 4280916) {
                    return s(iP, "TPE1", dVar);
                }
                if (i5 == 7630703) {
                    return s(iP, "TSSE", dVar);
                }
                if (i5 == 6384738) {
                    return s(iP, "TALB", dVar);
                }
                if (i5 == 7108978) {
                    return s(iP, "USLT", dVar);
                }
                if (i5 == 6776174) {
                    return s(iP, "TCON", dVar);
                }
                if (i5 == 6779504) {
                    return s(iP, "TIT1", dVar);
                }
            } else {
                if (iP == 1735291493) {
                    return fb(dVar);
                }
                if (iP == 1684632427) {
                    return gv(iP, "TPOS", dVar);
                }
                if (iP == 1953655662) {
                    return gv(iP, "TRCK", dVar);
                }
                if (iP == 1953329263) {
                    return c5(iP, "TBPM", dVar, true, false);
                }
                if (iP == 1668311404) {
                    return c5(iP, "TCMP", dVar, true, true);
                }
                if (iP == 1668249202) {
                    return n3(dVar);
                }
                if (iP == 1631670868) {
                    return s(iP, "TPE2", dVar);
                }
                if (iP == 1936682605) {
                    return s(iP, "TSOT", dVar);
                }
                if (iP == 1936679276) {
                    return s(iP, "TSO2", dVar);
                }
                if (iP == 1936679282) {
                    return s(iP, "TSOA", dVar);
                }
                if (iP == 1936679265) {
                    return s(iP, "TSOP", dVar);
                }
                if (iP == 1936679791) {
                    return s(iP, "TSOC", dVar);
                }
                if (iP == 1920233063) {
                    return c5(iP, "ITUNESADVISORY", dVar, false, false);
                }
                if (iP == 1885823344) {
                    return c5(iP, "ITUNESGAPLESS", dVar, false, true);
                }
                if (iP == 1936683886) {
                    return s(iP, "TVSHOWSORT", dVar);
                }
                if (iP == 1953919848) {
                    return s(iP, "TVSHOW", dVar);
                }
                if (iP == 757935405) {
                    return v(dVar, iA);
                }
            }
            v0.r.n3("MetadataUtil", "Skipped unknown metadata entry: " + y.y(iP));
            dVar.oz(iA);
            return null;
        } finally {
            dVar.oz(iA);
        }
    }
}
