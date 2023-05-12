/**
* A class representing a staff working at Chapman University
* @author Daniel Dinh
* @version 1.0
* @see Staff.java
* @see Fulltime.java
* @see Parttime.java
* @see Affiliate.java
*/
public abstract class Staff extends Affiliate{
  protected String m_title;
  /** A string representing the staff member's title*/
  protected String m_department;
  /** A string representing the department where the staff member works*/
  public Staff(){
    super();
    m_title = "";
    m_department = "";
  }
  /**
  *Default constructor for Staff
  */
  public Staff(String n, int a, String ad, long pn, int i, int y, String t, String b){
    super(n,a,ad,pn,i,y);
    m_title = t;
    m_department = b;
  }
  /**
  *Overloaded constructor of staff
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  *@param t String of the staff memeber's title
  *@param b String of the department name where the staff member works
  */
  public String getTitle(){
    return m_title;
  }
  /**
  *Accessor for the staff member's title
  *@return A string of the staff member's title
  */
  public String getBuilding(){
    return m_department;
  }
  /**
  *Accessor for the build where the staff member works
  *@return department name where the staff works
  */
  public void setTitle(String t){
    m_title = t;
  }
  /**
  *Mutator for staff member's title
  *@param t String of the staff member's title
  */
  public void setBuilding(String b){
    m_department = b;
  }
  /**
  *Mutator for department
  *@param b String of the department's name where the staff member works
  */
  public void print(){
    System.out.println(this);
  }
  /**
  *Print method from Printable, prints out all Attributes unique to class
  */
  public String toString(){
    String s = "";
    s+= super.toString();
    s+=", Department: "+m_department;
    s+=", Title: "+m_title;
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Staff
  */
}
