 package com.gpm.complex; 
 import java.util.*;
 import java.lang.Math.*;

 interface Complex{
  public void realPart();
  public void imgPart();
  public void magnitude();
  public void argument();
  public void divideBy();
   }

  class PolarComplex implements Complex{
  double r;
  int r1;
  int i;
  double theta;
  
  public void realPart(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 1st Real Number: ");
  r1 = sc.nextInt();
  }
  
   public void imgPart(){
   Scanner sc = new Scanner(System.in);
  System.out.println("Enter 1st Imaginary number: ");
  i = sc.nextInt();
  }
  
  public void magnitude(){
  
  r= Math.sqrt(r1*r1 + i*i);
  System.out.println("Magnitude Of 1st equation: "+ r);
  }
 
  public void argument(){
 theta = Math.atan(i/r1);
 System.out.println("Argument theta of equation: "+theta);
 }
 
 public void divideBy(){
 System.out.println("Polar complex of given complex number: ");
 System.out.println(+r1+ "+" +i+ "i = " +r+ "(cos(" +theta+ ") + i(sin" +theta+ ")");
  }

  public static void main(String args[]){
  PolarComplex p = new PolarComplex();
  p.realPart();
  p.imgPart();
  p.magnitude();
  p.argument();
  p.divideBy();
  }
 }