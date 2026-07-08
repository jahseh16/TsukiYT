package ic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import mh.r;
import n7.gv;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {
    public static final ThreadLocal<PathMeasure> y = new y();
    public static final ThreadLocal<Path> n3 = new n3();
    public static final ThreadLocal<Path> zn = new zn();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final ThreadLocal<float[]> f5669gv = new gv();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f5670v = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float a(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static int c5(float f3, float f4, float f5, float f7) {
        int i = f3 != 0.0f ? (int) (527 * f3) : 17;
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        if (f5 != 0.0f) {
            i = (int) (i * 31 * f5);
        }
        return f7 != 0.0f ? (int) (i * 31 * f7) : i;
    }

    public static boolean f(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static float fb(Matrix matrix) {
        float[] fArr = f5669gv.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f3 = f5670v;
        fArr[2] = f3;
        fArr[3] = f3;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Path gv(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f3 = pointF3.x + pointF.x;
            float f4 = pointF.y + pointF3.y;
            float f5 = pointF2.x;
            float f7 = f5 + pointF4.x;
            float f8 = pointF2.y;
            path.cubicTo(f3, f4, f7, f8 + pointF4.y, f5, f8);
        }
        return path;
    }

    public static boolean i9(int i, int i5, int i8, int i10, int i11, int i12) {
        if (i < i10) {
            return false;
        }
        if (i > i10) {
            return true;
        }
        if (i5 < i11) {
            return false;
        }
        return i5 > i11 || i8 >= i12;
    }

    public static void n3(Path path, @Nullable r rVar) {
        if (rVar == null || rVar.f()) {
            return;
        }
        y(path, ((gv) rVar.c5()).w() / 100.0f, ((gv) rVar.a()).w() / 100.0f, ((gv) rVar.s()).w() / 360.0f);
    }

    public static boolean s(Matrix matrix) {
        float[] fArr = f5669gv.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static Bitmap t(Bitmap bitmap, int i, int i5) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i5, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void tl(Canvas canvas, RectF rectF, Paint paint) {
        wz(canvas, rectF, paint, 31);
    }

    public static float v() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static void wz(Canvas canvas, RectF rectF, Paint paint, int i) {
        uo.zn.y("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        uo.zn.n3("Utils#saveLayer");
    }

    public static void y(Path path, float f3, float f4, float f5) {
        uo.zn.y("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = y.get();
        Path path2 = n3.get();
        Path path3 = zn.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f3 == 1.0f && f4 == 0.0f) {
            uo.zn.n3("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f4 - f3) - 1.0f) < 0.01d) {
            uo.zn.n3("applyTrimPathIfNeeded");
            return;
        }
        float f7 = f3 * length;
        float f8 = f4 * length;
        float f9 = f5 * length;
        float fMin = Math.min(f7, f8) + f9;
        float fMax = Math.max(f7, f8) + f9;
        if (fMin >= length && fMax >= length) {
            fMin = c5.a(fMin, length);
            fMax = c5.a(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = c5.a(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = c5.a(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            uo.zn.n3("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        uo.zn.n3("applyTrimPathIfNeeded");
    }

    public static void zn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }
}
