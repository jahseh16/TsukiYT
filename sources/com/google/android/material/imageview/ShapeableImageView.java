package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import f.n3;
import t2.zn;
import y2.f;
import y2.fb;
import y2.t;
import y2.wz;

/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements wz {
    private static final int DEF_STYLE_RES = R$style.n;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final t pathProvider;
    private int rightContentPadding;

    @Nullable
    private fb shadowDrawable;
    private f shapeAppearanceModel;
    private int startContentPadding;

    @Nullable
    private ColorStateList strokeColor;
    private float strokeWidth;
    private int topContentPadding;

    @TargetApi(21)
    public class y extends ViewOutlineProvider {
        public final Rect y = new Rect();

        public y() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.shapeAppearanceModel == null) {
                return;
            }
            if (ShapeableImageView.this.shadowDrawable == null) {
                ShapeableImageView.this.shadowDrawable = new fb(ShapeableImageView.this.shapeAppearanceModel);
            }
            ShapeableImageView.this.destination.round(this.y);
            ShapeableImageView.this.shadowDrawable.setBounds(this.y);
            ShapeableImageView.this.shadowDrawable.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void drawStroke(Canvas canvas) {
        if (this.strokeColor == null) {
            return;
        }
        this.borderPaint.setStrokeWidth(this.strokeWidth);
        int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
        if (this.strokeWidth <= 0.0f || colorForState == 0) {
            return;
        }
        this.borderPaint.setColor(colorForState);
        canvas.drawPath(this.path, this.borderPaint);
    }

    private boolean isContentPaddingRelative() {
        return (this.startContentPadding == UNDEFINED_PADDING && this.endContentPadding == UNDEFINED_PADDING) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private void updateShapeMask(int i, int i5) {
        this.destination.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i5 - getPaddingBottom());
        this.pathProvider.gv(this.shapeAppearanceModel, 1.0f, this.destination, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, i, i5);
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.bottomContentPadding;
    }

    public final int getContentPaddingEnd() {
        int i = this.endContentPadding;
        return i != UNDEFINED_PADDING ? i : isRtl() ? this.leftContentPadding : this.rightContentPadding;
    }

    public int getContentPaddingLeft() {
        int i;
        int i5;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i5 = this.endContentPadding) != UNDEFINED_PADDING) {
                return i5;
            }
            if (!isRtl() && (i = this.startContentPadding) != UNDEFINED_PADDING) {
                return i;
            }
        }
        return this.leftContentPadding;
    }

    public int getContentPaddingRight() {
        int i;
        int i5;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i5 = this.startContentPadding) != UNDEFINED_PADDING) {
                return i5;
            }
            if (!isRtl() && (i = this.endContentPadding) != UNDEFINED_PADDING) {
                return i;
            }
        }
        return this.rightContentPadding;
    }

    public final int getContentPaddingStart() {
        int i = this.startContentPadding;
        return i != UNDEFINED_PADDING ? i : isRtl() ? this.rightContentPadding : this.leftContentPadding;
    }

    public int getContentPaddingTop() {
        return this.topContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingBottom() {
        return super/*android.widget.ImageView*/.getPaddingBottom() - getContentPaddingBottom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingEnd() {
        return super/*android.widget.ImageView*/.getPaddingEnd() - getContentPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingLeft() {
        return super/*android.widget.ImageView*/.getPaddingLeft() - getContentPaddingLeft();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingRight() {
        return super/*android.widget.ImageView*/.getPaddingRight() - getContentPaddingRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingStart() {
        return super/*android.widget.ImageView*/.getPaddingStart() - getContentPaddingStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getPaddingTop() {
        return super/*android.widget.ImageView*/.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public f getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.ImageView*/.onAttachedToWindow();
        setLayerType(2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super/*android.widget.ImageView*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.widget.ImageView*/.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        drawStroke(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i5) {
        super/*android.widget.ImageView*/.onMeasure(i, i5);
        if (!this.hasAdjustedPaddingAfterLayoutDirectionResolved && isLayoutDirectionResolved()) {
            this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
            if (isPaddingRelative() || isContentPaddingRelative()) {
                setPaddingRelative(super/*android.widget.ImageView*/.getPaddingStart(), super/*android.widget.ImageView*/.getPaddingTop(), super/*android.widget.ImageView*/.getPaddingEnd(), super/*android.widget.ImageView*/.getPaddingBottom());
            } else {
                setPadding(super/*android.widget.ImageView*/.getPaddingLeft(), super/*android.widget.ImageView*/.getPaddingTop(), super/*android.widget.ImageView*/.getPaddingRight(), super/*android.widget.ImageView*/.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i5, int i8, int i10) {
        super/*android.widget.ImageView*/.onSizeChanged(i, i5, i8, i10);
        updateShapeMask(i, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentPadding(int i, int i5, int i8, int i10) {
        this.startContentPadding = UNDEFINED_PADDING;
        this.endContentPadding = UNDEFINED_PADDING;
        super/*android.widget.ImageView*/.setPadding((super/*android.widget.ImageView*/.getPaddingLeft() - this.leftContentPadding) + i, (super/*android.widget.ImageView*/.getPaddingTop() - this.topContentPadding) + i5, (super/*android.widget.ImageView*/.getPaddingRight() - this.rightContentPadding) + i8, (super/*android.widget.ImageView*/.getPaddingBottom() - this.bottomContentPadding) + i10);
        this.leftContentPadding = i;
        this.topContentPadding = i5;
        this.rightContentPadding = i8;
        this.bottomContentPadding = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentPaddingRelative(int i, int i5, int i8, int i10) {
        super/*android.widget.ImageView*/.setPaddingRelative((super/*android.widget.ImageView*/.getPaddingStart() - getContentPaddingStart()) + i, (super/*android.widget.ImageView*/.getPaddingTop() - this.topContentPadding) + i5, (super/*android.widget.ImageView*/.getPaddingEnd() - getContentPaddingEnd()) + i8, (super/*android.widget.ImageView*/.getPaddingBottom() - this.bottomContentPadding) + i10);
        this.leftContentPadding = isRtl() ? i8 : i;
        this.topContentPadding = i5;
        if (!isRtl()) {
            i = i8;
        }
        this.rightContentPadding = i;
        this.bottomContentPadding = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPadding(int i, int i5, int i8, int i10) {
        super/*android.widget.ImageView*/.setPadding(i + getContentPaddingLeft(), i5 + getContentPaddingTop(), i8 + getContentPaddingRight(), i10 + getContentPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingRelative(int i, int i5, int i8, int i10) {
        super/*android.widget.ImageView*/.setPaddingRelative(i + getContentPaddingStart(), i5 + getContentPaddingTop(), i8 + getContentPaddingEnd(), i10 + getContentPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.wz
    public void setShapeAppearanceModel(@NonNull f fVar) {
        this.shapeAppearanceModel = fVar;
        fb fbVar = this.shadowDrawable;
        if (fbVar != null) {
            fbVar.setShapeAppearanceModel(fVar);
        }
        updateShapeMask(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColorResource(int i) {
        setStrokeColor(n3.zn(getContext(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidth(float f3) {
        if (this.strokeWidth != f3) {
            this.strokeWidth = f3;
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = DEF_STYLE_RES;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        this.pathProvider = t.f();
        this.path = new Path();
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.clearPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.h4, i, i5);
        this.strokeColor = zn.y(context2, typedArrayObtainStyledAttributes, R$styleable.p5);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.c3, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.lw, 0);
        this.leftContentPadding = dimensionPixelSize;
        this.topContentPadding = dimensionPixelSize;
        this.rightContentPadding = dimensionPixelSize;
        this.bottomContentPadding = dimensionPixelSize;
        this.leftContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.nj, dimensionPixelSize);
        this.topContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.us, dimensionPixelSize);
        this.rightContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.q3, dimensionPixelSize);
        this.bottomContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.r4, dimensionPixelSize);
        this.startContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.qh, UNDEFINED_PADDING);
        this.endContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.jk, UNDEFINED_PADDING);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.shapeAppearanceModel = f.v(context2, attributeSet, i, i5).tl();
        setOutlineProvider(new y());
    }
}
