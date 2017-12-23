package xyz.lomasz.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringHelloWorldApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringHelloWorldApplication.class, args);
  }
}
