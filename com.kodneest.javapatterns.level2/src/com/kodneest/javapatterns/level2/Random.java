package com.kodneest.javapatterns.level2;
import java.util.Random;

public class Random 
{
  public static void main( String args[] ) {
	    Random random = new Random();
	    System.out.println("A random int: " + random.nextInt());  
	    System.out.println("A random int from 0 to 49: "+ random.nextInt(50));
	    System.out.println("A random double: "+ random.nextDouble()); 
	    System.out.println("A random float: "+ random.nextFloat());
	    System.out.println("A random long: "+ random.nextLong());  
	  }
	