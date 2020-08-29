package demo;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@SpringBootTest(classes = TestClass.Config.class, webEnvironment = NONE)
@MappedAnnotation(nested = @MappedAnnotation.NestedMappedAnnotation("somevalue"))
public class TestClass {

    @Autowired
    private ConfigProperties configProperties;

    @Test
    void name() {
        System.out.println(configProperties);
    }

    @Configuration
    public static class Config {

    }
}
