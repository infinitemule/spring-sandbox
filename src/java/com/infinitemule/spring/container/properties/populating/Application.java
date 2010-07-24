/*
 * Spring Sandbox - Properties - Populating
 */
package com.infinitemule.spring.container.properties.populating;

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
    
    
    // Each bean will have it's properties set by the container in three
    // different ways.
            
    Unicorn unicorn = null;
    
    // Bean 1: Using setters
    
    unicorn = context.getBean("unicornSetters", Unicorn.class); 
    unicorn.display();

    
    // Bean 2: Using the constructor
    
    unicorn = context.getBean("unicornConstructor", Unicorn.class); 
    unicorn.display();

    
    // Bean 3: Loading properties from a file
    
    unicorn = context.getBean("unicornPropFile", Unicorn.class); 
    unicorn.display();

    
    // You'll notice that the code is exactly the same for all
    // three.  You can change the way in which your beans receive 
    // properties and your code will not change or have to be
    // recompiled.  You rarely, if ever, have to change the  
    // way in which you supply properties to your beans but it's 
    // one example of how you can alter your application initialization and
    // configuration without changing your code.
    
  }
}
