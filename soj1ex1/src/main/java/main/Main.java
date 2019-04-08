package main;
import config.ProjectConfig;
import main.objects.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Cat c = context.getBean(Cat.class);  // preia referinta din context ca sa o foloseasca
            System.out.println(c.name);
        }
    }
}
