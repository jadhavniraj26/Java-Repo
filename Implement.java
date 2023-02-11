 package com.gpm.complex;

 import java.util.*;
 import java.lang.Math.*;
 
 class CartesianComplex implements Complex{
 int r1;
 int r2;
 int i1;
 int i2;
 int m1;
 int m2;
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
 System.out.println("Enter 1st Real Number: ");
 r1 = sc.nextInt();
 System.out.println("Enter 2nd Real number: ");
 r2 = sc.nextInt();
  }
 
 public void imgPart(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 1st Imaginary number: ");
 i1 = sc.nextInt();
 System.out.println("Enter 2nd Imaginary number: ");
 i2 = sc.nextInt();
  }
 
  public void magnitude(){
  m1= (r1*r1 + i1*i1);
  System.out.println("Magnitude Of 1st equation: "+ Math.sqrt(m1));
  m2 = (r2*r2 + i2*i2);
  System.out.println("Magnitude of 2nd equation: "+ Math.sqrt(m2));
   }
  
  public void argument(){
  System.out.println("1st complex number: " +m1+ "=" +r1+ "+" +i1+ "i");
  System.out.println("2nd complex number: " +m2+ "=" +r2+ "+" +i2+ "ii");
  }
  
  public void plus(){
  add1 = (m1 + m2);
  add2 = (r1+r2) + (i1+i2);
 System.out.println(" Addition of Complex number is : "+add1 + "+" +add2 +"i"); 
 }  
 
 public void minus(){
  sub1 = m1 - m2;
  sub2 = (r1-r2)-(i1 - i2);
 System.out.println("Subtraction Of complex number is: "+ sub1+ " " +sub2+ "i");
 }

 public void into(){
 mul1 = ((r1*r2)-(r1*i2)) + ((i1*r2)+(i1*i2));
 mul2 = m1*m2;
 System.out.println("Multiplication of complex number is: "+ mul2 + "+" +mul1 + "i");
 }
 
  public void divideBy(){
   d1 = (((r1*r2)+(i1*i2))/(r2*r2 + i2*i2)) + (((i1*r2)+(r1*i2))/(r2*r2 + i2*i2));
   d2 = m1/m2;
  System.out.println("Division of complex number is: "+ d2 + "+" +d1+"i");
    }
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
  
  public void into(){
  System.out.println("complex number: "+r1+ "+" +i+ "i");
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
 }
  class Implement{
  public static void main(String args[]){
  
  CartesianComplex c = new CartesianComplex();
  PolarComplex p = new PolarComplex();
  
  c.realPart();
  c.imgPart();
  c.argument();
  c.plus();
  c.into();

  p.realPart();
  p.imgPart();
  p.magnitude();
  p.argument();
  p.divideBy();
  }
 }