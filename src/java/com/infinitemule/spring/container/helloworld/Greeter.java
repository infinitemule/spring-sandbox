/*
 * Spring Sandbox - Hello World
 * 
 * Greeter.java
 *  
 */
package com.infinitemule.spring.container.helloworld;


/**
 * Simple class that just outputs "Hello" and the specified
 * name.  
 */
public class Greeter {

  public String sayHello(String name) {    
    return String.format("Hello %s!", name);    
  }
  
}
