package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import j5.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f781f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f782a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public String f783c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public ColorStateList f784fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public Parcelable f785gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public String f786i9;
    public Object n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f787s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f788v;
    public int y;

    @Nullable
    public byte[] zn;

    public static class gv {
        public static Icon y(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public static class n3 {
        public static Icon n3(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }

        public static Drawable y(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }
    }

    public static class y {
        public static Drawable a(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon fb(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.y) {
                case -1:
                    return (Icon) iconCompat.n3;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.n3);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.wz(), iconCompat.f788v);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.n3, iconCompat.f788v, iconCompat.f782a);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.n3);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.zn((Bitmap) iconCompat.n3, false)) : n3.n3((Bitmap) iconCompat.n3);
                    break;
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        iconCreateWithBitmap = gv.y(iconCompat.w());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.w());
                        }
                        InputStream inputStreamP = iconCompat.p(context);
                        if (inputStreamP == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.w());
                        }
                        if (i < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.zn(BitmapFactory.decodeStream(inputStreamP), false));
                        } else {
                            iconCreateWithBitmap = n3.n3(BitmapFactory.decodeStream(inputStreamP));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f784fb;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f787s;
            if (mode != IconCompat.f781f) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }

        public static int gv(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zn.zn(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                return -1;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                return -1;
            }
        }

        public static int n3(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zn.y(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            }
        }

        @Nullable
        public static Uri v(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zn.gv(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            }
        }

        public static IconCompat y(@NonNull Object obj) {
            s.fb(obj);
            int iGv = gv(obj);
            if (iGv == 2) {
                return IconCompat.f(null, zn(obj), n3(obj));
            }
            if (iGv == 4) {
                return IconCompat.s(v(obj));
            }
            if (iGv == 6) {
                return IconCompat.v(v(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.n3 = obj;
            return iconCompat;
        }

        @Nullable
        public static String zn(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return zn.n3(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            }
        }
    }

    public static class zn {
        public static Uri gv(Object obj) {
            return ((Icon) obj).getUri();
        }

        public static String n3(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int y(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static int zn(Object obj) {
            return ((Icon) obj).getType();
        }
    }

    public IconCompat() {
        this.y = -1;
        this.zn = null;
        this.f785gv = null;
        this.f788v = 0;
        this.f782a = 0;
        this.f784fb = null;
        this.f787s = f781f;
        this.f783c5 = null;
    }

    @NonNull
    public static IconCompat a(@NonNull String str) {
        j5.zn.zn(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.n3 = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat c5(@NonNull String str) {
        j5.zn.zn(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.n3 = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat f(@Nullable Resources resources, @NonNull String str, int i) {
        j5.zn.zn(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f788v = i;
        if (resources != null) {
            try {
                iconCompat.n3 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.n3 = str;
        }
        iconCompat.f786i9 = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat fb(@NonNull Bitmap bitmap) {
        j5.zn.zn(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.n3 = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat gv(@NonNull Bitmap bitmap) {
        j5.zn.zn(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.n3 = bitmap;
        return iconCompat;
    }

    public static String i4(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @NonNull
    public static IconCompat i9(@NonNull Context context, int i) {
        j5.zn.zn(context);
        return f(context.getResources(), context.getPackageName(), i);
    }

    @Nullable
    public static IconCompat n3(@NonNull Icon icon) {
        if (y.gv(icon) == 2 && y.n3(icon) == 0) {
            return null;
        }
        return y.y(icon);
    }

    @NonNull
    public static IconCompat s(@NonNull Uri uri) {
        j5.zn.zn(uri);
        return c5(uri.toString());
    }

    @NonNull
    public static IconCompat v(@NonNull Uri uri) {
        j5.zn.zn(uri);
        return a(uri.toString());
    }

    @Nullable
    public static IconCompat y(@NonNull Icon icon) {
        return y.y(icon);
    }

    public static Bitmap zn(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f3 = iMin;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z) {
            float f7 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f7, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f7, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public void co(boolean z) {
        this.f783c5 = this.f787s.name();
        switch (this.y) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f785gv = (Parcelable) this.n3;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z) {
                    this.f785gv = (Parcelable) this.n3;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.n3;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.zn = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.zn = ((String) this.n3).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.zn = (byte[]) this.n3;
                return;
            case 4:
            case 6:
                this.zn = this.n3.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public void mt() {
        this.f787s = PorterDuff.Mode.valueOf(this.f783c5);
        switch (this.y) {
            case -1:
                Parcelable parcelable = this.f785gv;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.n3 = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f785gv;
                if (parcelable2 != null) {
                    this.n3 = parcelable2;
                    return;
                }
                byte[] bArr = this.zn;
                this.n3 = bArr;
                this.y = 3;
                this.f788v = 0;
                this.f782a = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.zn, Charset.forName("UTF-16"));
                this.n3 = str;
                if (this.y == 2 && this.f786i9 == null) {
                    this.f786i9 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.n3 = this.zn;
                return;
        }
    }

    @Nullable
    public InputStream p(@NonNull Context context) {
        Uri uriW = w();
        String scheme = uriW.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriW);
            } catch (Exception e4) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriW, e4);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.n3));
        } catch (FileNotFoundException e5) {
            Log.w("IconCompat", "Unable to load image from path: " + uriW, e5);
            return null;
        }
    }

    @NonNull
    @Deprecated
    public Icon r() {
        return x4(null);
    }

    @Nullable
    public Bitmap t() {
        int i = this.y;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.n3;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.n3;
        }
        if (i == 5) {
            return zn((Bitmap) this.n3, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int tl() {
        int i = this.y;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return y.n3(this.n3);
        }
        if (i == 2) {
            return this.f788v;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String toString() {
        if (this.y == -1) {
            return String.valueOf(this.n3);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(i4(this.y));
        switch (this.y) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.n3).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.n3).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f786i9);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(tl())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f788v);
                if (this.f782a != 0) {
                    sb.append(" off=");
                    sb.append(this.f782a);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.n3);
                break;
        }
        if (this.f784fb != null) {
            sb.append(" tint=");
            sb.append(this.f784fb);
        }
        if (this.f787s != f781f) {
            sb.append(" mode=");
            sb.append(this.f787s);
        }
        sb.append(")");
        return sb.toString();
    }

    @NonNull
    public Uri w() {
        int i = this.y;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return y.v(this.n3);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.n3);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @NonNull
    public String wz() {
        int i = this.y;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return y.zn(this.n3);
        }
        if (i == 2) {
            String str = this.f786i9;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.n3).split(":", -1)[0] : this.f786i9;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    @NonNull
    public Icon x4(@Nullable Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return y.fb(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public int xc() {
        int i = this.y;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : y.gv(this.n3);
    }

    @NonNull
    public Bundle z() {
        Bundle bundle = new Bundle();
        switch (this.y) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.n3);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.n3);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.n3);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.n3);
                break;
        }
        bundle.putInt("type", this.y);
        bundle.putInt("int1", this.f788v);
        bundle.putInt("int2", this.f782a);
        bundle.putString("string1", this.f786i9);
        ColorStateList colorStateList = this.f784fb;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f787s;
        if (mode != f781f) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public IconCompat(int i) {
        this.zn = null;
        this.f785gv = null;
        this.f788v = 0;
        this.f782a = 0;
        this.f784fb = null;
        this.f787s = f781f;
        this.f783c5 = null;
        this.y = i;
    }
}
