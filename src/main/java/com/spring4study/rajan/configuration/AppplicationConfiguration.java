package com.spring4study.rajan.configuration;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.spring4study.rajan.model.Laptop;
//import com.spring4study.rajan.model.Monitor;

/**
 * @author rajan
 * 
 *         Configuration (same as functionality as xml file in xml based
 *         configuration)
 * @since27Jun2021
 *
 */
@Configuration
@ComponentScan(basePackages = "com.spring4study.rajan.model")
public class AppplicationConfiguration {
//	@Bean
//	public Laptop getLaptop() {
//		return new Laptop();
//	}
//
//	@Bean
//	public Monitor getHardDrive() {
//		return new Monitor();
//	}

}
