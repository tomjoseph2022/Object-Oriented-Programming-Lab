import java.util.LinkedList;
import java.util.ListIterator;
  
public class LinkedListClear {
  
  public static void main(String[] args) {
  
    
    LinkedList linkedList = new LinkedList();
    linkedList.add("7");
    linkedList.add("8");
    linkedList.add("9");
    linkedList.add("10");
    linkedList.add("11");
    linkedList.add("12");

  
    System.out.println("LinkedList size before removing elements : " + linkedList.size());
 
   
    linkedList.clear();
 
    System.out.println("LinkedList size after removing elements : " + linkedList.size());
  }
}
