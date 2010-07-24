/*
 * Spring Sandbox - Hello World
 */

package com.infinitemule.spring.container.instantiate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 */
public class Application {

  public static void main(String[] args) {
    
    // Instantiate the application context
    
    ApplicationContext context =
      new ClassPathXmlApplicationContext("spring-beans.xml");
    
    
    Puppy puppy = null;
       
    puppy = context.getBean("puppyConstructor", Puppy.class);    
    System.out.printf("Bred from %s\n", puppy.getBredFrom());
 
    puppy = context.getBean("puppyStaticInitializer", Puppy.class);    
    System.out.printf("Bred from %s\n", puppy.getBredFrom());

    puppy = context.getBean("puppyFactoryClass", Puppy.class);    
    System.out.printf("Bred from %s\n", puppy.getBredFrom());

    
  }
}
