package com.spring4study.rajan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring4study.rajan.configuration.AppplicationConfiguration;
import com.spring4study.rajan.model.Laptop;

/**
 * Sample annotation based spring core project
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Laptop laptop= new Laptop(); // Old wat to create object
    	// create application context
    	ApplicationContext factory= new AnnotationConfigApplicationContext(AppplicationConfiguration.class);
    	Laptop laptop=factory.getBean(Laptop.class);
    	laptop.showConfig();
    	
    }
}
