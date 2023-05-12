/**
* Driver Class for the database of all Affiliates at Chapman
* @author Daniel Dinh
* @version 1.0
* @see Affiliate.java
*/
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class AffiliatesDriver{
  public static void ChooseAffiliate(String person,HashMap<Integer, Affiliate> dataBase){
    Scanner scn = new Scanner(System.in);
    switch (person){
      case "Assistant":
      case "assistant":
        System.out.println("Please enter Affiliate's name: ");
        String assi_n = scn.next();
        System.out.println("Enter age: ");
        int assi_a = scn.nextInt();
        System.out.println("Enter address: ");
        String assi_ad = scn.next();
        System.out.println("Enter phone number: ");
        long assi_pn = scn.nextLong();
        System.out.println("Enter ID: ");
        int assi_ID = scn.nextInt();
        System.out.println("Enter Year Began: ");
        int assi_y = scn.nextInt();
        System.out.println("Enter Department: ");
        String assi_d = scn.next();
        System.out.println("Enter Annual Salary: ");
        double assi_as = scn.nextDouble();
        System.out.println("Enter Number of Papers Published: ");
        int assi_np = scn.nextInt();
        System.out.println("Enter Years Until Tenure: ");
        int assi_yut = scn.nextInt();
        Assistant assistant = new Assistant(assi_n,assi_a,assi_ad,assi_pn,assi_ID,assi_y,assi_d,assi_as,assi_np,assi_yut);
        dataBase.put(assi_ID,assistant);
        break;
      case "Associate":
      case "associate":
        System.out.println("Please enter Affiliate's name: ");
        String asso_n = scn.next();
        System.out.println("Enter age: ");
        int asso_a = scn.nextInt();
        System.out.println("Enter address: ");
        String asso_ad = scn.next();
        System.out.println("Enter phone number: ");
        long asso_pn = scn.nextLong();
        System.out.println("Enter ID: ");
        int asso_ID = scn.nextInt();
        System.out.println("Enter Year Began: ");
        int asso_y = scn.nextInt();
        System.out.println("Enter Department: ");
        String asso_d = scn.next();
        System.out.println("Enter Annual Salary: ");
        double asso_as = scn.nextDouble();
        System.out.println("Enter Number of Papers Published: ");
        int asso_np = scn.nextInt();
        System.out.println("Enter Years Since Tenure: ");
        int asso_yst = scn.nextInt();
        Associate associate = new Associate(asso_n,asso_a,asso_ad,asso_pn,asso_ID,asso_y,asso_d,asso_as,asso_np,asso_yst);
        dataBase.put(asso_ID,associate);
        break;
      case "Full":
      case "full":
        System.out.println("Please enter Affiliate's name: ");
        String full_n = scn.next();
        System.out.println("Enter age: ");
        int full_a = scn.nextInt();
        System.out.println("Enter address: ");
        String full_ad = scn.next();
        System.out.println("Enter phone number: ");
        long full_pn = scn.nextLong();
        System.out.println("Enter ID: ");
        int full_ID = scn.nextInt();
        System.out.println("Enter Year Began: ");
        int full_y = scn.nextInt();
        System.out.println("Enter Department: ");
        String full_d = scn.next();
        System.out.println("Enter Annual Salary: ");
        double full_as = scn.nextDouble();
        System.out.println("Enter Number of Papers Published: ");
        int full_np = scn.nextInt();
        System.out.println("Enter Years Until Retire: ");
        int full_yur = scn.nextInt();
        Full full = new Full(full_n,full_a,full_ad,full_pn,full_ID,full_y,full_d,full_as,full_np,full_yur);
        dataBase.put(full_ID,full);
        break;
      case "Graduate":
      case "graduate":
        System.out.println("Please enter Affiliate's name: ");
        String gr_n = scn.next();
        System.out.println("Enter age: ");
        int gr_a = scn.nextInt();
        System.out.println("Enter address: ");
        String gr_ad = scn.next();
        System.out.println("Enter phone number: ");
        long gr_pn = scn.nextLong();
        System.out.println("Enter ID: ");
        int gr_ID = scn.nextInt();
        System.out.println("Enter Year Began: ");
        int gr_y = scn.nextInt();
        System.out.println("Enter Major: ");
        String gr_maj = scn.next();
        System.out.println("Enter Minor: ");
        String gr_min = scn.next();
        System.out.println("Enter Class Standing: ");
        String gr_stand = scn.next();
        System.out.println("Enter Number Of Papers Published: ");
        int gr_num = scn.nextInt();
        System.out.println("Enter Thesis Advisor: ");
        int gr_ta = scn.nextInt();
        Graduate graduate = new Graduate(gr_n,gr_a,gr_ad,gr_pn,gr_ID,gr_y,gr_maj,gr_min,gr_stand,gr_num,gr_ta);
        dataBase.put(gr_ID,graduate);
        break;
      case "Undergraduate":
      case "undergraduate":
        System.out.println("Please enter Affiliate's name: ");
        String ug_n = scn.next();
        System.out.println("Enter age: ");
        int ug_a = scn.nextInt();
        System.out.println("Enter address: ");
        String ug_ad = scn.next();
        System.out.println("Enter phone number: ");
        long ug_pn = scn.nextLong();
        System.out.println("Enter ID: ");
        int ug_ID = scn.nextInt();
        System.out.println("Enter Year Began: ");
        int ug_y = scn.nextInt();
        System.out.println("Enter Major: ");
        String ug_maj = scn.next();
        System.out.println("Enter Minor: ");
        String ug_min = scn.next();
        System.out.println("Enter Class Standing: ");
        String ug_stand = scn.next();
        System.out.println("Enter Number of Courses Taken: ");
        int ug_num = scn.nextInt();
        System.out.println("Enter Scholarship Amount: ");
        double ug_sa = scn.nextDouble();
        Undergraduate undergraduate = new Undergraduate(ug_n,ug_a,ug_ad,ug_pn,ug_ID,ug_y,ug_maj,ug_min,ug_stand,ug_num,ug_sa);
        dataBase.put(ug_ID,undergraduate);
        break;
      case "Fulltime":
      case "fulltime":
        System.out.println("Please enter Affiliate's name: ");
        String ft_n = scn.next();
        System.out.println("Enter age: ");
        int ft_a = scn.nextInt();
        System.out.println("Enter address: ");
        String ft_ad = scn.next();
        System.out.println("Enter phone number: ");
        long ft_pn = scn.nextLong();
        System.out.println("Enter ID: ");
        int ft_ID = scn.nextInt();
        System.out.println("Enter Year Began: ");
        int ft_y = scn.nextInt();
        System.out.println("Enter Department: ");
        String ft_b = scn.next();
        System.out.println("Enter Title: ");
        String ft_t = scn.next();
        System.out.println("Enter Annual Salary: ");
        double ft_ys = scn.nextDouble();
        Fulltime fulltime = new Fulltime(ft_n,ft_a,ft_ad,ft_pn,ft_ID,ft_y,ft_b,ft_t,ft_ys);
        dataBase.put(ft_ID,fulltime);
        break;
      case "Parttime":
      case "parttime":
        System.out.println("Please enter Affiliate's name: ");
        String pt_n = scn.next();
        System.out.println("Enter age: ");
        int pt_a = scn.nextInt();
        System.out.println("Enter address: ");
        String pt_ad = scn.next();
        System.out.println("Enter phone number: ");
        long pt_pn = scn.nextLong();
        System.out.println("Enter ID: ");
        int pt_ID = scn.nextInt();
        System.out.println("Enter Year Began: ");
        int pt_y = scn.nextInt();
        System.out.println("Enter Department: ");
        String pt_b = scn.next();
        System.out.println("Enter Title: ");
        String pt_t = scn.next();
        System.out.println("Enter Hourly Salary: ");
        double pt_hs = scn.nextDouble();
        Parttime parttime = new Parttime(pt_n,pt_a,pt_ad,pt_pn,pt_ID,pt_y,pt_b,pt_t,pt_hs);
        dataBase.put(pt_ID,parttime);
        break;
      default:
        System.out.println("Invalid Input. Please try again.");
    }
  }

  public static void deleteKey(int ID,HashMap<Integer, Affiliate> dataBase){
    dataBase.remove(ID);
    System.out.println("Entry deleted");
  }

  public static String printMenu(){
    String s = "";
    s+= "";
    s+= "Please enter the integer of what you would like to do: ";
    s+= "\n1. Create an affiliate record";
    s+= "\n2. Print out an Affiliate's information";
    s+= "\n3. List all Affiliates";
    s+= "\n4. Delete an Affiliate";
    s+= "\n5. Save Current Database to File";
    s+= "\n7. Exit Program";
    return s;
  }

  public static void main(String[] args){
    HashMap<Integer, Affiliate> dataBase = new HashMap<Integer, Affiliate>();
    Scanner sin = new Scanner(System.in);
    int input = 0;
    while(input != 7){
      System.out.println(printMenu());
      input = sin.nextInt();
      switch (input){
        case 1:
          System.out.println("Please enter in what Affiliate you would like to make: ");
          String person = sin.next();
          ChooseAffiliate(person,dataBase);
          break;
        case 2:
          System.out.println("Please enter in the ID of Affiliate: ");
          int ID = sin.nextInt();
          Affiliate aff = dataBase.get(ID);
          aff.print();
          break;
        case 3:
          ArrayList<Affiliate> al = new ArrayList<Affiliate>();
          al.addAll(dataBase.values());
          Collections.sort(al);
          for(int i = al.size()-1; i>= 0; --i){
            al.get(i).print();
            System.out.println();
          }
          break;
        case 4:
          System.out.println("Please Enter ID of Affiliate you wish to delete: ");
          int id = sin.nextInt();
          deleteKey(id,dataBase);
          break;
        case 5:
          System.out.println("Enter in the output file, make sure to write '.txt' ");
          String s = sin.next();
          try{
            String affiliateContent = "";
            PrintWriter pw = new PrintWriter(new FileWriter(s),true);
            for(Integer aff_ID: dataBase.keySet()){
              affiliateContent += dataBase.get(aff_ID).toString();
              pw.print(affiliateContent);
            }
            pw.close();
          }catch(IOException e){
            e.printStackTrace();
          }
          break;
        case 6:
        try{
          System.out.println("Enter input file name, make sure to end with '.txt' ");
          String filename = sin.next();
          BufferedReader br = new BufferedReader(new FileReader(filename));
          String line = "";
          while((line = br.readLine())!= null){
              int i = 0;
              String[] info = line.split(",\\s",0);
              switch(info[0]){
                case "Assistant":
                case "assistant":
                  Assistant ast = new Assistant();
                  ast.setName(info[4]);
                  ast.setAge(Integer.parseInt(info[2]));
                  ast.setAddress(info[1]);
                  ast.setID(Integer.parseInt(info[3]));
                  int astID = Integer.parseInt(info[3]);
                  ast.setPhoneNumber(Long.parseLong(info[5]));
                  ast.setYear(Integer.parseInt(info[6]));
                  ast.setDepartment(info[7]);
                  ast.setPaper(Integer.parseInt(info[8]));
                  ast.setSalary(Double.parseDouble(info[9]));
                  ast.setYearsBeforeTenure(Integer.parseInt(info[10]));
                  dataBase.put(astID,ast);
                  break;
                case "Associate":
                case "associate":
                  Associate aso = new Associate();
                  aso.setAddress(info[1]);
                  aso.setAge(Integer.parseInt(info[2]));
                  aso.setID(Integer.parseInt(info[3]));
                  int asoID = Integer.parseInt(info[3]);
                  aso.setName(info[4]);
                  aso.setPhoneNumber(Long.parseLong(info[5]));
                  aso.setYear(Integer.parseInt(info[6]));
                  aso.setDepartment(info[7]);
                  aso.setPaper(Integer.parseInt(info[8]));
                  aso.setSalary(Double.parseDouble(info[9]));
                  aso.setYearsAfterTenure(Integer.parseInt(info[10]));
                  dataBase.put(asoID,aso);
                  break;
                case "Full":
                case "full":
                  Full ful = new Full();
                  ful.setAddress(info[1]);
                  ful.setAge(Integer.parseInt(info[2]));
                  ful.setID(Integer.parseInt(info[3]));
                  int fulID = Integer.parseInt(info[3]);
                  ful.setName(info[4]);
                  ful.setPhoneNumber(Long.parseLong(info[5]));
                  ful.setYear(Integer.parseInt(info[6]));
                  ful.setDepartment(info[7]);
                  ful.setPaper(Integer.parseInt(info[8]));
                  ful.setSalary(Double.parseDouble(info[9]));
                  ful.setYearsBeforeRetirement(Integer.parseInt(info[10]));
                  dataBase.put(fulID,ful);
                  break;
                case "Graduate":
                case "graduate":
                  Graduate grd = new Graduate();
                  grd.setAddress(info[1]);
                  grd.setAge(Integer.parseInt(info[2]));
                  grd.setID(Integer.parseInt(info[3]));
                  int grdID = Integer.parseInt(info[3]);
                  grd.setName(info[4]);
                  grd.setPhoneNumber(Long.parseLong(info[5]));
                  grd.setYear(Integer.parseInt(info[6]));
                  grd.setMajor(info[7]);
                  grd.setMinor(info[8]);
                  grd.setClassStanding(info[9]);
                  grd.setnumPaper(Integer.parseInt(info[10]));
                  grd.setThesisAdvisor(Integer.parseInt(info[11]));
                  dataBase.put(grdID,grd);
                  break;
                case "Undergraduate":
                case "undergraduate":
                  Undergraduate ugd = new Undergraduate();
                  ugd.setAddress(info[1]);
                  ugd.setAge(Integer.parseInt(info[2]));
                  ugd.setID(Integer.parseInt(info[3]));
                  int ugdID = Integer.parseInt(info[3]);
                  ugd.setName(info[4]);
                  ugd.setPhoneNumber(Long.parseLong(info[5]));
                  ugd.setYear(Integer.parseInt(info[6]));
                  ugd.setMajor(info[7]);
                  ugd.setMinor(info[8]);
                  ugd.setClassStanding(info[9]);
                  ugd.setNumCourses(Integer.parseInt(info[10]));
                  ugd.setScholarship(Double.parseDouble(info[11]));
                  dataBase.put(ugdID,ugd);
                  break;
                case "Fulltime":
                case "fulltime":
                  Fulltime flt = new Fulltime();
                  flt.setAddress(info[1]);
                  flt.setAge(Integer.parseInt(info[2]));
                  flt.setID(Integer.parseInt(info[3]));
                  int fltID = Integer.parseInt(info[3]);
                  flt.setName(info[4]);
                  flt.setPhoneNumber(Long.parseLong(info[5]));
                  flt.setYear(Integer.parseInt(info[6]));
                  flt.setBuilding(info[7]);
                  flt.setTitle(info[8]);
                  flt.setYearlySalary(Double.parseDouble(info[9]));
                  dataBase.put(fltID,flt);
                  break;
                case "Parttime":
                case "parttime":
                  Parttime prt = new Parttime();
                  prt.setAddress(info[1]);
                  prt.setAge(Integer.parseInt(info[2]));
                  prt.setID(Integer.parseInt(info[3]));
                  int prtID = Integer.parseInt(info[3]);
                  prt.setName(info[4]);
                  prt.setPhoneNumber(Long.parseLong(info[5]));
                  prt.setYear(Integer.parseInt(info[6]));
                  prt.setBuilding(info[7]);
                  prt.setTitle(info[8]);
                  prt.setHourlySalary(Double.parseDouble(info[9]));
                  dataBase.put(prtID,prt);
                  break;
                default:
                  System.out.println("Invalid Input, please try again.");
                  break;
              }
          }
        }catch(IOException io){
          System.err.println("IO Exception Error, maybe the file is wrong?");
          io.printStackTrace();
        }catch(Exception e){
          System.err.println("Couldn't read from file. Are you sure this was the right file?");
          e.printStackTrace();
        }
          break;
        case 7:
          System.out.println("Exiting Program");
          break;
        default:
          System.out.println("Invalid Input, Please try again.");
          break;
      }
    }
  }
}
