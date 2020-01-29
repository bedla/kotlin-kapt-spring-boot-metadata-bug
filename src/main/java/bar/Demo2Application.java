package bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FooProperties.class})
public class Demo2Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.main(args);
    }
}
