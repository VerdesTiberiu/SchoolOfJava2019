package Config;

import Beans.TransactionRepository;
import Beans.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean(name = "t1")
    public TransactionRepository transactionRepository(){
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setNume("transaction");
        return new TransactionRepository();
    }
    @Bean(name = "transactionrepository1")
    @Primary
    public TransactionRepository transactionRepository2(){
        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.setNume("transaction 2");
        return new TransactionRepository();
    }

    @Bean
    public TransactionService transactionService(){
        TransactionService transactionService = new TransactionService();
        transactionService.setTransactionRepository(new TransactionRepository());

        return transactionService;
    }
}
