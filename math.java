package com.gpm.complex; 
 import java.util.*;
 import java.lang.Math.*;

 interface Complex{
  public void realPart();
  public void imgPart();
  public void magnitude();
  public void plus();
  public void minus();
  public void into();
  public void divideBy();
   }
 
 class CartesianComplex implements Complex{
 int r1;
 int i1;
 
 public void realPart(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 1st Real Number: ");
 r1 = sc.nextInt();
  }
 
 public void imgPart(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 1st Imaginary number: ");
 i1 = sc.nextInt();
    }
   }
    class PolarComplex implements Complex{
  double r;
  double theta;
  
  public void magnitude(){
  
  r= Math.sqrt(r1*r1 + i1*i1);
  System.out.println("Magnitude Of 1st equation: "+ r);
  }
 
  public void argument(){
 theta = Math.atan(i1/r1);
 System.out.println("Argument theta of equation: "+theta);
 }
 
 public String toString(){
 System.out.println("Polar complex of given complex number: ");
 System.out.println(+r1+ "+" +i+ "i = " +r+ "(cos(" +theta+ ") + i(sin" +theta+ ")");
  }
  }
  class math{
  public static void main(String args[]){

  CartesianComplex c = new CartesianComplex();

  c.realPart();
  c.imgPart();

   PolarComplex p = new PolarComplex();
  p.realPart();
  p.imgPart();
  p.magnitude();
  p.argument();
  p.divideBy();
  }
 }  
 