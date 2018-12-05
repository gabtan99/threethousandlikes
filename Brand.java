public class Brand {

  private int brand_id;
  private String brand_name;
  private String address;
  private String email;
  private String contact_number;

  public Brand(int brand_id, String brand_name, String address, String email, String contact_number) {
    this.brand_id = brand_id;
    this.brand_name = brand_name;
    this.address = address;
    this.email = email;
    this.contact_number = contact_number;
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
  * Returns value of address
  * @return
  */
  public String getAddress() {
    return address;
  }

  /**
  * Sets new value of address
  * @param
  */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
  * Returns value of email
  * @return
  */
  public String getEmail() {
    return email;
  }

  /**
  * Sets new value of email
  * @param
  */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
  * Returns value of contact_number
  * @return
  */
  public String getContact_number() {
    return contact_number;
  }

  /**
  * Sets new value of contact_number
  * @param
  */
  public void setContact_number(String contact_number) {
    this.contact_number = contact_number;
  }
}
