package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1100Zz extends AnonymousClass37 {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C02983h A00;

    public C1100Zz(C02983h c02983h) {
        this.A00 = c02983h;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C02983h.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final void A08(View view, C03093s c03093s) {
        super.A08(view, c03093s);
        c03093s.A0O(C02983h.class.getName());
        c03093s.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c03093s.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c03093s.A0N(8192);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                C02983h c02983h = this.A00;
                int i5 = c02983h.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
                    throw new RuntimeException();
                }
                A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
                c02983h.setCurrentItem(i5 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                C02983h c02983h2 = this.A00;
                c02983h2.setCurrentItem(c02983h2.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}
