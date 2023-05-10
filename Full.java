/**
* A class representing a Full Professor hired at Chapman
* @author Daniel Dinh
* @version 1.0
* @see Faculty.java
* @see Full.java
*/

public class Full extends Faculty{
  protected int m_yearsBeforeRetirement;
  /**Integer representing the number of years left until the professors tenure*/

  public Full(){
    super();
    m_yearsBeforeRetirement = 0;
  }
  /**
  *Default constructor of Full Professor
  */
  public Full(String n, int a, String ad, long pn, int i, int y, String d, double s, int np, int yr){
    super(n,a,ad,pn,i,y,d,s,np);
    m_yearsBeforeRetirement = yr;
  }
  /**
  *Overloaded constructor for Full Professor
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  *@param d String representing the professor's department
  *@param s Double representing the professor's annual salary
  *@param np Integer represnting the number of papers the professor has published
  *@param yr Integer representing the years until the Full Professor retires
  */
  public int getYearsBeforeRetirement(){
    return m_yearsBeforeRetirement;
  }
  /**
  *Accessor for Years until completion of Tenure
  *@return A int of the years until retirement
  */
  public void setYearsBeforeRetirement(int yr){
    m_yearsBeforeRetirement = yr;
  }
  /**
  *Mutator for m_yearsBeforeRetirement
  *@param yr Integer representing the years until retirement
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
    s+=", Years until Retirement: "+m_yearsBeforeRetirement+"\n";
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Full
  */
}
