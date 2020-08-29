package demo;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("myprefix")
@Data
public class ConfigProperties {
    private List<Nested> nested;

    @Data
    public static class Nested {
        private String value;
    }
}
