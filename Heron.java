import java.util.*;
public class Heron{

 public static void main(String[] args) {
    int x =4;

 
    double b = x, h = 0;

    while (b != h) {
        b = (h + b) / 2;
        h = x / b;
        }
    System.out.println("Square root of number is"+h);
  }
 }
  