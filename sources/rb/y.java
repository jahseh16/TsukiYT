package rb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f7732a = new Object();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static y f7733fb;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f7735v;
    public final Context y;
    public final HashMap<BroadcastReceiver, ArrayList<zn>> n3 = new HashMap<>();
    public final HashMap<String, ArrayList<zn>> zn = new HashMap<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final ArrayList<n3> f7734gv = new ArrayList<>();

    public static final class n3 {
        public final ArrayList<zn> n3;
        public final Intent y;

        public n3(Intent intent, ArrayList<zn> arrayList) {
            this.y = intent;
            this.n3 = arrayList;
        }
    }

    /* JADX INFO: renamed from: rb.y$y, reason: collision with other inner class name */
    public class HandlerC0155y extends Handler {
        public HandlerC0155y(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                y.this.y();
            }
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f7736gv;
        public final BroadcastReceiver n3;
        public final IntentFilter y;
        public boolean zn;

        public zn(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.y = intentFilter;
            this.n3 = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.n3);
            sb.append(" filter=");
            sb.append(this.y);
            if (this.f7736gv) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public y(Context context) {
        this.y = context;
        this.f7735v = new HandlerC0155y(context.getMainLooper());
    }

    @NonNull
    public static y n3(@NonNull Context context) {
        y yVar;
        synchronized (f7732a) {
            try {
                if (f7733fb == null) {
                    f7733fb = new y(context.getApplicationContext());
                }
                yVar = f7733fb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }

    public boolean gv(@NonNull Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<zn> arrayList2;
        String str2;
        synchronized (this.n3) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.y.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<zn> arrayList3 = this.zn.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i5 = 0;
                    while (i5 < arrayList3.size()) {
                        zn znVar = arrayList3.get(i5);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + znVar.y);
                        }
                        if (znVar.zn) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            i = i5;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i = i5;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            int iMatch = znVar.y.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(znVar);
                                znVar.zn = true;
                                i5 = i + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                strResolveTypeIfNeeded = str2;
                            } else if (z) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        arrayList4 = arrayList;
                        i5 = i + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                            ((zn) arrayList5.get(i8)).zn = false;
                        }
                        this.f7734gv.add(new n3(intent, arrayList5));
                        if (!this.f7735v.hasMessages(1)) {
                            this.f7735v.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.n3) {
            try {
                ArrayList<zn> arrayListRemove = this.n3.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    zn znVar = arrayListRemove.get(size);
                    znVar.f7736gv = true;
                    for (int i = 0; i < znVar.y.countActions(); i++) {
                        String action = znVar.y.getAction(i);
                        ArrayList<zn> arrayList = this.zn.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                zn znVar2 = arrayList.get(size2);
                                if (znVar2.n3 == broadcastReceiver) {
                                    znVar2.f7736gv = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.zn.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y() {
        int size;
        n3[] n3VarArr;
        while (true) {
            synchronized (this.n3) {
                try {
                    size = this.f7734gv.size();
                    if (size <= 0) {
                        return;
                    }
                    n3VarArr = new n3[size];
                    this.f7734gv.toArray(n3VarArr);
                    this.f7734gv.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                n3 n3Var = n3VarArr[i];
                int size2 = n3Var.n3.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    zn znVar = n3Var.n3.get(i5);
                    if (!znVar.f7736gv) {
                        znVar.n3.onReceive(this.y, n3Var.y);
                    }
                }
            }
        }
    }

    public void zn(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.n3) {
            try {
                zn znVar = new zn(intentFilter, broadcastReceiver);
                ArrayList<zn> arrayList = this.n3.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.n3.put(broadcastReceiver, arrayList);
                }
                arrayList.add(znVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<zn> arrayList2 = this.zn.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.zn.put(action, arrayList2);
                    }
                    arrayList2.add(znVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
