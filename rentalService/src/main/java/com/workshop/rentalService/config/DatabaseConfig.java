package com.workshop.rentalService.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class DatabaseConfig {

    @Autowired
    private Environment env;


    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan("com.workshop.rentalService.entity");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    public Properties hibernateProperties() {
        return new Properties() {
            /**
			 * 
			 */
			private static final long serialVersionUID = -8035005489645891190L;

			{
                setProperty("hibernate.hbm2ddl.auto", env.getProperty("datasource.ddl-auto"));
                setProperty("hibernate.dialect", env.getProperty("datasource.hibernate.dialect"));
                setProperty("hibernate.show_sql", env.getProperty("datasource.show-sql"));
                setProperty("hibernate.format_sql", env.getProperty("datasource.format-sql"));
            }
        };
    }

    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }

    @Bean
    public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
        return new HibernateTemplate(sessionFactory);
    }

}
