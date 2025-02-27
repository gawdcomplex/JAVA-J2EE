package DAY6;

import java.util.*;

public class StackExample {

 public static void main(String[] args)
 {

     
     Stack<String> stack1 = new Stack<String>();
     Stack<String> stack2 = new Stack<String>();
     
     stack1.push("4");
     stack1.push("All");
     stack1.push("Cricketers");

     stack2.push("Champions");
     stack2.push("Trophy");
     stack2.push("2025");

     
     System.out.println(stack1);
     System.out.println(stack2);
 }
}
