/**
* A class representing a Associate Professor hired at Chapman
* @author Daniel Dinh
* @version 1.0
* @see Faculty.java
* @see Associate.java
*/

public class Associate extends Faculty{
  protected int m_yearsAfterTenure;
  /**Integer representing the number of years left until the professors tenure*/

  public Associate(){
    super();
    m_yearsAfterTenure = 0;
  }
  /**
  *Default constructor of Associate Professor
  */
  public Associate(String n, int a, String ad, long pn, int i, int y, String d, double s, int np, int yat){
    super(n,a,ad,pn,i,y,d,s,np);
    m_yearsAfterTenure = yat;
  }
  /**
  *Overloaded constructor for Associate Professor
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  *@param d String representing the professor's department
  *@param s Double representing the professor's annual salary
  *@param np Integer represnting the number of papers the professor has published
  *@param yat Integer representing the years since the Associate Professor finished their tenure
  */
  public int getYearsAfterTenure(){
    return m_yearsAfterTenure;
  }
  /**
  *Accessor for Years since completion of Tenure
  *@return A int of the years since completion of tenure
  */
  public void setYearsAfterTenure(int yat){
    m_yearsAfterTenure = yat;
  }
  /**
  *Mutator for m_yearsAfterTenure
  *@param yat Integer representing the years since completion of tenure
  */
  public void print(){
    System.out.println(this);
  }
  /**
  *Print method from Printable, prints out all Attributes for class
  */
  public String toString(){
    String s = "";
    s+= super.toString();
    s+=", Years Since Tenure: "+m_yearsAfterTenure+"\n";
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Associate
  */
}
