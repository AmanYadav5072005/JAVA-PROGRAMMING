import java.util.Scanner;
class A5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;

System.out.println("Enter Any Number: ");
n=sc.nextInt();

if(n=0) {
System.out.println(" Zero Number");
}
else if (n%2!=0){
System.out.printl("Odd Number");
}
else if (n%2=0){
System.out.println("Even Number");
}

}