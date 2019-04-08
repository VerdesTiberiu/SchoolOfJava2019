package config;

import main.objects.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean   // am creat instanta si am pus-o in context
    public Cat cat(){   //metoda asta reprezinta instanta cu totul, ea este instanta, nu face ceva
        Cat c = new Cat();
        c.name = "Tom";
        return c;
    }
}
