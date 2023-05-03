package ProductPackage;

public class Products {
    
    private String productName;
    private float price;

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

	public Product(String productName, float price, String description, String image) {
		super();
		this.productName = productName;
		this.price = price;
		
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
      
}