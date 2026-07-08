package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int iZzb;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZza = iVersions.zza(context, str);
        selectionResult.localVersion = iZza;
        int i = 1;
        int i5 = 0;
        if (iZza != 0) {
            iZzb = iVersions.zzb(context, str, false);
            selectionResult.remoteVersion = iZzb;
        } else {
            iZzb = iVersions.zzb(context, str, true);
            selectionResult.remoteVersion = iZzb;
        }
        int i8 = selectionResult.localVersion;
        if (i8 == 0) {
            if (iZzb == 0) {
                i = 0;
            }
            selectionResult.selection = i;
            return selectionResult;
        }
        i5 = i8;
        if (i5 >= iZzb) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }
}
