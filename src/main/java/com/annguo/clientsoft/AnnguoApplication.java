package com.annguo.clientsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.annguo.clientsoft.user.dao")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Configuration
@SpringBootApplication
public class AnnguoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnnguoApplication.class, args);

	}

}
