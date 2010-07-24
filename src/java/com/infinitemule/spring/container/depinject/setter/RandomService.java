/*
 * Spring Sandbox - Dependency Injection - Setter
 * 
 * RandomService.java
 * 
 */
package com.infinitemule.spring.container.depinject.setter;

/**
 * Random service ... is random 
 */
public class RandomService {

  // This is the property that will inject into using Spring
  
  private RandomNumberGenerator randomNumberGenerator = null;
    
  public RandomNumberGenerator getRandomNumberGenerator() {
    return randomNumberGenerator;
  }

  public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
    this.randomNumberGenerator = randomNumberGenerator;
  }


  
  /*
   * The method that delegates to our number generator  
   */

  public Integer randomInteger() {
    return randomNumberGenerator.randomInteger();
  }
  
  
  /*
   * Other methods our random service might have
   */
  
  public String randomColor() {
    return null;
  }
  
  public String randomWord() {
    return null;
  }
  
}
