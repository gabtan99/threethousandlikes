public class Cart {

  private int session_id;
  private int user_id;
  private int product_id;
  private int quantity;
  private int checked_out;
  private int order_id;

  public Cart() {
    
  }

	/**
	* Returns value of session_id
	* @return
	*/
	public int getSession_id() {
		return session_id;
	}

	/**
	* Sets new value of session_id
	* @param
	*/
	public void setSession_id(int session_id) {
		this.session_id = session_id;
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
	* Returns value of checked_out
	* @return
	*/
	public int getChecked_out() {
		return checked_out;
	}

	/**
	* Sets new value of checked_out
	* @param
	*/
	public void setChecked_out(int checked_out) {
		this.checked_out = checked_out;
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
}
