/*
 * 
 */
package com.infinitemule.spring.container.instantiate;

public class PuppyLocator {

  public Puppy locatePuppy() {
    return new Puppy("Separate Factory Class");
  }
}
