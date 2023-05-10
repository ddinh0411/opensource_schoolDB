/**
* A class representing a Undergraduate student attending Chapman University
* @author Daniel Dinh
* @version 1.0
* @see Student.java
* @see Undergraduate.java
*/

public class Undergraduate extends Student{
  protected int m_numCourses;
  /** A integer representing the number of courses the student has taken*/
  protected double m_ScholarshipAmount;
  /** A double representing the amount of money the student is awarded as a scholarship*/

  public Undergraduate(){
    super();
    m_numCourses = 0;
    m_ScholarshipAmount = 0.0;
  }
  /**
  *default constructor of Undergraduate Student
  */
  public Undergraduate(String n, int a, String ad, long pn, int i, int y, String maj, String min, String clstand, int c, double sa){
    super(n,a,ad,pn,i,y,maj,min,clstand);
    m_numCourses = c;
    m_ScholarshipAmount = sa;
  }
  /**
  *The overloaded constructor of the Undergraduate Student
  *@param n String represting the student's name
  *@param a Integer representing the student's age
  *@param ad String representing the student's address
  *@param pn Long representing the student's phone number
  *@param i Integer representing the student's id
  *@param y Integer represnting the year the student first came to Chapman
  *@param maj The student's major
  *@param min The student's minor
  *@param clstand The student's class standing
  *@param p The number of papers the courses the student has taken
  *@param sa The amount of money awarded to the student
  */
  public int getNumCourses(){
    return m_numCourses;
  }
  /**
  *Accessor for number of courses taken
  *@return A int of the number of courses taken by the Undergraduate student
  */
  public double getScholarshipAmount(){
    return m_ScholarshipAmount;
  }
  /**
  *Accessor for scholarship amount
  *@return A double of the amount of money awarded to the student
  */
  public void setNumCourses(int n){
    m_numCourses = n;
  }
  /**
  *Mutator for number of courses taken
  *@param n Int of the number of courses taken by the grad student
  */
  public void setScholarship(double sa){
    m_ScholarshipAmount = sa;
  }
  /**
  *Mutator for scholarship amount
  *@param sa Double for the money awarded to the student
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
    s+=", Courses Taken: "+m_numCourses;
    s+=", Scholarship Amount: "+m_ScholarshipAmount+"\n";
    return s;
  }
  /**
  *toString method returns a string with all of the attributes listed in alphabetical order
  *@return A string representation of Student
  */
}
