/*
 * Spring Sandbox - Properties - Populating
 * 
 * Unicorn.java
 * 
 */
package com.infinitemule.spring.container.properties.populating;


/**
 * Just a simple JavaBean for demonstrating how to populate
 * properties during instantiation.
 *  
 */
public class Unicorn {

  private String firstName;
  private String lastName;
  
  private Integer age; 
  private Float   hornLength;
  
  private Boolean isForSale;

  public Unicorn() {
    
  }
  
  public Unicorn(String firstName, String lastName,
                 Integer age, Float hornLength, 
                 Boolean isForSale) {
    
    setFirstName(firstName);
    setLastName(lastName);
    setAge(age);
    setHornLength(hornLength);
    setIsForSale(isForSale);
    
  }
  
  
  public void display() {
    System.out.printf("First Name:  %s\n", getFirstName());
    System.out.printf("Last Name:   %s\n", getLastName());
    System.out.printf("Age:         %s\n", getAge());
    System.out.printf("Horn Length: %s\n", getHornLength());
    System.out.printf("For Sale:    %s\n", getIsForSale());
    System.out.println("\n");
  }
  
  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Float getHornLength() {
    return hornLength;
  }

  public void setHornLength(Float hornLength) {
    this.hornLength = hornLength;
  }

  public Boolean getIsForSale() {
    return isForSale;
  }

  public void setIsForSale(Boolean isForSale) {
    this.isForSale = isForSale;
  }
      
}
