package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.R;
import androidx.core.app.zn;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import d.zn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ta.wz;
import ta.z;

/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f721a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        @Deprecated
        public int f722c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public PendingIntent f723f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f724fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final z[] f725gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public CharSequence f726i9;

        @Nullable
        public IconCompat n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f727s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f728t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f729v;
        public final Bundle y;
        public final z[] zn;

        public n3(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.f(null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, i) : null, charSequence, pendingIntent);
        }

        public int a() {
            return this.f724fb;
        }

        public boolean c5() {
            return this.f728t;
        }

        public boolean fb() {
            return this.f721a;
        }

        @Nullable
        public IconCompat gv() {
            int i;
            if (this.n3 == null && (i = this.f722c5) != 0) {
                this.n3 = IconCompat.f(null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, i);
            }
            return this.n3;
        }

        public boolean i9() {
            return this.f727s;
        }

        public boolean n3() {
            return this.f729v;
        }

        @Nullable
        public CharSequence s() {
            return this.f726i9;
        }

        @Nullable
        public z[] v() {
            return this.zn;
        }

        @Nullable
        public PendingIntent y() {
            return this.f723f;
        }

        @NonNull
        public Bundle zn() {
            return this.y;
        }

        public n3(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (z[]) null, (z[]) null, true, 0, true, false, false);
        }

        public n3(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable z[] zVarArr, @Nullable z[] zVarArr2, boolean z, int i5, boolean z5, boolean z7, boolean z8) {
            this(i != 0 ? IconCompat.f(null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, i) : null, charSequence, pendingIntent, bundle, zVarArr, zVarArr2, z, i5, z5, z7, z8);
        }

        public n3(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable z[] zVarArr, @Nullable z[] zVarArr2, boolean z, int i, boolean z5, boolean z7, boolean z8) {
            this.f721a = true;
            this.n3 = iconCompat;
            if (iconCompat != null && iconCompat.xc() == 2) {
                this.f722c5 = iconCompat.tl();
            }
            this.f726i9 = tl.a(charSequence);
            this.f723f = pendingIntent;
            this.y = bundle == null ? new Bundle() : bundle;
            this.zn = zVarArr;
            this.f725gv = zVarArr2;
            this.f729v = z;
            this.f724fb = i;
            this.f721a = z5;
            this.f727s = z7;
            this.f728t = z8;
        }
    }

    public static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f730a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public String f731fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f732gv;
        public PendingIntent n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f733v;
        public PendingIntent y;
        public IconCompat zn;

        @Nullable
        public static Notification.BubbleMetadata f(@Nullable t tVar) {
            if (tVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return n3.n3(tVar);
            }
            if (i == 29) {
                return y.n3(tVar);
            }
            return null;
        }

        @Nullable
        public static t y(@Nullable Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return n3.y(bubbleMetadata);
            }
            if (i == 29) {
                return y.y(bubbleMetadata);
            }
            return null;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat a() {
            return this.zn;
        }

        public boolean c5() {
            return (this.f730a & 2) != 0;
        }

        @Nullable
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent fb() {
            return this.y;
        }

        public int gv() {
            return this.f732gv;
        }

        public void i9(int i) {
            this.f730a = i;
        }

        public boolean n3() {
            return (this.f730a & 1) != 0;
        }

        @Nullable
        public String s() {
            return this.f731fb;
        }

        public int v() {
            return this.f733v;
        }

        @Nullable
        public PendingIntent zn() {
            return this.n3;
        }

        public t(@Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable IconCompat iconCompat, int i, int i5, int i8, @Nullable String str) {
            this.y = pendingIntent;
            this.zn = iconCompat;
            this.f732gv = i;
            this.f733v = i5;
            this.n3 = pendingIntent2;
            this.f730a = i8;
            this.f731fb = str;
        }
    }

    public static abstract class xc {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f765gv = false;
        public CharSequence n3;
        public tl y;
        public CharSequence zn;

        public RemoteViews a(ta.tl tlVar) {
            return null;
        }

        public void fb(@Nullable tl tlVar) {
            if (this.y != tlVar) {
                this.y = tlVar;
                if (tlVar != null) {
                    tlVar.ta(this);
                }
            }
        }

        public RemoteViews gv(ta.tl tlVar) {
            return null;
        }

        public abstract void n3(ta.tl tlVar);

        public RemoteViews v(ta.tl tlVar) {
            return null;
        }

        public void y(@NonNull Bundle bundle) {
            if (this.f765gv) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.zn);
            }
            CharSequence charSequence = this.n3;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String strZn = zn();
            if (strZn != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, strZn);
            }
        }

        @Nullable
        public String zn() {
            return null;
        }
    }

    @Deprecated
    public NotificationCompat() {
    }

    @Nullable
    public static n3 getAction(@NonNull Notification notification, int i) {
        return getActionCompatFromAction(notification.actions[i]);
    }

    @NonNull
    public static n3 getActionCompatFromAction(@NonNull Notification.Action action) {
        z[] zVarArr;
        int i;
        RemoteInput[] remoteInputArrFb = zn.fb(action);
        if (remoteInputArrFb == null) {
            zVarArr = null;
        } else {
            z[] zVarArr2 = new z[remoteInputArrFb.length];
            for (int i5 = 0; i5 < remoteInputArrFb.length; i5++) {
                RemoteInput remoteInput = remoteInputArrFb[i5];
                zVarArr2[i5] = new z(zn.s(remoteInput), zn.a(remoteInput), zn.n3(remoteInput), zn.y(remoteInput), Build.VERSION.SDK_INT >= 29 ? s.zn(remoteInput) : 0, zn.gv(remoteInput), null);
            }
            zVarArr = zVarArr2;
        }
        int i8 = Build.VERSION.SDK_INT;
        boolean z = i8 >= 24 ? zn.zn(action).getBoolean("android.support.allowGeneratedReplies") || v.y(action) : zn.zn(action).getBoolean("android.support.allowGeneratedReplies");
        boolean z5 = zn.zn(action).getBoolean("android.support.action.showsUserInterface", true);
        int iY = i8 >= 28 ? fb.y(action) : zn.zn(action).getInt("android.support.action.semanticAction", 0);
        boolean zV = i8 >= 29 ? s.v(action) : false;
        boolean zY = i8 >= 31 ? c5.y(action) : false;
        if (i8 < 23) {
            return new n3(action.icon, action.title, action.actionIntent, zn.zn(action), zVarArr, (z[]) null, z, iY, z5, zV, zY);
        }
        if (gv.y(action) != null || (i = action.icon) == 0) {
            return new n3(gv.y(action) != null ? IconCompat.n3(gv.y(action)) : null, action.title, action.actionIntent, zn.zn(action), zVarArr, (z[]) null, z, iY, z5, zV, zY);
        }
        return new n3(i, action.title, action.actionIntent, zn.zn(action), zVarArr, (z[]) null, z, iY, z5, zV, zY);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return s.y(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.y(notification);
        }
        return 0;
    }

    @Nullable
    public static t getBubbleMetadata(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return t.y(s.n3(notification));
        }
        return null;
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.n3(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return zn.v(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.zn(notification);
        }
        return 0;
    }

    public static boolean getHighPriority(@NonNull Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @NonNull
    public static List<n3> getInvisibleActions(@NonNull Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(androidx.core.app.n3.zn(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        return (notification.flags & FLAG_LOCAL_ONLY) != 0;
    }

    @Nullable
    public static zn getLocusId(@NonNull Notification notification) {
        LocusId locusIdGv;
        if (Build.VERSION.SDK_INT < 29 || (locusIdGv = s.gv(notification)) == null) {
            return null;
        }
        return zn.gv(locusIdGv);
    }

    @NonNull
    public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @NonNull
    public static List<zn> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(zn.y(wz.y(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new zn.zn().fb(str).y());
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.gv(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.v(notification);
        }
        return null;
    }

    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return zn.c5(notification);
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        return (notification.flags & FLAG_GROUP_SUMMARY) != 0;
    }

    @Nullable
    public static Bitmap reduceLargeIconSize(@NonNull Context context, @Nullable Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.n3);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.y);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class tl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f734a;

        /* JADX INFO: renamed from: a8, reason: collision with root package name */
        public RemoteViews f735a8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f736b;
        public boolean c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public RemoteViews f737c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public CharSequence[] f738co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f739d;
        public boolean d0;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public RemoteViews f740ej;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f741f;
        public boolean f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public PendingIntent f742fb;
        public boolean fh;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public ArrayList<n3> f743gv;

        /* JADX INFO: renamed from: hw, reason: collision with root package name */
        public int f744hw;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public String f745i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public IconCompat f746i9;
        public Notification j;

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        public int f747j5;

        /* JADX INFO: renamed from: k5, reason: collision with root package name */
        public String f748k5;
        public Bundle mg;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public CharSequence f749mt;
        public String n;
        public ArrayList<n3> n3;
        public t o;
        public boolean oz;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public CharSequence f750p;

        @Deprecated
        public ArrayList<String> q9;
        public boolean qn;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f751r;
        public String rz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public PendingIntent f752s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f753t;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        public int f754ta;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public int f755tl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public RemoteViews f756ud;

        /* JADX INFO: renamed from: ut, reason: collision with root package name */
        public Object f757ut;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence f758v;
        public long vl;
        public xc w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public boolean f759wz;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f760x;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public boolean f761x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public boolean f762xc;
        public Context y;

        /* JADX INFO: renamed from: yt, reason: collision with root package name */
        public d.zn f763yt;
        public int z;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        public Notification f764z6;

        @NonNull
        public ArrayList<zn> zn;

        public static class y {
            public static AudioAttributes.Builder gv(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            public static AudioAttributes.Builder n3() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder v(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }

            public static AudioAttributes y(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder zn(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }
        }

        public tl(@NonNull Context context, @NonNull String str) {
            this.n3 = new ArrayList<>();
            this.zn = new ArrayList<>();
            this.f743gv = new ArrayList<>();
            this.f759wz = true;
            this.c = false;
            this.f754ta = 0;
            this.f739d = 0;
            this.f736b = 0;
            this.f744hw = 0;
            this.f747j5 = 0;
            Notification notification = new Notification();
            this.j = notification;
            this.y = context;
            this.f760x = str;
            notification.when = System.currentTimeMillis();
            this.j.audioStreamType = -1;
            this.f755tl = 0;
            this.q9 = new ArrayList<>();
            this.qn = true;
        }

        @Nullable
        public static CharSequence a(@Nullable CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @NonNull
        public tl c(int i) {
            this.f755tl = i;
            return this;
        }

        @NonNull
        public tl c5(@NonNull String str) {
            this.f760x = str;
            return this;
        }

        public final void co(int i, boolean z) {
            if (z) {
                Notification notification = this.j;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.j;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        @NonNull
        public tl d(@Nullable CharSequence charSequence) {
            this.j.tickerText = a(charSequence);
            return this;
        }

        @NonNull
        public tl d0(int i, int i5, boolean z) {
            this.z = i;
            this.f751r = i5;
            this.f761x4 = z;
            return this;
        }

        @NonNull
        public tl ej(int i) {
            this.f739d = i;
            return this;
        }

        @NonNull
        public tl f(@Nullable RemoteViews remoteViews) {
            this.j.contentView = remoteViews;
            return this;
        }

        @NonNull
        public tl f3(int i) {
            this.f753t = i;
            return this;
        }

        @NonNull
        public tl fb(boolean z) {
            co(16, z);
            return this;
        }

        @NonNull
        public tl fh(boolean z) {
            this.f759wz = z;
            return this;
        }

        @NonNull
        public tl gv() {
            this.n3.clear();
            return this;
        }

        @NonNull
        public tl i4(boolean z) {
            this.c = z;
            return this;
        }

        @NonNull
        public tl i9(int i) {
            this.f754ta = i;
            return this;
        }

        @NonNull
        public tl mg(@Nullable Uri uri) {
            Notification notification = this.j;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderV = y.v(y.zn(y.n3(), 4), 5);
            this.j.audioAttributes = y.y(builderV);
            return this;
        }

        @NonNull
        public tl mt(@Nullable PendingIntent pendingIntent) {
            this.j.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public tl n(boolean z) {
            co(2, z);
            return this;
        }

        @NonNull
        public tl n3(@Nullable n3 n3Var) {
            if (n3Var != null) {
                this.n3.add(n3Var);
            }
            return this;
        }

        @NonNull
        public tl p(int i) {
            Notification notification = this.j;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public tl r(@Nullable Bitmap bitmap) {
            this.f746i9 = bitmap == null ? null : IconCompat.fb(NotificationCompat.reduceLargeIconSize(this.y, bitmap));
            return this;
        }

        @NonNull
        public tl rz(int i) {
            this.j.icon = i;
            return this;
        }

        @NonNull
        public tl s(@Nullable String str) {
            this.rz = str;
            return this;
        }

        @NonNull
        public tl t(@Nullable PendingIntent pendingIntent) {
            this.f742fb = pendingIntent;
            return this;
        }

        @NonNull
        public tl ta(@Nullable xc xcVar) {
            if (this.w != xcVar) {
                this.w = xcVar;
                if (xcVar != null) {
                    xcVar.fb(this);
                }
            }
            return this;
        }

        @NonNull
        public tl tl(@Nullable CharSequence charSequence) {
            this.f734a = a(charSequence);
            return this;
        }

        @NonNull
        public tl ud(long j) {
            this.j.when = j;
            return this;
        }

        @NonNull
        public Bundle v() {
            if (this.mg == null) {
                this.mg = new Bundle();
            }
            return this.mg;
        }

        @NonNull
        public tl w(@Nullable RemoteViews remoteViews) {
            this.f740ej = remoteViews;
            return this;
        }

        @NonNull
        public tl wz(@Nullable CharSequence charSequence) {
            this.f758v = a(charSequence);
            return this;
        }

        @NonNull
        public tl x4(int i, int i5, int i8) {
            Notification notification = this.j;
            notification.ledARGB = i;
            notification.ledOnMS = i5;
            notification.ledOffMS = i8;
            notification.flags = ((i5 == 0 || i8 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @NonNull
        public tl xc(@Nullable RemoteViews remoteViews) {
            this.f756ud = remoteViews;
            return this;
        }

        @NonNull
        public tl y(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            this.n3.add(new n3(i, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public tl z(@Nullable String str) {
            this.f745i4 = str;
            return this;
        }

        @NonNull
        public tl z6(@Nullable long[] jArr) {
            this.j.vibrate = jArr;
            return this;
        }

        @NonNull
        public Notification zn() {
            return new androidx.core.app.y(this).zn();
        }

        @Deprecated
        public tl(@NonNull Context context) {
            this(context, null);
        }
    }
}
