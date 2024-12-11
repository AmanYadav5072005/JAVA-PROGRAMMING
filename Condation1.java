// Write a java program to check given character is upper case or lower case without logical operators 

import java.util.Scanner;
class Condition1{
public static void main(String args[]){
char c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Character:");
c=sc.next().charAt(0);

if(c>='a'){
 if(c<='z'){
 System.out.println("Lower Case");
}
}
else if(c>='A'){
if(c<='Z'){
System.out.println("Upper Case");
}
}
}

}