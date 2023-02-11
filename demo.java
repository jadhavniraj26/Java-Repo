 package com.gpm.complex;
 import java.lang.Math.*;
 import java.util.*;

  interface Complex{
  public void realPart();
  public void imgPart();
  public void magnitude();
  public void argument();
  public void plus();
  public void minus();
  public void into();
  public void divideby();
  }
 
 class Number implements Complex{
 
 int r1;
 int r2;
 int i1;
 int i2;
 double m1;
 double m2;
 double arg1;
 double arg2;
 int add1;
 int add2;
 int sub1;
 int sub2;
 double mul1;
 double mul2;
 double d1;
 double d2;

 public void realPart(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter First Real number:");
 r1 = sc.nextInt();
 System.out.println("Enter Second Real number:");
 r2 = sc.nextInt();
 }
 
 public void imgPart(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Imaginary part of 1st equation:");
 i1 = sc.nextInt();
 System.out.println("Enter Imaginary part of 2nd Equation:");
 i2 = sc.nextInt();
 }
 
 public void magnitude(){
 m1= (r1*r1 + i1*i2);
 System.out.println("Magnitude Of 1st equation: "+ Math.sqrt(m1));
 m2 = (r2*r2 + i2*i2);
 System.out.println("Magnitude of 2nd equation: "+ Math.sqrt(m2));
  }

 public void argument(){
  
 arg1 = (i1/r1);
 System.out.println("Argument of 1st equation: "+Math.atan(arg1));
 arg2 = (i2/r2);
 System.out.println("Argument of 2nd equation: "+Math.atan(arg2));
  }

 public void plus(){
  add1 = r1 + r2;
  add2 = i1 + i2;
 System.out.println(" Addition of Complex number is : "+add1 + "+" +add2 +"i"); 
 }  
 
 public void minus(){
  sub1 = r1 - r2 ;
  sub2 = i1 - i2;
 System.out.println("Subtraction Of complex number is: "+ sub1+ " " +sub2+ "i");
 }

 public void into(){
 mul1 = r1 * r2;
 mul2 = i1 * i2;
 System.out.println("Multiplication of complex number is: "+ mul1 + "+" +mul2 + "i");
 }
 
  public void divideby(){
   d1 = r1/r2;
   d2 = i1/i2;
  System.out.println("Division of complex number is: "+ d1 + "+" +d2+"i");
    }
 public static void main(String args[]){
  Number n = new Number();
  n.realPart();
  n.imgPart();
  n.magnitude();
  n.argument();
  n.plus();   
  n.minus();
  n.into();
  n.divideby();
  }
 }