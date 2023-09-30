package com.uroria.annotations.markers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Displays a weak-warning to each method call expression.
 * Only works if IntelliJ Uroria Development Plugin is installed.
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface WeakWarning {
    String message();

    String suppress() default "I understand";
}
