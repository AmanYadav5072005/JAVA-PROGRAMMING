//Ternary Operand

import java.util.Scanner;
class Na2{


public static void main (String args[]){
 Scanner sc = new Scanner(System.in);
int n ;
String result;

System.out.println("Enter Any Number ");
n=sc.nextInt();//25
result=n%2==0  ? "Even Number ": "Odd Number";

//  exp1 ? exp2               : exp3
System.out.println(result);

 

 }

}
