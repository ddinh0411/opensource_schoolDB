/**
* A class representing a full-time staff working at Chapman University
* @author Daniel Dinh
* @version 1.0
* @see Staff.java
* @see Parttime.java
*/
public class Parttime extends Staff{
  protected double m_hourlySalary;
  /** Double representing the hourly wage of the staff member*/
  public Parttime(){
    super();
    m_hourlySalary = 0;
  }
  /**
  *Default constructor of Parttime staff member
  */
  public Parttime(String n, int a, String ad, long pn, int i, int y, String t, String b, double hs){
    super(n,a,ad,pn,i,y,t,b);
    m_hourlySalary = hs;
  }
  /**
  *Overloaded constructor for part time staff member
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  *@param t String of the staff memeber's title
  *@param b String of the building name where the staff member works
  *@param hs Double of the staff member's hourly salary
  */
  public double getHourlySalary(){
    return m_hourlySalary;
  }
  /**
  *Accessor for hourly salary
  *@return Double of the staff member's hourly salary
  */
  public void setHourlySalary(double hs){
    m_hourlySalary = hs;
  }
  /**
  *Mutator for hourly salary
  *@param hs Double of staff member's hourly salary
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
    s+=", Hourly Wage: "+m_hourlySalary+"\n";
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Parttime
  */
}
