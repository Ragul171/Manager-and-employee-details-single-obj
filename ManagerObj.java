import java.util.*;
class Employee
{
 private String empname;
 private int empid;
 private double da,hra,bp;
 public double salary;
 Scanner in = new Scanner(System.in);
 public Employee()
 {
  empname="None";
  empid=0;
  da=0.0;
  hra=0.0;
  bp=0.0;
  salary=0.0;
 }
 public void getDetails()
 {
  System.out.println("Enter the name : ");
  empname=in.nextLine();
  System.out.println("Enter the Id : ");
  empid=in.nextInt();
  System.out.println("Enter DA : ");
  da=in.nextDouble();
  System.out.println("Enter Hra : ");
  hra=in.nextDouble();
  System.out.println("Enter BP : ");
  bp=in.nextDouble(); 
  salary=computeSalary();
 }
 public double computeSalary()
 {
  salary=bp+(bp*da)/100+hra;
  return salary;
 }
 public void dispDetails()
 {
  System.out.println("Name : "+empname);
  System.out.println("ID : "+empid);
  System.out.println("DA : "+da);
  System.out.println("HRA : "+hra);
  System.out.println("BP : "+bp);
  System.out.println("Salary : "+salary);
 }
}
class Manager extends Employee
{
 private double bonus;
 public Manager()
 {
  super();
  bonus=0;
 }
 public void getDetails()
 {
  super.getDetails();
  System.out.println("Enter the bonus : ");
  bonus=in.nextDouble();
  super.salary=bonus+super.salary;
 }
 public void dispDetails()
 {
  super.dispDetails();
  System.out.println("Bonus : "+bonus);
 }
}
public class ManagerObj
{
 public static void main(String...arg)
 {
  Employee s1 =new Employee();
  Manager m1=new Manager();
  s1.getDetails();
  s1.dispDetails();
  m1.getDetails();
  m1.dispDetails();
 }
}