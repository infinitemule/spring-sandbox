/*
 * 
 */
package com.infinitemule.spring.container.instantiate;

/**
 * 
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

  public String getBredFrom() {
    return bredFrom;
  }

  public void setBredFrom(String bredFrom) {
    this.bredFrom = bredFrom;
  }
  
}
