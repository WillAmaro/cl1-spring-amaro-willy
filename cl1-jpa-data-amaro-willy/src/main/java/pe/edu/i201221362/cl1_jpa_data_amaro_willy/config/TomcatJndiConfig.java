package pe.edu.i201221362.cl1_jpa_data_amaro_willy.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatJndiConfig {


    @Value("${DB_WORLD_URL}")
    private String dbUrl;

    @Value("${DB_ WORLD_USER}")
    private String dbUser;

    @Value("${DB_ WORLD_PASS}")
    private String dbPassword;


    @Value("${DB_ WORLD_DRIVER}")
    private String dbClass;

    @Bean
    public HikariDataSource hikariDataSource() {
         HikariDataSource config = new HikariDataSource();

         config.setJdbcUrl(dbUrl);
         config.setUsername(dbUser);
         config.setPassword(dbPassword);
         config.setDriverClassName(dbClass);

//        config.setJdbcUrl("jdbc:mysql://localhost:3306/world");
//        config.setUsername("root");
//        config.setPassword("123456");
//        config.setDriverClassName("com.mysql.cj.jdbc.Driver");

         config.setMaximumPoolSize(30);
         config.setMinimumIdle(4);
         config.setIdleTimeout(240000);
         config.setConnectionTimeout(45000);

         return new HikariDataSource(config);

    }




}
