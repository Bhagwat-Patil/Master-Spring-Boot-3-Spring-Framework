package com.demo.Learn_Spring;

import com.demo.Learn_Spring.game.GameRunner;
import com.demo.Learn_Spring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo.Learn_Spring.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }



    }
}
