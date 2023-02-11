import java.lang.*;
import java.util.*;
class Generics<T>
{
 T obj;
 Generics (T obj){
 this.obj = obj;
 }
 public T getObject(){
 return this.obj;
  } 
 }
 
class Generic1
{
 public static void main(String[] args){
 Generics<Integer>iObj = new Generics<Integer>(2565);
 System.out.println(iObj.getObject());
 Generics<String>sObj = new Generics<String>("Generics Program");
 System.out.println(sObj.getObject());
  }
 }
