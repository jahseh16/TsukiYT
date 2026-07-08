package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;
import de.y;
import ft.g;
import ft.qj;

/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String y;

    public Id3Frame(String str) {
        this.y = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void lc(qj.n3 n3Var) {
        y.zn(this, n3Var);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ g p() {
        return y.n3(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] tg() {
        return y.y(this);
    }

    public String toString() {
        return this.y;
    }
}
