package Basic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

enum Department{
    IT,ADMIN,TRAINING
}
 abstract
 class Employee{
   private String employeeId;
   private short employeeAge;
   private Department employeeVertical;
   private float employeesalary;

   abstract void CalculateTax();
   public  float GetEmployeeSalary(){
    return this.employeesalary;
   }
   Employee(){
       System.out.println("eeeeeee");
   }
// 1 parameter user defined constructor
      Employee(int data){
        System.out.println("emp with 1 args");
   }

   Employee(String id,short age,Department type,float salary){
    this.employeeId=id;
    this.employeeAge=age;
    this.employeeVertical=type;
    this.employeesalary=salary;
}
}
 class Manager extends Employee{
     short managerTeamSize;

     @Override

   void CalculateTax(){
   System.out.println("salary for this employee wil be 10% pf salary is"+ 0.1*this.GetEmployeeSalary());
   }

   void DecideMeetingSlot(){
       System.out.println("meeting at 11AM");
   }

   Manager(){
       super(10);
       System.out.println("mmmmmm");
   }
   Manager(String id,short age,Department type,float salary,short teamsize){
    super(id,age,type,salary);
    this.managerTeamSize=teamsize;
}

 }

 class Director extends Manager{
     String directorLocation;
     void PresentReport(){
         System.out.println("REPORT FOR THIS YEAR");
     }

     Director(){
         System.out.println("dddddd");
     }
     Director(String id,short age,Department type,float salary,short teamsize,String location){
         super(id,age,type,salary,teamsize);
         this.directorLocation=location;
     }

    @Override
    public String toString() {
        return "{" +
            " directorLocation='" + getDirectorLocation() + "'" +
            "}";
    }

    public String getDirectorLocation() {
        return this.directorLocation;
    }

    public void setDirectorLocation(String directorLocation) {
        this.directorLocation = directorLocation;
    }

 }


public class test {
    
    public static void main(String[] args) {
        Director d1 = new Director("tor33",(short) 43,Department.TRAINING,28000.0f,(short) 10,"mumbai");
        


        Employee ob1= new Director();
        
    }
}

//employee data member : salary name age department
// managr data member (employee plus)  teamsize
// director data membeer :(manager plus) location
