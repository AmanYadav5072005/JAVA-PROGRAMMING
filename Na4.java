import java.util.Scanner;
class Na4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Age : ");
int age=sc.nextInt();

String r=age>18 ? "Eligible For Voting" : "Not Eligible for voting";
 
  System.out.println(r);

}
}