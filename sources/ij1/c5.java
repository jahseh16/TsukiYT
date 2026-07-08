package ij1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface c5 {
    Class<? extends zn<?>> with() default zn.class;
}
