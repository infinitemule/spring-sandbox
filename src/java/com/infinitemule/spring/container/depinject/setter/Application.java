/*
 * Spring Sandbox - Dependency Injection - Setter
 */
package com.infinitemule.spring.container.depinject.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Simple dependency injection example. 
 * 
 */
public class Application {

  public static void main(String[] args) {
    
    // Instantiate the application context
    
    ApplicationContext context =
      new ClassPathXmlApplicationContext("spring-beans.xml");
    
    
    // Ask for the service that already has our random number generator
    // instantiated and injected into our random service
    
    RandomService random = context.getBean("randomService", RandomService.class);
 
    
    for(Integer i = 0; i < 5; i++) {
      System.out.println(random.randomInteger());
    }
    
    
    // You can now go to the corresponding spring-beans.xml file and comment
    // out the first random number generator and uncomment the second.  One 
    // of the advangatges of Spring is that you can swap different implementations
    // of a common interface (or abstract class) without altering and recompiling code.
    
  }
}
