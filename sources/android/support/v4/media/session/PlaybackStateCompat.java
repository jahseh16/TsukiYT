package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new y();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public List<CustomAction> f253co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f254f;
    public PlaybackState f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final long f255fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f256p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f259t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f260v;
    public final CharSequence w;
    public final int y;
    public final long z;

    public static class n3 {
        public static String a(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long c5(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static void co(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        public static CharSequence f(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static void f3(PlaybackState.Builder builder, int i, long j, float f3, long j4) {
            builder.setState(i, j, f3, j4);
        }

        public static long fb(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static PlaybackState.Builder gv() {
            return new PlaybackState.Builder();
        }

        public static void i4(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static List<PlaybackState.CustomAction> i9(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static int mt(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static PlaybackState.CustomAction n3(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static long p(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static void r(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        public static long s(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static Bundle t(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int tl(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static PlaybackState.CustomAction.Builder v(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        public static float w(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long wz(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static void x4(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static CharSequence xc(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static void y(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static void z(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        public static PlaybackState zn(PlaybackState.Builder builder) {
            return builder.build();
        }
    }

    public class y implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    }

    public static class zn {
        public static void n3(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static Bundle y(PlaybackState playbackState) {
            return playbackState.getExtras();
        }
    }

    public PlaybackStateCompat(int i, long j, long j4, float f3, long j7, int i5, CharSequence charSequence, long j8, List<CustomAction> list, long j9, Bundle bundle) {
        this.y = i;
        this.f260v = j;
        this.f255fb = j4;
        this.f258s = f3;
        this.f254f = j7;
        this.f259t = i5;
        this.w = charSequence;
        this.f256p = j8;
        this.f253co = new ArrayList(list);
        this.z = j9;
        this.f257r = bundle;
    }

    public static PlaybackStateCompat y(Object obj) {
        ArrayList arrayList;
        Bundle bundleY = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listI9 = n3.i9(playbackState);
        if (listI9 != null) {
            ArrayList arrayList2 = new ArrayList(listI9.size());
            Iterator<PlaybackState.CustomAction> it = listI9.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.y(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundleY = zn.y(playbackState);
            MediaSessionCompat.y(bundleY);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(n3.mt(playbackState), n3.p(playbackState), n3.c5(playbackState), n3.w(playbackState), n3.fb(playbackState), 0, n3.f(playbackState), n3.wz(playbackState), arrayList, n3.s(playbackState), bundleY);
        playbackStateCompat.f3 = playbackState;
        return playbackStateCompat;
    }

    public int c5() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object fb() {
        if (this.f3 == null) {
            PlaybackState.Builder builderGv = n3.gv();
            n3.f3(builderGv, this.y, this.f260v, this.f258s, this.f256p);
            n3.r(builderGv, this.f255fb);
            n3.co(builderGv, this.f254f);
            n3.x4(builderGv, this.w);
            Iterator<CustomAction> it = this.f253co.iterator();
            while (it.hasNext()) {
                n3.y(builderGv, (PlaybackState.CustomAction) it.next().zn());
            }
            n3.z(builderGv, this.z);
            if (Build.VERSION.SDK_INT >= 22) {
                zn.n3(builderGv, this.f257r);
            }
            this.f3 = n3.zn(builderGv);
        }
        return this.f3;
    }

    public long gv() {
        return this.f256p;
    }

    public long n3() {
        return this.f254f;
    }

    public long s() {
        return this.f260v;
    }

    public String toString() {
        return "PlaybackState {state=" + this.y + ", position=" + this.f260v + ", buffered position=" + this.f255fb + ", speed=" + this.f258s + ", updated=" + this.f256p + ", actions=" + this.f254f + ", error code=" + this.f259t + ", error message=" + this.w + ", custom actions=" + this.f253co + ", active item id=" + this.z + "}";
    }

    public float v() {
        return this.f258s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeLong(this.f260v);
        parcel.writeFloat(this.f258s);
        parcel.writeLong(this.f256p);
        parcel.writeLong(this.f255fb);
        parcel.writeLong(this.f254f);
        TextUtils.writeToParcel(this.w, parcel, i);
        parcel.writeTypedList(this.f253co);
        parcel.writeLong(this.z);
        parcel.writeBundle(this.f257r);
        parcel.writeInt(this.f259t);
    }

    public long zn() {
        return this.z;
    }

    public static final class gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f265a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public long f266c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bundle f267f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f268fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f269gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public long f270i9;
        public int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence f271s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f272v;
        public final List<CustomAction> y;
        public long zn;

        public gv() {
            this.y = new ArrayList();
            this.f270i9 = -1L;
        }

        public gv a(int i, CharSequence charSequence) {
            this.f268fb = i;
            this.f271s = charSequence;
            return this;
        }

        public gv c5(int i, long j, float f3, long j4) {
            this.n3 = i;
            this.zn = j;
            this.f266c5 = j4;
            this.f272v = f3;
            return this;
        }

        public gv fb(Bundle bundle) {
            this.f267f = bundle;
            return this;
        }

        public gv gv(long j) {
            this.f270i9 = j;
            return this;
        }

        public PlaybackStateCompat n3() {
            return new PlaybackStateCompat(this.n3, this.zn, this.f269gv, this.f272v, this.f265a, this.f268fb, this.f271s, this.f266c5, this.y, this.f270i9, this.f267f);
        }

        public gv s(int i, long j, float f3) {
            return c5(i, j, f3, SystemClock.elapsedRealtime());
        }

        public gv v(long j) {
            this.f269gv = j;
            return this;
        }

        public gv y(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.y.add(customAction);
            return this;
        }

        public gv zn(long j) {
            this.f265a = j;
            return this;
        }

        public gv(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            this.f270i9 = -1L;
            this.n3 = playbackStateCompat.y;
            this.zn = playbackStateCompat.f260v;
            this.f272v = playbackStateCompat.f258s;
            this.f266c5 = playbackStateCompat.f256p;
            this.f269gv = playbackStateCompat.f255fb;
            this.f265a = playbackStateCompat.f254f;
            this.f268fb = playbackStateCompat.f259t;
            this.f271s = playbackStateCompat.w;
            List<CustomAction> list = playbackStateCompat.f253co;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f270i9 = playbackStateCompat.z;
            this.f267f = playbackStateCompat.f257r;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new y();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PlaybackState.CustomAction f261f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f262fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Bundle f263s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final CharSequence f264v;
        public final String y;

        public class y implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.y = str;
            this.f264v = charSequence;
            this.f262fb = i;
            this.f263s = bundle;
        }

        public static CustomAction y(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle bundleT = n3.t(customAction);
            MediaSessionCompat.y(bundleT);
            CustomAction customAction2 = new CustomAction(n3.a(customAction), n3.xc(customAction), n3.tl(customAction), bundleT);
            customAction2.f261f = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String n3() {
            return this.y;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f264v) + ", mIcon=" + this.f262fb + ", mExtras=" + this.f263s;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.y);
            TextUtils.writeToParcel(this.f264v, parcel, i);
            parcel.writeInt(this.f262fb);
            parcel.writeBundle(this.f263s);
        }

        public Object zn() {
            PlaybackState.CustomAction customAction = this.f261f;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builderV = n3.v(this.y, this.f264v, this.f262fb);
            n3.i4(builderV, this.f263s);
            return n3.n3(builderV);
        }

        public CustomAction(Parcel parcel) {
            this.y = parcel.readString();
            this.f264v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f262fb = parcel.readInt();
            this.f263s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.y = parcel.readInt();
        this.f260v = parcel.readLong();
        this.f258s = parcel.readFloat();
        this.f256p = parcel.readLong();
        this.f255fb = parcel.readLong();
        this.f254f = parcel.readLong();
        this.w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f253co = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.z = parcel.readLong();
        this.f257r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f259t = parcel.readInt();
    }
}
