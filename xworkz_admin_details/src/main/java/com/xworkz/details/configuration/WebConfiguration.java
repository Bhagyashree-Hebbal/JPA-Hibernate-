package com.xworkz.details.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.xworkz.details")
@EnableWebMvc
public class WebConfiguration {

    WebConfiguration(){

    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan("com.xworkz.details.entity");
        bean.setDataSource(dataSource());
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return bean;
    }



    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/admin_jpa");
        dataSource.setUsername("root");
        dataSource.setPassword("Xworkzodc@123");
        return dataSource;
    }
}
