/*
 * Spring Sandbox - Properties - Collections
 */
package com.infinitemule.spring.container.properties.collections;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 */
public class ColorPalette {

  private List<Color>         colorList = new ArrayList<Color>();
  private Set<String>         colorSet  = new HashSet<String>();
  private Map<String, String> colorMap  = new HashMap<String, String>();
  
  
  public ColorPalette() {
    
  }
  
  
  public void displayList() {
    
    System.out.println("COLOR LIST");
    for(Color color : getColorList()) {
      System.out.println(color);
    }
    System.out.println();

  }

  
  public void displaySet() {
    
    System.out.println("COLOR SET");
    for(String color : getColorSet()) {
      System.out.println(color);
    }
    System.out.println();

  }

  
  public void displayMap() {
    
    System.out.println("COLOR MAP");
    for(String colorName : getColorMap().keySet()) {
      String colorValue = getColorMap().get(colorName);
      System.out.printf("%s\t%s\n", colorName, colorValue);
    }
    System.out.println();

  }
  
  
  
  

  public List<Color> getColorList() {
    return colorList;
  }


  public void setColorList(List<Color> colorList) {
    this.colorList = colorList;
  }


  public Set<String> getColorSet() {
    return colorSet;
  }


  public void setColorSet(Set<String> colorSet) {
    this.colorSet = colorSet;
  }


  public Map<String, String> getColorMap() {
    return colorMap;
  }


  public void setColorMap(Map<String, String> colorMap) {
    this.colorMap = colorMap;
  }
    
}
