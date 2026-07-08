package t1;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class a extends Property<ImageView, Matrix> {
    public final Matrix y;

    public a() {
        super(Matrix.class, "imageMatrixProperty");
        this.y = new Matrix();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    @Override // android.util.Property
    @NonNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Matrix get(@NonNull ImageView imageView) {
        this.y.set(imageView.getImageMatrix());
        return this.y;
    }
}
