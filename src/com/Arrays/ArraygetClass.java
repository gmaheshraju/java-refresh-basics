package com.Arrays;

public class ArraygetClass {
	
	public static void main(String args[])  
    { 
        int intArray[] = new int[3]; 
        byte byteArray[] = new byte[3]; 
        short shortsArray[] = new short[3]; 
          
        // array of Strings 
        String[] strArray = new String[3]; 
          
        System.out.println(intArray.getClass()); 
        System.out.println(intArray.getClass().getSuperclass()); 
        System.out.println(byteArray.getClass()); 
        System.out.println(shortsArray.getClass()); 
        System.out.println(strArray.getClass()); 
        
        //clone and length methods are useful
        
    } 

}