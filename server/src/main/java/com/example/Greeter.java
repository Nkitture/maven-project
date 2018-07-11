package com.example;

/**
 * This is a class of java.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/** 
    @param someone name of person
    @return returning the greetings
**/
  
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
