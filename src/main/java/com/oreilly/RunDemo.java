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
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext((AppConfig.class));

        //Team royalsTeam = appContext.getBean("royals", Team.class);

        Game game = appContext.getBean("game", Game.class);
        Team royals = appContext.getBean("royals", Team.class);
        Team redSox = appContext.getBean("redSox", Team.class);
        Team cubs = appContext.getBean("cubs", Team.class);

        game.setAwayTeam(cubs);
        game.setHomeTeam(royals);
        System.out.println(game.playGame());

        game.setAwayTeam(redSox);
        game.setHomeTeam(cubs);
        System.out.println(game.playGame());
    }
}
