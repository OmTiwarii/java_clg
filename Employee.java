public class Employee{

   void work(){
   System.out.println("Employee is working ");
    }


public static void main(String[] args) {
       
        manager mgr = new manager();

        mgr.work();          
        mgr.attendmeeting(); 

}
}

class manager extends Employee {
     void attendmeeting(){
    System.out.println("manager is attending a meeting");
    }
 }
 

 


