package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.TransactionService;

public class Main {
    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            TransactionService tr = context.getBean(TransactionService.class);
            System.out.println(tr);

        }
    }
}
