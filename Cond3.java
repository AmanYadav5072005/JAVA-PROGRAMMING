Write a java program to check given character is vowel not without using relation and logical operator 

import java.util.Scanner;
 
class Cond3{

public static void main(string args[]){

Scanner sc= new Scanner(System.in);

char c;
System.out.println("Enter Any Character:");
c=sc.next().charAt(0);
switch(c){

case'a':
case'A':
System.out.println("It is vowel");
break;
case'e':
case'E':
System.out.println("It is vowel");
break;
case'i':
case'I':
System.out.println("It is vowel");
break;
case'o':
case'O':
System.out.println("It is vowel");
break;
case'u':
case'U':
System.out.println("It is vowel");
break; 
default:
System.out.println("Not a vowel");

}

}

}
