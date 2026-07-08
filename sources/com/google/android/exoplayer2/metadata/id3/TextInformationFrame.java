package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.internal.Code;
import ft.qj;
import java.util.ArrayList;
import java.util.List;
import k4.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new y();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Deprecated
    public final String f1629fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r<String> f1630s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f1631v;

    public class y implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel, null);
        }
    }

    public /* synthetic */ TextInformationFrame(Parcel parcel, y yVar) {
        this(parcel);
    }

    public static List<Integer> y(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return ut.zn(this.y, textInformationFrame.y) && ut.zn(this.f1631v, textInformationFrame.f1631v) && this.f1630s.equals(textInformationFrame.f1630s);
    }

    public int hashCode() {
        int iHashCode = (527 + this.y.hashCode()) * 31;
        String str = this.f1631v;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f1630s.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void lc(qj.n3 n3Var) {
        String str = this.y;
        str.hashCode();
        byte b4 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b4 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b4 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b4 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b4 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b4 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b4 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b4 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b4 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b4 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b4 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b4 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b4 = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b4 = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b4 = 13;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b4 = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b4 = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b4 = 16;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b4 = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b4 = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b4 = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b4 = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b4 = 21;
                }
                break;
        }
        try {
            switch (b4) {
                case 0:
                case 10:
                    n3Var.yt(this.f1630s.get(0));
                    break;
                case 1:
                case 11:
                    n3Var.o(this.f1630s.get(0));
                    break;
                case 2:
                case Code.UNIMPLEMENTED /* 12 */:
                    String str2 = this.f1630s.get(0);
                    n3Var.ct(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).dm(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    n3Var.vl(this.f1630s.get(0));
                    break;
                case 4:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    n3Var.k5(this.f1630s.get(0));
                    break;
                case 5:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    n3Var.j(this.f1630s.get(0));
                    break;
                case 6:
                case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                    String[] strArrRo = ut.ro(this.f1630s.get(0), "/");
                    n3Var.yg(Integer.valueOf(Integer.parseInt(strArrRo[0]))).ap(strArrRo.length > 1 ? Integer.valueOf(Integer.parseInt(strArrRo[1])) : null);
                    break;
                case 7:
                case 16:
                    n3Var.e(this.f1630s.get(0));
                    break;
                case 8:
                case 15:
                    n3Var.kp(this.f1630s.get(0));
                    break;
                case 9:
                case 21:
                    n3Var.o4(Integer.valueOf(Integer.parseInt(this.f1630s.get(0))));
                    break;
                case 13:
                    List<Integer> listY = y(this.f1630s.get(0));
                    int size = listY.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                n3Var.dm(listY.get(2));
                            }
                        }
                        n3Var.ct(listY.get(1));
                    }
                    n3Var.o4(listY.get(0));
                    break;
                case 14:
                    List<Integer> listY2 = y(this.f1630s.get(0));
                    int size2 = listY2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                n3Var.rs(listY2.get(2));
                            }
                        }
                        n3Var.eb(listY2.get(1));
                    }
                    n3Var.lc(listY2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.y + ": description=" + this.f1631v + ": values=" + this.f1630s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.f1631v);
        parcel.writeStringArray((String[]) this.f1630s.toArray(new String[0]));
    }

    public TextInformationFrame(String str, @Nullable String str2, List<String> list) {
        super(str);
        v0.y.y(!list.isEmpty());
        this.f1631v = str2;
        r<String> rVarRz = r.rz(list);
        this.f1630s = rVarRz;
        this.f1629fb = rVarRz.get(0);
    }

    public TextInformationFrame(Parcel parcel) {
        this((String) v0.y.v(parcel.readString()), parcel.readString(), r.mg((String[]) v0.y.v(parcel.createStringArray())));
    }
}
