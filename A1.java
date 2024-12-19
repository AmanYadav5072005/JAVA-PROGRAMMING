class A1{
void add(int a,int b){
//perform operation
int c=a+b;
//print result
System.out.println("Addition : "+c);
}

public static void main(String args[]){
Scanner sk=new Scanner(System.in);
System.out.println("Enter Number 1 ");
int n1=sk.nextInt();
System.out.println("Enter Number 2 ");
int n2=sk.nextInt();
A1 obj=new A1();
obj.add(n1,n2);

}

}