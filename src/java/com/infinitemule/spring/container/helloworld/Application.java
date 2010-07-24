/*
 * Spring Sandbox - Hello World
 */

package com.infinitemule.spring.container.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * The simplest Spring example.  I am using the class path context
 * because it's very easy to use, just place your XML config file
 * somewhere in your classpath and Spring will find it for you.
 * 
 */
public class Application {

  public static void main(String[] args) {
    
    // Instantiate the application context
    
    ApplicationContext context =
      new ClassPathXmlApplicationContext("spring-beans.xml");
    
    
    // Here we just ask the container for the bean by its ID
    
    Greeter greeter = context.getBean("greeter", Greeter.class);
 
    System.out.println(greeter.sayHello("Jackass"));
    
    
    // You might saying to yourself "That was buttload of work just
    // to create a new instance of a class."  It was, but once you
    // start to see more complicated examples, you'll fully understand
    // why you would want to use Spring for configuring and instantiating
    // your application.
    
  }
}
