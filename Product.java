public class Product {
  private int product_id;
  private String product_name;
  private int brand_id;
  private float price;
  private String classification;
  private String apparel_type;

  public Product(int product_id, String product_name, int brand_id, float price, String classification,
      String apparel_type) {
    this.product_id = product_id;
    this.product_name = product_name;
    this.brand_id = brand_id;
    this.price = price;
    this.classification = classification;
    this.apparel_type = apparel_type;
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
  * Returns value of brand_id
  * @return
  */
  public int getBrand_id() {
    return brand_id;
  }

  /**
  * Sets new value of brand_id
  * @param
  */
  public void setBrand_id(int brand_id) {
    this.brand_id = brand_id;
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
  public void setPrice(int price) {
    this.price = price;
  }

  /**
  * Returns value of apparel_type
  * @return
  */
  public String getApparel_type() {
    return apparel_type;
  }

  /**
  * Sets new value of apparel_type
  * @param
  */
  public void setApparel_type(String apparel_type) {
    this.apparel_type = apparel_type;
  }
}
