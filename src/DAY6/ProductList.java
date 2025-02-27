package DAY6;

import java.util.*;

// to store details (don't get confused)
class Product {
 int id;
 String name;
 String category;
 double price;

 Product(int id, String name, String category, double price) {
     this.id = id;
     this.name = name;
     this.category = category;
     this.price = price;
 }

 void display() {
     System.out.println("ID : " + id);
     System.out.println("Name : " + name);
     System.out.println("Category : " + category);
     System.out.println("Price : Rs." + price);
     System.out.println("------------------");
 }
}

public class ProductList {
 public static void main(String[] args) {
     List<Product> productList = new ArrayList<>();
     productList.add(new Product(101, "Laptop", "Electronics", 799.99));
     productList.add(new Product(102, "Chair", "Furniture", 49.99));
     productList.add(new Product(103, "Book", "Stationery", 9.99));
  
     for (Product product : productList) {
         product.display();
     }
     
    System.out.println("Looking for a product////");
     String searchName = "Book";
     boolean found = false;
     for (Product product : productList) {
         if (product.name.equalsIgnoreCase(searchName)) {
             System.out.println("Product found:");
             product.display();
             found = true;
             break;
         }
     }
     
     if (!found) {
         System.out.println("Product not found.");
     }
 }
}
