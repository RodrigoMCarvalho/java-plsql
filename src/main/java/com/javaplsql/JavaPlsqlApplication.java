package com.javaplsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@SpringBootApplication
@ComponentScan("com.javaplsql")
public class JavaPlsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPlsqlApplication.class, args);
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true); //criação de tabelas automaticamente pelo Hibernate
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5InnoDBDialect");
		adapter.setPrepareConnection(true);
		
		return adapter;
	}
}
