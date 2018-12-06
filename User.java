public class User {

  private int user_id;
  private String email;
  private String password;
  private String first_name;
  private String last_name;
  private String contact_number;
  private String gender;
  private String register_date;

  public User(int user_id, String email, String password, String first_name, String last_name, String contact_number,
      String gender, String register_date) {
    this.user_id = user_id;
    this.email = email;
    this.password = password;
    this.first_name = first_name;
    this.last_name = last_name;
    this.contact_number = contact_number;
    this.gender = gender;
    this.register_date = register_date;
  }

  public User() {
    int user_id = 0;
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
  * Returns value of password
  * @return
  */
  public String getPassword() {
    return password;
  }

  /**
  * Sets new value of password
  * @param
  */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
  * Returns value of first_name
  * @return
  */
  public String getFirst_name() {
    return first_name;
  }

  /**
  * Sets new value of first_name
  * @param
  */
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  /**
  * Returns value of last_name
  * @return
  */
  public String getLast_name() {
    return last_name;
  }

  /**
  * Sets new value of last_name
  * @param
  */
  public void setLast_name(String last_name) {
    this.last_name = last_name;
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

  /**
  * Returns value of gender
  * @return
  */
  public String getGender() {
    return gender;
  }

  /**
  * Sets new value of gender
  * @param
  */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
  * Returns value of register_date
  * @return
  */
  public String getRegister_date() {
    return register_date;
  }

  /**
  * Sets new value of register_date
  * @param
  */
  public void setRegister_date(String register_date) {
    this.register_date = register_date;
  }

}
