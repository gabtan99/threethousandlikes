public class Cart {

  private String brand_name;
  private String product_name;
  private int quantity;
  private float price;

  public Cart(String brand_name, String product_name, int quantity, float price) {
    this.brand_name=brand_name;
    this.product_name = product_name;
    this.quantity=quantity;
    this.price = price;
  }




	/**
	* Returns value of brand_name
	* @return
	*/
	public String getBrand_name() {
		return brand_name;
	}

	/**
	* Sets new value of brand_name
	* @param
	*/
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	/**
	* Returns value of product_name
	* @return
	*/
	public String getProduct_name() {
		return product_name;
	}

	/**
	* Sets new value of product_name
	* @param
	*/
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	* Returns value of quantity
	* @return
	*/
	public int getQuantity() {
		return quantity;
	}

	/**
	* Sets new value of quantity
	* @param
	*/
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	* Returns value of price
	* @return
	*/
	public float getPrice() {
		return price;
	}

	/**
	* Sets new value of price
	* @param
	*/
	public void setPrice(float price) {
		this.price = price;
	}
}
