/**
* A class representing anyone affiliated with Chapman University
* @author Daniel Dinh
* @version 1.0
* @see Faculty.java
* @see Student.java
* @see Staff.java
* @see Affiliate.java
*/
public abstract class Affiliate implements Comparable<Affiliate>,Printable {
  protected String m_name;
  /**A string representing the person's name*/
  protected int m_age;
  /**A int representing the person's age*/
  protected String m_address;
  /**A string representing the person's address*/
  protected long m_phoneNumber;
  /**A int representing the person's phone number*/
  protected int m_id;
  /**A integer representing the person's id*/
  protected int m_yearCame;
  /**A interger representing the year the person was first hired or enrolled at Chapman */

  public Affiliate(){
    m_name = "";
    m_age = 0;
    m_address = "";
    m_phoneNumber = 0;
    m_id = 0;
    m_yearCame = 0;
  }
  /**
  *The default constructor for Affiliates
  */

  public Affiliate(String n, int a, String ad, long pn, int i, int y){
    m_name = n;
    m_age = a;
    m_address = ad;
    m_phoneNumber = pn;
    m_id = i;
    m_yearCame = y;
  }
  /**
  *The overloaded constructor for Affiliates
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  */
  public String getName(){
    return m_name;
  }
  /**
  *The accessor for m_name
  *@return A string of the person's name
  */
  public int getAge(){
    return m_age;
  }
  /**
  *The accessor for m_age
  *@return A int of the the person's age
  */
  public String getAddress(){
    return m_address;
  }
  /**
  *The accessor for m_address
  *@return A string of the person's address
  */
  public long getPhoneNumber(){
    return m_phoneNumber;
  }
  /**
  *The accessor for m_phoneNumber
  *@return A long of the person's phone number
  */
  public int getId(){
    return m_id;
  }
  /**
  *The accessor for m_id
  *@return A int of the person's id number
  */
  public int getYear(){
    return m_yearCame;
  }
  /**
  *The accessor for m_yearCame
  *@return A int of the year the person first came to Chapman
  */
  public void setName(String s){
    m_name = s;
  }
  /**
  *Mutator for name
  *@param s String representing the person's name
  */
  public void setAge(int a){
    m_age = a;
  }
  /**
  *Mutator for age
  *@param a Integer representing the person's age
  */
  public void setAddress(String a){
    m_address = a;
  }
  /**
  *Mutator for address
  *@param a String representing the person's address
  */
  public void setPhoneNumber(long p){
    m_phoneNumber = p;
  }
  /**
  *Mutator for Phone number
  *@param p Long representing the person's phone number
  */
  public void setID(int i){
    m_id = i;
  }
  /**
  *Mutator for ID
  *@param i Integer representing the person's ID number
  */
  public void setYear(int y){
    m_yearCame = y;
  }
  /**
  *Mutator for First year
  *@param y Integer of the first year the person was affiliated with Chapman
  */
  public int compareTo(Affiliate a){
    int r = 0;
    if(a.m_yearCame > this.m_yearCame){
      r = 1;
    }
    else if(a.m_yearCame < this.m_yearCame){
      r = -1;
    }
    return r;
  }
  /**
  *The compare method takes a person and compares them to another based on how many years they've been affiliated with Chapman
  *@param a An affilate object representing a single person who is affiliated with Chapman
  *@return An integer: 1 for greater than the object, 0 for equals, and -1 for less than the object
  */
  public void print(){
    System.out.println(this);
  }
  /**
  *Print method from Printable, prints out all Attributes unique to class
  */
  public String toString(){
    String s = "\n";
    s+="Address: "+m_address;
    s+=", Age: "+m_age;
    s+=", ID Number: "+m_id;
    s+=", Name: "+ m_name;
    s+=", Phone Number: "+m_phoneNumber;
    s+=", Year Began: "+m_yearCame;
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Affiliate
  */
}
