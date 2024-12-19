//Write a java program to print sum of two number with function types..[taking nothing and returning nothing]

import java.util.Scanner;
class Test{
void add(){

int a,b,c;
Scanner sk=new Scanner(System.in);
System.out.println("Enter Vlue Of A: ");
a=sc.nextInt();
System.out.println("Enter Vlue Of B: ");
b=sc.nextInt();

c=a+b;
System.out.println("Addition of the two number: "+c);

}
public static void main(String args[]){

Test obj=new Test();
obj.add();

}
}


