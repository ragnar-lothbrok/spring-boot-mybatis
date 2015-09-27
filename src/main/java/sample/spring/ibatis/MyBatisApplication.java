package sample.spring.ibatis;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableAutoConfiguration
public class MyBatisApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(MyBatisApplication.class).run(args);
    }

}
