 
package com.mycompany.classeswithattributess;

public class ClassesWithAttributess {

    public static void main(String[] args) {
        Product product=new Product(1,"laptop","asus laptop",5000,3,"siyah");  
          
         
        
        
        ProductManager productManager= new ProductManager();
        productManager.Add(product);
        
        System.out.println(product.getKod());
    }
}
