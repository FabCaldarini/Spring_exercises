package it.epicode.w5d1;

import it.epicode.w5d1.bean.MenuConfig;
import it.epicode.w5d1.model.Menu;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "il.tuo.pacchetto")
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);
        Menu menu = context.getBean(Menu.class);

        System.out.println(menu);
    }
}
