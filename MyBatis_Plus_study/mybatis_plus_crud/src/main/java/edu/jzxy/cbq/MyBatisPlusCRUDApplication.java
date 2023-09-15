package edu.jzxy.cbq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Cola0817
 * @name MyBatisPlusCRUDApplication
 * @date 2023/9/15 22:58
 * @since 1.0.0
 */
@SpringBootApplication
@Slf4j
public class MyBatisPlusCRUDApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusCRUDApplication.class);
        log.info("MyBatisPlusCRUDApplication run success ");
    }
}
