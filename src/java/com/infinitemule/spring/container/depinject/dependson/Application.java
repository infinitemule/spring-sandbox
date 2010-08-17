/*
 * Spring Sandbox - Dependency Injection - Depends On
 */
package com.infinitemule.spring.container.depinject.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Depends on will explicitly force one or more beans to 
 * be initialized before the specified bean is initialized.  
 * 
 */
public class Application {

  public static void main(String[] args) {
    
    // Instantiate the application context
    
    ApplicationContext context =
      new ClassPathXmlApplicationContext("spring-beans.xml");
        
    
    Dependant dependant = context.getBean("dependant", Dependant.class);
    
  }
  
}
