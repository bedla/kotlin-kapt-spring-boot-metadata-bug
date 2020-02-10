package cz.bedla;

import com.example.demo.OAuth;
import com.example.demo.OAuth2;
import com.example.demo.OAuth3;
import com.example.demo.OAuth4;
import com.example.demo.OAuth5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        OAuth.class,
        OAuth2.class,
        OAuth3.class,
        OAuth4.class,
        OAuth5.class
})
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.main(args);
    }
}
