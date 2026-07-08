package com.google.android.exoplayer2.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisComment extends com.google.android.exoplayer2.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new y();

    public class y implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
