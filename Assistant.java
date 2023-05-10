/**
* A class representing a Assistant Professor hired at Chapman
* @author Daniel Dinh
* @version 1.0
* @see Faculty.java
* @see Assistant.java
*/

public class Assistant extends Faculty{
  protected int m_yearsBeforeTenure;
  /**Integer representing the number of years left until the professors tenure*/

  public Assistant(){
    super();
    m_yearsBeforeTenure = 0;
  }
  /**
  *Default constructor of Assistant Professor
  */
  public Assistant(String n, int a, String ad, long pn, int i, int y, String d, double s, int np, int yt){
    super(n,a,ad,pn,i,y,d,s,np);
    m_yearsBeforeTenure = yt;
  }
  /**
  *Overloaded constructor for Assistant Professor
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  *@param d String representing the professor's department
  *@param s Double representing the professor's annual salary
  *@param np Integer represnting the number of papers the professor has published
  *@param yt Integer representing the years until the Assistant Professor finishes their tenure
  */
  public int getYearsBeforeTenure(){
    return m_yearsBeforeTenure;
  }
  /**
  *Accessor for Years until completion of Tenure
  *@return A int of the years until completion of tenure
  */
  public void setYearsBeforeTenure(int yt){
    m_yearsBeforeTenure = yt;
  }
  /**
  *Mutator for m_yearsBeforeTenure
  *@param yt Integer representing the years until completion of tenure
  */
  public void print(){
    System.out.println(this);
  }
  /**
  *Print method from Printable, prints out all Attributes for class
  */
  public String toString(){
    String s = "";
    s += super.toString();
    s += ", Years Until Tenure: "+m_yearsBeforeTenure+"\n";
    return s;
  }
  /**
  *toString method for Assistant professor
  *@return A string representation of an Assistant Professor
  */
}
