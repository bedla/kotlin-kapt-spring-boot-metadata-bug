package bar;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.Map;

@ConstructorBinding
@ConfigurationProperties(prefix = "hello")
public class MyProperties {

    @NestedConfigurationProperty
    private final Map<String, Inner> inner;

    public MyProperties(Map<String, Inner> inner) {
        this.inner = inner;
    }

    public Map<String, Inner> getInner() {
        return inner;
    }

    public static class Inner {
        private final String value;

        public Inner(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
