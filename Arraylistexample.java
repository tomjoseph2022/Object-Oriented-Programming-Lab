import java.util.*;  
class Arraylistexample{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("anu");
      alist.add("aju");
      alist.add("cijo");
      alist.add("dijo");
      alist.add("ejo");
      alist.add("dijo");
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");
  
      //displaying elements
      System.out.println(alist);
   }  
}