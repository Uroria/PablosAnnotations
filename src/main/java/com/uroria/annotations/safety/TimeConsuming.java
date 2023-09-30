package com.uroria.annotations.safety;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks any method, including constructors, as time-consuming.
 * You shouldn't call such methods in environments, where performance is very important.
 * Cache everything you need yourself if you need to.
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface TimeConsuming {

}
