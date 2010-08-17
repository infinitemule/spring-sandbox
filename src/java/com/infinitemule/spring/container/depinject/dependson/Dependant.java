/*
 * 
 */
package com.infinitemule.spring.container.depinject.dependson;

/**
 * 
 */
public class Dependant {

  private InitMeFirst meFirst;
  private InitMeSecond meSecond;
  
  public Dependant() {
    System.out.println("*** Initializing Dependant ***");
  }

  public InitMeFirst getMeFirst() {
    return meFirst;
  }

  public void setMeFirst(InitMeFirst meFirst) {
    this.meFirst = meFirst;
  }

  public InitMeSecond getMeSecond() {
    return meSecond;
  }

  public void setMeSecond(InitMeSecond meSecond) {
    this.meSecond = meSecond;
  }
    
}
