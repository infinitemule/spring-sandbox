/*
 * 
 */
package com.infinitemule.spring.container.depinject.constructor;


/**
 * 
 */
public class Person {

  private String firstName;
  private String lastName;
  private Integer age;
  private Pet dog;
  private Pet cat;
  
  public Person() {
    
  }
  
  
  public Person(String firstName, String lastName, Integer age, 
                Pet dog, Pet cat) {
    
    setFirstName(firstName);
    setLastName(lastName);
    setAge(age);
    setDog(dog);
    setCat(cat);
    
  }
  
  
  public void display() {    
    
    System.out.printf("First Name: %s\n", getFirstName());
    System.out.printf("Last Name:  %s\n", getLastName());
    System.out.printf("Age:        %s\n", getAge());
    System.out.printf("Dog:        %s\n", getDog().getName());
    System.out.printf("Cat:        %s\n", getCat().getName());
    System.out.println("");
    
  }
  
  
  /*
   * 
   */
  
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
  
  
  public Pet getDog() {
    return dog;
  }
  
  
  public void setDog(Pet dog) {
    this.dog = dog;
  }
  
  
  public Pet getCat() {
    return cat;
  }
  
  
  public void setCat(Pet cat) {
    this.cat = cat;
  }
  
}
