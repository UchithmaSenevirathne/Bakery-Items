package lk.ijse.bakeryitems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BakeryItemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BakeryItemsApplication.class, args);
    }

}
