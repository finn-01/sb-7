package vn.finn.spring.demoapplicationconfigandanotationvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${loda.mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector mySqlConfigure(){
        DatabaseConnector mySqlConnector = new MySqlConnector();

        //Set url

        System.out.println("Config Mysql Url: " + mysqlUrl);
        mySqlConnector.setUrl(mysqlUrl);

        return mySqlConnector;
    }
}
