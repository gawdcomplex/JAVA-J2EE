package DAY6;


import java.util.ArrayList;

public class Arraylist1 {
 public static void main(String[] args) {
	
	 ArrayList<String>   list1=new ArrayList<String>();
	 list1.add("java");
	 list1.add("python");
	 ArrayList<String>   list2=new ArrayList<String>();
	 
	 list2.add("c++");
	 list2.add("c#");
	 list2.addAll(list1);
	 
	 System.out.println(list2);
 }
}