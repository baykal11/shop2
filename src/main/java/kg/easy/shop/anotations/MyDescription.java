package kg.easy.shop.anotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
public @interface MyDescription {
    String description();
    float version() default 0.1f;

}
