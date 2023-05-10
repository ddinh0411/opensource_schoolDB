/**
* A class representing a student attending Chapman University
* @author Daniel Dinh
* @version 1.0
* @see Student.java
* @see Grad.java
* @see Undergrad.java
* @see Affiliate.java
*/
public abstract class Student extends Affiliate{
  protected String m_major;
  /** String represnting the student's major*/
  protected String m_minor;
  /** String representing the student's minor*/
  protected String m_classStanding;
  /** String representing the student's class standing*/

  public Student(){
    super();
    m_major = "";
    m_minor = "";
    m_classStanding = "";
  }
  /**
  *Default constuctor for Student
  */
  public Student(String n, int a, String ad, long pn, int i, int y, String maj, String min, String clstand){
    super(n,a,ad,pn,i,y);
    m_major = maj;
    m_minor = min;
    m_classStanding = clstand;
  }
  /**
  *The overloaded constructor for student
  *@param n String represting the student's name
  *@param a Integer representing the student's age
  *@param ad String representing the student's address
  *@param pn Long representing the student's phone number
  *@param i Integer representing the student's id
  *@param y Integer represnting the year the student first came to Chapman
  *@param maj The student's major
  *@param min The student's minor
  *@param clstand The student's class standing
  */

  public String getMajor(){
    return m_major;
  }
  /**
  *Accessor for major
  *@return A string of the Student's major
  */
  public String getMinor(){
    return m_minor;
  }
  /**
  *Accessor for minor
  *@return A string of the Student's minor
  */
  public String getClassStanding(){
    return m_classStanding;
  }
  /**
  *Accessor for Class standing
  *@return a string of the student's class standing
  */
  public void setMajor(String major){
    m_major = major;
  }
  /**
  *Mutator for major
  *@param major String of the student's major
  */
  public void setMinor(String minor){
    m_minor = minor;
  }
  /**
  *Mutator for minor
  *@param minor String of the student's minor
  */
  public void setClassStanding(String standing){
    m_classStanding = standing;
  }
  /**
  *Mutator for class standing
  *@param standing String of the student's class standing
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
    s+=", Class Standing: "+m_classStanding;
    s+=", Major: "+m_major;
    s+=", Minor: "+m_minor;
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Student
  */
}
