package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.meta.analytics.dsp.uinode.C0542Ds;
import com.meta.analytics.dsp.uinode.C0645Hz;
import com.meta.analytics.dsp.uinode.Du;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static String[] A01 = {"Fj6tNBtCDQorDDRB8rlCvgh5U", "WjsrXIvjaXWJfVS9HJUoXReCigN3AWnH", "EnjdgAbhPgmDFJfoxAQx5MWPhLMNNNIQ", "m4AtDB", "J2M0MPXR2FsyD2LPqM1vNy6AoDt0wrI3", "lfCbsFO83L7ZnWbz1OnU0Rcd2vRxCyg4", "h3dCOXap4xB1CremU2yC3olUNZ9qCbAx", "fKjKK3msf6IhHOCX9UCClQcPumZ86rhc"};
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C0542Ds();
    public final List<Du> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(Du.A00(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C0542Ds c0542Ds) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<Du> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C0645Hz c0645Hz) {
        int iA0E = c0645Hz.A0E();
        ArrayList arrayList = new ArrayList(iA0E);
        for (int i = 0; i < iA0E; i++) {
            Du duA02 = Du.A02(c0645Hz);
            if (A01[7].charAt(26) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "3NZ1BzqsnCFq7n6LzneX7k935";
            strArr[3] = "BEQGGH";
            arrayList.add(duA02);
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            this.A00.get(i5).A04(parcel);
        }
    }
}
