
import java.util.Scanner;
class Z8{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number: ");
int n=sc.nextInt();//5

int fact=1;
for(int i=n; i>=1;i--){
fact=fact*1;
}
System.out.println("Factorial of the given no: "+fact);

}


}