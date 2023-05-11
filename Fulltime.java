/**
* A class representing a full-time staff working at Chapman University
* @author Daniel Dinh
* @version 1.0
* @see Staff.java
* @see Fulltime.java
*/
public class Fulltime extends Staff{
  protected double m_yearlySalary;
  /** Double representing the annual wage of the staff member*/
  public Fulltime(){
    super();
    m_yearlySalary = 0;
  }
  /**
  *Default constructor of Fulltime staff member
  */
  public Fulltime(String n, int a, String ad, long pn, int i, int y, String t, String b, double ys){
    super(n,a,ad,pn,i,y,t,b);
    m_yearlySalary = ys;
  }
  /**
  *Overloaded constructor for full time staff member
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  *@param t String of the staff memeber's title
  *@param b String of the department name where the staff member works
  *@param ys Double of the staff member's annual salary
  */
  public double getYearlySalary(){
    return m_yearlySalary;
  }
  /**
  *Accessor for annual salary
  *@return Double of the staff member's annual salary
  */
  public void setYearlySalary(double ys){
    m_yearlySalary = ys;
  }
  /**
  *Mutator for annual salary
  *@param ys Double of staff member's annual salary
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
    s+=", Annual Wage: "+m_yearlySalary+"\n";
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Fulltime
  */
}
