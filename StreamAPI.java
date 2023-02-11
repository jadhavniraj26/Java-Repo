import java.util.Collection;
import java.util.function.Predicate;
import java.util.*;

public class Counter {
    public static <T> long countIf(Collection<T> collection, Predicate <T> predicate)
     {
        return collection.stream().filter(predicate).count();
    }
    
}

public class Behaviour {
    public static boolean isEvenNumber(int num)
    {
        return num%2 == 0;
    }
    
    public static boolean isOddNumber(int num)
    {
        return num%2 != 0;
    }
    
    public static boolean isPrimeNumber(int num)
    {
        if(num == 0 || num == 1)
        {
            return false;
        }
        for(int i=2; i*i <= num; i++)
        {
            if(num%i == 0)
                return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(String word)
    {
        for(int i=0; i<word.length()/2; i++)
        {
            if(word.charAt(i) != word.charAt(word.length() -1 -i))
            {
                return false;
            }
        }
        return true;
    }
}

public class Test {

   //Counting odd numbers 
    public long testCountOddNos(List<Integer> list)
    {
        System.out.println("Counting odd numbers :");
        long noOfOdd = Counter.countIf(list, Behaviour::isOddNumber);
         
        return noOfOdd;
    }    
    
    //Counting even numbers
    public long testCountEvenNos(List<Integer> list)
    {
      System.out.println("Counting even numbers :");
      long noOfEven = Counter.countIf(list, Behaviour::isEvenNumber);
      return noOfEven;
    }
    
    //Counting Prime numbers
    public long testCountPrimeNos(List<Integer> list)
    {
        System.out.println("Counting prime numbers : ");
        long noOfPrime = Counter.countIf(list, Behaviour::isPrimeNumber);
        
        return noOfPrime;
    }
    
    //Counting Palindromes 
    public long testCountingPalindromes(List<String> list) {
        System.out.println("Counting Palindromes : ");
        long noOfPalindromes = Counter.countIf(list, Behaviour::isPalindrome);
      
       return noOfPalindromes;
    }

}

public class StreamApi
{        
    public static void main(String[] args) {
    Test t = new Test();
    
    List<Integer> alist = Arrays.asList(1,2,3,4,7,5,9,11,34,567,8);
   
    
    System.out.println("Integer list : " +alist);
    System.out.println(t.testCountOddNos(alist));
    System.out.println(t.testCountEvenNos(alist));
    System.out.println(t.testCountPrimeNos(alist));
    System.out.println(t.testCountingPalindromes(slist));
            
}
}