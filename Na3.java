//Ternary Operand

import java.util.Scanner;
class Na3{


public static void main (String args[]){
 Scanner sc = new Scanner(System.in);
int n1,n2;
String result;
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number1  ");
n1=sc.nextInt();
System.out.println("Enter Number2 ");
n2=sc.nextInt();
result=n1==n2 ?"Both number are equal" : n1>n2?"Number 1 is Greater" : "Number 2 is Greater";
System.out.println(result);

 

 }

}
