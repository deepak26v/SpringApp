package com.oreilly.config;

import com.oreilly.entities.*;
import javafx.scene.chart.PieChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by deepakvalechha on 3/4/16.
 */

@Configuration
@Import(InfrastructureConfig.class)
@ComponentScan("com.oreilly")
@EnableAspectJAutoProxy
@EnableTransactionManagement

//@ImportResource - Import non java
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    //private List<Team> teams;

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(redSox(), cubs(), dataSource);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

    @Bean
    public Team cubs() {
        return new Cubs();
    }

    @Bean
    public Team redSox() {
        return new RedSox();
    }

    @Bean
    public Team royals(){
        return new Royals();
    }
}
