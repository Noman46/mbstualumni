package com.noman.alumnibackend.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.noman.alumnibackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {

	private static final String DATABASE_URL = "jdbc:h2:tcp://localhost/~/mbstualumni";
	private static final String DATABASE_DRIVER = "org.h2.Driver";
	private static final String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private static final String DATABASE_USERNAME = "sa";
	private static final String DATABASE_PASSWORD = "";

	@Bean("dataSource")
	public DataSource getDAtaSource() {

		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		System.out.println("DataSource");

		return dataSource;

	}

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHiberNateProperties());
		builder.scanPackages("com.noman.alumnibackend.dto");
		System.out.println("factory");

		return builder.buildSessionFactory();

	}

	private Properties getHiberNateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		System.out.println("Properties");
		return properties;
	}
   
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sesssionFactory) {

		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sesssionFactory);
		System.out.println("Transaction");
		
		return transactionManager;
	}
}
