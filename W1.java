import java.util.Scanner;
class W1{

public void add(){
int a,b,c;

System.out.println("=============>Add Function is called<======");
Scanner kb=new Scanner(System.in);
System.out.println("Enter Vlaue of A :");
a=kb.nextInt();
System.out.println("Enter Vlaue of B :");
b=kb.nextInt();

c=a+b;
System.out.println("Addtion :"+c);

}

public static void main(String args[]){

W1 obj=new W1();

obj.add();


}

}