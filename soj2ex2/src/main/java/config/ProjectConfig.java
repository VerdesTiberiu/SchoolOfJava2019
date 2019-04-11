package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repository.TransactionRepository;

@Configuration
@ComponentScan(basePackages ={"repository", "service"})
public class ProjectConfig {
    @Bean
    public TransactionRepository transactionRepository(){
        TransactionRepository tr = new TransactionRepository();
        tr.setNume("Transation");
        return tr;
    }
}
