/*
 * Spring Sandbox - Dependency Injection - Setter
 * 
 * DilbertRandomNumberGenerator.java
 * 
 */
package com.infinitemule.spring.container.depinject.setter;


/**
 * Generates random numbers using Dilbert's random number generator.
 * 
 * http://www.dilbert.com/strips/comic/2001-10-25/
 * 
 */
public class DilbertRandomNumberGenerator implements RandomNumberGenerator {

  @Override
  public Integer randomInteger() {
    return 9;
  }

}
