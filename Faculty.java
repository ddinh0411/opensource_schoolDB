/**
* A class representing a faculty member hired by Chapman
* @author Daniel Dinh
* @version 1.0
* @see Faculty.java
* @see Assistant.java
* @see Associate.java
* @see Full.java
* @see Affiliate.java
*/

public abstract class Faculty extends Affiliate{
  protected String m_department;
  /**A string representing the department the professor works for*/
  protected double m_salary;
  /**A double representing the professor's annual salary*/
  protected int m_numPapers;
  /**A integer represnting the numbers of papers the professor has published*/

  public Faculty(){
    super();
    m_department = "";
    m_salary = 0.0;
    m_numPapers = 0;
  }
  /**
  *Default constructor for Faculty
  */
  public Faculty(String n, int a, String ad, long pn, int i, int y, String d, double s, int np){
    super(n,a,ad,pn,i,y);
    m_department = d;
    m_salary = s;
    m_numPapers = np;
  }
  /**
  *Overloaded constructor for the Faculty
  *@param n String represting the person's name
  *@param a Integer representing the person's age
  *@param ad String representing the person's address
  *@param pn Long representing the person's phone number
  *@param i Integer representing the person's id
  *@param y Integer represnting the year the person first came to Chapman
  *@param d String representing the professor's department
  *@param s Double representing the professor's annual salary
  *@param np Integer represnting the number of papers the professor has published
  */
  public String getDepartment(){
    return m_department;
  }
  /**
  *Accessor for the department
  *@return a String of the professor's department
  */
  public double getSalary(){
    return m_salary;
  }
  /**
  *Accessor for the annual salary
  *@return a double of the professor's annual wage
  */
  public int getPaper(){
    return m_numPapers;
  }
  /**
  *Accessor for the number of papers published
  *@return A integer of the number of papers published by that professor
  */
  public void setDepartment(String d){
    m_department = d;
  }
  /**
  *Mutator for Department
  *@param d A String of the professor's department
  */
  public void setSalary(double s){
    m_salary = s;
  }
  /**
  *Mutator for Annual salary
  *@param s A double of the professor's annual salary
  */
  public void setPaper(int p){
    m_numPapers = p;
  }
  /**
  *Mutator for Number of papers
  *@param p Integer of the numbers of papers the professor has published
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
    s+=", Papers Published: "+m_numPapers;
    s+=", Yearly Salary: "+m_salary;
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Faculty
  */
}
