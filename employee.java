import java.util.Scanner;
class employee
{
int emp_no;
String emp_name;
int emp_salary;
 public void getdetails()
{
        System.out.println("\nEnter the Employee details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee number : ");
        emp_no=sc.nextInt();
        System.out.println("Name : ");
        sc.nextLine();
        emp_name=sc.nextLine();
        System.out.println("Salary : ");
        emp_salary=sc.nextInt(); 
}
void display()
{
  System.out.println("Empolyee No :"+emp_no);
  System.out.println("Name :"+emp_name);
  System.out.println("Salary Amount"+emp_salary+"\n");
    }
public static void main(String[] args) 
{
  System.out.println("\nEnter the No. of Employee's");
        Scanner cs= new Scanner(System.in);
        int num = cs.nextInt();
        employee arr[]=new employee[num];
        for(int i =0;i<num;i++)
        {
               arr[i]=new employee();
               arr[i].getdetails();
}
System.out.println("\nInformations of all the employee's");
        for(int i=0;i<num;i++)
        {
            arr[i].display();
     }
     boolean state = false;
     System.out.println("\nEnter the Employee Number to get details of a employee");
     int num2= cs.nextInt();
     for(int i=0;i<num;i++)
     {
         if(arr[i].emp_no==num2)
         {
        System.out.println("\nEmployee details");
         arr[i].display();
}
}
}
}




