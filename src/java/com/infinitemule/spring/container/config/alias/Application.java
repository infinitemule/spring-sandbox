/*
 * Spring Sandbox - Config - Alias
 */

package com.infinitemule.spring.container.config.alias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * We can use the aliases to retrieve beans but aliases tend to be
 * used for configuration only.
 */
public class Application {

  public static void main(String[] args) {
    
    // Instantiate the application context
    
    ApplicationContext context =
      new ClassPathXmlApplicationContext("spring-beans.xml");
    
        
    KeyboardCat fatso = context.getBean("fatso", KeyboardCat.class);     
    fatso.sayHello();
    
    KeyboardCat keyboardCat = context.getBean("keyboardCat", KeyboardCat.class);     
    keyboardCat.sayHello();
    
  }
}
