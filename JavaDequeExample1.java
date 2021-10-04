import java.util.ArrayDeque;  
import java.util.Deque;  
  
public class JavaDequeExample1 {  
  public static void main(String[] args) {  
    Deque<Integer> deque = new ArrayDeque<Integer>();  
    
    deque.add(5);  
    deque.add(6);  
    deque.add(7);  
    System.out.println("Inserting three elements : ");  
    for (Integer integer : deque) {  
    System.out.println(integer);      
    }  
    
    deque.pop();  
    System.out.println("After popping : ");  
    for (Integer integer : deque) {  
        System.out.println(integer);  
    }  
    deque.remove(7);  
    System.out.println("Removing the element 7 :"+deque);  
  }  
}  