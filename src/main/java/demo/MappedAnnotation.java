package demo;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.springframework.boot.test.autoconfigure.properties.SkipPropertyMapping.ON_DEFAULT_VALUE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.properties.PropertyMapping;

@Target(TYPE)
@Retention(RUNTIME)
@PropertyMapping(value = "myprefix", skip = ON_DEFAULT_VALUE)
@EnableConfigurationProperties(ConfigProperties.class)
public @interface MappedAnnotation {
    NestedMappedAnnotation[] nested() default {};

    @interface NestedMappedAnnotation {
        String value();
    }
}
