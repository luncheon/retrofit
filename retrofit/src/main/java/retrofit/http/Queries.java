package retrofit.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Object field names and values will be appended as query parameter names and values to the URL.
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface Queries {
    /**
     * Specifies whether the fields and values are already URL encoded.
     */
    boolean encoded() default false;
}
