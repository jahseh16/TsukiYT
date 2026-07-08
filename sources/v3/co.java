package v3;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import z3.a;
import z3.y;

/* JADX INFO: loaded from: classes.dex */
public final class co implements a4.a8 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Executor f8792gv;
    public final a n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z3.co f8793v;
    public final Context y;
    public final r zn;

    public co(Context context, Executor executor, r rVar, a aVar, z3.co coVar, byte[] bArr) {
        this.y = context;
        this.n3 = aVar;
        this.zn = rVar;
        this.f8792gv = executor;
        this.f8793v = coVar;
    }

    public static /* bridge */ /* synthetic */ void gv(co coVar, a4.ej ejVar) {
        try {
            if (y.a(xg.y(coVar.y))) {
                Log.i("SplitCompat", "Splits installed.");
                ejVar.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                ejVar.zzb(-12);
            }
        } catch (Exception e4) {
            Log.e("SplitCompat", "Error emulating splits.", e4);
            ejVar.zzb(-12);
        }
    }

    public static /* bridge */ /* synthetic */ void zn(co coVar, List list, a4.ej ejVar) {
        Integer numV = coVar.v(list);
        if (numV == null) {
            return;
        }
        if (numV.intValue() == 0) {
            ejVar.zzc();
        } else {
            ejVar.zzb(numV.intValue());
        }
    }

    @Nullable
    public final Integer v(List list) {
        FileLock fileLockTryLock;
        int i;
        File[] fileArrListFiles;
        try {
            FileChannel channel = new RandomAccessFile(this.n3.gv(), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    try {
                        Log.i("SplitCompat", "Copying splits.");
                        Iterator it = list.iterator();
                        while (true) {
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.y.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            File fileV = this.n3.v(stringExtra);
                            if ((fileV.exists() && fileV.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileV.exists()) {
                                if (this.n3.fb(stringExtra).exists()) {
                                    continue;
                                } else {
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(fileV);
                                        try {
                                            byte[] bArr = new byte[4096];
                                            while (true) {
                                                int i5 = bufferedInputStream.read(bArr);
                                                if (i5 <= 0) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i5);
                                            }
                                            fileOutputStream.close();
                                            bufferedInputStream.close();
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (Throwable unused2) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                        Log.i("SplitCompat", "Splits copied.");
                        try {
                            fileArrListFiles = this.n3.n3().listFiles();
                            try {
                            } catch (Exception e4) {
                                Log.e("SplitCompat", "Error verifying splits.", e4);
                            }
                        } catch (IOException e5) {
                            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e5);
                        }
                    } catch (Exception e6) {
                        Log.e("SplitCompat", "Error copying splits.", e6);
                    }
                    if (this.zn.zn(fileArrListFiles)) {
                        if (this.zn.y(fileArrListFiles)) {
                            try {
                                File[] fileArrListFiles2 = this.n3.n3().listFiles();
                                Arrays.sort(fileArrListFiles2);
                                int length = fileArrListFiles2.length;
                                while (true) {
                                    length--;
                                    if (length < 0) {
                                        break;
                                    }
                                    a.tl(fileArrListFiles2[length]);
                                    File file = fileArrListFiles2[length];
                                    file.renameTo(this.n3.a(file));
                                }
                                Log.i("SplitCompat", "Splits verified.");
                            } catch (IOException e8) {
                                Log.e("SplitCompat", "Cannot write verified split.", e8);
                                i = -13;
                            }
                            numValueOf = Integer.valueOf(i);
                            fileLockTryLock.release();
                        }
                    }
                    Log.e("SplitCompat", "Split verification failed.");
                    i = -11;
                    numValueOf = Integer.valueOf(i);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th2) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th2;
            }
        } catch (Exception e9) {
            Log.e("SplitCompat", "Error locking files.", e9);
            return -13;
        }
    }

    @Override // a4.a8
    public final void y(List list, a4.ej ejVar) {
        if (!y.fb()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f8792gv.execute(new mt(this, list, ejVar));
    }
}
