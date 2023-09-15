package edu.jzxy.cbq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Cola0817
 * @name MyBatisPlusHelloWorldApplication
 * @date 2023/9/15 20:43
 * @since 1.0.0
 */
@SpringBootApplication
@Slf4j
public class MyBatisPlusHelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusHelloWorldApplication.class);

        log.info("MyBatisPlusHelloWorldApplication run success ");

    }
}
