package io.rocktest.modules.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * If set on a module's method, RockTest will use it as a module
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RockWord {
    public String keyword();
    public String result() default "result";
    public String extension() default "extension";
    public String[] params() default "";
}
