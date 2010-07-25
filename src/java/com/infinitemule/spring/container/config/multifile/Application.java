/*
 * Spring Sandbox - Config - Multifile
 */

package com.infinitemule.spring.container.config.multifile;

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
    
    //MainFile mainFile = context.getBean("mainFile", MainFile.class);
    
  }
}
