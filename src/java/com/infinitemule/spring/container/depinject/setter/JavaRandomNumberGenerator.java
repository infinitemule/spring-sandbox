/*
 * Spring Sandbox - Dependency Injection - Setter
 * 
 * JavaRandomNumberGenerator.java
 * 
 */
package com.infinitemule.spring.container.depinject.setter;

import java.util.Random;


/**
 * Generates a random number using Java's default implementation.
 * 
 */
public class JavaRandomNumberGenerator implements RandomNumberGenerator {

  @Override
  public Integer randomInteger() {
    return Math.abs(new Random().nextInt());
  }
    
}
