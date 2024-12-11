import java.util.Scanner;
class Z12javaja{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number: ");
int n=sc.nextInt(); 
int sum=0;

while(n!=0){
int r=n%10;

if(r%2==){
sum=sum+n;
n=n/10;
}

System.out.println("Sum of all digit number : "+sum);
}




}