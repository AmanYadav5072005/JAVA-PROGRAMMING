Write a java program to check given character is vowel not without using relation and logical operator 

import java.util.Scanner;
 
class Cond2{

public static void main(string args[]){

Scanner sc= new Scanner(System.in);

char c;
System.out.println("Enter Any Character:");
c=sc.next().charAt(0);
switch(c){

case'a':
System.out.println("It is vowel");
break;
case'e':
System.out.println("It is vowel");
break;
case'i':
System.out.println("It is vowel");
break;
case'o':
System.out.println("It is vowel");
break;
case'u':
System.out.println("It is vowel");
break; 
default:
System.out.println("Not a vowel");

}

}

}
