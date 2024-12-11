//Write a java program to check given number is perfect or not?

//Perfect Number : A perfect Number is a positive number that is equal to the sum of its proper divisors(excluding itself)

import java.util.Scanner;
class Z9{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number: ");
int n=sc.nextInt(); 
int sum=0;

for(int i=1;i<n;i++){
if(n%i==0){
sum=sum+i;
}
}
if(n==sum){
System.out.println("This is perfect Number");
}
else{
System.out.println("This is not perfect Number");
}

}


}