package ProductPackage;

import java.util.*;
import java.AdminPackage.Admin.java;

class Product {
  
    private int m_prodID;
    private String m_prodName;
    
    Product() 
	{
		m_prodID = -1;		
		m_prodName = "";
	}
	Product(int newID, String newName)
	{
		m_prodID = newID;
		m_prodName = newName;
	}

    public int getID()  {
		return m_prodID;
	}
	public String getName() {
		return m_prodName;
	}
	public String getPrice() {
		return prod_Price;
	}
	public void setPrice(int price) {
		prod_Price = price;
	}
	public void setID(int newID) {
		m_prodID = newID;
	}
	public void setName(String newName) {
		m_prodName = newName;
	}

    public void PrintValues() {
		System.out.println(m_prodID + " " + m_prodName);
	}

	public boolean equals(Object otherProduct)
	{
		Product p = (Product) otherProduct;
		return (this.m_prodName == p.m_prodName);
	}
    
  }



public class Products {
    private Vector Prods;
	public List<Product> Prods = new ArrayList<>();
	public Products(){
		Prods = new Vector();
	}

	public void AddProduct(int newID, String newName){
		int i;
		Product p;
		
		// Find new position to add element to keep it in
		// sorted order by ID
		for (i=0; i < Prods.size(); i++) {
			p = (Product) Prods.elementAt(i);
			if (p.GetID() > newID) {
				break;	// insert at position i
			}
		}

		if (i==Prods.size()) {
			Prods.addElement(new Product(newID, newName));
		}
		else {
			Prods.insertElementAt(new Product(newID, newName), i);
		}
	}

	public void DeleteProduct(int targetID)
	{
		int i;
		
		i = Prods.indexOf(new Product(targetID,""));
		if (i<0) return;		// Not found
		Prods.removeElementAt(i);	// Remove found element
	}

    public void getPrice(){
        return getPrice;
    }

	public boolean searchItem(String name)
	{

        boolean present = false;
	
	    //return present;

        for (Product p : Prods) {
            if (p.getName().toLowerCase().compareTo(name.toLowerCase())) {
                //System.out.println("Found: " + str);
                present = true;
            }
        }

        return present;
	}

	public void viewProducts()
	{	
		Prods = getProductList();
		Product p;
		for (int i=0; i<Prods.size(); i++) {
			p = (Product) Prods.elementAt(i);
			p.PrintValues();
		}
	}

	public static void main(String[] args)
	{
		// String s;
		// Products p = new Products();

		// p.AddProduct(01, "Biscuit");
		// p.AddProduct(02, "Chocolate");
		// p.AddProduct(03, "Fruit");
		// p.AddProduct(04, "Juice");

		// p.viewProducts();	

        // boolean m = true;
        
		// m = p.equals("icecream");
		// if(m){
        //     System.out.println("Item is present");	
        // }
        // else{
        //     System.out.println("Item is not present");	
        // }

		// m = p.equals("biscuit");
		// if(m){
        //     System.out.println("Item is present");	
        // }
        // else{
        //     System.out.println("Item is not present");	
        // }

		// p.DeleteProduct(02);
		// p.viewProducts();	
	}
}
