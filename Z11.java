import java.util.Scanner;
class Z11javaja{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number: ");
int n=sc.nextInt(); 
int count=0;

while(n!=0){
count++;
n=n/10;
}

System.out.println("Number of digits in the given no : "+count);
}




}