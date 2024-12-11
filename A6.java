import java.util.Scanner;
class A6{
public static void main(String args[]){
char c;
int n1,n2;
Scanner sc=new Scanner(System.in);


System.out.println("Enter Your Choice ");

System.out.println("Press + For Addition");


System.out.println("Press - For Subtraction");

System.out.println("Press * For Multiplication");
System.out.println("Press / For Division");
System.out.println("==========================");

c=sc.next().charAt(0);
System.out.println("==========================");

System.out.println("Enter number 1:");
n1=sc.nextInt();
System.out.println("Enter number 2:");
n2=sc.nextInt();
System.out.println("==========================");
if(c=='+'){
System.out.println("Addition: "+n1+n2);

}
else if(c=='-'){
System.out.println("Subtraction: "+(n1-n2));

}
else if(c=='*'){
System.out.println("Mutiplicatoin: "+(n1*n2));

}
else if(c=='/'){
System.out.println("Division: "+(n1/n2));

}


}


}