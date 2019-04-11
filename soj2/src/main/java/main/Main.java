package main;

import Beans.TransactionRepository;
import Beans.TransactionService;
import Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            TransactionRepository tr = (TransactionRepository) context.getBean("t1");
            //preia bean ul pe care l-am creat;
            TransactionRepository tr1 = context.getBean( "transactionrepository1", TransactionRepository.class);
            tr1.setNume("Singleton");

            System.out.println(tr);


            TransactionService transactionService = context.getBean(TransactionService.class);
            System.out.println(transactionService);

        }
    }
}
