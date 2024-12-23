import java.util.Scanner;
class Student{
String name ,enroll ;
int P,C,M,H,E;


void acceptData(){

Scanner sk=new Scanner(System.in);
System.out.println("Enter Student Name : ");
l=sk.nextLinn();
System.out.println("Enter Entrollement No  : ");
b=sk.nextLine();
 
}


System.out.println("Enter Physics Marks : ");
p=sc.nextInt();
System.out.println("Enter Chemistry Marks : ");
c=sc.nextInt();
System.out.println("Enter Mathematics Marks : ");
m=sc.nextInt();
System.out.println("Enter Hindi Marks : ");
h=sc.nextInt();
System.out.println("Enter English Marks : ");
e=sc.nextInt();

}

int getTotalmarks(){
System.out.println(" Total marks is:"+(p+c+m+h+e);
} 
float getPerc(int total marks){
System.out.println("Percentage is : "+(Total marks/5));
}

public static void main(String args[]){
Student s1=new Student();

r.acceptData();
r.showData();
r.getTotalMarks();
r.getPercentage();
}
}