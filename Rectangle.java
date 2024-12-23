import java.util.Scanner;
class Rectangle{
int l;
int b;

void acceptData(){

Scanner sk=new Scanner(System.in);
System.out.println("Enter length : ");
l=sk.nextInt();
System.out.println("Enter breadth : ");
b=sk.nextInt();
 
}

void showData(){
System.out.println("Length is : "+l);
System.out.println("Breadth is : "+b);

}
void getArea(){
System.out.println("Area : "+(l*b));
} 
void getPira(){
System.out.println("perimeter : "+2 * (l+b));
}

public static void main(String args[]){
 
Rectangle r=new Rectangle();
r.acceptData();
r.showData();
r.getArea();
r.getPira();
}

}