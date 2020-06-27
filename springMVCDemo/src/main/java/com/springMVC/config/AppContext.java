package com.springMVC.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.springMVC.model.PersonBean;



@Configuration
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class AppContext {
	@Autowired
	private Environment environment;

	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}
@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		datasource.setUrl(environment.getRequiredProperty("jdbc.url"));
		datasource.setPassword(environment.getRequiredProperty("jdbc.password"));
		datasource.setUsername(environment.getRequiredProperty("jdbc.username"));
		return datasource;
	}
@Bean
	public LocalSessionFactoryBean sessionFactory() {
	LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
	sessionFactory.setDataSource(datasource());
	sessionFactory.setAnnotatedClasses(PersonBean.class);
	sessionFactory.setHibernateProperties(hibernateProperties());
	return sessionFactory;
	
}
@Bean
public HibernateTransactionManager transactionManager()
{
	HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	transactionManager.setSessionFactory(sessionFactory().getObject());
	return transactionManager;
}

}
