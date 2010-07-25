/*
 * Spring Sandbox - Instantiate
 * 
 * Puppy.java
 * 
 */
package com.infinitemule.spring.container.instantiate;


/**
 * Simple class that has a static factory method with which
 * Spring can use to instantiate our objects.
 */
public class Puppy {

  private String bredFrom;
      
  public Puppy() {
    this("Constructor");
  }
  
  public Puppy(String bredFrom) {
    setBredFrom(bredFrom);
  }

  
  
  /**
   * Static initializer
   */
  public static Puppy createPuppy() {
    return new Puppy("Static Initializer");
  }


  
  /*
   * Properties
   */
  
  public String getBredFrom() {
    return bredFrom;
  }

  public void setBredFrom(String bredFrom) {
    this.bredFrom = bredFrom;
  }
  
}
