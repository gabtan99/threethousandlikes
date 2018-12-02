public class ProductCart {

  private int product_id;
  private String brand_name;
  private String product_name;
  private int quantity;
  private float price;
  private float subtotal;

  public ProductCart(int product_id, String brand_name, String product_name, int quantity, float price,
      float subtotal) {
    this.product_id = product_id;
    this.brand_name = brand_name;
    this.product_name = product_name;
    this.quantity = quantity;
    this.price = price;
    this.subtotal = subtotal;
  }

  /**
  * Returns value of product_id
  * @return
  */
  public int getProduct_id() {
    return product_id;
  }

  /**
  * Sets new value of product_id
  * @param
  */
  public void setProduct_id(int product_id) {
    this.product_id = product_id;
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

  /**
  * Returns value of subtotal
  * @return
  */
  public float getSubtotal() {
    return subtotal;
  }

  /**
  * Sets new value of subtotal
  * @param
  */
  public void setSubtotal(float subtotal) {
    this.subtotal = subtotal;
  }

}
