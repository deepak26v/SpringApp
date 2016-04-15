package com.oreilly;

import com.oreilly.config.AppConfig;
import com.oreilly.entities.Game;
import com.oreilly.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by deepakvalechha on 3/4/16.
 */
public class RunDemo {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext((AppConfig.class));

        Game game1 = appContext.getBean("game", Game.class);
        System.out.println(game1);

        Game game2 = appContext.getBean("game", Game.class);
        Team royalsTeam = appContext.getBean("royals", Team.class);
        game2.setAwayTeam(royalsTeam);
        System.out.println(game2);

        System.out.println(game1);

    }
}
