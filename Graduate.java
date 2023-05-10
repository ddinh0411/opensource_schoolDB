/**
* A class representing a graduate student attending Chapman University
* @author Daniel Dinh
* @version 1.0
* @see Student.java
* @see Graduate.java
*/

public class Graduate extends Student{
  protected int m_numPaper;
  /** A integer representing the number of papers the student has published*/
  protected int m_thesisAdvisor;
  /** A integer representing the id number of the student's thesis advisor*/

  public Graduate(){
    super();
    m_numPaper = 0;
    m_thesisAdvisor = 0;
  }
  /**
  *default constructor of Graduate Student
  */
  public Graduate(String n, int a, String ad, long pn, int i, int y, String maj, String min, String clstand, int p, int ta){
    super(n,a,ad,pn,i,y,maj,min,clstand);
    m_numPaper = p;
    m_thesisAdvisor = ta;
  }
  /**
  *The overloaded constructor of the Graduate Student
  *@param n String represting the student's name
  *@param a Integer representing the student's age
  *@param ad String representing the student's address
  *@param pn Long representing the student's phone number
  *@param i Integer representing the student's id
  *@param y Integer represnting the year the student first came to Chapman
  *@param maj The student's major
  *@param min The student's minor
  *@param clstand The student's class standing
  *@param p The number of papers the student has published
  *@param ta The Id number of the student's thesis advisor
  */
  public int getnumPaper(){
    return m_numPaper;
  }
  /**
  *Accessor for number of papers published
  *@return A int of the number of papers published by the graduate student
  */
  public int getThesisAdvisor(){
    return m_thesisAdvisor;
  }
  /**
  *Accessor for thesis advisor's name
  *@return A int of the advisor's ID number
  */
  public void setnumPaper(int n){
    m_numPaper = n;
  }
  /**
  *Mutator for number of papers published
  *@param n Int of the number of papers published by the grad student
  */
  public void setThesisAdvisor(int t){
    m_thesisAdvisor = t;
  }
  /**
  *Mutator for thesis advisor
  *@param t Integer for ID number of the thesis advisor
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
    s+=", Papers Published: "+m_numPaper;
    s+=", Thesis Advisor: "+m_thesisAdvisor+"\n";
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Graduate
  */
}
