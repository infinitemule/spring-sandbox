/*
 * Spring Sandbox - Dependency Injection - Inner Bean
 */
package com.infinitemule.spring.container.depinject.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Constructor dependency injection example. 
 * 
 */
public class Application {

  public static void main(String[] args) {
    
    // Instantiate the application context
    
    ApplicationContext context =
      new ClassPathXmlApplicationContext("spring-beans.xml");
    

    Person hooman = context.getBean("hooman", Person.class);
    hooman.display();
        
    
  
  }
}
