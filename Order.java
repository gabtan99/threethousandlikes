import java.util.*;

public class Order {

  private int order_id;
  private String payment_method;
  private String order_date;
  private String shipping_address;
  private String billing_address;
  private float total_amount;
  private int user_id;

  public Order(int order_id, String payment_method, String order_date, String shipping_address, String billing_address,
      float total_amount, int user_id) {
    this.order_id = order_id;
    this.payment_method = payment_method;
    this.order_date = order_date;
    this.shipping_address = shipping_address;
    this.billing_address = billing_address;
    this.total_amount = total_amount;
    this.user_id = user_id;
  }

  /**
  * Returns value of order_id
  * @return
  */
  public int getOrder_id() {
    return order_id;
  }

  /**
  * Sets new value of order_id
  * @param
  */
  public void setOrder_id(int order_id) {
    this.order_id = order_id;
  }

  /**
  * Returns value of payment_method
  * @return
  */
  public String getPayment_method() {
    return payment_method;
  }

  /**
  * Sets new value of payment_method
  * @param
  */
  public void setPayment_method(String payment_method) {
    this.payment_method = payment_method;
  }

  /**
  * Returns value of order_date
  * @return
  */
  public String getOrder_date() {
    return order_date;
  }

  /**
  * Sets new value of order_date
  * @param
  */
  public void setOrder_date(String order_date) {
    this.order_date = order_date;
  }

  /**
  * Returns value of shipping_address
  * @return
  */
  public String getShipping_address() {
    return shipping_address;
  }

  /**
  * Sets new value of shipping_address
  * @param
  */
  public void setShipping_address(String shipping_address) {
    this.shipping_address = shipping_address;
  }

  /**
  * Returns value of billing_address
  * @return
  */
  public String getBilling_address() {
    return billing_address;
  }

  /**
  * Sets new value of billing_address
  * @param
  */
  public void setBilling_address(String billing_address) {
    this.billing_address = billing_address;
  }

  /**
  * Returns value of total_amount
  * @return
  */
  public float getTotal_amount() {
    return total_amount;
  }

  /**
  * Sets new value of total_amount
  * @param
  */
  public void setTotal_amount(float total_amount) {
    this.total_amount = total_amount;
  }

  /**
  * Returns value of user_id
  * @return
  */
  public int getUser_id() {
    return user_id;
  }

  /**
  * Sets new value of user_id
  * @param
  */
  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

}
