package jpa;

import jpa.configuration.JpaConfiguration;
import jpa.services.DowodService;
import jpa.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("jpa")
public class Main {


    static UserService userService;
    static DowodService dowodService;

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JpaConfiguration.class);
        userService = context.getBean(UserService.class);
        //System.out.println(userService.getUser("hihi"));
        dowodService = context.getBean(DowodService.class);
        System.out.println(dowodService.dodajDateBadaniaTechnicznego("98uiohio8900", "dupa"));
    }
}
