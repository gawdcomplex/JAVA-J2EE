package Constructors;

class Constchain {
    String name,rollno;
    static String orgname;
    
    public static void main(String[] args) {
    	Constchain s1=new Constchain("Sparsh","15");
    s1.display();
    }
    
    Constchain(  String name,String rollno)// prameterized constructor
    {
      this();  // constructor chaining
      this.name=name;
      this.rollno=rollno;
    }
    
    
    Constchain() // no /default const
    {
     orgname="Wipro";
    }
    
    void display()
    {
        System.out.println(name+" "+rollno+" "+orgname);
    }
    
}