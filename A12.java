//Write a java program to print sum of two number

class A12{
int add(){
//decleare the variable
int n1,n2;
//take input

Scanner sk=new Scanner(System.in);
System.out.println("Enter Number 1 ");
int n1=sk.nextInt();
System.out.println("Enter Number 2 ");
int n2=sk.nextInt();

//perform operation
int c=n1+n2;
//print the result 
return c;
}
public static void main(String args[]){
A12 obj=new A12();
int r=obj.add();
System.out.println("Addition : "+c);

}

}
