interface Mathematics_Generics<T extends Number>{
int powerOf(T t);
 }
 
class PowerOfThree<T extends Number>implements Mathematics_Generics<T>{
public int powerOf(T t){
return
i.intvalue()*i.intvalue()*i.intvalue();
 }
}
 
public class Java{
public static void main(String[] args){
PowerOfThree<double>pthree = new PowerOfThree<double>();
System.out.println("square of 5= "+ pthree.powerOf(5d));
 }
}