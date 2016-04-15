package com.oreilly.config;

import com.oreilly.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by deepakvalechha on 3/4/16.
 */

@Configuration
@ComponentScan(basePackages = "com.oreilly")
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private List<Team> teams;

    @Bean @Scope("prototype")
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(teams.get(0), teams.get(1), dataSource);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }
}
