/*
 * Spring Sandbox - Dependency Injection - Constructor
 */
package com.infinitemule.spring.container.depinject.constructor;

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
    

    Person hoomanConcise = context.getBean("hoomanConcise", Person.class);
    hoomanConcise.display();
    
    
    Person hoomanIndexed = context.getBean("hoomanIndexed", Person.class);
    hoomanIndexed.display();
    
    
    
    
  }
}
