/*
 * Spring Sandbox - Properties - Collections
 */
package com.infinitemule.spring.container.properties.collections;

import java.awt.Color;

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
                   
    ColorPalette palette = null;
    
    palette = context.getBean("colorPalette", ColorPalette.class); 

    palette.displayList();
    palette.displaySet();
    palette.displayMap();
    
    Color c = new Color(255, 0, 0); 
    
    System.out.println(c);
  }
}
