import java.util.*;
class Test<T,U>
{
 T obj1;
 U obj2;
 Test (T obj1, U obj2)
{
 this.obj1 = obj1;
 this.obj2 = obj2; 
 }
public void print()
{
 System.out.println("Roll no. "+obj1);
 System.out.println("Name " +obj2);
  }
 }
 class Main
{
 public static void main(String[] args)
 {
 Test<Integer,String>obj = new Test<Integer,String>(2565,"Multiple Parameter");
 obj.print();
    }
  }


