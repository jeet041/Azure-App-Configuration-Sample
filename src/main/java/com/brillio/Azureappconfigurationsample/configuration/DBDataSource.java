package com.brillio.Azureappconfigurationsample.configuration;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
@RefreshScope
public class DBDataSource {

//    @Value("")
//    private String jdbcUrl;


    //private DataSource ds;
    @Bean
    public DataSource dataSource(@Qualifier("HikariCP") HikariConfig hikariConfig) {
        DataSource ds=null;
        hikariConfig.setJdbcUrl( "jdbc:h2:mem:dcbapp" );
        hikariConfig.setUsername( "sa" );
        hikariConfig.setPassword( "password" );
        hikariConfig.addDataSourceProperty( "cachePrepStmts" , "true" );
        hikariConfig.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        hikariConfig.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        ds = new HikariDataSource(hikariConfig);
        return ds;
    }

    @Bean
    public Connection getConnection(DataSource ds) throws SQLException {
        return ds.getConnection();
    }


    @Bean(name="HikariCP")
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig(){
        HikariConfig hikariConfig = new HikariConfig();
        return hikariConfig;
    }
}
