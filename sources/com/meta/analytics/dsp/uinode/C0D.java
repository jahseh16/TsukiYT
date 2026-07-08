package com.meta.analytics.dsp.uinode;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0D implements Comparator<File> {
    public C0D() {
    }

    private int A00(long j, long j4) {
        if (j < j4) {
            return -1;
        }
        return j == j4 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
