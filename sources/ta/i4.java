package ta;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4 {
    public Matrix y;

    public interface y {
        void y();
    }

    public static Bitmap y(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (intrinsicWidth * fMin);
        int i5 = (int) (intrinsicHeight * fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = drawable.getBounds();
        int i8 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        drawable.setBounds(0, 0, i, i5);
        drawable.draw(canvas);
        drawable.setBounds(i8, i10, i11, i12);
        return bitmapCreateBitmap;
    }

    public Parcelable n3(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapY;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapY = y(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("sharedElement:snapshot:bitmap", bitmapY);
                bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                }
                return bundle;
            }
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        int i = (int) (iRound * fMin);
        int i5 = (int) (iRound2 * fMin);
        if (this.y == null) {
            this.y = new Matrix();
        }
        this.y.set(matrix);
        this.y.postTranslate(-rectF.left, -rectF.top);
        this.y.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.y);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public void s(List<String> list, List<View> list2, y yVar) {
        yVar.y();
    }

    public View zn(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
        if (imageView2.getScaleType() != ImageView.ScaleType.MATRIX) {
            return imageView2;
        }
        float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
        Matrix matrix = new Matrix();
        matrix.setValues(floatArray);
        imageView2.setImageMatrix(matrix);
        return imageView2;
    }

    public void v(List<View> list) {
    }

    public void gv(List<String> list, Map<String, View> map) {
    }

    public void a(List<String> list, List<View> list2, List<View> list3) {
    }

    public void fb(List<String> list, List<View> list2, List<View> list3) {
    }
}
